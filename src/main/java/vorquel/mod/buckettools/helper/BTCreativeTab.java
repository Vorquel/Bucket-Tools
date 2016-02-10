package vorquel.mod.buckettools.helper;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BTCreativeTab extends CreativeTabs {
    
    public static final BTCreativeTab tab = new BTCreativeTab();
    
    private BTCreativeTab() {
        super(Ref.MOD_ID);
    }
    
    @Override
    public Item getTabIconItem() {
        return null;
    }
}
