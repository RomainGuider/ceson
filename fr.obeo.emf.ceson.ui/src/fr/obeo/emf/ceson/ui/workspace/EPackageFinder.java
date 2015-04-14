package fr.obeo.emf.ceson.ui.workspace;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class EPackageFinder implements IResourceChangeListener {

	private ResourceSet resourceSet;
	Map<String, EPackage> workspacePackages;
	Map<IFile, EPackage> fileToPackageMap;

	public EPackageFinder() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMIResourceFactoryImpl());
		try {
			workspacePackages = workspaceScan();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileToPackageMap = Maps.newHashMap();
	}

	public EPackage lookup(String nsURI) {
		EPackage result = workspacePackages.get(nsURI);
		if (result == null) {
			result = EPackage.Registry.INSTANCE.getEPackage(nsURI);
		}
		return result;
	}

	private EPackage registryLookup(String nsURI) {
		return EPackage.Registry.INSTANCE.getEPackage(nsURI);
	}

	private Map<String, EPackage> workspaceScan() throws CoreException {
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot()
				.getProjects();
		List<IFile> workspaceEcoreFiles = Lists.newArrayList();
		for (IProject project : projects) {
			lookupEcoreFile(project, workspaceEcoreFiles);
		}
		Map<String, EPackage> result = Maps.newHashMap();
		for (IFile file : workspaceEcoreFiles) {
			EPackage ePackage = openEcoreFile(file);
			result.put(ePackage.getNsURI(), ePackage);
			fileToPackageMap.put(file, ePackage);
		}
		return result;
	}

	private EPackage openEcoreFile(IFile file) {
		URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(),
				true);
		return (EPackage) resourceSet.getResource(uri, true).getContents()
				.get(0);
	}

	private void lookupEcoreFile(IContainer container, List<IFile> files)
			throws CoreException {
		for (IResource resource : container.members()) {
			if (resource instanceof IFile
					&& "ecore".equals(((IFile) resource).getFileExtension())) {
				files.add((IFile) resource);
			} else if (resource instanceof IContainer) {
				lookupEcoreFile((IContainer) resource, files);
			}
		}
	}

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		IResource resource = event.getResource();
		if (resource instanceof IFile
				&& "ecore".equals(((IFile) resource).getFileExtension())) {
			if (fileToPackageMap.containsKey(resource)) {
				EPackage oldPackage = fileToPackageMap.get(resource);
				fileToPackageMap.remove(resource);
				workspacePackages.remove(oldPackage.getNsURI());
			}

			IResourceDelta delta = event.getDelta();
			int refresh = delta.getKind()
					& (IResourceDelta.ADDED | IResourceDelta.CHANGED);
			if (refresh > 0) {
				EPackage newPackage = openEcoreFile((IFile) resource);
				workspacePackages.put(newPackage.getNsURI(), newPackage);
				fileToPackageMap.put((IFile) resource, newPackage);
			}
		}
	}
}
