package WarPdrobe.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "prendas")
public class Prenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // Muchas prendas pueden pertenecer a un mismo cliente
    @JoinColumn(name = "cliente_id", nullable = false) // Nombre de la columna FK en la tabla prendas
    private Cliente clienteDueno; 

    protected Prenda() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getClienteDueno() {
        return clienteDueno;
    }

    public void setClienteDueno(Cliente clienteDueno) {
        this.clienteDueno = clienteDueno;
    }

}
