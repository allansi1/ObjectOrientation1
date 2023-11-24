package pack1;

public class Chinese implements ITranslator{
	
	private ITranslator bt; 
	private Language competence; 
	
	public Chinese (ITranslator bt){
		this.bt=bt;	
		this.competence=Language.chinese;
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
		if (l==Language.chinese){
			return this.bt.getName() + " specific details of "+ l +".";
		}
		else {
			return bt.detailCompetence(l);
		}
			
	}

}