package com.example.shardingsphere;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataShardingsphereApplication implements CommandLineRunner{
	private static Logger    LOG = LoggerFactory
      .getLogger(SpringDataShardingsphereApplication.class);

	@Autowired InvoiceRepository invoiceRepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringDataShardingsphereApplication.class, args);
	}
	@Override
    public void run(String... args) {
        LOG.info("EXECUTING : command line runner");
 
        List<Invoice> invoice = invoiceRepo.findByYear(2015);
		LOG.info("invoice size "+invoice.size());
		if( invoice.size()>0)
			LOG.info("invoice size "+invoice.get(0).getInvoiceId());
    }

}
