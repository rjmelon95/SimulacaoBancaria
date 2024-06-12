import java.util.*;

public class Agencia {
	
private String Nome_Agencia;
private String Endereco;
private int cod_Agencia;
private char Telefone;


private String getNome_Agencia() {
	return Nome_Agencia;
}
private void setNome_Agencia(String nome) {
	Nome_Agencia = nome;
}
private String getEndereco() {
	return Endereco;
}
private void setEndereco(String endereco) {
	Endereco = endereco;
}
private int getCod_Agencia() {
	return cod_Agencia;
}
private void setCod_Agencia(int cod_Agencia) {
	this.cod_Agencia = cod_Agencia;
}
private char getTelefone() {
	return Telefone;
}
private void setTelefone(char telefone) {
	Telefone = telefone;
}


}
