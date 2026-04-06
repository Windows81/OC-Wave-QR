package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorConvertersKt$SizeToVector$2 extends Lambda implements Function1<AnimationVector2D, Size> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorConvertersKt$SizeToVector$2 f2809z = new VectorConvertersKt$SizeToVector$2();

    public VectorConvertersKt$SizeToVector$2() {
        super(1);
    }

    public final long b(AnimationVector2D animationVector2D) {
        return Size.d((((long) Float.floatToRawIntBits(animationVector2D.f())) << 32) | (((long) Float.floatToRawIntBits(animationVector2D.g())) & 4294967295L));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Size.c(b((AnimationVector2D) obj));
    }
}
