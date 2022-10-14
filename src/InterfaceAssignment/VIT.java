package InterfaceAssignment;

public class VIT extends Education implements USEducation,UKEducation,IndiaEducation{

	@Override
	public void subject() {
		System.out.println("Us subject");
		
	}

	@Override
	public void course() {
		System.out.println("US Course");		
	}

	@Override
	public void fee() {
		System.out.println("US fee");
	}

	@Override
	public void campus() {
		System.out.println("UK campus");
	}

	@Override
	public void prof() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void library() {
		System.out.println("UK Library");
	}

	@Override
	public void qualification() {
		System.out.println("UK qualification");
	}

	@Override
	public void entrance() {
		System.out.println("India entrance");
	}

	@Override
	public void coursestructure() {
		System.out.println("india course strictire");		
	}

	
	public void overallstudent() {
		System.out.println("Over all students from - Global");
		
	}
	
	public void overallstudentss() {
		System.out.println("Over all students from - Static");
		
	}
	

}
