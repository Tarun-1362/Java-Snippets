package Interfaces;

public abstract class SampleImpl implements ISample {

	@Override
	public void m1() {
		System.out.println("Implementation is provided by m1");
	}

}

class SubSampleImpl extends SampleImpl {

	@Override
	public void m2() {
		System.out.println("Implementation is provided by m2");
	}

}
