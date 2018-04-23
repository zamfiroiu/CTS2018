package v1_builder;

public class PachetTransport {
	private boolean hasWiFi;
	private boolean hasAnimale;
	private boolean isFumator;
	private boolean hasAC;
	private boolean hasTV;	
	
	public PachetTransport(boolean hasWiFi, boolean hasAnimale, boolean isFumator, boolean hasAC, boolean hasTV) {
		super();
		this.hasWiFi = hasWiFi;
		this.hasAnimale = hasAnimale;
		this.isFumator = isFumator;
		this.hasAC = hasAC;
		this.hasTV = hasTV;
	}
	
	public boolean isHasWiFi() {
		return hasWiFi;
	}
	public void setHasWiFi(boolean hasWiFi) {
		this.hasWiFi = hasWiFi;
	}
	public boolean isHasAnimale() {
		return hasAnimale;
	}
	public void setHasAnimale(boolean hasAnimale) {
		this.hasAnimale = hasAnimale;
	}
	public boolean isFumator() {
		return isFumator;
	}
	public void setFumator(boolean isFumator) {
		this.isFumator = isFumator;
	}
	public boolean isHasAC() {
		return hasAC;
	}
	public void setHasAC(boolean hasAC) {
		this.hasAC = hasAC;
	}
	public boolean isHasTV() {
		return hasTV;
	}

	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}	

	@Override
	public String toString() {
		return "PachetTransport [hasWiFi=" + hasWiFi + ", hasAnimale=" + hasAnimale + ", isFumator=" + isFumator
				+ ", hasAC=" + hasAC + ", hasTV=" + hasTV + "]";
	}
}
