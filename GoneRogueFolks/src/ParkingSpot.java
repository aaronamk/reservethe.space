public class ParkingSpot extends Resource {
	public ParkingSpot(String identifier, boolean hasCharger, String desc) {
		this.attributes = PropertyList.PropertyListBuilder.aPropertyList(hasCharger, false, false, false, 0, 1, desc).build();
		this.setIdentifier(identifier);
		this.setAvailable(true);
	}
}
