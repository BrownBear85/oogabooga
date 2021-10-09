package net.mcreator.filler.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.filler.FillerMod;

import java.util.Map;

public class LauncherOnEntityTickUpdateProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FillerMod.LOGGER.warn("Failed to load dependency entity for procedure LauncherOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!(entity.isBeingRidden()))) {
			if (!entity.world.isRemote())
				entity.remove();
		}
	}
}
