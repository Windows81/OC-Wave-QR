package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class OwnerSnapshotObserver {

    /* renamed from: i  reason: collision with root package name */
    public static final int f17430i = SnapshotStateObserver.f15299l;

    /* renamed from: a  reason: collision with root package name */
    public final SnapshotStateObserver f17431a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f17432b = OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1.f17444z;

    /* renamed from: c  reason: collision with root package name */
    public final Function1 f17433c = OwnerSnapshotObserver$onCommitAffectingMeasure$1.f17445z;

    /* renamed from: d  reason: collision with root package name */
    public final Function1 f17434d = OwnerSnapshotObserver$onCommitAffectingSemantics$1.f17446z;

    /* renamed from: e  reason: collision with root package name */
    public final Function1 f17435e = OwnerSnapshotObserver$onCommitAffectingLayout$1.f17440z;

    /* renamed from: f  reason: collision with root package name */
    public final Function1 f17436f = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.f17441z;

    /* renamed from: g  reason: collision with root package name */
    public final Function1 f17437g = OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1.f17442z;

    /* renamed from: h  reason: collision with root package name */
    public final Function1 f17438h = OwnerSnapshotObserver$onCommitAffectingLookahead$1.f17443z;

    public OwnerSnapshotObserver(Function1 function1) {
        this.f17431a = new SnapshotStateObserver(function1);
    }

    public static /* synthetic */ void d(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z2, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        ownerSnapshotObserver.c(layoutNode, z2, function0);
    }

    public static /* synthetic */ void f(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z2, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        ownerSnapshotObserver.e(layoutNode, z2, function0);
    }

    public static /* synthetic */ void h(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z2, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        ownerSnapshotObserver.g(layoutNode, z2, function0);
    }

    public final void a(Object obj) {
        this.f17431a.g(obj);
    }

    public final void b() {
        this.f17431a.h(OwnerSnapshotObserver$clearInvalidObservations$1.f17439z);
    }

    public final void c(LayoutNode layoutNode, boolean z2, Function0 function0) {
        if (!z2 || layoutNode.l0() == null) {
            i(layoutNode, this.f17436f, function0);
        } else {
            i(layoutNode, this.f17437g, function0);
        }
    }

    public final void e(LayoutNode layoutNode, boolean z2, Function0 function0) {
        if (!z2 || layoutNode.l0() == null) {
            i(layoutNode, this.f17435e, function0);
        } else {
            i(layoutNode, this.f17438h, function0);
        }
    }

    public final void g(LayoutNode layoutNode, boolean z2, Function0 function0) {
        if (!z2 || layoutNode.l0() == null) {
            i(layoutNode, this.f17433c, function0);
        } else {
            i(layoutNode, this.f17432b, function0);
        }
    }

    public final void i(OwnerScope ownerScope, Function1 function1, Function0 function0) {
        this.f17431a.k(ownerScope, function1, function0);
    }

    public final void j(LayoutNode layoutNode, Function0 function0) {
        i(layoutNode, this.f17434d, function0);
    }

    public final void k() {
        this.f17431a.q();
    }

    public final void l() {
        this.f17431a.r();
        this.f17431a.f();
    }
}
