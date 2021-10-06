
package net.mcreator.filler.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.filler.itemgroup.CreativeTabItemGroup;
import net.mcreator.filler.FillerModElements;

@FillerModElements.ModElement.Tag
public class SpectroliteDiscItem extends FillerModElements.ModElement {
	@ObjectHolder("filler:spectrolite_disc")
	public static final Item block = null;
	public SpectroliteDiscItem(FillerModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, FillerModElements.sounds.get(new ResourceLocation("filler:shiver")),
					new Item.Properties().group(CreativeTabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("spectrolite_disc");
		}
	}
}
