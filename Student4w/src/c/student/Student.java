package c.student;

import java.util.*;

public class Student implements Comparable <Student> {
	
	//attributs
	private int id;
	private String name;
	private String givenName;
	private double grade;
	
	//construteurs
	public  Student(int id, String name, String givenName) {
		setId(id);
		setName(name);
		setGivenName(givenName);
	}
	public  Student(int id, String name, String givenName, double grade) {
		setId(id);
		setName(name);
		setGivenName(givenName);
		setGrade(grade);
	}
	
	private boolean isValidName(String n) {
		for (char c: n.toCharArray()) 
			if((c<'a'||c >'z')&& (c<'A'||c >'Z')&&(c!=' ')&&(c!='-')) {
				return false;
			}
			return true;
		}
	
	private boolean isValidName2(String n) {
		boolean r = true;
		for (char c: n.toCharArray())
		r = r && ((c>='a'&&c<='z')|| (c>='A'&&c<='Z')||(c==' ')||(c=='-'));
		return true;
	}
	
	public int getId() {
		return id;
	}
	//mutateur privé - proteger para que o só possa ser usado na hora de criar o objeto
	protected void setId(int id) throws StudentDataException {
		if(id<=0) {
			throw new StudentDataException(1, id);
		}
		else {
			this.id = id;
		}
		
	}
	
	public String getName() {
		return name;
	}
	
	
	protected void setName(String name) throws StudentDataException {
		if(!isValidName(name)) {
			throw new StudentDataException(2, name);
		}
		else {
			this.name = name;
		}
		
	}
	
	public String getGivenName() {
		return givenName;
	}
	
	
	protected void setGivenName(String givenName) throws StudentDataException {
		if(!isValidName(givenName)) {
			throw new StudentDataException(3, givenName);
		}
		else {
			this.givenName = givenName;
		}
		
	}
	
	public double getGrade() {
		return grade;
	}
	//mutateur privé - proteger para que o só possa ser usado na hora de criar o objeto
	public void setGrade(double grade) throws StudentDataException {
		if((grade<0) || (grade > 100)) {
			throw new StudentDataException(4, grade);
		}
		else {
			this.grade = grade;
		}
		
	}
	
	public Student withGrade(double grade) {
		this.setGrade(grade);
		return this;
	}
	
	@Override
	public String toString() {
		return "Student [id = " + id + ", name = " + name + ", givenName = " + givenName + ", grade = " + grade+ "]";  
	}
	
	
	/*Override de la methode compareTo de l'interface Comparable
	 * 	a.compareTo(b) < 0 => a est plus petit que b
	 * 	a.compareTo(b) = 0 => a est égal à b
	 *  a.compareTo(b) > 0 => a est plus grand que b
	 */
	@Override
	public int compareTo(Student s) {
		//ordre par id
		return this.id - s.id; // for ascending order
	}
	
	/* Nous pouvons aussi définir des "comparators" comme des classes
	 * interne statique, bien que ce soit préférable de les définir comme
	 * les classes /fichiers separées dans le même paquêt
	 */
	
	static public class NameComparator2 implements Comparator<Student>{
		/*Nous pouvons créer des "comparators" comme des classes interne statique public.
		 * cedependant, cela n'est pas considérer la meuiller pratique.
		 * C'est préférable de créer les "comparators" comme de classes externe.
		 */
		
		public int compare(Student s1, Student s2) {
			/*
			 * D'abord , on compare les noms (name) en utilisant le compareTo de String
			 */
			
			int r=s1.name.compareTo(s2.name);
			
			/* Si les names sont egaux, on compare les prénoms (givenName)
			 * en utilisant le compareTo de String
			 */
			if(r==0) {
				r=s1.givenName.compareTo(s2.givenName);
			}
			/* Si les givennames sont egaux, on compare les ids 
			 */
			
			if(r==0) {
				r=s1.id - s2.id;
			}
			return r;
			
		}
		
		
		
		
	}
	
	
	
	
	
}


