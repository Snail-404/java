package com.ldu.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TestHashMap {
	@Test
	public void testHashMap(){
		Map map=new HashMap();
		map.put("aaa", "zhangsan");
		map.put("bbb", "sssss");
		map.put("ccc", "dddd");
		map.put("ddd", "ffff");
		map.remove("ccc");
		System.out.println(map);
		
		Set set=map.keySet();
		for(Object obj:set){
			System.out.println(obj);
		}
		for(Object obj:set){
			System.out.println(obj+"---------"+map.get(obj));
		}
		Collection coll=map.values();
		for(Object obj:coll){
			System.out.println(obj);
		}
		
		Set set1=map.entrySet();
		for(Object obj:set1){
			Map.Entry entry=(Map.Entry)obj;
			System.out.println(entry);
			System.out.println(entry.getKey()+"-----====="+entry.getValue());
		}
	}
}
