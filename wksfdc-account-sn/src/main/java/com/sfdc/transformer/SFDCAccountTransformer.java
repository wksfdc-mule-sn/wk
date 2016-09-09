package com.sfdc.transformer;


import java.util.HashMap;

import org.apache.log4j.Logger;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

/**
 * SFDC Account Transformer
 * @author Gary Hu
 *Date:2016年9月5日13:54:41
 */
public class SFDCAccountTransformer extends AbstractMessageTransformer{

	private static final Logger LOGGER = Logger.getLogger(SFDCAccountTransformer.class);

	//客户数据转换处理
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		try {
			System.out.println("--------我来了1----------------");
			System.out.println("--------我来了1----------------");
				@SuppressWarnings("unchecked")
				HashMap<String, Object> result =  (HashMap<String, Object>) message.getPayload();
				LOGGER.debug("---------Account Item:-------"+result);
				HashMap<String, Object> accObj = new HashMap<String, Object>();
				Object value  = null;
	
				/**
				if(result.get("Fax")!= null && !(result.get("Fax").toString().isEmpty()))
				{
					accObj.put("Fax", result.get("Fax").toString());
				}
				value = result.get("Phone");
				if(value != null && !(value.toString().isEmpty()))
				{
					accObj.put("Phone", value.toString());
				}
				value = result.get("RecordType.Name");
				if(result.get("RecordType.Name") != null && !(value.toString().isEmpty()))
				{
					accObj.put("RecordType", value.toString());
				}
				**/
				value = result.get("Name");
				if(result.get("Name") != null && !(value.toString().isEmpty()))
				{
					accObj.put("accountname", "xxxxxx");
				}
				/**
				value = result.get("OwnerId");
				if(result.get("OwnerId") != null && !(value.toString().isEmpty()))
				{
					accObj.put("OwnerId", value.toString());
				}
				
				value = result.get("Description");
				if(result.get("Description") != null && !(value.toString().isEmpty()))
				{
					accObj.put("Description", value.toString());
				}
				value = result.get("SalesNowID__c");
				if(result.get("SalesNowID__c") != null && !(value.toString().isEmpty()))
				{
					accObj.put("Id",value.toString());
				}
				value = result.get("Id");
				accObj.put("sfdcid", result.get("Id"));
				**/
				accObj.put("assigned_user_id", "19x1");
				message.setPayload(accObj);
		} catch (Exception e) {
			LOGGER.error(" Error in  SFDCAccountTransformer ----", e);
		}
		return message;
	}
		
}
