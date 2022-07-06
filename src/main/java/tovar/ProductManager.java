package tovar;

public class ProductManager {
    private Repository repo;


    public ProductManager(Repository repo) {
        this.repo = repo;

    }

    public void add(Product things) {
        this.repo.save(things);
    }

    public boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            return false;
        }
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : repo.findAll()) {
            if (matches(product, text)) {
                Product tmp[] = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];

                }
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }

}



