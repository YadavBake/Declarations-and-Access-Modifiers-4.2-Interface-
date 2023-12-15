
															Declarations and Access Modifiers Part-13|| interfaces-3
														==============================================================

-------------------------------
	7. Marker interface. *
-------------------------------
	
-> If an interface doesn't containe any methods and by implimenting that interface if our objects will gets some ability such type of interfaces are called marker interfaces.
   or ability interface or tag interface.
	
	Ex.
	
	1. Serializable (I)    |
	2. Cloneable(I)		   |
	3. RandomAccess(I)     |==> These are marked for some ability.
	4. SingleThreadModel(I)|
	
	
	Ex. 
	
	- By implimenting Serializable interface our objets can saved to the file and can travel across the network.
	
	- By implimenting Cloneable interface our objects are in a possition to produce exctaly duplicate cloned objects.
	


Q. Without having methods how the objets will get some ability in marker interfaces ?

	- Internally JVM is a responsible to provide required ability.

Q. Why JVM is providing required ability in marker interfaces ?

	- To raduce complexity of programming and to make java language as simple.
	
Q. Is it possible to create our own marker interface ? 

	- Yes! But customization of JVM is required.

-----------------------
  8. Adapter classes.
-----------------------
  
  -> Adapter class is simple java class that implements an interface with only empty implementation.

	interface x {		  abstract class Adaptorx implements x {
		                       	                                
		m1();                  	m1(){}                          
		m2();                  	m2(){}	                        
		m3();                  	m3(){}                          
		.                      	m4(){}                          
		.                      	m5(){}                          
		m1000();               	.....                           
		                       	m1000(){}                       
	}                          }                                
	                                                            
	- If we implement an interface for each and every method of that interface compulsory we should provide implementation whether it required or not required.                                                          
	  
			
	class Test implements x {		
    	                            
    	m3(){                       
		  //10 lines of code 	                        
		}                           
		m2(){} 		|                     
		m3(){}  	|99line of code                     
		...     	|                    
		m1000(){}                   
	}                               
    
	- The problem in these approach is it increases length of the code raduces readbility.
	
	- We can solve these problem by using adapter classes.
	
	- Initiated of implmenting interface If we extend adapter class we have to provide implementation only for required for methods and we are not responsible to provide 
	  implementation for each and every method of the interface so that length of the code will raduce.
	  
		Ex. 
		
			class Test extends Adaptorx {					    X 	
																^
	        	m3(){											|
																|
            	}											  Adapterx 
            }													 ^
            class Sample extends Adapterx{						 |	
																 |
            		m7(){									   Test 	
               		}
                                        		
             }
             
             class Demo extends Adapterx {
             	
             	m1000(){
             	}
             }

	-> We can develop a servlet in the following Three ways.
	
		1. By implementing Servlet interface.
		2. By extending GenericServlet.
		3. By Extending Httpservlert.
		
		
	   -----------------------								
	   |					 |	 5 Methods Here 
	   |	                 |---------------------------> Servlet(I) 
	   |	                 |								  ^
	   |	MYservlet class  |	service()					  |
	   |	                 |---------------------------> GernericServlet(Ac)
	   |	                 |								  ^
	   |	                 |								  |		
	   |	                 |---------------------------> HttpServlert(Ac)
	   |	                 |
	   -----------------------	



	- If we implement servlet interface for each and every method of that interface we should provide implementation it increases length of the code and raduces readbility.
	
	- Initiated implementing servlet directly If we extend genericServlet we have to provide implementation only for service() method and For all reamaining methods we are 
	  not required to provide implementation hance a more or less genericServlet access adapter class for servlet interface.
	  
Note: 

	Marker interface and adapter classes simplifies complexity of programming and these are best utilies to the programmer and programmers life will become simple.
	
	
	
	
	