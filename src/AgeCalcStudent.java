import javax.swing.JOptionPane;
public class AgeCalcStudent {

	public static void main(String[] args) {
		//get the dates
		String bDay = JOptionPane.showInputDialog("Enter your bithday (MM/DD/YYYY)");
		String subYear = bDay.substring(6, 10);
		String subMonth = bDay.substring(0, 2);
		String subDay = bDay.substring(3, 5);
		System.out.println("Year: "+subYear+ " Month: "+subMonth+ " Day: " +subDay);
		
		String toDay = JOptionPane.showInputDialog("Enter today's date (MM/DD/YYYY)");
		String subYearC = toDay.substring(6, 10);
		String subMonthC = toDay.substring(0, 2);
		String subDayC = toDay.substring(3, 5);
		System.out.println("Year: "+subYearC+ " Month: "+subMonthC+ " Day: " +subDayC);
		
		//parsInt 
		int intYear = Integer.parseInt(subYear);
		int intYearC = Integer.parseInt(subYearC);
		int intMonth = Integer.parseInt(subMonth);
		int intMonthC = Integer.parseInt(subMonthC);
		int intDay = Integer.parseInt(subDay);
		int intDayC = Integer.parseInt(subDayC);

		
		
		//diffrence
		int YearsDiff = (intYearC - intYear);
		int MonthDiff = (intMonthC - intMonth);
	
		{ 
		}
		int DayDiff = (intDayC - intDay);
		
		if (intMonth>intMonthC)
		{
			//YearsDiff --;
			YearsDiff = YearsDiff -1;
		}if (intDay>intDayC)
		{
			
			MonthDiff= MonthDiff -1;
		}
		if (intMonthC ==intMonth && intDayC < intDay) {YearsDiff--; MonthDiff = 11;}
		if (intMonthC==intMonth && intDayC >= intDay) {MonthDiff = 0;}
		if (intMonthC>intMonth && intDayC >= intDay) {MonthDiff = Math.abs((intMonth-12) + intMonthC);}
		if (intMonthC>intMonth && intDayC < intDay) {MonthDiff = Math.abs((intMonth-12) + intMonthC-1);}
		if (intMonthC<intMonth && intDayC < intDay) {YearsDiff--;MonthDiff = (12-intMonth) + intMonthC-1;}
		if (intMonthC<intMonth && intDayC >= intDay) {YearsDiff--;MonthDiff = (12-intMonth) + intMonthC;}
		Math.abs(MonthDiff);
		Math.abs(DayDiff);
		JOptionPane.showMessageDialog(null, "You are "+(YearsDiff)+ " years and "+(MonthDiff)+ " months old");

		}
	}

