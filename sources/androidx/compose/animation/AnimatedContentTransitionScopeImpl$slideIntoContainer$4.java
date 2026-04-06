package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class AnimatedContentTransitionScopeImpl$slideIntoContainer$4 extends Lambda implements Function1<Integer, Integer> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl f2086A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f2087z;

    public final Integer b(int i2) {
        long j2 = (long) i2;
        return (Integer) this.f2087z.invoke(Integer.valueOf((-IntOffset.l(this.f2086A.g(IntSize.c((j2 & 4294967295L) | (j2 << 32)), this.f2086A.l()))) - i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
