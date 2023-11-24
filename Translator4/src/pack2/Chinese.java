package pack2;

public class Chinese implements ITranslator{
	
	private ITranslator bt; 
	private Language competence;
	private int yearsInst;
	private int yearsExp;
	
	public Chinese (ITranslator bt, int yearsInst, int yearsExp){
		this.bt=bt;	
		this.competence=Language.chinese;
		this.yearsInst = yearsInst;
		this.yearsExp = yearsExp;
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
			return this.bt.getName() + " specific details of "+ l + "has " + getYI(l) + " years of study and " + getYE(l) +
					" years of experience.";
		}
		else {
			return bt.detailCompetence(l);
		}
			
	}
	
	@Override
	public int getYE(Language l) {
		if(l==Language.chinese) {
			return yearsExp;
		}
		else {
			return bt.getYE(l);
		}
		
	}
	
	@Override
	public int getYI(Language l) {
		if(l==Language.chinese) {
			return yearsInst;
		}
		else {
			return bt.getYI(l);
		}
		
	}
}