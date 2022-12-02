package com.ernesto.mito6.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "sales")
public class Sale {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSale;

    @Column(nullable = false)
    private LocalDateTime dateTime;

    @Column(columnDefinition = "decimal(6,2)", nullable = false)
    private Double total;

    @Column(columnDefinition = "decimal(6,2)", nullable = false)
    private Double tax;

    //---------------RELATIONS---------------------

    @ManyToOne
    @JoinColumn(name = "idCliente", foreignKey = @ForeignKey(name = "FK_Sale_Client"),nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idUser", foreignKey = @ForeignKey(name = "FK_Sale_User"),nullable = false)
    private User user;

    @OneToMany(mappedBy = "sale",cascade = CascadeType.ALL, fetch = FetchType.LAZY) //Aqui indicamos el nombre del atributo por el cual estoy haciendo el enlace Clase SaleDetail: atributo sale;
    private List<SaleDetail> details = new ArrayList<>();

}
