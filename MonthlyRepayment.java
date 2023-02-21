
public class MonthlyRepayment {

	public static void main(String[] args) {
		displayRepayments(20000, 24, 1.0, 0.255);
	}
	
	static void displayRepayments(int principle, int months, double fee, double interestRate) {
		double totalPrinciple = principle + (principle* fee/100 * (months/12));
		double interest = totalPrinciple*interestRate/100*months;
		double totalPrincipleAndInterest = totalPrinciple+interest;
		double monthly= totalPrincipleAndInterest/months;
		int portions = Rule78.getInterestPortions(months);
		System.out.println("Installment No.\tPayment Amount(HK$)\tPrincipal(HK$)\tInterest(HK$)");
		for(int i=1;i<=months;i++) {
			double monthlyInterest = interest*(months+1-i)/portions;
			monthlyInterest = Math.round(monthlyInterest * 100.0) / 100.0;
			double monthlyPrinciple = monthly-monthlyInterest;
			System.out.println(i+"\t\t"+monthly+"\t\t\t"+String.format("%.2f",monthlyPrinciple)+"\t\t"+String.format("%.2f",monthlyInterest));
		}
		System.out.println("Total\t\t"+String.format("%.2f",totalPrincipleAndInterest)+"\t\t"+String.format("%.2f",totalPrinciple)+"\t"+String.format("%.2f",interest));
	}

}
