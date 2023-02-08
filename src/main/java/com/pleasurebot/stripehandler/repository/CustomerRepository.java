package com.pleasurebot.stripehandler.repository;

import com.pleasurebot.stripehandler.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
}
