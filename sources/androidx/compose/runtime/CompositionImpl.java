package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.ObservableComposition;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices, PausableComposition, ObservableComposition {

    /* renamed from: A  reason: collision with root package name */
    public final Applier f14622A;

    /* renamed from: B  reason: collision with root package name */
    public final AtomicReference f14623B;
    public final Object C;
    public final Set D;
    public final SlotTable E;
    public final MutableScatterMap F;
    public final MutableScatterSet G;
    public final MutableScatterSet H;
    public final MutableScatterMap I;
    public final ChangeList J;
    public final ChangeList K;
    public final MutableScatterMap L;
    public MutableScatterMap M;
    public boolean N;
    public ShouldPauseCallback O;
    public PausedCompositionImpl P;
    public CompositionImpl Q;
    public int R;
    public final CompositionObserverHolder S;
    public final RememberEventDispatcher T;
    public final ComposerImpl U;
    public final CoroutineContext V;
    public final boolean W;
    public int X;
    public Function2 Y;

    /* renamed from: z  reason: collision with root package name */
    public final CompositionContext f14624z;

    public CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext) {
        CompositionContext compositionContext2 = compositionContext;
        this.f14624z = compositionContext2;
        this.f14622A = applier;
        this.f14623B = new AtomicReference((Object) null);
        this.C = new Object();
        Set l2 = new MutableScatterSet(0, 1, (DefaultConstructorMarker) null).l();
        this.D = l2;
        SlotTable slotTable = new SlotTable();
        if (compositionContext.d()) {
            slotTable.m();
        }
        if (compositionContext.f()) {
            slotTable.n();
        }
        this.E = slotTable;
        this.F = ScopeMap.d((MutableScatterMap) null, 1, (DefaultConstructorMarker) null);
        this.G = new MutableScatterSet(0, 1, (DefaultConstructorMarker) null);
        this.H = new MutableScatterSet(0, 1, (DefaultConstructorMarker) null);
        this.I = ScopeMap.d((MutableScatterMap) null, 1, (DefaultConstructorMarker) null);
        ChangeList changeList = new ChangeList();
        this.J = changeList;
        ChangeList changeList2 = new ChangeList();
        this.K = changeList2;
        this.L = ScopeMap.d((MutableScatterMap) null, 1, (DefaultConstructorMarker) null);
        this.M = ScopeMap.d((MutableScatterMap) null, 1, (DefaultConstructorMarker) null);
        CompositionObserverHolder compositionObserverHolder = new CompositionObserverHolder((CompositionObserver) null, false, compositionContext, 3, (DefaultConstructorMarker) null);
        this.S = compositionObserverHolder;
        this.T = new RememberEventDispatcher();
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, l2, changeList, changeList2, compositionObserverHolder, this);
        compositionContext2.r(composerImpl);
        this.U = composerImpl;
        this.V = coroutineContext;
        this.W = compositionContext2 instanceof Recomposer;
        this.Y = ComposableSingletons$CompositionKt.f14550a.b();
    }

    public void A() {
        synchronized (this.C) {
            try {
                for (Object obj : this.E.v()) {
                    RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B() {
        long[] jArr;
        int i2;
        int i3;
        int i4;
        long[] jArr2;
        int i5;
        boolean z2;
        Object[] objArr;
        long[] jArr3;
        long[] jArr4;
        MutableScatterMap mutableScatterMap = this.I;
        long[] jArr5 = mutableScatterMap.f1959a;
        int length = jArr5.length - 2;
        char c2 = 7;
        long j2 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j3 = jArr5[i7];
                if ((((~j3) << c2) & j3 & j2) != j2) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j3 & 255) < 128) {
                            int i10 = (i7 << 3) + i9;
                            Object obj = mutableScatterMap.f1960b[i10];
                            Object obj2 = mutableScatterMap.f1961c[i10];
                            if (obj2 instanceof MutableScatterSet) {
                                Intrinsics.g(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr2 = mutableScatterSet.f1967b;
                                long[] jArr6 = mutableScatterSet.f1966a;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i4 = length;
                                if (length2 >= 0) {
                                    int i11 = 0;
                                    while (true) {
                                        long j4 = jArr6[i11];
                                        i3 = i7;
                                        Object[] objArr3 = objArr2;
                                        if ((((~j4) << c2) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                int i14 = i13;
                                                Object[] objArr4 = objArr3;
                                                if ((j4 & 255) < 128) {
                                                    int i15 = (i11 << 3) + i14;
                                                    jArr4 = jArr6;
                                                    if (!ScopeMap.e(this.F, (DerivedState) objArr4[i15])) {
                                                        mutableScatterSet.A(i15);
                                                    }
                                                } else {
                                                    jArr4 = jArr6;
                                                }
                                                j4 >>= 8;
                                                i13 = i14 + 1;
                                                jArr6 = jArr4;
                                                objArr3 = objArr4;
                                            }
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                            if (i12 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                        }
                                        if (i11 == length2) {
                                            break;
                                        }
                                        i11++;
                                        jArr6 = jArr3;
                                        objArr2 = objArr;
                                        i7 = i3;
                                        c2 = 7;
                                    }
                                } else {
                                    i3 = i7;
                                }
                                z2 = mutableScatterSet.d();
                            } else {
                                jArr2 = jArr5;
                                i4 = length;
                                i3 = i7;
                                Intrinsics.g(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                z2 = !ScopeMap.e(this.F, (DerivedState) obj2);
                            }
                            if (z2) {
                                mutableScatterMap.v(i10);
                            }
                            i5 = 8;
                        } else {
                            jArr2 = jArr5;
                            i4 = length;
                            i3 = i7;
                            i5 = i6;
                        }
                        j3 >>= i5;
                        i9++;
                        i6 = i5;
                        jArr5 = jArr2;
                        length = i4;
                        i7 = i3;
                        c2 = 7;
                    }
                    jArr = jArr5;
                    int i16 = length;
                    int i17 = i7;
                    if (i8 != i6) {
                        break;
                    }
                    length = i16;
                    i2 = i17;
                } else {
                    jArr = jArr5;
                    i2 = i7;
                }
                if (i2 == length) {
                    break;
                }
                i7 = i2 + 1;
                jArr5 = jArr;
                c2 = 7;
                j2 = -9187201950435737472L;
                i6 = 8;
            }
        }
        if (this.H.e()) {
            MutableScatterSet mutableScatterSet2 = this.H;
            Object[] objArr5 = mutableScatterSet2.f1967b;
            long[] jArr7 = mutableScatterSet2.f1966a;
            int length3 = jArr7.length - 2;
            if (length3 >= 0) {
                int i18 = 0;
                while (true) {
                    long j5 = jArr7[i18];
                    if ((((~j5) << 7) & j5 & -9187201950435737472L) != -9187201950435737472L) {
                        int i19 = 8 - ((~(i18 - length3)) >>> 31);
                        for (int i20 = 0; i20 < i19; i20++) {
                            if ((j5 & 255) < 128) {
                                int i21 = (i18 << 3) + i20;
                                if (!((RecomposeScopeImpl) objArr5[i21]).w()) {
                                    mutableScatterSet2.A(i21);
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i19 != 8) {
                            return;
                        }
                    }
                    if (i18 != length3) {
                        i18++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final boolean C() {
        boolean z2;
        synchronized (this.C) {
            z2 = true;
            if (this.X != 1) {
                z2 = false;
            }
            if (z2) {
                this.X = 0;
            }
        }
        return z2;
    }

    public final void D(Function2 function2) {
        this.Y = function2;
        this.f14624z.a(this, function2);
    }

    public final void E(Function2 function2) {
        this.U.G1();
        D(function2);
        this.U.B0();
    }

    public final void F() {
        Object andSet = this.f14623B.getAndSet(CompositionKt.f14625a);
        if (andSet == null) {
            return;
        }
        if (Intrinsics.d(andSet, CompositionKt.f14625a)) {
            ComposerKt.w("pending composition has not been applied");
            throw new KotlinNothingValueException();
        } else if (andSet instanceof Set) {
            k((Set) andSet, true);
        } else if (andSet instanceof Object[]) {
            for (Set k2 : (Set[]) andSet) {
                k(k2, true);
            }
        } else {
            ComposerKt.w("corrupt pendingModifications drain: " + this.f14623B);
            throw new KotlinNothingValueException();
        }
    }

    public final void G() {
        Object andSet = this.f14623B.getAndSet((Object) null);
        if (Intrinsics.d(andSet, CompositionKt.f14625a)) {
            return;
        }
        if (andSet instanceof Set) {
            k((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set k2 : (Set[]) andSet) {
                k(k2, false);
            }
        } else if (andSet == null) {
            ComposerKt.w("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        } else {
            ComposerKt.w("corrupt pendingModifications drain: " + this.f14623B);
            throw new KotlinNothingValueException();
        }
    }

    public final void H() {
        Object andSet = this.f14623B.getAndSet(SetsKt.d());
        if (!Intrinsics.d(andSet, CompositionKt.f14625a) && andSet != null) {
            if (andSet instanceof Set) {
                k((Set) andSet, false);
            } else if (andSet instanceof Object[]) {
                for (Set k2 : (Set[]) andSet) {
                    k(k2, false);
                }
            } else {
                ComposerKt.w("corrupt pendingModifications drain: " + this.f14623B);
                throw new KotlinNothingValueException();
            }
        }
    }

    public final void I() {
        int i2 = this.X;
        boolean z2 = false;
        if (!(i2 == 0)) {
            PreconditionsKt.b(i2 != 1 ? i2 != 2 ? i2 != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.P == null) {
            z2 = true;
        }
        if (!z2) {
            PreconditionsKt.b("A pausable composition is in progress");
        }
    }

    public final List J(Anchor anchor) {
        long[] jArr;
        int i2;
        MutableScatterMap mutableScatterMap;
        int i3;
        long j2;
        int i4;
        int i5;
        int i6;
        long[] jArr2;
        long j3;
        char c2;
        int i7;
        MutableScatterMap mutableScatterMap2;
        MutableScatterMap mutableScatterMap3;
        boolean z2;
        Object[] objArr;
        long[] jArr3;
        long[] jArr4;
        MutableScatterMap mutableScatterMap4;
        int i8;
        Object[] objArr2;
        Anchor anchor2 = anchor;
        if (ScopeMap.g(this.M) <= 0) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList();
        SlotTable slotTable = this.E;
        MutableScatterMap mutableScatterMap5 = this.M;
        long[] jArr5 = mutableScatterMap5.f1959a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return arrayList;
        }
        int i9 = 0;
        while (true) {
            long j4 = jArr5[i9];
            char c3 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                int i10 = 8;
                int i11 = 8 - ((~(i9 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((j4 & 255) < 128) {
                        int i13 = (i9 << 3) + i12;
                        Object obj = mutableScatterMap5.f1960b[i13];
                        Object obj2 = mutableScatterMap5.f1961c[i13];
                        Intrinsics.g(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                        if (obj2 instanceof MutableScatterSet) {
                            Intrinsics.g(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                            Object[] objArr3 = mutableScatterSet.f1967b;
                            long[] jArr6 = mutableScatterSet.f1966a;
                            jArr2 = jArr5;
                            int length2 = jArr6.length - 2;
                            if (length2 >= 0) {
                                i6 = length;
                                i4 = i12;
                                i5 = i9;
                                int i14 = 0;
                                while (true) {
                                    long j6 = jArr6[i14];
                                    j2 = j4;
                                    c2 = 7;
                                    j3 = -9187201950435737472L;
                                    if ((((~j6) << 7) & j6 & -9187201950435737472L) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                        int i16 = 0;
                                        while (i16 < i15) {
                                            if ((j6 & 255) < 128) {
                                                jArr4 = jArr6;
                                                int i17 = (i14 << 3) + i16;
                                                i8 = i11;
                                                Object obj3 = objArr3[i17];
                                                objArr2 = objArr3;
                                                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                                                mutableScatterMap4 = mutableScatterMap5;
                                                Anchor h2 = recomposeScopeImpl.h();
                                                if (h2 != null && slotTable.D(anchor2, h2)) {
                                                    arrayList.add(TuplesKt.a(recomposeScopeImpl, obj3));
                                                    mutableScatterSet.A(i17);
                                                }
                                            } else {
                                                jArr4 = jArr6;
                                                mutableScatterMap4 = mutableScatterMap5;
                                                i8 = i11;
                                                objArr2 = objArr3;
                                            }
                                            j6 >>= 8;
                                            i16++;
                                            i11 = i8;
                                            jArr6 = jArr4;
                                            objArr3 = objArr2;
                                            mutableScatterMap5 = mutableScatterMap4;
                                        }
                                        jArr3 = jArr6;
                                        mutableScatterMap3 = mutableScatterMap5;
                                        i3 = i11;
                                        objArr = objArr3;
                                        if (i15 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr6;
                                        mutableScatterMap3 = mutableScatterMap5;
                                        i3 = i11;
                                        objArr = objArr3;
                                    }
                                    if (i14 == length2) {
                                        break;
                                    }
                                    i14++;
                                    j4 = j2;
                                    i11 = i3;
                                    jArr6 = jArr3;
                                    objArr3 = objArr;
                                    mutableScatterMap5 = mutableScatterMap3;
                                }
                            } else {
                                mutableScatterMap3 = mutableScatterMap5;
                                i6 = length;
                                i4 = i12;
                                i5 = i9;
                                j2 = j4;
                                i3 = i11;
                                c2 = 7;
                                j3 = -9187201950435737472L;
                            }
                            z2 = mutableScatterSet.d();
                        } else {
                            mutableScatterMap3 = mutableScatterMap5;
                            jArr2 = jArr5;
                            i6 = length;
                            i4 = i12;
                            i5 = i9;
                            j2 = j4;
                            i3 = i11;
                            c2 = 7;
                            j3 = -9187201950435737472L;
                            Intrinsics.g(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj;
                            Anchor h3 = recomposeScopeImpl2.h();
                            if (h3 == null || !slotTable.D(anchor2, h3)) {
                                z2 = false;
                            } else {
                                arrayList.add(TuplesKt.a(recomposeScopeImpl2, obj2));
                                z2 = true;
                            }
                        }
                        if (z2) {
                            mutableScatterMap2 = mutableScatterMap3;
                            mutableScatterMap2.v(i13);
                        } else {
                            mutableScatterMap2 = mutableScatterMap3;
                        }
                        i7 = 8;
                    } else {
                        mutableScatterMap2 = mutableScatterMap5;
                        jArr2 = jArr5;
                        i6 = length;
                        i4 = i12;
                        i5 = i9;
                        j2 = j4;
                        i3 = i11;
                        c2 = c3;
                        j3 = j5;
                        i7 = i10;
                    }
                    j4 = j2 >> i7;
                    i12 = i4 + 1;
                    i10 = i7;
                    c3 = c2;
                    j5 = j3;
                    jArr5 = jArr2;
                    length = i6;
                    i9 = i5;
                    i11 = i3;
                    mutableScatterMap5 = mutableScatterMap2;
                }
                mutableScatterMap = mutableScatterMap5;
                jArr = jArr5;
                int i18 = length;
                int i19 = i9;
                if (i11 != i10) {
                    return arrayList;
                }
                length = i18;
                i2 = i19;
            } else {
                mutableScatterMap = mutableScatterMap5;
                jArr = jArr5;
                i2 = i9;
            }
            if (i2 == length) {
                return arrayList;
            }
            i9 = i2 + 1;
            mutableScatterMap5 = mutableScatterMap;
            jArr5 = jArr;
        }
    }

    public final boolean K() {
        return this.U.K0();
    }

    public final CompositionObserverHolder L() {
        return this.S;
    }

    public final CoroutineContext M() {
        CoroutineContext coroutineContext = this.V;
        return coroutineContext == null ? this.f14624z.l() : coroutineContext;
    }

    public final SlotTable N() {
        return this.E;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00aa, code lost:
        if (r6 == null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b0, code lost:
        return r6.O(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b1, code lost:
        r1.f14624z.n(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ba, code lost:
        if (q() == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return androidx.compose.runtime.InvalidationResult.SCHEDULED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return androidx.compose.runtime.InvalidationResult.DEFERRED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.InvalidationResult O(androidx.compose.runtime.RecomposeScopeImpl r21, androidx.compose.runtime.Anchor r22, java.lang.Object r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            r3 = r23
            java.lang.Object r4 = r1.C
            monitor-enter(r4)
            androidx.compose.runtime.CompositionImpl r5 = r1.Q     // Catch:{ all -> 0x001e }
            r6 = 0
            if (r5 == 0) goto L_0x0021
            androidx.compose.runtime.SlotTable r7 = r1.E     // Catch:{ all -> 0x001e }
            int r8 = r1.R     // Catch:{ all -> 0x001e }
            boolean r7 = r7.C(r8, r2)     // Catch:{ all -> 0x001e }
            if (r7 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r5 = r6
        L_0x001c:
            r6 = r5
            goto L_0x0021
        L_0x001e:
            r0 = move-exception
            goto L_0x00c2
        L_0x0021:
            if (r6 != 0) goto L_0x00a9
            boolean r5 = r1.U(r0, r3)     // Catch:{ all -> 0x001e }
            if (r5 == 0) goto L_0x002d
            androidx.compose.runtime.InvalidationResult r0 = androidx.compose.runtime.InvalidationResult.IMMINENT     // Catch:{ all -> 0x001e }
            monitor-exit(r4)
            return r0
        L_0x002d:
            if (r3 != 0) goto L_0x0038
            androidx.collection.MutableScatterMap r5 = r1.M     // Catch:{ all -> 0x001e }
            androidx.compose.runtime.ScopeInvalidated r7 = androidx.compose.runtime.ScopeInvalidated.f14839a     // Catch:{ all -> 0x001e }
            androidx.compose.runtime.collection.ScopeMap.k(r5, r0, r7)     // Catch:{ all -> 0x001e }
            goto L_0x00a9
        L_0x0038:
            boolean r5 = r3 instanceof androidx.compose.runtime.DerivedState     // Catch:{ all -> 0x001e }
            if (r5 != 0) goto L_0x0045
            androidx.collection.MutableScatterMap r5 = r1.M     // Catch:{ all -> 0x001e }
            androidx.compose.runtime.ScopeInvalidated r7 = androidx.compose.runtime.ScopeInvalidated.f14839a     // Catch:{ all -> 0x001e }
            androidx.compose.runtime.collection.ScopeMap.k(r5, r0, r7)     // Catch:{ all -> 0x001e }
            goto L_0x00a9
        L_0x0045:
            androidx.collection.MutableScatterMap r5 = r1.M     // Catch:{ all -> 0x001e }
            java.lang.Object r5 = r5.e(r0)     // Catch:{ all -> 0x001e }
            if (r5 == 0) goto L_0x00a4
            boolean r7 = r5 instanceof androidx.collection.MutableScatterSet     // Catch:{ all -> 0x001e }
            if (r7 == 0) goto L_0x009f
            androidx.collection.MutableScatterSet r5 = (androidx.collection.MutableScatterSet) r5     // Catch:{ all -> 0x001e }
            java.lang.Object[] r7 = r5.f1967b     // Catch:{ all -> 0x001e }
            long[] r5 = r5.f1966a     // Catch:{ all -> 0x001e }
            int r8 = r5.length     // Catch:{ all -> 0x001e }
            int r8 = r8 + -2
            if (r8 < 0) goto L_0x00a4
            r10 = 0
        L_0x005d:
            r11 = r5[r10]     // Catch:{ all -> 0x001e }
            long r13 = ~r11     // Catch:{ all -> 0x001e }
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x009a
            int r13 = r10 - r8
            int r13 = ~r13     // Catch:{ all -> 0x001e }
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L_0x0077:
            if (r15 >= r13) goto L_0x0097
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L_0x0091
            int r16 = r10 << 3
            int r16 = r16 + r15
            r9 = r7[r16]     // Catch:{ all -> 0x001e }
            androidx.compose.runtime.ScopeInvalidated r14 = androidx.compose.runtime.ScopeInvalidated.f14839a     // Catch:{ all -> 0x001e }
            if (r9 != r14) goto L_0x008e
            goto L_0x00a9
        L_0x008e:
            r9 = 8
            goto L_0x0092
        L_0x0091:
            r9 = r14
        L_0x0092:
            long r11 = r11 >> r9
            int r15 = r15 + 1
            r14 = r9
            goto L_0x0077
        L_0x0097:
            r9 = r14
            if (r13 != r9) goto L_0x00a4
        L_0x009a:
            if (r10 == r8) goto L_0x00a4
            int r10 = r10 + 1
            goto L_0x005d
        L_0x009f:
            androidx.compose.runtime.ScopeInvalidated r7 = androidx.compose.runtime.ScopeInvalidated.f14839a     // Catch:{ all -> 0x001e }
            if (r5 != r7) goto L_0x00a4
            goto L_0x00a9
        L_0x00a4:
            androidx.collection.MutableScatterMap r5 = r1.M     // Catch:{ all -> 0x001e }
            androidx.compose.runtime.collection.ScopeMap.a(r5, r0, r3)     // Catch:{ all -> 0x001e }
        L_0x00a9:
            monitor-exit(r4)
            if (r6 == 0) goto L_0x00b1
            androidx.compose.runtime.InvalidationResult r0 = r6.O(r0, r2, r3)
            return r0
        L_0x00b1:
            androidx.compose.runtime.CompositionContext r0 = r1.f14624z
            r0.n(r1)
            boolean r0 = r20.q()
            if (r0 == 0) goto L_0x00bf
            androidx.compose.runtime.InvalidationResult r0 = androidx.compose.runtime.InvalidationResult.DEFERRED
            goto L_0x00c1
        L_0x00bf:
            androidx.compose.runtime.InvalidationResult r0 = androidx.compose.runtime.InvalidationResult.SCHEDULED
        L_0x00c1:
            return r0
        L_0x00c2:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.O(androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.Anchor, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    public final void P(Object obj) {
        Object e2 = this.F.e(obj);
        if (e2 == null) {
            return;
        }
        if (e2 instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) e2;
            Object[] objArr = mutableScatterSet.f1967b;
            long[] jArr = mutableScatterSet.f1966a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i2 << 3) + i4];
                                if (recomposeScopeImpl.v(obj) == InvalidationResult.IMMINENT) {
                                    ScopeMap.a(this.L, obj, recomposeScopeImpl);
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            return;
                        }
                    }
                    if (i2 != length) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        } else {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) e2;
            if (recomposeScopeImpl2.v(obj) == InvalidationResult.IMMINENT) {
                ScopeMap.a(this.L, obj, recomposeScopeImpl2);
            }
        }
    }

    public final CompositionObserver Q() {
        return this.S.a();
    }

    public final void R(DerivedState derivedState) {
        if (!ScopeMap.e(this.F, derivedState)) {
            ScopeMap.j(this.I, derivedState);
        }
    }

    public final void S(Object obj, RecomposeScopeImpl recomposeScopeImpl) {
        ScopeMap.i(this.F, obj, recomposeScopeImpl);
    }

    public final MutableScatterMap T() {
        MutableScatterMap mutableScatterMap = this.M;
        this.M = ScopeMap.d((MutableScatterMap) null, 1, (DefaultConstructorMarker) null);
        return mutableScatterMap;
    }

    public final boolean U(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        return q() && this.U.I1(recomposeScopeImpl, obj);
    }

    public final void V() {
        synchronized (this.C) {
            H();
            MutableScatterMap T2 = T();
            try {
                this.U.K1(T2);
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                this.M = T2;
                throw th;
            }
        }
    }

    public InvalidationResult a(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        CompositionObserver Q2;
        CompositionImpl compositionImpl;
        if (recomposeScopeImpl.j()) {
            recomposeScopeImpl.F(true);
        }
        Anchor h2 = recomposeScopeImpl.h();
        if (h2 == null || !h2.b()) {
            return InvalidationResult.IGNORED;
        }
        if (!this.E.J(h2)) {
            synchronized (this.C) {
                compositionImpl = this.Q;
            }
            return (compositionImpl == null || !compositionImpl.U(recomposeScopeImpl, obj)) ? InvalidationResult.IGNORED : InvalidationResult.IMMINENT;
        } else if (!recomposeScopeImpl.i()) {
            return InvalidationResult.IGNORED;
        } else {
            InvalidationResult O2 = O(recomposeScopeImpl, h2, obj);
            if (!(O2 == InvalidationResult.IGNORED || (Q2 = Q()) == null)) {
                Q2.d(recomposeScopeImpl, obj);
            }
            return O2;
        }
    }

    public void b(Object obj) {
        RecomposeScopeImpl M0;
        long[] jArr;
        long[] jArr2;
        int i2;
        Object obj2 = obj;
        if (!K() && (M0 = this.U.M0()) != null) {
            M0.O(true);
            boolean z2 = M0.z(obj2);
            CompositionObserver Q2 = Q();
            if (Q2 != null) {
                Q2.g(M0, obj2);
            }
            if (!z2) {
                if (obj2 instanceof StateObjectImpl) {
                    ((StateObjectImpl) obj2).u(ReaderKind.a(1));
                }
                ScopeMap.a(this.F, obj2, M0);
                if (obj2 instanceof DerivedState) {
                    DerivedState derivedState = (DerivedState) obj2;
                    DerivedState.Record s2 = derivedState.s();
                    ScopeMap.j(this.I, obj2);
                    ObjectIntMap b2 = s2.b();
                    Object[] objArr = b2.f1932b;
                    long[] jArr3 = b2.f1931a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j2 = jArr3[i3];
                            if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                int i4 = 8;
                                int i5 = 8 - ((~(i3 - length)) >>> 31);
                                int i6 = 0;
                                while (i6 < i5) {
                                    if ((j2 & 255) < 128) {
                                        StateObject stateObject = (StateObject) objArr[(i3 << 3) + i6];
                                        if (stateObject instanceof StateObjectImpl) {
                                            jArr2 = jArr3;
                                            ((StateObjectImpl) stateObject).u(ReaderKind.a(1));
                                        } else {
                                            jArr2 = jArr3;
                                        }
                                        ScopeMap.a(this.I, stateObject, obj2);
                                        i2 = 8;
                                    } else {
                                        jArr2 = jArr3;
                                        i2 = i4;
                                    }
                                    j2 >>= i2;
                                    i6++;
                                    i4 = i2;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i5 != i4) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i3 == length) {
                                break;
                            }
                            i3++;
                            jArr3 = jArr;
                        }
                    }
                    M0.y(derivedState, s2.a());
                }
            }
        }
    }

    public void c(RecomposeScopeImpl recomposeScopeImpl) {
        this.N = true;
        CompositionObserver Q2 = Q();
        if (Q2 != null) {
            Q2.c(recomposeScopeImpl);
        }
    }

    public void d() {
        RememberEventDispatcher rememberEventDispatcher;
        SlotWriter F2;
        synchronized (this.C) {
            try {
                if (this.U.Z0()) {
                    PreconditionsKt.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.X != 3) {
                    this.X = 3;
                    this.Y = ComposableSingletons$CompositionKt.f14550a.a();
                    ChangeList N0 = this.U.N0();
                    if (N0 != null) {
                        l(N0);
                    }
                    boolean z2 = this.E.u() > 0;
                    if (z2 || !this.D.isEmpty()) {
                        rememberEventDispatcher = this.T;
                        rememberEventDispatcher.o(this.D, this.U.O0());
                        if (z2) {
                            this.f14622A.f();
                            F2 = this.E.F();
                            ComposerKt.S(F2, this.T);
                            Unit unit = Unit.f40552a;
                            F2.J(true);
                            this.f14622A.clear();
                            this.f14622A.k();
                            rememberEventDispatcher.l();
                        }
                        rememberEventDispatcher.j();
                        rememberEventDispatcher.i();
                    }
                    this.U.v0();
                }
                Unit unit2 = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14624z.w(this);
    }

    public void deactivate() {
        RememberEventDispatcher rememberEventDispatcher;
        SlotWriter F2;
        synchronized (this.C) {
            try {
                if (!(this.P == null)) {
                    PreconditionsKt.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z2 = this.E.u() > 0;
                if (z2 || !this.D.isEmpty()) {
                    Trace trace = Trace.f15156a;
                    Object a2 = trace.a("Compose:deactivate");
                    try {
                        rememberEventDispatcher = this.T;
                        rememberEventDispatcher.o(this.D, this.U.O0());
                        if (z2) {
                            this.f14622A.f();
                            F2 = this.E.F();
                            ComposerKt.x(F2, this.T);
                            Unit unit = Unit.f40552a;
                            F2.J(true);
                            this.f14622A.k();
                            rememberEventDispatcher.l();
                        }
                        rememberEventDispatcher.j();
                        rememberEventDispatcher.i();
                        Unit unit2 = Unit.f40552a;
                        trace.b(a2);
                    } catch (Throwable th) {
                        Trace.f15156a.b(a2);
                        throw th;
                    }
                }
                ScopeMap.b(this.F);
                ScopeMap.b(this.I);
                ScopeMap.b(this.M);
                this.J.a();
                this.K.a();
                this.U.u0();
                this.X = 1;
                Unit unit3 = Unit.f40552a;
            } finally {
            }
        }
    }

    public void e(Function2 function2) {
        RememberEventDispatcher rememberEventDispatcher;
        try {
            synchronized (this.C) {
                F();
                MutableScatterMap T2 = T();
                try {
                    this.U.o0(T2, function2, this.O);
                    Unit unit = Unit.f40552a;
                } catch (Throwable th) {
                    this.M = T2;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            rememberEventDispatcher.i();
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(java.util.Set r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof androidx.compose.runtime.collection.ScatterSetWrapper
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005c
            androidx.compose.runtime.collection.ScatterSetWrapper r15 = (androidx.compose.runtime.collection.ScatterSetWrapper) r15
            androidx.collection.ScatterSet r15 = r15.e()
            java.lang.Object[] r0 = r15.f1967b
            long[] r15 = r15.f1966a
            int r3 = r15.length
            int r3 = r3 + -2
            if (r3 < 0) goto L_0x007d
            r4 = r1
        L_0x0016:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0057
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L_0x0030:
            if (r9 >= r7) goto L_0x0055
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L_0x0051
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            androidx.collection.MutableScatterMap r11 = r14.F
            boolean r11 = androidx.compose.runtime.collection.ScopeMap.e(r11, r10)
            if (r11 != 0) goto L_0x0050
            androidx.collection.MutableScatterMap r11 = r14.I
            boolean r10 = androidx.compose.runtime.collection.ScopeMap.e(r11, r10)
            if (r10 == 0) goto L_0x0051
        L_0x0050:
            return r2
        L_0x0051:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L_0x0030
        L_0x0055:
            if (r7 != r8) goto L_0x007d
        L_0x0057:
            if (r4 == r3) goto L_0x007d
            int r4 = r4 + 1
            goto L_0x0016
        L_0x005c:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L_0x0062:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x007d
            java.lang.Object r0 = r15.next()
            androidx.collection.MutableScatterMap r3 = r14.F
            boolean r3 = androidx.compose.runtime.collection.ScopeMap.e(r3, r0)
            if (r3 != 0) goto L_0x007c
            androidx.collection.MutableScatterMap r3 = r14.I
            boolean r0 = androidx.compose.runtime.collection.ScopeMap.e(r3, r0)
            if (r0 == 0) goto L_0x0062
        L_0x007c:
            return r2
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.f(java.util.Set):boolean");
    }

    public void h() {
        RememberEventDispatcher rememberEventDispatcher;
        synchronized (this.C) {
            try {
                if (this.K.d()) {
                    l(this.K);
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                rememberEventDispatcher.i();
                throw th;
            }
        }
    }

    public boolean i() {
        return this.X == 3;
    }

    public final void j(Object obj, boolean z2) {
        Object obj2 = obj;
        Object e2 = this.F.e(obj2);
        if (e2 == null) {
            return;
        }
        if (e2 instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) e2;
            Object[] objArr = mutableScatterSet.f1967b;
            long[] jArr = mutableScatterSet.f1966a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i2 << 3) + i4];
                                if (!ScopeMap.i(this.L, obj2, recomposeScopeImpl) && recomposeScopeImpl.v(obj2) != InvalidationResult.IGNORED) {
                                    if (!recomposeScopeImpl.w() || z2) {
                                        this.G.h(recomposeScopeImpl);
                                    } else {
                                        this.H.h(recomposeScopeImpl);
                                    }
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            return;
                        }
                    }
                    if (i2 != length) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        } else {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) e2;
            if (!ScopeMap.i(this.L, obj2, recomposeScopeImpl2) && recomposeScopeImpl2.v(obj2) != InvalidationResult.IGNORED) {
                if (!recomposeScopeImpl2.w() || z2) {
                    this.G.h(recomposeScopeImpl2);
                } else {
                    this.H.h(recomposeScopeImpl2);
                }
            }
        }
    }

    public final void k(Set set, boolean z2) {
        String str;
        long[] jArr;
        int i2;
        String str2;
        long[] jArr2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        Object[] objArr;
        int i6;
        String str3;
        Object[] objArr2;
        String str4;
        long[] jArr3;
        int i7;
        String str5;
        long[] jArr4;
        int i8;
        int i9;
        long j2;
        boolean z4;
        Object[] objArr3;
        long[] jArr5;
        int i10;
        long[] jArr6;
        Object[] objArr4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Set set2 = set;
        boolean z5 = z2;
        long j3 = 255;
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i16 = 8;
        if (set2 instanceof ScatterSetWrapper) {
            ScatterSet e2 = ((ScatterSetWrapper) set2).e();
            Object[] objArr5 = e2.f1967b;
            long[] jArr7 = e2.f1966a;
            int length = jArr7.length - 2;
            if (length >= 0) {
                Object[] objArr6 = objArr5;
                int i17 = 0;
                while (true) {
                    long j5 = jArr7[i17];
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i18 = 8 - ((~(i17 - length)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j5 & j3) < 128) {
                                Object obj = objArr6[(i17 << 3) + i19];
                                if (obj instanceof RecomposeScopeImpl) {
                                    ((RecomposeScopeImpl) obj).v((Object) null);
                                    i14 = i18;
                                    i13 = i19;
                                } else {
                                    j(obj, z5);
                                    Object e3 = this.I.e(obj);
                                    if (e3 != null) {
                                        if (e3 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet = (MutableScatterSet) e3;
                                            Object[] objArr7 = mutableScatterSet.f1967b;
                                            long[] jArr8 = mutableScatterSet.f1966a;
                                            int length2 = jArr8.length - 2;
                                            if (length2 >= 0) {
                                                int i20 = 0;
                                                while (true) {
                                                    long j6 = jArr8[i20];
                                                    i14 = i18;
                                                    i13 = i19;
                                                    if ((((~j6) << c2) & j6 & -9187201950435737472L) != -9187201950435737472L) {
                                                        int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                                        for (int i22 = 0; i22 < i21; i22++) {
                                                            if ((j6 & 255) < 128) {
                                                                j((DerivedState) objArr7[(i20 << 3) + i22], z5);
                                                            }
                                                            j6 >>= 8;
                                                        }
                                                        if (i21 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i20 == length2) {
                                                        break;
                                                    }
                                                    i20++;
                                                    i18 = i14;
                                                    i19 = i13;
                                                    c2 = 7;
                                                }
                                            }
                                        } else {
                                            i14 = i18;
                                            i13 = i19;
                                            j((DerivedState) e3, z5);
                                        }
                                        Unit unit = Unit.f40552a;
                                    }
                                    i14 = i18;
                                    i13 = i19;
                                    Unit unit2 = Unit.f40552a;
                                }
                                i15 = 8;
                            } else {
                                i14 = i18;
                                i13 = i19;
                                i15 = i16;
                            }
                            j5 >>= i15;
                            i16 = i15;
                            i19 = i13 + 1;
                            i18 = i14;
                            j3 = 255;
                            c2 = 7;
                        }
                        i12 = 1;
                        if (i18 != i16) {
                            break;
                        }
                    } else {
                        i12 = 1;
                    }
                    if (i17 == length) {
                        break;
                    }
                    i17 += i12;
                    j3 = 255;
                    c2 = 7;
                    j4 = -9187201950435737472L;
                    i16 = 8;
                }
            }
        } else {
            for (Object next : set2) {
                if (next instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) next).v((Object) null);
                } else {
                    j(next, z5);
                    Object e4 = this.I.e(next);
                    if (e4 != null) {
                        if (e4 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet2 = (MutableScatterSet) e4;
                            Object[] objArr8 = mutableScatterSet2.f1967b;
                            long[] jArr9 = mutableScatterSet2.f1966a;
                            int length3 = jArr9.length - 2;
                            if (length3 >= 0) {
                                int i23 = 0;
                                while (true) {
                                    long j7 = jArr9[i23];
                                    if ((((~j7) << 7) & j7 & -9187201950435737472L) != -9187201950435737472L) {
                                        int i24 = 8 - ((~(i23 - length3)) >>> 31);
                                        for (int i25 = 0; i25 < i24; i25++) {
                                            if ((j7 & 255) < 128) {
                                                j((DerivedState) objArr8[(i23 << 3) + i25], z5);
                                            }
                                            j7 >>= 8;
                                        }
                                        i11 = 1;
                                        if (i24 != 8) {
                                            break;
                                        }
                                    } else {
                                        i11 = 1;
                                    }
                                    if (i23 == length3) {
                                        break;
                                    }
                                    i23 += i11;
                                }
                            }
                        } else {
                            j((DerivedState) e4, z5);
                        }
                    }
                    Unit unit3 = Unit.f40552a;
                }
            }
        }
        MutableScatterSet mutableScatterSet3 = this.H;
        MutableScatterSet mutableScatterSet4 = this.G;
        String str6 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        if (!z5 || !mutableScatterSet3.e()) {
            String str7 = str6;
            if (mutableScatterSet4.e()) {
                MutableScatterMap mutableScatterMap = this.F;
                long[] jArr10 = mutableScatterMap.f1959a;
                int length4 = jArr10.length - 2;
                if (length4 >= 0) {
                    int i26 = 0;
                    while (true) {
                        long j8 = jArr10[i26];
                        if ((((~j8) << 7) & j8 & -9187201950435737472L) != -9187201950435737472L) {
                            int i27 = 8 - ((~(i26 - length4)) >>> 31);
                            int i28 = 0;
                            while (i28 < i27) {
                                if ((j8 & 255) < 128) {
                                    int i29 = (i26 << 3) + i28;
                                    Object obj2 = mutableScatterMap.f1960b[i29];
                                    Object obj3 = mutableScatterMap.f1961c[i29];
                                    if (obj3 instanceof MutableScatterSet) {
                                        String str8 = str7;
                                        Intrinsics.g(obj3, str8);
                                        MutableScatterSet mutableScatterSet5 = (MutableScatterSet) obj3;
                                        Object[] objArr9 = mutableScatterSet5.f1967b;
                                        long[] jArr11 = mutableScatterSet5.f1966a;
                                        int length5 = jArr11.length - 2;
                                        jArr2 = jArr10;
                                        i3 = length4;
                                        i4 = i26;
                                        if (length5 >= 0) {
                                            int i30 = 0;
                                            while (true) {
                                                long j9 = jArr11[i30];
                                                i5 = i27;
                                                long[] jArr12 = jArr11;
                                                if ((((~j9) << 7) & j9 & -9187201950435737472L) != -9187201950435737472L) {
                                                    int i31 = 8 - ((~(i30 - length5)) >>> 31);
                                                    int i32 = 0;
                                                    while (i32 < i31) {
                                                        if ((j9 & 255) < 128) {
                                                            str3 = str8;
                                                            int i33 = (i30 << 3) + i32;
                                                            objArr2 = objArr9;
                                                            if (mutableScatterSet4.a((RecomposeScopeImpl) objArr9[i33])) {
                                                                mutableScatterSet5.A(i33);
                                                            }
                                                        } else {
                                                            str3 = str8;
                                                            objArr2 = objArr9;
                                                        }
                                                        j9 >>= 8;
                                                        i32++;
                                                        str8 = str3;
                                                        objArr9 = objArr2;
                                                    }
                                                    str2 = str8;
                                                    objArr = objArr9;
                                                    i6 = 1;
                                                    if (i31 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    str2 = str8;
                                                    objArr = objArr9;
                                                    i6 = 1;
                                                }
                                                if (i30 == length5) {
                                                    break;
                                                }
                                                i30 += i6;
                                                i27 = i5;
                                                jArr11 = jArr12;
                                                str8 = str2;
                                                objArr9 = objArr;
                                            }
                                        } else {
                                            str2 = str8;
                                            i5 = i27;
                                        }
                                        z3 = mutableScatterSet5.d();
                                    } else {
                                        str2 = str7;
                                        jArr2 = jArr10;
                                        i3 = length4;
                                        i4 = i26;
                                        i5 = i27;
                                        Intrinsics.g(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        z3 = mutableScatterSet4.a((RecomposeScopeImpl) obj3);
                                    }
                                    if (z3) {
                                        mutableScatterMap.v(i29);
                                    }
                                } else {
                                    str2 = str7;
                                    jArr2 = jArr10;
                                    i3 = length4;
                                    i4 = i26;
                                    i5 = i27;
                                }
                                j8 >>= 8;
                                i28++;
                                length4 = i3;
                                i26 = i4;
                                jArr10 = jArr2;
                                i27 = i5;
                                str7 = str2;
                            }
                            str = str7;
                            jArr = jArr10;
                            int i34 = length4;
                            int i35 = i26;
                            i2 = 1;
                            if (i27 != 8) {
                                break;
                            }
                            length4 = i34;
                            i26 = i35;
                        } else {
                            str = str7;
                            jArr = jArr10;
                            i2 = 1;
                        }
                        if (i26 == length4) {
                            break;
                        }
                        i26 += i2;
                        jArr10 = jArr;
                        str7 = str;
                    }
                }
                B();
                mutableScatterSet4.m();
                return;
            }
            return;
        }
        MutableScatterMap mutableScatterMap2 = this.F;
        long[] jArr13 = mutableScatterMap2.f1959a;
        int length6 = jArr13.length - 2;
        if (length6 >= 0) {
            int i36 = 0;
            while (true) {
                long j10 = jArr13[i36];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i37 = 8 - ((~(i36 - length6)) >>> 31);
                    int i38 = 0;
                    while (i38 < i37) {
                        if ((j10 & 255) < 128) {
                            int i39 = (i36 << 3) + i38;
                            Object obj4 = mutableScatterMap2.f1960b[i39];
                            Object obj5 = mutableScatterMap2.f1961c[i39];
                            if (obj5 instanceof MutableScatterSet) {
                                Intrinsics.g(obj5, str6);
                                MutableScatterSet mutableScatterSet6 = (MutableScatterSet) obj5;
                                Object[] objArr10 = mutableScatterSet6.f1967b;
                                jArr4 = jArr13;
                                long[] jArr14 = mutableScatterSet6.f1966a;
                                str5 = str6;
                                int length7 = jArr14.length - 2;
                                i8 = length6;
                                i9 = i36;
                                if (length7 >= 0) {
                                    int i40 = 0;
                                    while (true) {
                                        long j11 = jArr14[i40];
                                        j2 = j10;
                                        if ((((~j11) << 7) & j11 & -9187201950435737472L) != -9187201950435737472L) {
                                            int i41 = 8 - ((~(i40 - length7)) >>> 31);
                                            int i42 = 0;
                                            while (i42 < i41) {
                                                if ((j11 & 255) < 128) {
                                                    jArr6 = jArr14;
                                                    int i43 = (i40 << 3) + i42;
                                                    objArr4 = objArr10;
                                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr10[i43];
                                                    if (mutableScatterSet3.a(recomposeScopeImpl) || mutableScatterSet4.a(recomposeScopeImpl)) {
                                                        mutableScatterSet6.A(i43);
                                                    }
                                                } else {
                                                    jArr6 = jArr14;
                                                    objArr4 = objArr10;
                                                }
                                                j11 >>= 8;
                                                i42++;
                                                jArr14 = jArr6;
                                                objArr10 = objArr4;
                                            }
                                            jArr5 = jArr14;
                                            objArr3 = objArr10;
                                            i10 = 1;
                                            if (i41 != 8) {
                                                break;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            objArr3 = objArr10;
                                            i10 = 1;
                                        }
                                        if (i40 == length7) {
                                            break;
                                        }
                                        i40 += i10;
                                        j10 = j2;
                                        jArr14 = jArr5;
                                        objArr10 = objArr3;
                                    }
                                } else {
                                    j2 = j10;
                                }
                                z4 = mutableScatterSet6.d();
                            } else {
                                str5 = str6;
                                jArr4 = jArr13;
                                i8 = length6;
                                i9 = i36;
                                j2 = j10;
                                Intrinsics.g(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj5;
                                z4 = mutableScatterSet3.a(recomposeScopeImpl2) || mutableScatterSet4.a(recomposeScopeImpl2);
                            }
                            if (z4) {
                                mutableScatterMap2.v(i39);
                            }
                        } else {
                            str5 = str6;
                            jArr4 = jArr13;
                            i8 = length6;
                            i9 = i36;
                            j2 = j10;
                        }
                        j10 = j2 >> 8;
                        i38++;
                        str6 = str5;
                        length6 = i8;
                        jArr13 = jArr4;
                        i36 = i9;
                    }
                    str4 = str6;
                    jArr3 = jArr13;
                    int i44 = length6;
                    int i45 = i36;
                    if (i37 != 8) {
                        break;
                    }
                    length6 = i44;
                    i7 = i45;
                } else {
                    str4 = str6;
                    jArr3 = jArr13;
                    i7 = i36;
                }
                if (i7 == length6) {
                    break;
                }
                i36 = i7 + 1;
                str6 = str4;
                jArr13 = jArr3;
            }
        }
        mutableScatterSet3.m();
        B();
    }

    public final void l(ChangeList changeList) {
        Object a2;
        Applier applier;
        RememberEventDispatcher rememberEventDispatcher;
        SlotWriter F2;
        Object a3;
        Object obj;
        Object obj2;
        long[] jArr;
        int i2;
        int i3;
        long[] jArr2;
        char c2;
        long j2;
        int i4;
        boolean z2;
        long[] jArr3;
        long[] jArr4;
        CompositionImpl compositionImpl = this;
        int i5 = 1;
        compositionImpl.T.o(compositionImpl.D, compositionImpl.U.O0());
        try {
            if (changeList.c()) {
                try {
                    if (compositionImpl.K.c() && compositionImpl.P == null) {
                        compositionImpl.T.j();
                    }
                } finally {
                    compositionImpl.T.i();
                }
            } else {
                Trace trace = Trace.f15156a;
                a2 = trace.a("Compose:applyChanges");
                PausedCompositionImpl pausedCompositionImpl = compositionImpl.P;
                if (pausedCompositionImpl == null || (applier = pausedCompositionImpl.a()) == null) {
                    applier = compositionImpl.f14622A;
                }
                PausedCompositionImpl pausedCompositionImpl2 = compositionImpl.P;
                if (pausedCompositionImpl2 == null || (rememberEventDispatcher = pausedCompositionImpl2.b()) == null) {
                    rememberEventDispatcher = compositionImpl.T;
                }
                applier.f();
                F2 = compositionImpl.E.F();
                int i6 = 0;
                changeList.b(applier, F2, rememberEventDispatcher, compositionImpl.U.O0());
                Unit unit = Unit.f40552a;
                F2.J(true);
                applier.k();
                trace.b(a2);
                compositionImpl.T.l();
                compositionImpl.T.m();
                if (compositionImpl.N) {
                    try {
                        a3 = trace.a("Compose:unobserve");
                        compositionImpl.N = false;
                        MutableScatterMap mutableScatterMap = compositionImpl.F;
                        long[] jArr5 = mutableScatterMap.f1959a;
                        int length = jArr5.length - 2;
                        if (length >= 0) {
                            int i7 = 0;
                            while (true) {
                                try {
                                    long j3 = jArr5[i7];
                                    char c3 = 7;
                                    long j4 = -9187201950435737472L;
                                    if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                                        int i8 = 8;
                                        int i9 = 8 - ((~(i7 - length)) >>> 31);
                                        int i10 = i6;
                                        while (i10 < i9) {
                                            if ((j3 & 255) < 128) {
                                                int i11 = (i7 << 3) + i10;
                                                Object obj3 = mutableScatterMap.f1960b[i11];
                                                Object obj4 = mutableScatterMap.f1961c[i11];
                                                if (obj4 instanceof MutableScatterSet) {
                                                    Intrinsics.g(obj4, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                    MutableScatterSet mutableScatterSet = (MutableScatterSet) obj4;
                                                    Object[] objArr = mutableScatterSet.f1967b;
                                                    long[] jArr6 = mutableScatterSet.f1966a;
                                                    int length2 = jArr6.length - 2;
                                                    obj2 = a3;
                                                    if (length2 >= 0) {
                                                        int i12 = 0;
                                                        while (true) {
                                                            long j5 = jArr6[i12];
                                                            jArr2 = jArr5;
                                                            i3 = length;
                                                            c2 = 7;
                                                            j2 = -9187201950435737472L;
                                                            if ((((~j5) << 7) & j5 & -9187201950435737472L) != -9187201950435737472L) {
                                                                int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                                int i14 = 0;
                                                                while (i14 < i13) {
                                                                    if ((j5 & 255) < 128) {
                                                                        jArr4 = jArr6;
                                                                        int i15 = (i12 << 3) + i14;
                                                                        if (!((RecomposeScopeImpl) objArr[i15]).u()) {
                                                                            mutableScatterSet.A(i15);
                                                                        }
                                                                    } else {
                                                                        jArr4 = jArr6;
                                                                    }
                                                                    j5 >>= 8;
                                                                    i14++;
                                                                    jArr6 = jArr4;
                                                                }
                                                                jArr3 = jArr6;
                                                                if (i13 != 8) {
                                                                    break;
                                                                }
                                                            } else {
                                                                jArr3 = jArr6;
                                                            }
                                                            if (i12 == length2) {
                                                                break;
                                                            }
                                                            i12++;
                                                            jArr5 = jArr2;
                                                            length = i3;
                                                            jArr6 = jArr3;
                                                        }
                                                    } else {
                                                        jArr2 = jArr5;
                                                        i3 = length;
                                                        c2 = c3;
                                                        j2 = -9187201950435737472L;
                                                    }
                                                    z2 = mutableScatterSet.d();
                                                } else {
                                                    obj2 = a3;
                                                    jArr2 = jArr5;
                                                    i3 = length;
                                                    c2 = c3;
                                                    j2 = j4;
                                                    Intrinsics.g(obj4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                    z2 = !((RecomposeScopeImpl) obj4).u();
                                                }
                                                if (z2) {
                                                    mutableScatterMap.v(i11);
                                                }
                                                i4 = 8;
                                            } else {
                                                obj2 = a3;
                                                jArr2 = jArr5;
                                                i3 = length;
                                                c2 = c3;
                                                j2 = j4;
                                                i4 = i8;
                                            }
                                            j3 >>= i4;
                                            i10++;
                                            i8 = i4;
                                            i5 = 1;
                                            j4 = j2;
                                            c3 = c2;
                                            a3 = obj2;
                                            jArr5 = jArr2;
                                            length = i3;
                                        }
                                        i2 = i5;
                                        obj2 = a3;
                                        jArr = jArr5;
                                        int i16 = length;
                                        if (i9 != i8) {
                                            break;
                                        }
                                        length = i16;
                                    } else {
                                        i2 = i5;
                                        obj2 = a3;
                                        jArr = jArr5;
                                    }
                                    if (i7 == length) {
                                        break;
                                    }
                                    i7 += i2;
                                    i5 = i2;
                                    a3 = obj2;
                                    jArr5 = jArr;
                                    i6 = 0;
                                } catch (Throwable th) {
                                    th = th;
                                    obj = obj2;
                                    Trace.f15156a.b(obj);
                                    throw th;
                                }
                            }
                        } else {
                            obj2 = a3;
                        }
                        B();
                        Unit unit2 = Unit.f40552a;
                        Trace.f15156a.b(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        compositionImpl = this;
                        try {
                            compositionImpl.T.j();
                            throw th;
                        } finally {
                            compositionImpl.T.i();
                        }
                    }
                }
                try {
                    if (this.K.c() && this.P == null) {
                        this.T.j();
                    }
                } finally {
                    this.T.i();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (compositionImpl.K.c() && compositionImpl.P == null) {
                compositionImpl.T.j();
            }
            throw th;
        }
    }

    public void m(Function0 function0) {
        this.U.f1(function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.util.Set} */
    /* JADX WARNING: type inference failed for: r1v14, types: [java.util.Set[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(java.util.Set r4) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r3.f14623B
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r1 = androidx.compose.runtime.CompositionKt.f14625a
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r1 == 0) goto L_0x0013
            goto L_0x004f
        L_0x0013:
            boolean r1 = r0 instanceof java.util.Set
            if (r1 == 0) goto L_0x0021
            r1 = 2
            java.util.Set[] r1 = new java.util.Set[r1]
            r2 = 0
            r1[r2] = r0
            r2 = 1
            r1[r2] = r4
            goto L_0x0050
        L_0x0021:
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            r1 = r0
            java.util.Set[] r1 = (java.util.Set[]) r1
            java.lang.Object[] r1 = kotlin.collections.ArraysKt.F(r1, r4)
            goto L_0x0050
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "corrupt pendingModifications: "
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReference r1 = r3.f14623B
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L_0x004f:
            r1 = r4
        L_0x0050:
            java.util.concurrent.atomic.AtomicReference r2 = r3.f14623B
            boolean r1 = androidx.compose.animation.core.h.a(r2, r0, r1)
            if (r1 == 0) goto L_0x0000
            if (r0 != 0) goto L_0x0067
            java.lang.Object r4 = r3.C
            monitor-enter(r4)
            r3.G()     // Catch:{ all -> 0x0064 }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0064 }
            monitor-exit(r4)
            goto L_0x0067
        L_0x0064:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.n(java.util.Set):void");
    }

    public void o() {
        RememberEventDispatcher rememberEventDispatcher;
        synchronized (this.C) {
            try {
                l(this.J);
                G();
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                rememberEventDispatcher.i();
                throw th;
            }
        }
    }

    public void p(Function2 function2) {
        boolean C2 = C();
        I();
        if (C2) {
            E(function2);
        } else {
            D(function2);
        }
    }

    public boolean q() {
        return this.U.Z0();
    }

    public void r(Function2 function2) {
        C();
        I();
        E(function2);
    }

    public void s(MovableContentState movableContentState) {
        SlotWriter F2;
        RememberEventDispatcher rememberEventDispatcher = this.T;
        try {
            rememberEventDispatcher.o(this.D, this.U.O0());
            F2 = movableContentState.f().F();
            ComposerKt.S(F2, this.T);
            Unit unit = Unit.f40552a;
            F2.J(true);
            rememberEventDispatcher.l();
            rememberEventDispatcher.i();
        } catch (Throwable th) {
            rememberEventDispatcher.i();
            throw th;
        }
    }

    public void t(List list) {
        RememberEventDispatcher rememberEventDispatcher;
        boolean z2 = true;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            } else if (!Intrinsics.d(((MovableContentStateReference) ((Pair) list.get(i2)).e()).b(), this)) {
                z2 = false;
                break;
            } else {
                i2++;
            }
        }
        if (!z2) {
            ComposerKt.v("Check failed");
        }
        try {
            this.U.V0(list);
            Unit unit = Unit.f40552a;
        } catch (Throwable th) {
            rememberEventDispatcher.i();
            throw th;
        }
    }

    public void u(Object obj) {
        synchronized (this.C) {
            try {
                P(obj);
                Object e2 = this.I.e(obj);
                if (e2 != null) {
                    if (e2 instanceof MutableScatterSet) {
                        MutableScatterSet mutableScatterSet = (MutableScatterSet) e2;
                        Object[] objArr = mutableScatterSet.f1967b;
                        long[] jArr = mutableScatterSet.f1966a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j2 = jArr[i2];
                                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        if ((255 & j2) < 128) {
                                            P((DerivedState) objArr[(i2 << 3) + i4]);
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
                    } else {
                        P((DerivedState) e2);
                    }
                }
                Unit unit = Unit.f40552a;
            } finally {
            }
        }
    }

    public boolean v() {
        boolean z2;
        synchronized (this.C) {
            z2 = ScopeMap.g(this.M) > 0;
        }
        return z2;
    }

    public void w() {
        this.f14623B.set((Object) null);
        this.J.a();
        this.K.a();
        if (!this.D.isEmpty()) {
            RememberEventDispatcher rememberEventDispatcher = this.T;
            try {
                rememberEventDispatcher.o(this.D, this.U.O0());
                rememberEventDispatcher.j();
            } finally {
                rememberEventDispatcher.i();
            }
        }
    }

    public void x() {
        RememberEventDispatcher rememberEventDispatcher;
        RememberEventDispatcher rememberEventDispatcher2;
        synchronized (this.C) {
            try {
                this.U.l0();
                if (!this.D.isEmpty()) {
                    rememberEventDispatcher2 = this.T;
                    rememberEventDispatcher2.o(this.D, this.U.O0());
                    rememberEventDispatcher2.j();
                    rememberEventDispatcher2.i();
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                rememberEventDispatcher.i();
                throw th;
            }
        }
    }

    public Object y(ControlledComposition controlledComposition, int i2, Function0 function0) {
        if (controlledComposition == null || Intrinsics.d(controlledComposition, this) || i2 < 0) {
            return function0.invoke();
        }
        this.Q = (CompositionImpl) controlledComposition;
        this.R = i2;
        try {
            return function0.invoke();
        } finally {
            this.Q = null;
            this.R = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002d, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean z() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.C
            monitor-enter(r0)
            androidx.compose.runtime.PausedCompositionImpl r1 = r5.P     // Catch:{ all -> 0x0013 }
            if (r1 == 0) goto L_0x0015
            boolean r2 = r1.c()     // Catch:{ all -> 0x0013 }
            if (r2 != 0) goto L_0x0015
            r1.d()     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)
            r0 = 0
            return r0
        L_0x0013:
            r1 = move-exception
            goto L_0x005c
        L_0x0015:
            r5.F()     // Catch:{ all -> 0x0013 }
            androidx.collection.MutableScatterMap r1 = r5.T()     // Catch:{ all -> 0x0031 }
            androidx.compose.runtime.ComposerImpl r2 = r5.U     // Catch:{ all -> 0x002a }
            androidx.compose.runtime.ShouldPauseCallback r3 = r5.O     // Catch:{ all -> 0x002a }
            boolean r2 = r2.h1(r1, r3)     // Catch:{ all -> 0x002a }
            if (r2 != 0) goto L_0x002c
            r5.G()     // Catch:{ all -> 0x002a }
            goto L_0x002c
        L_0x002a:
            r2 = move-exception
            goto L_0x002e
        L_0x002c:
            monitor-exit(r0)
            return r2
        L_0x002e:
            r5.M = r1     // Catch:{ all -> 0x0031 }
            throw r2     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r1 = move-exception
            java.util.Set r2 = r5.D     // Catch:{ all -> 0x0050 }
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0050 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x0057
            androidx.compose.runtime.internal.RememberEventDispatcher r2 = r5.T     // Catch:{ all -> 0x0050 }
            java.util.Set r3 = r5.D     // Catch:{ all -> 0x0050 }
            androidx.compose.runtime.ComposerImpl r4 = r5.U     // Catch:{ all -> 0x0050 }
            androidx.compose.runtime.tooling.CompositionErrorContextImpl r4 = r4.O0()     // Catch:{ all -> 0x0050 }
            r2.o(r3, r4)     // Catch:{ all -> 0x0052 }
            r2.j()     // Catch:{ all -> 0x0052 }
            r2.i()     // Catch:{ all -> 0x0050 }
            goto L_0x0057
        L_0x0050:
            r1 = move-exception
            goto L_0x0058
        L_0x0052:
            r1 = move-exception
            r2.i()     // Catch:{ all -> 0x0050 }
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0057:
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0058:
            r5.w()     // Catch:{ all -> 0x0013 }
            throw r1     // Catch:{ all -> 0x0013 }
        L_0x005c:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.z():boolean");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i2 & 4) != 0 ? null : coroutineContext);
    }
}
