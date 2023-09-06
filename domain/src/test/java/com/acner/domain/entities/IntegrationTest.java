package com.acner.domain.entities;

import com.acner.domain.exception.DomainException;
import com.acner.domain.exception.Violation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static com.acner.domain.validation.ConstanteMensagem.NUMERO_INVALIDO;
import static org.junit.jupiter.api.Assertions.*;

class IntegrationTest {
    @ParameterizedTest
    @NullSource
    @EmptySource
    void numeroInvalido(String value) {
        DomainException domainException = assertThrows(DomainException.class, () -> Integration.create(value));
        assertTrue(domainException.getViolations().contains(new Violation(NUMERO_INVALIDO)));
    }
}