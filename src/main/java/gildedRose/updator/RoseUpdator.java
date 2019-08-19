package gildedRose.updator;

import gildedRose.Item;

public abstract class RoseUpdator {

    public final static int BASE_QUALITY = 50;
    public final static int FEWER_SELLIN = 6;
    public final static int HIGHER_SELLIN = 11;

    public abstract void updateQuality(Item item);

    protected void increaseIfLessThanBaseQuality(Item item) {
        if (item.getQuality() < BASE_QUALITY) {
            item.setQuality(item.getQuality() + 1);
        }
    }

    public void increaseQuality(Item item) {item.setQuality(item.getQuality() + 1);}

    public void decreaseQuality(Item item) {item.setQuality(item.getQuality() - 1);}

    public void decreaseSellIn(Item item) {item.setSellIn(item.getSellIn() - 1);}
}
