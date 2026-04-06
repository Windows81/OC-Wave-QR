package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Transition$totalDurationNanos$2 extends Lambda implements Function0<Long> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f2743z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Transition$totalDurationNanos$2(Transition transition) {
        super(0);
        this.f2743z = transition;
    }

    /* renamed from: b */
    public final Long invoke() {
        return Long.valueOf(this.f2743z.f());
    }
}
