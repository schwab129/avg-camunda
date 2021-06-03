package de.hka.iwi.avg.Haendler;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import spinjar.com.fasterxml.jackson.databind.ObjectMapper;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Logger;

public class GetCustomerData implements JavaDelegate {

	private final Logger log = Logger.getLogger(GetCustomerData.class.getName());
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		URL url = new URL("http://localhost:3000/customers/1");

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

        //Getting the response code
        int responsecode = conn.getResponseCode();

        if (responsecode != 200) {
            throw new RuntimeException("HttpResponseCode: " + responsecode);
        } else {
        	ObjectMapper mapper = new ObjectMapper();
        	
        	Customer customer = mapper.readValue(new URL("http://localhost:3000/customers/1"), Customer.class);

            log.info(customer.toString());
        }
	}

}
