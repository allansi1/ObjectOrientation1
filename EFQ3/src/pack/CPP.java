package pack;

public class CPP implements IDev{
	
	private IDev bt; 
	private Language competence; 
	
	public CPP (IDev bt){
		this.bt=bt;	
		this.competence=Language.CPP;
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
		if (l==Language.CPP){
			return this.bt.getName() + " specific details of "+ l +".";
		}
		else {
			return bt.detailCompetence(l);
		}
			
	}

}