package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class AnimatedContentTransitionScopeImpl$slideOutOfContainer$4 extends Lambda implements Function1<Integer, Integer> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f2094A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl f2095z;

    public final Integer b(int i2) {
        State state = (State) this.f2095z.n().e(this.f2095z.o().q());
        long j2 = state != null ? ((IntSize) state.getValue()).j() : IntSize.f19170b.a();
        long j3 = (long) i2;
        return (Integer) this.f2094A.invoke(Integer.valueOf((-IntOffset.l(this.f2095z.g(IntSize.c((j3 & 4294967295L) | (j3 << 32)), j2))) + ((int) (j2 & 4294967295L))));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
