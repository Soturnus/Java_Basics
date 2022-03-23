package entities;

public class importedProduct extends Product{
	
	private Double customFee;

	public importedProduct() {
		super();
	}
	
	public importedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	public double totalPrice() {
		return super.price + customFee;
	}
	@Override
	public String priceTag() {
		return name + " $ " +  totalPrice() + " (Customs Free: $" + String.format("%.2f", customFee) + ") "; 
	}
	
}
