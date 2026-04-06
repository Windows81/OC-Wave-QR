package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorConvertersKt$IntOffsetToVector$1 extends Lambda implements Function1<IntOffset, AnimationVector2D> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorConvertersKt$IntOffsetToVector$1 f2798z = new VectorConvertersKt$IntOffsetToVector$1();

    public VectorConvertersKt$IntOffsetToVector$1() {
        super(1);
    }

    public final AnimationVector2D b(long j2) {
        return new AnimationVector2D((float) IntOffset.k(j2), (float) IntOffset.l(j2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((IntOffset) obj).r());
    }
}
