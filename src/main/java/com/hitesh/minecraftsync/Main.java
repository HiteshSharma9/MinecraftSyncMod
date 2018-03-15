package com.hitesh.minecraftsync;

import com.hitesh.minecraftsync.com.hitesh.minecraftsync.proxy.CommonProxy;
import com.hitesh.minecraftsync.com.hitesh.minecraftsync.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

    @Instance
    public static Main Instance;

    /*@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent){

    }

    @EventHandler
    public static void init(FMLInitializationEvent){

    }

    @EventHandler
    public static void PostInit(FMLPostInitializationEvent){

    }*/
}
