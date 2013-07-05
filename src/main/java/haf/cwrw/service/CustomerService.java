package haf.cwrw.service;

import localhost.customerservice_ws.Address;
import localhost.customerservice_ws.Customer;
import localhost.customerservice_ws.GetCustomerResponse;

import org.springframework.stereotype.Component;



@Component
public class CustomerService {
	
 public GetCustomerResponse getCustomerResponse(){
	 return generateCustomer();
 }
 
 private GetCustomerResponse generateCustomer(){
	 GetCustomerResponse response = new GetCustomerResponse();
	 Customer customer = new Customer();
	 customer.setForeName("forename");
	 customer.setMiddleName("middlename");
	 customer.setSurname("surname");
	 
	 Address address = new Address();
	 address.setAddressLine1("Line 1");
	 address.setAddressLine2("Line 2");
	 address.setCity("City");
	 address.setPostCode("PostCode");
	 
	 response.setCustomer(customer);
	 response.setAddress(address);
	 
	 return response;
 }
}
