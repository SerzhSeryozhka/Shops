package KSA;


import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ProductService {
    public ArrayList<Product> listProduct(){
        ArrayList<Product> liP = new ArrayList<>(10);
//        liP.add(1, );
        return liP;
    }
}
