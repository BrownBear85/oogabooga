package net.mcreator.filler.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.filler.FillerMod;

import java.util.Map;

public class SitKeyOnKeyPressedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FillerMod.LOGGER.warn("Failed to load dependency entity for procedure SitKeyOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"sit");
			}
		}
	}
}
