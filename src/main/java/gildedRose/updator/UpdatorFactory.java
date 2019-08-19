package gildedRose.updator;

public class UpdatorFactory {

    public static RoseUpdator createUpdator(String name) {
        switch (name) {
            case "Aged Brie": return new AgedRoseUpdator();
            case "Backstage passes to a TAFKAL80ETC concert": return new BackstageRoseUpdator();
            case "Sulfuras, Hand of Ragnaros": return new SulfurasRoseUpdator();
            default: return new OtherRoseUpdator();
        }
    }
}
