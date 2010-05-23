package nl.evg.timetracker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SpendingStore {

	private String file;

	public SpendingStore(String file) {
		this.file = file;
	}

	public Spending getSpending() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = reader.readLine();
		reader.close();
		String[] tokens = line.split("\t");
		Spending spending = Spending.hoursOn(tokens[0], Integer.parseInt(tokens[1]));
		return spending;
	}

}
