package com.example.order.processing.dto;

import com.example.order.processing.ProductType;

public class OrderResponse {

	private boolean status;
	private ProductType productType;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
}
