package com.ernesto.mito6.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategory")
    private Integer idCategory;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, name = "descriptionTest")
    private String description;

    @Column(nullable = false)
    private Boolean enabled;
}
