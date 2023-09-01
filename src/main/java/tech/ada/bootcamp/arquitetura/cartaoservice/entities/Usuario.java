package tech.ada.bootcamp.arquitetura.cartaoservice.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@Table(name = "usuario")
@NoArgsConstructor
public class Usuario {

    @Id
    private String identificador;

    private String nome;



}
