package Compra;

public class Caixa {

	public static void main (String[] args) {
		

		Alimentos banana = new Alimentos(1f); 
		 
		 banana.setBanana(0);
		 banana.setPrecoFinal();
		 
		 Compra c = new Compra(7.99f, 7.99f, false, false); //Cash
		 c.PagarComDinheiro();	
		 c.setNome("Maria");
		 c.setCpf(1234567899);
		 c.setIdade(55);
		 c.RecebeNotaFiscal();
		 
		 Compra c1 = new Compra(7.99f, 10, false, false); //Cash#1
		 c1.PagarComDinheiro();	
		 c1.setNome("Joana");
		 c1.setCpf(1234567899);
		 c1.setIdade(55);	
		 
		 Compra c2 = new Compra(7.99f, 5, false, false); //Cash#2
		 c2.PagarComDinheiro();	
		 c2.setNome("Sonia");
		 c2.setCpf(1234567899);
		 c2.setIdade(55);
		
		 
		
		 Alimentos pao = new Alimentos(0.500f); 
		 pao.setPao(0);
		 pao.setPrecoFinal();
		
		 Compra c3 = new Compra(8.49f, 0, true, true); //Card 
		 c3.PagarComCartao();
		 c3.setNome("Paulo");
		 c3.setCpf(1112223334);
		 c3.setIdade(27);
		 c3.RecebeNotaFiscal();
		 
		 Compra c4 = new Compra(8.49f, 0, false, false); //Card#1
		 c4.PagarComCartao();
		 
		 Compra c5 = new Compra(8.49f, 0, true, false); //Card#2
		 c5.PagarComCartao();
		 
		 
	}

	
}
