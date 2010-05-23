package end2end;

import nl.evg.timetracker.Main;

import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.driver.JLabelDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;
import static org.hamcrest.core.IsEqual.*;

public class TimeTrackerDriver extends JFrameDriver {

	public TimeTrackerDriver()
	{
		super(new GesturePerformer(),
		      JFrameDriver.topLevelFrame(named(Main.MAIN_WINDOW_NAME), 
		    		                     showingOnScreen()), 
		      new AWTEventQueueProber(1000, 100));
	}

	public void showsHoursForTask(String taskName, int i) {
		new JLabelDriver(this, named(Main.HOURS_FIELD_NAME)).hasText(equalTo(""+i));
	}
}
