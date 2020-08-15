package ModelAShoppingList;

public class Main {
    public static void main(String[] args) {
        ItemShelf itemShelf = new ItemShelf();
        ShoppingCart shoppingCart = new ShoppingCart(itemShelf);

        Item soap = new Item("soap",3.5,2,6);
        Item button = new Item("button",0.95,3,2.5);
        Item bulb = new Item("bulb",10);
        Item clock = new Item("clock",50,2,90);
        Item lock = new Item("lock",9.9,10,90);

        itemShelf.uploadItem(soap);
        itemShelf.uploadItem(button);
        itemShelf.uploadItem(bulb);
        itemShelf.uploadItem(clock);
        itemShelf.uploadItem(lock);

        itemShelf.uploadItem("knapsack",49);
        itemShelf.uploadItem("suitcase",50);

        itemShelf.uploadItem("lighter",6,4,20);
        itemShelf.uploadItem("ring",3,4,10);

        System.out.println("**************************************************************");
        System.out.println("********************this is the item shelf********************");
        System.out.println("**************************************************************");
        itemShelf.printItemShelf();
        System.out.println("**************************************************************");

        shoppingCart.addPurchase(bulb,2);
        shoppingCart.addPurchase(button,5);

        shoppingCart.addPurchase("soap",5);
        shoppingCart.addPurchase("clock",1);

        shoppingCart.addPurchase(7,9);
        shoppingCart.addPurchase(8,5);


        System.out.println("**************************************************************");
        System.out.println("******************this is the shopping cart*******************");
        System.out.println("**************************************************************");
        shoppingCart.getDesc();
        System.out.println("**************************************************************");

        System.out.println("THE SUM PRICE IS: "+shoppingCart.getSumPri());
//        shoppingCart.getSumPri();

        System.out.println("");
    }
}
