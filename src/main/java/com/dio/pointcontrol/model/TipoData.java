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
public class TipoData {
    private long id;
    private String descricao;
}
