
														Interface and Abstract class Loopholes Part-1 || new vs Constructor
													==========================================================================

 
1. Roles of new keywords and Constructor.

2. Whenever we are creating child class object whether parent object will created or not ??

3. Whenever we are creating child class object, what is the need of executing parent class constructor??

4. Anyways we cannoy create object for abstract class either directly or indirectly But abstract class can contain constructor. What is the need ??

5. Anyway we  cannot create object for Abstract class and interface. Abstract class can contain constructor but interface does not. Why ?

6. Inside interface we can take only Abstract Methods. But in Abstract class also we can take only Abstract method based on our requirement. Then what is the Need of interface
   i.e. Is it possible to replace interface concept with Abstract class ? 
   
7. We cannot create object for abstract class, but abstract class can contain constructor. What is the need ? 

8. We can not create object for abstract class directly but indirectly we can create. IS it valid ? 

9. Whenever we are creating child class object automatically parent class object will be create. IS it valid ?

 
 
   
-> The purpose of Console is : 

	- The main object of new operator is create an object.
	
	- The main purpose of constructor is to initialize object.
	
	- First object will be created by using new operator and then initialization will be performed by constructor.
	
	- Whenever we are creating an object after object creation automatically constructor will be executed to initialize that object.
	
	
	
											|---> Initialize an object.
							----------------------
			Student s = new Student("Durga", 101);
						 |
						 |--> new operator is responsible to create an new Object.
						 
	- Before Constructor only object is ready and hence within the Constructor we can Access object properties Like Hash Code.


			class Test {
				
					Test() {
						
							System.out.println(this);// Test@5e3d60
							System.out.println(this.hashCode());//722344
					}
					public static void main(String args[]){
							Test t = new Test();
					}
					
					
			}
   
   
   