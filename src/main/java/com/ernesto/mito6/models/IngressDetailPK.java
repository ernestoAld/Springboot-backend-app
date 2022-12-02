package com.ernesto.mito6.models;

import lombok.EqualsAndHashCode;

import javax.persistence.Embeddable;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class IngressDetailPK implements Serializable {

    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "id_ingress", nullable = false, foreignKey = @ForeignKey(name = "FK_IngressDetail_Ingress"))
    private Ingress ingress;

    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "id_product", nullable = false, foreignKey = @ForeignKey(name = "FK_IngressDetail_Product"))
    private Product product;

}
