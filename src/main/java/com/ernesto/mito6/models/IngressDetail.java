package com.ernesto.mito6.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(IngressDetailPK.class)
public class IngressDetail {

    @Id
    private Ingress ingress;

    @Id
    private Product product;

    @Column(nullable = false)
    private Short quantity;

    @Column(columnDefinition = "decimal(6,2)", nullable = false)
    private Double cost;






}
