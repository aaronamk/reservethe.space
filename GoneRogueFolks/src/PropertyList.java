public class PropertyList {
	private boolean hasCharger;
	private boolean hasProjector;
	private boolean hasWhiteboard;
	private boolean hasTVScreen;
	private int tables;
	private int maxOccup;
	private String desc;

	private PropertyList(boolean hasCharger, boolean hasProjector, boolean hasWhiteboard, boolean hasTVScreen, int tables, int maxOccup, String desc) {
		this.hasCharger = hasCharger;
		this.hasProjector = hasProjector;
		this.hasWhiteboard = hasWhiteboard;
		this.hasTVScreen = hasTVScreen;
		this.tables = tables;
		this.maxOccup = maxOccup;
		this.desc = desc;
	}

	public boolean getHasCharger() {return hasCharger;}

	public boolean getHasProjector() {return hasProjector;}

	public boolean getHasWhiteboard() {return hasWhiteboard;}

	public boolean getHasTVScreen() {return hasTVScreen;}

	public int getTables() {return tables;}

	public int getMaxOccup() {return maxOccup;}

	public String getDesc() {return desc;}

	public void setHasCharger(boolean hasCharger) {this.hasCharger = hasCharger;}

	public void setHasProjector(boolean hasProjector) {this.hasProjector = hasProjector;}

	public void setHasWhiteboard(boolean hasWhiteboard) {this.hasWhiteboard = hasWhiteboard;}

	public void setHasTVScreen(boolean hasTVScreen) {this.hasTVScreen = hasTVScreen;}

	public void setTables(int tables) {this.tables = tables;}

	public void setMaxOccup(int maxOccup) {this.maxOccup = maxOccup;}

	public void setDesc(String desc) {this.desc = desc;}

	public static class PropertyListBuilder {
		private boolean hasCharger;
		private boolean hasProjector;
		private boolean hasWhiteboard;
		private boolean hasTVScreen;
		private int tables;
		private int maxOccup;
		private String desc;

		private PropertyListBuilder(boolean hasCharger, boolean hasProjector, boolean hasWhiteboard, boolean hasTVScreen, int tables, int maxOccup, String desc) {
			this.hasCharger = hasCharger;
			this.hasProjector = hasProjector;
			this.hasWhiteboard = hasWhiteboard;
			this.hasTVScreen = hasTVScreen;
			this.tables = tables;
			this.maxOccup = maxOccup;
			this.desc = desc;
		}

		public static PropertyListBuilder aPropertyList(boolean hasCharger, boolean hasProjector, boolean hasWhiteboard, boolean hasTVScreen, int tables, int maxOccup, String descr) {
			return new PropertyListBuilder(hasCharger, hasProjector, hasWhiteboard, hasTVScreen, tables, maxOccup, descr);
		}

		public PropertyList build() {
			PropertyList propertyList = new PropertyList(hasCharger, hasProjector, hasWhiteboard, hasTVScreen, tables, maxOccup, desc);
			return propertyList;
		}
	}

	/* Attributes:
	private boolean hasCharger;
	private boolean hasProjector;
	private boolean hasWhiteboard;
	private boolean hasTVScreen;
	private int tables;
	private int maxOccup;
	private String descr;
	 */
	/* EXAMPLE CODE FROM COMP PHYS:
	private float mass;
	private float momeInert;
	private float dragCo;
	private float frontArea;
	private float size;
	private float dayLength;
	private float rotAngle;
	private float charge;


	protected PropertyList() {
	}

	public float getMass() {
		return mass;
	}

	public float getRotAngle() { return rotAngle;}

	public float getMomeInert() {
		return momeInert;
	}

	public float getDragCo() {
		return dragCo;
	}

	public float getFrontArea() { return frontArea;}

	public void setMass(float mass) {
		this.mass = mass;
	}

	public void setMomeInert(float momeInert) {
		this.momeInert = momeInert;
	}

	public void setDragCo(float dragCo) {
		this.dragCo = dragCo;
	}

	public void setFrontArea(float frontArea) { this.frontArea = frontArea;}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public float getDayLength() {
		return dayLength;
	}

	public void setDayLength(float dayLength) {
		this.dayLength = dayLength;
	}

	public void setRotAngle(float rotAngle) {
		this.rotAngle = rotAngle;
	}

	public void setCharge(float charge) {
		this.charge = charge;
	}

	public float getCharge() {
		return charge;
	}

	public static class PropertyListBuilder {
		private float mass;
		private float momeInert;
		private float dragCo;
		private float frontArea;
		private float size;
		private float dayLength;
		private float rotAngle;
		private float charge;

		protected PropertyListBuilder() {
		}

		public static PropertyListBuilder aPropertyList() {
			return new PropertyListBuilder();
		}

		public PropertyListBuilder withMass(float mass) {
			this.mass = mass;
			return this;
		}

		public PropertyListBuilder withMomeInert(float momInert) {
			this.momeInert = momInert;
			return this;
		}

		public PropertyListBuilder withDragCo(float dragCo) {
			this.dragCo = dragCo;
			return this;
		}

		public PropertyListBuilder withFrontArea(float frontArea) {
			this.frontArea = frontArea;
			return this;
		}

		public PropertyListBuilder withSize(float size) {
			this.size = size;
			return this;
		}

		public PropertyListBuilder withDayLength(float dayLength) {
			this.dayLength = dayLength;
			return this;
		}

		public PropertyListBuilder withRotAngle(float rotAngle) {
			this.rotAngle = rotAngle;
			return this;
		}

		public PropertyListBuilder withCharge(float charge) {
			this.charge = charge;
			return this;
		}

		public PropertyList build() {
			PropertyList propertyList = new PropertyList();
			propertyList.setMass(mass);
			propertyList.setMomeInert(momeInert);
			propertyList.setDragCo(dragCo);
			propertyList.setDayLength(dayLength);
			propertyList.setFrontArea(frontArea);
			propertyList.setRotAngle(rotAngle);
			propertyList.setSize(size);
			propertyList.setCharge(charge);
			return propertyList;
		}
	}

	public String toString() {
		return "";
	}
*/
}
