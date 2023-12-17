
											      Interface and Abstract class Loopholes Part-6 || Abstract class Vs Interface
												================================================================================

 Q. Inside interface we can take only Abstract Methods. But in Abstract class also we can take only Abstract method based on our requirement. Then what is the Need of interface
    i.e. Is it possible to replace interface concept with Abstract class ? 
	
	- If every things is abstract it is highly recomanded to go for interface but not abstract class.
	
	- We can replace interface with abstract class but it is not good progamming practice ( These is something like recruting IAS officer for swing purose.
	
	
		EX. 
	
		Ex. 
	
	
		interface X {															abstract class X {
																					
																					
		}                   												    }
	
     1. While implementing interface we can extends any other class 		1. Wihle extending abstract class we can't extends any other class and hence we are missing inheritance. 
		and hence we won't miss inheritance beniift.
			
	 Class Test extends A implements X {										class Test extends x, A {


	 }//valid 																			}//invalid 
	
     2. In these object creation is not costly.								2. In these case object creation is costl y.
		
		
	class Test implements X {													class Test extends X {														
		                                                                        	
	}                                                                           }
	Test t = new Test();                                                        Test t = new Test();
		2min 																			2sec 