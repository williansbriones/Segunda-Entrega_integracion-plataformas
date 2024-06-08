package com.duoc.integracion_plataformas.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "cashier")
public class CashierEntity {
  @Id
  @ColumnDefault("nextval('cashier_id_seq'")
  @Column(name = "id", nullable = false)
  private Long id;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @ColumnDefault("nextval('cashier_id_store_seq'")
  @JoinColumn(name = "id_store", nullable = false)
  private StoreEntity Store;

  @Size(max = 250)
  @Column(name = "name", length = 250)
  private String name;
}
