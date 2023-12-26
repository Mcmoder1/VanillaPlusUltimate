package net.moder0.vanillaplus.world.biome;

import net.minecraft.util.Identifier;
import net.moder0.vanillaplus.VanillaPlus;
import net.moder0.vanillaplus.world.biome.surface.ModMaterialRules;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {

    @Override
    public void onTerraBlenderInitialized() {

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, VanillaPlus.MOD_ID, ModMaterialRules.makeRules());
    }
}
