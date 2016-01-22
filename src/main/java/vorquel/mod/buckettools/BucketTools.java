package vorquel.mod.buckettools;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import vorquel.mod.buckettools.helper.Ref;
import vorquel.mod.buckettools.proxy.Proxy;

@SuppressWarnings("unused")
@Mod(modid = Ref.MOD_ID, name = "Bucket Tools", version = "@VERSION@")
public class BucketTools {
    
    @Instance(Ref.MOD_ID)
    public static BucketTools instance;
    
    @SidedProxy(serverSide = "vorquel.mod.buckettools.proxy.Proxy", clientSide = "vorquel.mod.buckettools.proxy.ProxyClient")
    public static Proxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {}
    
    @EventHandler
    public void init(FMLInitializationEvent event) {}
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
}
