package ModelAShoppingList;

public class ItemOrder {

    public Item item;
    public int num;
    public double sumPri;

    public ShoppingCart shoppingCart;
//    public ItemShelf itemShelf;

    public ItemOrder(Item item,int num){
        this.item = item;
        this.num = num;
    }


    public double getSumPri(){
        this.sumPri = this.item.getSumPri(num);
        return this.sumPri;
    }

    @Override
    public String toString(){
        return "itemId: "+item.itemId+
                " itemName: "+item.itemName+
                " purchaseNum: "+num+
                " sumPrice: "+getSumPri();
    }
}
