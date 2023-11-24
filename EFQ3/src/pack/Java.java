package pack;

public class Java implements IDev{
	
	private IDev bt; 
	private Language competence; 
	
	public Java (IDev bt){
		this.bt=bt;	
		this.competence=Language.JAVA;
	}
	
	@Override
	public String getName() {
		return bt.getName();
	}
	
	@Override
	public String getCompetence(){
		return this.competence+ ", "+bt.getCompetence();
	}	
	@Override
	public String detailCompetence(Language l){
		if (l==Language.JAVA){
			return this.bt.getName() + " specific details of "+ l +".";
		}
		else {
			return bt.detailCompetence(l);
		}
			
	}

}