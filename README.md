# ceson
Concise EMF Simple Object Notation (pronounce season) is a generic notation to create ecore models

The objective of the project is to provide a language and an API that eases the development of JUnit tests in modeling project. 
The ability to create model fragment for unit tests is a key accelerator of development. 

Ceson can be used in two different ways :
- it is possible to convey model fragments as java strings directly to an API. This is handy for very small model fragments. 
- We recommand to implement a small method that reads up a file in a String and feeds the API with it. Writing ceson models in files becomes mandatory as the size of the model grows. 

Ceson allows to define variables that are bound to model fragments and to make reference to these variables in model expressions. 
References to variables can be made out of ordre. It is not necessary that a variable been defined before it is used. This is mandatory for mutual references between model elements or for cycles in model elements.

