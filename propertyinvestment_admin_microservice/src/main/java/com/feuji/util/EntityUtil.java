package com.feuji.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EntityUtil {
	
	@Value("${environment}")	
	private  String environment;
	
	@Value("${dev-url}")
	private String devUrl;
	
	@Value("${prod-url}")
	private String prodUrl;
	
	public static  String getUrl()
	
	{
		EntityUtil util=new EntityUtil();
	
		if(util.environment.equals("dev"))
		{
			return util.devUrl;
		}
		else
		{
			return util.prodUrl;
		}
		
	}
}
