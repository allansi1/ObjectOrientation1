package pack3;

public class Punjabi implements ITranslator{
	
	private ITranslator bt; 
	private Language competence; 
	private int yI;
	private int yE;
	
	public Punjabi (int yI, int yE, ITranslator bt){
		this.bt=bt;	 
		this.competence=Language.punjabi;
		this.yI=yI;
		this.yE=yE;
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
			return this.bt.getName() + " specific details of "+ l +". \n" +
					   this.bt.getName() + "'s years of instruction in " + l+": "+yI +"\n" +
					   this.bt.getName() + "'s years of experience in " + l+": "+yE ;
		}
		else {
			return bt.detailCompetence(l);
		}		
	}
	@Override
	public int getYearOfInst(Language l) {
		if(l==Language.punjabi) {
			return yI;
		}
		else {
			return bt.getYearOfInst(l);
		}
	}
	@Override
	public int getYearOfExp(Language l) {
		if(l==Language.punjabi) {
			return yE;
		}
		else {
			return bt.getYearOfExp(l);
		}
	}
	
}
