package end2end;

import java.io.IOException;


import nl.evg.timetracker.Spending;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TimeTrackerEnd2EndTest {

	@Test public void trackerDisplaysHoursWorked() throws IOException
	{
		application.hasRegistered(Spending.hoursOn("A",5));
		application.startGUI();
		application.showsHoursForTask("A",5);
	}
	
	@Before public void initApplication() throws IOException
	{
		application.init();
	}
	
	@After public void stopApplication()
	{
		application.stopGUI();
	}
	
	private final ApplicationRunner application = new ApplicationRunner();
}
