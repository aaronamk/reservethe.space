public class Person implements BookingChangeListener{
	private String Name;
	private int priority;


	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public void notify(BookingChangeEvent BCE) {
		
	}
}
