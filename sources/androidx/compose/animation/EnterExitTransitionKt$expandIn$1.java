package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionKt$expandIn$1 extends Lambda implements Function1<IntSize, IntSize> {

    /* renamed from: z  reason: collision with root package name */
    public static final EnterExitTransitionKt$expandIn$1 f2243z = new EnterExitTransitionKt$expandIn$1();

    public EnterExitTransitionKt$expandIn$1() {
        super(1);
    }

    public final long b(long j2) {
        long j3 = (long) 0;
        return IntSize.c((j3 & 4294967295L) | (j3 << 32));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.b(b(((IntSize) obj).j()));
    }
}
