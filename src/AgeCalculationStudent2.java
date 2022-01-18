import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class AgeCalculationStudent2 {
	public static void main(String[] args) {
		// declares the formatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		// LocalDate inputs todays date
		LocalDate todaysDate = LocalDate.now();
		String nowFormat = todaysDate.format(formatter);

		// Ask the user to enter birthday
		String birthdayEnter = JOptionPane.showInputDialog("Enter your birthday (MM/DD/YYYY):");


		// Makes inputs in the format of d/m/yyy as LocalDate obj's
		String todayEnter = JOptionPane.showInputDialog("Enter today's date (MM/DD/YYYY):");
		LocalDate today = LocalDate.parse(nowFormat, formatter);
		LocalDate bday = LocalDate.parse(birthdayEnter, formatter);

		Period p = Period.between(bday, today);
		System.out.println("You are " + p.getYears() + " years, " + p.getMonths() + " and  months ");
	}
}
