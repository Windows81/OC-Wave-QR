package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorConvertersKt$IntSizeToVector$2 extends Lambda implements Function1<AnimationVector2D, IntSize> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorConvertersKt$IntSizeToVector$2 f2801z = new VectorConvertersKt$IntSizeToVector$2();

    public VectorConvertersKt$IntSizeToVector$2() {
        super(1);
    }

    public final long b(AnimationVector2D animationVector2D) {
        int round = Math.round(animationVector2D.f());
        int i2 = 0;
        if (round < 0) {
            round = 0;
        }
        int round2 = Math.round(animationVector2D.g());
        if (round2 >= 0) {
            i2 = round2;
        }
        return IntSize.c((((long) i2) & 4294967295L) | (((long) round) << 32));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.b(b((AnimationVector2D) obj));
    }
}
