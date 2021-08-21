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
public class NivelAcesso {
    private long id;
    private String descricao;
    // Relacao Localidade
}
