package pack;

public class Web implements IDev{
	
	private IDev bt; 
	private Language competence; 
	
	public Web (IDev bt){
		this.bt=bt;	
		this.competence=Language.WEB;
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
		if (l==Language.WEB){
			return this.bt.getName() + " specific details of "+ l +".";
		}
		else {
			return bt.detailCompetence(l);
		}
			
	}

}