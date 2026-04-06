package androidx.compose.animation;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
final class AnimateBoundsModifierKt$animateBounds$2 extends Lambda implements Function2<IntSize, Constraints, Constraints> {

    /* renamed from: z  reason: collision with root package name */
    public static final AnimateBoundsModifierKt$animateBounds$2 f2018z = new AnimateBoundsModifierKt$animateBounds$2();

    public AnimateBoundsModifierKt$animateBounds$2() {
        super(2);
    }

    public final long b(long j2, long j3) {
        return Constraints.f19137b.c((int) (j2 >> 32), (int) (j2 & 4294967295L));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return Constraints.a(b(((IntSize) obj).j(), ((Constraints) obj2).r()));
    }
}
