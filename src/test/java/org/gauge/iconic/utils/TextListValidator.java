package org.gauge.iconic.utils;

import org.hamcrest.MatcherAssert;

import java.util.List;
import java.util.function.Predicate;


public class TextListValidator {

    private final List<String> validationListTexts;

    public TextListValidator(List<String> validationList) {
        this.validationListTexts = validationList;
    }

    public void validateThereAreNoMatchesFor(String field, String stringToValidate) {
        Predicate<String> notEquals = s -> s.equalsIgnoreCase(stringToValidate);
        boolean didFind = validationListTexts.stream().noneMatch(notEquals);
        MatcherAssert.assertThat(String.format("Failed to validate products do not have '%s' - do not expect '%s'", field, stringToValidate), didFind);
    }

    public void validateThatAllValuesHaveMatchesFor(String field, String stringToValidate) {
        Predicate<String> equals = s -> s.contains(stringToValidate.toLowerCase());
        boolean didFind = validationListTexts.stream().allMatch(equals);
        MatcherAssert.assertThat(String.format("Failed to validate all products have '%s' - expected '%s'", field, stringToValidate), didFind);
    }

    private void validateThereAreNoContainsFor(String field, String stringToValidate) {
        Predicate<String> notEquals = s -> s.contains(stringToValidate);
        boolean didFind = validationListTexts.stream().noneMatch(notEquals);
        MatcherAssert.assertThat(String.format("Failed to validate products do not have '%s' - %s", field, stringToValidate), didFind);
    }


    public void validateThatAllValuesHaveNoMatchesFor(String field, List<String> stringToValidate) {
        stringToValidate.forEach(s -> validateThereAreNoContainsFor(field, s));
    }

    public TextListValidator validateListIsNotEmpty() {
        MatcherAssert.assertThat("Failed to validate that there's any content present", !validationListTexts.isEmpty());
        return this;
    }

}

