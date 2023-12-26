package net.moder0.vanillaplus.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

public class SandParticle extends SpriteBillboardParticle {
    private final SpriteProvider spriteProvider;

    protected SandParticle(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ, SpriteProvider spriteProvider) {
        super(world, x, y, z);
        this.gravityStrength = 0.225f;
        this.velocityMultiplier = 1.0f;
        this.spriteProvider = spriteProvider;
        this.velocityX = velocityX + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.velocityY = velocityY + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.velocityZ = velocityZ + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.scale = 0.1f * (this.random.nextFloat() * this.random.nextFloat() * 1.0f + 1.0f);
        this.maxAge = (int)(16.0 / ((double)this.random.nextFloat() * 0.8 + 0.2)) + 2;
        this.setSpriteForAge(spriteProvider);
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_OPAQUE;
    }

    @Override
    public void tick() {
        super.tick();
        this.setSpriteForAge(this.spriteProvider);
        this.velocityX *= (double)0.95f;
        this.velocityY *= (double)0.9f;
        this.velocityZ *= (double)0.95f;
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            SandParticle sandParticle = new SandParticle(clientWorld, d, e, f, g, h, i, this.spriteProvider);
            sandParticle.setColor(0.923f, 0.964f, 0.999f);
            return sandParticle;
        }

    }

}
