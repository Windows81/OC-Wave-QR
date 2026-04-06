package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorConvertersKt$IntOffsetToVector$2 extends Lambda implements Function1<AnimationVector2D, IntOffset> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorConvertersKt$IntOffsetToVector$2 f2799z = new VectorConvertersKt$IntOffsetToVector$2();

    public VectorConvertersKt$IntOffsetToVector$2() {
        super(1);
    }

    public final long b(AnimationVector2D animationVector2D) {
        return IntOffset.f((((long) Math.round(animationVector2D.f())) << 32) | (((long) Math.round(animationVector2D.g())) & 4294967295L));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.c(b((AnimationVector2D) obj));
    }
}
