package app.repository;

import app.model.Product;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.12.2024
 */

@Repository
public class ProductRepositoryMap implements ProductRepository {

    private final Map<Long, Product> products = new HashMap<>();

    public ProductRepositoryMap() {
        initData();
    }

    private void initData() {
        products.put(1L, new Product(1L, "Apple", new BigDecimal(4)));
        products.put(2L, new Product(2L, "Banana", new BigDecimal(3)));
        products.put(3L, new Product(3L, "Orange", new BigDecimal(6)));

    }

    @Override
    public Product getById(long id) {
        return products.get(id);
    }
}
