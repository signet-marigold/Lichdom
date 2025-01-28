package net.m1sha365.lichdom.registry;

import net.m1sha365.lichdom.LichdomCommon;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public final class SoundRegistry {
	public static void init() {}

	public static Supplier<SoundEvent> JACK_MUSIC = registerSound("jack_in_the_box_music", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "jack_in_the_box_music")));

	private static <T extends SoundEvent> Supplier<T> registerSound(String id, Supplier<T> sound) {
		return LichdomCommon.COMMON_PLATFORM.registerSound(id, sound);
	}
}
