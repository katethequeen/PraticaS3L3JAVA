package it.epicode.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "persone")
public class Persona {
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)

    private Long id;
    private String nome;
    private String cognome;
    private String email;
    @Column(name = "data_nascita")
    private LocalDate dataNascita;

    @ManyToMany(mappedBy = "persona")
    private List<Partecipazione> partecipazioni = new ArrayList<>();
}
