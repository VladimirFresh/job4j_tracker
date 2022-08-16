package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactTest {
    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                   Fact fact = new Fact();
                   fact.calc(-2);
                });
        assertThat(exception.getMessage()).isEqualTo("n could not be less than 0");
    }
}