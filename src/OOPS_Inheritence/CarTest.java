package OOPS_Inheritence;

public class CarTest {

	public static void main(String[] args) {
		BMW B=new BMW();
		B.start();//method overridding(same method is avilable in parent and child)
		B.stop();//inherited property(avilable only in parent ingerted to child)
		B.refuel();//in herited property
		B.autoparking();//individual property(avialble only in child class)
		B.engine();
		B.hello();
		Car.hello();
		BMW.hello();
		System.out.println("----------");
		
		Car C=new Car();
		C.start();
		C.stop();
		C.refuel();
		C.engine();
		//child class object can be refered by parent class ref variable
		//top casting:
		 Car c1=new BMW();
		 c1.start();
		 c1.stop();
		 c1.refuel();
		 
		 //parent class object cant be refered by child class ref variable.
		 
		//7BMW b1=(BMW) new Car(); //class exception error
		//b1.autoparking();
		System.out.println("--------");
		 Physics P=new Physics();
		 P.year();
		 P.considerau();
		 P.model();
		 P.invented();
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
	
	

}
