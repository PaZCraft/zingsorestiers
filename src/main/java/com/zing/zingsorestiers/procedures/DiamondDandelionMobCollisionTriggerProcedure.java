package com.zing.zingsorestiers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class DiamondDandelionMobCollisionTriggerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.isBaby()) {
			if (entity instanceof net.minecraft.world.entity.Entity _ent) {
				net.minecraft.world.phys.Vec3 _backDir = _ent.getLookAngle().reverse();
				double _speed = 1;
				double _dist = 5;
				double _power = true ? (_speed * (_dist * 0.5d)) : _speed;
				net.minecraft.world.phys.Vec3 _motion = _backDir.scale(_power);
				_ent.setDeltaMovement(_motion);
				
				if (_ent instanceof net.minecraft.server.level.ServerPlayer _player) {
					_player.connection.send(new net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket(_ent));
				}
			}
			if (entity instanceof net.minecraft.world.entity.LivingEntity _livingEntity) {
				boolean _isBaby = ((double) 1) <= 0.0;
				if (_livingEntity instanceof net.minecraft.world.entity.AgeableMob _ageable) {
					_ageable.setBaby(_isBaby);
				} else {
					try {
						java.lang.reflect.Method _setBaby = _livingEntity.getClass().getMethod("setBaby", boolean.class);
						_setBaby.invoke(_livingEntity, _isBaby);
					} catch (Exception _e) {
						// fail
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.golden_dandelion.unuse")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.golden_dandelion.unuse")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			world.addParticle(ParticleTypes.PAUSE_MOB_GROWTH, x, y, z, 0, 1, 0);
		} else {
			if (entity instanceof net.minecraft.world.entity.Entity _ent) {
				net.minecraft.world.phys.Vec3 _backDir = _ent.getLookAngle().reverse();
				double _speed = 1;
				double _dist = 5;
				double _power = true ? (_speed * (_dist * 0.5d)) : _speed;
				net.minecraft.world.phys.Vec3 _motion = _backDir.scale(_power);
				_ent.setDeltaMovement(_motion);
				
				if (_ent instanceof net.minecraft.server.level.ServerPlayer _player) {
					_player.connection.send(new net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket(_ent));
				}
			}
			if (entity instanceof net.minecraft.world.entity.LivingEntity _livingEntity) {
				boolean _isBaby = ((double) 0) <= 0.0;
				if (_livingEntity instanceof net.minecraft.world.entity.AgeableMob _ageable) {
					_ageable.setBaby(_isBaby);
				} else {
					try {
						java.lang.reflect.Method _setBaby = _livingEntity.getClass().getMethod("setBaby", boolean.class);
						_setBaby.invoke(_livingEntity, _isBaby);
					} catch (Exception _e) {
						// fail
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.golden_dandelion.use")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.golden_dandelion.use")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			world.addParticle(ParticleTypes.RESET_MOB_GROWTH, x, y, z, 0, 1, 0);
		}
	}
}