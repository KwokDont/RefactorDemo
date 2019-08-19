package gildedRose.updator;

import gildedRose.Item;

public class OtherRoseUpdator extends RoseUpdator {

    public void updateQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
        item.sellIn--;
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--;
        }
    }
}
