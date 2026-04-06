package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorConvertersKt$IntToVector$1 extends Lambda implements Function1<Integer, AnimationVector1D> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorConvertersKt$IntToVector$1 f2802z = new VectorConvertersKt$IntToVector$1();

    public VectorConvertersKt$IntToVector$1() {
        super(1);
    }

    public final AnimationVector1D b(int i2) {
        return new AnimationVector1D((float) i2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
