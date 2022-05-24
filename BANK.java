package AssignmentWeek4.Day1;

public class BANK implements CIBIL{

	public void CibilScore() {
		System.out.println("Cibil Score");
		
	}

	public void MaximumLoanAmount() {
		System.out.println("Maximum Loan Amount");
		
	}

	public void CreditScore() {
		System.out.println("Credit Score");
		
	}

	public void MinimumBalance() {
		System.out.println("Minimum Balance");
	}
		
		public static void main(String[] args) {
			BANK obj= new BANK();
			obj.CibilScore();
			obj.MaximumLoanAmount();
			obj.CreditScore();
			obj.MinimumBalance();
	}




}




