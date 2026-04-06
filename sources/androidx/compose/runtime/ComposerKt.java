package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.collection.MultiValueMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ComposerKt {

    /* renamed from: a  reason: collision with root package name */
    public static CompositionTracer f14609a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f14610b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f14611c = new OpaqueKey("provider");

    /* renamed from: d  reason: collision with root package name */
    public static final Object f14612d = new OpaqueKey("provider");

    /* renamed from: e  reason: collision with root package name */
    public static final Object f14613e = new OpaqueKey("compositionLocalMap");

    /* renamed from: f  reason: collision with root package name */
    public static final Object f14614f = new OpaqueKey("providerValues");

    /* renamed from: g  reason: collision with root package name */
    public static final Object f14615g = new OpaqueKey("providers");

    /* renamed from: h  reason: collision with root package name */
    public static final Object f14616h = new OpaqueKey("reference");

    /* renamed from: i  reason: collision with root package name */
    public static final Comparator f14617i = new h();

    /* JADX INFO: finally extract failed */
    public static final MovableContentState A(ControlledComposition controlledComposition, MovableContentStateReference movableContentStateReference, SlotWriter slotWriter, Applier applier) {
        boolean z2 = true;
        SlotTable slotTable = new SlotTable();
        if (slotWriter.a0()) {
            slotTable.n();
        }
        if (slotWriter.Z()) {
            slotTable.m();
        }
        int b0 = slotWriter.b0();
        z2 = false;
        if (applier != null && slotWriter.F0(b0) > 0) {
            int d0 = slotWriter.d0();
            while (d0 > 0 && !slotWriter.t0(d0)) {
                d0 = slotWriter.H0(d0);
            }
            if (d0 >= 0 && slotWriter.t0(d0)) {
                Object D0 = slotWriter.D0(d0);
                int i2 = d0 + 1;
                int k0 = d0 + slotWriter.k0(d0);
                int i3 = z2;
                while (i2 < k0) {
                    int k02 = slotWriter.k0(i2) + i2;
                    if (k02 > b0) {
                        break;
                    }
                    i3 += slotWriter.t0(i2) ? z2 : slotWriter.F0(i2);
                    i2 = k02;
                }
                int F0 = slotWriter.t0(b0) ? z2 : slotWriter.F0(b0);
                applier.d(D0);
                applier.a(i3, F0);
                applier.h();
            }
        }
        SlotWriter F = slotTable.F();
        try {
            F.F();
            F.j1(126665345, movableContentStateReference.c());
            SlotWriter.v0(F, z2 ? 1 : 0, z2 ? 1 : 0, (Object) null);
            F.o1(movableContentStateReference.g());
            List C0 = slotWriter.C0(movableContentStateReference.a(), z2, F);
            F.Y0();
            F.R();
            F.S();
            F.J(z2);
            MovableContentState movableContentState = new MovableContentState(slotTable);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.f14778h;
            if (companion.b(slotTable, C0)) {
                ComposerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1 composerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1 = new ComposerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1(controlledComposition, movableContentStateReference);
                SlotWriter F2 = slotTable.F();
                try {
                    companion.a(F2, C0, composerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1);
                    Unit unit = Unit.f40552a;
                } finally {
                    F2.J(z2);
                }
            }
            return movableContentState;
        } catch (Throwable th) {
            F.J(z2);
            throw th;
        }
    }

    public static final int B(List list, int i2) {
        int C = C(list, i2);
        return C < 0 ? -(C + 1) : C;
    }

    public static final int C(List list, int i2) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int k2 = Intrinsics.k(((Invalidation) list.get(i4)).b(), i2);
            if (k2 < 0) {
                i3 = i4 + 1;
            } else if (k2 <= 0) {
                return i4;
            } else {
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final Invalidation D(List list, int i2, int i3) {
        int B2 = B(list, i2);
        if (B2 >= list.size()) {
            return null;
        }
        Invalidation invalidation = (Invalidation) list.get(B2);
        if (invalidation.b() < i3) {
            return invalidation;
        }
        return null;
    }

    public static final boolean E() {
        return f14610b;
    }

    public static final Object F() {
        return f14613e;
    }

    public static final Object G() {
        return f14611c;
    }

    public static final Object H(KeyInfo keyInfo) {
        return keyInfo.d() != null ? new JoinedKey(Integer.valueOf(keyInfo.a()), keyInfo.d()) : Integer.valueOf(keyInfo.a());
    }

    public static final int I(SlotWriter slotWriter) {
        return slotWriter.b0() + slotWriter.k0(slotWriter.b0());
    }

    public static final Object J() {
        return f14612d;
    }

    public static final Object K() {
        return f14615g;
    }

    public static final Object L() {
        return f14616h;
    }

    public static final void M(List list, int i2, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int C = C(list, i2);
        if (C < 0) {
            int i3 = -(C + 1);
            if (!(obj instanceof DerivedState)) {
                obj = null;
            }
            list.add(i3, new Invalidation(recomposeScopeImpl, i2, obj));
            return;
        }
        Invalidation invalidation = (Invalidation) list.get(C);
        if (obj instanceof DerivedState) {
            Object a2 = invalidation.a();
            if (a2 == null) {
                invalidation.e(obj);
            } else if (a2 instanceof MutableScatterSet) {
                ((MutableScatterSet) a2).h(obj);
            } else {
                invalidation.e(ScatterSetKt.b(a2, obj));
            }
        } else {
            invalidation.e((Object) null);
        }
    }

    public static final boolean N(SlotReader slotReader) {
        return slotReader.k() > slotReader.u() + 1;
    }

    public static final boolean O(SlotWriter slotWriter) {
        return slotWriter.b0() > slotWriter.d0() + 1;
    }

    public static final boolean P() {
        CompositionTracer compositionTracer = f14609a;
        return compositionTracer != null && compositionTracer.c();
    }

    public static final MutableScatterMap Q(int i2) {
        return MultiValueMap.d(new MutableScatterMap(i2));
    }

    public static final int R(SlotReader slotReader, int i2, int i3, int i4) {
        if (i2 == i3) {
            return i2;
        }
        if (i2 == i4 || i3 == i4) {
            return i4;
        }
        if (slotReader.Q(i2) == i3) {
            return i3;
        }
        if (slotReader.Q(i3) == i2) {
            return i2;
        }
        if (slotReader.Q(i2) == slotReader.Q(i3)) {
            return slotReader.Q(i2);
        }
        int z2 = z(slotReader, i2, i4);
        int z3 = z(slotReader, i3, i4);
        int i5 = z2 - z3;
        for (int i6 = 0; i6 < i5; i6++) {
            i2 = slotReader.Q(i2);
        }
        int i7 = z3 - z2;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = slotReader.Q(i3);
        }
        while (i2 != i3) {
            i2 = slotReader.Q(i2);
            i3 = slotReader.Q(i3);
        }
        return i2;
    }

    public static final void S(SlotWriter slotWriter, RememberManager rememberManager) {
        slotWriter.W(slotWriter.b0(), new i(rememberManager));
        slotWriter.O0();
    }

    public static final Unit T(RememberManager rememberManager, int i2, Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            rememberManager.f((ComposeNodeLifecycleCallback) obj);
        }
        if (obj instanceof RememberObserverHolder) {
            rememberManager.d((RememberObserverHolder) obj);
        }
        if (obj instanceof RecomposeScopeImpl) {
            ((RecomposeScopeImpl) obj).A();
        }
        return Unit.f40552a;
    }

    public static final void U(SlotWriter slotWriter, int i2, Object obj) {
        Object H = slotWriter.H(i2);
        if (!(obj == H)) {
            v("Slot table is out of sync (expected " + obj + ", got " + H + ')');
        }
    }

    public static final Invalidation V(List list, int i2) {
        int C = C(list, i2);
        if (C >= 0) {
            return (Invalidation) list.remove(C);
        }
        return null;
    }

    public static final void W(List list, int i2, int i3) {
        int B2 = B(list, i2);
        while (B2 < list.size() && ((Invalidation) list.get(B2)).b() < i3) {
            Invalidation invalidation = (Invalidation) list.remove(B2);
        }
    }

    public static final void X() {
        CompositionTracer compositionTracer = f14609a;
        if (compositionTracer != null) {
            compositionTracer.b();
        }
    }

    public static final void Y(int i2, int i3, int i4, String str) {
        CompositionTracer compositionTracer = f14609a;
        if (compositionTracer != null) {
            compositionTracer.a(i2, i3, i4, str);
        }
    }

    public static final int d(Invalidation invalidation, Invalidation invalidation2) {
        return Intrinsics.k(invalidation.b(), invalidation2.b());
    }

    public static final boolean r(int i2) {
        return i2 != 0;
    }

    public static final int s(boolean z2) {
        return z2 ? 1 : 0;
    }

    public static final List t(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader E = slotTable.E();
        try {
            u(E, arrayList, slotTable.g(anchor));
            Unit unit = Unit.f40552a;
            return arrayList;
        } finally {
            E.d();
        }
    }

    public static final void u(SlotReader slotReader, List list, int i2) {
        if (slotReader.K(i2)) {
            list.add(slotReader.M(i2));
            return;
        }
        int i3 = i2 + 1;
        int F = i2 + slotReader.F(i2);
        while (i3 < F) {
            u(slotReader, list, i3);
            i3 += slotReader.F(i3);
        }
    }

    public static final void v(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void w(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void x(SlotWriter slotWriter, RememberManager rememberManager) {
        slotWriter.W(slotWriter.b0(), new g(rememberManager, slotWriter));
    }

    public static final Unit y(RememberManager rememberManager, SlotWriter slotWriter, int i2, Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            rememberManager.g((ComposeNodeLifecycleCallback) obj);
        } else if (obj instanceof RememberObserverHolder) {
            RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
            if (!(rememberObserverHolder.b() instanceof ReusableRememberObserver)) {
                U(slotWriter, i2, obj);
                rememberManager.d(rememberObserverHolder);
            }
        } else if (obj instanceof RecomposeScopeImpl) {
            U(slotWriter, i2, obj);
            ((RecomposeScopeImpl) obj).A();
        }
        return Unit.f40552a;
    }

    public static final int z(SlotReader slotReader, int i2, int i3) {
        int i4 = 0;
        while (i2 > 0 && i2 != i3) {
            i2 = slotReader.Q(i2);
            i4++;
        }
        return i4;
    }
}
