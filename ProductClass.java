package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProductClass {
    public static void main(String [] args){
        List<Product> l1=new ArrayList<>();
        Product p1=new Product("cooker","electronic",101,2000);
        Product p2=new Product("tv","electronic",102,25000);
        Product p3=new Product("heater","electronic",103,1000);
        Stream<Product> product = l1.stream();
        product.filter(x->x.getPrice()<25000 && x.getCategory()=="electronic").
                forEach(x->System.out.println(x.getProductName()));
    }
}
