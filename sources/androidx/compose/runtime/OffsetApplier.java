package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class OffsetApplier<N> implements Applier<N> {

    /* renamed from: a  reason: collision with root package name */
    public final Applier f14741a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14742b;

    /* renamed from: c  reason: collision with root package name */
    public int f14743c;

    public OffsetApplier(Applier applier, int i2) {
        this.f14741a = applier;
        this.f14742b = i2;
    }

    public void a(int i2, int i3) {
        this.f14741a.a(i2 + (this.f14743c == 0 ? this.f14742b : 0), i3);
    }

    public Object b() {
        return this.f14741a.b();
    }

    public void c(int i2, Object obj) {
        this.f14741a.c(i2 + (this.f14743c == 0 ? this.f14742b : 0), obj);
    }

    public void clear() {
        ComposerKt.v("Clear is not valid on OffsetApplier");
    }

    public void d(Object obj) {
        this.f14743c++;
        this.f14741a.d(obj);
    }

    public void e() {
        this.f14741a.e();
    }

    public void g(int i2, int i3, int i4) {
        int i5 = this.f14743c == 0 ? this.f14742b : 0;
        this.f14741a.g(i2 + i5, i3 + i5, i4);
    }

    public void h() {
        if (!(this.f14743c > 0)) {
            ComposerKt.v("OffsetApplier up called with no corresponding down");
        }
        this.f14743c--;
        this.f14741a.h();
    }

    public void i(Function2 function2, Object obj) {
        this.f14741a.i(function2, obj);
    }

    public void j(int i2, Object obj) {
        this.f14741a.j(i2 + (this.f14743c == 0 ? this.f14742b : 0), obj);
    }
}
