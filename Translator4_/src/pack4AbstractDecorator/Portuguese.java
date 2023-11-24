package pack4AbstractDecorator;

public class Portuguese extends AbstractTranslator {

	public Portuguese (int yI, int yE, ITranslator bt){
		this.bt=bt;	
		this.competence=Language.portuguese;
		this.yI=yI;
		this.yE=yE;
	}
	
}
