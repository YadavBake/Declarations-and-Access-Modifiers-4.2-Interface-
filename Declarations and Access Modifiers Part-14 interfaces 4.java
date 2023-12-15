
														Declarations and Access Modifiers Part-14|| interfaces-4
													==============================================================
													
													
----------------------------------------------------
 9. interface vs abstract class vs concrete class.	
----------------------------------------------------

 -> If we don't know any thing about implementation just we have requirement specification then we should go for interface.
	
		Ex. Servlet
 
 -> If we are talking about implementation but not compelitly (partial implementation) then we should go for abstract class.
 
		Ex. Generic servlet, HttpServlet etc.

 -> If we are talking about implementation complelitly and ready provide service then we should go for concrete class.

		Ex.x MyOwnServlet.

 
										   ------------						            ------
		Interface------------------------->|Servlet(I)|-------------------------------->|Plan| // No Implementation class 
		   ^								-----------						            ------
		   |                                    ^										   ^	
		   |                                    |										   |
		   |                                    |                                          |
		   |							   -------------------				   --------------------------------	
		   |							   |GenericServel(AC)|---------------->| Partically complited building| // Partical implementation
		Abstract class-------------------->|HttpServlet(AC)  |  			   --------------------------------	
			^							   -------------------								^
            |									^											|
            |                                   |                                           |
            |	                                |											^
			|                                   |                                           |
			|							  ---------------						  --------------------------
		ConCrete class------------------->| myOwnServlet|------------------------>|Fully Completed Building| // Fully/Complete Implementation
										  ---------------						  --------------------------
										  
										  
----------------------------------------------------------
 10. Differences between interfaces and abstract class.*
----------------------------------------------------------

			
	---------------------------------------------------------------------------------------------------------------------------------------------------						
	|						interface 																abstract 									      | 	
	---------------------------------------------------------------------------------------------------------------------------------------------------
	|                                                                        |                                                                        |
	| 1. If we don't know anything about implementation and just we have	 |	1. If we are talking about implementation but not completly (partial  |
	|    requirement specification then we should go for interface.			 |		implementation) then we should go for abstract class.             |
	|                                                                        |                                                                        |
	| 2. Inside interface every method always public and abstract 			 |	2. Every method prasent inside abstract class need not be public      |
	|	 whether we are declaring or not hance a interface is 				 |	   public and abstract . And we can take concrete method also.	      |
	|	 considard as 100% pure abstract class.                              |                                                                        |
    |                                                                        |                                                                        |
    | 3. As every interface method is always public and abstract and hance 	 |   3. There are no restriction on abstract class method modifiers.      |
    |	 we can't declare with the following modifiers private,protected     |                                                                        |
    |	 final,static synchronized, native, and strictfp.                    |                                                                        |
    |                                                                        |                                                                        |
    | 4. Every variable prasent inside interface is always public,static,	 |	 4. Every variable prasent inside abstract class need not be public	  |														
    |	 final whether we are declaring or not.								 |		static,final.						 	                          |
	|                                                                        |                                                                        |
    | 5. As every interface variable is always public,static,final we can't  |    5. There are no restriction on abstract class variable modifiers    |                                                             
    |    declare with the following modifiers private,protected,volatile and |                                                                        |
    |    transient.                                                          |                                                                        |
    |                                                                        |                                                                        |
    | 6. For interface variables compulsory we should performe initialization|    6. For abstract class variables we are not required to performe     |                                                                   
    |    at the time of declaration only otherwise we will get compile time  |		initialization at the time of declaration.                        |
    |    Error.                                                              |                                                                        |
    |                                                                        |                                                                        |
    | 7. Inside interface we can't declare' static and instance blocks.		 |	  7. Inside abstract class we can declare static and instance blocks. |                                                                      
    |                                                                        |                                                                        |
    | 8. Inside interface we can't declare' constructors.					 |	  8. Inside abstract class we can declare constructors.               |                                                                                                                   |
    ---------------------------------------------------------------------------------------------------------------------------------------------------

Q. Anyway we can't create object for abstract class but abstract class can containe costructor what is the need  ?

	- abstract class constructors will be executed whenever we are creating child class object to performe initialization of child class object.
	
		Ex. 
		
											Approach - 1 Without Taking constructors in abstract class 
										-----------------------------------------------------------------
	
															abstract class Persion {
																
																String name; 
																int age;
																.
																.
																//100 property 
															}
															
	class Student extends Persion { 														class Teacher extends Persion { 
	                                                                                        
			int rollno;                                                                     		String subject;
			                                                                                		
			Student(String name,int age.....101 property are there){                        		Teacher(String name,int age.....101 property are there){
				                                                                            			
				this.name=name;|                                                            			this.name=name;|
				this.age=age;  |                                                            			this.age=age;  |
				.			   |//This 100 properties come from parent class 	            			.			   |//This 100 properties come from parent class 	
				.			   |	                                                        			.			   |	
				                                                                            			
				this.rollno=rollno;                                                         			this.subject=subject;
				                                                                            			
			}                                                                               		}
			public static void main(String args[]){                                         		public static void main(String args[]){
		   		                                                                            	   		
	        Student s1 = new Student(101-properties we are passing);                                Teacher t1 = new Teacher(101-properties we are passing);
		}                                                                                   	}
	}                                                                                       }
	
		- Problem with approach - 1 is more code and code redundancy.
											
											
	
											Approch - 2 With taking constructors in abstract class 
										-----------------------------------------------------------			  
													  
													  abstract class Persion {
														  
														  String name;
														  int age;
														  .
														  .
														  //100 property
														  
														  Persion(String name, int age...100 properties we are taking){<---
															  this.name=name;											  |
															  this.age=age;												  |
															  .															  |	// These constructors will work for every child 
															  .															  |	// Object creation.
															  //100 line code goes here									  |	
														  }<---------------------------------------------------------------
													  }
	
		class student extends Persion {													class Teacher extends Persion {
			                                                                            	
			int rollno;                                                                 	String subject;
			Student (String name.int age...101 properties we are passing )              	Teacher (String name.int age...101 properties we are passing )
			{                                                                           	{
				                                                                        		
				super(100 properties);                                                  		super(100 properties);
				this.rollno=rollno;                                                     		this.subject=subject;
			}                                                                           	}
			public static void main(String args[]){                                     	public static void main(String args[]){
				Student s = new Student(101-properties we are passing);                 		Teacher s = new Teacher(101-properties we are passing);
			}                                                                           	}
		}                                                                               }
		
		
		- Less code and code reuseability in approach - 2 .
		
Note: 

	1. Either directly or indirectly we can't create objects for abstract class.

Q. Anyway we can't create objects for abstract class and interface but abstract class can containe constructor but interface doesn't containe constructor what is the reasion ?
			
	- The main purpose of constructor is to performe initialization for the  instance variables.

	- Abstract class can containes instance variable which are required for child object.
	
	- To perform initialization all those instance variables constructor is required for abstract class.
	
	- But every variable prasent inside interface is always public static final whether we are declaring or not and there is no chance of exisiting instance variable inside 
	  interface hance a constructor concept is not required for interface.
	
	- Whenever we are creating child class object parent object won't be create just a parent class constructor will be executed for the child object puperose only.
	
			Ex.
			
				class P {
					
					p()
					{
						System.out.println(this.hashCode()); //1554547125
					}
				}
				class C extends P {
					
					C()
					{
						System.out.println(this.hashCode()); //1554547125
					}
				}
				class Test {
					
					public static void main(String args[]) {
						
						C  c = new C();
						System.out.pritln(c.hance()); //1554547125
					}
				}
				
 
 Q. Inside interface every method is always abstract and we can take only abstract methods in abstract class also then what is the difference between interface and abstract class 
	 that is, Is it possible to replace interface with abstract ? 
	 
	- We can replace interface with abstract class but it is not a good programming practice. These is something recruting IAS officer for swipinig activity.

    - If every things is abstract then it is highly recomanded to go for an interface but not for abstract class .

	-  ----------------------------------------------------------------------------------------------------------------------------------
		|	Approach - 1 											|						Approch -2 									|
	   -|-----------------------------------------------------------|-------------------------------------------------------------------|
		|abstract class X {											|				interface X {                                       |
	  	|															|				                                                    |
		|															|				                                                    |
		|}                               							|		       }                                                    |
		|									                        |                                                                   |
		|									                        |                                                                   |
		|class Test extends X {										|				class Test implements X {                           |
		|										                    |                                                                   |
		|}															|					}                                               |
		|							                                |                                                                   |
		|										                    |                                                                   |
	    | 1.While extending abstract class it is not possible to 	|	1. While implementing interface we can extends some other class |
		|  extends any other class and hance we are missing 		|	   and hance we won't miss any inheritance benifit.	 	        |
		|  inheritance benifit.                                     |                                                                   |
		|                                                           |                                                                   |
	    |                                                           |                                                                   |
	    | 2. In these case object creation is costly Ex.			|	 2. In these case object creation is not costly.                |
		|    Test t = new Test();									|		 Test t  = new Test();                                      |
		|    Take 2 Mintus,											|		 Take 2 Seconds.                                            |
		|                                                           |                                                                   |
		|                                                           |                                                                   |
		|                                                           |                                                                   |
		|                                                           |                                                                   |
		---------------------------------------------------------------------------------------------------------------------------------