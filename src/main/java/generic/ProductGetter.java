package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Copyright: Copyright (c) 2022 Dnt
 *
 * @ClassName: ProductGetter
 * @Description: 泛型类使用
 * @version: v1.0.0
 * @author: liumf
 * @date: 16:30 2022/4/2
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 16:30       liumf           v1.1.0
 */
public class ProductGetter<T> {
    private final Random random = new Random();
    private final List<T> productList = new ArrayList<>();

    public void addProduct(T t){
        productList.add(t);
    }
    public T getRandomProduct(){

        return productList.get(random.nextInt(productList.size()));
    }
    public static void main(String[] args) {

        ProductGetter<String> productPool = new ProductGetter<>();

        String[] products = new String[]{"mac电脑","苹果手机iphone","华为phone",};

        for (String product : products) {

            productPool.addProduct(product);
        }
        String randomProduct = productPool.getRandomProduct();

        System.out.println(randomProduct);

    }
}
