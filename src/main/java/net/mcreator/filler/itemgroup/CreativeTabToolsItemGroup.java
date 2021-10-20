
package net.mcreator.filler.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.filler.item.BismuthPickItem;
import net.mcreator.filler.FillerModElements;

@FillerModElements.ModElement.Tag
public class CreativeTabToolsItemGroup extends FillerModElements.ModElement {
	public CreativeTabToolsItemGroup(FillerModElements instance) {
		super(instance, 116);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcreative_tab_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BismuthPickItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
