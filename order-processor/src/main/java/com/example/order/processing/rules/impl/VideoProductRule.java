package com.example.order.processing.rules.impl;

import com.example.order.processing.ProductType;
import com.example.order.processing.dto.OrderRequest;
import com.example.order.processing.dto.OrderResponse;
import com.example.order.processing.rules.AbstractRule;

public class VideoProductRule extends AbstractRule {

	@Override
	public OrderResponse process(OrderRequest orderRequest) {
		if(orderRequest.isVideoProductType()){
			//Do Processing Here for VIDEO Product Rule
			OrderResponse orderResponse = new OrderResponse();
			orderResponse.setProductType(ProductType.VIDEO);
			orderResponse.setStatus(Boolean.TRUE);
			return orderResponse;
		}
		return applyNextRuleIfExist(orderRequest);
	}

	@Override
	public int order() {
		return 6;
	}
}
