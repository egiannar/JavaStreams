package filter.demos;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
public class FilterDemo4 {

    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1, "Giannis", 25000));
        productsList.add(new Product(2, "John", 30000));
        productsList.add(new Product(3, "Mitsos", 28000));
        productsList.add(new Product(4, "Giorgos", 23000));
        productsList.add(new Product(5, "George", 900));

        productsList
                .stream()
                .filter(pr -> pr.price>25000)//condition
                .forEach(pr -> System.out.println(pr.price));//iterating
        //in the forEach method I add an action for every element of the collection

    }

}
