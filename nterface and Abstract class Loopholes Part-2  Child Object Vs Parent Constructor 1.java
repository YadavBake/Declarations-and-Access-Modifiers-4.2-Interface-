<
												Interface and Abstract class Loopholes Part-2 || Child Object Vs Parent Constructor-1
											===========================================================================================


Q. Whenever we are creating child class object, what is the need of executing parent class constructor??											

	- Whenever we are creating child class object automatically parent constructor will be executed to performed initialization for instance variables which are inheriting 
	  from parent.
		
		Ex. 
	
		class Persion {
			
			String name;
			int age;																		---------------
																							|			  |	
			|Person(String name, int age){                                                  |			  |
			|	                                                                            |name ="durga"|
	------->|	this.name=name;                                                             |age = 32     |==>//This initialization performed by parent constructor. 
	|		|	this.age=age;														s-----> |             |
	|		|}                                                                              |rollno 101   |
	|	}                                                                                   |markes 98    |==>//This initialization performed by child constructor. 
	|	class Student extends Person {														---------------		
	|																							
	|		int rollno;			|----------------------------------------
	|		int markes;	   ---------									 |  	
	|		Student(String name, int age, int rollno, int markes){       |
	|-----------super(name,age);                                         |
				this.rollno=rollno;                                      |
				this.markes=markes;                                      |
			}															 | 	
																		 |	
	}							|------------------------------------------
					---------------------	                             
	Student s = new Student ("druga", 32,101,98);
	
	- In the above both parent and child constructors executed for child object initialization only.
	
	
		
		
		
		
		
		