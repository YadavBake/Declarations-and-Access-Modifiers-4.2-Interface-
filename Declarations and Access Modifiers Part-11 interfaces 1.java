
															Declarations and Access Modifiers Part-11|| interfaces-1
														===============================================================
--------------
  Interfaces 
--------------

  1. Introduction.
  2. interface Declaration and implementation.
  3. extends vs implements.
  4. Interface method.
  5. Interface variables.
  6. Interface naming conficts.
		
		1. Method naming conficts.
		2. Variable naming conficts.
  7. Marker interface. *
  8. Adapter classes.
  9. interface vs abstract class vs concrete class.
 10. Differences between interfaces and abstract class.*
 11. Conclusion.

====================================================================================================================================================================================

---------------------
	1. Intrduction
---------------------	

	Defination-1 
		
		- Any service requirement specification (SRS) is considard as an interface.
		
		Ex. 
			
		 - JDBC API access requirement specification to develop database driver.

		- DataBase vendor is responsible to implement JDBC API.
		
						
												   Sun
													|
													|
											-----------------
											|  JDBC API     |
											-----------------
											|		 |      |
							------------------		 |		|------------------		
							|						 |						  | 	
							|						 |						  |
					---------------------   ---------------------	---------------------	
					|  Oracle Driver    |   |  Oracle Driver    |   |  Oracle Driver    | //=> These DataBase Vendor 
					---------------------   ---------------------   ---------------------
					
		Ex. 

		- Servlet API access requirement specification to develop web server.
		
		- Web server vendor is responsible to implement servlet API.
		
					
										   Sun					
			   								|					
	           								|                    
	           						-----------------                    
		       						|  Servlet API  |                    
	           						-----------------                    
	           						|		 |      |                    
	           		------------------		 |		|------------------		                    
	           		|						 |						  | 	                    
	           		|						 |						  |                    
	         -----------------------   ------------------------	  -----------------------                    
	         |Appache Tomcat server|   |Oracle Weblogic Server|   |IBM Websphere server |                    
	         -----------------------   ------------------------   -----------------------                    
	                            
	
	Defination-2
	
		- From client point of view an interface defines the set of services what his accepting.
		
		- From service provider point of view an interface defines the set of services what his offering hance any contract between client and service provider is considard as 
		  an interface.
		  
			Ex. -------										-------	
		        |	  |		  -------------------           |	  |	
		        |	  |		  |					|           |	  |	
		        -------       | getAttented()   |           ------- 
		           |		  | getMarkes()     |              |	
		           |		  | updateMarks()   |              |	
		           ^          | .               |<------------ ^    
		           |--------->| .               |              |
		           |		  | service         |              |	
		           ^		  |                 |              ^	
		           |		  |	                |              |	
		        client 		  -------------------	 		service provider
		        					Sevice 					
		  
		 Ex.
		 
			- Through bank ATM GUI 	Screen bank people are highleting the set of services what they are offering at the same time the same GUI screen reprasent the set of services 
			  what customer is accepting hance a these GUI screen access contract between customer and bank people.
			  
		
				-------										-------						
				|	  |		  -------------------           |	  |				  
				|	  |		  |					|           |	  |				  
				-------       | withdrawal	    |           ------- 			  
				   |		  | mini statment   |              |				  
				   |		  | update balance  |              |				  
                   ^          | .               |<------------ ^    
                   |--------->| .               |              |
                   |		  | service         |              |	
                   ^		  |                 |              ^	
                   |		  |	                |              |	
                customer 	  -------------------	 		Bank people 
                			  Bank ATM GUI screen  					
							  
							  
	Defination-3

		- Inside interface every method is always abstract whether we are declaring or not hance a interface is considard as  100% percent pure abstract class.
		
		
							  
	Summary Defination
	
		- Any service requirement specification or any contract between client and service provider or hundread percent pure abstract class is nothing but interface.
		
		
-----------------------------------------------	
  2. interface Declaration and implementation.	
-----------------------------------------------  
  
  -> Whenever we are implementing an interface For each and every method of that interface we have to provide implementation otherwise we we have to declare class as abstract then 
	 next level child class is responsible to provide implementation.
	 
  -> Every interface method is always public and abstract whether we are declaring or not hance a whenever we are implementing an interface method compuosory we should declare as 
	 public otherwise we will get compile time error.
	 
	 Ex. 
	 
  
	interface interf {				
		                            
			void m1();              
			void m2();              
	}                               
	                                
	
	abstract class ServiceProvider implements interf {
    --------		
		public void m1() {
	   -------		
		}
	}

	class SubServiceProvider extends  interf {
								  
		public void m2() {						  
	  ---------		
		}	
	}						  
	
------------------------------
   3. extends vs implements.	
------------------------------

	-> A class can extends only one class at a time.
	
	-> An interface can extends any number of interfaces simultaneously.
	
	Ex 
	
			interface A {			interface B {
										
									}
			}
			
			
			interface  C extends A,B {
				
			} //valid 
		
	-> A class can implements any number of interfaces simultaneously.

	-> A class can extends another class and can implemente any number of interfaces simultaneously.
		
		Ex. 
	
		class A extends B implements C,D,E {
			
		}
	
 Q. Which of the following is valid.

	1. A class can extends any number of classes at time. //invalid 
	
	2. A class can implements only one interface at a time. //invalid
	
	3. An interface can extends only one interface at a time. // invalid 
	
	4. An interface can implemente any number of interfaces simultaneously. //invalid 
	
	5. A class can extends another class or can implemente an interface but not both simultaneously. //invalid
	
	6. non of above. //valid 
	
	
 Q. considard the following expression bellow.
		
	-------------------	
	|	X extends Y   |
	-------------------
		
	 - For which of the following X and Y  the above expression is valid ? 	
	
	      1. Both X and Y should be classes. //invalid 
	      
	      2. Both X and Y should be interfaces. //invalid 
	      
	      3. Both X and Y can be either classes or  interfaces. //valid 
	      
	      4. No-restriction.//invalid 
	
 Q. 

  -------------------							 -----------------------  -------------------------------   ------------------------------
  |	X extends Y,Z   |                            | X implements  Y,Z   |  |	X extends Y implements Z    |   | X implements Y extends Z   |
  -------------------	                         -----------------------  -------------------------------   -----------------------------	
	                                                                                                       
	1. X,Y,Z should be interfaces.//valid       1. x--> class             	1. X,Y ---> classes            CE: because we have to take extends first followed by interface 
                                                2.Y,Z -->interface        	2. Z ---> interfaces 









	


	 
	 
	 

	
	
		
	  
	  
	  
	
		
	
	
	
	
	
	
	
	
	
	
	 
	