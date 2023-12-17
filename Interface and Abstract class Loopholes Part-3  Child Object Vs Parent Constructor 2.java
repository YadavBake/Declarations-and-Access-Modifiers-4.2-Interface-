
										Interface and Abstract class Loopholes Part-3 || Child Object Vs Parent Constructor-2
									=============================================================================================


Q. Whenever we are creating child class object whether parent object will created or not ??									

	- Whenever we are creating child class object parent constructor will be executed but parent object won't be created.
		
		Ex. 
	
		class P {
			
			p() {
				System.out.println(this.hashCode()); //100
			}
		}
		class C extends P {
			
			C(){
				
				System.out.println(this.hashCode()); //100
			}
		}
		
		class Test {
			
			public static void main(String args[]){
				
				C c = new C();
				System.out.println(c.hashCode());//100
			}
		}
		
	- In the above example we just created only child class object but both parent and child constructor executed for that child class object.

		