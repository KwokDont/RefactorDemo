package gildedRose;

import gildedRose.updator.AgedRoseUpdator;

import static gildedRose.GildedRose.*;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality() {
        switch (this.name) {
            case "Aged Brie":
                AgedRoseUpdator agedRoseUpdator = new AgedRoseUpdator();
                agedRoseUpdator.updateQuality(this);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                updateByNameBackstage(this);
                break;
            case "Sulfuras, Hand of Ragnaros":
                updateByNameSulfuras(this);
                break;
            default:
                updateByOtherName(this);
        }
    }

    private void updateByOtherName(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
        item.sellIn--;
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--;
        }
    }

    private void updateByNameBackstage(Item item) {
        if (item.quality < BASE_QUALITY) {
            item.quality++;
            if (item.sellIn < HIGHER_SELLIN && item.quality < BASE_QUALITY) {
                item.quality++;
            }
            if (item.sellIn < FEWER_SELLIN) {
                increaseIfLessThanBaseQuality(item);
            }
        }
        item.sellIn--;
        if(item.sellIn < 0){
            item.quality = 0;
        }
    }

    private void updateByNameSulfuras(Item item) {
    }

    private void increaseIfLessThanBaseQuality(Item item) {
        if (item.quality < BASE_QUALITY) {
            item.quality++;
        }
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
