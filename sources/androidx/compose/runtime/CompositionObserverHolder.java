package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CompositionObserverHolder {

    /* renamed from: a  reason: collision with root package name */
    public CompositionObserver f14631a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14632b;

    /* renamed from: c  reason: collision with root package name */
    public final CompositionContext f14633c;

    public CompositionObserverHolder(CompositionObserver compositionObserver, boolean z2, CompositionContext compositionContext) {
        this.f14631a = compositionObserver;
        this.f14632b = z2;
        this.f14633c = compositionContext;
    }

    public final CompositionObserver a() {
        if (this.f14632b) {
            return this.f14631a;
        }
        CompositionObserverHolder k2 = this.f14633c.k();
        CompositionObserver compositionObserver = k2 != null ? k2.f14631a : null;
        if (Intrinsics.d(compositionObserver, this.f14631a)) {
            return compositionObserver;
        }
        this.f14631a = compositionObserver;
        return compositionObserver;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompositionObserverHolder(CompositionObserver compositionObserver, boolean z2, CompositionContext compositionContext, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : compositionObserver, (i2 & 2) != 0 ? false : z2, compositionContext);
    }
}
