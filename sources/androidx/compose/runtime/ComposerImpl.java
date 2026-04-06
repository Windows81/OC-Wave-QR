package androidx.compose.runtime;

import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.changelist.FixupList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata
public final class ComposerImpl implements Composer {

    /* renamed from: A  reason: collision with root package name */
    public boolean f14570A;

    /* renamed from: B  reason: collision with root package name */
    public int f14571B = -1;
    public int C;
    public int D;
    public boolean E;
    public final ComposerImpl$derivedStateObserver$1 F;
    public final ArrayList G;
    public boolean H;
    public boolean I;
    public SlotReader J;
    public SlotTable K;
    public SlotWriter L;
    public boolean M;
    public PersistentCompositionLocalMap N;
    public ChangeList O;
    public final ComposerChangeListWriter P;
    public Anchor Q;
    public FixupList R;
    public ShouldPauseCallback S;
    public final CompositionErrorContextImpl T;
    public final CoroutineContext U;
    public boolean V;
    public long W;
    public CompositionData X;

    /* renamed from: b  reason: collision with root package name */
    public final Applier f14572b;

    /* renamed from: c  reason: collision with root package name */
    public final CompositionContext f14573c;

    /* renamed from: d  reason: collision with root package name */
    public final SlotTable f14574d;

    /* renamed from: e  reason: collision with root package name */
    public final Set f14575e;

    /* renamed from: f  reason: collision with root package name */
    public ChangeList f14576f;

    /* renamed from: g  reason: collision with root package name */
    public ChangeList f14577g;

    /* renamed from: h  reason: collision with root package name */
    public final CompositionObserverHolder f14578h;

    /* renamed from: i  reason: collision with root package name */
    public final CompositionImpl f14579i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f14580j = Stack.c((ArrayList) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: k  reason: collision with root package name */
    public Pending f14581k;

    /* renamed from: l  reason: collision with root package name */
    public int f14582l;

    /* renamed from: m  reason: collision with root package name */
    public int f14583m;

    /* renamed from: n  reason: collision with root package name */
    public int f14584n;

    /* renamed from: o  reason: collision with root package name */
    public final IntStack f14585o = new IntStack();

    /* renamed from: p  reason: collision with root package name */
    public int[] f14586p;

    /* renamed from: q  reason: collision with root package name */
    public MutableIntIntMap f14587q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f14588r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f14589s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f14590t;

    /* renamed from: u  reason: collision with root package name */
    public final List f14591u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    public final IntStack f14592v = new IntStack();

    /* renamed from: w  reason: collision with root package name */
    public PersistentCompositionLocalMap f14593w = PersistentCompositionLocalMapKt.a();

    /* renamed from: x  reason: collision with root package name */
    public MutableIntObjectMap f14594x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f14595y;

    /* renamed from: z  reason: collision with root package name */
    public final IntStack f14596z = new IntStack();

    @Metadata
    public static final class CompositionContextHolder implements ReusableRememberObserver {

        /* renamed from: z  reason: collision with root package name */
        public final CompositionContextImpl f14597z;

        public CompositionContextHolder(CompositionContextImpl compositionContextImpl) {
            this.f14597z = compositionContextImpl;
        }

        public final CompositionContextImpl a() {
            return this.f14597z;
        }

        public void e() {
            this.f14597z.x();
        }

        public void f() {
            this.f14597z.x();
        }

        public void h() {
        }
    }

    @Metadata
    public final class CompositionContextImpl extends CompositionContext {

        /* renamed from: a  reason: collision with root package name */
        public final long f14598a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f14599b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f14600c;

        /* renamed from: d  reason: collision with root package name */
        public final CompositionObserverHolder f14601d;

        /* renamed from: e  reason: collision with root package name */
        public Set f14602e;

        /* renamed from: f  reason: collision with root package name */
        public final Set f14603f = new LinkedHashSet();

        /* renamed from: g  reason: collision with root package name */
        public final MutableState f14604g = SnapshotStateKt.i(PersistentCompositionLocalMapKt.a(), SnapshotStateKt.o());

        public CompositionContextImpl(long j2, boolean z2, boolean z3, CompositionObserverHolder compositionObserverHolder) {
            this.f14598a = j2;
            this.f14599b = z2;
            this.f14600c = z3;
            this.f14601d = compositionObserverHolder;
        }

        public final void A(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.f14604g.setValue(persistentCompositionLocalMap);
        }

        public final void B(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            A(persistentCompositionLocalMap);
        }

        public void a(ControlledComposition controlledComposition, Function2 function2) {
            ComposerImpl.this.f14573c.a(controlledComposition, function2);
        }

        public void b(MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.f14573c.b(movableContentStateReference);
        }

        public void c() {
            ComposerImpl.this.C = ComposerImpl.this.C - 1;
        }

        public boolean d() {
            return ComposerImpl.this.f14573c.d();
        }

        public boolean e() {
            return this.f14599b;
        }

        public boolean f() {
            return this.f14600c;
        }

        public long g() {
            return this.f14598a;
        }

        public Composition h() {
            return ComposerImpl.this.L0();
        }

        public PersistentCompositionLocalMap i() {
            return z();
        }

        public CoroutineContext j() {
            return ComposerImpl.this.f14573c.j();
        }

        public CompositionObserverHolder k() {
            return this.f14601d;
        }

        public CoroutineContext l() {
            return CompositionKt.d(ComposerImpl.this.L0());
        }

        public void m(MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.f14573c.m(movableContentStateReference);
        }

        public void n(ControlledComposition controlledComposition) {
            ComposerImpl.this.f14573c.n(ComposerImpl.this.L0());
            ComposerImpl.this.f14573c.n(controlledComposition);
        }

        public void o(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState, Applier applier) {
            ComposerImpl.this.f14573c.o(movableContentStateReference, movableContentState, applier);
        }

        public MovableContentState p(MovableContentStateReference movableContentStateReference) {
            return ComposerImpl.this.f14573c.p(movableContentStateReference);
        }

        public void q(Set set) {
            Set set2 = this.f14602e;
            if (set2 == null) {
                set2 = new HashSet();
                this.f14602e = set2;
            }
            set2.add(set);
        }

        public void r(Composer composer) {
            Intrinsics.g(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.r((ComposerImpl) composer);
            this.f14603f.add(composer);
        }

        public void s(RecomposeScopeImpl recomposeScopeImpl) {
            ComposerImpl.this.f14573c.s(recomposeScopeImpl);
        }

        public void t(ControlledComposition controlledComposition) {
            ComposerImpl.this.f14573c.t(controlledComposition);
        }

        public void u() {
            ComposerImpl.this.C = ComposerImpl.this.C + 1;
        }

        public void v(Composer composer) {
            Set<Set> set = this.f14602e;
            if (set != null) {
                for (Set remove : set) {
                    Intrinsics.g(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    remove.remove(((ComposerImpl) composer).f14574d);
                }
            }
            TypeIntrinsics.a(this.f14603f).remove(composer);
        }

        public void w(ControlledComposition controlledComposition) {
            ComposerImpl.this.f14573c.w(controlledComposition);
        }

        public final void x() {
            if (!this.f14603f.isEmpty()) {
                Set<Set> set = this.f14602e;
                if (set != null) {
                    for (ComposerImpl composerImpl : this.f14603f) {
                        for (Set remove : set) {
                            remove.remove(composerImpl.f14574d);
                        }
                    }
                }
                this.f14603f.clear();
            }
        }

        public final Set y() {
            return this.f14603f;
        }

        public final PersistentCompositionLocalMap z() {
            return (PersistentCompositionLocalMap) this.f14604g.getValue();
        }
    }

    /* JADX INFO: finally extract failed */
    public ComposerImpl(Applier applier, CompositionContext compositionContext, SlotTable slotTable, Set set, ChangeList changeList, ChangeList changeList2, CompositionObserverHolder compositionObserverHolder, CompositionImpl compositionImpl) {
        this.f14572b = applier;
        this.f14573c = compositionContext;
        this.f14574d = slotTable;
        this.f14575e = set;
        this.f14576f = changeList;
        this.f14577g = changeList2;
        this.f14578h = compositionObserverHolder;
        this.f14579i = compositionImpl;
        this.E = compositionContext.f() || compositionContext.d();
        this.F = new ComposerImpl$derivedStateObserver$1(this);
        this.G = Stack.c((ArrayList) null, 1, (DefaultConstructorMarker) null);
        SlotReader E2 = slotTable.E();
        E2.d();
        this.J = E2;
        SlotTable slotTable2 = new SlotTable();
        if (compositionContext.f()) {
            slotTable2.n();
        }
        if (compositionContext.d()) {
            slotTable2.m();
        }
        this.K = slotTable2;
        SlotWriter F2 = slotTable2.F();
        F2.J(true);
        this.L = F2;
        this.P = new ComposerChangeListWriter(this, this.f14576f);
        SlotReader E3 = this.K.E();
        try {
            Anchor a2 = E3.a(0);
            E3.d();
            this.Q = a2;
            this.R = new FixupList();
            this.T = new CompositionErrorContextImpl(this);
            CoroutineContext j2 = compositionContext.j();
            CoroutineContext O0 = O0();
            this.U = j2.y(O0 == null ? EmptyCoroutineContext.f40721z : O0);
        } catch (Throwable th) {
            E3.d();
            throw th;
        }
    }

    public static final boolean A1(Object obj, Object obj2) {
        if (obj2 != obj) {
            RememberObserver rememberObserver = null;
            RememberObserverHolder rememberObserverHolder = obj2 instanceof RememberObserverHolder ? (RememberObserverHolder) obj2 : null;
            if (rememberObserverHolder != null) {
                rememberObserver = rememberObserverHolder.b();
            }
            return rememberObserver == obj;
        }
    }

    public static final Unit T0(ComposerImpl composerImpl, ChangeList changeList, SlotReader slotReader, MovableContentStateReference movableContentStateReference) {
        SlotReader slotReader2;
        int[] iArr;
        MutableIntObjectMap mutableIntObjectMap;
        ComposerChangeListWriter composerChangeListWriter;
        boolean q2;
        ComposerChangeListWriter composerChangeListWriter2 = composerImpl.P;
        ChangeList p2 = composerChangeListWriter2.p();
        try {
            composerChangeListWriter2.V(changeList);
            slotReader2 = composerImpl.J;
            iArr = composerImpl.f14586p;
            mutableIntObjectMap = composerImpl.f14594x;
            composerImpl.f14586p = null;
            composerImpl.f14594x = null;
            composerImpl.J = slotReader;
            composerChangeListWriter = composerImpl.P;
            q2 = composerChangeListWriter.q();
            composerChangeListWriter.W(false);
            composerImpl.X0(movableContentStateReference.c(), movableContentStateReference.e(), movableContentStateReference.g(), true);
            composerChangeListWriter.W(q2);
            Unit unit = Unit.f40552a;
            composerImpl.J = slotReader2;
            composerImpl.f14586p = iArr;
            composerImpl.f14594x = mutableIntObjectMap;
            composerChangeListWriter2.V(p2);
            return Unit.f40552a;
        } catch (Throwable th) {
            composerChangeListWriter2.V(p2);
            throw th;
        }
    }

    public static final Unit U0(ComposerImpl composerImpl, MovableContentStateReference movableContentStateReference) {
        composerImpl.X0(movableContentStateReference.c(), movableContentStateReference.e(), movableContentStateReference.g(), true);
        return Unit.f40552a;
    }

    public static final List Y0(ComposerImpl composerImpl) {
        return composerImpl.t0();
    }

    public static /* synthetic */ Object j1(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, Function0 function0, int i2, Object obj) {
        ControlledComposition controlledComposition3 = (i2 & 1) != 0 ? null : controlledComposition;
        ControlledComposition controlledComposition4 = (i2 & 2) != 0 ? null : controlledComposition2;
        Integer num2 = (i2 & 4) != 0 ? null : num;
        if ((i2 & 8) != 0) {
            list = CollectionsKt.m();
        }
        return composerImpl.i1(controlledComposition3, controlledComposition4, num2, list, function0);
    }

    public static final MovableContentStateReference s1(ComposerImpl composerImpl, int i2, List list) {
        Object E2 = composerImpl.J.E(i2);
        Intrinsics.g(E2, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        MovableContent movableContent = (MovableContent) E2;
        Object C2 = composerImpl.J.C(i2, 0);
        Anchor a2 = composerImpl.J.a(i2);
        int F2 = composerImpl.J.F(i2) + i2;
        ArrayList arrayList = new ArrayList();
        List list2 = composerImpl.f14591u;
        for (int h2 = ComposerKt.B(list2, i2); h2 < list2.size(); h2++) {
            Invalidation invalidation = (Invalidation) list2.get(h2);
            if (invalidation.b() >= F2) {
                break;
            }
            arrayList.add(TuplesKt.a(invalidation.c(), invalidation.a()));
        }
        return new MovableContentStateReference(movableContent, C2, composerImpl.L0(), composerImpl.f14574d, a2, arrayList, composerImpl.s0(i2), list);
    }

    public static final MovableContentStateReference t1(ComposerImpl composerImpl, int i2) {
        int D2 = composerImpl.J.D(i2);
        Object E2 = composerImpl.J.E(i2);
        ArrayList arrayList = null;
        if (D2 != 126665345 || !(E2 instanceof MovableContent)) {
            return null;
        }
        if (composerImpl.J.e(i2)) {
            ArrayList arrayList2 = new ArrayList();
            u1(composerImpl, arrayList2, i2);
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return s1(composerImpl, i2, arrayList);
    }

    public static final void u1(ComposerImpl composerImpl, List list, int i2) {
        int F2 = composerImpl.J.F(i2) + i2;
        int i3 = i2 + 1;
        while (i3 < F2) {
            if (composerImpl.J.G(i3)) {
                MovableContentStateReference t1 = t1(composerImpl, i3);
                if (t1 != null) {
                    list.add(t1);
                }
            } else if (composerImpl.J.e(i3)) {
                u1(composerImpl, list, i3);
            }
            i3 += composerImpl.J.F(i3);
        }
    }

    public static final int v1(ComposerImpl composerImpl, int i2, int i3, boolean z2, int i4) {
        SlotReader slotReader = composerImpl.J;
        if (slotReader.G(i3)) {
            int D2 = slotReader.D(i3);
            Object E2 = slotReader.E(i3);
            if (D2 == 126665345 && (E2 instanceof MovableContent)) {
                MovableContentStateReference t1 = t1(composerImpl, i3);
                if (t1 != null) {
                    composerImpl.f14573c.b(t1);
                    composerImpl.P.M();
                    composerImpl.P.O(composerImpl.L0(), composerImpl.f14573c, t1);
                }
                if (!z2 || i3 == i2) {
                    return slotReader.O(i3);
                }
                composerImpl.P.j(i4, i3);
                return 0;
            } else if (D2 == 206 && Intrinsics.d(E2, ComposerKt.L())) {
                Object C2 = slotReader.C(i3, 0);
                CompositionContextHolder compositionContextHolder = C2 instanceof CompositionContextHolder ? (CompositionContextHolder) C2 : null;
                if (compositionContextHolder != null) {
                    for (ComposerImpl composerImpl2 : compositionContextHolder.a().y()) {
                        composerImpl2.q1();
                        composerImpl.f14573c.t(composerImpl2.L0());
                    }
                }
                return slotReader.O(i3);
            } else if (slotReader.K(i3)) {
                return 1;
            } else {
                return slotReader.O(i3);
            }
        } else if (slotReader.e(i3)) {
            int F2 = slotReader.F(i3) + i3;
            int i5 = 0;
            for (int i6 = i3 + 1; i6 < F2; i6 += slotReader.F(i6)) {
                boolean K2 = slotReader.K(i6);
                if (K2) {
                    composerImpl.P.i();
                    composerImpl.P.x(slotReader.M(i6));
                }
                i5 += v1(composerImpl, i2, i6, K2 || z2, K2 ? 0 : i4 + i5);
                if (K2) {
                    composerImpl.P.i();
                    composerImpl.P.B();
                }
            }
            if (slotReader.K(i3)) {
                return 1;
            }
            return i5;
        } else if (slotReader.K(i3)) {
            return 1;
        } else {
            return slotReader.O(i3);
        }
    }

    public static final List x0(ComposerImpl composerImpl) {
        return composerImpl.t0();
    }

    public void A(Object obj, Function2 function2) {
        if (n()) {
            this.R.f(obj, function2);
        } else {
            this.P.d0(obj, function2);
        }
    }

    public final void A0() {
        z0(false);
    }

    public void B() {
        if (!(this.f14583m == 0)) {
            ComposerKt.v("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (!n()) {
            RecomposeScopeImpl M0 = M0();
            if (M0 != null) {
                M0.C();
            }
            if (this.f14591u.isEmpty()) {
                y1();
            } else {
                k1();
            }
        }
    }

    public final void B0() {
        if (!(!this.H && this.f14571B == 100)) {
            PreconditionsKt.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f14571B = -1;
        this.f14570A = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r3 = kotlin.collections.CollectionsKt.x0(z1(r3.a(), r3.b()), e1());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List B1(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r2.E
            if (r0 != 0) goto L_0x0009
            java.util.List r3 = kotlin.collections.CollectionsKt.m()
            return r3
        L_0x0009:
            androidx.compose.runtime.SlotTable r0 = r2.f14574d
            androidx.compose.runtime.f r1 = new androidx.compose.runtime.f
            r1.<init>(r3)
            androidx.compose.runtime.tooling.ObjectLocation r3 = androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt.d(r0, r1)
            if (r3 == 0) goto L_0x0031
            int r0 = r3.a()
            java.lang.Integer r3 = r3.b()
            java.util.List r3 = r2.z1(r0, r3)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.List r0 = r2.e1()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r3 = kotlin.collections.CollectionsKt.x0(r3, r0)
            if (r3 == 0) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            java.util.List r3 = kotlin.collections.CollectionsKt.m()
        L_0x0035:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.B1(java.lang.Object):java.util.List");
    }

    public Object C(CompositionLocal compositionLocal) {
        return CompositionLocalMapKt.b(r0(), compositionLocal);
    }

    public final void C0() {
        A0();
        this.f14573c.c();
        A0();
        this.P.l();
        I0();
        this.J.d();
        this.f14589s = false;
        this.f14595y = ComposerKt.r(this.f14596z.g());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C1(int r14, java.lang.Object r15, int r16, java.lang.Object r17) {
        /*
            r13 = this;
            r0 = r13
            r2 = r14
            r1 = r15
            r3 = r16
            r4 = r17
            r13.S1()
            int r5 = r0.f14584n
            r7 = 0
            r6 = 3
            if (r1 != 0) goto L_0x004d
            if (r4 == 0) goto L_0x003a
            r8 = 207(0xcf, float:2.9E-43)
            if (r2 != r8) goto L_0x003a
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r4, r8)
            if (r8 != 0) goto L_0x003a
            int r8 = r17.hashCode()
            long r9 = r13.D()
            long r9 = java.lang.Long.rotateLeft(r9, r6)
            long r11 = (long) r8
            long r8 = r9 ^ r11
            long r8 = java.lang.Long.rotateLeft(r8, r6)
            long r5 = (long) r5
            long r5 = r5 ^ r8
            r0.W = r5
            goto L_0x006e
        L_0x003a:
            long r8 = r13.D()
            long r8 = java.lang.Long.rotateLeft(r8, r6)
            long r10 = (long) r2
            long r8 = r8 ^ r10
            long r8 = java.lang.Long.rotateLeft(r8, r6)
            long r5 = (long) r5
            long r5 = r5 ^ r8
        L_0x004a:
            r0.W = r5
            goto L_0x006e
        L_0x004d:
            boolean r5 = r1 instanceof java.lang.Enum
            if (r5 == 0) goto L_0x0069
            r5 = r1
            java.lang.Enum r5 = (java.lang.Enum) r5
            int r5 = r5.ordinal()
        L_0x0058:
            long r8 = r13.D()
            long r8 = java.lang.Long.rotateLeft(r8, r6)
            long r10 = (long) r5
            long r8 = r8 ^ r10
            long r5 = java.lang.Long.rotateLeft(r8, r6)
            long r8 = (long) r7
            long r5 = r5 ^ r8
            goto L_0x004a
        L_0x0069:
            int r5 = r15.hashCode()
            goto L_0x0058
        L_0x006e:
            r5 = 1
            if (r1 != 0) goto L_0x0076
            int r6 = r0.f14584n
            int r6 = r6 + r5
            r0.f14584n = r6
        L_0x0076:
            androidx.compose.runtime.GroupKind$Companion r6 = androidx.compose.runtime.GroupKind.f14669b
            int r8 = r6.a()
            if (r3 == r8) goto L_0x0080
            r8 = r5
            goto L_0x0081
        L_0x0080:
            r8 = r7
        L_0x0081:
            boolean r9 = r13.n()
            r10 = -1
            r11 = 0
            if (r9 == 0) goto L_0x00e9
            androidx.compose.runtime.SlotReader r3 = r0.J
            r3.c()
            androidx.compose.runtime.SlotWriter r3 = r0.L
            int r3 = r3.b0()
            if (r8 == 0) goto L_0x00a2
            androidx.compose.runtime.SlotWriter r1 = r0.L
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            r1.l1(r14, r4)
            goto L_0x00bf
        L_0x00a2:
            if (r4 == 0) goto L_0x00b2
            androidx.compose.runtime.SlotWriter r5 = r0.L
            if (r1 != 0) goto L_0x00ae
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
        L_0x00ae:
            r5.h1(r14, r1, r4)
            goto L_0x00bf
        L_0x00b2:
            androidx.compose.runtime.SlotWriter r4 = r0.L
            if (r1 != 0) goto L_0x00bc
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
        L_0x00bc:
            r4.j1(r14, r1)
        L_0x00bf:
            androidx.compose.runtime.Pending r7 = r0.f14581k
            if (r7 == 0) goto L_0x00e5
            androidx.compose.runtime.KeyInfo r9 = new androidx.compose.runtime.KeyInfo
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            int r5 = r13.W0(r3)
            r6 = -1
            r10 = 0
            r1 = r9
            r2 = r14
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            int r1 = r0.f14582l
            int r2 = r7.e()
            int r1 = r1 - r2
            r7.i(r9, r1)
            r7.h(r9)
        L_0x00e5:
            r13.E0(r8, r11)
            return
        L_0x00e9:
            int r6 = r6.b()
            if (r3 == r6) goto L_0x00f0
            goto L_0x00f6
        L_0x00f0:
            boolean r3 = r0.f14570A
            if (r3 == 0) goto L_0x00f6
            r3 = r5
            goto L_0x00f7
        L_0x00f6:
            r3 = r7
        L_0x00f7:
            androidx.compose.runtime.Pending r6 = r0.f14581k
            if (r6 != 0) goto L_0x0124
            androidx.compose.runtime.SlotReader r6 = r0.J
            int r6 = r6.n()
            if (r3 != 0) goto L_0x0115
            if (r6 != r2) goto L_0x0115
            androidx.compose.runtime.SlotReader r6 = r0.J
            java.lang.Object r6 = r6.o()
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r15, r6)
            if (r6 == 0) goto L_0x0115
            r13.F1(r8, r4)
            goto L_0x0124
        L_0x0115:
            androidx.compose.runtime.Pending r6 = new androidx.compose.runtime.Pending
            androidx.compose.runtime.SlotReader r9 = r0.J
            java.util.List r9 = r9.h()
            int r12 = r0.f14582l
            r6.<init>(r9, r12)
            r0.f14581k = r6
        L_0x0124:
            androidx.compose.runtime.Pending r9 = r0.f14581k
            if (r9 == 0) goto L_0x01e4
            androidx.compose.runtime.KeyInfo r6 = r9.d(r14, r15)
            if (r3 != 0) goto L_0x0169
            if (r6 == 0) goto L_0x0169
            r9.h(r6)
            int r1 = r6.b()
            int r2 = r9.g(r6)
            int r3 = r9.e()
            int r2 = r2 + r3
            r0.f14582l = r2
            int r2 = r9.m(r6)
            int r3 = r9.a()
            int r3 = r2 - r3
            int r5 = r9.a()
            r9.k(r2, r5)
            androidx.compose.runtime.changelist.ComposerChangeListWriter r2 = r0.P
            r2.z(r1)
            androidx.compose.runtime.SlotReader r2 = r0.J
            r2.R(r1)
            if (r3 <= 0) goto L_0x0164
            androidx.compose.runtime.changelist.ComposerChangeListWriter r1 = r0.P
            r1.w(r3)
        L_0x0164:
            r13.F1(r8, r4)
            goto L_0x01e4
        L_0x0169:
            androidx.compose.runtime.SlotReader r3 = r0.J
            r3.c()
            r0.V = r5
            r0.N = r11
            r13.D0()
            androidx.compose.runtime.SlotWriter r3 = r0.L
            r3.F()
            androidx.compose.runtime.SlotWriter r3 = r0.L
            int r3 = r3.b0()
            if (r8 == 0) goto L_0x018e
            androidx.compose.runtime.SlotWriter r1 = r0.L
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            r1.l1(r14, r4)
            goto L_0x01ab
        L_0x018e:
            if (r4 == 0) goto L_0x019e
            androidx.compose.runtime.SlotWriter r5 = r0.L
            if (r1 != 0) goto L_0x019a
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
        L_0x019a:
            r5.h1(r14, r1, r4)
            goto L_0x01ab
        L_0x019e:
            androidx.compose.runtime.SlotWriter r4 = r0.L
            if (r1 != 0) goto L_0x01a8
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
        L_0x01a8:
            r4.j1(r14, r1)
        L_0x01ab:
            androidx.compose.runtime.SlotWriter r1 = r0.L
            androidx.compose.runtime.Anchor r1 = r1.B(r3)
            r0.Q = r1
            androidx.compose.runtime.KeyInfo r11 = new androidx.compose.runtime.KeyInfo
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            int r5 = r13.W0(r3)
            r6 = -1
            r10 = 0
            r1 = r11
            r2 = r14
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            int r1 = r0.f14582l
            int r2 = r9.e()
            int r1 = r1 - r2
            r9.i(r11, r1)
            r9.h(r11)
            androidx.compose.runtime.Pending r11 = new androidx.compose.runtime.Pending
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r8 == 0) goto L_0x01df
            goto L_0x01e1
        L_0x01df:
            int r7 = r0.f14582l
        L_0x01e1:
            r11.<init>(r1, r7)
        L_0x01e4:
            r13.E0(r8, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.C1(int, java.lang.Object, int, java.lang.Object):void");
    }

    public long D() {
        return this.W;
    }

    public final void D0() {
        if (this.L.Y()) {
            SlotWriter F2 = this.K.F();
            this.L = F2;
            F2.Z0();
            this.M = false;
            this.N = null;
        }
    }

    public final void D1(int i2) {
        C1(i2, (Object) null, GroupKind.f14669b.a(), (Object) null);
    }

    public boolean E(boolean z2, int i2) {
        RecomposeScopeImpl M0;
        if ((i2 & 1) != 0 || (!n() && !this.f14570A)) {
            return z2 || !t();
        }
        ShouldPauseCallback shouldPauseCallback = this.S;
        if (shouldPauseCallback == null || (M0 = M0()) == null || !shouldPauseCallback.a()) {
            return true;
        }
        M0.O(true);
        M0.M(this.f14570A);
        M0.H(true);
        this.P.Q(M0);
        this.f14573c.s(M0);
        return false;
    }

    public final void E0(boolean z2, Pending pending) {
        Stack.l(this.f14580j, this.f14581k);
        this.f14581k = pending;
        this.f14585o.h(this.f14583m);
        this.f14585o.h(this.f14584n);
        this.f14585o.h(this.f14582l);
        if (z2) {
            this.f14582l = 0;
        }
        this.f14583m = 0;
        this.f14584n = 0;
    }

    public final void E1(int i2, Object obj) {
        C1(i2, obj, GroupKind.f14669b.a(), (Object) null);
    }

    public void F(int i2) {
        if (i2 < 0) {
            int i3 = -i2;
            SlotWriter slotWriter = this.L;
            while (true) {
                int d0 = slotWriter.d0();
                if (d0 > i3) {
                    z0(slotWriter.t0(d0));
                } else {
                    return;
                }
            }
        } else {
            if (n()) {
                SlotWriter slotWriter2 = this.L;
                while (n()) {
                    z0(slotWriter2.t0(slotWriter2.d0()));
                }
            }
            SlotReader slotReader = this.J;
            while (true) {
                int u2 = slotReader.u();
                if (u2 > i2) {
                    z0(slotReader.K(u2));
                } else {
                    return;
                }
            }
        }
    }

    public final void F0(RecomposeScopeImpl recomposeScopeImpl) {
        recomposeScopeImpl.P(this.D);
        CompositionObserver a2 = this.f14578h.a();
        if (a2 != null) {
            a2.b(recomposeScopeImpl);
        }
    }

    public final void F1(boolean z2, Object obj) {
        if (z2) {
            this.J.X();
            return;
        }
        if (!(obj == null || this.J.l() == obj)) {
            this.P.c0(obj);
        }
        this.J.W();
    }

    public CoroutineContext G() {
        return this.U;
    }

    public final void G0(int i2, boolean z2) {
        Pending pending = (Pending) Stack.k(this.f14580j);
        if (pending != null && !z2) {
            pending.l(pending.a() + 1);
        }
        this.f14581k = pending;
        this.f14582l = this.f14585o.g() + i2;
        this.f14584n = this.f14585o.g();
        this.f14583m = this.f14585o.g() + i2;
    }

    public final void G1() {
        this.f14571B = 100;
        this.f14570A = true;
    }

    public void H() {
        A0();
        A0();
        this.f14595y = ComposerKt.r(this.f14596z.g());
        this.N = null;
    }

    public final Function1 H0(RecomposeScopeImpl recomposeScopeImpl) {
        CompositionObserver a2 = this.f14578h.a();
        if (a2 != null) {
            a2.f(recomposeScopeImpl);
        }
        return recomposeScopeImpl.f(this.D);
    }

    public final void H1() {
        this.f14584n = 0;
        this.J = this.f14574d.E();
        D1(100);
        this.f14573c.u();
        PersistentCompositionLocalMap i2 = this.f14573c.i();
        this.f14596z.h(ComposerKt.s(this.f14595y));
        this.f14595y = W(i2);
        this.N = null;
        if (!this.f14588r) {
            this.f14588r = this.f14573c.e();
        }
        if (!this.E) {
            this.E = this.f14573c.f();
        }
        if (this.E) {
            CompositionLocal c2 = CompositionErrorContextKt.c();
            Intrinsics.g(c2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            i2 = i2.X(c2, new StaticValueHolder(O0()));
        }
        this.f14593w = i2;
        Set set = (Set) CompositionLocalMapKt.b(i2, InspectionTablesKt.c());
        if (set != null) {
            set.add(k());
            this.f14573c.q(set);
        }
        D1(Long.hashCode(this.f14573c.g()));
    }

    public CompositionLocalMap I() {
        return r0();
    }

    public final void I0() {
        this.P.o();
        if (!Stack.g(this.f14580j)) {
            ComposerKt.v("Start/end imbalance");
        }
        m0();
    }

    public final boolean I1(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        Anchor h2 = recomposeScopeImpl.h();
        if (h2 == null) {
            return false;
        }
        int d2 = h2.d(this.J.z());
        if (!this.H || d2 < this.J.k()) {
            return false;
        }
        ComposerKt.M(this.f14591u, d2, recomposeScopeImpl, obj);
        return true;
    }

    public boolean J() {
        if (!t() || this.f14595y) {
            return true;
        }
        RecomposeScopeImpl M0 = M0();
        return M0 != null && M0.k();
    }

    public final void J0() {
        SlotTable slotTable = new SlotTable();
        if (this.E) {
            slotTable.n();
        }
        if (this.f14573c.d()) {
            slotTable.m();
        }
        this.K = slotTable;
        SlotWriter F2 = slotTable.F();
        F2.J(true);
        this.L = F2;
    }

    public final void J1(Object obj) {
        if (obj instanceof RememberObserver) {
            RememberObserverHolder rememberObserverHolder = new RememberObserverHolder((RememberObserver) obj, p1());
            if (n()) {
                this.P.P(rememberObserverHolder);
            }
            this.f14575e.add(obj);
            obj = rememberObserverHolder;
        }
        P1(obj);
    }

    public void K() {
        R1();
        if (n()) {
            ComposerKt.v("useNode() called while inserting");
        }
        Object P0 = P0(this.J);
        this.P.x(P0);
        if (this.f14570A && (P0 instanceof ComposeNodeLifecycleCallback)) {
            this.P.f0(P0);
        }
    }

    public final boolean K0() {
        return this.C > 0;
    }

    public final void K1(MutableScatterMap mutableScatterMap) {
        MutableScatterMap mutableScatterMap2 = mutableScatterMap;
        for (int o2 = CollectionsKt.o(this.f14591u); -1 < o2; o2--) {
            Invalidation invalidation = (Invalidation) this.f14591u.get(o2);
            Anchor h2 = invalidation.c().h();
            if (h2 == null || !h2.b()) {
                this.f14591u.remove(o2);
            } else if (invalidation.b() != h2.a()) {
                invalidation.f(h2.a());
            }
        }
        Object[] objArr = mutableScatterMap2.f1960b;
        Object[] objArr2 = mutableScatterMap2.f1961c;
        long[] jArr = mutableScatterMap2.f1959a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                            Anchor h3 = recomposeScopeImpl.h();
                            if (h3 != null) {
                                int a2 = h3.a();
                                List list = this.f14591u;
                                if (obj2 == ScopeInvalidated.f14839a) {
                                    obj2 = null;
                                }
                                list.add(new Invalidation(recomposeScopeImpl, a2, obj2));
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        CollectionsKt.A(this.f14591u, ComposerKt.f14617i);
    }

    public void L(RecomposeScope recomposeScope) {
        RecomposeScopeImpl recomposeScopeImpl = recomposeScope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) recomposeScope : null;
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.O(true);
        }
    }

    public CompositionImpl L0() {
        return this.f14579i;
    }

    public final void L1(int i2, int i3) {
        if (Q1(i2) == i3) {
            return;
        }
        if (i2 < 0) {
            MutableIntIntMap mutableIntIntMap = this.f14587q;
            if (mutableIntIntMap == null) {
                mutableIntIntMap = new MutableIntIntMap(0, 1, (DefaultConstructorMarker) null);
                this.f14587q = mutableIntIntMap;
            }
            mutableIntIntMap.q(i2, i3);
            return;
        }
        int[] iArr = this.f14586p;
        if (iArr == null) {
            iArr = new int[this.J.x()];
            ArraysKt.x(iArr, -1, 0, 0, 6, (Object) null);
            this.f14586p = iArr;
        }
        iArr[i2] = i3;
    }

    public void M() {
        A0();
    }

    public final RecomposeScopeImpl M0() {
        ArrayList arrayList = this.G;
        if (this.C != 0 || !Stack.h(arrayList)) {
            return null;
        }
        return (RecomposeScopeImpl) Stack.i(arrayList);
    }

    public final void M1(int i2, int i3) {
        int Q1 = Q1(i2);
        if (Q1 != i3) {
            int i4 = i3 - Q1;
            int e2 = Stack.e(this.f14580j) - 1;
            while (i2 != -1) {
                int Q12 = Q1(i2) + i4;
                L1(i2, Q12);
                int i5 = e2;
                while (true) {
                    if (-1 < i5) {
                        Pending pending = (Pending) Stack.j(this.f14580j, i5);
                        if (pending != null && pending.n(i2, Q12)) {
                            e2 = i5 - 1;
                            break;
                        }
                        i5--;
                    } else {
                        break;
                    }
                }
                if (i2 < 0) {
                    i2 = this.J.u();
                } else if (!this.J.K(i2)) {
                    i2 = this.J.Q(i2);
                } else {
                    return;
                }
            }
        }
    }

    public void N(Object obj) {
        J1(obj);
    }

    public final ChangeList N0() {
        return this.O;
    }

    public final PersistentCompositionLocalMap N1(PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentCompositionLocalMap.Builder l2 = persistentCompositionLocalMap.l();
        l2.putAll(persistentCompositionLocalMap2);
        PersistentCompositionLocalMap d2 = l2.d();
        E1(204, ComposerKt.K());
        O1(d2);
        O1(persistentCompositionLocalMap2);
        A0();
        return d2;
    }

    public final CompositionErrorContextImpl O0() {
        if (this.E) {
            return this.T;
        }
        return null;
    }

    public final void O1(Object obj) {
        a1();
        P1(obj);
    }

    public CompositionContext P() {
        E1(206, ComposerKt.L());
        CompositionObserverHolder compositionObserverHolder = null;
        if (n()) {
            SlotWriter.v0(this.L, 0, 1, (Object) null);
        }
        Object a1 = a1();
        CompositionContextHolder compositionContextHolder = a1 instanceof CompositionContextHolder ? (CompositionContextHolder) a1 : null;
        if (compositionContextHolder == null) {
            long D2 = D();
            boolean z2 = this.f14588r;
            boolean z3 = this.E;
            CompositionImpl L0 = L0();
            if (L0 == null) {
                L0 = null;
            }
            if (L0 != null) {
                compositionObserverHolder = L0.L();
            }
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(D2, z2, z3, compositionObserverHolder));
            P1(compositionContextHolder);
        }
        compositionContextHolder.a().B(r0());
        A0();
        return compositionContextHolder.a();
    }

    public final Object P0(SlotReader slotReader) {
        return slotReader.M(slotReader.u());
    }

    public final void P1(Object obj) {
        if (n()) {
            this.L.o1(obj);
        } else if (this.J.r()) {
            int q2 = this.J.q() - 1;
            if (this.P.r()) {
                ComposerChangeListWriter composerChangeListWriter = this.P;
                SlotReader slotReader = this.J;
                composerChangeListWriter.b0(obj, slotReader.a(slotReader.u()), q2);
                return;
            }
            this.P.e0(obj, q2);
        } else {
            ComposerChangeListWriter composerChangeListWriter2 = this.P;
            SlotReader slotReader2 = this.J;
            composerChangeListWriter2.a(slotReader2.a(slotReader2.u()), obj);
        }
    }

    public void Q() {
        A0();
    }

    public final SlotReader Q0() {
        return this.J;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r0 = r0[r4];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int Q1(int r4) {
        /*
            r3 = this;
            if (r4 >= 0) goto L_0x0012
            androidx.collection.MutableIntIntMap r0 = r3.f14587q
            r1 = 0
            if (r0 == 0) goto L_0x0011
            boolean r2 = r0.a(r4)
            if (r2 == 0) goto L_0x0011
            int r1 = r0.c(r4)
        L_0x0011:
            return r1
        L_0x0012:
            int[] r0 = r3.f14586p
            if (r0 == 0) goto L_0x001b
            r0 = r0[r4]
            if (r0 < 0) goto L_0x001b
            return r0
        L_0x001b:
            androidx.compose.runtime.SlotReader r0 = r3.J
            int r4 = r0.O(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.Q1(int):int");
    }

    public void R() {
        A0();
        A0();
        this.f14595y = ComposerKt.r(this.f14596z.g());
        this.N = null;
    }

    public final int R0(SlotReader slotReader, int i2) {
        Object A2;
        if (slotReader.H(i2)) {
            Object E2 = slotReader.E(i2);
            if (E2 == null) {
                return 0;
            }
            if (E2 instanceof Enum) {
                return ((Enum) E2).ordinal();
            }
            if (E2 instanceof MovableContent) {
                return 126665345;
            }
            return E2.hashCode();
        }
        int D2 = slotReader.D(i2);
        if (D2 == 207 && (A2 = slotReader.A(i2)) != null && !Intrinsics.d(A2, Composer.f14567a.a())) {
            D2 = A2.hashCode();
        }
        return D2;
    }

    public final void R1() {
        if (!this.f14590t) {
            ComposerKt.v("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f14590t = false;
    }

    public void S() {
        A0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bf, code lost:
        if (r6 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d2, code lost:
        if (r7 != null) goto L_0x00d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S0(java.util.List r26) {
        /*
            r25 = this;
            r9 = r25
            r0 = r26
            r10 = 1
            androidx.compose.runtime.changelist.ComposerChangeListWriter r11 = r9.P
            androidx.compose.runtime.changelist.ChangeList r1 = r9.f14577g
            androidx.compose.runtime.changelist.ChangeList r12 = r11.p()
            r11.V(r1)     // Catch:{ all -> 0x005b }
            androidx.compose.runtime.changelist.ComposerChangeListWriter r1 = r9.P     // Catch:{ all -> 0x005b }
            r1.T()     // Catch:{ all -> 0x005b }
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x005b }
            int r13 = r1.size()     // Catch:{ all -> 0x005b }
            r14 = 0
            r15 = r14
        L_0x001e:
            if (r15 >= r13) goto L_0x0209
            java.lang.Object r1 = r0.get(r15)     // Catch:{ all -> 0x0203 }
            kotlin.Pair r1 = (kotlin.Pair) r1     // Catch:{ all -> 0x0203 }
            java.lang.Object r2 = r1.a()     // Catch:{ all -> 0x0203 }
            androidx.compose.runtime.MovableContentStateReference r2 = (androidx.compose.runtime.MovableContentStateReference) r2     // Catch:{ all -> 0x0203 }
            java.lang.Object r1 = r1.b()     // Catch:{ all -> 0x0203 }
            androidx.compose.runtime.MovableContentStateReference r1 = (androidx.compose.runtime.MovableContentStateReference) r1     // Catch:{ all -> 0x0203 }
            androidx.compose.runtime.Anchor r3 = r2.a()     // Catch:{ all -> 0x0203 }
            androidx.compose.runtime.SlotTable r4 = r2.h()     // Catch:{ all -> 0x0203 }
            int r4 = r4.g(r3)     // Catch:{ all -> 0x0203 }
            androidx.compose.runtime.internal.IntRef r8 = new androidx.compose.runtime.internal.IntRef     // Catch:{ all -> 0x0203 }
            r5 = 0
            r8.<init>(r14, r10, r5)     // Catch:{ all -> 0x0203 }
            androidx.compose.runtime.changelist.ComposerChangeListWriter r6 = r9.P     // Catch:{ all -> 0x0203 }
            r6.e(r8, r3)     // Catch:{ all -> 0x0203 }
            if (r1 != 0) goto L_0x00b2
            androidx.compose.runtime.SlotTable r1 = r2.h()     // Catch:{ all -> 0x005b }
            androidx.compose.runtime.SlotTable r3 = r9.K     // Catch:{ all -> 0x005b }
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r3)     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0060
            r25.q0()     // Catch:{ all -> 0x005b }
            goto L_0x0060
        L_0x005b:
            r0 = move-exception
            r1 = r11
            r2 = r12
            goto L_0x0220
        L_0x0060:
            androidx.compose.runtime.SlotTable r1 = r2.h()     // Catch:{ all -> 0x005b }
            androidx.compose.runtime.SlotReader r7 = r1.E()     // Catch:{ all -> 0x005b }
            r7.R(r4)     // Catch:{ all -> 0x00ab }
            androidx.compose.runtime.changelist.ComposerChangeListWriter r1 = r9.P     // Catch:{ all -> 0x00ab }
            r1.A(r4)     // Catch:{ all -> 0x00ab }
            androidx.compose.runtime.changelist.ChangeList r6 = new androidx.compose.runtime.changelist.ChangeList     // Catch:{ all -> 0x00ab }
            r6.<init>()     // Catch:{ all -> 0x00ab }
            androidx.compose.runtime.c r5 = new androidx.compose.runtime.c     // Catch:{ all -> 0x00ab }
            r5.<init>(r9, r6, r7, r2)     // Catch:{ all -> 0x00ab }
            r16 = 15
            r17 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r18 = 0
            r1 = r25
            r19 = r5
            r5 = r18
            r10 = r6
            r6 = r19
            r19 = r7
            r7 = r16
            r14 = r8
            r8 = r17
            j1(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00a9 }
            androidx.compose.runtime.changelist.ComposerChangeListWriter r1 = r9.P     // Catch:{ all -> 0x00a9 }
            r1.t(r10, r14)     // Catch:{ all -> 0x00a9 }
            kotlin.Unit r1 = kotlin.Unit.f40552a     // Catch:{ all -> 0x00a9 }
            r19.d()     // Catch:{ all -> 0x005b }
            r19 = r11
            r24 = r12
            r17 = r13
            r0 = r15
            goto L_0x0197
        L_0x00a9:
            r0 = move-exception
            goto L_0x00ae
        L_0x00ab:
            r0 = move-exception
            r19 = r7
        L_0x00ae:
            r19.d()     // Catch:{ all -> 0x005b }
            throw r0     // Catch:{ all -> 0x005b }
        L_0x00b2:
            r14 = r8
            androidx.compose.runtime.CompositionContext r4 = r9.f14573c     // Catch:{ all -> 0x0203 }
            androidx.compose.runtime.MovableContentState r4 = r4.p(r1)     // Catch:{ all -> 0x0203 }
            if (r4 == 0) goto L_0x00c1
            androidx.compose.runtime.SlotTable r6 = r4.f()     // Catch:{ all -> 0x005b }
            if (r6 != 0) goto L_0x00c5
        L_0x00c1:
            androidx.compose.runtime.SlotTable r6 = r1.h()     // Catch:{ all -> 0x0203 }
        L_0x00c5:
            if (r4 == 0) goto L_0x00d4
            androidx.compose.runtime.SlotTable r7 = r4.f()     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x00d4
            r8 = 0
            androidx.compose.runtime.Anchor r7 = r7.e(r8)     // Catch:{ all -> 0x005b }
            if (r7 != 0) goto L_0x00d8
        L_0x00d4:
            androidx.compose.runtime.Anchor r7 = r1.a()     // Catch:{ all -> 0x0203 }
        L_0x00d8:
            java.util.List r8 = androidx.compose.runtime.ComposerKt.t(r6, r7)     // Catch:{ all -> 0x0203 }
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10     // Catch:{ all -> 0x0203 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x0203 }
            if (r10 != 0) goto L_0x0108
            androidx.compose.runtime.changelist.ComposerChangeListWriter r10 = r9.P     // Catch:{ all -> 0x005b }
            r10.b(r8, r14)     // Catch:{ all -> 0x005b }
            androidx.compose.runtime.SlotTable r10 = r2.h()     // Catch:{ all -> 0x005b }
            androidx.compose.runtime.SlotTable r5 = r9.f14574d     // Catch:{ all -> 0x005b }
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r10, r5)     // Catch:{ all -> 0x005b }
            if (r5 == 0) goto L_0x0108
            androidx.compose.runtime.SlotTable r5 = r9.f14574d     // Catch:{ all -> 0x005b }
            int r3 = r5.g(r3)     // Catch:{ all -> 0x005b }
            int r5 = r9.Q1(r3)     // Catch:{ all -> 0x005b }
            int r8 = r8.size()     // Catch:{ all -> 0x005b }
            int r5 = r5 + r8
            r9.L1(r3, r5)     // Catch:{ all -> 0x005b }
        L_0x0108:
            androidx.compose.runtime.changelist.ComposerChangeListWriter r3 = r9.P     // Catch:{ all -> 0x0203 }
            androidx.compose.runtime.CompositionContext r5 = r9.f14573c     // Catch:{ all -> 0x0203 }
            r3.c(r4, r5, r1, r2)     // Catch:{ all -> 0x0203 }
            androidx.compose.runtime.SlotReader r8 = r6.E()     // Catch:{ all -> 0x0203 }
            androidx.compose.runtime.SlotReader r10 = r9.J     // Catch:{ all -> 0x01f8 }
            int[] r5 = r9.f14586p     // Catch:{ all -> 0x01f8 }
            androidx.collection.MutableIntObjectMap r4 = r9.f14594x     // Catch:{ all -> 0x01f8 }
            r3 = 0
            r9.f14586p = r3     // Catch:{ all -> 0x01f8 }
            r9.f14594x = r3     // Catch:{ all -> 0x01f8 }
            r9.J = r8     // Catch:{ all -> 0x01e8 }
            int r3 = r6.g(r7)     // Catch:{ all -> 0x01e8 }
            r8.R(r3)     // Catch:{ all -> 0x01e8 }
            androidx.compose.runtime.changelist.ComposerChangeListWriter r6 = r9.P     // Catch:{ all -> 0x01e8 }
            r6.A(r3)     // Catch:{ all -> 0x01e8 }
            androidx.compose.runtime.changelist.ChangeList r7 = new androidx.compose.runtime.changelist.ChangeList     // Catch:{ all -> 0x01e8 }
            r7.<init>()     // Catch:{ all -> 0x01e8 }
            androidx.compose.runtime.changelist.ComposerChangeListWriter r6 = r9.P     // Catch:{ all -> 0x01e8 }
            androidx.compose.runtime.changelist.ChangeList r3 = r6.p()     // Catch:{ all -> 0x01e8 }
            r6.V(r7)     // Catch:{ all -> 0x01da }
            r17 = r13
            androidx.compose.runtime.changelist.ComposerChangeListWriter r13 = r9.P     // Catch:{ all -> 0x01da }
            r19 = r11
            boolean r11 = r13.q()     // Catch:{ all -> 0x01d0 }
            r0 = 0
            r13.W(r0)     // Catch:{ all -> 0x01c1 }
            r1.j()     // Catch:{ all -> 0x01c1 }
            androidx.compose.runtime.ControlledComposition r0 = r1.b()     // Catch:{ all -> 0x01c1 }
            androidx.compose.runtime.ControlledComposition r20 = r2.b()     // Catch:{ all -> 0x01c1 }
            int r21 = r8.k()     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r21 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x01c1 }
            java.util.List r22 = r1.d()     // Catch:{ all -> 0x01c1 }
            androidx.compose.runtime.d r1 = new androidx.compose.runtime.d     // Catch:{ all -> 0x01c1 }
            r1.<init>(r9, r2)     // Catch:{ all -> 0x01c1 }
            r23 = r1
            r1 = r25
            r2 = r0
            r24 = r12
            r12 = r3
            r3 = r20
            r0 = r15
            r15 = r4
            r4 = r21
            r20 = r8
            r8 = r5
            r5 = r22
            r21 = r15
            r15 = r6
            r6 = r23
            r1.i1(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x01bd }
            r13.W(r11)     // Catch:{ all -> 0x01b9 }
            r15.V(r12)     // Catch:{ all -> 0x01b5 }
            androidx.compose.runtime.changelist.ComposerChangeListWriter r1 = r9.P     // Catch:{ all -> 0x01b5 }
            r1.t(r7, r14)     // Catch:{ all -> 0x01b5 }
            kotlin.Unit r1 = kotlin.Unit.f40552a     // Catch:{ all -> 0x01b5 }
            r9.J = r10     // Catch:{ all -> 0x01b2 }
            r9.f14586p = r8     // Catch:{ all -> 0x01b2 }
            r1 = r21
            r9.f14594x = r1     // Catch:{ all -> 0x01b2 }
            r20.d()     // Catch:{ all -> 0x01ab }
        L_0x0197:
            androidx.compose.runtime.changelist.ComposerChangeListWriter r1 = r9.P     // Catch:{ all -> 0x01ab }
            r1.Y()     // Catch:{ all -> 0x01ab }
            r1 = 1
            int r15 = r0 + 1
            r0 = r26
            r10 = r1
            r13 = r17
            r11 = r19
            r12 = r24
            r14 = 0
            goto L_0x001e
        L_0x01ab:
            r0 = move-exception
        L_0x01ac:
            r1 = r19
            r2 = r24
            goto L_0x0220
        L_0x01b2:
            r0 = move-exception
            goto L_0x01ff
        L_0x01b5:
            r0 = move-exception
            r1 = r21
            goto L_0x01f1
        L_0x01b9:
            r0 = move-exception
            r1 = r21
            goto L_0x01e2
        L_0x01bd:
            r0 = move-exception
            r1 = r21
            goto L_0x01ca
        L_0x01c1:
            r0 = move-exception
            r1 = r4
            r15 = r6
            r20 = r8
            r24 = r12
            r12 = r3
            r8 = r5
        L_0x01ca:
            r13.W(r11)     // Catch:{ all -> 0x01ce }
            throw r0     // Catch:{ all -> 0x01ce }
        L_0x01ce:
            r0 = move-exception
            goto L_0x01e2
        L_0x01d0:
            r0 = move-exception
            r1 = r4
            r15 = r6
            r20 = r8
        L_0x01d5:
            r24 = r12
            r12 = r3
            r8 = r5
            goto L_0x01e2
        L_0x01da:
            r0 = move-exception
            r1 = r4
            r15 = r6
            r20 = r8
            r19 = r11
            goto L_0x01d5
        L_0x01e2:
            r15.V(r12)     // Catch:{ all -> 0x01e6 }
            throw r0     // Catch:{ all -> 0x01e6 }
        L_0x01e6:
            r0 = move-exception
            goto L_0x01f1
        L_0x01e8:
            r0 = move-exception
            r1 = r4
            r20 = r8
            r19 = r11
            r24 = r12
            r8 = r5
        L_0x01f1:
            r9.J = r10     // Catch:{ all -> 0x01b2 }
            r9.f14586p = r8     // Catch:{ all -> 0x01b2 }
            r9.f14594x = r1     // Catch:{ all -> 0x01b2 }
            throw r0     // Catch:{ all -> 0x01b2 }
        L_0x01f8:
            r0 = move-exception
            r20 = r8
            r19 = r11
            r24 = r12
        L_0x01ff:
            r20.d()     // Catch:{ all -> 0x01ab }
            throw r0     // Catch:{ all -> 0x01ab }
        L_0x0203:
            r0 = move-exception
            r19 = r11
            r24 = r12
            goto L_0x01ac
        L_0x0209:
            r19 = r11
            r24 = r12
            androidx.compose.runtime.changelist.ComposerChangeListWriter r0 = r9.P     // Catch:{ all -> 0x01ab }
            r0.h()     // Catch:{ all -> 0x01ab }
            androidx.compose.runtime.changelist.ComposerChangeListWriter r0 = r9.P     // Catch:{ all -> 0x01ab }
            r1 = 0
            r0.A(r1)     // Catch:{ all -> 0x01ab }
            r1 = r19
            r2 = r24
            r1.V(r2)
            return
        L_0x0220:
            r1.V(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.S0(java.util.List):void");
    }

    public final void S1() {
        if (this.f14590t) {
            ComposerKt.v("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    public void T() {
        z0(true);
    }

    public void U() {
        A0();
        RecomposeScopeImpl M0 = M0();
        if (M0 != null && M0.t()) {
            M0.E(true);
        }
    }

    public void V(MovableContent movableContent, Object obj) {
        Intrinsics.g(movableContent, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        X0(movableContent, r0(), obj, false);
    }

    public void V0(List list) {
        try {
            S0(list);
            m0();
        } catch (Throwable th) {
            f0();
            throw th;
        }
    }

    public boolean W(Object obj) {
        if (Intrinsics.d(a1(), obj)) {
            return false;
        }
        P1(obj);
        return true;
    }

    public final int W0(int i2) {
        return -2 - i2;
    }

    public void X(int i2) {
        if (this.f14581k != null) {
            C1(i2, (Object) null, GroupKind.f14669b.a(), (Object) null);
            return;
        }
        S1();
        this.W = Long.rotateLeft(Long.rotateLeft(D(), 3) ^ ((long) i2), 3) ^ ((long) this.f14584n);
        this.f14584n++;
        SlotReader slotReader = this.J;
        if (n()) {
            slotReader.c();
            this.L.j1(i2, Composer.f14567a.a());
            E0(false, (Pending) null);
        } else if (slotReader.n() != i2 || slotReader.s()) {
            if (!slotReader.I()) {
                int i3 = this.f14582l;
                int k2 = slotReader.k();
                l1();
                this.P.S(i3, slotReader.T());
                ComposerKt.W(this.f14591u, k2, slotReader.k());
            }
            slotReader.c();
            this.V = true;
            this.N = null;
            D0();
            SlotWriter slotWriter = this.L;
            slotWriter.F();
            int b0 = slotWriter.b0();
            slotWriter.j1(i2, Composer.f14567a.a());
            this.Q = slotWriter.B(b0);
            E0(false, (Pending) null);
        } else {
            slotReader.W();
            E0(false, (Pending) null);
        }
    }

    public final void X0(MovableContent movableContent, PersistentCompositionLocalMap persistentCompositionLocalMap, Object obj, boolean z2) {
        MovableContent movableContent2 = movableContent;
        PersistentCompositionLocalMap persistentCompositionLocalMap2 = persistentCompositionLocalMap;
        Object obj2 = obj;
        r(126665345, movableContent2);
        O1(obj2);
        long D2 = D();
        try {
            this.W = (long) 126665345;
            boolean z3 = false;
            if (n()) {
                SlotWriter.v0(this.L, 0, 1, (Object) null);
            }
            if (!n()) {
                if (!Intrinsics.d(this.J.l(), persistentCompositionLocalMap2)) {
                    z3 = true;
                }
            }
            if (z3) {
                n1(persistentCompositionLocalMap2);
            }
            C1(202, ComposerKt.F(), GroupKind.f14669b.a(), persistentCompositionLocalMap2);
            this.N = null;
            if (!n() || z2) {
                boolean z4 = this.f14595y;
                this.f14595y = z3;
                Expect_jvmKt.a(this, ComposableLambdaKt.c(316014703, true, new ComposerImpl$invokeMovableContentLambda$1(movableContent2, obj2)));
                this.f14595y = z4;
            } else {
                this.M = true;
                SlotWriter slotWriter = this.L;
                this.f14573c.m(new MovableContentStateReference(movableContent, obj, L0(), this.K, slotWriter.B(slotWriter.H0(slotWriter.d0())), CollectionsKt.m(), r0(), (List) null));
            }
            A0();
            this.N = null;
            this.W = D2;
            Q();
        } catch (Throwable th) {
            A0();
            this.N = null;
            this.W = D2;
            Q();
            throw th;
        }
    }

    public void Y(Function0 function0) {
        this.P.X(function0);
    }

    public void Z(ProvidedValue[] providedValueArr) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        PersistentCompositionLocalMap r0 = r0();
        E1(201, ComposerKt.J());
        boolean z2 = true;
        boolean z3 = false;
        if (n()) {
            persistentCompositionLocalMap = N1(r0, CompositionLocalMapKt.d(providedValueArr, r0, (PersistentCompositionLocalMap) null, 4, (Object) null));
            this.M = true;
        } else {
            Object B2 = this.J.B(0);
            Intrinsics.g(B2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) B2;
            Object B3 = this.J.B(1);
            Intrinsics.g(B3, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap3 = (PersistentCompositionLocalMap) B3;
            PersistentCompositionLocalMap c2 = CompositionLocalMapKt.c(providedValueArr, r0, persistentCompositionLocalMap3);
            if (!t() || this.f14570A || !Intrinsics.d(persistentCompositionLocalMap3, c2)) {
                persistentCompositionLocalMap = N1(r0, c2);
                if (!this.f14570A && Intrinsics.d(persistentCompositionLocalMap, persistentCompositionLocalMap2)) {
                    z2 = false;
                }
                z3 = z2;
            } else {
                x1();
                persistentCompositionLocalMap = persistentCompositionLocalMap2;
            }
        }
        if (z3 && !n()) {
            n1(persistentCompositionLocalMap);
        }
        this.f14596z.h(ComposerKt.s(this.f14595y));
        this.f14595y = z3;
        this.N = persistentCompositionLocalMap;
        C1(202, ComposerKt.F(), GroupKind.f14669b.a(), persistentCompositionLocalMap);
    }

    public final boolean Z0() {
        return this.H;
    }

    public void a() {
        this.f14588r = true;
        this.E = true;
        this.f14574d.n();
        this.K.n();
        this.L.x1();
    }

    public final Object a1() {
        if (n()) {
            S1();
            return Composer.f14567a.a();
        }
        Object L2 = this.J.L();
        return (!this.f14570A || (L2 instanceof ReusableRememberObserver)) ? L2 : Composer.f14567a.a();
    }

    public RecomposeScope b() {
        return M0();
    }

    public final Object b1() {
        if (n()) {
            S1();
            return Composer.f14567a.a();
        }
        Object L2 = this.J.L();
        return (!this.f14570A || (L2 instanceof ReusableRememberObserver)) ? L2 instanceof RememberObserverHolder ? ((RememberObserverHolder) L2).b() : L2 : Composer.f14567a.a();
    }

    public int c() {
        return n() ? -this.L.d0() : this.J.u();
    }

    public final Object c1(SlotReader slotReader, int i2) {
        return slotReader.M(i2);
    }

    public boolean d(boolean z2) {
        Object a1 = a1();
        if ((a1 instanceof Boolean) && z2 == ((Boolean) a1).booleanValue()) {
            return false;
        }
        P1(Boolean.valueOf(z2));
        return true;
    }

    public final int d1(int i2, int i3, int i4, int i5) {
        int i6;
        int Q2 = this.J.Q(i3);
        while (i6 != i4 && !this.J.K(i6)) {
            Q2 = this.J.Q(i6);
        }
        if (this.J.K(i6)) {
            i5 = 0;
        }
        if (i6 == i3) {
            return i5;
        }
        int Q1 = (Q1(i6) - this.J.O(i3)) + i5;
        loop1:
        while (i5 < Q1 && i6 != i2) {
            i6++;
            while (true) {
                if (i6 >= i2) {
                    break loop1;
                }
                int F2 = this.J.F(i6) + i6;
                if (i2 >= F2) {
                    i5 += this.J.K(i6) ? 1 : Q1(i6);
                    i6 = F2;
                }
            }
        }
        return i5;
    }

    public void e() {
        if (this.f14570A && this.J.u() == this.f14571B) {
            this.f14571B = -1;
            this.f14570A = false;
        }
        z0(false);
    }

    public final List e1() {
        Composition h2 = this.f14573c.h();
        CompositionImpl compositionImpl = h2 instanceof CompositionImpl ? (CompositionImpl) h2 : null;
        if (compositionImpl == null) {
            return CollectionsKt.m();
        }
        Integer e2 = ComposeStackTraceBuilderKt.e(compositionImpl.N(), this.f14573c);
        if (e2 == null) {
            return CollectionsKt.m();
        }
        SlotReader E2 = compositionImpl.N().E();
        try {
            return ComposeStackTraceBuilderKt.g(E2, e2.intValue(), 0);
        } finally {
            E2.d();
        }
    }

    public void f(int i2) {
        C1(i2, (Object) null, GroupKind.f14669b.a(), (Object) null);
    }

    public final void f0() {
        m0();
        Stack.a(this.f14580j);
        this.f14585o.a();
        this.f14592v.a();
        this.f14596z.a();
        this.f14594x = null;
        this.R.a();
        this.W = (long) 0;
        this.C = 0;
        this.f14590t = false;
        this.V = false;
        this.f14570A = false;
        this.H = false;
        this.f14589s = false;
        this.f14571B = -1;
        if (!this.J.i()) {
            this.J.d();
        }
        if (!this.L.Y()) {
            J0();
        }
    }

    public final void f1(Function0 function0) {
        if (this.H) {
            ComposerKt.v("Preparing a composition while composing is not supported");
        }
        this.H = true;
        try {
            function0.invoke();
        } finally {
            this.H = false;
        }
    }

    public Object g() {
        return b1();
    }

    public final int g1(int i2) {
        int Q2 = this.J.Q(i2) + 1;
        int i3 = 0;
        while (Q2 < i2) {
            if (!this.J.H(Q2)) {
                i3++;
            }
            Q2 += this.J.F(Q2);
        }
        return i3;
    }

    public boolean h(float f2) {
        Object a1 = a1();
        if ((a1 instanceof Float) && f2 == ((Number) a1).floatValue()) {
            return false;
        }
        P1(Float.valueOf(f2));
        return true;
    }

    /* JADX INFO: finally extract failed */
    public final boolean h1(MutableScatterMap mutableScatterMap, ShouldPauseCallback shouldPauseCallback) {
        if (!this.f14576f.c()) {
            ComposerKt.v("Expected applyChanges() to have been called");
        }
        if (ScopeMap.g(mutableScatterMap) <= 0 && this.f14591u.isEmpty() && !this.f14589s) {
            return false;
        }
        this.S = shouldPauseCallback;
        try {
            w0(mutableScatterMap, (Function2) null);
            this.S = null;
            return this.f14576f.d();
        } catch (Throwable th) {
            this.S = null;
            throw th;
        }
    }

    public boolean i(int i2) {
        Object a1 = a1();
        if ((a1 instanceof Integer) && i2 == ((Number) a1).intValue()) {
            return false;
        }
        P1(Integer.valueOf(i2));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r7 == null) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i1(androidx.compose.runtime.ControlledComposition r7, androidx.compose.runtime.ControlledComposition r8, java.lang.Integer r9, java.util.List r10, kotlin.jvm.functions.Function0 r11) {
        /*
            r6 = this;
            boolean r0 = r6.H
            int r1 = r6.f14582l
            r2 = 1
            r6.H = r2     // Catch:{ all -> 0x0029 }
            r2 = 0
            r6.f14582l = r2     // Catch:{ all -> 0x0029 }
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x0029 }
            int r3 = r3.size()     // Catch:{ all -> 0x0029 }
        L_0x0011:
            if (r2 >= r3) goto L_0x0032
            java.lang.Object r4 = r10.get(r2)     // Catch:{ all -> 0x0029 }
            kotlin.Pair r4 = (kotlin.Pair) r4     // Catch:{ all -> 0x0029 }
            java.lang.Object r5 = r4.a()     // Catch:{ all -> 0x0029 }
            androidx.compose.runtime.RecomposeScopeImpl r5 = (androidx.compose.runtime.RecomposeScopeImpl) r5     // Catch:{ all -> 0x0029 }
            java.lang.Object r4 = r4.b()     // Catch:{ all -> 0x0029 }
            if (r4 == 0) goto L_0x002b
            r6.I1(r5, r4)     // Catch:{ all -> 0x0029 }
            goto L_0x002f
        L_0x0029:
            r7 = move-exception
            goto L_0x004b
        L_0x002b:
            r4 = 0
            r6.I1(r5, r4)     // Catch:{ all -> 0x0029 }
        L_0x002f:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0032:
            if (r7 == 0) goto L_0x0042
            if (r9 == 0) goto L_0x003b
            int r9 = r9.intValue()     // Catch:{ all -> 0x0029 }
            goto L_0x003c
        L_0x003b:
            r9 = -1
        L_0x003c:
            java.lang.Object r7 = r7.y(r8, r9, r11)     // Catch:{ all -> 0x0029 }
            if (r7 != 0) goto L_0x0046
        L_0x0042:
            java.lang.Object r7 = r11.invoke()     // Catch:{ all -> 0x0029 }
        L_0x0046:
            r6.H = r0
            r6.f14582l = r1
            return r7
        L_0x004b:
            r6.H = r0
            r6.f14582l = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.i1(androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.ControlledComposition, java.lang.Integer, java.util.List, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    public boolean j(long j2) {
        Object a1 = a1();
        if ((a1 instanceof Long) && j2 == ((Number) a1).longValue()) {
            return false;
        }
        P1(Long.valueOf(j2));
        return true;
    }

    public CompositionData k() {
        CompositionData compositionData = this.X;
        if (compositionData != null) {
            return compositionData;
        }
        CompositionDataImpl compositionDataImpl = new CompositionDataImpl(L0());
        this.X = compositionDataImpl;
        return compositionDataImpl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k0() {
        /*
            r4 = this;
            boolean r0 = r4.n()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L_0x0021
            androidx.compose.runtime.RecomposeScopeImpl r0 = new androidx.compose.runtime.RecomposeScopeImpl
            androidx.compose.runtime.CompositionImpl r2 = r4.L0()
            kotlin.jvm.internal.Intrinsics.g(r2, r1)
            r0.<init>(r2)
            java.util.ArrayList r1 = r4.G
            androidx.compose.runtime.Stack.l(r1, r0)
            r4.P1(r0)
            r4.F0(r0)
            goto L_0x0094
        L_0x0021:
            java.util.List r0 = r4.f14591u
            androidx.compose.runtime.SlotReader r2 = r4.J
            int r2 = r2.u()
            androidx.compose.runtime.Invalidation r0 = androidx.compose.runtime.ComposerKt.V(r0, r2)
            androidx.compose.runtime.SlotReader r2 = r4.J
            java.lang.Object r2 = r2.L()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            if (r3 == 0) goto L_0x004f
            androidx.compose.runtime.RecomposeScopeImpl r2 = new androidx.compose.runtime.RecomposeScopeImpl
            androidx.compose.runtime.CompositionImpl r3 = r4.L0()
            kotlin.jvm.internal.Intrinsics.g(r3, r1)
            r2.<init>(r3)
            r4.P1(r2)
            goto L_0x0056
        L_0x004f:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.Intrinsics.g(r2, r1)
            androidx.compose.runtime.RecomposeScopeImpl r2 = (androidx.compose.runtime.RecomposeScopeImpl) r2
        L_0x0056:
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0068
            boolean r0 = r2.l()
            if (r0 == 0) goto L_0x0063
            r2.G(r1)
        L_0x0063:
            if (r0 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r0 = r1
            goto L_0x0069
        L_0x0068:
            r0 = r3
        L_0x0069:
            r2.I(r0)
            java.util.ArrayList r0 = r4.G
            androidx.compose.runtime.Stack.l(r0, r2)
            r4.F0(r2)
            boolean r0 = r2.m()
            if (r0 == 0) goto L_0x0094
            r2.H(r1)
            r2.L(r3)
            androidx.compose.runtime.changelist.ComposerChangeListWriter r0 = r4.P
            r0.Z(r2)
            boolean r0 = r4.f14570A
            if (r0 != 0) goto L_0x0094
            boolean r0 = r2.r()
            if (r0 == 0) goto L_0x0094
            r4.f14570A = r3
            r2.K(r3)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.k0():void");
    }

    public final void k1() {
        boolean z2 = this.H;
        this.H = true;
        int u2 = this.J.u();
        int F2 = this.J.F(u2) + u2;
        int i2 = this.f14582l;
        long D2 = D();
        int i3 = this.f14583m;
        int i4 = this.f14584n;
        Invalidation i5 = ComposerKt.D(this.f14591u, this.J.k(), F2);
        boolean z3 = false;
        int i6 = u2;
        while (i5 != null) {
            int b2 = i5.b();
            RecomposeScopeImpl c2 = i5.c();
            Invalidation unused = ComposerKt.V(this.f14591u, b2);
            if (i5.d()) {
                this.J.R(b2);
                int k2 = this.J.k();
                o1(i6, k2, u2);
                this.f14582l = d1(b2, k2, u2, i2);
                this.f14584n = g1(k2);
                this.W = p0(this.J.Q(k2), u2, D2);
                this.N = null;
                c2.e(this);
                this.N = null;
                this.J.S(u2);
                z3 = true;
                i6 = k2;
            } else {
                Stack.l(this.G, c2);
                CompositionObserver a2 = this.f14578h.a();
                if (a2 != null) {
                    try {
                        a2.b(c2);
                        c2.B();
                    } finally {
                        a2.f(c2);
                    }
                } else {
                    c2.B();
                }
                Stack.k(this.G);
            }
            i5 = ComposerKt.D(this.f14591u, this.J.k(), F2);
        }
        if (z3) {
            o1(i6, u2, u2);
            this.J.U();
            int Q1 = Q1(u2);
            this.f14582l = i2 + Q1;
            this.f14583m = i3 + Q1;
            this.f14584n = i4;
        } else {
            y1();
        }
        this.W = D2;
        this.H = z2;
    }

    public boolean l(Object obj) {
        if (a1() == obj) {
            return false;
        }
        P1(obj);
        return true;
    }

    public final void l0() {
        this.f14594x = null;
    }

    public final void l1() {
        r1(this.J.k());
        this.P.R();
    }

    public boolean m(char c2) {
        Object a1 = a1();
        if ((a1 instanceof Character) && c2 == ((Character) a1).charValue()) {
            return false;
        }
        P1(Character.valueOf(c2));
        return true;
    }

    public final void m0() {
        this.f14581k = null;
        this.f14582l = 0;
        this.f14583m = 0;
        this.W = 0;
        this.f14590t = false;
        this.P.U();
        Stack.a(this.G);
        n0();
    }

    public final void m1(Anchor anchor) {
        if (this.R.e()) {
            this.P.u(anchor, this.K);
            return;
        }
        this.P.v(anchor, this.K, this.R);
        this.R = new FixupList();
    }

    public boolean n() {
        return this.V;
    }

    public final void n0() {
        this.f14586p = null;
        this.f14587q = null;
    }

    public final void n1(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        MutableIntObjectMap mutableIntObjectMap = this.f14594x;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap(0, 1, (DefaultConstructorMarker) null);
            this.f14594x = mutableIntObjectMap;
        }
        mutableIntObjectMap.r(this.J.k(), persistentCompositionLocalMap);
    }

    public void o(boolean z2) {
        if (!(this.f14583m == 0)) {
            ComposerKt.v("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (n()) {
            return;
        }
        if (!z2) {
            y1();
            return;
        }
        int k2 = this.J.k();
        int j2 = this.J.j();
        this.P.d();
        ComposerKt.W(this.f14591u, k2, j2);
        this.J.U();
    }

    public final void o0(MutableScatterMap mutableScatterMap, Function2 function2, ShouldPauseCallback shouldPauseCallback) {
        if (!this.f14576f.c()) {
            ComposerKt.v("Expected applyChanges() to have been called");
        }
        this.S = shouldPauseCallback;
        try {
            w0(mutableScatterMap, function2);
        } finally {
            this.S = null;
        }
    }

    public final void o1(int i2, int i3, int i4) {
        SlotReader slotReader = this.J;
        int o2 = ComposerKt.R(slotReader, i2, i3, i4);
        while (i2 > 0 && i2 != o2) {
            if (slotReader.K(i2)) {
                this.P.B();
            }
            i2 = slotReader.Q(i2);
        }
        y0(i3, o2);
    }

    public void p() {
        C1(-127, (Object) null, GroupKind.f14669b.a(), (Object) null);
    }

    public final long p0(int i2, int i3, long j2) {
        long rotateLeft;
        long j3 = (long) 0;
        int i4 = 3;
        int i5 = 0;
        while (i2 >= 0) {
            if (i2 == i3) {
                rotateLeft = Long.rotateLeft(j2, i5);
            } else {
                int R0 = R0(this.J, i2);
                if (R0 == 126665345) {
                    rotateLeft = Long.rotateLeft((long) R0, i5);
                } else {
                    j3 = (j3 ^ Long.rotateLeft((long) R0, i4)) ^ Long.rotateLeft((long) (this.J.H(i2) ? 0 : g1(i2)), i5);
                    i4 = (i4 + 6) % 64;
                    i5 = (i5 + 6) % 64;
                    i2 = this.J.Q(i2);
                }
            }
            return rotateLeft ^ j3;
        }
        return j3;
    }

    public final Anchor p1() {
        int i2;
        int i3;
        if (n()) {
            if (!ComposerKt.O(this.L)) {
                return null;
            }
            int b0 = this.L.b0() - 1;
            int H0 = this.L.H0(b0);
            while (true) {
                int i4 = H0;
                i3 = b0;
                b0 = i4;
                if (b0 != this.L.d0() && b0 >= 0) {
                    H0 = this.L.H0(b0);
                }
            }
            return this.L.B(i3);
        } else if (!ComposerKt.N(this.J)) {
            return null;
        } else {
            int k2 = this.J.k() - 1;
            int Q2 = this.J.Q(k2);
            while (true) {
                int i5 = Q2;
                i2 = k2;
                k2 = i5;
                if (k2 != this.J.u() && k2 >= 0) {
                    Q2 = this.J.Q(k2);
                }
            }
            return this.J.a(i2);
        }
    }

    public Composer q(int i2) {
        X(i2);
        k0();
        return this;
    }

    public final void q0() {
        if (!this.L.Y()) {
            ComposerKt.v("Check failed");
        }
        J0();
    }

    public final void q1() {
        ComposerChangeListWriter composerChangeListWriter;
        ChangeList p2;
        if (this.f14574d.o()) {
            L0().V();
            ChangeList changeList = new ChangeList();
            this.O = changeList;
            SlotReader E2 = this.f14574d.E();
            try {
                this.J = E2;
                composerChangeListWriter = this.P;
                p2 = composerChangeListWriter.p();
                composerChangeListWriter.V(changeList);
                r1(0);
                this.P.N();
                composerChangeListWriter.V(p2);
                Unit unit = Unit.f40552a;
                E2.d();
            } catch (Throwable th) {
                E2.d();
                throw th;
            }
        }
    }

    public void r(int i2, Object obj) {
        C1(i2, obj, GroupKind.f14669b.a(), (Object) null);
    }

    public final PersistentCompositionLocalMap r0() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.N;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : s0(this.J.u());
    }

    public final void r1(int i2) {
        boolean K2 = this.J.K(i2);
        if (K2) {
            this.P.i();
            this.P.x(this.J.M(i2));
        }
        v1(this, i2, i2, K2, 0);
        this.P.i();
        if (K2) {
            this.P.B();
        }
    }

    public void s() {
        C1(125, (Object) null, GroupKind.f14669b.c(), (Object) null);
        this.f14590t = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: androidx.compose.runtime.PersistentCompositionLocalMap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.PersistentCompositionLocalMap s0(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.n()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            r2 = 202(0xca, float:2.83E-43)
            if (r0 == 0) goto L_0x0043
            boolean r0 = r5.M
            if (r0 == 0) goto L_0x0043
            androidx.compose.runtime.SlotWriter r0 = r5.L
            int r0 = r0.d0()
        L_0x0014:
            if (r0 <= 0) goto L_0x0043
            androidx.compose.runtime.SlotWriter r3 = r5.L
            int r3 = r3.i0(r0)
            if (r3 != r2) goto L_0x003c
            androidx.compose.runtime.SlotWriter r3 = r5.L
            java.lang.Object r3 = r3.j0(r0)
            java.lang.Object r4 = androidx.compose.runtime.ComposerKt.F()
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r4)
            if (r3 == 0) goto L_0x003c
            androidx.compose.runtime.SlotWriter r6 = r5.L
            java.lang.Object r6 = r6.g0(r0)
            kotlin.jvm.internal.Intrinsics.g(r6, r1)
            androidx.compose.runtime.PersistentCompositionLocalMap r6 = (androidx.compose.runtime.PersistentCompositionLocalMap) r6
            r5.N = r6
            return r6
        L_0x003c:
            androidx.compose.runtime.SlotWriter r3 = r5.L
            int r0 = r3.H0(r0)
            goto L_0x0014
        L_0x0043:
            androidx.compose.runtime.SlotReader r0 = r5.J
            int r0 = r0.x()
            if (r0 <= 0) goto L_0x0087
        L_0x004b:
            if (r6 <= 0) goto L_0x0087
            androidx.compose.runtime.SlotReader r0 = r5.J
            int r0 = r0.D(r6)
            if (r0 != r2) goto L_0x0080
            androidx.compose.runtime.SlotReader r0 = r5.J
            java.lang.Object r0 = r0.E(r6)
            java.lang.Object r3 = androidx.compose.runtime.ComposerKt.F()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r3)
            if (r0 == 0) goto L_0x0080
            androidx.collection.MutableIntObjectMap r0 = r5.f14594x
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r0.b(r6)
            androidx.compose.runtime.PersistentCompositionLocalMap r0 = (androidx.compose.runtime.PersistentCompositionLocalMap) r0
            if (r0 != 0) goto L_0x007d
        L_0x0071:
            androidx.compose.runtime.SlotReader r0 = r5.J
            java.lang.Object r6 = r0.A(r6)
            kotlin.jvm.internal.Intrinsics.g(r6, r1)
            r0 = r6
            androidx.compose.runtime.PersistentCompositionLocalMap r0 = (androidx.compose.runtime.PersistentCompositionLocalMap) r0
        L_0x007d:
            r5.N = r0
            return r0
        L_0x0080:
            androidx.compose.runtime.SlotReader r0 = r5.J
            int r6 = r0.Q(r6)
            goto L_0x004b
        L_0x0087:
            androidx.compose.runtime.PersistentCompositionLocalMap r6 = r5.f14593w
            r5.N = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.s0(int):androidx.compose.runtime.PersistentCompositionLocalMap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r0 = M0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean t() {
        /*
            r1 = this;
            boolean r0 = r1.n()
            if (r0 != 0) goto L_0x0020
            boolean r0 = r1.f14570A
            if (r0 != 0) goto L_0x0020
            boolean r0 = r1.f14595y
            if (r0 != 0) goto L_0x0020
            androidx.compose.runtime.RecomposeScopeImpl r0 = r1.M0()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.n()
            if (r0 != 0) goto L_0x0020
            boolean r0 = r1.f14589s
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.t():boolean");
    }

    public final List t0() {
        if (!this.E) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(ComposeStackTraceBuilderKt.c(this.L, (Object) null, 0, (Integer) null, 7, (Object) null));
        arrayList.addAll(ComposeStackTraceBuilderKt.a(this.J));
        arrayList.addAll(e1());
        return arrayList;
    }

    public void u(ProvidedValue providedValue) {
        ValueHolder valueHolder;
        PersistentCompositionLocalMap r0 = r0();
        E1(201, ComposerKt.J());
        Object g2 = g();
        if (Intrinsics.d(g2, Composer.f14567a.a())) {
            valueHolder = null;
        } else {
            Intrinsics.g(g2, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            valueHolder = (ValueHolder) g2;
        }
        CompositionLocal b2 = providedValue.b();
        Intrinsics.g(b2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Intrinsics.g(providedValue, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        ValueHolder b3 = b2.b(providedValue, valueHolder);
        boolean d2 = Intrinsics.d(b3, valueHolder);
        if (!d2) {
            N(b3);
        }
        boolean z2 = true;
        boolean z3 = false;
        if (n()) {
            if (providedValue.a() || !CompositionLocalMapKt.a(r0, b2)) {
                r0 = r0.X(b2, b3);
            }
            this.M = true;
        } else {
            SlotReader slotReader = this.J;
            Object A2 = slotReader.A(slotReader.k());
            Intrinsics.g(A2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) A2;
            if ((!t() || !d2) && (providedValue.a() || !CompositionLocalMapKt.a(r0, b2))) {
                r0 = r0.X(b2, b3);
            } else if ((d2 && !this.f14595y) || !this.f14595y) {
                r0 = persistentCompositionLocalMap;
            }
            if (!this.f14570A && persistentCompositionLocalMap == r0) {
                z2 = false;
            }
            z3 = z2;
        }
        if (z3 && !n()) {
            n1(r0);
        }
        this.f14596z.h(ComposerKt.s(this.f14595y));
        this.f14595y = z3;
        this.N = r0;
        C1(202, ComposerKt.F(), GroupKind.f14669b.a(), r0);
    }

    public final void u0() {
        Stack.a(this.G);
        this.f14591u.clear();
        this.f14576f.a();
        this.f14594x = null;
    }

    public Applier v() {
        return this.f14572b;
    }

    public final void v0() {
        Trace trace = Trace.f15156a;
        Object a2 = trace.a("Compose:Composer.dispose");
        try {
            this.f14573c.v(this);
            u0();
            v().clear();
            this.I = true;
            Unit unit = Unit.f40552a;
            trace.b(a2);
        } catch (Throwable th) {
            Trace.f15156a.b(a2);
            throw th;
        }
    }

    public void w(int i2, Object obj) {
        if (!n() && this.J.n() == i2 && !Intrinsics.d(this.J.l(), obj) && this.f14571B < 0) {
            this.f14571B = this.J.k();
            this.f14570A = true;
        }
        C1(i2, (Object) null, GroupKind.f14669b.a(), obj);
    }

    public final void w0(MutableScatterMap mutableScatterMap, Function2 function2) {
        MutableVector c2;
        if (this.H) {
            ComposerKt.v("Reentrant composition is not supported");
        }
        CompositionObserver a2 = this.f14578h.a();
        Trace trace = Trace.f15156a;
        Object a3 = trace.a("Compose:recompose");
        try {
            this.D = Long.hashCode(SnapshotKt.M().i());
            this.f14594x = null;
            K1(mutableScatterMap);
            this.f14582l = 0;
            this.H = true;
            if (a2 != null) {
                a2.a(L0());
            }
            try {
                H1();
                Object a1 = a1();
                if (!(a1 == function2 || function2 == null)) {
                    P1(function2);
                }
                ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.F;
                c2 = SnapshotStateKt.c();
                c2.d(composerImpl$derivedStateObserver$1);
                if (function2 != null) {
                    E1(200, ComposerKt.G());
                    Expect_jvmKt.a(this, function2);
                    A0();
                } else if ((this.f14589s || this.f14595y) && a1 != null && !Intrinsics.d(a1, Composer.f14567a.a())) {
                    E1(200, ComposerKt.G());
                    Expect_jvmKt.a(this, (Function2) TypeIntrinsics.e(a1, 2));
                    A0();
                } else {
                    w1();
                }
                c2.y(c2.p() - 1);
                C0();
                if (a2 != null) {
                    a2.e(L0());
                }
                this.H = false;
                this.f14591u.clear();
                q0();
                Unit unit = Unit.f40552a;
                trace.b(a3);
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.e(L0());
                }
                this.H = false;
                this.f14591u.clear();
                f0();
                q0();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.f15156a.b(a3);
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w1() {
        /*
            r13 = this;
            java.util.List r0 = r13.f14591u
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000d
            r13.x1()
            goto L_0x00e7
        L_0x000d:
            androidx.compose.runtime.SlotReader r0 = r13.J
            int r1 = r0.n()
            java.lang.Object r2 = r0.o()
            java.lang.Object r3 = r0.l()
            int r4 = r13.f14584n
            r5 = 207(0xcf, float:2.9E-43)
            r6 = 0
            r7 = 3
            if (r2 != 0) goto L_0x005e
            if (r3 == 0) goto L_0x004b
            if (r1 != r5) goto L_0x004b
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r3, r8)
            if (r8 != 0) goto L_0x004b
            int r8 = r3.hashCode()
            long r9 = r13.D()
            long r9 = java.lang.Long.rotateLeft(r9, r7)
            long r11 = (long) r8
            long r8 = r9 ^ r11
            long r8 = java.lang.Long.rotateLeft(r8, r7)
            long r10 = (long) r4
            long r8 = r8 ^ r10
            r13.W = r8
            goto L_0x007f
        L_0x004b:
            long r8 = r13.D()
            long r8 = java.lang.Long.rotateLeft(r8, r7)
            long r10 = (long) r1
            long r8 = r8 ^ r10
            long r8 = java.lang.Long.rotateLeft(r8, r7)
            long r10 = (long) r4
        L_0x005a:
            long r8 = r8 ^ r10
            r13.W = r8
            goto L_0x007f
        L_0x005e:
            boolean r8 = r2 instanceof java.lang.Enum
            if (r8 == 0) goto L_0x007a
            r8 = r2
            java.lang.Enum r8 = (java.lang.Enum) r8
            int r8 = r8.ordinal()
        L_0x0069:
            long r9 = r13.D()
            long r9 = java.lang.Long.rotateLeft(r9, r7)
            long r11 = (long) r8
            long r8 = r9 ^ r11
            long r8 = java.lang.Long.rotateLeft(r8, r7)
            long r10 = (long) r6
            goto L_0x005a
        L_0x007a:
            int r8 = r2.hashCode()
            goto L_0x0069
        L_0x007f:
            boolean r8 = r0.J()
            r9 = 0
            r13.F1(r8, r9)
            r13.k1()
            r0.g()
            if (r2 != 0) goto L_0x00ca
            if (r3 == 0) goto L_0x00b7
            if (r1 != r5) goto L_0x00b7
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
            if (r0 != 0) goto L_0x00b7
            int r0 = r3.hashCode()
            long r1 = r13.D()
            long r3 = (long) r4
            long r1 = r1 ^ r3
            long r1 = java.lang.Long.rotateRight(r1, r7)
            long r3 = (long) r0
            long r0 = r1 ^ r3
            long r0 = java.lang.Long.rotateRight(r0, r7)
            r13.W = r0
            goto L_0x00e7
        L_0x00b7:
            long r2 = r13.D()
            long r4 = (long) r4
            long r2 = r2 ^ r4
            long r2 = java.lang.Long.rotateRight(r2, r7)
            long r0 = (long) r1
            long r0 = r0 ^ r2
        L_0x00c3:
            long r0 = java.lang.Long.rotateRight(r0, r7)
            r13.W = r0
            goto L_0x00e7
        L_0x00ca:
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x00e2
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r2.ordinal()
        L_0x00d4:
            long r1 = r13.D()
            long r3 = (long) r6
            long r1 = r1 ^ r3
            long r1 = java.lang.Long.rotateRight(r1, r7)
            long r3 = (long) r0
            long r0 = r1 ^ r3
            goto L_0x00c3
        L_0x00e2:
            int r0 = r2.hashCode()
            goto L_0x00d4
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.w1():void");
    }

    public ScopeUpdateScope x() {
        Anchor anchor;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImpl2 = Stack.h(this.G) ? (RecomposeScopeImpl) Stack.k(this.G) : null;
        if (recomposeScopeImpl2 != null) {
            recomposeScopeImpl2.I(false);
            Function1 H0 = H0(recomposeScopeImpl2);
            if (H0 != null) {
                this.P.f(H0, L0());
            }
            if (recomposeScopeImpl2.q()) {
                recomposeScopeImpl2.L(false);
                this.P.k(recomposeScopeImpl2);
                recomposeScopeImpl2.M(false);
                if (recomposeScopeImpl2.p()) {
                    recomposeScopeImpl2.K(false);
                    this.f14570A = false;
                }
            }
        }
        if (recomposeScopeImpl2 != null && !recomposeScopeImpl2.s() && (recomposeScopeImpl2.t() || this.f14588r)) {
            if (recomposeScopeImpl2.h() == null) {
                if (n()) {
                    SlotWriter slotWriter = this.L;
                    anchor = slotWriter.B(slotWriter.d0());
                } else {
                    SlotReader slotReader = this.J;
                    anchor = slotReader.a(slotReader.u());
                }
                recomposeScopeImpl2.D(anchor);
            }
            recomposeScopeImpl2.F(false);
            recomposeScopeImpl = recomposeScopeImpl2;
        }
        z0(false);
        return recomposeScopeImpl;
    }

    public final void x1() {
        this.f14583m += this.J.T();
    }

    public void y(Function0 function0) {
        R1();
        if (!n()) {
            ComposerKt.v("createNode() can only be called when inserting");
        }
        int c2 = this.f14585o.c();
        SlotWriter slotWriter = this.L;
        Anchor B2 = slotWriter.B(slotWriter.d0());
        this.f14583m++;
        this.R.b(function0, c2, B2);
    }

    public final void y0(int i2, int i3) {
        if (i2 > 0 && i2 != i3) {
            y0(this.J.Q(i2), i3);
            if (this.J.K(i2)) {
                this.P.x(c1(this.J, i2));
            }
        }
    }

    public final void y1() {
        this.f14583m = this.J.v();
        this.J.U();
    }

    public void z() {
        C1(125, (Object) null, GroupKind.f14669b.b(), (Object) null);
        this.f14590t = true;
    }

    public final void z0(boolean z2) {
        int w2;
        Set set;
        List list;
        long rotateRight;
        long j2;
        long rotateRight2;
        long j3;
        int e2 = this.f14585o.e() - 1;
        if (n()) {
            int d0 = this.L.d0();
            int i0 = this.L.i0(d0);
            Object j0 = this.L.j0(d0);
            Object g0 = this.L.g0(d0);
            if (j0 != null) {
                int ordinal = j0 instanceof Enum ? ((Enum) j0).ordinal() : j0.hashCode();
                rotateRight2 = Long.rotateRight(D() ^ ((long) 0), 3);
                j3 = (long) ordinal;
            } else if (g0 == null || i0 != 207 || Intrinsics.d(g0, Composer.f14567a.a())) {
                rotateRight2 = Long.rotateRight(D() ^ ((long) e2), 3);
                j3 = (long) i0;
            } else {
                this.W = Long.rotateRight(((long) g0.hashCode()) ^ Long.rotateRight(D() ^ ((long) e2), 3), 3);
            }
            this.W = Long.rotateRight(rotateRight2 ^ j3, 3);
        } else {
            int u2 = this.J.u();
            int D2 = this.J.D(u2);
            Object E2 = this.J.E(u2);
            Object A2 = this.J.A(u2);
            if (E2 != null) {
                int ordinal2 = E2 instanceof Enum ? ((Enum) E2).ordinal() : E2.hashCode();
                rotateRight = Long.rotateRight(D() ^ ((long) 0), 3);
                j2 = (long) ordinal2;
            } else if (A2 == null || D2 != 207 || Intrinsics.d(A2, Composer.f14567a.a())) {
                rotateRight = Long.rotateRight(D() ^ ((long) e2), 3);
                j2 = (long) D2;
            } else {
                this.W = Long.rotateRight(((long) A2.hashCode()) ^ Long.rotateRight(D() ^ ((long) e2), 3), 3);
            }
            this.W = Long.rotateRight(rotateRight ^ j2, 3);
        }
        int i2 = this.f14583m;
        Pending pending = this.f14581k;
        if (pending != null && pending.b().size() > 0) {
            List b2 = pending.b();
            List f2 = pending.f();
            Set e3 = ListUtilsKt.e(f2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = f2.size();
            int size2 = b2.size();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < size2) {
                KeyInfo keyInfo = (KeyInfo) b2.get(i3);
                if (!e3.contains(keyInfo)) {
                    this.P.S(pending.g(keyInfo) + pending.e(), keyInfo.c());
                    pending.n(keyInfo.b(), 0);
                    this.P.z(keyInfo.b());
                    this.J.R(keyInfo.b());
                    l1();
                    this.J.T();
                    set = e3;
                    ComposerKt.W(this.f14591u, keyInfo.b(), keyInfo.b() + this.J.F(keyInfo.b()));
                } else {
                    set = e3;
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i4 < size) {
                            KeyInfo keyInfo2 = (KeyInfo) f2.get(i4);
                            if (keyInfo2 != keyInfo) {
                                int g2 = pending.g(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (g2 != i5) {
                                    int o2 = pending.o(keyInfo2);
                                    list = f2;
                                    this.P.y(pending.e() + g2, i5 + pending.e(), o2);
                                    pending.j(g2, i5, o2);
                                } else {
                                    list = f2;
                                }
                            } else {
                                list = f2;
                                i3++;
                            }
                            i4++;
                            i5 += pending.o(keyInfo2);
                            e3 = set;
                            f2 = list;
                        }
                        e3 = set;
                    }
                }
                i3++;
                e3 = set;
            }
            this.P.i();
            if (b2.size() > 0) {
                this.P.z(this.J.m());
                this.J.U();
            }
        }
        boolean n2 = n();
        if (!n2 && (w2 = this.J.w()) > 0) {
            this.P.a0(w2);
        }
        int i6 = this.f14582l;
        while (!this.J.I()) {
            int k2 = this.J.k();
            l1();
            this.P.S(i6, this.J.T());
            ComposerKt.W(this.f14591u, k2, this.J.k());
        }
        if (n2) {
            if (z2) {
                this.R.c();
                i2 = 1;
            }
            this.J.f();
            int d02 = this.L.d0();
            this.L.R();
            if (!this.J.t()) {
                int W0 = W0(d02);
                this.L.S();
                this.L.J(true);
                m1(this.Q);
                this.V = false;
                if (!this.f14574d.isEmpty()) {
                    L1(W0, 0);
                    M1(W0, i2);
                }
            }
        } else {
            if (z2) {
                this.P.B();
            }
            this.P.g();
            int u3 = this.J.u();
            if (i2 != Q1(u3)) {
                M1(u3, i2);
            }
            if (z2) {
                i2 = 1;
            }
            this.J.g();
            this.P.i();
        }
        G0(i2, n2);
    }

    public final List z1(int i2, Integer num) {
        if (!this.E) {
            return CollectionsKt.m();
        }
        SlotReader E2 = this.f14574d.E();
        try {
            return ComposeStackTraceBuilderKt.g(E2, i2, num);
        } finally {
            E2.d();
        }
    }
}
