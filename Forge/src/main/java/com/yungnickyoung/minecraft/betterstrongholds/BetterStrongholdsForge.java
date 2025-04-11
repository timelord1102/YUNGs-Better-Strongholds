package com.yungnickyoung.minecraft.betterstrongholds;

import com.yungnickyoung.minecraft.betterstrongholds.module.ConfigModuleForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterStrongholdsCommon.MOD_ID)
public class BetterStrongholdsForge {
    public BetterStrongholdsForge(FMLJavaModLoadingContext fmlJavaModLoadingContext) {
        BetterStrongholdsCommon.init();
        ConfigModuleForge.init(fmlJavaModLoadingContext);
    }
}
