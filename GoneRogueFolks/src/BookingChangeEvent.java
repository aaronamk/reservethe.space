public class BookingChangeEvent {
	private Booking source;
	private String valueChanged;
	private Object oldValue;
	private Object newValue;

	public BookingChangeEvent(Booking source, String valueChanged, Object oldValue, Object newValue) {
		this.source = source;
		this.valueChanged = valueChanged;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}

	public Booking getSource() {
		return source;
	}

	public String getValueChanged() {
		return valueChanged;
	}

	public Object getOldValue() {
		return oldValue;
	}

	public Object getNewValue() {
		return newValue;
	}
}
