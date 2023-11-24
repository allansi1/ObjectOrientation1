package pack;

import java.util.*;

public class Program {
	
	private String id;
	private String name;
	private List<Student> LS = new ArrayList<Student>();
	
	public Program(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public List<Student> getLS() {
		return LS;
	}

	

	
	
	

}
