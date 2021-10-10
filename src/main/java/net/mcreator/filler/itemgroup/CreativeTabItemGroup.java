
package net.mcreator.filler.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.filler.item.DiamondRodItem;
import net.mcreator.filler.FillerModElements;

@FillerModElements.ModElement.Tag
public class CreativeTabItemGroup extends FillerModElements.ModElement {
	public CreativeTabItemGroup(FillerModElements instance) {
		super(instance, 77);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcreative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DiamondRodItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
