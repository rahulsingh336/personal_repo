package com.example.order.processing.dto;

import com.example.order.processing.ProductType;
import java.util.Arrays;
import static com.example.order.processing.ProductType.*;

public class OrderRequest {

	private ProductType productType;

	public OrderRequest(ProductType productType) {
		this.productType = productType;
	}



	public boolean isPhysicalProduct() {
		return productType.getShortCode().equalsIgnoreCase(PHYSICAL.getShortCode());
	}

	public boolean isUnKnownProductType() {
		return Arrays.stream(values())
				.noneMatch(pt -> pt.getShortCode().equalsIgnoreCase(productType.getShortCode()));
	}

	public boolean isBookProductType() {
		return productType.getShortCode().equalsIgnoreCase(BOOK.getShortCode());
	}

	public boolean isMemberShipOrUpGrade() {
		return productType.getShortCode().equalsIgnoreCase(MEMBERSHIP_OR_UPGRADE.getShortCode());
	}

	public boolean isMemberShipProductType() {
		return productType.getShortCode().equalsIgnoreCase(MEMBERSHIP.getShortCode());
	}

	public boolean isPhysicalOrBookProductType() {
		return productType.getShortCode().equalsIgnoreCase(PHYSICAL_OR_BOOK.getShortCode());
	}

	public boolean isUpgradeProductType() {
		return productType.getShortCode().equalsIgnoreCase(UPGRADE.getShortCode());
	}

	public boolean isVideoProductType() {
		return productType.getShortCode().equalsIgnoreCase(VIDEO.getShortCode());
	}

	public boolean isProductTypeValid() {
		return productType == null;
	}
}
