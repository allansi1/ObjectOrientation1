package pack3;

public class Portuguese implements ITranslator{
	
	private ITranslator bt; 
	private Language competence; 
	private int yI;
	private int yE;
	
	public Portuguese (int yI, int yE, ITranslator bt){
		this.bt=bt;	
		this.competence=Language.portuguese;
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
		if (l==Language.portuguese){
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
		if(l==Language.portuguese) {
			return yI;
		}
		else {
			return bt.getYearOfInst(l);
		}
	}
	@Override
	public int getYearOfExp(Language l) {
		if(l==Language.portuguese) {
			return yE;
		}
		else {
			return bt.getYearOfExp(l);
		}
	}
	
}
