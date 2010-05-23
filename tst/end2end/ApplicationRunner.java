package end2end;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import nl.evg.timetracker.Main;
import nl.evg.timetracker.Spending;



public class ApplicationRunner {

	public void init() throws IOException {
		file = File.createTempFile("tmp", ".txt");
	}
	
	public void startGUI() throws IOException {
		Thread thread = new Thread("Test app"){
			public void run() 
			{
				try {
					Main.main(new String[]{file.getAbsolutePath()});
				} catch (IOException e) {
					e.printStackTrace();
				}
			};
		};
		thread.setDaemon(true);
		thread.start();
		driver = new TimeTrackerDriver();
	}
	
	public void stopGUI()
	{
		if (driver!=null)
			driver.dispose();
	}

	public void showsHoursForTask(String taskName, int i) {
		driver.showsHoursForTask(taskName, i);
	}

	public void hasRegistered(Spending timeOnTask) throws IOException {
		PrintWriter writer = new PrintWriter(new FileWriter(file));
		timeOnTask.printOn(writer);
		writer.flush();
		writer.close();
	}

	private File file;
	private TimeTrackerDriver driver;
}
