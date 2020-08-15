package ModelAShoppingList;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public List<ItemOrder> shoppingList = new ArrayList<>();
    public ItemShelf itemShelf;
    public double sumPri;

    public ShoppingCart(ItemShelf itemShelf){
        this.itemShelf = itemShelf;
    }

    public void addPurchase(Item item,int num){
        if(itemShelf.itemList.contains(item)) {
            ItemOrder itemOrder = new ItemOrder(item, num);
            itemOrder.shoppingCart = this;
            shoppingList.add(itemOrder);
        }
        else {
            System.out.println("NO THIS ITEM");
        }
    }

    public void addPurchase(int itemId,int num){

        for(Item item:this.itemShelf.itemList){
            if(item.itemId==itemId){
                ItemOrder itemOrder = new ItemOrder(item, num);
                itemOrder.shoppingCart = this;
                shoppingList.add(itemOrder);
                return;
            }
        }
        System.out.println("NO THIS ITEM");
    }

    public void addPurchase(String itemName,int num){

        for(Item item:this.itemShelf.itemList){
            if(item.itemName==itemName){
                ItemOrder itemOrder = new ItemOrder(item, num);
                itemOrder.shoppingCart = this;
                shoppingList.add(itemOrder);
                return;
            }
        }
        System.out.println("NO THIS ITEM");
    }

    public void getDesc(){
        for(ItemOrder itemOrder:this.shoppingList){
            System.out.println(itemOrder.toString());
        }
    }

    public double getSumPri(){
        double sumPri = 0;
        for(ItemOrder itemOrder:this.shoppingList){
            sumPri += itemOrder.getSumPri();
        }
        return sumPri;
    }


}
