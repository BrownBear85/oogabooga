
package net.mcreator.filler.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.filler.itemgroup.CreativeTabItemGroup;
import net.mcreator.filler.FillerModElements;

import java.util.List;

@FillerModElements.ModElement.Tag
public class ObsidianRodItem extends FillerModElements.ModElement {
	@ObjectHolder("filler:obsidian_rod")
	public static final Item block = null;
	public ObsidianRodItem(FillerModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("obsidian_rod");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("\u00A77\u00A7oIt's so hard"));
			list.add(new StringTextComponent("it might never break"));
		}
	}
}
