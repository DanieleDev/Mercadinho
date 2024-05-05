package Compra;

public class Cliente extends Pessoa {
	

	private float totCompra;
	private float pagamento;
	private boolean cartao;
	private boolean aprovado; 
	private float dinheiro;
	

	public Cliente(float totCompra, float pagamento, boolean cartao, boolean aprovado) {
		super();
		this.totCompra = totCompra;
		this.pagamento = pagamento;
		this.cartao = cartao;
		this.aprovado = aprovado;
	}
	
	public void RecebeNotaFiscal() {
		System.out.println("Informações de nota fiscal: " + toString());
		System.out.println(" ");
	}

	public void PagarComCartao() {
		if (getCartao() == true) {
			  System.out.println("Crédito ou Débito?");
		}else {
			System.out.println("Pagar com dinheiro");
		}
		
		if (getAprovado() == true) {
			System.out.println("Obrigada pela compra!");
		}else {
			System.out.println("Cartão recusado!");
		}
	
	}
	
	public void PagarComDinheiro() {
		int troco;
		int valorFaltante;
	  if(totCompra < pagamento) {
		   troco = (int) (pagamento - totCompra);  
		   	System.out.println("Receber troco de R$ " + troco);
		   	System.out.println("Obrigada e volte sempre!");
	  }else if (totCompra > pagamento) {
		  valorFaltante = (int) (totCompra - pagamento);
		  	System.out.println("Está faltando: R$ " + valorFaltante);
	  }else {
		  System.out.println("Obrigado e volte sempre!");
	  }
	  
	}
	
	public float getTotCompra() {
		return totCompra;
	}
	public void setTotCompra(float totCompra) {
		this.totCompra = totCompra;
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
