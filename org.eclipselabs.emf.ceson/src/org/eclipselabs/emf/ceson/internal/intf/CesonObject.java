package org.eclipselabs.emf.ceson.internal.intf;

import java.util.Map;
import java.util.Set;
/**
 * {@link CesonObject} represents object directly out of parsing before type inference.
 * features are mapped to different kind of object depending on the type :
 * <ul>
 * <li>Object feature : a {@link CesonObject} instance</li>
 * <li>base type feature : an instance of the base type (e.g. {@link java.lang.Integer}, {@link java.lang.String}, etc)</li>
 * <li>multiple feature : an instanceof of {@link java.util.List<T>} where T is the type of the feature.
 * </ul> 
 * @author rguider
 *
 */
public class CesonObject {
	
	private final static String UNDEFINED_TYPE = "undefined";
	private String type;
	
	private Map<String,Object> features;
	
	public String getType() {
		return type==null || type.length()==0?UNDEFINED_TYPE : type;
	}
	
	Set<String> getFeatureSet(){
		return features.keySet();
	}
	
	public Object getFeature(String featureName) {
		return features.get(featureName);
	}
	public Object setFeature(String featureName,Object value) {
		return features.put(featureName,value);
	}
}
