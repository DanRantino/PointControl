package com.dio.pointcontrol.model;

import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {
    private long id;
    private TipoData tipoData;
    private LocalDateTime dataEspecial;
}
