
												Interface and Abstract class Loopholes Part-4 || Need of Abstract class constructor
											=========================================================================================

 Q. Anyways we cannot create object for abstract class either directly or indirectly But abstract class can contain constructor. What is the need ??											
	
	- The main objective of abstract class constructor is to performe initialization for the instance variables which are inheriting from abstract class to the child class.
	
	- Whenever we are creating child class object automatically abstract class constructor will be executed to performe initialization for the instance variables which are 
	  inheriting from abstract class (code reuseability).
	
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
        		int marks                                                                               double salary  		
        		Student(String name,int age,int rollno,int marks ){                        		Teacher(String name,int age, double salary, String subject){
        			                                                                            			
        			this.name=name;|                                                            			this.name=name;|
        			this.age=age;  |                                                            			this.age=age;  |
        			.			   |//This 100 properties come from parent class 	            			.			   |//This 100 properties come from parent c
        			.			   | // This properties are in every 1000 child class 		    			.			   |// This properties are in every 1000 child class 	
        			                                                                            			
        			this.rollno=rollno;                                                         			this.subject=subject;
        			this.marks = marks;                                                                     this.salary=salary;       			
        		}                                                                               		}
        		public static void main(String args[]){                                         		public static void main(String args[]){
        	   		                                                                            	   		
                Student s1 = new Student("Bake" ,15,101,98);                               			 Teacher t1 = new Teacher("durga",45,java,25K);
        	}                                                                                   	}
        }                                                                                       }
        
        	- Problem with approach - 1 is more code and code redundancy.
			
				
			
					----------------																			
					|			   |	                                                                    		----------------
					| name "Bake " |                                                                        		|			   |	
			s---->  | age 15       |                                                                        		| name "durga" |
					| rollno 101   |                                                                        t---->  | age 45       |
					| marks 98     |                                                                        		| subject java |
					|              |                                                                        		| salary 25K   |
					----------------                                                                        		|              |
        										                                                            		----------------
        										
        
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
        														  .															  |	// These constructors will work for 
        														  .															  |	// Object creation.
        														  //100 line code goes here									  |	
        													  }<---------------------------------------------------------------
        												  }
        
        	class student extends Persion {													class Teacher extends Persion {
        		int  marks;                                                                     double salary;      	
        		int rollno;                                                                 	String subject;
        		Student (String name.int age...101 properties we are passing )              	Teacher (String name.int age...101 properties we are passing )
        		{                                                                           	{
        			                                                                        		
        			super(name,age);                                                  				super(name,age);
        			this.rollno=rollno; 															this.salary=salary;
					this.marks=marks;																this.subject=subject
        		}                                                                           	}
        		public static void main(String args[]){                                     	public static void main(String args[]){
        			Student s = new Student("Bake" ,15,101,98);                 					Teacher s = new Teacher("durga",45,java,25K);
        		}                                                                           	}
        	}                                                                               }
        	
        	
				
			
					----------------																			
					|			   |	                                                                    		----------------
					| name "Bake " |                                                                        		|			   |	
			s---->  | age 15       |                                                                        		| name "durga" |
					| rollno 101   |                                                                        t---->  | age 45       |
					| marks 98     |                                                                        		| subject java |
					|              |                                                                        		| salary 25K   |
					----------------                                                                        		|              |
												                                                            		----------------
												
        	- Less code and code reuseability in approach - 2 .