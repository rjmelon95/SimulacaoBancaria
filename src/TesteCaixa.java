
public class TesteCaixa {
	
	public static void main(String [] args) {
		
		Cliente C1 = new Cliente();
		
	System.out.println("-----DADOS BANCÁRIOS-----\n");

	  C1.setNome_Cliente("José Alberto Silva");
	  System.out.println("Nome: " + C1.getNome_Cliente());
	  
	  C1.setEndereço_Cliente("Rua Dom Pedro, 558 -> Boa viagem- Recife/PE");
	  System.out.println("Endereço: " + C1.getEndereço_Cliente());
	  
	  C1.setTelefone_Cliente("98788-7874");
	  System.out.println("Telefone: " + C1.getTelefone_Cliente());
	  

	  C1.setNome_Agencia(" Santander");
	  System.out.println( "Agência" + C1.getNome_Agencia());

	  C1.setCod_Agencia("033");
	  System.out.println("Código agência: "+ C1.getCod_Agencia());
	  
	  C1.setConta_Cliente("012345678901");
	  System.out.println("Conta: "+ C1.getConta_Cliente());
	  
	  C1.setSaldo_Cliente(1500);
	  System.out.println("Saldo em conta: "+ C1.getSaldo_Cliente());


	  C1.sacar(500);

	  C1.depositar(36);
	  
	  System.out.println("-----------------------");


		
	}

}
