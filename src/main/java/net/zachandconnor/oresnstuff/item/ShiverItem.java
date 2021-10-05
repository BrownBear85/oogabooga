
package net.zachandconnor.oresnstuff.item;

import net.zachandconnor.oresnstuff.OresnstuffModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

@OresnstuffModElements.ModElement.Tag
public class ShiverItem extends OresnstuffModElements.ModElement {
	@ObjectHolder("oresnstuff:shiver")
	public static final Item block = null;
	public ShiverItem(OresnstuffModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, OresnstuffModElements.sounds.get(new ResourceLocation("oresnstuff:shiver")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("shiver");
		}
	}
}
