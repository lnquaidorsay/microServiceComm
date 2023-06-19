package com.ln.customerservice.repository;

import com.ln.customerservice.models.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCustomer", types = Customer.class)
public interface CustomerProjection extends Projection {
    @Value("#{target.id}")
    public Long getId();
    public String getName();
    public String getEmail();
}
