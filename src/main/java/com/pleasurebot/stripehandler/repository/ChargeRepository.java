package com.pleasurebot.stripehandler.repository;

import com.pleasurebot.stripehandler.model.Charge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargeRepository extends JpaRepository<Charge, String> {
}
