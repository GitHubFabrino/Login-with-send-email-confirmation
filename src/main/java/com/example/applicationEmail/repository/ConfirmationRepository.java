package com.example.applicationEmail.repository;

import com.example.applicationEmail.domain.Confirmation;
import com.example.applicationEmail.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmationRepository extends JpaRepository<Confirmation, Long> {
    Confirmation findByToken(String token);
}
