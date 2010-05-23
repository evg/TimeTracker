package nl.evg.timetracker;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;



public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final String SPENDINGS_TABLE_NAME = "spendingsTable";
	private final SpendingsTableModel spendingsTableModel = new SpendingsTableModel();

	public MainWindow() {
		setName(Main.MAIN_WINDOW_NAME);
		fillContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void fillContentPane() {
		final Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(new JScrollPane(createSpendingsTable()), BorderLayout.CENTER);
	}

	private JTable createSpendingsTable() {
		final JTable spendingsTable = new JTable(spendingsTableModel);
		spendingsTable.setName(SPENDINGS_TABLE_NAME);
		return spendingsTable;
	}

	public void setHours(int hours) {
		spendingsTableModel.setHours(hours);
	}

}
