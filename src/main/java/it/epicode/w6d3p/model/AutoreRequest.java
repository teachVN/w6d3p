package it.epicode.w6d3p.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AutoreRequest {

    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataNascita;
}
