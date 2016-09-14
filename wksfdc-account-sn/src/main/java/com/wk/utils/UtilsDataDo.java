package com.wk.utils;

import java.util.Map;

/**
 * 
 * @author Gary Hu
 *数据处理公共类
 */
public class UtilsDataDo {
	/**
	 * 根据HashMap 获取Name 数据
	 * @param objHashMap
	 * @return Name
	 */
	public static String getMapReturnName(Map<String, String> objMap)
	{
		String objName = null;
		if(objMap.size()>0)
		{
			Map<String,String> transMap = objMap;
			for(String str: transMap.keySet())
			{
				if(str =="Name")
				{
					objName = transMap.get(str);
				}
			}
		}
		return objName;
	}
}
