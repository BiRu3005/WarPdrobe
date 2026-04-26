package WarPdrobe.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")

public class Cliente {

    
    @Id // será la PK de cada objeto de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY) // valor generado automaticamente segun una etsrategia (documentacion)
    private Long id; // tipo de dato

    @Column(nullable = false, length = 100)
    private String nombre; // tipo de dato

    @Column(unique = true, nullable = false)
    private String email;

    // etiqueta column solo sirve para modificar comportamientos base. JPA asume que cada atributo es una columna
    private String telefono;

    // constructor vacio necesario para JPA
    protected Cliente() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
