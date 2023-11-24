package pack4AbstractDecorator;

public interface ITranslator {

	String getName();	
	
	String getCompetence();
	
	String detailCompetence(Language l);
	int getYearOfInst(Language l);
	int getYearOfExp(Language l);
		
}
