package gildedRose.updator;

import gildedRose.Item;

public class OtherRoseUpdator extends RoseUpdator {

    public void updateQuality(Item item) {
        if (item.getQuality() > 0) {
            decreaseQuality(item);
        }
        decreaseSellIn(item);
        if (item.getSellIn() < 0 && item.getQuality() > 0) {
            decreaseQuality(item);
        }
    }
}
