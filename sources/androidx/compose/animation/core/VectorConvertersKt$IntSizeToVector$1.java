package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorConvertersKt$IntSizeToVector$1 extends Lambda implements Function1<IntSize, AnimationVector2D> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorConvertersKt$IntSizeToVector$1 f2800z = new VectorConvertersKt$IntSizeToVector$1();

    public VectorConvertersKt$IntSizeToVector$1() {
        super(1);
    }

    public final AnimationVector2D b(long j2) {
        return new AnimationVector2D((float) ((int) (j2 >> 32)), (float) ((int) (j2 & 4294967295L)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((IntSize) obj).j());
    }
}
