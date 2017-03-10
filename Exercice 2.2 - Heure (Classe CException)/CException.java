package fr.bouteloup.polytec.bouteloup;

public class CException extends Exception{
	
	// Attributes
	private static final long serialVersionUID = 1L;
	private String sCEXError;
	
	// Constructors
	public CException(String sCEXError) {
		super(sCEXError);
	}
	
	// Methods
	public String getsCEXError() {
		return sCEXError;
	}

	public void setsCEXError(String sCEXError) {
		this.sCEXError = sCEXError;
	}
}
