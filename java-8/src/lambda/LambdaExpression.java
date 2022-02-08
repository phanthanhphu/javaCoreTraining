package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpression {
    public static void main(String[] args){
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1,"Samsung", 22000f));
        list.add(new Product(1,"Vivo", 20000f));
        list.add(new Product(1,"Nokia", 19000f));
        list.add(new Product(1,"Redmi", 18000f));
        list.add(new Product(1,"Lenevo", 17000f));

        Stream<Product> filterprice = list.stream().filter(p->p.price > 17000);
        filterprice.forEach(product ->{System.out.println(product.name +" : "+ product.price);
        });
        filterprice.forEach(product ->{System.out.println(product.name +" : "+ product.price);
        });
    }
}
