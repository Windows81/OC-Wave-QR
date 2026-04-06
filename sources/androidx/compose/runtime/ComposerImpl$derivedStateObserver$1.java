package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public final class ComposerImpl$derivedStateObserver$1 implements DerivedStateObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComposerImpl f14606a;

    public ComposerImpl$derivedStateObserver$1(ComposerImpl composerImpl) {
        this.f14606a = composerImpl;
    }

    public void a(DerivedState derivedState) {
        this.f14606a.C = this.f14606a.C - 1;
    }

    public void b(DerivedState derivedState) {
        this.f14606a.C = this.f14606a.C + 1;
    }
}
