package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public final class RememberObserverHolder {

    /* renamed from: a  reason: collision with root package name */
    public RememberObserver f14832a;

    /* renamed from: b  reason: collision with root package name */
    public Anchor f14833b;

    public RememberObserverHolder(RememberObserver rememberObserver, Anchor anchor) {
        this.f14832a = rememberObserver;
        this.f14833b = anchor;
    }

    public final Anchor a() {
        return this.f14833b;
    }

    public final RememberObserver b() {
        return this.f14832a;
    }
}
