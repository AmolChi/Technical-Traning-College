package Assignment3;

import java.util.ArrayList;

public class ProductOfList {
    static int returnProd(ArrayList<Integer> list){
        if(list.size()==0)
            return 1;
        return list.remove(0) * returnProd(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(20);
        System.out.println("Product of values is: "+returnProd(list));
    }
}
