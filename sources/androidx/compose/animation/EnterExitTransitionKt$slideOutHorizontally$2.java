package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class EnterExitTransitionKt$slideOutHorizontally$2 extends Lambda implements Function1<IntSize, IntOffset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f2256z;

    public final long b(long j2) {
        return IntOffset.f((((long) ((Number) this.f2256z.invoke(Integer.valueOf((int) (j2 >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.c(b(((IntSize) obj).j()));
    }
}
