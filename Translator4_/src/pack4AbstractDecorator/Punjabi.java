package pack4AbstractDecorator;

public class Punjabi extends AbstractTranslator {

	public Punjabi (int yI, int yE, ITranslator bt){
		this.bt=bt;	
		this.competence=Language.punjabi;
		this.yI=yI;
		this.yE=yE;
	}
	
}
