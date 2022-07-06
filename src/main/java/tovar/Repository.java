package tovar;
public class Repository {

    private Product[] products = new Product[0];

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    // метод сохранения
    public void save(Product things) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = things;
        products = tmp;
    }

    //метод полученя сохраненных
    public Product[] findAll() {
        return products;
    }

    // метод удаленая по id
    public void removeById(int valueOfId) {
        if (products.length != 0) {
            Product[] tmp = new Product[products.length - 1];
            int tmpIndex = 0;

            for (int i = 0; i < products.length; i++) {
                if (products[i].getProductId() != valueOfId) {
                    tmp[tmpIndex] = products[i];
                    tmpIndex++;
                }
            }
            setProducts(tmp);
        }
    }
}
