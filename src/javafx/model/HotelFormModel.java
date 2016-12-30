package javafx.model;

public class HotelFormModel {
	
	public HotelFormModel(){
		
	}
	
	//general information
	private long code;
	private String client_status;
	private String checkIn;
	private String checkOut;
	private int nights;
	private int rooms;
	private boolean car;
	private String clientBookTime;
	
	
	//payment information
	private String payMethod;
	private String cardNumber;
	private String securityCode;
	private String exparationDate;
	private String invoiceNumber;
	private double totalPay;
	private double paid;
	
	//customer information
	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private String companyName;
	private String adress1;
	private String adress2;
	private String country;
	private String phone;
	private String email;
	
	/**
	 * @return the code
	 */
	public long getCode() {
		return code;
	}



	/**
	 * @param code the code to set
	 */
	public void setCode(long code) {
		this.code = code;
	}



	/**
	 * @return the client_status
	 */
	public String getClient_status() {
		return client_status;
	}



	/**
	 * @param client_status the client_status to set
	 */
	public void setClient_status(String client_status) {
		this.client_status = client_status;
	}



	/**
	 * @return the checkIn
	 */
	public String getCheckIn() {
		return checkIn;
	}



	/**
	 * @param checkIn the checkIn to set
	 */
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}



	/**
	 * @return the checkOut
	 */
	public String getCheckOut() {
		return checkOut;
	}



	/**
	 * @param checkOut the checkOut to set
	 */
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}



	/**
	 * @return the nights
	 */
	public int getNights() {
		return nights;
	}



	/**
	 * @param nights the nights to set
	 */
	public void setNights(int nights) {
		this.nights = nights;
	}



	/**
	 * @return the rooms
	 */
	public int getRooms() {
		return rooms;
	}



	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}



	/**
	 * @return the car
	 */
	public boolean isCar() {
		return car;
	}



	/**
	 * @param car the car to set
	 */
	public void setCar(boolean car) {
		this.car = car;
	}



	/**
	 * @return the clientBookTime
	 */
	public String getClientBookTime() {
		return clientBookTime;
	}



	/**
	 * @param clientBookTime the clientBookTime to set
	 */
	public void setClientBookTime(String clientBookTime) {
		this.clientBookTime = clientBookTime;
	}



	/**
	 * @return the payMethod
	 */
	public String getPayMethod() {
		return payMethod;
	}



	/**
	 * @param payMethod the payMethod to set
	 */
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}



	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}



	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}



	/**
	 * @return the securityCode
	 */
	public String getSecurityCode() {
		return securityCode;
	}



	/**
	 * @param securityCode the securityCode to set
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}



	/**
	 * @return the exparationData
	 */
	public String getExparationData() {
		return exparationDate;
	}



	/**
	 * @param exparationData the exparationData to set
	 */
	public void setExparationData(String exparationData) {
		this.exparationDate = exparationData;
	}



	/**
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}



	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}



	/**
	 * @return the totalPay
	 */
	public double getTotalPay() {
		return totalPay;
	}



	/**
	 * @param totalPay the totalPay to set
	 */
	public void setTotalPay(double totalPay) {
		this.totalPay = totalPay;
	}



	/**
	 * @return the paid
	 */
	public double getPaid() {
		return paid;
	}



	/**
	 * @param paid the paid to set
	 */
	public void setPaid(double paid) {
		this.paid = paid;
	}



	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}



	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}



	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}



	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}



	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}



	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}



	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}



	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	/**
	 * @return the adress1
	 */
	public String getAdress1() {
		return adress1;
	}



	/**
	 * @param adress1 the adress1 to set
	 */
	public void setAdress1(String adress1) {
		this.adress1 = adress1;
	}



	/**
	 * @return the adress2
	 */
	public String getAdress2() {
		return adress2;
	}



	/**
	 * @param adress2 the adress2 to set
	 */
	public void setAdress2(String adress2) {
		this.adress2 = adress2;
	}



	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}



	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}



	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}



	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/**
	 * @param code
	 * @param client_status
	 * @param checkIn
	 * @param checkOut
	 * @param nights
	 * @param rooms
	 * @param car
	 * @param clientBookTime
	 * @param payMethod
	 * @param cardNumber
	 * @param securityCode
	 * @param exparationData
	 * @param invoiceNumber
	 * @param totalPay
	 * @param paid
	 * @param title
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param companyName
	 * @param adress1
	 * @param adress2
	 * @param country
	 * @param phone
	 * @param email
	 */
	
	
	
	public HotelFormModel(long code, String client_status, String checkIn, String checkOut, int nights, int rooms,
			boolean car, String clientBookTime, String payMethod, String cardNumber, String securityCode,
			String exparationData, String invoiceNumber, double totalPay, double paid, String title, String firstName,
			String middleName, String lastName, String companyName, String adress1, String adress2, String country,
			String phone, String email) {
		super();
		this.code = code;
		this.client_status = client_status;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.nights = nights;
		this.rooms = rooms;
		this.car = car;
		this.clientBookTime = clientBookTime;
		this.payMethod = payMethod;
		this.cardNumber = cardNumber;
		this.securityCode = securityCode;
		this.exparationDate = exparationData;
		this.invoiceNumber = invoiceNumber;
		this.totalPay = totalPay;
		this.paid = paid;
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.adress1 = adress1;
		this.adress2 = adress2;
		this.country = country;
		this.phone = phone;
		this.email = email;
	}
	
}
