package AllegroWebApi;

import java.rmi.Remote;
import jade.util.leap.List;
import javax.xml.rpc.ServiceException;
import com.tilab.wade.performer.Constants;
import com.tilab.wade.performer.descriptors.Parameter;
import com.tilab.wade.performer.descriptors.webservice.Header;
import com.tilab.wade.performer.descriptors.webservice.OperationDescriptor;
import com.tilab.wade.performer.descriptors.webservice.ServiceDescriptor;

public class AllegroWebApiServiceDescriptor extends ServiceDescriptor {

	public static final String SERVICE_NAME = "AllegroWebApiService";
	public static final String NAMESPACE = "urn:AllegroWebApi";

	AllegroWebApiServiceLocator locator;

	public String getServiceName() {
		return SERVICE_NAME;
	}

	public Remote getService() throws ServiceException {
		return locator.getAllegroWebApiPort();
	}

	public void setEndpointAddress(String endpointAddress) {
		locator.setAllegroWebApiPortEndpointAddress(endpointAddress);
	}

	public AllegroWebApiServiceDescriptor() {

		locator = new AllegroWebApiServiceLocator();

		OperationDescriptor operDesc = new OperationDescriptor();
		setdoGetCatsDataParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetCatsData", operDesc);

		operDesc = new OperationDescriptor();
		setdoLoginParameters(operDesc.getFormalParams());
		addOperationDescriptor("doLogin", operDesc);

		operDesc = new OperationDescriptor();
		setdoLoginEncParameters(operDesc.getFormalParams());
		addOperationDescriptor("doLoginEnc", operDesc);

		operDesc = new OperationDescriptor();
		setdoNewAuctionParameters(operDesc.getFormalParams());
		addOperationDescriptor("doNewAuction", operDesc);

		operDesc = new OperationDescriptor();
		setdoNewAuctionExtParameters(operDesc.getFormalParams());
		addOperationDescriptor("doNewAuctionExt", operDesc);

		operDesc = new OperationDescriptor();
		setdoSellSomeAgainParameters(operDesc.getFormalParams());
		addOperationDescriptor("doSellSomeAgain", operDesc);

		operDesc = new OperationDescriptor();
		setdoCheckNewAuctionParameters(operDesc.getFormalParams());
		addOperationDescriptor("doCheckNewAuction", operDesc);

		operDesc = new OperationDescriptor();
		setdoCheckNewAuctionExtParameters(operDesc.getFormalParams());
		addOperationDescriptor("doCheckNewAuctionExt", operDesc);

		operDesc = new OperationDescriptor();
		setdoAddDescToItemsParameters(operDesc.getFormalParams());
		addOperationDescriptor("doAddDescToItems", operDesc);

		operDesc = new OperationDescriptor();
		setdoCheckItemIdByFutureItemIdParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("item-id");
		addOperationDescriptor("doCheckItemIdByFutureItemId", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetCatsDataLimitParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetCatsDataLimit", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetItemsInfoParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetItemsInfo", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetPaymentDataParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("payment-list");
		addOperationDescriptor("doGetPaymentData", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetSellFormFieldsParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetSellFormFields", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetSellFormFieldsExtParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetSellFormFieldsExt", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetSitesFlagInfoParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetSitesFlagInfo", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetSitesInfoParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetSitesInfo", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetSystemTimeParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("server-time");
		addOperationDescriptor("doGetSystemTime", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetUserIDParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("user-id");
		addOperationDescriptor("doGetUserID", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetUserItemsParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetUserItems", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetUserLoginParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("user-login");
		addOperationDescriptor("doGetUserLogin", operDesc);

		operDesc = new OperationDescriptor();
		setdoQueryAllSysStatusParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("sys-country-status");
		addOperationDescriptor("doQueryAllSysStatus", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetSellFormFieldsExtLimitParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetSellFormFieldsExtLimit", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetSellFormFieldsLimitParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetSellFormFieldsLimit", operDesc);

		operDesc = new OperationDescriptor();
		setdoQuerySysStatusParameters(operDesc.getFormalParams());
		addOperationDescriptor("doQuerySysStatus", operDesc);

		operDesc = new OperationDescriptor();
		setdoShowCatParameters(operDesc.getFormalParams());
		addOperationDescriptor("doShowCat", operDesc);

		operDesc = new OperationDescriptor();
		setdoShowItemInfoParameters(operDesc.getFormalParams());
		addOperationDescriptor("doShowItemInfo", operDesc);

		operDesc = new OperationDescriptor();
		setdoShowUserParameters(operDesc.getFormalParams());
		addOperationDescriptor("doShowUser", operDesc);

		operDesc = new OperationDescriptor();
		setdoVerifyItemParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("item-id");
		addOperationDescriptor("doVerifyItem", operDesc);

		operDesc = new OperationDescriptor();
		setdoAddWatchListParameters(operDesc.getFormalParams());
		addOperationDescriptor("doAddWatchList", operDesc);

		operDesc = new OperationDescriptor();
		setdoFeedbackParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("feedback-id");
		addOperationDescriptor("doFeedback", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetBidItem2Parameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("biditem-list");
		addOperationDescriptor("doGetBidItem2", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetFeedbackParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetFeedback", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetSiteJournalParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("site-journal-array");
		addOperationDescriptor("doGetSiteJournal", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetSiteJournalInfoParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("site-journal-info");
		addOperationDescriptor("doGetSiteJournalInfo", operDesc);

		operDesc = new OperationDescriptor();
		setdoMyAccount2Parameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("myaccount-list");
		addOperationDescriptor("doMyAccount2", operDesc);

		operDesc = new OperationDescriptor();
		setdoMyAccountItemsCountParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("myaccount-items-count");
		addOperationDescriptor("doMyAccountItemsCount", operDesc);

		operDesc = new OperationDescriptor();
		setdoMyBillingParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("my-billing");
		addOperationDescriptor("doMyBilling", operDesc);

		operDesc = new OperationDescriptor();
		setdoMyContactParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("mycontact-list");
		addOperationDescriptor("doMyContact", operDesc);

		operDesc = new OperationDescriptor();
		setdoMyFeedback2Parameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("myfeedback-list");
		addOperationDescriptor("doMyFeedback2", operDesc);

		operDesc = new OperationDescriptor();
		setdoSearchParameters(operDesc.getFormalParams());
		addOperationDescriptor("doSearch", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetAdminUserLicenceDateParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("get-date-value");
		addOperationDescriptor("doGetAdminUserLicenceDate", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetPaymentStatusParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("code");
		addOperationDescriptor("doGetPaymentStatus", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetUserLicenceDateParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("get-date-value");
		addOperationDescriptor("doGetUserLicenceDate", operDesc);

		operDesc = new OperationDescriptor();
		setdoMyBillingItemParameters(operDesc.getFormalParams());
		addOperationDescriptor("doMyBillingItem", operDesc);

		operDesc = new OperationDescriptor();
		setdoSetUserLicenceDateParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("set-date-value");
		addOperationDescriptor("doSetUserLicenceDate", operDesc);

		operDesc = new OperationDescriptor();
		setdoBidItemParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("bid-price");
		addOperationDescriptor("doBidItem", operDesc);

		operDesc = new OperationDescriptor();
		setdoCancelBidItemParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("cancel-bid-value");
		addOperationDescriptor("doCancelBidItem", operDesc);

		operDesc = new OperationDescriptor();
		setdoChangePriceItemParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("item-info");
		addOperationDescriptor("doChangePriceItem", operDesc);

		operDesc = new OperationDescriptor();
		setdoFinishAuctionParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("finish-value");
		addOperationDescriptor("doFinishAuction", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetItemTransactionParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetItemTransaction", operDesc);

		operDesc = new OperationDescriptor();
		setdoRequestCancelBidParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("request-value");
		addOperationDescriptor("doRequestCancelBid", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetCatsDataCountParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetCatsDataCount", operDesc);

		operDesc = new OperationDescriptor();
		setdoMyFeedback2LimitParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("myfeedback-list");
		addOperationDescriptor("doMyFeedback2Limit", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetCountriesParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("country-array");
		addOperationDescriptor("doGetCountries", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetServiceTemplatesParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("templates-array");
		addOperationDescriptor("doGetServiceTemplates", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetSellFormAttribsParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetSellFormAttribs", operDesc);

		operDesc = new OperationDescriptor();
		setdoFeedbackManyParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("fe-results");
		addOperationDescriptor("doFeedbackMany", operDesc);

		operDesc = new OperationDescriptor();
		setdoShowItemInfoExtParameters(operDesc.getFormalParams());
		addOperationDescriptor("doShowItemInfoExt", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetWaitingFeedbacksCountParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("feedback-count");
		addOperationDescriptor("doGetWaitingFeedbacksCount", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetWaitingFeedbacksParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("fe-wait-list");
		addOperationDescriptor("doGetWaitingFeedbacks", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetBlackListUsersParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("black-list-users");
		addOperationDescriptor("doGetBlackListUsers", operDesc);

		operDesc = new OperationDescriptor();
		setdoRemoveFromBlackListParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("black-list-result");
		addOperationDescriptor("doRemoveFromBlackList", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetServiceInfoCategoriesParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("service-info-cats-list");
		addOperationDescriptor("doGetServiceInfoCategories", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetServiceInfoParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("service-info-items-list");
		addOperationDescriptor("doGetServiceInfo", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetStatesInfoParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("states-info-array");
		addOperationDescriptor("doGetStatesInfo", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetShopCatsDataParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("shop-cats-list");
		addOperationDescriptor("doGetShopCatsData", operDesc);

		operDesc = new OperationDescriptor();
		setdoCheckExternalKeyParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("result");
		addOperationDescriptor("doCheckExternalKey", operDesc);

		operDesc = new OperationDescriptor();
		setdoSellSomeAgainInShopParameters(operDesc.getFormalParams());
		addOperationDescriptor("doSellSomeAgainInShop", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetSuperSellerStatusParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("user-ss-status");
		addOperationDescriptor("doGetSuperSellerStatus", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetMyDataParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetMyData", operDesc);

		operDesc = new OperationDescriptor();
		setdoInternalIStoreChangeParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("result");
		addOperationDescriptor("doInternalIStoreChange", operDesc);

		operDesc = new OperationDescriptor();
		setdoInternalCheckLoginParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("result");
		addOperationDescriptor("doInternalCheckLogin", operDesc);

		operDesc = new OperationDescriptor();
		setdoInternalGetStatusForDebitCardParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("result");
		addOperationDescriptor("doInternalGetStatusForDebitCard", operDesc);

		operDesc = new OperationDescriptor();
		setdoInternalGetStatusForCreditCardParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("result");
		addOperationDescriptor("doInternalGetStatusForCreditCard", operDesc);

		operDesc = new OperationDescriptor();
		setdoInternalSubmitForDebitCardParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("application-id");
		addOperationDescriptor("doInternalSubmitForDebitCard", operDesc);

		operDesc = new OperationDescriptor();
		setdoInternalSubmitForCreditCardParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("application-id");
		addOperationDescriptor("doInternalSubmitForCreditCard", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetFavouriteSellersParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("s-favourite-sellers-list");
		addOperationDescriptor("doGetFavouriteSellers", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetFavouriteCategoriesParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("s-favourite-categories-list");
		addOperationDescriptor("doGetFavouriteCategories", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetItemsImagesParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("get_items_images_result");
		addOperationDescriptor("doGetItemsImages", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetShipmentOptionsFormDataParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("sof-data");
		addOperationDescriptor("doGetShipmentOptionsFormData", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetSpecialItemsParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("s-special-list");
		addOperationDescriptor("doGetSpecialItems", operDesc);

		operDesc = new OperationDescriptor();
		setdoAddToBlackListParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("user-black-list-results-arr");
		addOperationDescriptor("doAddToBlackList", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetPostBuyDataParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("items-post-buy-data");
		addOperationDescriptor("doGetPostBuyData", operDesc);

		operDesc = new OperationDescriptor();
		setdoCancelRefundFormsParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("cancel-refund-forms-results-arr");
		addOperationDescriptor("doCancelRefundForms", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetSessionHandleForWidgetParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetSessionHandleForWidget", operDesc);

		operDesc = new OperationDescriptor();
		setdoCancelRefundWarningsParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("cancel-refund-warnings-results-arr");
		addOperationDescriptor("doCancelRefundWarnings", operDesc);

		operDesc = new OperationDescriptor();
		setdoInternalSendMessageParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("result");
		addOperationDescriptor("doInternalSendMessage", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetRefundTransactionsParameters(operDesc.getFormalParams());
		addOperationDescriptor("doGetRefundTransactions", operDesc);

		operDesc = new OperationDescriptor();
		setdoSendReminderMessagesParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("send-reminder-messages-results-arr");
		addOperationDescriptor("doSendReminderMessages", operDesc);

		operDesc = new OperationDescriptor();
		setdoRemoveFromWatchListParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("watch-list-result");
		addOperationDescriptor("doRemoveFromWatchList", operDesc);

		operDesc = new OperationDescriptor();
		setdoSendRefundFormsParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("send-refund-forms-results-arr");
		addOperationDescriptor("doSendRefundForms", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetRefundFormsStatusesParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("refund-forms-statuses-results-arr");
		addOperationDescriptor("doGetRefundFormsStatuses", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetRefundReasonsParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("refund-reasons-arr");
		addOperationDescriptor("doGetRefundReasons", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetMyIncomingPaymentsParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("pay-trans-income");
		addOperationDescriptor("doGetMyIncomingPayments", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetMyPaymentsParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("pay-trans-payment");
		addOperationDescriptor("doGetMyPayments", operDesc);

		operDesc = new OperationDescriptor();
		setdoGetMyPayoutsParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("pay-trans-payout");
		addOperationDescriptor("doGetMyPayouts", operDesc);

		operDesc = new OperationDescriptor();
		setdoChangeQuantityItemParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("item-info");
		addOperationDescriptor("doChangeQuantityItem", operDesc);

		operDesc = new OperationDescriptor();
		setdoShowUserPageParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("user-page-content");
		addOperationDescriptor("doShowUserPage", operDesc);

		operDesc = new OperationDescriptor();
		setdoSendEmailToUserParameters(operDesc.getFormalParams());
		operDesc.setReturnValueName("mail-to-user-result");
		addOperationDescriptor("doSendEmailToUser", operDesc);
	}

	private void setdoGetCatsDataParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("local-version");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cats-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfCatsHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-key");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-str");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoLoginParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("user-login");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-password");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("country-code");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("local-version");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("session-handle-part");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("hash-offset");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("server-time");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);
	}

	private void setdoLoginEncParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("user-login");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-hash-password");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("country-code");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("local-version");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("session-handle-part");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("hash-offset");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("server-time");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);
	}

	private void setdoNewAuctionParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("fields");
		p.setMode(Constants.IN_MODE);
		p.setType("[LAllegroWebApi.FieldsValue;");
		formalParams.add(p);

		p = new Parameter();
		p.setName("private");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("local-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-id");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-info");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoNewAuctionExtParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("fields");
		p.setMode(Constants.IN_MODE);
		p.setType("[LAllegroWebApi.FieldsValue;");
		formalParams.add(p);

		p = new Parameter();
		p.setName("private");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("local-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-id");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-info");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoSellSomeAgainParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sell-items-array");
		p.setMode(Constants.IN_MODE);
		p.setType("[J");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sell-starting-time");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sell-auction-duration");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sell-options");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-sell-again");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfStructSellAgainHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-sell-failed");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfStructSellFailedHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-sell-not-found");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemsIDHolder");
		formalParams.add(p);
	}

	private void setdoCheckNewAuctionParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("fields");
		p.setMode(Constants.IN_MODE);
		p.setType("[LAllegroWebApi.FieldsValue;");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-price");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-price-desc");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoCheckNewAuctionExtParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("fields");
		p.setMode(Constants.IN_MODE);
		p.setType("[LAllegroWebApi.FieldsValue;");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-price");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-price-desc");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoAddDescToItemsParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-id-array");
		p.setMode(Constants.IN_MODE);
		p.setType("[J");
		formalParams.add(p);

		p = new Parameter();
		p.setName("it-description");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("array-items-add-id");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemsIDHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("array-items-desc-to-long");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemsIDHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("array-items-not-found");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemsIDHolder");
		formalParams.add(p);
	}

	private void setdoCheckItemIdByFutureItemIdParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("country-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("future-item-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-id");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);
	}

	private void setdoGetCatsDataLimitParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("local-version");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("offset");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("package-element");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cats-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfCatsHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-key");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-str");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoGetItemsInfoParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-id-array");
		p.setMode(Constants.IN_MODE);
		p.setType("[J");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-desc");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-image-url");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-attribs");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-postage-options");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-company-info");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("array-item-list-info");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfStructItemInfoListHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("array-items-not-found");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemsIDHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("array-items-admin-killed");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemsIDHolder");
		formalParams.add(p);
	}

	private void setdoGetPaymentDataParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("payment-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.BillingDataType;");
		formalParams.add(p);
	}

	private void setdoGetSellFormFieldsParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-code");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("local-version");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sell-form-fields");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfSellFormsHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-key");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-str");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoGetSellFormFieldsExtParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-code");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("local-version");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sell-form-fields");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfSellFormsHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-key");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-str");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoGetSitesFlagInfoParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-code");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sites-info-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfSitesFlagInfoHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-key");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-str");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoGetSitesInfoParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-code");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sites-info-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfSitesInfoHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-key");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-str");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoGetSystemTimeParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("server-time");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);
	}

	private void setdoGetUserIDParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-login");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-email");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-id");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoGetUserItemsParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("user-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("country-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("offset");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("limit");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-item-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfUserItemListHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-item-count");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoGetUserLoginParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-login");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoQueryAllSysStatusParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sys-country-status");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.SysStatusType;");
		formalParams.add(p);
	}

	private void setdoGetSellFormFieldsExtLimitParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-code");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("local-version");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("offset");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("package-element");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sell-form-fields");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfSellFormsHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-key");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-str");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("form-fields-count");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoGetSellFormFieldsLimitParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-code");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("local-version");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("offset");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("package-element");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sell-form-fields");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfSellFormsHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-key");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-str");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("form-fields-count");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoQuerySysStatusParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("sysvar");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("country-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("info");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-key");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);
	}

	private void setdoShowCatParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cat-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cat-item-state");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cat-item-option");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cat-item-duration-option");
		p.setMode(Constants.IN_MODE);
		p.setType("AllegroWebApi.DurationTimeInfo");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cat-attrib-fields");
		p.setMode(Constants.IN_MODE);
		p.setType("[LAllegroWebApi.FieldsValue;");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cat-sort-options");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cat-items-price");
		p.setMode(Constants.IN_MODE);
		p.setType("AllegroWebApi.PriceCatInfo");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cat-items-offset");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cat-items-limit");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cat-parent-array");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfCatInfoStructHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cat-child-array");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfCatInfoStructHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cat-sister-array");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfCatInfoStructHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cat-items-count");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cat-items-count-featured");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cat-items-array");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfSearchResponseHolder");
		formalParams.add(p);
	}

	private void setdoShowItemInfoParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-desc");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-image-url");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-attribs");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-postage-options");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-company-info");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-list-info");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ItemInfoHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-cat-path");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemCatListHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-img-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemImageListHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-attrib-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfAttribStructHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-postage-options");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfPostageStructHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-payment-options");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ItemPaymentOptionsHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-company-info");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.CompanyInfoStructHolder");
		formalParams.add(p);
	}

	private void setdoShowUserParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("country-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-id");
		p.setMode(Constants.INOUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-login");
		p.setMode(Constants.INOUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-country");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-create-date");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-login-date");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-rating");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-is-new-user");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-not-activated");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-closed");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-blocked");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-terminated");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-has-page");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-is-sseller");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-is-eco");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-positive-feedback");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ShowUserFeedbacksHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-negative-feedback");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ShowUserFeedbacksHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-neutral-feedback");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ShowUserFeedbacksHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-junior-status");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-has-shop");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-company-icon");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoVerifyItemParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("local-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-id");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);
	}

	private void setdoAddWatchListParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-id-array");
		p.setMode(Constants.IN_MODE);
		p.setType("[J");
		formalParams.add(p);

		p = new Parameter();
		p.setName("array-items-add-id");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemsIDHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("array-items-not-found");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemsIDHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("array-items-admin-killed");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemsIDHolder");
		formalParams.add(p);
	}

	private void setdoFeedbackParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("fe-item-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("fe-from-user-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("fe-to-user-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("fe-comment");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("fe-comment-type");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("fe-op");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("feedback-id");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoGetBidItem2Parameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("biditem-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfBidList2Holder");
		formalParams.add(p);
	}

	private void setdoGetFeedbackParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("feedback-from");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("feedback-to");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("feedback-offset");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("feedback-kind-list");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("feedback-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfFeedbackListHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("feedback-count");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoGetSiteJournalParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("starting-point");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("info-type");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("site-journal-array");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.SiteJournal;");
		formalParams.add(p);
	}

	private void setdoGetSiteJournalInfoParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("starting-point");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("info-type");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("site-journal-info");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.SiteJournalInfo");
		formalParams.add(p);
	}

	private void setdoMyAccount2Parameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("account-type");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("offset");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-array");
		p.setMode(Constants.IN_MODE);
		p.setType("[I");
		formalParams.add(p);

		p = new Parameter();
		p.setName("limit");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("myaccount-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.MyAccountStruct2;");
		formalParams.add(p);
	}

	private void setdoMyAccountItemsCountParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("account-type");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-array");
		p.setMode(Constants.IN_MODE);
		p.setType("[I");
		formalParams.add(p);

		p = new Parameter();
		p.setName("myaccount-items-count");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoMyBillingParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("my-billing");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoMyContactParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("auction-id-list");
		p.setMode(Constants.IN_MODE);
		p.setType("[I");
		formalParams.add(p);

		p = new Parameter();
		p.setName("offset");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("desc");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("mycontact-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.MyContactList;");
		formalParams.add(p);
	}

	private void setdoMyFeedback2Parameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("feedback-type");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("offset");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("desc");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-array");
		p.setMode(Constants.IN_MODE);
		p.setType("[I");
		formalParams.add(p);

		p = new Parameter();
		p.setName("myfeedback-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.MyFeedbackListStruct2;");
		formalParams.add(p);
	}

	private void setdoSearchParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("search-query");
		p.setMode(Constants.IN_MODE);
		p.setType("AllegroWebApi.SearchOptType");
		formalParams.add(p);

		p = new Parameter();
		p.setName("search-count");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("search-count-featured");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("search-array");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfSearchResponseHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("search-excluded-words");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfExcludedWordsHolder");
		formalParams.add(p);
	}

	private void setdoGetAdminUserLicenceDateParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("admin-session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-lic-login");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-date-value");
		p.setMode(Constants.OUT_MODE);
		p.setType("float");
		formalParams.add(p);
	}

	private void setdoGetPaymentStatusParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("payu-email");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("payu-password");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("allegro-auction-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("allegro-buyer-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("code");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoGetUserLicenceDateParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-date-value");
		p.setMode(Constants.OUT_MODE);
		p.setType("float");
		formalParams.add(p);
	}

	private void setdoMyBillingItemParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("option");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("entry-fees");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ItemBillingListHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ending-fees");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ItemBillingListHolder");
		formalParams.add(p);
	}

	private void setdoSetUserLicenceDateParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("admin-session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-lic-login");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-lic-country");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-lic-date");
		p.setMode(Constants.IN_MODE);
		p.setType("float");
		formalParams.add(p);

		p = new Parameter();
		p.setName("set-date-value");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoBidItemParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("bid-it-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("bid-user-price");
		p.setMode(Constants.IN_MODE);
		p.setType("float");
		formalParams.add(p);

		p = new Parameter();
		p.setName("bid-quantity");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("bid-buy-now");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("bid-price");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoCancelBidItemParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cancel-item-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cancel-bids-array");
		p.setMode(Constants.IN_MODE);
		p.setType("[I");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cancel-bids-reason");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cancel-add-to-black-list");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cancel-bid-value");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoChangePriceItemParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-id");
		p.setMode(Constants.INOUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("new-starting-price");
		p.setMode(Constants.IN_MODE);
		p.setType("float");
		formalParams.add(p);

		p = new Parameter();
		p.setName("new-reserve-price");
		p.setMode(Constants.IN_MODE);
		p.setType("float");
		formalParams.add(p);

		p = new Parameter();
		p.setName("new-buy-now-price");
		p.setMode(Constants.IN_MODE);
		p.setType("float");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-info");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoFinishAuctionParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("finish-item-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("finish-cancel-all-bids");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("finish-cancel-reason");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("finish-value");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoGetItemTransactionParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-options");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-info");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ItemInfoHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-cat-path");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemCatListHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-img-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemImageListHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("bid-won-contact-info");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemTransHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("bid-lost-info");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfBidList2Holder");
		formalParams.add(p);
	}

	private void setdoRequestCancelBidParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("request-item-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("request-cancel-reason");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("request-value");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoGetCatsDataCountParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("local-version");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cats-count");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-key");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-str");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoMyFeedback2LimitParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("feedback-type");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("offset");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("desc");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-array");
		p.setMode(Constants.IN_MODE);
		p.setType("[I");
		formalParams.add(p);

		p = new Parameter();
		p.setName("package-element");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("myfeedback-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.MyFeedbackListStruct2;");
		formalParams.add(p);
	}

	private void setdoGetCountriesParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-code");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("country-array");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.CountryInfoType;");
		formalParams.add(p);
	}

	private void setdoGetServiceTemplatesParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-code");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("templates-array");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.TemplateInfoType;");
		formalParams.add(p);
	}

	private void setdoGetSellFormAttribsParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("local-version");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cat-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sell-form-fields");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfSellFormsHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-key");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("ver-str");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoFeedbackManyParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("feedbacks-list");
		p.setMode(Constants.IN_MODE);
		p.setType("[LAllegroWebApi.FeedbackManyStruct;");
		formalParams.add(p);

		p = new Parameter();
		p.setName("fe-results");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.FeedbackResultStruct;");
		formalParams.add(p);
	}

	private void setdoShowItemInfoExtParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-desc");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-image-url");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-attribs");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-postage-options");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get-company-info");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-list-info-ext");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ItemInfoExtHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-cat-path");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemCatListHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-img-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemImageListHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-attrib-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfAttribStructHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-postage-options");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfPostageStructHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-payment-options");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ItemPaymentOptionsHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-company-info");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.CompanyInfoStructHolder");
		formalParams.add(p);
	}

	private void setdoGetWaitingFeedbacksCountParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("feedback-count");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoGetWaitingFeedbacksParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("offset");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("package-size");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("fe-wait-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.WaitFeedbackStruct;");
		formalParams.add(p);
	}

	private void setdoGetBlackListUsersParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("black-list-users");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.BlackListStruct;");
		formalParams.add(p);
	}

	private void setdoRemoveFromBlackListParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("users-id-array");
		p.setMode(Constants.IN_MODE);
		p.setType("[J");
		formalParams.add(p);

		p = new Parameter();
		p.setName("black-list-result");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.BlackListResStruct;");
		formalParams.add(p);
	}

	private void setdoGetServiceInfoCategoriesParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-code");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("service-info-cats-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.ServiceInfoCatStruct;");
		formalParams.add(p);
	}

	private void setdoGetServiceInfoParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-code");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("an-cat-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("an-it-date");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("an-it-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("service-info-items-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.ServiceInfoStruct;");
		formalParams.add(p);
	}

	private void setdoGetStatesInfoParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("country-code");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("states-info-array");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.StateInfoStruct;");
		formalParams.add(p);
	}

	private void setdoGetShopCatsDataParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("shop-cats-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfCatsHolder");
		formalParams.add(p);
	}

	private void setdoCheckExternalKeyParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("hash-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("result");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoSellSomeAgainInShopParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sell-items-array");
		p.setMode(Constants.IN_MODE);
		p.setType("[J");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sell-starting-time");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sell-shop-duration");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sell-shop-options");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sell-prolong-options");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sell-shop-category");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-sell-again");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfStructSellAgainHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-sell-failed");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfStructSellFailedHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-sell-not-found");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfItemsIDHolder");
		formalParams.add(p);
	}

	private void setdoGetSuperSellerStatusParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-ss-status");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoGetMyDataParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-data");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.UserDataStructHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("invoice-data");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.InvoiceDataStructHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("company-extra-data");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.CompanyExtraDataStructHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("company-second-address");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.CompanySecondAddressStructHolder");
		formalParams.add(p);
	}

	private void setdoInternalIStoreChangeParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("istore-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("action-type");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("action-date");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("valid-date");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("result");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoInternalCheckLoginParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-login");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-first-name");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-last-name");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-id");
		p.setMode(Constants.INOUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("result");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoInternalGetStatusForDebitCardParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("result");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoInternalGetStatusForCreditCardParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("result");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoInternalSubmitForDebitCardParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("application-id");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoInternalSubmitForCreditCardParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("application-id");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoGetFavouriteSellersParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("s-favourite-sellers-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.FavouritesSellersStruct;");
		formalParams.add(p);
	}

	private void setdoGetFavouriteCategoriesParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("s-favourite-categories-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.FavouritesCategoriesStruct;");
		formalParams.add(p);
	}

	private void setdoGetItemsImagesParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-array");
		p.setMode(Constants.IN_MODE);
		p.setType("[LAllegroWebApi.ItemGetImage;");
		formalParams.add(p);

		p = new Parameter();
		p.setName("image-type");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("get_items_images_result");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.ItemImagesStruct;");
		formalParams.add(p);
	}

	private void setdoGetShipmentOptionsFormDataParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sof-user-type");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sof-items-id");
		p.setMode(Constants.IN_MODE);
		p.setType("[J");
		formalParams.add(p);

		p = new Parameter();
		p.setName("sof-data");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.SofDataStruct;");
		formalParams.add(p);
	}

	private void setdoGetSpecialItemsParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("special-type");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("special-group");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("offset");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("s-special-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.SpecialAuctionStruct;");
		formalParams.add(p);
	}

	private void setdoAddToBlackListParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("users-black-list-array");
		p.setMode(Constants.IN_MODE);
		p.setType("[LAllegroWebApi.UserBlackListStruct;");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-black-list-results-arr");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.UserBlackListAddResultStruct;");
		formalParams.add(p);
	}

	private void setdoGetPostBuyDataParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-array");
		p.setMode(Constants.IN_MODE);
		p.setType("[I");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-post-buy-data");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.ItemPostBuyDataStruct;");
		formalParams.add(p);
	}

	private void setdoCancelRefundFormsParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("refund-cancel-data-arr");
		p.setMode(Constants.IN_MODE);
		p.setType("[LAllegroWebApi.CancelRefundDataStruct;");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cancel-refund-forms-results-arr");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.CancelRefundFormResultStruct;");
		formalParams.add(p);
	}

	private void setdoGetSessionHandleForWidgetParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("country-code");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("server-time");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);
	}

	private void setdoCancelRefundWarningsParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cancel-refund-warnings-data-arr");
		p.setMode(Constants.IN_MODE);
		p.setType("[LAllegroWebApi.CancelRefundWarningStruct;");
		formalParams.add(p);

		p = new Parameter();
		p.setName("cancel-refund-warnings-results-arr");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.CancelRefundWarningResultStruct;");
		formalParams.add(p);
	}

	private void setdoInternalSendMessageParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("mail_template_id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("array-of-additional-data");
		p.setMode(Constants.IN_MODE);
		p.setType("[Ljava.lang.String;");
		formalParams.add(p);

		p = new Parameter();
		p.setName("result");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);
	}

	private void setdoGetRefundTransactionsParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("offset");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("limit");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("refund-forms-count");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.IntHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("refund-forms-list");
		p.setMode(Constants.OUT_MODE);
		p.setType("AllegroWebApi.holders.ArrayOfRefundFormDataStructHolder");
		formalParams.add(p);
	}

	private void setdoSendReminderMessagesParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("send-reminder-messages-data-arr");
		p.setMode(Constants.IN_MODE);
		p.setType("[LAllegroWebApi.SendReminderMessageStruct;");
		formalParams.add(p);

		p = new Parameter();
		p.setName("send-reminder-messages-results-arr");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.SendReminderMessageResultStruct;");
		formalParams.add(p);
	}

	private void setdoRemoveFromWatchListParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("items-id-array");
		p.setMode(Constants.IN_MODE);
		p.setType("[J");
		formalParams.add(p);

		p = new Parameter();
		p.setName("watch-list-result");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.ItemRemoveWatchStruct;");
		formalParams.add(p);
	}

	private void setdoSendRefundFormsParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("send-refund-forms-data-arr");
		p.setMode(Constants.IN_MODE);
		p.setType("[LAllegroWebApi.SendRefundFormStruct;");
		formalParams.add(p);

		p = new Parameter();
		p.setName("send-refund-forms-results-arr");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.SendRefundFormResultStruct;");
		formalParams.add(p);
	}

	private void setdoGetRefundFormsStatusesParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("refund-forms-statuses-data-arr");
		p.setMode(Constants.IN_MODE);
		p.setType("[LAllegroWebApi.RefundFormStatusStruct;");
		formalParams.add(p);

		p = new Parameter();
		p.setName("refund-forms-statuses-results-arr");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.RefundFormStatusResultStruct;");
		formalParams.add(p);
	}

	private void setdoGetRefundReasonsParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("country-code");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("refund-reasons-arr");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.RefundReasonStruct;");
		formalParams.add(p);
	}

	private void setdoGetMyIncomingPaymentsParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("buyer-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("trans-recv-date-from");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("trans-recv-date-to");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("trans-page-limit");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("trans-offset");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("pay-trans-income");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.UserIncomingPaymentStruct;");
		formalParams.add(p);
	}

	private void setdoGetMyPaymentsParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("seller-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("trans-create-date-from");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("trans-create-date-to");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("trans-page-limit");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("trans-offset");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("pay-trans-payment");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.UserPaymentStruct;");
		formalParams.add(p);
	}

	private void setdoGetMyPayoutsParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("trans-create-date-from");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("trans-create-date-to");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("trans-page-limit");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("trans-offset");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("pay-trans-payout");
		p.setMode(Constants.OUT_MODE);
		p.setType("[LAllegroWebApi.UserPayoutStruct;");
		formalParams.add(p);
	}

	private void setdoChangeQuantityItemParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-id");
		p.setMode(Constants.INOUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("new-item-quantity");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("item-info");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoShowUserPageParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("webapi-key");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("country-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("user-page-content");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

	private void setdoSendEmailToUserParameters(List formalParams) {

		Parameter p = new Parameter();
		p.setName("session-handle");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("mail-to-user-item-id");
		p.setMode(Constants.IN_MODE);
		p.setType("long");
		formalParams.add(p);

		p = new Parameter();
		p.setName("mail-to-user-receiver-id");
		p.setMode(Constants.INOUT_MODE);
		p.setType("javax.xml.rpc.holders.LongHolder");
		formalParams.add(p);

		p = new Parameter();
		p.setName("mail-to-user-subject-id");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("mail-to-user-option");
		p.setMode(Constants.IN_MODE);
		p.setType("int");
		formalParams.add(p);

		p = new Parameter();
		p.setName("mail-to-user-message");
		p.setMode(Constants.IN_MODE);
		p.setType("java.lang.String");
		formalParams.add(p);

		p = new Parameter();
		p.setName("mail-to-user-result");
		p.setMode(Constants.OUT_MODE);
		p.setType("javax.xml.rpc.holders.StringHolder");
		formalParams.add(p);
	}

}
