package pack1;

public class Persian implements ITranslator{
	
	private ITranslator bt; 
	private Language competence; 
	
	public Persian (ITranslator bt){
		this.bt=bt;	
		this.competence=Language.persian;
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
		if (l==Language.persian){
			return this.bt.getName() + " specific details of "+ l +".";
		}
		else {
			return bt.detailCompetence(l);
		}
			
	}
	
}