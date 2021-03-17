package org.gauge.iconic.utils;

import org.hamcrest.MatcherAssert;

import java.util.List;
import java.util.function.Predicate;


public class NumericalListValidator {

    private final List<Float> validationList;

    public NumericalListValidator(List<Float> validationList) {
        this.validationList = validationList;
    }

    public NumericalListValidator validateNotEmpty() {
        MatcherAssert.assertThat("List is empty", !(validationList.size() <= 0));
        return this;
    }

    public void validateNoItemsAreZero() {
        Predicate<Float> notEquals = s -> s <= 0F;
        boolean didFind = validationList.stream().noneMatch(notEquals);
        MatcherAssert.assertThat("Items priced for free in response list", didFind);
    }

}

