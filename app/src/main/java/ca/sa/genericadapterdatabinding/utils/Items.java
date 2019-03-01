package ca.sa.genericadapterdatabinding.utils;

import java.util.HashMap;

import ca.sa.genericadapterdatabinding.models.Item;


/**
 * Created by samandeep on 26,February,2019
 */
public class Items {

    public Item[] ITEMS={ITEM0,ITEM1,ITEM2,ITEM3,ITEM4,ITEM5,ITEM6,ITEM7,ITEM8,ITEM9,ITEM10};

    HashMap<String, Item> itemHashMap=new HashMap<>();

    public Items(){
        for (Item item:ITEMS){
            itemHashMap.put(String.valueOf(item.getKey()),item);
        }
    }

    public static final Item ITEM0=new Item(1,"Items0","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Item ITEM1=new Item(2,"Items1","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Item ITEM2=new Item(3,"Items2","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Item ITEM3=new Item(4,"Items3","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Item ITEM4=new Item(5,"Items4","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Item ITEM5=new Item(6,"Items5","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Item ITEM6=new Item(7,"Items6","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Item ITEM7=new Item(8,"Items7","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Item ITEM8=new Item(9,"Items8","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Item ITEM9=new Item(10,"Items9","Description demo 0 sdbjs sdjhfdj sdj");
    public static final Item ITEM10=new Item(11,"Items10","Description demo 0 sdbjs sdjhfdj sdj");


}
