package com.acner.domain.exception;

import java.util.ArrayList;
import java.util.List;

public class DomainException extends RuntimeException {
    public List<Violation> violations = new ArrayList<>();

    public DomainException(List<Violation> violations) {
        this.violations = violations;
    }

    public List<Violation> getViolations() {
        return violations;
    }
}