package it.epicode.w6d3p.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class BlogPostRequest {

    private String contenuto;
    private String titolo;
    private String categoria;
    private int tempoLettura;

    private int idAutore;
}
