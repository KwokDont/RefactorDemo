package gildedRose.updator;

import gildedRose.Item;

import static gildedRose.GildedRose.BASE_QUALITY;

public class AgedRoseUpdator extends RoseUpdator {

    public void updateQuality(Item item) {
        increaseIfLessThanBaseQuality(item);
        item.sellIn--;
        if (item.sellIn < 0 && item.quality < BASE_QUALITY) {
            item.quality++;
        }
    }

}
