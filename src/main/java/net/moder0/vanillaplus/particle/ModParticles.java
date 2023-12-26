package net.moder0.vanillaplus.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moder0.vanillaplus.VanillaPlus;

public class ModParticles {

    public static final DefaultParticleType SAND_PARTICLE =
            registerParticle("sand_particle", FabricParticleTypes.simple());


    private static DefaultParticleType registerParticle(String name, DefaultParticleType particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, new Identifier(VanillaPlus.MOD_ID, name), particleType);
    }

    public static void registerParticles() {
        VanillaPlus.LOGGER.info("Registering Particles for " + VanillaPlus.MOD_ID);
    }
    
}
