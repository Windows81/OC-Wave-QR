package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SharedElement {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2317a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedTransitionScopeImpl f2318b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f2319c = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f2320d = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    public final MutableState f2321e = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    public SharedElementInternalState f2322f;

    /* renamed from: g  reason: collision with root package name */
    public final SnapshotStateList f2323g = SnapshotStateKt.f();

    /* renamed from: h  reason: collision with root package name */
    public final Function1 f2324h = new SharedElement$updateMatch$1(this);

    /* renamed from: i  reason: collision with root package name */
    public final Function0 f2325i = new SharedElement$observingVisibilityChange$1(this);

    public SharedElement(Object obj, SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.f2317a = obj;
        this.f2318b = sharedTransitionScopeImpl;
    }

    public final void b(SharedElementInternalState sharedElementInternalState) {
        this.f2323g.add(sharedElementInternalState);
        this.f2318b.m(this, this.f2324h, this.f2325i);
    }

    public final Rect c() {
        return (Rect) this.f2321e.getValue();
    }

    public final boolean d() {
        return ((Boolean) this.f2320d.getValue()).booleanValue();
    }

    public final Object e() {
        return this.f2317a;
    }

    public final SharedTransitionScopeImpl f() {
        return this.f2318b;
    }

    public final SnapshotStateList g() {
        return this.f2323g;
    }

    public final Rect h() {
        SharedElementInternalState sharedElementInternalState = this.f2322f;
        r(sharedElementInternalState != null ? RectKt.c(sharedElementInternalState.c(), sharedElementInternalState.j()) : null);
        return j();
    }

    public final SharedElementInternalState i() {
        return this.f2322f;
    }

    public final Rect j() {
        return (Rect) this.f2319c.getValue();
    }

    public final boolean k() {
        SnapshotStateList snapshotStateList = this.f2323g;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((SharedElementInternalState) snapshotStateList.get(i2)).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        SnapshotStateList snapshotStateList = this.f2323g;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((SharedElementInternalState) snapshotStateList.get(i2)).d().i()) {
                return d();
            }
        }
        return false;
    }

    public final void m(SharedElementInternalState sharedElementInternalState, long j2, long j3) {
        if (sharedElementInternalState.d().f()) {
            this.f2322f = sharedElementInternalState;
            Rect j4 = j();
            Size size = null;
            Offset d2 = j4 != null ? Offset.d(j4.t()) : null;
            if (d2 == null ? false : Offset.j(d2.t(), j3)) {
                Rect j5 = j();
                if (j5 != null) {
                    size = Size.c(j5.q());
                }
                if (size == null ? false : Size.f(size.m(), j2)) {
                    return;
                }
            }
            Rect c2 = RectKt.c(j3, j2);
            r(c2);
            SnapshotStateList snapshotStateList = this.f2323g;
            int size2 = snapshotStateList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                BoundsAnimation d3 = ((SharedElementInternalState) snapshotStateList.get(i2)).d();
                Rect c3 = c();
                Intrinsics.f(c3);
                d3.a(c3, c2);
            }
        }
    }

    public final void n() {
        boolean z2 = true;
        if (this.f2323g.size() <= 1 || !k()) {
            z2 = false;
        }
        q(z2);
        r((Rect) null);
    }

    public final void o(SharedElementInternalState sharedElementInternalState) {
        this.f2323g.remove((Object) sharedElementInternalState);
        if (this.f2323g.isEmpty()) {
            s();
            this.f2318b.h(this);
            return;
        }
        this.f2318b.m(this, this.f2324h, this.f2325i);
    }

    public final void p(Rect rect) {
        this.f2321e.setValue(rect);
    }

    public final void q(boolean z2) {
        this.f2320d.setValue(Boolean.valueOf(z2));
    }

    public final void r(Rect rect) {
        this.f2319c.setValue(rect);
    }

    public final void s() {
        boolean k2 = k();
        if (this.f2323g.size() > 1 && k2) {
            q(true);
        } else if (!this.f2318b.q()) {
            q(false);
        } else if (!k2) {
            q(false);
        }
        if (!this.f2323g.isEmpty()) {
            this.f2318b.m(this, this.f2324h, this.f2325i);
        }
    }

    public final void t() {
        SnapshotStateList snapshotStateList = this.f2323g;
        int size = snapshotStateList.size() - 1;
        SharedElementInternalState sharedElementInternalState = null;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                SharedElementInternalState sharedElementInternalState2 = (SharedElementInternalState) snapshotStateList.get(size);
                if (sharedElementInternalState2.d().f()) {
                    sharedElementInternalState = sharedElementInternalState2;
                }
                if (i2 < 0) {
                    break;
                }
                size = i2;
            }
        }
        if (!Intrinsics.d(sharedElementInternalState, this.f2322f)) {
            this.f2322f = sharedElementInternalState;
            r((Rect) null);
        }
    }
}
