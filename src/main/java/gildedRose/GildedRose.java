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
                default:
                    updateByOtherName(items[i]);
            }

        }
    }

    private void updateByOtherName(Item item) {

        if (item.quality > 0) {
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.quality--;
            }
        }

        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn--;
        }

        if (item.sellIn < 0) {
            if (item.quality > 0) {
                if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                    item.quality--;
                }
            }
        }
    }

    private void updateByNameAged(Item item) {
        if (item.quality < BASE_QUALITY) {
            item.quality++;
        }
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
                if (item.quality < BASE_QUALITY) {
                    item.quality++;
                }
            }
        }
        item.sellIn--;
        if(item.sellIn < 0){
            item.quality = 0;
        }
    }

    public Item[] getItems() {
        return items;
    }
}