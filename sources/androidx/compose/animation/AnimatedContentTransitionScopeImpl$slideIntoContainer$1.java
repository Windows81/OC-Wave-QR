package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class AnimatedContentTransitionScopeImpl$slideIntoContainer$1 extends Lambda implements Function1<Integer, Integer> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl f2080A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f2081z;

    public final Integer b(int i2) {
        long j2 = (long) i2;
        return (Integer) this.f2081z.invoke(Integer.valueOf(((int) (this.f2080A.l() >> 32)) - IntOffset.k(this.f2080A.g(IntSize.c((j2 & 4294967295L) | (j2 << 32)), this.f2080A.l()))));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
