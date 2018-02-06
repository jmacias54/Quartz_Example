package mx.com.quartzexample.job;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import mx.com.quartzexample.model.Book;
import mx.com.quartzexample.service.SimpleService;
import mx.com.quartzexample.ws.CallWSBitso;

public class SimpleJob implements Job{
	 private static final Logger LOG = LoggerFactory.getLogger(SimpleJob.class);
	@Autowired
	private SimpleService service;
	
	@Autowired
	private CallWSBitso callWSBitso;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info(" --- execute [ SimpleJob ]--- ");
		
		
		// service.processData();
		
		
		List<Book>  lista = callWSBitso.availableBooks();
		
		if(lista != null  && lista.size() > 0) {
			
			for (Book book : lista) {
				
				LOG.info("--- "+book.getBook());
				LOG.info("--- "+book.getMaximum_price());
				LOG.info("--- "+book.getMinimum_price());
			}  
		}

	}

}
