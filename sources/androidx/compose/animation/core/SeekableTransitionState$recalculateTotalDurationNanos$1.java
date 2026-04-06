package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SeekableTransitionState$recalculateTotalDurationNanos$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SeekableTransitionState f2669z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$recalculateTotalDurationNanos$1(SeekableTransitionState seekableTransitionState) {
        super(0);
        this.f2669z = seekableTransitionState;
    }

    public final void invoke() {
        SeekableTransitionState seekableTransitionState = this.f2669z;
        Transition p2 = seekableTransitionState.f2646e;
        seekableTransitionState.W(p2 != null ? p2.r() : 0);
    }
}
