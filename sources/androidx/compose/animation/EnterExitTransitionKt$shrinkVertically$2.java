package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionKt$shrinkVertically$2 extends Lambda implements Function1<IntSize, IntSize> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f2250z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$shrinkVertically$2(Function1 function1) {
        super(1);
        this.f2250z = function1;
    }

    public final long b(long j2) {
        return IntSize.c((((long) ((Number) this.f2250z.invoke(Integer.valueOf((int) (j2 & 4294967295L)))).intValue()) & 4294967295L) | (((long) ((int) (j2 >> 32))) << 32));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.b(b(((IntSize) obj).j()));
    }
}
