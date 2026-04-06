package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorConvertersKt$FloatToVector$2 extends Lambda implements Function1<AnimationVector1D, Float> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorConvertersKt$FloatToVector$2 f2797z = new VectorConvertersKt$FloatToVector$2();

    public VectorConvertersKt$FloatToVector$2() {
        super(1);
    }

    /* renamed from: b */
    public final Float invoke(AnimationVector1D animationVector1D) {
        return Float.valueOf(animationVector1D.f());
    }
}
