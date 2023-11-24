package b.student;

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
	 * Function auxiliaire pour valider les noms et les prénoms. 
	 * Normalement, ce type de function est privée (private) de la classe.
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
	 * mutateur privé / protegé, parce que il doit être utilisé seulement 
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
	 * mutateur privé / protegé, parce que il doit être utilisé seulement 
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
	 * mutateur privé / protegé, parce que il doit être utilisé seulement 
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
	 * mutateur publique, parce que la note peut être donnée 
	 * après que l'objet est créé.
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
	 * méthode "with" pour utiliser le mutateur et retourner l'objet courant 
	 * */
	public Student withGrade(double grade) {
		this.setGrade(grade);
		return this;
	}
	
	/* 
	 * Override de la méthode toString de la classe Object.
	 * Cela permet facilement d'imprimer et de concatener avec des "strings"  
	 * */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", givenName=" + givenName + ", grade=" + grade + "]";
	}
	
	/* Override de la méthode compareTo de l'interface Comparable
	 * Attention:  
	 *        a.compareTo(b) < 0  ==>  a est "plus petit" que b 
	 *        a.compareTo(b) = 0  ==>  a est égal à b 
	 *        a.compareTo(b) > 0  ==>  a est "plus grand" que b
	 *  */
	@Override
	public int compareTo(Student s) {
		// ordre par id 
		return this.id - s.id;  // for ascending order	
	}
	
}
