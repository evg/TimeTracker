package nl.evg.timetracker;

import java.io.PrintWriter;

public class Spending {
	
	public static Spending hoursOn(String taskName, int nofHours) {
		return new Spending(taskName,nofHours);
	}
	
	private Spending(String taskName, int nofHours)
	{
		this.taskName = taskName;
		this.nofHours = nofHours;
	}

	public void printOn(PrintWriter writer) {
		writer.print(taskName+SEP+nofHours);
		
	}

	public final String taskName;
	public final int nofHours;

	private static final String SEP = "\t";
}
