package gilded_rose;

import gildedRose.GildedRose;
import gildedRose.Item;
import org.junit.Assert;
import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void should_quality_sellIn_be_9_given_none_name_item_quality_10_sellIn_10(){
        Item item = new Item("Eddy Rose",10,10);
        Item[] items = new Item[]{item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Assert.assertEquals("Eddy Rose, 9, 9",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_sellIn_10_quality_49_given_rose_Sulfuras_sellIn_10_quality_49(){
        Item item = new Item("Sulfuras, Hand of Ragnaros",10,49);
        Item[] items = new Item[]{item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Assert.assertEquals("Sulfuras, Hand of Ragnaros, 10, 49",gildedRose.getItems()[0].toString());
    }
}
