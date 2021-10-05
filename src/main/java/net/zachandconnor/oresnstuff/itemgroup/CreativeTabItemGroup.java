
package net.zachandconnor.oresnstuff.itemgroup;

import net.zachandconnor.oresnstuff.item.FREEDOM08Item;
import net.zachandconnor.oresnstuff.OresnstuffModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@OresnstuffModElements.ModElement.Tag
public class CreativeTabItemGroup extends OresnstuffModElements.ModElement {
	public CreativeTabItemGroup(OresnstuffModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcreative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(FREEDOM08Item.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
