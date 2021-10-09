
package net.mcreator.filler.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.filler.itemgroup.CreativeTabToolsItemGroup;
import net.mcreator.filler.FillerModElements;

import java.util.List;

@FillerModElements.ModElement.Tag
public class SpectroliteHoeItem extends FillerModElements.ModElement {
	@ObjectHolder("filler:spectrolite_hoe")
	public static final Item block = null;
	public SpectroliteHoeItem(FillerModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2750;
			}

			public float getEfficiency() {
				return 15f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SpectroliteItem.block));
			}
		}, 0, -1f, new Item.Properties().group(CreativeTabToolsItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("\u00A77\u00A7oStill feels a bit cold..."));
			}
		}.setRegistryName("spectrolite_hoe"));
	}
}
