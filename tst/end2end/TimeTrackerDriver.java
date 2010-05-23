package end2end;

import static com.objogate.wl.swing.matcher.JLabelTextMatcher.withLabelText;
import static org.hamcrest.core.IsEqual.equalTo;
import nl.evg.timetracker.Main;

import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.driver.JTableDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;


public class TimeTrackerDriver extends JFrameDriver {

	@SuppressWarnings("unchecked")
	public TimeTrackerDriver()
	{
		super(new GesturePerformer(),
		      JFrameDriver.topLevelFrame(named(Main.MAIN_WINDOW_NAME), 
		    		                     showingOnScreen()), 
		      new AWTEventQueueProber(1000, 100));
	}

	public void showsHoursForTask(String taskName, int i) {
		new JTableDriver(this).hasCell(withLabelText(equalTo(""+i)));
	}
}
