package domek.adapter;

/*
 * Class that "adapts" ClassToAdapt objects to SomeInterface interface by using composition
 */

public class AdapterComposition implements SomeInterface {
	
	ClassToAdapt cta;
	
	public AdapterComposition(ClassToAdapt cta) {
		this.cta = cta;
	}

	@Override
	public void print() {
		System.out.println(cta.getSomeText());
	}
	
	

}
