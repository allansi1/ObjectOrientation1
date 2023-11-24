package pack;

public class BasicDev implements IDev{
	
	private String name ; 
	
	public BasicDev(String name){
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
}
