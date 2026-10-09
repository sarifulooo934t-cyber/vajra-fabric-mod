package com.sariful.vajra.item;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

public class VajraItem extends Item {
	public VajraItem(Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResult use(Level level, Player player, InteractionHand hand) {
		ItemStack stack = player.getItemInHand(hand);

		if (level instanceof ServerLevel serverLevel) {
			HitResult hit = player.pick(80.0D, 0.0F, false);

			if (hit.getType() == HitResult.Type.BLOCK) {
				BlockPos pos = ((BlockHitResult) hit).getBlockPos();

				LightningBolt bolt = new LightningBolt(EntityType.LIGHTNING_BOLT, serverLevel);
				bolt.setPos(pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D);
				bolt.setVisualOnly(false);
				serverLevel.addFreshEntity(bolt);

				serverLevel.playSound(null, player.getX(), player.getY(), player.getZ(),
						SoundEvents.LIGHTNING_BOLT_THUNDER, SoundSource.PLAYERS, 1.0F, 1.0F);
			}
		}

		player.getCooldowns().addCooldown(stack, 60);
		return InteractionResult.SUCCESS;
	}
}
