package pack1;

public class Spanish implements ITranslator{
	
	private ITranslator bt; 
	private Language competence; 
	
	public Spanish (ITranslator bt){
		this.bt=bt;	
		this.competence=Language.spanish;
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
		if (l==Language.spanish){
			return this.bt.getName() + " specific details of "+ l +".";
		}
		else {
			return bt.detailCompetence(l);
		}
			
	}
}
