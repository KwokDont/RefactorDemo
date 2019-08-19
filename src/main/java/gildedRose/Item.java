package gildedRose;

import gildedRose.updator.AgedRoseUpdator;
import gildedRose.updator.BackstageRoseUpdator;
import gildedRose.updator.OtherRoseUpdator;
import gildedRose.updator.SulfurasRoseUpdator;

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
                BackstageRoseUpdator backstageRoseUpdator = new BackstageRoseUpdator();
                backstageRoseUpdator.updateQuality(this);
                break;
            case "Sulfuras, Hand of Ragnaros":
                SulfurasRoseUpdator sulfurasRoseUpdator = new SulfurasRoseUpdator();
                sulfurasRoseUpdator.updateQuality(this);
                break;
            default:
                OtherRoseUpdator otherRoseUpdator = new OtherRoseUpdator();
                otherRoseUpdator.updateQuality(this);
        }
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
