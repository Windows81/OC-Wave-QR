package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SuspendAnimationKt$callWithFrameNanos$2 extends Lambda implements Function1<Long, Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f2701z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$callWithFrameNanos$2(Function1 function1) {
        super(1);
        this.f2701z = function1;
    }

    public final Object b(long j2) {
        return this.f2701z.invoke(Long.valueOf(j2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).longValue());
    }
}
