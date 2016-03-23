import java.util.Scanner;

public class MortgageModel {
	private double principal, interestRate, blendedMonthly,
				   totalInterest, totalBlended,intPriRatio,avgInterestYr, avgInterestMth, 
				   interestFactor;
	private int paymentFreq, compoundFreq, amortization;
	
	//Calculates the amount of the blended payment (principal + interest)
	public double calculateBlendedPayment(double principal, double interest, double compoundFreq, int paymentFreq, int amortization){
		this.calculateInterestFactor(interest, compoundFreq, paymentFreq, amortization);
		blendedMonthly = ((principal*this.interestFactor)/(1-(Math.pow((this.interestFactor + 1),-paymentFreq))));
		return blendedMonthly;
	}
	//Calculates the interest Factor using the interest rate, compounding frequency per year nad frequency of payments per year
	public double calculateInterestFactor(double interest, double compoundFreq, int paymentFreq, int amortization){
		interestFactor = Math.pow(((interest/compoundFreq)+ 1), (compoundFreq/(paymentFreq/amortization)))-1;
		return interestFactor;
	}
	
	public double getFactor(){
		return interestFactor;
	}
	public void setMortgageAmount(double mortgage){
		principal = mortgage;
	}
	
	public void setPaymentFrequency(int numPayments){
		paymentFreq = numPayments;
	}
	
	public void setInterestRate(double interest){
		interestRate = interest/100;
	}
	
	public void setAmortization(int amortization){
		this.amortization = amortization;
	}


public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your mortgage: ");
	double mortgage = input.nextDouble();
	
	System.out.println("Enter your interest rate: ");
	double interest = input.nextDouble();
	interest /= 100;
	
	System.out.println("Enter your payment Frequency ");
	int freq = input.nextInt();
	
	System.out.println("Enter your amortization: ");
	int amort = input.nextInt();
	
	System.out.println("Enter cmpd freq: ");
	int cmpd = input.nextInt();
	
	MortgageModel a1 = new MortgageModel();
	a1.calculateInterestFactor(interest,cmpd , freq, amort);
	double f = a1.getFactor();
	System.out.printf("Factor: %n%.6f%n", f);
	System.out.println(a1.calculateBlendedPayment(mortgage, interest, cmpd, freq, amort));
	
	
	
	
}
}