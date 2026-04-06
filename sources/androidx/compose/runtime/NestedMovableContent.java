package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
final class NestedMovableContent {

    /* renamed from: a  reason: collision with root package name */
    public final MovableContentStateReference f14738a;

    /* renamed from: b  reason: collision with root package name */
    public final MovableContentStateReference f14739b;

    public NestedMovableContent(MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        this.f14738a = movableContentStateReference;
        this.f14739b = movableContentStateReference2;
    }

    public final MovableContentStateReference a() {
        return this.f14739b;
    }

    public final MovableContentStateReference b() {
        return this.f14738a;
    }
}
