package com.heitor.MultiTenantPostgres.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table( schema = "MY_SCHEMA", name = "CDT_CLIENTE")
public class Client {
    @Id
    @Column(name = "cd_id")
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "fg_ativo")
    private Boolean active;
}
