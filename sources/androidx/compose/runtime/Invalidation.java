package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
final class Invalidation {

    /* renamed from: a  reason: collision with root package name */
    public final RecomposeScopeImpl f14683a;

    /* renamed from: b  reason: collision with root package name */
    public int f14684b;

    /* renamed from: c  reason: collision with root package name */
    public Object f14685c;

    public Invalidation(RecomposeScopeImpl recomposeScopeImpl, int i2, Object obj) {
        this.f14683a = recomposeScopeImpl;
        this.f14684b = i2;
        this.f14685c = obj;
    }

    public final Object a() {
        return this.f14685c;
    }

    public final int b() {
        return this.f14684b;
    }

    public final RecomposeScopeImpl c() {
        return this.f14683a;
    }

    public final boolean d() {
        return this.f14683a.x(this.f14685c);
    }

    public final void e(Object obj) {
        this.f14685c = obj;
    }

    public final void f(int i2) {
        this.f14684b = i2;
    }
}
