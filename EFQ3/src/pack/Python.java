package pack;

public class Python implements IDev{
	
	private IDev bt; 
	private Language competence; 
	
	public Python (IDev bt){
		this.bt=bt;	
		this.competence=Language.PYTHON;
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
		if (l==Language.PYTHON){
			return this.bt.getName() + " specific details of "+ l +".";
		}
		else {
			return bt.detailCompetence(l);
		}
			
	}

}