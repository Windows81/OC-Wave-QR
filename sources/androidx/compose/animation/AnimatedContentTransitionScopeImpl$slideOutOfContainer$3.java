package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class AnimatedContentTransitionScopeImpl$slideOutOfContainer$3 extends Lambda implements Function1<Integer, Integer> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f2092A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl f2093z;

    public final Integer b(int i2) {
        State state = (State) this.f2093z.n().e(this.f2093z.o().q());
        long j2 = (long) i2;
        return (Integer) this.f2092A.invoke(Integer.valueOf((-IntOffset.l(this.f2093z.g(IntSize.c((j2 & 4294967295L) | (j2 << 32)), state != null ? ((IntSize) state.getValue()).j() : IntSize.f19170b.a()))) - i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
