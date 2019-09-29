public class Room extends Resource {
	public Room(String identifier, boolean hasProjector, boolean hasWhiteboard, boolean hasTVScreen, int tables, int maxOccup, String desc) {
		this.attributes = PropertyList.PropertyListBuilder.aPropertyList(false, hasProjector, hasWhiteboard, hasTVScreen, tables, maxOccup, desc).build();
		this.setIdentifier(identifier);
		this.setAvailable(true);
	}
}
