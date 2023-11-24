package pack;

public class CSharp implements IDev{
	
	private IDev bt; 
	private Language competence; 
	
	public CSharp (IDev bt){
		this.bt=bt;	
		this.competence=Language.CSHARP;
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
		if (l==Language.CSHARP){
			return this.bt.getName() + " specific details of "+ l +".";
		}
		else {
			return bt.detailCompetence(l);
		}
			
	}

}