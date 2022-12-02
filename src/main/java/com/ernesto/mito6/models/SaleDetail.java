package com.ernesto.mito6.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "sale_detail")
public class SaleDetail {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSaleDatail;

    @Column(nullable = false)
    private Short quantity;

    @Column(columnDefinition = "decimal(6,2",nullable = false)
    private Double salesPrice;

    //-------------RELATIONS FOREIGN KEYS------------------

    @ManyToOne
    @JoinColumn(name = "id_sale",nullable = false, foreignKey = @ForeignKey(name = "FK_saleDetail_Sale"))
    private Sale sale;

    @ManyToOne
    @JoinColumn(name = "id_product",nullable = false, foreignKey = @ForeignKey(name = "FK_saleDetail_Product"))
    private Product product;
}
