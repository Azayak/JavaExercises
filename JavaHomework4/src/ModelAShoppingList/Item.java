package ModelAShoppingList;

public class Item {

    public static int itemNum = 0;
    public final int itemId;
    public String itemName;
    public double price;

    public int discountNum;
    public double discountPri;


    public Item(String itemName,double price){
        itemId = itemNum;
        itemNum++;
        this.itemName = itemName;
        this.price = price;
        this.discountNum = 0;
        this.discountPri = 0;
    }

    public Item(String itemName,double price,int discountNum,double discountPri){
        itemId = itemNum;
        itemNum++;
        this.itemName = itemName;
        this.price = price;
        this.discountNum = discountNum;
        this.discountPri = discountPri;
    }

    public double getSumPri(int n){
        if(n<0){
            System.out.println("ERROR PURCHASE NUMBER INPUT");
            return -1;
        }
        if(this.discountNum==0){
            return n * this.price;
        }
        else{
            int sumPri = 0;
            sumPri += (this.discountPri * (n/this.discountNum)) + (this.price * (n%this.discountNum));
            return sumPri;
        }
    }

    @Override
    public String toString(){
        if(this.discountNum>0) {
            return "itemId: " + this.itemId +
                    " itemName: " + this.itemName +
                    " itemPri: " + this.price +
                    " discount: " + this.discountPri + "$ for" + this.discountNum;
        }
        else {
            return "itemId: " + this.itemId +
                    " itemName: " + this.itemName +
                    " itemPri: " + this.price;
        }
    }


}
