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
    public void should_return_sellIn_9_qulity_0_given_none_name_item_sellIn_is_10_quality_is_0() throws Exception {
        Item item = new Item("Eddy Rose", 10, 0);
        Item[] items = new Item[]{item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Assert.assertEquals("Eddy Rose, 9, 0",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_quality_0_and_sellIn_negative_1_given_none_name_item_sellIn_0_quality_2(){
        Item item = new Item("Eddy Rose", 0, 2);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        Assert.assertEquals("Eddy Rose, -1, 0",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_sellIn_10_quality_49_given_rose_Sulfuras_sellIn_10_quality_49(){
        Item item = new Item("Sulfuras, Hand of Ragnaros",10,49);
        Item[] items = new Item[]{item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Assert.assertEquals("Sulfuras, Hand of Ragnaros, 10, 49",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_sellIn_10_quality_50_given_rose_Sulfuras_sellIn_10_quality_50(){
        Item item = new Item("Sulfuras, Hand of Ragnaros",10,50);
        Item[] items = new Item[]{item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Assert.assertEquals("Sulfuras, Hand of Ragnaros, 10, 50",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_sellIn_9_quality_50_given_rose_Aged_sellIn_10_quality_49(){
        Item item = new Item("Aged Brie",10,49);
        Item[] items = new Item[]{item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Assert.assertEquals("Aged Brie, 9, 50",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_sellIn_9_quality_50_given_rose_Backstage_sellIn_10_quality_48(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",10,48);
        Item[] items = new Item[]{item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 50",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_sellIn_4_quality_50_given_rose_Backstage_sellIn_5_quality_47(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",5,47);
        Item[] items = new Item[]{item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 50",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_sellIn_Negative_1_quality_50_given_rose_Aged_sellIn_0_quality_49(){
        Item item = new Item("Aged Brie",0,49);
        Item[] items = new Item[]{item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Assert.assertEquals("Aged Brie, -1, 50",gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_sellIn_Negative_1_quality_0_given_rose_Backstage_sellIn_0_quality_50(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",0,50);
        Item[] items = new Item[]{item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0",gildedRose.getItems()[0].toString());
    }
}
