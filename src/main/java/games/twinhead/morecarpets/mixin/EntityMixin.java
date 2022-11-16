package games.twinhead.morecarpets.mixin;

import games.twinhead.morecarpets.block.FunctionalCarpetBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.server.command.CommandOutput;
import net.minecraft.text.Text;
import net.minecraft.util.Nameable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.entity.EntityChangeListener;
import net.minecraft.world.entity.EntityLike;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.UUID;
import java.util.stream.Stream;

@Mixin(Entity.class)
public abstract class EntityMixin implements Nameable, EntityLike, CommandOutput {

    @Redirect(method = "move", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/Block;onSteppedOn(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;Lnet/minecraft/entity/Entity;)V"))
    public void move(Block instance, World world, BlockPos pos, BlockState state, Entity entity){
        if(((Entity)(Object) this).getBlockStateAtPos().getBlock() instanceof FunctionalCarpetBlock carpetBlock){
            carpetBlock.onSteppedOn(world, entity.getBlockPos(), state, entity);
        } else {
            state.getBlock().onSteppedOn(world, pos, state, entity);
        }
    }

    @Redirect(method = "move", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/Block;onEntityLand(Lnet/minecraft/world/BlockView;Lnet/minecraft/entity/Entity;)V"))
    public void move(Block instance, BlockView world, Entity entity){
        if(((Entity)(Object) this).getBlockStateAtPos().getBlock() instanceof FunctionalCarpetBlock carpetBlock){
            carpetBlock.onEntityLand(world, entity);
        } else {
            instance.onEntityLand(world, entity);
        }
    }

    @Redirect(method = "fall", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/Block;onLandedUpon(Lnet/minecraft/world/World;Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/Entity;F)V"))
    private void injected(Block instance, World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        if(entity.getBlockStateAtPos().getBlock() instanceof FunctionalCarpetBlock carpetBlock){
            carpetBlock.onLandedUpon(world, state, pos, entity, fallDistance);
        } else {
            state.getBlock().onLandedUpon(world, state, pos, entity, fallDistance);
        }
    }

    @Shadow
    public void sendMessage(Text message) {
        
    }

    @Shadow
    public boolean shouldReceiveFeedback() {
        return false;
    }

    @Shadow
    public boolean shouldTrackOutput() {
        return false;
    }

    @Shadow
    public boolean shouldBroadcastConsoleToOps() {
        return false;
    }

    @Shadow
    public Text getName() {
        return null;
    }

    @Shadow
    public int getId() {
        return 0;
    }

    @Shadow
    public UUID getUuid() {
        return null;
    }

    @Shadow
    public BlockPos getBlockPos() {
        return null;
    }

    @Shadow
    public Box getBoundingBox() {
        return null;
    }

    @Shadow
    public void setChangeListener(EntityChangeListener changeListener) {

    }

    @Shadow
    public Stream<? extends EntityLike> streamSelfAndPassengers() {
        return null;
    }

    @Shadow
    public Stream<? extends EntityLike> streamPassengersAndSelf() {
        return null;
    }

    @Shadow
    public void setRemoved(Entity.RemovalReason reason) {

    }

    @Shadow
    public boolean shouldSave() {
        return false;
    }

    @Shadow
    public boolean isPlayer() {
        return false;
    }
}
