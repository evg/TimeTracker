package nl.evg.timetracker;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private final JLabel hourLabel = new JLabel();

	public MainWindow() {
		setName(Main.MAIN_WINDOW_NAME);
		hourLabel.setName(Main.HOURS_FIELD_NAME);
		add(hourLabel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void setHours(int hours) {
		hourLabel.setText(""+hours);
	}

}
