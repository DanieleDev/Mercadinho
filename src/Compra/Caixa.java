package Compra;

public class Caixa {

	public static void main (String[] args) {
		
		 Alimentos pao = new Alimentos(0.500f, 16.00f);  
		 pao.setPrecoFinal();
		
		 Cliente c = new Cliente(8, 8, false, false); //Cash
		 c.PagarComDinheiro();	
		 c.setNome("Maria");
		 c.setCpf(1234567899);
		 c.setIdade(55);
		 c.RecebeNotaFiscal();
		 
		 Cliente c1 = new Cliente(8, 10, false, false); //Cash#1
		 c1.PagarComDinheiro();	
		 c1.setNome("Maria");
		 c1.setCpf(1234567899);
		 c1.setIdade(55);	
		 
		 Cliente c2 = new Cliente(8, 5, false, false); //Cash#2
		 c2.PagarComDinheiro();	
		 c2.setNome("Maria");
		 c2.setCpf(1234567899);
		 c2.setIdade(55);
		 c2.RecebeNotaFiscal();
		 
		
		 Alimentos banana = new Alimentos(2, 5.99f); 
		 banana.setPrecoFinal();
		
		 Cliente c3 = new Cliente(11.98f, 0, true, true); //Card
		 c3.PagarComCartao();
		 c3.setNome("Paulo");
		 c3.setCpf(1112223334);
		 c3.setIdade(27);
		 c3.RecebeNotaFiscal();
		 
		 Cliente c4 = new Cliente(11.98f, 0, true, false); //Card#1
		 c4.PagarComCartao();
		 
		 
		 Cliente c5 = new Cliente(11.98f, 0, false, false); //Card#2
		 c5.PagarComCartao();
		 
	}

	
}
