
package net.mcreator.filler.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.filler.itemgroup.CreativeTabBlocksItemGroup;
import net.mcreator.filler.FillerModElements;

import java.util.List;
import java.util.Collections;

@FillerModElements.ModElement.Tag
public class AmazoniteBlockBlock extends FillerModElements.ModElement {
	@ObjectHolder("filler:amazonite_block")
	public static final Block block = null;
	public AmazoniteBlockBlock(FillerModElements instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(CreativeTabBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.GLASS).hardnessAndResistance(150f, 1500f).setLightLevel(s -> 0)
					.harvestLevel(7).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("amazonite_block");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
