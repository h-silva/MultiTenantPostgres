package com.heitor.MultiTenantPostgres.repository;

import com.heitor.MultiTenantPostgres.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Long> {

    List<Client> findAllByActive(Boolean active);
}
