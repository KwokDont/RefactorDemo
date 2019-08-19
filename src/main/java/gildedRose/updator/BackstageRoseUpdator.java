package gildedRose.updator;

import gildedRose.Item;

import static gildedRose.GildedRose.*;

public class BackstageRoseUpdator extends RoseUpdator {

    public void updateQuality(Item item) {
        if (item.quality < BASE_QUALITY) {
            item.quality++;
            if (item.sellIn < HIGHER_SELLIN && item.quality < BASE_QUALITY) {
                item.quality++;
            }
            if (item.sellIn < FEWER_SELLIN) {
                increaseIfLessThanBaseQuality(item);
            }
        }
        item.sellIn--;
        if(item.sellIn < 0){
            item.quality = 0;
        }
    }
}
