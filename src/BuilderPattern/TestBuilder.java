package BuilderPattern;

public class TestBuilder {

	public static void main(String[] args) {

		EcommApp app=new EcommApp();
		//use case : 1
		app.login()
			.search("Nike")
				.Productname("nike")
					.DoPayment("8744 4433 2345 2211", 987)
						.logout();
		
		//use case:2
		app.login("Hi", "Hello")
		.search("Macbook")
			.Productname("MAC book")
				.DoPayment("232356",765, 8755);
		
		//use case:3
		app.login()
			.search("Mounika")
				.logout();
		
		//use case:4
		app.login()
			.logout();
				
	}

}
