package com.wk.utils;

import java.util.Map;

/**
 * 
 * @author Gary Hu
 *���ݴ�������
 */
public class UtilsDataDo {
	/**
	 * ����HashMap ��ȡName ����
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
