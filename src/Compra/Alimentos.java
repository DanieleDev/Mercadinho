package Compra;

import java.text.DecimalFormat;

public class Alimentos {

	private float kilo;
	private float valorKilo;
	private float peso;
	private double precoFinal;
	private double banana;
	private double pao;
	
	public Alimentos(float peso) {
		this.peso = peso;
	}
	  
	public float getKilo() {
		return kilo;
	}
	public void setKilo(float kilo) {
		this.kilo = 1;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = kilo;
	}
	public double getPrecoFinal() {
		return precoFinal;
	}
	public void setPrecoFinal() {
		/* Calcula o preço final de um produto 
		 * pelo seu peso em produtos que o valor é dado por quilograma.
		 *  Por exemplo, o pão que custa R$16,99 o kg
		 */
		DecimalFormat df = new DecimalFormat("###.##");
		this.precoFinal = valorKilo * peso;
		System.out.println("Seu preço final é: " + df.format(getPrecoFinal())+ "\n");
	}
	
	public float getValorKilo() {
     	return valorKilo;
	}
	public void setValorKilo(float valorKilo) {
		this.valorKilo = valorKilo;
	}
	
	public double getBanana() {
		return banana;
	}

	public void setBanana(double banana) {
		setValorKilo(7.99f);
		this.banana = banana;
	}
	
	 public double getPao() {
		 return pao;
	 }
	 public void setPao(double pao) {
		 setValorKilo(16.99f);
		 this.pao = pao;
	 }
	
	
}
