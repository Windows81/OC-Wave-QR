package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.platform.InfiniteAnimationPolicy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@Metadata
public final class InfiniteAnimationPolicyKt {
    public static final Object a(Function1 function1, Continuation continuation) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) continuation.f().d(InfiniteAnimationPolicy.f17787j);
        return infiniteAnimationPolicy == null ? MonotonicFrameClockKt.c(function1, continuation) : infiniteAnimationPolicy.I(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(function1, (Continuation) null), continuation);
    }
}
