package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class Colors {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f7506a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f7507b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f7508c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f7509d;

    /* renamed from: e  reason: collision with root package name */
    public final MutableState f7510e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableState f7511f;

    /* renamed from: g  reason: collision with root package name */
    public final MutableState f7512g;

    /* renamed from: h  reason: collision with root package name */
    public final MutableState f7513h;

    /* renamed from: i  reason: collision with root package name */
    public final MutableState f7514i;

    /* renamed from: j  reason: collision with root package name */
    public final MutableState f7515j;

    /* renamed from: k  reason: collision with root package name */
    public final MutableState f7516k;

    /* renamed from: l  reason: collision with root package name */
    public final MutableState f7517l;

    /* renamed from: m  reason: collision with root package name */
    public final MutableState f7518m;

    public /* synthetic */ Colors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z2);
    }

    public static /* synthetic */ Colors b(Colors colors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z2, int i2, Object obj) {
        int i3 = i2;
        return colors.a((i3 & 1) != 0 ? colors.j() : j2, (i3 & 2) != 0 ? colors.k() : j3, (i3 & 4) != 0 ? colors.l() : j4, (i3 & 8) != 0 ? colors.m() : j5, (i3 & 16) != 0 ? colors.c() : j6, (i3 & 32) != 0 ? colors.n() : j7, (i3 & 64) != 0 ? colors.d() : j8, (i3 & 128) != 0 ? colors.g() : j9, (i3 & 256) != 0 ? colors.h() : j10, (i3 & 512) != 0 ? colors.e() : j11, (i3 & 1024) != 0 ? colors.i() : j12, (i3 & 2048) != 0 ? colors.f() : j13, (i3 & 4096) != 0 ? colors.o() : z2);
    }

    public final void A(long j2) {
        this.f7509d.setValue(Color.h(j2));
    }

    public final void B(long j2) {
        this.f7511f.setValue(Color.h(j2));
    }

    public final Colors a(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z2) {
        return new Colors(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z2, (DefaultConstructorMarker) null);
    }

    public final long c() {
        return ((Color) this.f7510e.getValue()).v();
    }

    public final long d() {
        return ((Color) this.f7512g.getValue()).v();
    }

    public final long e() {
        return ((Color) this.f7515j.getValue()).v();
    }

    public final long f() {
        return ((Color) this.f7517l.getValue()).v();
    }

    public final long g() {
        return ((Color) this.f7513h.getValue()).v();
    }

    public final long h() {
        return ((Color) this.f7514i.getValue()).v();
    }

    public final long i() {
        return ((Color) this.f7516k.getValue()).v();
    }

    public final long j() {
        return ((Color) this.f7506a.getValue()).v();
    }

    public final long k() {
        return ((Color) this.f7507b.getValue()).v();
    }

    public final long l() {
        return ((Color) this.f7508c.getValue()).v();
    }

    public final long m() {
        return ((Color) this.f7509d.getValue()).v();
    }

    public final long n() {
        return ((Color) this.f7511f.getValue()).v();
    }

    public final boolean o() {
        return ((Boolean) this.f7518m.getValue()).booleanValue();
    }

    public final void p(long j2) {
        this.f7510e.setValue(Color.h(j2));
    }

    public final void q(long j2) {
        this.f7512g.setValue(Color.h(j2));
    }

    public final void r(boolean z2) {
        this.f7518m.setValue(Boolean.valueOf(z2));
    }

    public final void s(long j2) {
        this.f7515j.setValue(Color.h(j2));
    }

    public final void t(long j2) {
        this.f7517l.setValue(Color.h(j2));
    }

    public String toString() {
        return "Colors(primary=" + Color.u(j()) + ", primaryVariant=" + Color.u(k()) + ", secondary=" + Color.u(l()) + ", secondaryVariant=" + Color.u(m()) + ", background=" + Color.u(c()) + ", surface=" + Color.u(n()) + ", error=" + Color.u(d()) + ", onPrimary=" + Color.u(g()) + ", onSecondary=" + Color.u(h()) + ", onBackground=" + Color.u(e()) + ", onSurface=" + Color.u(i()) + ", onError=" + Color.u(f()) + ", isLight=" + o() + ')';
    }

    public final void u(long j2) {
        this.f7513h.setValue(Color.h(j2));
    }

    public final void v(long j2) {
        this.f7514i.setValue(Color.h(j2));
    }

    public final void w(long j2) {
        this.f7516k.setValue(Color.h(j2));
    }

    public final void x(long j2) {
        this.f7506a.setValue(Color.h(j2));
    }

    public final void y(long j2) {
        this.f7507b.setValue(Color.h(j2));
    }

    public final void z(long j2) {
        this.f7508c.setValue(Color.h(j2));
    }

    public Colors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z2) {
        this.f7506a = SnapshotStateKt.i(Color.h(j2), SnapshotStateKt.r());
        this.f7507b = SnapshotStateKt.i(Color.h(j3), SnapshotStateKt.r());
        this.f7508c = SnapshotStateKt.i(Color.h(j4), SnapshotStateKt.r());
        this.f7509d = SnapshotStateKt.i(Color.h(j5), SnapshotStateKt.r());
        this.f7510e = SnapshotStateKt.i(Color.h(j6), SnapshotStateKt.r());
        this.f7511f = SnapshotStateKt.i(Color.h(j7), SnapshotStateKt.r());
        this.f7512g = SnapshotStateKt.i(Color.h(j8), SnapshotStateKt.r());
        this.f7513h = SnapshotStateKt.i(Color.h(j9), SnapshotStateKt.r());
        this.f7514i = SnapshotStateKt.i(Color.h(j10), SnapshotStateKt.r());
        this.f7515j = SnapshotStateKt.i(Color.h(j11), SnapshotStateKt.r());
        this.f7516k = SnapshotStateKt.i(Color.h(j12), SnapshotStateKt.r());
        this.f7517l = SnapshotStateKt.i(Color.h(j13), SnapshotStateKt.r());
        this.f7518m = SnapshotStateKt.i(Boolean.valueOf(z2), SnapshotStateKt.r());
    }
}
