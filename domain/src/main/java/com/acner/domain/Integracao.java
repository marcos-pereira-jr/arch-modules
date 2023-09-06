package com.acner.domain;

import javax.validation.constraints.NotBlank;


import static com.acner.domain.validation.ConstanteMensagem.NUMERO_INVALIDO;
import static com.acner.domain.validation.ObjectsValidation.validAndThorow;

public class Integracao {
    @NotBlank(message = NUMERO_INVALIDO)
    private String numero;

    private Integracao(String numero) {
        this.numero = numero;
    }

    public static Integracao create(String numero) {
        Integracao integracao = new Integracao(numero);
        validAndThorow(integracao);
        return integracao;
    }
}
