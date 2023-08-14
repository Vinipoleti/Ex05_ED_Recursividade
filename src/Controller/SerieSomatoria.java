package Controller;

public class SerieSomatoria {

	public SerieSomatoria() {
		super ();
	}
	
	public double SerieSoma ( double N) {
		
		if (N==1) {
			return 1;
		} else {
			return 1/ N + SerieSoma(N-1);
		}
	}
}
