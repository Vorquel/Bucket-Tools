package vorquel.mod.buckettools.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import vorquel.mod.buckettools.helper.BTCreativeTab;

public class Proxy {
    
    public void registerItem(Item item, String name) {
        item.setCreativeTab(BTCreativeTab.tab);
        GameRegistry.registerItem(item, name);
    }
    
    public void registerBlock(Block block, String name) {
        block.setCreativeTab(BTCreativeTab.tab);
        GameRegistry.registerBlock(block, name);
    }
}
