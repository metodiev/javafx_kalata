package javafx.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javafx.model.HotelFormModel;

public class HotelFormDataAccessor {

	// in real life, use a connection pool....
	private Connection connection;

	public HotelFormDataAccessor(String driverClassName, String dbURL, String user, String password)
			throws SQLException, ClassNotFoundException {
		Class.forName(driverClassName);
		connection = DriverManager.getConnection(dbURL, user, password);
	}

	public void shutdown() throws SQLException {
		if (connection != null) {
			connection.close();
		}
	}

	public List<HotelFormModel> getHotelFormList() throws SQLException {
		try (Statement stmnt = connection.createStatement();
				ResultSet rs = stmnt.executeQuery("select * from hotel_form");) {
			List<HotelFormModel> hotelFormList = new ArrayList<>();
			
			while (rs.next()) {

				// general information
				long code = rs.getLong("client_code");
				String client_status = rs.getString("client_status");
				String checkIn = rs.getString("checkIn");
				String checkOut = rs.getString("checkOut");
				int nights = rs.getInt(5);
				int rooms = rs.getInt(6);
				boolean car = rs.getBoolean("car");
				String clientBookTime = rs.getString("clientBookTime");

				// payment information
				String payMethod = rs.getString("pay_method");
				String cardNumber = rs.getString("card_number");
				String securityCode = rs.getString("security_code");
				String exparationDate = rs.getString("exparation_date");
				String invoiceNumber = rs.getString("invoice_number");
				double totalPay = rs.getDouble("totalpay");
				double paid = rs.getDouble("paid");

				// customer information
				String title = rs.getString("title");
				String firstName = rs.getString("firstName");
				String middleName = rs.getString("middleName");
				String lastName = rs.getString("lastName");
				String companyName = rs.getString("companyName");
				String adress1 = rs.getString("adress1");
				String adress2 = rs.getString("adress2");
				String country = rs.getString("country");
				String phone = rs.getString("phone");
				String email = rs.getString("email");

				HotelFormModel hotelFormModel = new HotelFormModel(code, client_status, checkIn, checkOut, nights,
						rooms, car, clientBookTime, payMethod, cardNumber, securityCode, exparationDate, invoiceNumber,
						totalPay, paid, title, firstName, middleName, lastName, companyName, adress1, adress2, country,
						phone, email);
				hotelFormList.add(hotelFormModel);
			}
			return hotelFormList;
		}
	}

	// other methods, eg. addPerson(...) etc

}
