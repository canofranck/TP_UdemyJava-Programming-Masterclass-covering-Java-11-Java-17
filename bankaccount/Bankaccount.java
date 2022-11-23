/**
 * 
 */
package bankaccount;



/**
 * @author franck
 *
 */
public class Bankaccount {

	/**
	 * @param args
	 */

		private String name;
		private String email;
		private String phoneNumber;
		private int accountNumber;
		private double  accountBalance;
		
		
		/** Constructor **/
		/**
		 * @param name
		 * @param email
		 * @param phoneNumber
		 * @param accountNumber
		 * @param accountBalance
		 */
		public Bankaccount(String name, String email, String phoneNumber, int accountNumber, int accountBalance) {
			super();
			this.name = name;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.accountNumber = accountNumber;
			this.accountBalance = accountBalance;
		}
		/** getter & setter **/
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}
		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}
		/**
		 * @return the phoneNumber
		 */
		public String getPhoneNumber() {
			return phoneNumber;
		}
		/**
		 * @param phoneNumber the phoneNumber to set
		 */
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		/**
		 * @return the accountNumber
		 */
		public int getAccountNumber() {
			return accountNumber;
		}
		/**
		 * @param accountNumber the accountNumber to set
		 */
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		/**
		 * @return the accountBalance
		 */
		public double getAccountBalance() {
			return accountBalance;
		}
		/**
		 * @param accountBalance the accountBalance to set
		 */
		public void setAccountBalance(int accountBalance) {
			this.accountBalance = accountBalance;
		}
		/** Methode **/
		
		public  void DepositingFunds(double depositfunds)
		{
		
			accountBalance=accountBalance+depositfunds;
		System.out.println("Vous avez deposez :"+depositfunds+"  Votre solde est maintenant de "+accountBalance);
			
		}
		public void WithDrawingFunds(double drawingfunds)
		{
			if (accountBalance<0)
				System.out.println("vous n avez pas les fonds pour faire un tel depot");
				else
			{ 
				accountBalance=accountBalance-drawingfunds;
					System.out.println("vous avez retiré :"+drawingfunds+" votre solde est de :"+accountBalance);
			}
			
		}
	
	}


