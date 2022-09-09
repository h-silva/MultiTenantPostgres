package com.heitor.MultiTenantPostgres;

import com.heitor.MultiTenantPostgres.configuration.web.ThreadTenantStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MultiTenantPostgresApplication {

	public static void main(String[] args) {
		ThreadTenantStorage.setTenantId("grupo-0");
		SpringApplication.run(MultiTenantPostgresApplication.class, args);
	}

}
