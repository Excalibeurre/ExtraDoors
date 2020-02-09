package com.extracraftx.minecraft.extradoors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.entity.Entity;

@Mixin(Entity.class)
public interface EntityAccessor{

    @Accessor
    public void setTeleportRequested(boolean teleportRequested);

}