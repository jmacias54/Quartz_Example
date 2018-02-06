package mx.com.quartzexample.ws;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import mx.com.quartzexample.model.AvailableBooks;
import mx.com.quartzexample.model.Book;



@Component
public class CallWSBitso {
	
	
	 private static final Logger LOG = LoggerFactory.getLogger(CallWSBitso.class);

	private static RestTemplate restTemplate ;
	private HttpHeaders headers = new HttpHeaders();
	private static final String available_books = "https://api.bitso.com/v3/available_books/";
	
	
	CallWSBitso(){
		restTemplate = new RestTemplate();
		ClientHttpRequestFactory factory = restTemplate.getRequestFactory();

		if (factory instanceof SimpleClientHttpRequestFactory) {
			((SimpleClientHttpRequestFactory) factory).setConnectTimeout(15 * 1000);
			((SimpleClientHttpRequestFactory) factory).setReadTimeout(15 * 1000);
			LOG.debug("Inicializando rest template 1");
		} else if (factory instanceof HttpComponentsClientHttpRequestFactory) {
			((HttpComponentsClientHttpRequestFactory) factory).setReadTimeout(15 * 1000);
			((HttpComponentsClientHttpRequestFactory) factory).setConnectTimeout(15 * 1000);
			LOG.debug("Inicializando rest template 2");
		}

		restTemplate.setRequestFactory(factory);
		headers.setContentType(MediaType.APPLICATION_JSON);

		
		
	}

	public List<Book> availableBooks() {
		
		LOG.info(" --- availableBooks [ CallWSBitso ]--- ");
		
		restTemplate = new RestTemplate();
		HttpEntity<String> entity = new HttpEntity<String>("Accept=application/json; charset=utf-8", headers);
		AvailableBooks availableBooks = restTemplate.postForObject(available_books, entity, AvailableBooks.class);

		return availableBooks.getPayload();
	}

}
