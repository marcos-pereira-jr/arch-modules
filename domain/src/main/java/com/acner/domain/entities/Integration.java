package com.acner.domain.entities;

import javax.validation.constraints.NotBlank;


import static com.acner.domain.validation.ConstanteMensagem.NUMERO_INVALIDO;
import static com.acner.domain.validation.ObjectsValidation.validAndThorow;

public class Integration {
    @NotBlank(message = NUMERO_INVALIDO)
    private String number;

    private Integration(String number) {
        this.number = number;
    }

    public static Integration create(String numero) {
        Integration integration = new Integration(numero);
        validAndThorow(integration);
        return integration;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
