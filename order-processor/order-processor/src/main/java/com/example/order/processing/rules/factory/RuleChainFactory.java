package com.example.order.processing.rules.factory;

import com.example.order.processing.dto.OrderRequest;
import com.example.order.processing.dto.OrderResponse;
import com.example.order.processing.rules.IRule;
import com.example.order.processing.rules.impl.*;
import com.example.order.processing.rules.helper.RulesOrderedComp;

import java.util.Arrays;
import java.util.List;

public class RuleChainFactory {

	private List<IRule> listOrdered = null;

	private RuleChainFactory() {
		createChainOrderedRules(
				new PhysicalProductRule(),
				new BookProductRule(),
				new MemberShipProductRule(),
				new MemberShipOrUpGradeProductRule(),
				new PhysicalOrBookProductRule(),
				new UpGradeProductRule(),
				new VideoProductRule(),
				new DefaultRuleNoOperation());
	}

	private IRule createChainOrderedRules(IRule... rules) {
		listOrdered = Arrays.asList(rules);
		listOrdered.sort(new RulesOrderedComp());
		IRule prevRule = listOrdered.get(0);
		for (int i = 1; i < listOrdered.size(); i++) {
			IRule currentRule = listOrdered.get(i);
			prevRule.setNextRule(currentRule);
			prevRule = currentRule;
		}
		return (IRule) listOrdered.get(0);
	}
	public IRule getFirstRule(){
		return (IRule) listOrdered.get(0);
	}

	public OrderResponse fireRules(OrderRequest orderRequest) {
		return getFirstRule().process(orderRequest);
	}

	private static class Holder {
		private static RuleChainFactory instance = new RuleChainFactory();
	}

	public static RuleChainFactory getInstance() {
		return Holder.instance;
	}


}
