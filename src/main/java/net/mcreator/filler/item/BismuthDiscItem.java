
package net.mcreator.filler.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;

import net.mcreator.filler.procedures.MusicDiscAdvancementProcedure;
import net.mcreator.filler.itemgroup.CreativeTabItemGroup;
import net.mcreator.filler.FillerModElements;

import java.util.Map;
import java.util.HashMap;

@FillerModElements.ModElement.Tag
public class BismuthDiscItem extends FillerModElements.ModElement {
	@ObjectHolder("filler:bismuth_disc")
	public static final Item block = null;
	public BismuthDiscItem(FillerModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, FillerModElements.sounds.get(new ResourceLocation("filler:freedomdive")),
					new Item.Properties().group(CreativeTabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("bismuth_disc");
		}

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				MusicDiscAdvancementProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
