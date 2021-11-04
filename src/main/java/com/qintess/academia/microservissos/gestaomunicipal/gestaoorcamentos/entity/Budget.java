package com.qintess.academia.microservissos.gestaomunicipal.gestaoorcamentos.entity;

import java.util.Collection;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.qintess.academia.microservissos.gestaomunicipal.gestaoorcamentos.enums.Folder;
import com.qintess.academia.microservissos.gestaomunicipal.gestaoorcamentos.enums.Origem;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double totalAmount;
    private Double spentAmount;

    @ElementCollection(fetch = FetchType.EAGER)
    Collection<Folder> possibleDestinations;
    
    @Enumerated(EnumType.STRING)
    private Origem origin;
}
