package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorConvertersKt$DpToVector$1 extends Lambda implements Function1<Dp, AnimationVector1D> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorConvertersKt$DpToVector$1 f2794z = new VectorConvertersKt$DpToVector$1();

    public VectorConvertersKt$DpToVector$1() {
        super(1);
    }

    public final AnimationVector1D b(float f2) {
        return new AnimationVector1D(f2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Dp) obj).t());
    }
}
