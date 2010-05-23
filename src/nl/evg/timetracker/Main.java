package nl.evg.timetracker;

import java.io.IOException;

public class Main {

	public static final String MAIN_WINDOW_NAME = "TimeTracker";
	public static final String HOURS_FIELD_NAME = "Hours";

	public static void main(String[] args) throws IOException {
		MainWindow ui = new MainWindow();
		SpendingStore store = new SpendingStore(args[0]);
		Spending spending = store.getSpending();
		ui.setHours(spending.nofHours);

	}

}
