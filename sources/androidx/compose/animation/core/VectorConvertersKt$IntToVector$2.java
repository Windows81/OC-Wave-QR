package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorConvertersKt$IntToVector$2 extends Lambda implements Function1<AnimationVector1D, Integer> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorConvertersKt$IntToVector$2 f2803z = new VectorConvertersKt$IntToVector$2();

    public VectorConvertersKt$IntToVector$2() {
        super(1);
    }

    /* renamed from: b */
    public final Integer invoke(AnimationVector1D animationVector1D) {
        return Integer.valueOf((int) animationVector1D.f());
    }
}
