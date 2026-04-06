package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionKt$slideInVertically$2 extends Lambda implements Function1<IntSize, IntOffset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f2254z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$slideInVertically$2(Function1 function1) {
        super(1);
        this.f2254z = function1;
    }

    public final long b(long j2) {
        return IntOffset.f((((long) ((Number) this.f2254z.invoke(Integer.valueOf((int) (j2 & 4294967295L)))).intValue()) & 4294967295L) | (((long) 0) << 32));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.c(b(((IntSize) obj).j()));
    }
}
