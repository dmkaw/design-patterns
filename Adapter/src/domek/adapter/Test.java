package domek.adapter;

/*
 * Class which tests Adapter Design Pattern 
 */

public class Test {

	public static void main(String[] args) {

		SomeInterface si = new SomeInterface() {
			@Override
			public void print() {
				System.out.println("Pure interface.");
			}
		};
		
		// Use of pure interface
		Utility.work(si);

		ClassToAdapt cta = new ClassToAdapt(
				"Text from class adapted via composition.");
		ClassToAdapt cta2 = new ClassToAdapt(
				"Text from class adapted via inheritance.");

		// Utility.work(cta); can't do that, we need SomeInterface
		SomeInterface adapterSI = new AdapterComposition(cta);
		Utility.work(adapterSI);

		// Utility.work(cta2); can't do that, we need SomeInterface
		SomeInterface inheritanceSI = new AdapterInheritance(cta2);
		Utility.work(inheritanceSI);
	}

}
