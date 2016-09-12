package com.sfdc.transformer;


import java.util.HashMap;
import java.util.Map;

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
				@SuppressWarnings("unchecked")
				HashMap<String, Object> result =  (HashMap<String, Object>) message.getPayload();
				LOGGER.debug("---------Account Item:-------"+result);
				HashMap<String, Object> accObj = new HashMap<String, Object>();
				if(result.get("Fax")!= null && !(result.get("Fax").toString().isEmpty()))
				{
					accObj.put("fax", result.get("Fax").toString());
				}
				if(result.get("Phone") != null && !(result.get("Phone").toString().isEmpty()))
				{
					accObj.put("phone", result.get("Phone").toString());
				}
				/**
				if(result.get("AccountNumber") != null && !(result.get("AccountNumber").toString().isEmpty()))
				{
					accObj.put("account_no", result.get("AccountNumber").toString());
				}
				**/
				if(result.get("RecordType") != null)
				{
					@SuppressWarnings("unchecked")
					Map<String,String> mapRname = (Map<String, String>) result.get("RecordType");
					if(mapRname.get("Name") != null)
					{
						accObj.put("recordtype", mapRname.get("Name"));
					}
				}
				if(result.get("AccountSourceY__c") != null && !(result.get("AccountSourceY__c").toString().isEmpty()))
				{
					accObj.put("accountsource", result.get("AccountSourceY__c").toString());
				}
				if(result.get("Name") != null && !(result.get("Name").toString().isEmpty()))
				{
					accObj.put("accountname", result.get("Name").toString());
				}
				/**
				if(result.get("OwnerId") != null && !(result.get("OwnerId").toString().isEmpty()))
				{
					accObj.put("OwnerId", result.get("OwnerId").toString());
				}
				**/
				if(result.get("Description") != null && !(result.get("Description").toString().isEmpty()))
				{
					accObj.put("description", result.get("Description").toString());
				}
				/**
				if(result.get("Parent") != null)
				{
					@SuppressWarnings("unchecked")
					Map<String,String> mapPname = (Map<String, String>) result.get("Parent");
					if(mapPname.get("Name") != null){
							accObj.put("Parent", mapPname.get("Name"));
					}
				}
				if(result.get("AnnualRevenue") != null && !(result.get("AnnualRevenue").toString().isEmpty()))
				{
					accObj.put("AnnualRevenue", result.get("AnnualRevenue").toString());
				}
				**/
				if(result.get("Website") != null && !(result.get("Website").toString().isEmpty()))
				{
					accObj.put("website", result.get("Website").toString());
				}
				if(result.get("NumberOfEmployees") != null && !(result.get("NumberOfEmployees").toString().isEmpty()))
				{
					accObj.put("numberofemployees", result.get("NumberOfEmployees").toString());
				}
				if(result.get("Remarks__c") != null && !(result.get("Remarks__c").toString().isEmpty()))
				{
					accObj.put("remarks", result.get("Remarks").toString());
				}
				if(result.get("chengweizhengshikehuField3__c") != null)
				{
					accObj.put("chengweizhengshikehuField3__c", result.get("chengweizhengshikehuField3__c"));
				}
				if(result.get("Area_daqu__c") != null)
				{
					accObj.put("areadaqu", result.get("Area_daqu__c"));
				}
				if(result.get("daili_email__c") != null)
				{
					accObj.put("daili_email__c", result.get("dailiemail"));
				}
				if(result.get("dailishangshuxingField3__c") != null)
				{
					accObj.put("dailishangshuxingField3__c", result.get("dailishangshuxingField3"));
				}
				if(result.get("Authorizeenddate__c") != null)
				{
					accObj.put("authorizeenddate", result.get("Authorizeenddate__c"));
				}
				if(result.get("AuthorizeStarDate__c") != null)
				{
					accObj.put("authorizeStarDate", result.get("AuthorizeStarDate__c"));
				}
				if(result.get("AddressNote__c") != null)
				{
					accObj.put("authorizeStarDate", result.get("addressNote"));
				}
				if(result.get("AddressType__c") != null)
				{
					accObj.put("addressType", result.get("AddressType__c"));
				}
				if(result.get("AddressEffective__c") != null)
				{
					accObj.put("addressType", result.get("addressEffective"));
				}
				if(result.get("QuaDomeCount__c") != null)
				{
					accObj.put("quaDomeCount", result.get("QuaDomeCount__c"));
				}
				if(result.get("OrderReturnAmount__c") != null)
				{
					accObj.put("orderReturnAmount", result.get("OrderReturnAmount__c"));
				}
				if(result.get("UnPayOrderAmountX__c") != null)
				{
					accObj.put("unPayOrderAmountX", result.get("UnPayOrderAmountX__c"));
				}
				if(result.get("TwoIndustries__c") != null)
				{
					accObj.put("twoIndustries", result.get("TwoIndustries__c"));
				}
				if(result.get("InvoiceAddress__c") != null)
				{
					accObj.put("invoiceAddress", result.get("InvoiceAddress__c"));
				}
				if(result.get("TheRebateAmount_new__c") != null)
				{
					accObj.put("theRebateAmountnew", result.get("TheRebateAmount_new__c"));
				}
				if(result.get("n_ServiceCode__c") != null)
				{
					accObj.put("nServiceCode", result.get("n_ServiceCode__c"));
				}
				if(result.get("CustomerServiceLevel__c") != null)
				{
					accObj.put("customerServiceLevel", result.get("CustomerServiceLevel__c"));
				}
				if(result.get("PayAmount_RebatesX__c") != null)
				{
					accObj.put("payAmountRebatesX", result.get("PayAmount_RebatesX__c"));
				}
				if(result.get("PayAmount_UnRebatesX__c") != null)
				{
					accObj.put("payAmountUnRebatesX", result.get("PayAmount_UnRebatesX__c"));
				}
				if(result.get("ResponsibleForCustomerSpecialist__c") != null)
				{
					accObj.put("responsibleid", result.get("ResponsibleForCustomerSpecialist__c"));
				}
				if(result.get("Corporate_c__c") != null)
				{
					accObj.put("corporatec", result.get("Corporate_c__c"));
				}
				if(result.get("gongsikaihuhangField3__c") != null)
				{
					accObj.put("gongsikaihuhangField3", result.get("gongsikaihuhangField3__c"));
				}
				if(result.get("zhucedizhiField3__c") != null)
				{
					accObj.put("zhucedizhiField3", result.get("zhucedizhiField3__c"));
				}
				if(result.get("signdate__c") != null)
				{
					accObj.put("signdate", result.get("signdate__c"));
				}
				if(result.get("hire_total__c") != null)
				{
					accObj.put("hiretotal", result.get("hire_total__c"));
				}
				if(result.get("intergrator_level__c") != null)
				{
					accObj.put("intergratorlevel", result.get("intergrator_level__c"));
				}
				if(result.get("CustomerClassification__c") != null)
				{
					accObj.put("customerClassification", result.get("CustomerClassification__c"));
				}
				if(result.get("CustomerEngineerX__c") != null)
				{
					accObj.put("customerengineerxid", result.get("CustomerEngineerX__c"));
				}
				if(result.get("Kundtypklassificering__c") != null)
				{
					accObj.put("kundtypklassificering", result.get("Kundtypklassificering__c"));
				}
				if(result.get("HistoryMobile__c") != null)
				{
					accObj.put("historyMobile", result.get("HistoryMobile__c"));
				}
				if(result.get("call_people__c") != null)
				{
					accObj.put("callpeople", result.get("call_people__c"));
				}
				if(result.get("LinkPhone__c") != null)
				{
					accObj.put("linkPhone", result.get("LinkPhone__c"));
				}
				if(result.get("LinkName__c") != null)
				{
					accObj.put("linknameid", result.get("LinkName__c"));
				}
				if(result.get("agentbrand__c") != null)
				{
					accObj.put("agentbrand", result.get("agentbrand__c"));
				}
				if(result.get("Identity__c") != null)
				{
					accObj.put("identity", result.get("Identity__c"));
				}
				if(result.get("qianyuenianfenField3__c") != null)
				{
					accObj.put("qianyuenianfenField3", result.get("qianyuenianfenField3__c"));
				}
				if(result.get("AreaCode__c") != null)
				{
					accObj.put("AreaCode__c", result.get("areacode"));
				}
				if(result.get("County__c") != null)
				{
					accObj.put("County__c", result.get("county"));
				}
				if(result.get("qudaobianhaoField3__c") != null)
				{
					accObj.put("qudaobianhaofield3", result.get("qudaobianhaoField3__c"));
				}
				if(result.get("n_Partner__c") != null)
				{
					accObj.put("npartnerid", result.get("n_Partner__c"));
				}
				if(result.get("QDFDZE__c") != null)
				{
					accObj.put("qdfdze", result.get("QDFDZE__c"));
				}
				if(result.get("ChannelType__c") != null)
				{
					accObj.put("channeltype", result.get("ChannelType__c"));
				}
				if(result.get("QDSYFDJE__c") != null)
				{
					accObj.put("qdsyfdje", result.get("QDSYFDJE__c"));
				}
				if(result.get("ChannelsViolations__c") != null)
				{
					accObj.put("channelsviolations", result.get("ChannelsViolations__c"));
				}
				if(result.get("RetentionMoney_New__c") != null)
				{
					accObj.put("retentionmoneynew", result.get("RetentionMoney_New__c"));
				}
				if(result.get("Field1__c") != null)
				{
					accObj.put("field1id", result.get("Field1__c"));
				}
				if(result.get("UsingStateOfEquipment__c") != null)
				{
					accObj.put("usingstateofequipment", result.get("UsingStateOfEquipment__c"));
				}
				if(result.get("IdentificationCode_c__c") != null)
				{
					accObj.put("identificationcodec", result.get("IdentificationCode_c__c"));
				}
				if(result.get("IdentificationCode_c__c") != null)
				{
					accObj.put("identificationcodec", result.get("IdentificationCode_c__c"));
				}
				if(result.get("IsServiceProvider__c") != null)
				{
					accObj.put("isserviceprovider", result.get("IsServiceProvider__c"));
				}
				if(result.get("Whether__c") != null)
				{
					accObj.put("whether", result.get("Whether__c"));
				}
				if(result.get("shifouyiheshi__c") != null)
				{
					accObj.put("shifouyiheshi", result.get("shifouyiheshi__c"));
				}
				if(result.get("IsMailAddress__c") != null)
				{
					accObj.put("ismailaddress", result.get("IsMailAddress__c"));
				}
				if(result.get("shichanghuodongkehuField3__c") != null)
				{
					accObj.put("shichanghuodongkehufield3", result.get("shichanghuodongkehuField3__c"));
				}
				if(result.get("shiyongchanpin__c") != null)
				{
					accObj.put("shiyongchanpin", result.get("shiyongchanpin__c"));
				}
				if(result.get("Receive_Rebates__c") != null)
				{
					accObj.put("receiverebates", result.get("Receive_Rebates__c"));
				}
				if(result.get("Receive_Retention__c") != null)
				{
					accObj.put("receiveretention", result.get("Receive_Retention__c"));
				}
				if(result.get("PaymentAmount__c") != null)
				{
					accObj.put("paymentamount", result.get("PaymentAmount__c"));
				}
				if(result.get("shoujihaoma__c") != null)
				{
					accObj.put("shoujihaoma", result.get("shoujihaoma__c"));
				}
				if(result.get("AuthorizedRegion__c") != null)
				{
					accObj.put("authorizedregion", result.get("AuthorizedRegion__c"));
				}
				if(result.get("LicensingIndustry__c") != null)
				{
					accObj.put("licensingindustry", result.get("LicensingIndustry__c"));
				}
				if(result.get("TaxId_c__c") != null)
				{
					accObj.put("taxidc", result.get("TaxId_c__c"));
				}
				if(result.get("SellArea__c") != null)
				{
					accObj.put("sellareaid", result.get("SellArea__c"));
				}
				if(result.get("City__c") != null)
				{
					accObj.put("city", result.get("City__c"));
				}
				if(result.get("suozaiquyu__c") != null)
				{
					accObj.put("suozaiquyuid", result.get("suozaiquyu__c"));
				}
				if(result.get("Province__c") != null)
				{
					accObj.put("province", result.get("Province__c"));
				}
				if(result.get("Statues__c") != null)
				{
					accObj.put("statues", result.get("Statues__c"));
				}
				if(result.get("Field2__c") != null)
				{
					accObj.put("field2", result.get("Field2__c"));
				}
				if(result.get("DetailedAddress__c") != null)
				{
					accObj.put("detailedaddress", result.get("DetailedAddress__c"));
				}
				if(result.get("PrimaryIndustry__c") != null)
				{
					accObj.put("primaryindustry", result.get("PrimaryIndustry__c"));
				}
				if(result.get("ChannelProCount__c") != null)
				{
					accObj.put("channelprocount", result.get("ChannelProCount__c"));
				}
				if(result.get("YYFDJE__c") != null)
				{
					accObj.put("yyfdje", result.get("YYFDJE__c"));
				}
				if(result.get("yinhangzhanghaoField3__c") != null)
				{
					accObj.put("yinhangzhanghaofield3", result.get("yinhangzhanghaoField3__c"));
				}
				if(result.get("Influence__c") != null)
				{
					accObj.put("influence", result.get("Influence__c"));
				}
				if(result.get("ZipCode__c") != null)
				{
					accObj.put("zipcode", result.get("ZipCode__c"));
				}
				if(result.get("Email__c") != null)
				{
					accObj.put("email", result.get("Email__c"));
				}
				if(result.get("BookAmoun_New__c") != null)
				{
					accObj.put("bookamounnew", result.get("BookAmoun_New__c"));
				}
				if(result.get("AvailableBalance_new__c") != null)
				{
					accObj.put("availablebalancenew", result.get("AvailableBalance_new__c"));
				}
				if(result.get("majorindustry__c") != null)
				{
					accObj.put("majorindustry", result.get("majorindustry__c"));
				}
				if(result.get("MainBusiness__c") != null)
				{
					accObj.put("mainbusiness", result.get("MainBusiness__c"));
				}
				if(result.get("majorbusiness__c") != null)
				{
					accObj.put("majorbusiness", result.get("majorbusiness__c"));
				}
				if(result.get("zhucezibenField3__c") != null)
				{
					accObj.put("zhucezibenfield3", result.get("zhucezibenField3__c"));
				}
				if(result.get("zixunchanpinleixing__c") != null)
				{
					accObj.put("zixunchanpinleixing", result.get("zixunchanpinleixing__c"));
				}
				if(result.get("SalesNowID__c") != null && !(result.get("SalesNowID__c").toString().isEmpty()))
				{
					accObj.put("Id",result.get("SalesNowID__c").toString());
				}
				accObj.put("sfdcid", result.get("Id").toString());
				accObj.put("assigned_user_id", "19x1");
				message.setPayload(accObj);
		} catch (Exception e) {
			LOGGER.error(" Error in  SFDCAccountTransformer ----", e);
		}
		return message;
	}
		
}
