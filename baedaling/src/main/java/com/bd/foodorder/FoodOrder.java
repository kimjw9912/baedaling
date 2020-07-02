package com.bd.foodorder;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author sist
 *
 */
public class FoodOrder {
	private int foodorderNum;
	private int foodOrderTotalPrice;
	private int foodOrderPay;
	private String foodOrderState;
	private String foodOrderAddr;
	private String foodOrderDeliveryMethod;
	private String foodOrderHowPay;
	private String foodOrderDate; //주문시간
	private String foodOrderCompletionDate; //주문 완료시간
	private String foodOrderPayCompletionDate; //결제 완료시간 
	private String memo;
	private int idx;
	private int restaurantsNum;
	private Map<String, Object> mSales;
	
	//가맹점 상세정보 
	private String name;
	private String introduce;
	private String openingHour;
	private String endingHour;
	private String fctel;
	private String mutualName; 
	private String licenseNumber;
	private String origin;
	private String minorder;
	private String deliTime;
	private String zip;
	private String addr1;
	private String addr2;
	  
	//파일 
	private int fileNum;
	private String saveFilename;
	private int separate;
	private List<MultipartFile> upload;

	public int getSeparate() {
		return separate;
	}
	public void setSeparate(int separate) {
		this.separate = separate;
	}
	public int getFileNum() {
		return fileNum;
	}
	public void setFileNum(int fileNum) {
		this.fileNum = fileNum;
	}
	
	public String getSaveFilename() {
		return saveFilename;
	}
	public void setSaveFilename(String saveFilename) {
		this.saveFilename = saveFilename;
	}
	public List<MultipartFile> getUpload() {
		return upload;
	}
	public void setUpload(List<MultipartFile> upload) {
		this.upload = upload;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getFctel() {
		return fctel;
	}
	public void setFctel(String fctel) {
		this.fctel = fctel;
	}
	public String getMinorder() {
		return minorder;
	}
	public void setMinorder(String minorder) {
		this.minorder = minorder;
	}
	public String getDeliTime() {
		return deliTime;
	}
	public void setDeliTime(String deliTime) {
		this.deliTime = deliTime;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getOpeningHour() {
		return openingHour;
	}
	public void setOpeningHour(String openingHour) {
		this.openingHour = openingHour;
	}
	public String getEndingHour() {
		return endingHour;
	}
	public void setEndingHour(String endingHour) {
		this.endingHour = endingHour;
	}
	
	public String getMutualName() {
		return mutualName;
	}
	public void setMutualName(String mutualName) {
		this.mutualName = mutualName;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Map<String, Object> getmSales() {
		return mSales;
	}
	public void setmSales(Map<String, Object> mSales) {
		this.mSales = mSales;
	}
	public int getRestaurantsNum() {
		return restaurantsNum;
	}
	public void setRestaurantsNum(int restaurantsNum) {
		this.restaurantsNum = restaurantsNum;
	}
	
	//orderdetail
	private int menuNum;
	private int orderOnePrice;
	private int qty;
	private String menuName;
	
	//매출 
	private int todaySales;
	private int monthSales;
	private int annualSales;
	
	//베스트메뉴
	private String bestSales;
	
	public String getBestSales() {
		return bestSales;
	}
	public void setBestSales(String bestSales) {
		this.bestSales = bestSales;
	}
	public int getTodaySales() {
		return todaySales;
	}
	public void setTodaySales(int todaySales) {
		this.todaySales = todaySales;
	}
	
	public int getAnnualSales() {
		return annualSales;
	}
	public void setAnnualSales(int annualSales) {
		this.annualSales = annualSales;
	}
	public int getMonthSales() {
		return monthSales;
	}
	public void setMonthSales(int monthSales) {
		this.monthSales = monthSales;
	}

	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getFoodorderNum() {
		return foodorderNum;
	}
	public void setFoodorderNum(int foodorderNum) {
		this.foodorderNum = foodorderNum;
	}
	public int getFoodOrderTotalPrice() {
		return foodOrderTotalPrice;
	}
	public void setFoodOrderTotalPrice(int foodOrderTotalPrice) {
		this.foodOrderTotalPrice = foodOrderTotalPrice;
	}
	public int getFoodOrderPay() {
		return foodOrderPay;
	}
	public void setFoodOrderPay(int foodOrderPay) {
		this.foodOrderPay = foodOrderPay;
	}
	public String getFoodOrderState() {
		return foodOrderState;
	}
	public void setFoodOrderState(String foodOrderState) {
		this.foodOrderState = foodOrderState;
	}
	public String getFoodOrderAddr() {
		return foodOrderAddr;
	}
	public void setFoodOrderAddr(String foodOrderAddr) {
		this.foodOrderAddr = foodOrderAddr;
	}
	public String getFoodOrderDeliveryMethod() {
		return foodOrderDeliveryMethod;
	}
	public void setFoodOrderDeliveryMethod(String foodOrderDeliveryMethod) {
		this.foodOrderDeliveryMethod = foodOrderDeliveryMethod;
	}
	public String getFoodOrderHowPay() {
		return foodOrderHowPay;
	}
	public void setFoodOrderHowPay(String foodOrderHowPay) {
		this.foodOrderHowPay = foodOrderHowPay;
	}
	public String getFoodOrderDate() {
		return foodOrderDate;
	}
	public void setFoodOrderDate(String foodOrderDate) {
		this.foodOrderDate = foodOrderDate;
	}
	public String getFoodOrderCompletionDate() {
		return foodOrderCompletionDate;
	}
	public void setFoodOrderCompletionDate(String foodOrderCompletionDate) {
		this.foodOrderCompletionDate = foodOrderCompletionDate;
	}
	public String getFoodOrderPayCompletionDate() {
		return foodOrderPayCompletionDate;
	}
	public void setFoodOrderPayCompletionDate(String foodOrderPayCompletionDate) {
		this.foodOrderPayCompletionDate = foodOrderPayCompletionDate;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getMenuNum() {
		return menuNum;
	}
	public void setMenuNum(int menuNum) {
		this.menuNum = menuNum;
	}
	public int getOrderOnePrice() {
		return orderOnePrice;
	}
	public void setOrderOnePrice(int orderOnePrice) {
		this.orderOnePrice = orderOnePrice;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	
}
