package com.example.order.processing.rules.impl;

import com.example.order.processing.ProductType;
import com.example.order.processing.dto.OrderRequest;
import com.example.order.processing.dto.OrderResponse;
import com.example.order.processing.rules.AbstractRule;

public class PhysicalOrBookProductRule extends AbstractRule {

	@Override
	public OrderResponse process(OrderRequest orderRequest) {
		if(orderRequest.isPhysicalOrBookProductType()){
			//Do Processing Here for PHYSICAL_OR_BOOK Product Rule
			OrderResponse orderResponse = new OrderResponse();
			orderResponse.setProductType(ProductType.PHYSICAL_OR_BOOK);
			orderResponse.setStatus(Boolean.TRUE);
			return orderResponse;
		}
		return applyNextRuleIfExist(orderRequest);
	}

	@Override
	public int order() {
		return 4;
	}
}
