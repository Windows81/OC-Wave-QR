package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorConvertersKt$DpToVector$2 extends Lambda implements Function1<AnimationVector1D, Dp> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorConvertersKt$DpToVector$2 f2795z = new VectorConvertersKt$DpToVector$2();

    public VectorConvertersKt$DpToVector$2() {
        super(1);
    }

    public final float b(AnimationVector1D animationVector1D) {
        return Dp.m(animationVector1D.f());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Dp.j(b((AnimationVector1D) obj));
    }
}
