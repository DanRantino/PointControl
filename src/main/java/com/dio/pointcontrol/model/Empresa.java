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
public class Empresa {
    private long id;
    private String descricao;
    private String cnpj;
    // Colocar me uma entidade separada
    //Endereço
    private String EnderecoEmpresa;
    private String BairroEmpresa;
    private String CidadeEmpresa;
    private String EstadoEmpresa;
    private String NumeroTelefone;
}
