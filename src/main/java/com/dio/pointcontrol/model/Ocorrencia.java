package com.dio.pointcontrol.model;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Ocorrencia {
    private long id;
    private String nome;
    private String ocorrencia;
}
