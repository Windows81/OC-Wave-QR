package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class KeyframeBaseEntity<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2606a;

    /* renamed from: b  reason: collision with root package name */
    public Easing f2607b;

    public /* synthetic */ KeyframeBaseEntity(Object obj, Easing easing, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, easing);
    }

    public final Easing a() {
        return this.f2607b;
    }

    public final Object b() {
        return this.f2606a;
    }

    public final void c(Easing easing) {
        this.f2607b = easing;
    }

    public KeyframeBaseEntity(Object obj, Easing easing) {
        this.f2606a = obj;
        this.f2607b = easing;
    }
}
