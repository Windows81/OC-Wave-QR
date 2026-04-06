package androidx.compose.animation.core;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.KeyframeBaseEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class KeyframesSpecBaseConfig<T, E extends KeyframeBaseEntity<T>> {

    /* renamed from: a  reason: collision with root package name */
    public int f2610a;

    /* renamed from: b  reason: collision with root package name */
    public int f2611b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableIntObjectMap f2612c;

    public /* synthetic */ KeyframesSpecBaseConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int a() {
        return this.f2611b;
    }

    public final int b() {
        return this.f2610a;
    }

    public final MutableIntObjectMap c() {
        return this.f2612c;
    }

    public final void d(int i2) {
        this.f2610a = i2;
    }

    public final KeyframeBaseEntity e(KeyframeBaseEntity keyframeBaseEntity, Easing easing) {
        keyframeBaseEntity.c(easing);
        return keyframeBaseEntity;
    }

    public KeyframesSpecBaseConfig() {
        this.f2610a = 300;
        this.f2612c = IntObjectMapKt.c();
    }
}
