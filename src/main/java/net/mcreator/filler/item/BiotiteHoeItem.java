
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
public class BiotiteHoeItem extends FillerModElements.ModElement {
	@ObjectHolder("filler:biotite_hoe")
	public static final Item block = null;
	public BiotiteHoeItem(FillerModElements instance) {
		super(instance, 201);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 3500;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 9f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 32;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BiotiteItem.block));
			}
		}, 0, -2f, new Item.Properties().group(CreativeTabToolsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("biotite_hoe"));
	}
}
