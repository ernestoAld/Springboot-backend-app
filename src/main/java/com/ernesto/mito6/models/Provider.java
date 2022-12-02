package com.ernesto.mito6.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "providers")
public class Provider {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProvider;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 150)
    private String address;

    @Column(nullable = false)
    private Boolean enabled;


}
