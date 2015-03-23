package domek.adapter;

/*
 * Some dummy class that needs "adapting" to work with Utility class
 */

public class ClassToAdapt {
	
	private String someText;
	
	public String getSomeText() {
		return someText;
	}

	public ClassToAdapt(String someText) {
		this.someText = someText;
	}
	

}
