package fr.bouteloup.polytec.bouteloup;

public class Heure {
	
	// Attributes
	private byte heure;
	private byte minute;
	
	// Constructors
	public Heure() {
		heure = 00;
		minute = 00;
	}
	
	public Heure(int heure, int minute) {
		this.heure = (byte)heure;
		this.minute = (byte)minute;
	}
	
	// Methods
	public String toString() {
		return heure + ":" + minute;
	}
	
	public byte getHeure() {
		return heure;
	}
	
	public byte getMinute() {
		return minute;
	}
	
	// Le throws CExecption permet d'indiquer à la JVM qu'une exception est suceptible d'être levé  avec CException
	public void setHeure(int hh) throws CException {
		
		// Situation d'exception
		if (hh > 24 || hh < 0)
			throw new CException("Heure non valide");
		heure = (byte)hh;
	}
	
	// Le throws CExecption permet d'indiquer à la JVM qu'une exception est suceptible d'être levé  avec CException
	public void setMinute(int mm) throws CException {
		
		// Situation d'exception
		if (mm > 59 || mm < 0)
			throw new CException("Minute non valide");
		minute = (byte)mm;
	}
	
	// Le throws CExecption permet d'indiquer à la JVM qu'une exception est suceptible d'être levé  avec CException
	public void setHeureMinute(int hh, int mm) throws CException {
		setHeure(hh);
		setMinute(mm);
	}
	
	public void avancerMinute(int minute) {
		
		while (minute > 59)
		{
			minute -= 60;
			heure += 1;
		}
		this.minute += minute;
			
		if (this.minute > 59) {
			this.minute -= 60;
			heure += 1;
		}
				
		if (heure > 23)
			heure = 00;
	}
	
	public static void main(String[] args) {
		try {
			Heure HEUPremier = new Heure();
			HEUPremier.setHeureMinute(11, 50);
			HEUPremier.avancerMinute(122);
			System.out.println("Il est " + HEUPremier.heure + ":" + HEUPremier.minute);
		}catch (CException e) {
			System.out.println(e);
		}
	}
}