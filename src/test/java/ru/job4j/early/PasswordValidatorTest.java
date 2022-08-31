package ru.job4j.early;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    public void whenException() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    PasswordValidator.validate(null);
                }
        );
        assertEquals("Password cannot be null", exception.getMessage());
    }

    @Test
    public void whenPasswordContainsQwerty() {
        String password = "Qwerty";
        PasswordValidator.validate(password);
        ValidatorResult.Status status = PasswordValidator.validate(password).status;
        String message = PasswordValidator.validate(password).message;
        Assert.assertEquals(status, ValidatorResult.Status.INVALID);
        Assert.assertEquals(message, "Password must not contains qwerty, admin, user, password, 12345");
    }

    @Test
    public void whenPasswordContainsAdmin() {
        String password = "Admin";
        PasswordValidator.validate(password);
        ValidatorResult.Status status = PasswordValidator.validate(password).status;
        String message = PasswordValidator.validate(password).message;
        Assert.assertEquals(status, ValidatorResult.Status.INVALID);
        Assert.assertEquals(message, "Password must not contains qwerty, admin, user, password, 12345");
    }

    @Test
    public void whenPasswordContainsUser() {
        String password = "User";
        PasswordValidator.validate(password);
        ValidatorResult.Status status = PasswordValidator.validate(password).status;
        String message = PasswordValidator.validate(password).message;
        Assert.assertEquals(status, ValidatorResult.Status.INVALID);
        Assert.assertEquals(message, "Password must not contains qwerty, admin, user, password, 12345");
    }

    @Test
    public void whenPasswordContainsPassword() {
        String password = "Password";
        PasswordValidator.validate(password);
        ValidatorResult.Status status = PasswordValidator.validate(password).status;
        String message = PasswordValidator.validate(password).message;
        Assert.assertEquals(status, ValidatorResult.Status.INVALID);
        Assert.assertEquals(message, "Password must not contains qwerty, admin, user, password, 12345");
    }

    @Test
    public void whenPasswordContains12345() {
        String password = "User";
        PasswordValidator.validate(password);
        ValidatorResult.Status status = PasswordValidator.validate(password).status;
        String message = PasswordValidator.validate(password).message;
        Assert.assertEquals(status, ValidatorResult.Status.INVALID);
        Assert.assertEquals(message, "Password must not contains qwerty, admin, user, password, 12345");
    }

    @Test
    public void whenPasswordLengthLessThan8() {
        String password = "Short";
        PasswordValidator.validate(password);
        ValidatorResult.Status status = PasswordValidator.validate(password).status;
        String message = PasswordValidator.validate(password).message;
        Assert.assertEquals(status, ValidatorResult.Status.INVALID);
        Assert.assertEquals(message, "Password must contains 8 - 32 symbols");
    }

    @Test
    public void whenPasswordLengthMoreThan32() {
        String password = "Thisoneistoolongtopassvalidation123{";
        PasswordValidator.validate(password);
        ValidatorResult.Status status = PasswordValidator.validate(password).status;
        String message = PasswordValidator.validate(password).message;
        Assert.assertEquals(status, ValidatorResult.Status.INVALID);
        Assert.assertEquals(message, "Password must contains 8 - 32 symbols");
    }

    @Test
    public void whenPasswordNotContainsUppercaseSymbols() {
        String password = "withoutupper";
        PasswordValidator.validate(password);
        ValidatorResult.Status status = PasswordValidator.validate(password).status;
        String message = PasswordValidator.validate(password).message;
        Assert.assertEquals(status, ValidatorResult.Status.INVALID);
        Assert.assertEquals(message, "Password must contains uppercase symbols");
    }

    @Test
    public void whenPasswordNotContainsLowercaseSymbols() {
        String password = "WITHOUTLOWER";
        PasswordValidator.validate(password);
        ValidatorResult.Status status = PasswordValidator.validate(password).status;
        String message = PasswordValidator.validate(password).message;
        Assert.assertEquals(status, ValidatorResult.Status.INVALID);
        Assert.assertEquals(message, "Password must contains lowercase symbols");
    }

    @Test
    public void whenPasswordNotContainsDigits() {
        String password = "WithoutDigits";
        PasswordValidator.validate(password);
        ValidatorResult.Status status = PasswordValidator.validate(password).status;
        String message = PasswordValidator.validate(password).message;
        Assert.assertEquals(status, ValidatorResult.Status.INVALID);
        Assert.assertEquals(message, "Password must contains digits");
    }

    @Test
    public void whenPasswordNotContainsSpecialSymbols() {
        String password = "WithoutSpecials1";
        PasswordValidator.validate(password);
        ValidatorResult.Status status = PasswordValidator.validate(password).status;
        String message = PasswordValidator.validate(password).message;
        Assert.assertEquals(status, ValidatorResult.Status.INVALID);
        Assert.assertEquals(message, "Password must contains special symbols");
    }

    @Test
    public void whenPasswordIsValid() {
        String password = "ValidPass1!";
        PasswordValidator.validate(password);
        ValidatorResult.Status status = PasswordValidator.validate(password).status;
        String message = PasswordValidator.validate(password).message;
        Assert.assertEquals(status, ValidatorResult.Status.VALID);
        Assert.assertEquals(message, "Valid");
    }

}