package com.acner.domain;

import com.acner.domain.exception.DomainException;
import com.acner.domain.exception.Violation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static com.acner.domain.validation.ConstanteMensagem.NUMERO_INVALIDO;
import static org.junit.jupiter.api.Assertions.*;

class IntegracaoTest {
    @ParameterizedTest
    @NullSource
    @EmptySource
    void numeroInvalido(String value) {
        DomainException domainException = assertThrows(DomainException.class, () -> Integracao.create(value));
        Assertions.assertTrue(domainException.getViolations().contains(new Violation(NUMERO_INVALIDO)));
    }
}