package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public void printInfo() {
        System.out.println("Наличие ошибки: " + active);
        System.out.println("Номер ошибки: " + status);
        System.out.println("Сообщение об ошибке: " + message);
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error err = new Error(true, 1, "Not enougth memory");
        err.printInfo();
    }
}
