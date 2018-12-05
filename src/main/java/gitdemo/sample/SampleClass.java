package gitdemo.sample;

public class SampleClass {
	private int personId;
	private String name;
	
	public SampleClass(int personId, String name) {
		super();
		this.personId = personId;
		this.name = name;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
