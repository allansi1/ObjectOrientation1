package pack4AbstractDecorator;

public class Chinese extends AbstractTranslator {

	public Chinese (int yI, int yE, ITranslator bt){
		this.bt=bt;	
		this.competence=Language.chinese;
		this.yI=yI;
		this.yE=yE;
	}
	
}
