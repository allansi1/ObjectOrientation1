package pack4AbstractDecorator;

public class BasicTranslator implements ITranslator{
	
	private String name ; 
	
	public BasicTranslator(String name){
		this.name= name;
	}
	
	@Override
	public String getName(){
		return name; 
	}
	
	@Override
	public String getCompetence(){
		return "";
	}
	
	@Override
	public String detailCompetence(Language l){
		return "I, "+name+", don't know "+l+".";
	}
	@Override
	public int getYearOfInst(Language l) {
		return 0;
	}
	@Override
	public int getYearOfExp(Language l) {
		return 0;
	}
}
