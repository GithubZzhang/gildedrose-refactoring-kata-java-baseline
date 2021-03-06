package gildedrose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            doUpdateQuality(items[i]);
        }
    }

    private void doUpdateQuality(Item item1) {
        Item item = item1;
        if ("Aged Brie".equals(item.name)) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }

            item.sellIn = item.sellIn - 1;

            if (item.sellIn < 0) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
            }
        } else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
                if (item.sellIn < 11) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }

                if (item.sellIn < 6) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }

            item.sellIn = item.sellIn - 1;

            if (item.sellIn < 0) {
                item.quality = item.quality - item.quality;
            }
        } else if ("Sulfuras, Hand of Ragnaros".equals(item.name)) {

        } else {
            if (item.quality > 0) {

                item.quality = item.quality - 1;
            }

            item.sellIn = item.sellIn - 1;

            if (item.sellIn < 0) {
                if (item.quality > 0) {
                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        item.quality = item.quality - 1;
                    }
                }
            }
        }
    }
}