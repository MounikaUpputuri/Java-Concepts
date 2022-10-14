package Assignments;

public class TestHospital {

	public static void main(String[] args) {
		Apollo A=new Apollo();
		A.treatment();//overridden
		A.price();//overridden
		A.name();//inherited
		
		max m=new max();
		m.treatment();
		m.price();
		m.name();
		
		Fortis F=new Fortis();
		F.treatment();
		F.name();
		F.price();
		
		//top casting
		System.out.println("------------");
		Hospital H=new Apollo();
		H.treatment();
		H.name();
		H.price();
		
		Hospital H1=new max();
		H1.price();
		H1.treatment();
		H1.name();
		
		Hospital H2=new Fortis();
		H2.name();
		H2.treatment();
		H2.price();
		
//		Fortis F1=(Fortis) new Hospital();
//		F1.treatment();
//		
		
		
				

	}

}
