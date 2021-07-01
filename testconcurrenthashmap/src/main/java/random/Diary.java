package random;

public final class Diary {
	private static final ThreadLocal<Day> days =
			new ThreadLocal<Day>() {
				// Initialize to Monday
				protected Day initialValue() {
					return Day.MONDAY;
				}
			};

	private  Day currentDay() {
		return days.get();
	}

	public  void setDay(Day newDay) {
		days.set(newDay);
	}

	public void threadSpecificTask() {
		System.out.println(currentDay());
	}

	public void remove() {
		System.out.println(currentDay());
	}
}