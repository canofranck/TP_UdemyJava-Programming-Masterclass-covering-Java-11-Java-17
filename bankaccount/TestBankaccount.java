package bankaccount;

public class TestBankaccount {

	

	public static void main(String[] args)
	
	{
		Bankaccount compte1 = new Bankaccount("test","test@free.fr","0160225050",123456,5000);
		
		compte1.DepositingFunds(500);
		compte1.WithDrawingFunds(200);
		compte1.setName("c moiiiiii");
		System.out.println("solde de votre compte"+compte1.getAccountBalance());
		System.out.println("adresse email du compte "+compte1.getEmail());
		
	}

	

	
}
