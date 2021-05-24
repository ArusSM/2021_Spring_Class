package com.yydh.myapp2;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		
		/* Set
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext2.xml");
		
		CollectionBean cb = (CollectionBean) factory.getBean("collectionBean");
		
		Set<String> addressList = cb.getAddressList();
		
		for(String address : addressList) {
			System.out.println(address.toString());
		}
		*/
		
		
		// Map
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext3.xml");
		
		CollectionBean2 cb = (CollectionBean2) factory.getBean("collectionBean");
		
		Map<String, String> addressList = cb.getAddressList();
		for(String address : addressList.keySet()) {
			String value= addressList.get(address);
			System.out.println(address + " : " + value);
		}
		
	}
}
