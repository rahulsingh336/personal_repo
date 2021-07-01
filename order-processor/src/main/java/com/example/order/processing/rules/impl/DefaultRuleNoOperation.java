package com.example.order.processing.rules.impl;

import com.example.order.processing.ProductType;
import com.example.order.processing.dto.OrderRequest;
import com.example.order.processing.dto.OrderResponse;
import com.example.order.processing.rules.AbstractRule;

public class DefaultRuleNoOperation extends AbstractRule {

	@Override
	public OrderResponse process(OrderRequest orderRequest) {
		//Reached End, No matching Rule Found
		OrderResponse orderResponse = new OrderResponse();
		orderResponse.setStatus(Boolean.FALSE);
 	  return orderResponse;
	}

	@Override
	public int order() {
		return 99;
	}
}
