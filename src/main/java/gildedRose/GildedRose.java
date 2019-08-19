package gildedRose;
public class GildedRose {
    Item[] items;

    public final static int BASE_QUALITY = 50;
    public final static int FEWER_SELLIN = 6;
    public final static int HIGHER_SELLIN = 11;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality--;
                    }
                }
            } else {
                if (items[i].quality < BASE_QUALITY) {
                    items[i].quality++;
                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < HIGHER_SELLIN) {
                            if (items[i].quality < BASE_QUALITY) {
                                items[i].quality++;
                            }
                        }

                        if (items[i].sellIn < FEWER_SELLIN) {
                            if (items[i].quality < BASE_QUALITY) {
                                items[i].quality++;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn--;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality--;
                            }
                        }
                    } else {
                        items[i].quality = 0;
                    }
                } else {
                    if (items[i].quality < BASE_QUALITY) {
                        items[i].quality++;
                    }
                }
            }
        }
    }
    public Item[] getItems() {
        return items;
    }
}