package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class MonotonicFrameClockKt$withFrameMillis$2 implements Function1<Long, Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f14708z;

    public MonotonicFrameClockKt$withFrameMillis$2(Function1 function1) {
        this.f14708z = function1;
    }

    public final Object b(long j2) {
        return this.f14708z.invoke(Long.valueOf(j2 / 1000000));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).longValue());
    }
}
