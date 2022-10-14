package MYJavaSessions;

public class ObjectReference {
	String name;
	int age;
	public void get() {
		System.out.println("Print name and age");
	}

	public static void main(String[] args) {
		ObjectReference obj= new ObjectReference();
		//obj=null;//null pointer exception
		obj.name="Hi";
		System.out.println(obj.name);
		//no reference object
		new ObjectReference().name="Mounika";
		new ObjectReference().age=23;
		new ObjectReference().get();
		
		
		

	}

}
