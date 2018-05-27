package modelo;

import modelo.a.*;
import modelo.b.*;

public class TestaConta{
		public static void main(String[] args){
				//Não compila, pq chama o metodo de conta, pq em tempo de compilação
				Conta conta = new ContaFisica();
				//conta.fecha();
				
				//Não compila por conta do acesso
				ContaFisica contaFisica = new ContaFisica();
				//contaFisica.fecha();
				
				Conta conta1= contaFisica; 
				
				//Isso tambem não compila, mes que eu tenhac criado a conta com um objeto de conta fisica
				ContaFisica = conta;
		}
}