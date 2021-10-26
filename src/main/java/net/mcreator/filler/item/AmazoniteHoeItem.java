
package net.mcreator.filler.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.filler.itemgroup.CreativeTabToolsItemGroup;
import net.mcreator.filler.FillerModElements;

@FillerModElements.ModElement.Tag
public class AmazoniteHoeItem extends FillerModElements.ModElement {
	@ObjectHolder("filler:amazonite_hoe")
	public static final Item block = null;
	public AmazoniteHoeItem(FillerModElements instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 3100;
			}

			public float getEfficiency() {
				return 19f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 7;
			}

			public int getEnchantability() {
				return 26;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AmazoniteItem.block));
			}
		}, 0, -2f, new Item.Properties().group(CreativeTabToolsItemGroup.tab)) {
		}.setRegistryName("amazonite_hoe"));
	}
}
