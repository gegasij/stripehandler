package com.pleasurebot.stripehandler.repository;

import com.pleasurebot.stripehandler.model.Charge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChargeRepository extends JpaRepository<Charge, String> {
    List<Charge> findByEmail(String email);
}
