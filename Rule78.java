
public class Rule78 {

	public static void main(String[] args) {
		System.out.println(getInterestPortions(12));
		System.out.println(getInterestPortions(24));
		System.out.println(getInterestPortions(36));
	}
	static int getInterestPortions(int months) {
		int total =0;
		for(int i=1;i<=months;i++) {
			total +=i;
		}
		return total;
	}
}
