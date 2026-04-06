package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;

@Metadata
public final class AnimatableKt {

    /* renamed from: a  reason: collision with root package name */
    public static final AnimationVector1D f2437a = AnimationVectorsKt.a(Float.POSITIVE_INFINITY);

    /* renamed from: b  reason: collision with root package name */
    public static final AnimationVector2D f2438b = AnimationVectorsKt.b(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c  reason: collision with root package name */
    public static final AnimationVector3D f2439c = AnimationVectorsKt.c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d  reason: collision with root package name */
    public static final AnimationVector4D f2440d = AnimationVectorsKt.d(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e  reason: collision with root package name */
    public static final AnimationVector1D f2441e = AnimationVectorsKt.a(Float.NEGATIVE_INFINITY);

    /* renamed from: f  reason: collision with root package name */
    public static final AnimationVector2D f2442f = AnimationVectorsKt.b(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g  reason: collision with root package name */
    public static final AnimationVector3D f2443g = AnimationVectorsKt.c(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h  reason: collision with root package name */
    public static final AnimationVector4D f2444h = AnimationVectorsKt.d(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final Animatable a(float f2, float f3) {
        return new Animatable(Float.valueOf(f2), VectorConvertersKt.i(FloatCompanionObject.f40896a), Float.valueOf(f3), (String) null, 8, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Animatable b(float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 0.01f;
        }
        return a(f2, f3);
    }
}
