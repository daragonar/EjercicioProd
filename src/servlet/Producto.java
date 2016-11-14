package servlet;

public class Producto {

	protected String prodName;
	protected String prodImg;
	protected String prodDesc;
	public Producto()
	{}
	public Producto(String prodName, String prodImg, String prodDesc) {
		super();
		this.prodName = prodName;
		this.prodImg = prodImg;
		this.prodDesc = prodDesc;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdImg() {
		return prodImg;
	}
	public void setProdImg(String prodImg) {
		this.prodImg = prodImg;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
}
