package v2_builder;

public class PachetTransportBuilder implements Builder {
	private boolean hasWiFi;
	private boolean hasAnimale;
	private boolean isFumator;
	private boolean hasAC;
	private boolean hasTV;
	
	public PachetTransportBuilder()	{
		this.hasWiFi=false;
		this.hasAnimale=false;
		this.isFumator=false;
		this.hasAC=false;
		this.hasTV=false;
	}
	
	@Override
	public PachetTransport build() {
		return new PachetTransport(hasWiFi, hasAnimale, isFumator, hasAC, hasTV);
	}

	public PachetTransportBuilder setHasWiFi(boolean hasWiFi) {
		this.hasWiFi = hasWiFi;
		return this;
	}

	public PachetTransportBuilder setHasAnimale(boolean hasAnimale) {
		this.hasAnimale = hasAnimale;
		return this;
	}

	public PachetTransportBuilder setFumator(boolean isFumator) {
		this.isFumator = isFumator;
		return this;
	}

	public PachetTransportBuilder setHasAC(boolean hasAC) {
		this.hasAC = hasAC;
		return this;
	}

	public PachetTransportBuilder setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
		return this;
	}	
}
