
										Interface and Abstract class Loopholes Part-5 || Abstract class vs Interface wrt constructor
									===================================================================================================

Q. Anyway we  cannot create object for Abstract class and interface. Abstract class can contain constructor but interface does not. Why ?									

	- The main purpose of constructor is to performe initialization of an object that is to performe initialization for instance varialbes.

	- abstract class can contain instance varialbe which are required to child class object to performe initialization for these instance varialbes constructor concept is 
	  required for abstract classes.
	  
	- Every variable prasent inside interface is always public,static,final whether we are declaring or not. hance a there is no chance of exisiting instance variable inside 
	  interface because these constructor concept not required for interfaces.
	
	
		Ex. 
		
	
		abstract class Person {							interface Interf {
			                                            	
			String name;                                	int x = 10; // Instance varialbe in interface is always public static final.
			int age;
			Persion(String name,int age){
				this.name=name;
				this.age=age;
			}
		}
		
		
		
		
		