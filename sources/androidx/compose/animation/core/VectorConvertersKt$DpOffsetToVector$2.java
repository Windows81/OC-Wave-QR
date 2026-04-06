package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorConvertersKt$DpOffsetToVector$2 extends Lambda implements Function1<AnimationVector2D, DpOffset> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorConvertersKt$DpOffsetToVector$2 f2793z = new VectorConvertersKt$DpOffsetToVector$2();

    public VectorConvertersKt$DpOffsetToVector$2() {
        super(1);
    }

    public final long b(AnimationVector2D animationVector2D) {
        return DpOffset.c((((long) Float.floatToRawIntBits(Dp.m(animationVector2D.f()))) << 32) | (((long) Float.floatToRawIntBits(Dp.m(animationVector2D.g()))) & 4294967295L));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return DpOffset.b(b((AnimationVector2D) obj));
    }
}
