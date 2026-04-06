package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class BoundsTransformDeferredAnimation {

    /* renamed from: a  reason: collision with root package name */
    public Animatable f2167a;

    /* renamed from: b  reason: collision with root package name */
    public long f2168b;

    /* renamed from: c  reason: collision with root package name */
    public long f2169c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2170d;

    /* renamed from: e  reason: collision with root package name */
    public long f2171e;

    /* renamed from: f  reason: collision with root package name */
    public long f2172f;

    /* renamed from: g  reason: collision with root package name */
    public final MutableState f2173g = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: h  reason: collision with root package name */
    public List f2174h;

    /* renamed from: i  reason: collision with root package name */
    public long f2175i;

    public BoundsTransformDeferredAnimation() {
        Size.Companion companion = Size.f15876b;
        this.f2168b = companion.a();
        Offset.Companion companion2 = Offset.f15855b;
        this.f2169c = companion2.b();
        this.f2171e = companion2.b();
        this.f2172f = companion.a();
        this.f2175i = companion2.c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        r14 = (androidx.compose.ui.geometry.Rect) r14.m();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.geometry.Rect a(kotlinx.coroutines.CoroutineScope r14, androidx.compose.animation.BoundsTransform r15) {
        /*
            r13 = this;
            long r0 = r13.f2169c
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r2 = r2 & r0
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0050
            long r2 = r13.f2168b
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0050
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.ui.geometry.RectKt.c(r0, r2)
            androidx.compose.animation.core.Animatable r1 = r13.f2167a
            if (r1 != 0) goto L_0x0031
            androidx.compose.animation.core.Animatable r1 = new androidx.compose.animation.core.Animatable
            androidx.compose.ui.geometry.Rect$Companion r2 = androidx.compose.ui.geometry.Rect.f15860e
            androidx.compose.animation.core.TwoWayConverter r7 = androidx.compose.animation.core.VectorConvertersKt.c(r2)
            r10 = 12
            r11 = 0
            r8 = 0
            r9 = 0
            r5 = r1
            r6 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x0031:
            r6 = r1
            r13.f2167a = r6
            boolean r1 = r13.f2170d
            if (r1 == 0) goto L_0x0050
            r1 = 0
            r13.f2170d = r1
            kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1 r2 = new androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1
            r10 = 0
            r5 = r2
            r7 = r0
            r8 = r15
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r11 = 1
            r12 = 0
            r8 = 0
            r7 = r14
            r9 = r1
            r10 = r2
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r7, r8, r9, r10, r11, r12)
        L_0x0050:
            androidx.compose.animation.core.Animatable r14 = r13.f2167a
            if (r14 == 0) goto L_0x005c
            java.lang.Object r14 = r14.m()
            androidx.compose.ui.geometry.Rect r14 = (androidx.compose.ui.geometry.Rect) r14
            if (r14 != 0) goto L_0x0062
        L_0x005c:
            androidx.compose.ui.geometry.Rect$Companion r14 = androidx.compose.ui.geometry.Rect.f15860e
            androidx.compose.ui.geometry.Rect r14 = r14.a()
        L_0x0062:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.BoundsTransformDeferredAnimation.a(kotlinx.coroutines.CoroutineScope, androidx.compose.animation.BoundsTransform):androidx.compose.ui.geometry.Rect");
    }

    public final Rect b() {
        return (Rect) this.f2173g.getValue();
    }

    public final Rect c() {
        long j2 = this.f2172f;
        long j3 = this.f2171e;
        if ((9223372034707292159L & j3) == 9205357640488583168L || j2 == 9205357640488583168L) {
            return null;
        }
        return RectKt.c(j3, j2);
    }

    public final long d() {
        return this.f2172f;
    }

    public final Rect e() {
        if (f()) {
            return null;
        }
        return b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f2167a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
            r2 = this;
            boolean r0 = r2.f2170d
            if (r0 != 0) goto L_0x000f
            androidx.compose.animation.core.Animatable r0 = r2.f2167a
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.p()
            if (r0 != r1) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.BoundsTransformDeferredAnimation.f():boolean");
    }

    public final void g(Rect rect) {
        this.f2173g.setValue(rect);
    }

    public final void h(long j2, long j3) {
        this.f2171e = j2;
        this.f2172f = j3;
    }

    public final void i(long j2) {
        if ((this.f2169c & 9223372034707292159L) != 9205357640488583168L && !IntOffset.j(IntOffsetKt.d(j2), IntOffsetKt.d(this.f2169c))) {
            this.f2170d = true;
        }
        this.f2169c = j2;
        if ((this.f2171e & 9223372034707292159L) == 9205357640488583168L) {
            this.f2171e = j2;
        }
    }

    public final void j(LookaheadScope lookaheadScope, Placeable.PlacementScope placementScope, CoroutineScope coroutineScope, boolean z2, boolean z3, BoundsTransform boundsTransform) {
        LayoutCoordinates e2 = placementScope.e();
        if (e2 != null) {
            LayoutCoordinates u2 = lookaheadScope.u(placementScope);
            long c2 = Offset.f15855b.c();
            if (!z3 && z2) {
                List list = this.f2174h;
                if (list == null) {
                    list = new ArrayList();
                }
                int i2 = 0;
                LayoutCoordinates layoutCoordinates = e2;
                while (!Intrinsics.d(lookaheadScope.f(layoutCoordinates), u2)) {
                    if (layoutCoordinates.H()) {
                        if (list.size() == i2) {
                            list.add(layoutCoordinates);
                            c2 = Offset.q(c2, LayoutCoordinatesKt.e(layoutCoordinates));
                        } else if (!Intrinsics.d(list.get(i2), layoutCoordinates)) {
                            long p2 = Offset.p(c2, LayoutCoordinatesKt.e((LayoutCoordinates) list.get(i2)));
                            list.set(i2, layoutCoordinates);
                            c2 = Offset.q(p2, LayoutCoordinatesKt.e(layoutCoordinates));
                        }
                        i2++;
                    }
                    layoutCoordinates = layoutCoordinates.P();
                    if (layoutCoordinates == null) {
                        break;
                    }
                }
                int size = list.size() - 1;
                if (i2 <= size) {
                    while (true) {
                        c2 = Offset.p(c2, LayoutCoordinatesKt.e((LayoutCoordinates) list.get(size)));
                        list.remove(list.size() - 1);
                        if (size == i2) {
                            break;
                        }
                        size--;
                    }
                }
                this.f2174h = list;
            }
            this.f2175i = Offset.q(this.f2175i, c2);
            i(Offset.q(LookaheadScope.b(lookaheadScope, u2, e2, 0, z3, 2, (Object) null), this.f2175i));
            g(a(coroutineScope, boundsTransform).B(Offset.e(this.f2175i ^ -9223372034707292160L)));
        }
    }

    public final void k(long j2) {
        if (this.f2168b != 9205357640488583168L && !IntSize.e(IntSizeKt.c(j2), IntSizeKt.c(this.f2168b))) {
            this.f2170d = true;
        }
        this.f2168b = j2;
        if (this.f2172f == 9205357640488583168L) {
            this.f2172f = j2;
        }
    }
}
