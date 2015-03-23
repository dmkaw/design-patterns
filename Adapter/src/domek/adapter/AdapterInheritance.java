package domek.adapter;

/*
 * Class that "adapts" ClassToAdapt objects to SomeInterface interface by using inheritance
 */

public class AdapterInheritance extends ClassToAdapt implements SomeInterface {

	public AdapterInheritance(ClassToAdapt cta) {
		super(cta.getSomeText());
	}
	
	@Override
	public void print() {
		System.out.println(this.getSomeText());
	}

}
