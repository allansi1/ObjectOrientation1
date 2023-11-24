package c.student;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	
	/* 
	 * Attributs des objets de cette clase 
	 * */
	
	private int id;
	private String name;
	private String givenName;
	private double grade;
	
	/* 
	 * Constructeurs    
	 * */ 
	
	/* 
	 * Constructeurs   sans donner la note 
	 * */ 
	public Student(int id, String name, String givenName) {
		setId(id);
		setName(name);
		setGivenName(givenName);
	}
	
	/* 
	 * Constructeurs   en donnant la note  --> tous les attributs
	 * */ 
	public Student(int id, String name, String givenName, double grade) {
		setId(id);
		setName(name);
		setGivenName(givenName);
		setGrade(grade);
	}
	
	/* 
	 * Function auxiliaire pour valider les noms et les pr�noms. 
	 * Normalement, ce type de function est priv�e (private) de la classe.
	 *  */
	private boolean isValidName(String n) {
		for (char c : n.toCharArray())
			if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ') && (c != '-'))
				return false;
		return true;
	}

//	private boolean isValidName(String n) {
//	boolean r = true;
//	for (char c : n.toCharArray())
//		r= r &&  ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c == ' ') || (c == '-'));			
//	return r;
//}
	
	/* 
	 * Les accesseurs (getters) et les mutateurs (setters) 
	 * */ 
	
	/* 
	 * Accesseur et mutateur de l'attribut id 
	 * */ 
	public int getId() {
		return id;
	}
	/* 
	 * mutateur priv� / proteg�, parce que il doit �tre utilis� seulement 
	 * au moment de construir l'object 
	 * */
	protected void setId(int id) throws StudentDataException {
		if(id<=0) {
			throw new StudentDataException(1, id);
		}
		else {
			this.id = id;
		}
	}
	
	/* 
	 * Accesseur et mutateur de l'attribut name 
	 * */ 
	public String getName() {
		return name;
	}
	/* 
	 * mutateur priv� / proteg�, parce que il doit �tre utilis� seulement 
	 * au moment de construir l'object 
	 * */
	protected void setName(String name) throws StudentDataException {
		if (!isValidName(name)) {
			throw new StudentDataException(2, name);
		}
		else {
			this.name = name;
		}
	}
	
	/* 
	 * Accesseur et mutateur de l'attribut givenName 
	 * */ 
	public String getGivenName()  {
		return givenName;
	}
	/* 
	 * mutateur priv� / proteg�, parce que il doit �tre utilis� seulement 
	 * au moment de construir l'object 
	 * */
	protected void setGivenName(String givenName) throws StudentDataException{
		if (!isValidName(givenName)) {
			throw new StudentDataException(3, givenName);
		}
		else {
			this.givenName = givenName;
		}
	}
	
	/* 
	 * Accesseur et mutateur de l'attribut grade
	 * */ 
	public double getGrade() {
		return grade;
	}
	/* 
	 * mutateur publique, parce que la note peut �tre donn�e 
	 * apr�s que l'objet est cr��.
	 * */
	public void setGrade(double grade) throws StudentDataException {
		if(grade<0) {
			throw new StudentDataException(4, grade);
		}
		else {
			this.grade = grade;
		}
	}
	/* 
	 * m�thode "with" pour utiliser le mutateur et retourner l'objet courant 
	 * */
	public Student withGrade(double grade) {
		this.setGrade(grade);
		return this;
	}
	
	/* 
	 * Override de la m�thode toString de la classe Object.
	 * Cela permet facilement d'imprimer et de concatener avec des "strings"  
	 * */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", givenName=" + givenName + ", grade=" + grade + "]";
	}
	
	/* Override de la m�thode compareTo de l'interface Comparable
	 * Attention:  
	 *        a.compareTo(b) < 0  ==>  a est "plus petit" que b 
	 *        a.compareTo(b) = 0  ==>  a est �gal � b 
	 *        a.compareTo(b) > 0  ==>  a est "plus grand" que b
	 *  */
	@Override
	public int compareTo(Student s) {
		// ordre par id 
		return this.id - s.id;  // for ascending order	
	}
	
	/*
	 * Nous pouvons aussi d�finir des "comparators" commme des 
	 * classes interne statique, bien que ce soit pr�f�rable de 
	 * les d�finir comme des classes / fichiers separ�es dans le 
	 * m�me paquet.
	 * */
	static public class NameComparator2 implements Comparator<Student>{
		
		/* Nous pouvons cr�er des "comparators" comme des classes interne statique publique,  
		 * cependant, cela n'est pas consid�rer la meilleur pratique. 
		 * C'est pr�f�rable de cr�er les "comparators" comme de classes externe.
		 * */ 
		
		// order par name, givenName, id
		@Override
		public int compare(Student s1, Student s2) {
			/*
			 * D'abord, on compare les noms (name) en utilisant le compareTo de String
			 */
			int r = s1.name.compareTo(s2.name);
			/*
			 * Si les noms sont egaux, on compare les pr�noms (givenName) en utilisant le
			 * compareTo de String
			 */
			if (r == 0) {
				r = s1.givenName.compareTo(s2.givenName);
			}
			/*
			 * Si les pr�noms sont aussi egaux, il nous reste que comparer par l'id
			 */
			if (r == 0) {
				r = s1.id - s2.id;
			}
			return r;
		}
	}

}
