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
            switch (items[i].name) {
                case "Aged Brie":
                    updateByNameAged(items[i]);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    updateByNameBackstage(items[i]);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    updateByNameSulfuras(items[i]);
                    break;
                default:
                    updateByOtherName(items[i]);
            }

        }
    }

    private void updateByOtherName(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
        item.sellIn--;
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--;
        }
    }

    private void updateByNameAged(Item item) {
        increaseIfLessThanBaseQuality(item);
        item.sellIn--;
        if (item.sellIn < 0 && item.quality < BASE_QUALITY) {
            item.quality++;
        }
    }

    private void updateByNameBackstage(Item item) {
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

    private void updateByNameSulfuras(Item item) {
    }

    private void increaseIfLessThanBaseQuality(Item item) {
        if (item.quality < BASE_QUALITY) {
            item.quality++;
        }
    }

    public Item[] getItems() {
        return items;
    }
}