import java.util.*;

public class Cliente extends Agencia{
	
	private String Nome_Cliente;
	private String Endereço_Cliente;
	private String Telefone_Cliente;
	private String Nome_Agencia;
	private String cod_Agencia;
	private String Conta_Cliente;
	private double Saldo_Cliente;
	private double Valor_Cheque;
     private int saque;

     
     
     

 	public String getNome_Cliente() {
 		return Nome_Cliente;
 	}


 	public void setNome_Cliente(String nome_Cliente) {
 		Nome_Cliente = nome_Cliente;
 	}


 	public String getEndereço_Cliente() {
 		return Endereço_Cliente;
 	}


 	public void setEndereço_Cliente(String endereço_Cliente) {
 		Endereço_Cliente = endereço_Cliente;
 	}


 	public String getTelefone_Cliente() {
 		return Telefone_Cliente;
 	}


 	public void setTelefone_Cliente(String telefone_Cliente) {
 		Telefone_Cliente = telefone_Cliente;
 	}


 	public String getNome_Agencia() {
 		return Nome_Agencia;
 	}


 	public void setNome_Agencia(String nome_Agencia) {
 		Nome_Agencia = nome_Agencia;
 	}


 	public String getCod_Agencia() {
 		return cod_Agencia;
 	}


 	public void setCod_Agencia(String cod_Agencia) {
 		this.cod_Agencia = cod_Agencia;
 	}


 	public String getConta_Cliente() {
 		return Conta_Cliente;
 	}


 	public void setConta_Cliente(String conta_Cliente) {
 		Conta_Cliente = conta_Cliente;
 	}


 	public double getSaldo_Cliente() {
 		return Saldo_Cliente;
 	}


 	public void setSaldo_Cliente(double saldo_Cliente) {
 		Saldo_Cliente = saldo_Cliente;
 	}


 	public double getValor_Cheque() {
 		return Valor_Cheque;
 	}


 	public void setValor_Cheque(double valor_Cheque) {
 		Valor_Cheque = valor_Cheque;
 	}

     
     
     
     
  

	
	void sacar(double valor) {
		
		if(Saldo_Cliente>=valor) {
		Saldo_Cliente -= valor;
		saque ++;
		System.out.println("Sacado:" + valor);
		
		System.out.println("Saldo Atual :" + Saldo_Cliente );	
		
		}else {
			System.out.println("Saldo insuficiente!");
			
			if(saque>Saldo_Cliente) {
				
				System.out.println("Você usou o cheque especial.");

				
				
			}

		}
		
		
				
	}
	
	
	void depositar(double valor) {
		
		Saldo_Cliente += valor;
		
		System.out.println("Depositado:" + valor);
		System.out.println("Novo Saldo:" + Saldo_Cliente);
	
		
	}


	
}
	
	

 
	

