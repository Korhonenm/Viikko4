package model;

public class Asiakas {
	private String enimi,snimi, puhelin, sposti;

	public Asiakas() {
		super();
	}

	public Asiakas(String enimi, String snimi, String puhelin, String sposti) {
		super();
		this.enimi = enimi;
		this.snimi = snimi;
		this.puhelin = puhelin;
		this.sposti = sposti;
	}

	public String getEnimi() {
		return enimi;
	}

	public void setEnimi(String enimi) {
		this.enimi = enimi;
	}

	public String getSnimi() {
		return snimi;
	}

	public void setSnimi(String snimi) {
		this.snimi = snimi;
	}

	public String getPuhelin() {
		return puhelin;
	}

	public void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}

	public String getSposti() {
		return sposti;
	}

	public void setSposti(String sposti) {
		this.sposti = sposti;
	}

	@Override
	public String toString() {
		return "Asiakas [enimi=" + enimi + ", snimi=" + snimi + ", puhelin=" + puhelin + ", sposti=" + sposti + "]";
	}
	
	
}
