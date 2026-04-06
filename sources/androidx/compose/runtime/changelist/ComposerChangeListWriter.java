package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.internal.IntRef;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ComposerChangeListWriter {

    /* renamed from: m  reason: collision with root package name */
    public static final Companion f14931m = new Companion((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    public static final int f14932n = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ComposerImpl f14933a;

    /* renamed from: b  reason: collision with root package name */
    public ChangeList f14934b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14935c;

    /* renamed from: d  reason: collision with root package name */
    public final IntStack f14936d = new IntStack();

    /* renamed from: e  reason: collision with root package name */
    public boolean f14937e = true;

    /* renamed from: f  reason: collision with root package name */
    public int f14938f;

    /* renamed from: g  reason: collision with root package name */
    public int f14939g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f14940h = Stack.c((ArrayList) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public int f14941i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f14942j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f14943k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f14944l;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ComposerChangeListWriter(ComposerImpl composerImpl, ChangeList changeList) {
        this.f14933a = composerImpl;
        this.f14934b = changeList;
    }

    public static /* synthetic */ void G(ComposerChangeListWriter composerChangeListWriter, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        composerChangeListWriter.F(z2);
    }

    public static /* synthetic */ void K(ComposerChangeListWriter composerChangeListWriter, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        composerChangeListWriter.J(z2);
    }

    public final void A(int i2) {
        this.f14938f = i2;
    }

    public final void B() {
        I();
        if (Stack.h(this.f14940h)) {
            Stack.k(this.f14940h);
        } else {
            this.f14939g++;
        }
    }

    public final void C() {
        D();
    }

    public final void D() {
        int i2 = this.f14939g;
        if (i2 > 0) {
            this.f14934b.K(i2);
            this.f14939g = 0;
        }
        if (Stack.h(this.f14940h)) {
            this.f14934b.k(Stack.m(this.f14940h));
            Stack.a(this.f14940h);
        }
    }

    public final void E() {
        K(this, false, 1, (Object) null);
        M();
    }

    public final void F(boolean z2) {
        J(z2);
    }

    public final void H(int i2, int i3, int i4) {
        C();
        this.f14934b.v(i2, i3, i4);
    }

    public final void I() {
        int i2 = this.f14944l;
        if (i2 > 0) {
            int i3 = this.f14941i;
            if (i3 >= 0) {
                L(i3, i2);
                this.f14941i = -1;
            } else {
                H(this.f14943k, this.f14942j, i2);
                this.f14942j = -1;
                this.f14943k = -1;
            }
            this.f14944l = 0;
        }
    }

    public final void J(boolean z2) {
        int u2 = z2 ? s().u() : s().k();
        int i2 = u2 - this.f14938f;
        if (!(i2 >= 0)) {
            ComposerKt.v("Tried to seek backward");
        }
        if (i2 > 0) {
            this.f14934b.e(i2);
            this.f14938f = u2;
        }
    }

    public final void L(int i2, int i3) {
        C();
        this.f14934b.A(i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = s();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void M() {
        /*
            r4 = this;
            androidx.compose.runtime.SlotReader r0 = r4.s()
            int r0 = r0.x()
            if (r0 <= 0) goto L_0x002c
            androidx.compose.runtime.SlotReader r0 = r4.s()
            int r1 = r0.u()
            androidx.compose.runtime.IntStack r2 = r4.f14936d
            r3 = -2
            int r2 = r2.f(r3)
            if (r2 == r1) goto L_0x002c
            r4.n()
            if (r1 <= 0) goto L_0x002c
            androidx.compose.runtime.Anchor r0 = r0.a(r1)
            androidx.compose.runtime.IntStack r2 = r4.f14936d
            r2.h(r1)
            r4.m(r0)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.ComposerChangeListWriter.M():void");
    }

    public final void N() {
        D();
        if (this.f14935c) {
            Y();
            l();
        }
    }

    public final void O(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference) {
        this.f14934b.w(controlledComposition, compositionContext, movableContentStateReference);
    }

    public final void P(RememberObserverHolder rememberObserverHolder) {
        this.f14934b.x(rememberObserverHolder);
    }

    public final void Q(RecomposeScopeImpl recomposeScopeImpl) {
        this.f14934b.y(recomposeScopeImpl);
    }

    public final void R() {
        E();
        this.f14934b.z();
        this.f14938f += s().p();
    }

    public final void S(int i2, int i3) {
        if (i3 > 0) {
            if (!(i2 >= 0)) {
                ComposerKt.v("Invalid remove index " + i2);
            }
            if (this.f14941i == i2) {
                this.f14944l += i3;
                return;
            }
            I();
            this.f14941i = i2;
            this.f14944l = i3;
        }
    }

    public final void T() {
        this.f14934b.B();
    }

    public final void U() {
        this.f14935c = false;
        this.f14936d.a();
        this.f14938f = 0;
        this.f14937e = true;
        this.f14939g = 0;
        Stack.a(this.f14940h);
        this.f14941i = -1;
        this.f14942j = -1;
        this.f14943k = -1;
        this.f14944l = 0;
    }

    public final void V(ChangeList changeList) {
        this.f14934b = changeList;
    }

    public final void W(boolean z2) {
        this.f14937e = z2;
    }

    public final void X(Function0 function0) {
        this.f14934b.C(function0);
    }

    public final void Y() {
        this.f14934b.D();
    }

    public final void Z(RecomposeScopeImpl recomposeScopeImpl) {
        this.f14934b.E(recomposeScopeImpl);
    }

    public final void a(Anchor anchor, Object obj) {
        this.f14934b.f(anchor, obj);
    }

    public final void a0(int i2) {
        if (i2 > 0) {
            E();
            this.f14934b.F(i2);
        }
    }

    public final void b(List list, IntRef intRef) {
        this.f14934b.g(list, intRef);
    }

    public final void b0(Object obj, Anchor anchor, int i2) {
        this.f14934b.G(obj, anchor, i2);
    }

    public final void c(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        this.f14934b.h(movableContentState, compositionContext, movableContentStateReference, movableContentStateReference2);
    }

    public final void c0(Object obj) {
        G(this, false, 1, (Object) null);
        this.f14934b.H(obj);
    }

    public final void d() {
        G(this, false, 1, (Object) null);
        this.f14934b.i();
    }

    public final void d0(Object obj, Function2 function2) {
        C();
        this.f14934b.I(obj, function2);
    }

    public final void e(IntRef intRef, Anchor anchor) {
        D();
        this.f14934b.j(intRef, anchor);
    }

    public final void e0(Object obj, int i2) {
        F(true);
        this.f14934b.J(obj, i2);
    }

    public final void f(Function1 function1, Composition composition) {
        this.f14934b.l(function1, composition);
    }

    public final void f0(Object obj) {
        C();
        this.f14934b.L(obj);
    }

    public final void g() {
        int u2 = s().u();
        if (!(this.f14936d.f(-1) <= u2)) {
            ComposerKt.v("Missed recording an endGroup");
        }
        if (this.f14936d.f(-1) == u2) {
            G(this, false, 1, (Object) null);
            this.f14936d.g();
            this.f14934b.m();
        }
    }

    public final void h() {
        this.f14934b.n();
        this.f14938f = 0;
    }

    public final void i() {
        I();
    }

    public final void j(int i2, int i3) {
        i();
        D();
        int O = s().K(i3) ? 1 : s().O(i3);
        if (O > 0) {
            S(i2, O);
        }
    }

    public final void k(RecomposeScopeImpl recomposeScopeImpl) {
        this.f14934b.o(recomposeScopeImpl);
    }

    public final void l() {
        if (this.f14935c) {
            G(this, false, 1, (Object) null);
            G(this, false, 1, (Object) null);
            this.f14934b.m();
            this.f14935c = false;
        }
    }

    public final void m(Anchor anchor) {
        G(this, false, 1, (Object) null);
        this.f14934b.p(anchor);
        this.f14935c = true;
    }

    public final void n() {
        if (!this.f14935c && this.f14937e) {
            G(this, false, 1, (Object) null);
            this.f14934b.q();
            this.f14935c = true;
        }
    }

    public final void o() {
        D();
        if (!(this.f14936d.f14682b == 0)) {
            ComposerKt.v("Missed recording an endGroup()");
        }
    }

    public final ChangeList p() {
        return this.f14934b;
    }

    public final boolean q() {
        return this.f14937e;
    }

    public final boolean r() {
        return s().u() - this.f14938f < 0;
    }

    public final SlotReader s() {
        return this.f14933a.Q0();
    }

    public final void t(ChangeList changeList, IntRef intRef) {
        this.f14934b.r(changeList, intRef);
    }

    public final void u(Anchor anchor, SlotTable slotTable) {
        D();
        E();
        I();
        this.f14934b.s(anchor, slotTable);
    }

    public final void v(Anchor anchor, SlotTable slotTable, FixupList fixupList) {
        D();
        E();
        I();
        this.f14934b.t(anchor, slotTable, fixupList);
    }

    public final void w(int i2) {
        E();
        this.f14934b.u(i2);
    }

    public final void x(Object obj) {
        I();
        Stack.l(this.f14940h, obj);
    }

    public final void y(int i2, int i3, int i4) {
        if (i4 > 0) {
            int i5 = this.f14944l;
            if (i5 > 0 && this.f14942j == i2 - i5 && this.f14943k == i3 - i5) {
                this.f14944l = i5 + i4;
                return;
            }
            I();
            this.f14942j = i2;
            this.f14943k = i3;
            this.f14944l = i4;
        }
    }

    public final void z(int i2) {
        this.f14938f += i2 - s().k();
    }
}
