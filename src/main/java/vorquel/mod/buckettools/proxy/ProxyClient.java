package vorquel.mod.buckettools.proxy;

import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import vorquel.mod.buckettools.helper.Ref;

@SuppressWarnings("unused")
public class ProxyClient extends Proxy {
    
    @Override
    public void registerItem(Item item, String name) {
        super.registerItem(item, name);
        registerModel(item, name);
    }
    
    @Override
    public void registerBlock(Block block, String name) {
        super.registerBlock(block, name);
        registerModel(Item.getItemFromBlock(block), name);
    }
    
    private void registerModel(Item item, String name) {
        String fullName = Ref.MOD_ID.toLowerCase() + ":" + name;
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(fullName, "inventory"));
        ModelBakery.registerItemVariants(item, new ResourceLocation(fullName));
    }
}
