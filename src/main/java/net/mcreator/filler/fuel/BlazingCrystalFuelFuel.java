
package net.mcreator.filler.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.filler.item.BlazingCrystalItem;

@Mod.EventBusSubscriber
public class BlazingCrystalFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == BlazingCrystalItem.block)
			event.setBurnTime(20000);
	}
}
