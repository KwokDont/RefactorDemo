package gildedRose;

import gildedRose.updator.*;

import static gildedRose.GildedRose.*;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public RoseUpdator roseUpdator;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.roseUpdator = UpdatorFactory.createUpdator(name);
    }

    public void updateQuality() {
        roseUpdator.updateQuality(this);
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
