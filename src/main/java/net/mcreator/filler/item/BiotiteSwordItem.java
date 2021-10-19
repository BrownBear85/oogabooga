
package net.mcreator.filler.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.filler.itemgroup.CreativeTabToolsItemGroup;
import net.mcreator.filler.FillerModElements;

@FillerModElements.ModElement.Tag
public class BiotiteSwordItem extends FillerModElements.ModElement {
	@ObjectHolder("filler:biotite_sword")
	public static final Item block = null;
	public BiotiteSwordItem(FillerModElements instance) {
		super(instance, 197);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3500;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 12f;
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
		}, 3, -2.4f, new Item.Properties().group(CreativeTabToolsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("biotite_sword"));
	}
}
