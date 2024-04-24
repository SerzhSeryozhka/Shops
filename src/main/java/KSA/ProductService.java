package KSA;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Scanner;

@Component
public class ProductService {
    public ArrayList<Product[]> listProduct(){
        ArrayList<Product[]> products = new ArrayList<>();
        Product[] product = {new Product(1, "Potato", 5),
                new Product(2, "Potato", 5),
                new Product(3, "Помидоры", 15),
                new Product(4, "Томаты", 25),
                new Product(5, "Морковь", 5.5),
                new Product(6, "Carrot baby", 67.5),
                new Product(7, "Cows milk", 98),
                new Product(8, "Козье молоко", 152),
                new Product(9, "Не молоко", 304),
                new Product(10, "Картофель", 3.97)};
        products.add(product);
        return products;
    }
    public void output(){
        for (Product[] products : listProduct()) {
            System.out.print(products);
        }

    }
    public poisk(Product[] products){
        Scanner scanner=new Scanner(System.in);
        String x=scanner.next();
        for (int i=0; i<10;i++)
            if (products =x
    }
}
