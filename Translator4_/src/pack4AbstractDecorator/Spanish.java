package pack4AbstractDecorator;

public class Spanish extends AbstractTranslator {

	public Spanish (int yI, int yE, ITranslator bt){
		this.bt=bt;	
		this.competence=Language.spanish;
		this.yI=yI;
		this.yE=yE;
	}
	
}
