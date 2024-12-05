package it.epicode.entity;

import it.epicode.entity.entityENUM.Stato;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "partecipazioni")
public class Partecipazione {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToMany
    private List<Persona> persona;

    @ManyToOne
    private Evento evento;
    @Column(name = "stato_conferma")
    @Enumerated(EnumType.STRING)
    private Stato statoConferma;
}
