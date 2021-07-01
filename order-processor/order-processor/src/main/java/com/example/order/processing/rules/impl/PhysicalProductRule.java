package com.example.order.processing.rules.impl;

import com.example.order.processing.ProductType;
import com.example.order.processing.dto.OrderRequest;
import com.example.order.processing.dto.OrderResponse;
import com.example.order.processing.rules.AbstractRule;

public class PhysicalProductRule extends AbstractRule {

	@Override
	public OrderResponse process(OrderRequest orderRequest) {
	 if(orderRequest.isPhysicalProduct()){
	 	//Do Processing Here for Physical Product Rule
		 OrderResponse orderResponse = new OrderResponse();
		 orderResponse.setProductType(ProductType.PHYSICAL);
		 orderResponse.setStatus(Boolean.TRUE);
		 return orderResponse;
	 }
	 return applyNextRuleIfExist(orderRequest);
	}

	@Override
	public int order() {
		return 1;
	}
}
