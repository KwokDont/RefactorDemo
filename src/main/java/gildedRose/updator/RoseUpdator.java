package gildedRose.updator;

import gildedRose.Item;

import static gildedRose.GildedRose.BASE_QUALITY;

public abstract class RoseUpdator {

    public abstract void updateQuality(Item item);

    protected void increaseIfLessThanBaseQuality(Item item) {
        if (item.quality < BASE_QUALITY) {
            item.quality++;
        }
    }
}
