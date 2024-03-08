package com.app.request;

import java.util.HashSet;
import java.util.Set;

import com.app.modal.Category;
import com.app.modal.Size;



public class CreateProductRequest {
	
    private String title;

    private String description;

    private int price;

   

    private int quantity;

    private String brand;

    private String color;

    private Set<Size> size=new HashSet<>();

    private String imageUrl;

//    private String topLavelCategory;
//    private String secondLavelCategory;
//    private String thirdLavelCategory;

	public Set<Size> getSize() {
		return size;
	}
	public void setSize(Set<Size> size) {
		this.size = size;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}



	
    
    
}
