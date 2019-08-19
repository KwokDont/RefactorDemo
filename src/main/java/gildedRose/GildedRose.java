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
            items[i].updateQuality();
        }
    }

    public Item[] getItems() {
        return items;
    }
}