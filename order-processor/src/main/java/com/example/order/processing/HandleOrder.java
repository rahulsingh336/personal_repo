package com.example.order.processing;

import com.example.order.processing.dto.OrderRequest;
import com.example.order.processing.dto.OrderResponse;
import com.example.order.processing.rules.factory.RuleChainFactory;

public class HandleOrder {

	public OrderResponse handleOrder(OrderRequest orderRequest){
		validateInput(orderRequest);
		return RuleChainFactory.getInstance().fireRules(orderRequest);
	}

	private void validateInput(OrderRequest orderRequest) {
		validateProductType(orderRequest);
		if(orderRequest.isUnKnownProductType()) {
			throw new RuntimeException("Product Type is not specified");
		}
	}

	private void validateProductType(OrderRequest orderRequest) {
		if (orderRequest.isProductTypeValid()) {
			throw new RuntimeException("Product Type is not specified");
		}
	}
}
