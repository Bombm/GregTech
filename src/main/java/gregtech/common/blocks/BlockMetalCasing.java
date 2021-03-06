package gregtech.common.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving.SpawnPlacementType;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockMetalCasing extends VariantBlockCasing<BlockMetalCasing.MetalCasingType> {

    public BlockMetalCasing() {
        super(Material.IRON);
        setTranslationKey("metal_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel("pickaxe", 2);
        setDefaultState(getState(MetalCasingType.BRONZE_BRICKS));
    }

    @Override
    public boolean canCreatureSpawn(IBlockState state, IBlockAccess world, BlockPos pos, SpawnPlacementType type) {
        return false;
    }

    public enum MetalCasingType implements IStringSerializable {

        BRONZE_BRICKS("bronze_bricks"),
        PRIMITIVE_BRICKS("primitive_bricks"),
        INVAR_HEATPROOF("invar_heatproof"),
        ALUMINIUM_FROSTPROOF("aluminium_frostproof"),
        STEEL_SOLID("steel_solid"),
        STAINLESS_CLEAN("stainless_clean"),
        TITANIUM_STABLE("titanium_stable"),
        TUNGSTENSTEEL_ROBUST("tungstensteel_robust"),
        COKE_BRICKS("coke_bricks"),
        INCONEL_600_SOLID("inconel_600_solid"),
        INCONEL_X750_SOLID("inconel_x750_solid"),
        INCONEL_MA758_SOLID("inconel_ma758_solid"),
        HASTELLOY_N_SOLID("hastelloy_n_solid"),
        HASTELLOY_K243_SOLID("hastelloy_k243_solid"),
        HASTELLOY_X78_SOLID("hastelloy_x78_solid");

        private final String name;

        MetalCasingType(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return this.name;
        }

    }

}
