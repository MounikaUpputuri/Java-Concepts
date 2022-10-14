package StringConcepts;

public class StringManupulation {

	public static void main(String[] args) {
		
		String s="Hello my name is mounika from india";
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(34));
		//System.out.println(s.charAt(36));//String out of bound exception
		//System.out.println(s.charAt(-1));//string out of bound exception
		System.out.println(s.indexOf('m'));//it will give first occurance always
		System.out.println(s.indexOf('i'));
		//system.out.println(s.indexOf('i',s.indexOf('i')+1,s.indexOf('i')+1));
		System.out.println(s.indexOf("from"));
		String s1="       welcome admin       ";
		if(s1.indexOf("admin")>0){
			System.out.println("pass");
				}
		System.out.println(s.toLowerCase());//conversion to lowercase
		System.out.println(s.toUpperCase());//conversion to uppercase
		System.out.println(s1.trim());
		System.out.println(s1.trim().replace(" ", ""));
		
		String dob="28-09-1993";
		System.out.println(dob.replace("-", "/"));
		
		//contains
		String s2="naveen automation tools is there";
		System.out.println(s2.contains("automation"));
		if(s.contains("automation"))
		{
			System.out.println("Pass");
		}
		//comparison
		String t1="hello java";
		String t2="hello Java";
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));
		
		String lang="JAVA PYTHON RUBY PHP";
		String[] langarr=lang.split("_");
		for(String e:langarr)
		{
			System.out.println(e);
		}
		
		String str="xxjavaxxseleniumxxrubyxxpython";
		String[] arr=str.split("xx");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		String h="admin;admin123";
		String[] h1=h.split(";");
		for(String h2:h1)
		{
			System.out.println(h2);
		}
		System.out.println(h.split(";")[0]);
		System.out.println(h.split(";")[1]);
		
		//substring
		String message="your order id is 12345";
		System.out.println(message.substring(4));
		System.out.println(message.substring(5, 10));
		System.out.println(message.substring(message.indexOf("is")+3, message.length()));		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
