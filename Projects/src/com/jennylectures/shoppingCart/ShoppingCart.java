package com.jennylectures.shoppingCart;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
class Item{
    String name;
    int quantity;
    double price;
    public Item(String name,int quantity,double price){
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    public double getTotal(){
        return quantity*price;
    }
    @Override
    public String toString(){
        return name+" [ Quantity : "+quantity+", price : "+price+" ,total: "+getTotal()+" ]";
    }
}
public class ShoppingCart {
    public static void main(String[] args) {
    LinkedList<Item> cart=new LinkedList<>();
    Scanner sc=new Scanner(System.in);
    while(true) {
        System.out.println("Shopping Cart Menu:");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. Update Quantity and Price");
        System.out.println("4. View First Added Item");
        System.out.println("5. View Last Added Item");
        System.out.println("6. View all items and Total bill");
        System.out.println("7. Clear the cart");
        System.out.println("8. Exit");
        System.out.println("Enter your Choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); //consume the new line
        switch (choice) {
            case 1:
                System.out.println("Enter item name: ");
                String itemToAdd = sc.nextLine();
                System.out.println("Enter quantity: ");
                int itemQuantity=sc.nextInt();
                System.out.println("Enter price per unit: ");
                double itemPrice=sc.nextDouble();
                sc.nextLine();
                cart.add(new Item(itemToAdd,itemQuantity,itemPrice));
                System.out.println(itemToAdd + " added successfully.");
                break;
            case 2:
                if(!cart.isEmpty()) {
                    System.out.println("Enter Item name to remove: ");
                    String itemToRemove = sc.nextLine();
                    /*if (cart.remove(itemToRemove)) {
                        System.out.println(itemToRemove + " removed from the cart.");
                    } else {
                        System.out.println(itemToRemove + " not found in the cart.");
                    }*/
                    boolean isRemoved=false;
                    Iterator<Item> itr=cart.iterator();
                    while (itr.hasNext()){
                        if(itr.next().name.equalsIgnoreCase(itemToRemove)) {
                            itr.remove();
                            isRemoved = true;
                        }
                    }
                    //boolean isRemoved=cart.removeIf(item -> item.name.equalsIgnoreCase(itemToRemove));
                    if(isRemoved){
                        System.out.println(itemToRemove+" removed from the cart.");
                    }
                    else{
                        System.out.println(itemToRemove+" not found.");
                    }
                }
                break;
            case 3 :
                System.out.println("Enter item to update: ");
                String updateName=sc.nextLine();
                boolean isFound=false;
                for(Item item:cart){
                    if(item.name.equalsIgnoreCase(updateName)){
                        System.out.println("Enter updated quantity: ");
                        item.quantity=sc.nextInt();
                        System.out.println("Enter updated price: ");
                        item.price=sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Item updated successfully");
                        isFound=true;
                        break;
                    }
                }
                if(!isFound){
                    System.out.println("Item not found");
                }
                break;
            case 4:
                if (!cart.isEmpty()) {
                    System.out.println("First added item is: " + cart.getFirst());
                } else {
                    System.out.println("Cart is empty.");
                }
                break;
            case 5:
                if (!cart.isEmpty()) {
                    System.out.println("Last added item is: " + cart.getLast());
                } else {
                    System.out.println("Cart is empty.");
                }
                break;
            case 6:
                if (cart.isEmpty()) {
                    System.out.println("Cart is Empty.");
                } else {
                    double total=0;
                    System.out.println("Items in the cart: " + cart);
                    for(Item item:cart){
                        System.out.println(item);
                        total += item.getTotal();
                    }

                    System.out.println("Total Bill: "+total);
                }
                break;
            case 7 :
                cart.clear();
                System.out.println("All items are cleared from the cart.");
                break;
            case 8:
                System.out.println("Thank you for shopping...");
                sc.close();
                return;
            default:
                System.out.println("Invalid choice entered. please try again...");
        }
    }
}
}
