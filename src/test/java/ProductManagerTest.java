import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tovar.*;

public class ProductManagerTest {

    Repository repo = new Repository();
    ProductManager manager = new ProductManager(repo);

    Book book1 = new Book(1,"Тайные виды на гору фудзи", "Виктор Пелевин");
    Book book2 = new Book(2,"Sapiens.Краткая история человечества", "Юваль Ной Харрари");
    Smartphone phone1 = new Smartphone(3,"iPhone Xr","Apple");

    @Test
    void searchByTest(){
        manager.add(book1);
        manager.add(book2);
        manager.add(phone1);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, phone1};

        Assertions.assertArrayEquals(actual, expected);
    }










}
