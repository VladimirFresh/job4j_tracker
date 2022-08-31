package ru.job4j.early;

public class ValidatorResult {
        public enum Status {
            VALID, INVALID
        }

        public Status status;

        public String message;

        public ValidatorResult(Status status, String message) {
            this.status = status;
            this.message = message;
        }
}
