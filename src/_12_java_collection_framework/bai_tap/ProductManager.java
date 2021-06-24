package _12_java_collection_framework.bai_tap;

import java.util.*;

public class ProductManager {
    private static boolean check = false;
    private static Scanner scanner = new Scanner(System.in);
    public static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("-----Product Manager-----");
        while (true) {
            System.out.println("1. List Of Product");
            System.out.println("2. Add Product");
            System.out.println("3. Rename Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Find Product");
            System.out.println("6. Descending Product");
            System.out.println("7. Ascending Product");
            System.out.println("8. Exit Program");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    renameProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    findProduct();
                    break;
                case 6:
                    descending();
                    break;
                case 7:
                    ascending();
                    break;
                case 8:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please enter correct number");
            }
        }
    }

    private static void displayProduct() {
        for (Product product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }

    private static void addProduct() {
        System.out.println("Enter new product id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter new product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new product price: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        products.add(product);
    }

    private static void renameProduct() {
        System.out.println("Enter product you want to change name");
        String name = scanner.nextLine();
        for (Product renameProduct : products) {
            if (renameProduct.getName().equals(name)) {
                System.out.println("Enter product new name: ");
                String newName = scanner.nextLine();
                renameProduct.setName(newName);
                check = true;
                break;
            }
        }
    }

    private static void deleteProduct() {
        System.out.println("Enter id of product you want to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product delProduct : products) {
            if (delProduct.getId() == id) {
                products.remove(delProduct);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Found no id");
        }
    }

    private static void findProduct() {
        System.out.println("Enter name of product");
        String name = scanner.nextLine();
        if (products.isEmpty()) {
            System.out.println("No product");
        } else {
            for (Product findProduct : products) {
                if (findProduct.getName().equals(name)) {
                    System.out.println("Product name: " + findProduct.getName());
                } else {
                    System.out.println("No product");
                }
            }
        }
    }

    private static void descending() {
        Collections.sort(products, new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
        System.out.println("The price list after sort: ");
        displayProduct();
    }

    private static void ascending() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        System.out.println("The price list after sort: ");
        displayProduct();
    }
}
