package com.example.order.processing.rules.impl;

import com.example.order.processing.ProductType;
import com.example.order.processing.dto.OrderRequest;
import com.example.order.processing.dto.OrderResponse;
import com.example.order.processing.rules.AbstractRule;

public class MemberShipProductRule extends AbstractRule {

	@Override
	public OrderResponse process(OrderRequest orderRequest) {
		if(orderRequest.isMemberShipProductType()){
			//Do Processing Here for MEMBERSHIP Product Rule
			OrderResponse orderResponse = new OrderResponse();
			orderResponse.setProductType(ProductType.MEMBERSHIP);
			orderResponse.setStatus(Boolean.TRUE);
			return orderResponse;
		}
		return applyNextRuleIfExist(orderRequest);
	}

	@Override
	public int order() {
		return 3;
	}
}
