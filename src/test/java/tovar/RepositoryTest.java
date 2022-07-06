package tovar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RepositoryTest {

    Book book1 = new Book(1, "Тайные виды на гору фудзи", "Виктор Пелевин");
    Book book2 = new Book(2, "Sapiens.Краткая история человечества", "Юваль Ной Харрари");
    Smartphone phone1 = new Smartphone(3, "iPhone Xr", "Apple");


    @Test
    void saveTest() {
        Repository repo = new Repository();
        repo.save(book1);

        Product[] expected = {book1};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    void saveTwoTest() {
        Repository repo = new Repository();
        repo.save(book1);
        repo.save(book2);
        repo.save(phone1);

        Product[] expected = {book1, book2, phone1};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    void saveThreeTest() {
        Repository repo = new Repository();

        Product[] expected = {};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void findAllTest() {
        Repository repo = new Repository();
        repo.save(book2);

        Product[] expected = {book2};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    void findAllTwoTest() {
        Repository repo = new Repository();

        Product[] expected = {};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    void deletingByIdTest() {
        Repository repo = new Repository();
        repo.save(book1);
        repo.save(book2);
        repo.save(phone1);
        repo.removeById(3);

        Product[] expected = {book1, book2};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void deletingByIdTwoTest() {
        Repository repo = new Repository();
        repo.removeById(1);

        Product[] expected = {};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(actual, expected);

    }
}
