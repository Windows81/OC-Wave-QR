package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 extends Lambda implements Function1<Long, Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f2579z;

    public final Object b(long j2) {
        return this.f2579z.invoke(Long.valueOf(j2 / 1000000));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).longValue());
    }
}
