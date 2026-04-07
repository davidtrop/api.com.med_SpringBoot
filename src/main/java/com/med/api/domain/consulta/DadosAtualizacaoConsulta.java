package com.med.api.domain.consulta;

import com.med.api.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoConsulta(@NotNull Long id, String nome, String telefone, DadosEndereco endereco) {
}
