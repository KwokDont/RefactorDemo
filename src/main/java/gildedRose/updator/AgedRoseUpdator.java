package gildedRose.updator;

import gildedRose.Item;

public class AgedRoseUpdator extends RoseUpdator {

    public void updateQuality(Item item) {
        increaseIfLessThanBaseQuality(item);
        decreaseSellIn(item);
        if (item.getSellIn() < 0 && item.getQuality() < BASE_QUALITY) {
            increaseQuality(item);
        }
    }

}
