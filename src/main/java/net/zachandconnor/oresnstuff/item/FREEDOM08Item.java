
package net.zachandconnor.oresnstuff.item;

import net.zachandconnor.oresnstuff.OresnstuffModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

@OresnstuffModElements.ModElement.Tag
public class FREEDOM08Item extends OresnstuffModElements.ModElement {
	@ObjectHolder("oresnstuff:freedom_08")
	public static final Item block = null;
	public FREEDOM08Item(OresnstuffModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, OresnstuffModElements.sounds.get(new ResourceLocation("oresnstuff:freedomdive")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("freedom_08");
		}
	}
}
