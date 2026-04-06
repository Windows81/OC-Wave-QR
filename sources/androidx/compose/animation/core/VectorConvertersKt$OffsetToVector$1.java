package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorConvertersKt$OffsetToVector$1 extends Lambda implements Function1<Offset, AnimationVector2D> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorConvertersKt$OffsetToVector$1 f2804z = new VectorConvertersKt$OffsetToVector$1();

    public VectorConvertersKt$OffsetToVector$1() {
        super(1);
    }

    public final AnimationVector2D b(long j2) {
        return new AnimationVector2D(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Offset) obj).t());
    }
}
