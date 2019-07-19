package com.cts.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BillBeanConfigure {
	@Bean
	@Scope(value="prototype")
	public Bill getBookBean(){
		return new Bill();
	}
	
	@Bean
	@Scope(value="prototype")
	public Customer getCustomerBean() {
		return new Customer();
	}
	
	@Bean
	@Scope(value="prototype")
	public PurchaseDetails getPurchaseDetailsBean() {
		return new PurchaseDetails() ;
	}
	
	/*@Bean
    public PurchaseDetails getElement() {
        return new PurchaseDetails(1,2,100);
    }
 
    @Bean
    public PurchaseDetails getAnotherElement() {
        return new PurchaseDetails(2,3,150);
    }
 
    @Bean
    public PurchaseDetails getOneMoreElement() {
        return new PurchaseDetails(4,5,200);
    }*/
}
