package gregtech.common.blocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public class VariantItemBlockCasing<R extends Enum<R> & IStringSerializable, T extends VariantBlockCasing<R>> extends ItemBlock {

    private final T genericBlock;

    public VariantItemBlockCasing(T block) {
        super(block);
        this.genericBlock = block;
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    @SuppressWarnings("deprecation")
    protected IBlockState getBlockState(ItemStack stack) {
        return block.getStateFromMeta(getMetadata(stack.getItemDamage()));
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return super.getTranslationKey(stack) + '.' + genericBlock.getState(getBlockState(stack)).getName();
    }

}
