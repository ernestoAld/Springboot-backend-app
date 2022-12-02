package com.ernesto.mito6.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "users")
public class User {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;

    @Column(length = 50, nullable = false)
    private String username;

    @Column(length = 60, nullable = false)
    private String password;

    @Column(nullable = false)
    private Boolean enabled;

    @ManyToOne
    @JoinColumn(name = "id_Role", foreignKey = @ForeignKey(name = "FK_User_Role"), nullable = false)
    private Role role;
}
