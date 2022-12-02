package com.ernesto.mito6.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "productos")
public class Product {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;

    @Column(nullable = false,length = 50)
    private String name;

    @Column(nullable = false,length = 150)
    private String description;

    @Column(nullable = false, columnDefinition = "decimal(6,2)")
    private Double price;

    @Column(nullable = false)
    private Boolean enabled;


    @ManyToOne
    @JoinColumn(name = "id_Category",nullable = false,foreignKey = @ForeignKey(name = "FK_Product_Category"))
    private Category category;

    public Product(String name, String description, Double price, Boolean enabled, Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.enabled = enabled;
        this.category = category;
    }
}
