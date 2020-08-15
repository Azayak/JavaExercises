package ModelAShoppingList;

import java.util.ArrayList;
import java.util.List;

public class ItemShelf {

    List<Item> itemList = new ArrayList<>();

    public ItemShelf(){
    }

    public void uploadItem(Item item){
        itemList.add(item);
    }

    public void uploadItem(String itemName,double price){
        Item item = new Item(itemName,price);
        itemList.add(item);
    }

    public void uploadItem(String itemName,double price,int discountNum,double discountPri){
        Item item = new Item(itemName,price,discountNum,discountPri);
        itemList.add(item);
    }

    public void removeItem(Item item){
        if(itemList.contains(item)){
            itemList.remove(item);
        }
        else System.out.println("ITEM NOT EXIST");
    }

    public void removeItem(String itemName){
        for(Item item:itemList){
            if(item.itemName==itemName){
                itemList.remove(item);
                return;
            }
        }
        System.out.println("ITEM NOT EXIST");
    }

    public void removeItem(int itemId){
        for(Item item:itemList){
            if(item.itemId==itemId){
                itemList.remove(item);
                return;
            }
        }
        System.out.println("ITEM NOT EXIST");
    }

    public void printItemShelf(){
        for(Item item:itemList){
                System.out.println(item.toString());
        }
    }

}
