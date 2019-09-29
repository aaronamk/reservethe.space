public abstract class Resource {
	protected PropertyList attributes;
	protected String identifier;
	private boolean isAvailable;

	public PropertyList getAttributes() {
		return attributes;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean available) {
		isAvailable = available;
	}

	protected void setCharger(boolean hasCharger) {
		attributes.setHasCharger(hasCharger);
	}

	protected void setHasProjector(boolean hasProjector) {
		attributes.setHasProjector(hasProjector);
	}

	protected void setHasWhiteboard(boolean hasWhiteboard) {
		attributes.setHasWhiteboard(hasWhiteboard);
	}

	protected void setHasTVScreen(boolean hasTVScreen) {
		attributes.setHasTVScreen(hasTVScreen);
	}

	protected void setTables(int tables) {
		attributes.setTables(tables);
	}

	protected void setMaxOccup(int maxOccup) {
		attributes.setMaxOccup(maxOccup);
	}

	protected void setDesc(String desc) {
		attributes.setDesc(desc);
	}
}
