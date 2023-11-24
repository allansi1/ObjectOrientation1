package pack;

import java.util.*;

public class Student {
	
	private String id;
	private String name;
	private Program prog;
	
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
		
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
	
	public Program getProg() {
		return prog;
	}
	

	
	public void Inscription(Program prog) {
		if(this.prog!=null) {
			prog.getLS().remove(this);
		}
		
		this.prog=prog;
		prog.getLS().add(this);
	}

	@Override
	public String toString() {
		return "Student [getId()=" + getId() + ", getName()=" + getName() + ", getProg()=" + getProg() + "]";
	}

	
	
	
	
	
	
	

}
