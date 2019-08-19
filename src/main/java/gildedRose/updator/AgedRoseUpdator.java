package gildedRose.updator;

import gildedRose.Item;

import static gildedRose.GildedRose.BASE_QUALITY;

public class AgedRoseUpdator {

    public void updateQuality(Item item) {
        increaseIfLessThanBaseQuality(item);
        item.sellIn--;
        if (item.sellIn < 0 && item.quality < BASE_QUALITY) {
            item.quality++;
        }
    }

    private void increaseIfLessThanBaseQuality(Item item) {
        if (item.quality < BASE_QUALITY) {
            item.quality++;
        }
    }
}
