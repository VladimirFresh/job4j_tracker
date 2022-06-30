package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book invincible = new Book("Invincible", 224);
        Book foundation = new Book("Foundation", 320);
        Book solaris = new Book("Solaris", 288);
        Book cleanCode = new Book("Clean code", 464);
        Book[] library = new Book[4];
        library[0] = invincible;
        library[1] = foundation;
        library[2] = solaris;
        library[3] = cleanCode;
        for (int index = 0; index < library.length; index++) {
            Book book = library[index];
            System.out.println(book.getTitle() + " - " + book.getPages());
        }
        library[0] = cleanCode;
        library[3] = invincible;
        for (int index = 0; index < library.length; index++) {
            System.out.println(library[index].getTitle() + " - " + library[index].getPages());
        }
        for (int index = 0; index < library.length; index++) {
            if ("Clean code".equals(library[index].getTitle())) {
                System.out.println(library[index].getTitle() + " - " + library[index].getPages());
            }
        }

    }
}
