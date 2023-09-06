package com.acner.domain.validation;

import com.acner.domain.exception.DomainException;
import com.acner.domain.exception.Violation;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ObjectsValidation {
    private static final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    public static void validAndThorow(Object object) {
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(object);
        List<Violation> violations = new ArrayList<>();
        for (ConstraintViolation constraint : constraintViolations) {
            Violation violation = new Violation(constraint.getMessage());
            violations.add(violation);
        }
        if (violations.isEmpty()) return;

        throw new DomainException(violations);
    }
}
