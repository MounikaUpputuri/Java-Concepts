package InterfaceAssignment;

public class TestEducation {

	public static void main(String[] args) {

		VIT v=new VIT();
		v.campus();
		v.course();
		v.coursestructure();
		v.entrance();
		v.qualification();
		v.subject();
		v.prof();
		v.fee();
		v.overallstudent();
		v.overallstudentss();
		v.eduactionclass();
		
		NIT n=new NIT();
		n.campus();
		n.course();
		n.coursestructure();
		n.eduactionclass();
		n.entrance();
		n.fee();
		n.library();
		
		//top casting
		USEducation e=new VIT();
		e.course();
		e.fee();
		e.overallstudent();
		e.subject();
		
		
		
		
		
		/*
		 * //down casting VIT v1=(VIT) new Education(); v1.campus();
		 */
		
		
		
		
		
}
}