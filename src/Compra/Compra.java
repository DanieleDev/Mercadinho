package Compra;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Compra extends NotaCliente {
	
	private float totalCompra;
	private float pagamento;
	private boolean cartao;
	private boolean aprovado; 
	private float dinheiro;
	
	public Compra(float totalCompra, float pagamento, boolean cartao, boolean aprovado) {
		super();
		this.totalCompra = totalCompra;
		this.pagamento = pagamento;
		this.cartao = cartao;
		this.aprovado = aprovado;
	}
	
	public void RecebeNotaFiscal() {
		System.out.println("Informações de nota fiscal: " + toString());
		System.out.println(" ");
	}
	

	public void PagarComCartao() {
				 
		 if ((getCartao() == true) && (this.getAprovado() == true)){
			 System.out.println("Crédito ou Débito?");
			 Scanner Scan = new Scanner(System.in);
			 String modalidade1 = Scan.nextLine();
			 
			 System.out.println("insira ou aproxime o cartão de " + modalidade1);
			 System.out.println("Obrigado e volte Sempre!");
			 Scan.close();
		 }
		 else if (getCartao() == false){ // Escolhe uma outra forma de pagamento ao invés de cartão.
			 System.out.println("Por favor, escolha outra forma de pagamento" + "\n"); 
		 }
		 else {
			 System.out.println("Crédito ou Débito?");
			 System.out.println("insira ou aproxime o cartão");
			 System.out.println("Cartão não aprovado!");	

		 }
	}
	
	public void PagarComDinheiro() {
		
		DecimalFormat dFormat = new DecimalFormat("###.##");
		double troco;
		double valorFaltante;
		
		if(totalCompra < pagamento) {
			/*  Verifica se o pagamento é maior que o valor total da compra e,
			 *  caso tenha sido dado um valor a mais, é exibida uma mensagem que 
			 *  mostral qual o troco a ser dado.  
			 */
			troco = (double) (pagamento - totalCompra);  
		   	System.out.println("Receber troco de R$ " + dFormat.format(troco) );
		   	System.out.println("Obrigado e volte sempre!" + "\n");
		}
		else if (totalCompra > pagamento) { 
			/*
			 * Verifica se o pagamento é menor do que o valor total da compra e,
			 * no caso de haver valor pendente, mostra mensagem que infomal qual 
			 * o valor faltante.
			 */
			valorFaltante = (double) (totalCompra - pagamento);
		  	System.out.println("Está faltando: R$ " + dFormat.format(valorFaltante));
		}
		else {
		  System.out.println("Obrigado e volte sempre!");
		}
	}
	
	public float getTotalCompra() {
		return totalCompra;
	}
	public void setTotalCompra(float totalCompra) {
		this.totalCompra = totalCompra;
	}
	
	public float getPagamento() {
		return pagamento;
	}
	public void setPagamento(float pagamento) {
		this.pagamento = pagamento;
	}

	public boolean getCartao() {
		return cartao;
	}
	public void setCartao(boolean cartao) {
		this.cartao = cartao;
	}
	
	public boolean getAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public float getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(float dinheiro) {
		this.dinheiro = dinheiro;
	}


	
	
	
}
