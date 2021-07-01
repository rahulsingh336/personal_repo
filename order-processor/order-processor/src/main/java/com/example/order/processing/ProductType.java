package com.example.order.processing;

public enum ProductType {

	PHYSICAL ("1"),
	BOOK ("2"),
	MEMBERSHIP ("3"),
	UPGRADE ("4"),
	MEMBERSHIP_OR_UPGRADE ("5"),
	VIDEO ("6"),
	PHYSICAL_OR_BOOK("7")
	;

	private final String shortCode;

	ProductType(String code) {
		this.shortCode = code;
	}

	public String getShortCode() {
		return this.shortCode;
	}

}
