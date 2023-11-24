package pack4AbstractDecorator;

public abstract class AbstractTranslator implements ITranslator {
	
	protected ITranslator bt; 
	protected Language competence; 
	protected int yI;
	protected int yE;
	
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
		if (l==this.competence){
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
		if(l==this.competence) {
			return yI;
		}
		else {
			return bt.getYearOfInst(l);
		}
	}
	@Override
	public int getYearOfExp(Language l) {
		if(l==this.competence) {
			return yE;
		}
		else {
			return bt.getYearOfExp(l);
		}
	}

}
