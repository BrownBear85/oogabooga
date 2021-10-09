
package net.mcreator.filler.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.filler.block.BismuthBlockBlock;
import net.mcreator.filler.FillerModElements;

@FillerModElements.ModElement.Tag
public class CreativeTabBlocksItemGroup extends FillerModElements.ModElement {
	public CreativeTabBlocksItemGroup(FillerModElements instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcreative_tab_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BismuthBlockBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
