package haf.cwrw.service;

import localhost.customerservice_ws.GetCustomerRequest;
import localhost.customerservice_ws.GetCustomerResponse;
import localhost.customerservice_ws.ObjectFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class GetCustomerEndpoint {
	
	@Autowired
	private CustomerService customerService;
	
	@PayloadRoot(localPart = "GetCustomerRequest", namespace = "http://localhost/customerservice-ws/")
	@ResponsePayload
	public GetCustomerResponse getCustomer(@RequestPayload GetCustomerRequest request){
		GetCustomerResponse response = customerService.getCustomerResponse();
	
		return response;
	}

}