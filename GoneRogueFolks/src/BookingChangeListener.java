import java.util.EventListener;

public interface BookingChangeListener extends EventListener {
	public void notify(BookingChangeEvent BCE);
}
