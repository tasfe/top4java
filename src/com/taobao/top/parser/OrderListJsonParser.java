package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.Order;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class OrderListJsonParser implements TopParser<ResponseList<Order>> {

	public ResponseList<Order> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, Order.class);
	}

}