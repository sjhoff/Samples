package gitdemo.sample;

public class SampleUI {
	public static void main(String[] args) {
		SampleClass samp = new SampleClass(101, "Jackson");
		SampleClass samp2 = new SampleClass(102, "Jason");
		System.out.println("this is person 1: "+samp.getName());
		System.out.println("this is person 2: "+ samp2.getName());
	}
}
