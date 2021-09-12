package Arrays_Lists;

import java.util.Scanner;

public class GroceryStore {

    static java.util.ArrayList<String> GroceryList = new java.util.ArrayList<String>();

    public static void addGroceryItem(String item){
        GroceryList.add(item);
    }

    public static void printGroceryList(){
        System.out.println("You have"+GroceryList.size()+"items in the list");
        for(int i=0; i<GroceryList.size();i++){
            System.out.println((i+1)+","+GroceryList.get(i));
        }
    }

    public static void modifyGroceryItem(int position, String newItem){
        GroceryList.add(position, newItem);
        System.out.println("GroceryItem"+(position+1)+"has been modified");
    }

    public static void removeGroceryItem(int position){
        String theItem = GroceryList.get(position);
        GroceryList.remove(position);
    }

    public static String findItem(String searchItem){
        boolean exists = GroceryList.contains(searchItem);
        int position = GroceryList.indexOf(searchItem);
        if(position>=0){
            return GroceryList.get(position);
        }
        return "null";
    }

    public static void printInstructions()
    {
        System.out.println("0 - To print choice options");
        System.out.println("1 - to print list of items");
        System.out.println("2 - to add items to the list");
        System.out.println("3 - to modify items in the list");
        System.out.println("4 - to rempve items in the list");
        System.out.println("5 - to search for an item in the list");
        System.out.println("6 - to quit the applications");
    }

    public static void addItem()
    {
        System.out.println("please enter grocery items");
        Scanner sc = new Scanner(System.in);
        addGroceryItem(sc.nextLine());
    }

    public static void main(String[] args) {

        boolean quit=false;
        int choice=0;

        printInstructions();

        while(!quit) {
        System.out.println("Enter choice");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
            int itemNo;
            switch (choice){
            case 0:
                printInstructions();
                break;
            case 1:
                printGroceryList();
                break;
            case 2:
                addItem();
                break;
            case 3:
                System.out.println("Enter item number");
                itemNo = sc.nextInt();
                System.out.println("Enter replacement Item");
                String newItem = sc.nextLine();
                modifyGroceryItem(itemNo-1,newItem);
                break;
            case 4:
                System.out.println("Enter item number");
                itemNo = sc.nextInt();
                removeGroceryItem(itemNo);
                break;
            case 5:
                System.out.println("Enter item to search for");
                String searchItem = sc.next();
                if (findItem(searchItem) != null){
                    System.out.println("found "+ searchItem + "in grocery list");
                }else{
                    System.out.println("not found "+ searchItem + "in grocery list");
                }
                break;
            case 6:
                quit=true;
                break;

        }
    }

    }

}
