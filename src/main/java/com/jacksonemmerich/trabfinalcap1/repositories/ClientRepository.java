package com.jacksonemmerich.trabfinalcap1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jacksonemmerich.trabfinalcap1.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
