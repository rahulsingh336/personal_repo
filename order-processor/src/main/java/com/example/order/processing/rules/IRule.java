package com.example.order.processing.rules;

import com.example.order.processing.dto.OrderRequest;
import com.example.order.processing.dto.OrderResponse;

public interface IRule extends RuleOrder{

	void setNextRule(IRule nextRule);

	OrderResponse process(OrderRequest orderRequest);

}
