/**
 * 
 */
package it114.exercise9_7;

/**
 * @author roddy alvarado
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account acct1 = new Account();
		Account acct2 = new Account(1122, 20000, .045);
		System.out.println(acct2.widthdraw(2500));
		System.out.println(acct2.deposit(3000));
		System.out.println(acct2.getBalance());
		System.out.println("monthly interest on balance is " + acct2.getmonthlyInterest());
		System.out.println("monthly interest rate is " + acct2.getmonthlyInterestRate());
		

	}
}
