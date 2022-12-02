package com.ernesto.mito6.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "ingress")
public class Ingress {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idIngress;

    @ManyToOne
    @JoinColumn(name = "id_provider",nullable = false,foreignKey = @ForeignKey(name = "FK_Ingress_Provider"))
    private Provider provider;

    @ManyToOne
    @JoinColumn(name = "id_user",nullable = false,foreignKey = @ForeignKey(name = "FK_Ingress_User"))
    private User user;

    @Column(nullable = false)
    private LocalDateTime dateTime;

    @Column(columnDefinition = "decimal(6,2)", nullable = false)
    private Double total;

    @Column(columnDefinition = "decimal(6,2)", nullable = false)
    private Double tax;

    @Column(length = 10,nullable = false)
    private String serialNumber;

    @Column(nullable = false)
    private Boolean enabled;
}
