import javax.swing.JOptionPane;

public class AgeCalculationUsingSubstringAndCalculationCorrect {

	public static void main(String[] args) {
		while(true)
		{
		//input birthday
		//String birthdate = JOptionPane.showInputDialog("Enter your birthday (MM/DD/YYYY):");
		String birthdate = "06/22/1999";
		//String birthdate = "12/22/1999";
		//String birthdate = "01/02/1999";	
		
		//input today's date
		String currentdate = JOptionPane.showInputDialog("Enter today's date (MM/DD/YYYY):");

		
		//pull out month day year and parse into integers
		int bmo = Integer.parseInt(birthdate.substring(0,2));
		int bday = Integer.parseInt(birthdate.substring(3,5));
		int byear = Integer.parseInt(birthdate.substring(6,10));
		int cmo = Integer.parseInt(currentdate.substring(0,2));
		int cday = Integer.parseInt(currentdate.substring(3,5));
		int cyear = Integer.parseInt(currentdate.substring(6,10));
		System.out.println("Birth:"+bmo+""+bday+""+byear+"Today:"+cmo+""+cday+""+cyear);		
		
		//calculate years and months
		int ageYears = cyear - byear;
		int ageMonths = 0;
		if (cmo ==bmo && cday < bday) {ageYears--; ageMonths = 11;}
		if (cmo==bmo && cday >= bday) {ageMonths = 0;}
		if (cmo>bmo && cday >= bday) {ageMonths = Math.abs((bmo-12) + cmo);}
		if (cmo>bmo && cday < bday) {ageMonths = Math.abs((bmo-12) + cmo-1);}
		if (cmo<bmo && cday < bday) {ageYears--;ageMonths = (12-bmo) + cmo-1;}
		if (cmo<bmo && cday >= bday) {ageYears--;ageMonths = (12-bmo) + cmo;}
	
		//output age
		JOptionPane.showMessageDialog(null, "You are " + ageYears + " years and " + ageMonths + " month(s) old.");
	}
	}

}
