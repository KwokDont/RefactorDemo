package gildedRose.updator;

import gildedRose.Item;

public class BackstageRoseUpdator extends RoseUpdator {

    public void updateQuality(Item item) {
        if (item.getQuality() < BASE_QUALITY) {
            increaseQuality(item);
            if (item.getSellIn() < HIGHER_SELLIN && item.getQuality() < BASE_QUALITY) {
                increaseQuality(item);
            }
            if (item.getSellIn() < FEWER_SELLIN) {
                increaseIfLessThanBaseQuality(item);
            }
        }
        decreaseSellIn(item);
        if(item.getSellIn() < 0){
            item.setQuality(0);
        }
    }
}
