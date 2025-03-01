package gildedRose;

import gildedRose.updator.*;

public class Item {

    private String name;

    private int sellIn;

    private int quality;

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

    public String getName() { return name; }

    public int getSellIn() { return sellIn; }

    public int getQuality() { return quality; }

    public void setSellIn(int sellIn) { this.sellIn = sellIn; }

    public void setQuality(int quality) { this.quality = quality; }
}
