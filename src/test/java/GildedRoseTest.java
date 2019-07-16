import static org.assertj.core.api.Assertions.assertThat;


import java.util.ArrayList;
import java.util.List;
import org.junit.Test;


public class GildedRoseTest {

    @Test
    public void testTheTruth() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertThat(items.get(0).getSellIn()).isEqualTo(9);
        assertThat(items.get(0).getQuality()).isEqualTo(19);

        assertThat(items.get(1).getSellIn()).isEqualTo(1);
        assertThat(items.get(1).getQuality()).isEqualTo(1);

        assertThat(items.get(2).getSellIn()).isEqualTo(4);
        assertThat(items.get(2).getQuality()).isEqualTo(6);

        assertThat(items.get(3).getSellIn()).isEqualTo(0);
        assertThat(items.get(3).getQuality()).isEqualTo(80);

        assertThat(items.get(4).getSellIn()).isEqualTo(14);
        assertThat(items.get(4).getQuality()).isEqualTo(21);

        assertThat(items.get(5).getSellIn()).isEqualTo(2);
        assertThat(items.get(5).getQuality()).isEqualTo(5);
    }
}
