package com.dio.pointcontrol.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {
    private long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
