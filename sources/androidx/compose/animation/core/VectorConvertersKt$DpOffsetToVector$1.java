package androidx.compose.animation.core;

import androidx.compose.ui.unit.DpOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorConvertersKt$DpOffsetToVector$1 extends Lambda implements Function1<DpOffset, AnimationVector2D> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorConvertersKt$DpOffsetToVector$1 f2792z = new VectorConvertersKt$DpOffsetToVector$1();

    public VectorConvertersKt$DpOffsetToVector$1() {
        super(1);
    }

    public final AnimationVector2D b(long j2) {
        return new AnimationVector2D(DpOffset.f(j2), DpOffset.g(j2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((DpOffset) obj).j());
    }
}
