
package net.mcreator.filler.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.filler.itemgroup.CreativeTabToolsItemGroup;
import net.mcreator.filler.FillerModElements;

@FillerModElements.ModElement.Tag
public class AmazoniteAxeItem extends FillerModElements.ModElement {
	@ObjectHolder("filler:amazonite_axe")
	public static final Item block = null;
	public AmazoniteAxeItem(FillerModElements instance) {
		super(instance, 65);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3100;
			}

			public float getEfficiency() {
				return 19f;
			}

			public float getAttackDamage() {
				return 15f;
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
		}, 1, -3f, new Item.Properties().group(CreativeTabToolsItemGroup.tab)) {
		}.setRegistryName("amazonite_axe"));
	}
}
