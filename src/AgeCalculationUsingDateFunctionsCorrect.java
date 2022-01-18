
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class AgeCalculationUsingDateFunctionsCorrect {

	public static void main(String[] args) {
		
		//input birthday
		String bdayStr = JOptionPane.showInputDialog("Enter your birthday (MM/DD/YYYY):");
		
		//input today's date
		String todayStr = JOptionPane.showInputDialog("Enter today's date (MM/DD/YYYY):");
		
		//convert from Strings to LocalDates
		LocalDate bdayLD = LocalDate.parse(bdayStr, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		LocalDate todayLD = LocalDate.parse(todayStr, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		
		//calculate period between birthday and today
		Period p = Period.between(bdayLD, todayLD);
		
		//output age
		JOptionPane.showMessageDialog(null, "You are " + p.getYears() + " years and " + p.getMonths() + " month(s) old.");
	}
}