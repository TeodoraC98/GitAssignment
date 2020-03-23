package ro.ase.acs.cts.tema;

public class DateStudent {
	private String numeStudent;
	private String denumireFacultate;
	private int anSustinereLicenta;
	private boolean sustinereLicenta;
	
	public DateStudent(String numeStudent, String denumireFacultate, int anSustinereLicenta) {
		super();
		this.numeStudent = numeStudent;
		this.denumireFacultate = denumireFacultate;
		this.anSustinereLicenta = anSustinereLicenta;
	
	}
	
	public boolean isSustinereLicenta() {
		return sustinereLicenta;
	}

	public void setSustinereLicenta(boolean sustinereLicenta) {
		this.sustinereLicenta = sustinereLicenta;
	}

	public String getNumeStudent() {
		return numeStudent;
	}
	public void setNumeStudent(String numeStudent) {
		this.numeStudent = numeStudent;
	}
	public String getDenumireFacultate() {
		return denumireFacultate;
	}
	public void setDenumireFacultate(String denumireFacultate) {
		this.denumireFacultate = denumireFacultate;
	}
	public int getAnSustinereLicenta() {
		return anSustinereLicenta;
	}
	public void setAnSustinereLicenta(int anSustinereLicenta) {
		this.anSustinereLicenta = anSustinereLicenta;
	}

	@Override
	public String toString() {
		
		return "Studentul "+this.numeStudent+" din cadrul facultatii "+this.denumireFacultate+" va sustine lucrarea de licenta in anul "+this.anSustinereLicenta;
	}
	

}
