
package net.zachandconnor.oresnstuff.item;

import net.zachandconnor.oresnstuff.itemgroup.CreativeTabItemGroup;
import net.zachandconnor.oresnstuff.OresnstuffModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@OresnstuffModElements.ModElement.Tag
public class SpectroliteNuggetItem extends OresnstuffModElements.ModElement {
	@ObjectHolder("oresnstuff:spectrolite_nugget")
	public static final Item block = null;
	public SpectroliteNuggetItem(OresnstuffModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("spectrolite_nugget");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
