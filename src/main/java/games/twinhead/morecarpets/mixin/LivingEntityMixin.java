package games.twinhead.morecarpets.mixin;

import games.twinhead.morecarpets.block.FunctionalCarpetBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.tag.BlockTags;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin extends Entity {
    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }


    @Inject(method = "isOnSoulSpeedBlock", at = @At(value = "HEAD"), cancellable = true)
    public void isOnSoulBlock(CallbackInfoReturnable<Boolean> cir){
        if(((LivingEntity)(Object)this).world.getBlockState(this.getVelocityAffectingPos().up()).getBlock() instanceof FunctionalCarpetBlock carpetBlock){
            if(carpetBlock.getDefaultState().isIn(BlockTags.SOUL_SPEED_BLOCKS)){
                cir.setReturnValue(true);
            }

        }
    }

    @Redirect(method = "travel", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/Block;getSlipperiness()F"))
    public float addIceSlipperiness(Block instance){
        if(((LivingEntity)(Object)this).world.getBlockState(this.getVelocityAffectingPos().up()).getBlock() instanceof FunctionalCarpetBlock carpetBlock){
            return carpetBlock.getSlipperiness();
        } else {
            return instance.getSlipperiness();
        }
    }


    @Shadow
    protected void initDataTracker() {

    }

    @Shadow
    public void readCustomDataFromNbt(NbtCompound nbt) {

    }

    @Shadow
    public void writeCustomDataToNbt(NbtCompound nbt) {

    }

    @Shadow
    public Packet<?> createSpawnPacket() {
        return null;
    }
}
