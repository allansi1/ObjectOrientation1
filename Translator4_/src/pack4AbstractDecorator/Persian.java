package pack4AbstractDecorator;

public class Persian extends AbstractTranslator {

	public Persian (int yI, int yE, ITranslator bt){
		this.bt=bt;	
		this.competence=Language.persian;
		this.yI=yI;
		this.yE=yE;
	}
}
