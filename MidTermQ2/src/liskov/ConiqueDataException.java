package liskov;

public class ConiqueDataException extends RuntimeException {

	private int code;
	private Object obj;
	private String msg;
	
	ConiqueDataException(int code, Object obj){
		this.code = code;
		this.obj=obj;
		if(code==1) {
			this.msg = "Sah invalide: " + (double)obj;
		}
		else if (code==2) {
			this.msg = "Sav invalide: " + (double)obj;
		}
		else if (code==3) {
			this.msg = "r invalide: " + (double)obj;
		}
		
		else {
			this.msg = "Error Inconnu";
		}
		
		
	}
	
	public int getCode() {
		return this.code;
	}
	public Object getObj() {
		return this.obj;
	}
	
	@Override
	public String getMessage() {
		return this.msg;
	}
	
}
