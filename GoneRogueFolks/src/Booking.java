import java.util.ArrayList;
import java.util.Date;

public class Booking {
	private Person person;
	private Resource resource;
	private Date startTime;
	private Date endTime;
	private Date bookedAt;
	private ArrayList<BookingChangeListener> waitlist;

	public Booking(Person person, Resource resource, Date startTime, Date endTime) {
		this.person = person;
		this.resource = resource;
		this.startTime = startTime;
		this.endTime = endTime;
		this.bookedAt = new Date();
	}

	public Person getPerson() {
		return person;
	}

	public Resource getResource() {
		return resource;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void changeStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void changeEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getBookedAt() {
		return bookedAt;
	}

	public boolean conflicts(Booking booking) {
		return ((this.getResource() == booking.getResource()) && ((booking.getEndTime().after(this.getStartTime()) || (booking.getStartTime().before(this.getEndTime())))));
	}

	public ArrayList<BookingChangeListener> getWaitlist() {
		return waitlist;
	}

	public void addToWaitlist(BookingChangeListener listener) {
		waitlist.add(listener);
	}

	public void removeFromWaitlist(BookingChangeListener listener) {
		waitlist.remove(listener);
	}

}
