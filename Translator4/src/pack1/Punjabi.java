package pack1;

public class Punjabi implements ITranslator{
	
	private ITranslator bt; 
	private Language competence; 
	
	public Punjabi (ITranslator bt){
		this.bt=bt;	 
		this.competence=Language.punjabi;
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
		if (l==Language.punjabi){
			return this.bt.getName() + " specific details of "+ l +".";
		}
		else {
			return bt.detailCompetence(l);
		}
			
	}

}
