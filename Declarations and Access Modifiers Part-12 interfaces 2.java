
															Declarations and Access Modifiers Part-12|| interfaces-2
														===============================================================
----------------------
 4. Interface method.
----------------------

   -> Every method prasent inside interface is always public and abstract whether we are declaring or not.

   Ex. 

		interface interf {
			
	-------->void m1();
	|		
	|	}
    |
	|-> public: To make these method to available to every implementation class.
	|
	|-> abstract: Implementation class is responsible to provide implementation.

	- Hance inside interface the following method declaration are equal.
		
		void m1();
		public void m1();
		abstract void m1();
		public abstract void m1();

 -> As a every interface method is always public abstract we can't declare interface method with the following modifiers.

		private, protected,static,final synchronized,strictfp,native.
		

Q. Which of the following method declarations are allowed inside interface.

	public void m1() {}//invalid 
	private void m1();//invalid 
	protected void m1();//invalid 
	static void m1();//invalid 
	public abstract native void m1();//invalid 
	abstract public void m1();//valid 
	
---------------------------
  5. Interface variables.
---------------------------

 -> An interface can containe variables the main purpose of interface variables is to define requirement level constants.

 -> Every interface variable is always public static final whether we are declaring or not.

	Ex. 
 
	interface interf {
		
    ------int x = 10;
	|
    | }
    |
    |-> public: To make these variable available to every implementation class.
	|
	|-> static: without exisiting object also  implementation class has to  access these variable
	|
	|-> final: If one implementation class changes value then remaining implementation classes will be effected To restrict these every interface variable is always final.

  - Hance a within the interface the following variable declaration are equal.

	int x = 10;							|
	public int x = 10;					|
	static int x = 10;					|
	final int x = 10;					|=====
	public static int x =10;			|=====  Equal 	
	public final int x = 10;			|=====
	static final int x =10;				|	
	public static final int x = 10;		|
	

-> As every interface variable is always public,static, final we can't decalre with the following modifiers :-

	private, protected, transient , volatile.
	
-> For interface variable compulsory we should performe initialization at the of time declaration otherwise we will get compile time error.
	
	Ex. 

	interface interf {									interface interf {
		                                                	
		int x ;//CE: equal symbol '=' expected .        	int x = 10;
	} //invalid                                                    } //valid 
		
		
 -> Inside interface which of the following variable declarations are allowed ?

	
	int x ; //invalid 
	private int x = 10; //invalid 
	protected int x = 10;//invalid 
	volatile int x = 10; //invalid 
	transient int x =10;//invalid 
	public static int x = 10;//valid 
	
	
 -> Inside implementation class we can access interface variables but we can't values.
 
	Ex. 

		interface interf {
			
				int x = 10;
		}
		
		class Test implements interf {							class Test implements interf {
			                                                    	
			public static void main(String args[]) {            	public static void main(String args[]) {
				                                                		
				x = 777;//CE:                                     		int x = 777;
				System.out.println(x);                          		System.out.println(x);
			}                                                   	}
		}                                                       }
	 //invalid CE: cannot assign a value to final variable x 	 valid : output: 777

 ---------------------------------
   6. Interface naming conficts.
 ---------------------------------

	1. Method naming conficts
   ---------------------------
		
		Case 1: If two interfaces containes a method with same signature and same return type then in the implementation class we have to provide implementation for only one 	
				method.
				
				Ex. 
		
			interface left {			interface right {
				                        	
				public void m1();       	public void m1();
			}                           }
			
				class Test implements left, right {
					
					public void m1() {
					}
				}

		
		Case 2: If two interfaces containes a method with same name but different argument types then in the implementation class we have to provide implementation for both 
				methods and these method access overloaded methods.

			interface left {			interface right {
            	                        	
            	public void m1();       	public void m1(int i );
			}                           }

				class Test implements left, right {
                	
                	public void m1() {<-----------
                	}							 |
					public void m1(int i ){		 |==>// These are method are overloaded method.	
												 |
					}<---------------------------
                }
		
		Case 3: If two interfaces containes a method with same signature but different return types then it is imposible to implemente both interfaces simultaneously (If return
				are not coverient ).
		
			Ex. 
			
				interface left {			interface right {						interface left {			interface right {
		        	                        	                                    	                        	
		        	public void m1();       	public int  m1();                   	public void m1();       	public int  m1();
		        }                           }                                       }                           }
				
				- We can't write any java class which implements both interfaces simultaneously.
		                                                                            
		        	class Test implements left, right {                             	class Test implements left, right {
		        		                                                            		
		        public void m1() {<----                                          					public void m1() {
		        }                     |                                      				}
				public int m1(){      |//we can't take same method in same                                       		
					return 10;        |  class it is overriding in overriding            }     // Here also return is differnt it is must be same in  parent and child                     		
				}<--------------------- return type and method name must be same         	  // Because it shows overriding concept 	           		
		    }  //invalid CE:                                                  			 class subTest extends Test {
																						 	
																						 	public int m1(){
																						 		
																						 		return 10;
																						 	}
																						 } //invlaid 
		
		Q. Is a java class can implement any number of interfaces simultaneously ?																				
																						
			Yes ! Except a particualr Case.
			
				If two interfaces containes a method with same signature but different return then it is imposible to implement both interfaces simultaneously.

		
		2. interface variable naming conflicts 
	  -----------------------------------------

		-> Two interfaces can containes a variable with the same name and there may be chance of variable naming conficts but we can solve these problem by using interface names.
		
			Ex.
		
			interface left {  				interface right {
				                            	
				int x = 777;                	int x = 888;
			}                               }
			
			class Test implements left,right {
				
				public static void main(String args[]){
					
					System.out.println(x);//CE: reference to x is ambigous.
					System.out.println(left.x);//777
					System.out.println(right.x);//888
				}
			}
				


































	  
		
		
		
		
		
		
		


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	