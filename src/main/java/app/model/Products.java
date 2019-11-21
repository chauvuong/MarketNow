package app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "products")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	(strategy = GenerationType.AUTO)
	
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "unit")
	private String unit;

	@Column(name = "sku")
	private String sku;

	@Column(name = "price")
	private Double price;
	
	@Column(name = "stock")
	private int stock;

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
//	private List<OrderItems> orderItems;
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
//	private List<ProductImages> productImages;
//	
//	@ManyToOne
//	@JoinColumn(name = "shop_id", nullable = false)
//	private Shops shops;
//	
//	@ManyToOne
//	@JoinColumn(name = "brand_id", nullable = false)
//	private Brands brands;
	
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private Categories categories;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

//	public List<OrderItems> getOrderItems() {
//		return orderItems;
//	}
//
//	public void setOrderItems(List<OrderItems> orderItems) {
//		this.orderItems = orderItems;
//	}
//
//	public List<ProductImages> getProductImages() {
//		return productImages;
//	}
//
//	public void setProductImages(List<ProductImages> productImages) {
//		this.productImages = productImages;
//	}
//
//	public Shops getShops() {
//		return shops;
//	}
//
//	public void setShops(Shops shops) {
//		this.shops = shops;
//	}
//
//	public Brands getBrands() {
//		return brands;
//	}
//
//	public void setBrands(Brands brands) {
//		this.brands = brands;
//	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	
	
	

}
