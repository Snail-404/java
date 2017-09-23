package com.ldu.json;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.Test;

public class TestJson {
	/*
	 * 直接构建json对象 将json转化为String
	 */
	@Test
	public void test() {
		String json = "{'id':001,'name':'zhangsan','sex':m}";
		JSONObject jo = new JSONObject();
		jo.put("id", 12);
		jo.put("name", "zhangsan");
		jo.put("flag", true);
		jo.put("dou", 22.22);

		System.out.println(jo);
		System.out.println(jo.names());
		System.out.println(jo.values());
		System.out.println(jo.get("name"));

		JSONArray ja = new JSONArray();
		ja.add(jo);
		System.out.println("============================");
		System.out.println(ja);
		System.out.println("============================");

		StringWriter sw = new StringWriter();
		jo.write(sw);
		System.out.println(sw instanceof StringWriter);
		System.out.println(sw.toString() instanceof String);
		System.out.println(sw.toString().charAt(0));
	}

	/*
	 * 将String转换为json对象
	 */
	@Test
	public void test1() {
		// 方式一
		String str = "{'id':123,'name':'zds'}";
		JSONObject jo = JSONObject.fromObject(str);
		System.out.println(jo);
		System.out.println(jo.get("name"));
		// 方式二
		List<String> list = new ArrayList<String>();
		list.add("username");
		list.add("age");
		list.add("sex");
		JSONArray array = new JSONArray();
		array.add(list);
		System.out.println(array);
		System.out.println(list);
		// 方式三
		System.out.println("----------------------------");
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "abc");
		map.put("2", "efg");
		JSONArray array_test = new JSONArray();
		array_test.add(map);
		array_test.add(map);
		JSONObject jsonObject = JSONObject.fromObject(map);
		System.out.println(map);
		System.out.println(array_test);

		System.out.println(jsonObject);
		System.out.println(jsonObject.get("2"));
	}

	@Test
	public void test2() {
		String jsonMessage = "{\"语文\":\"88\",\"数学\":\"78\",\"计算机\":\"99\"}";
		String str = "{\"a\":\"b\", \"c\":\"d\"}";  
		JSONObject jo=JSONObject.fromObject(jsonMessage);
		System.out.println(jo);
		System.out.println(jo.get("数学"));
		System.out.println(jo.toString() instanceof String);
		String s="[{\"name\":\"sdf\"},{\"name\":\"eeeeeeeeeeee\"}]";
		String s1="{\"name\":\"sdf\"}";
		JSONArray ja=JSONArray.fromObject(s);
		JSONObject jo1=JSONObject.fromObject(s1);
		
		System.out.println("-----------------------");
		System.out.println(ja);
		System.out.println(ja.getJSONObject(0).get("name"));
		System.out.println(jo1);
		JSONArray ja1=new JSONArray();
		ja1.add(jo1);
			ja1.add(jo1);
		ja1.add(jo1);
		System.out.println(ja1);
		System.out.println(ja1.getJSONObject(0).get("name"));
        ja1.getJSONObject(0).put("name", "kkk");
        System.out.println(ja1.getJSONObject(0).get("name"));
	}
}
