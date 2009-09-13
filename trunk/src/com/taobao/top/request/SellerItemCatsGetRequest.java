package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.sellercats.list.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class SellerItemCatsGetRequest implements TopRequest {

	/** 卖家昵称 */
	private String nick;

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getApiName() {
		return "taobao.sellercats.list.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("nick", this.nick);
		return params;
	}

}
