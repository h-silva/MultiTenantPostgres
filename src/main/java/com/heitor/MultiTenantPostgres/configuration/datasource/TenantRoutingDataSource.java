package com.heitor.MultiTenantPostgres.configuration.datasource;

import com.heitor.MultiTenantPostgres.configuration.web.ThreadTenantStorage;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class TenantRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {

        System.out.println(ThreadTenantStorage.getTenantId());
        return ThreadTenantStorage.getTenantId();
    }

}