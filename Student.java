package Q5;

public class Student {
	private String name;
	private Transcript transcript;
	
	
	public Student(String name,int id) {
		this.setName(name);
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Transcript getTranscript() {
		return transcript;
	}

	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}

	
}
