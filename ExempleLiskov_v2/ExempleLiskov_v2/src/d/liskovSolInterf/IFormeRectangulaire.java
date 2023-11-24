package d.liskovSolInterf;

import java.util.*;

public interface IFormeRectangulaire {
			
	public int getc1();
	
	public int getc2();
	
	public default int perimetre() {
		return 2*getc1() + 2*getc2();
	}
	
	public default int surface() {
		return getc1()*getc2();
	}
}
