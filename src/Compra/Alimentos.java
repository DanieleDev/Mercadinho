package Compra;

public class Alimentos {

	private float kilo;
	private float valorKilo;
	private float peso;
	private float precoFinal;
	
	public Alimentos(float peso, float valorKilo) {
		this.peso = peso;
		this.valorKilo = valorKilo;
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
	public float getPrecoFinal() {
		return precoFinal;
	}
	public void setPrecoFinal() {
		this.precoFinal = valorKilo * peso;
		System.out.println("Seu preço final é: " + this.precoFinal);
	}
	
	public float getValorKilo() {
     	return valorKilo;
	}
	public void setValorKilo(float valorKilo) {
		this.valorKilo = valorKilo;
	}
	
}
