package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionRegistrationObserver;
import androidx.compose.runtime.tooling.ObservableComposition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata
public final class Recomposer extends CompositionContext {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);
    public static final int D = 8;
    public static final MutableStateFlow E = StateFlowKt.a(ExtensionsKt.c());
    public static final AtomicReference F = new AtomicReference(Boolean.FALSE);

    /* renamed from: A  reason: collision with root package name */
    public MutableObjectList f14788A;

    /* renamed from: B  reason: collision with root package name */
    public final RecomposerInfoImpl f14789B;

    /* renamed from: a  reason: collision with root package name */
    public long f14790a;

    /* renamed from: b  reason: collision with root package name */
    public final BroadcastFrameClock f14791b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14792c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public Job f14793d;

    /* renamed from: e  reason: collision with root package name */
    public Throwable f14794e;

    /* renamed from: f  reason: collision with root package name */
    public final List f14795f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public List f14796g;

    /* renamed from: h  reason: collision with root package name */
    public MutableScatterSet f14797h = new MutableScatterSet(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public final MutableVector f14798i = new MutableVector(new ControlledComposition[16], 0);

    /* renamed from: j  reason: collision with root package name */
    public final List f14799j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final List f14800k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final MutableScatterMap f14801l = MultiValueMap.e((MutableScatterMap) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: m  reason: collision with root package name */
    public final NestedContentMap f14802m = new NestedContentMap();

    /* renamed from: n  reason: collision with root package name */
    public final MutableScatterMap f14803n = ScatterMapKt.c();

    /* renamed from: o  reason: collision with root package name */
    public final MutableScatterMap f14804o = MultiValueMap.e((MutableScatterMap) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: p  reason: collision with root package name */
    public List f14805p;

    /* renamed from: q  reason: collision with root package name */
    public Set f14806q;

    /* renamed from: r  reason: collision with root package name */
    public CancellableContinuation f14807r;

    /* renamed from: s  reason: collision with root package name */
    public int f14808s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f14809t;

    /* renamed from: u  reason: collision with root package name */
    public RecomposerErrorState f14810u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f14811v;

    /* renamed from: w  reason: collision with root package name */
    public final MutableStateFlow f14812w = StateFlowKt.a(State.Inactive);

    /* renamed from: x  reason: collision with root package name */
    public final SnapshotThreadLocal f14813x = new SnapshotThreadLocal();

    /* renamed from: y  reason: collision with root package name */
    public final CompletableJob f14814y;

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineContext f14815z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public final void c(androidx.compose.runtime.Recomposer.RecomposerInfoImpl r4) {
            /*
                r3 = this;
            L_0x0000:
                kotlinx.coroutines.flow.MutableStateFlow r0 = androidx.compose.runtime.Recomposer.E
                java.lang.Object r0 = r0.getValue()
                androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet r0 = (androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet) r0
                androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet r1 = r0.add(r4)
                if (r0 == r1) goto L_0x001a
                kotlinx.coroutines.flow.MutableStateFlow r2 = androidx.compose.runtime.Recomposer.E
                boolean r0 = r2.g(r0, r1)
                if (r0 == 0) goto L_0x0000
            L_0x001a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.Companion.c(androidx.compose.runtime.Recomposer$RecomposerInfoImpl):void");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public final void d(androidx.compose.runtime.Recomposer.RecomposerInfoImpl r4) {
            /*
                r3 = this;
            L_0x0000:
                kotlinx.coroutines.flow.MutableStateFlow r0 = androidx.compose.runtime.Recomposer.E
                java.lang.Object r0 = r0.getValue()
                androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet r0 = (androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet) r0
                androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet r1 = r0.remove(r4)
                if (r0 == r1) goto L_0x001a
                kotlinx.coroutines.flow.MutableStateFlow r2 = androidx.compose.runtime.Recomposer.E
                boolean r0 = r2.g(r0, r1)
                if (r0 == 0) goto L_0x0000
            L_0x001a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.Companion.d(androidx.compose.runtime.Recomposer$RecomposerInfoImpl):void");
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class HotReloadable {
    }

    @Metadata
    public static final class RecomposerErrorState implements RecomposerErrorInfo {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f14816a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f14817b;

        public RecomposerErrorState(boolean z2, Throwable th) {
            this.f14816a = z2;
            this.f14817b = th;
        }

        public Throwable a() {
            return this.f14817b;
        }
    }

    @Metadata
    public final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }
    }

    @Metadata
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork;

        static {
            State[] d2;
            G = EnumEntriesKt.a(d2);
        }
    }

    public Recomposer(CoroutineContext coroutineContext) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new C0308r(this));
        this.f14791b = broadcastFrameClock;
        CompletableJob a2 = JobKt.a((Job) coroutineContext.d(Job.f41415x));
        a2.S(new s(this));
        this.f14814y = a2;
        this.f14815z = coroutineContext.y(broadcastFrameClock).y(a2);
        this.f14789B = new RecomposerInfoImpl();
    }

    public static final void J0(List list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.f14792c) {
            try {
                Iterator it = recomposer.f14800k.iterator();
                while (it.hasNext()) {
                    MovableContentStateReference movableContentStateReference = (MovableContentStateReference) it.next();
                    if (Intrinsics.d(movableContentStateReference.b(), controlledComposition)) {
                        list.add(movableContentStateReference);
                        it.remove();
                    }
                }
                Unit unit = Unit.f40552a;
            } finally {
            }
        }
    }

    public static final Unit M0(MutableScatterSet mutableScatterSet, ControlledComposition controlledComposition) {
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
                            controlledComposition.u(objArr[(i2 << 3) + i4]);
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
        return Unit.f40552a;
    }

    public static /* synthetic */ void O0(Recomposer recomposer, Throwable th, ControlledComposition controlledComposition, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            controlledComposition = null;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        recomposer.N0(th, controlledComposition, z2);
    }

    public static final Unit Q0(ControlledComposition controlledComposition, Object obj) {
        controlledComposition.b(obj);
        return Unit.f40552a;
    }

    public static final CancellableContinuation Z0(Recomposer recomposer, List list, List list2, ProduceFrameSignal produceFrameSignal, long j2) {
        int i2;
        CancellableContinuation s0;
        if (recomposer.y0()) {
            Trace trace = Trace.f15156a;
            Object a2 = trace.a("Recomposer:animation");
            try {
                recomposer.f14791b.s(j2);
                Snapshot.f15255e.n();
                Unit unit = Unit.f40552a;
                trace.b(a2);
            } catch (Throwable th) {
                Trace.f15156a.b(a2);
                throw th;
            }
        }
        Object a3 = Trace.f15156a.a("Recomposer:recompose");
        try {
            recomposer.S0();
            synchronized (recomposer.f14792c) {
                List list3 = recomposer.f14799j;
                int size = list3.size();
                for (int i3 = 0; i3 < size; i3++) {
                    list2.add((ControlledComposition) list3.get(i3));
                }
                recomposer.f14799j.clear();
                MutableVector mutableVector = recomposer.f14798i;
                Object[] objArr = mutableVector.f15005z;
                int p2 = mutableVector.p();
                for (int i4 = 0; i4 < p2; i4++) {
                    list.add((ControlledComposition) objArr[i4]);
                }
                recomposer.f14798i.l();
                produceFrameSignal.e();
                Unit unit2 = Unit.f40552a;
            }
            MutableScatterSet mutableScatterSet = new MutableScatterSet(0, 1, (DefaultConstructorMarker) null);
            int size2 = list.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ControlledComposition L0 = recomposer.L0((ControlledComposition) list.get(i5), mutableScatterSet);
                if (L0 != null) {
                    list2.add(L0);
                }
            }
            list.clear();
            if (!list2.isEmpty()) {
                recomposer.f14790a++;
            }
            int size3 = list2.size();
            for (i2 = 0; i2 < size3; i2++) {
                ((ControlledComposition) list2.get(i2)).o();
            }
            list2.clear();
            synchronized (recomposer.f14792c) {
                s0 = recomposer.s0();
            }
            Trace.f15156a.b(a3);
            return s0;
        } catch (Throwable th2) {
            Trace.f15156a.b(a3);
            throw th2;
        }
    }

    public static final Unit d1(ControlledComposition controlledComposition, MutableScatterSet mutableScatterSet, Object obj) {
        controlledComposition.u(obj);
        if (mutableScatterSet != null) {
            mutableScatterSet.h(obj);
        }
        return Unit.f40552a;
    }

    public static final Unit n0(Recomposer recomposer) {
        CancellableContinuation s0;
        synchronized (recomposer.f14792c) {
            s0 = recomposer.s0();
            if (((State) recomposer.f14812w.getValue()).compareTo(State.ShuttingDown) <= 0) {
                throw ExceptionsKt.a("Recomposer shutdown; frame clock awaiter will never resume", recomposer.f14794e);
            }
        }
        if (s0 != null) {
            Result.Companion companion = Result.f40519A;
            s0.q(Result.b(Unit.f40552a));
        }
        return Unit.f40552a;
    }

    public static final void r0(Recomposer recomposer, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        List f2 = movableContentStateReference2.f();
        if (f2 != null) {
            int size = f2.size();
            for (int i2 = 0; i2 < size; i2++) {
                MovableContentStateReference movableContentStateReference3 = (MovableContentStateReference) f2.get(i2);
                recomposer.f14802m.b(movableContentStateReference3.c(), new NestedMovableContent(movableContentStateReference3, movableContentStateReference));
                r0(recomposer, movableContentStateReference, movableContentStateReference3);
            }
        }
    }

    public static final Unit u0(Recomposer recomposer, Throwable th) {
        CancellableContinuation cancellableContinuation;
        CancellableContinuation cancellableContinuation2;
        CancellationException a2 = ExceptionsKt.a("Recomposer effect job completed", th);
        synchronized (recomposer.f14792c) {
            try {
                Job job = recomposer.f14793d;
                cancellableContinuation = null;
                if (job != null) {
                    recomposer.f14812w.setValue(State.ShuttingDown);
                    if (!recomposer.f14809t) {
                        job.c(a2);
                    } else {
                        cancellableContinuation2 = recomposer.f14807r;
                        if (cancellableContinuation2 != null) {
                            recomposer.f14807r = null;
                            job.S(new w(recomposer, th));
                            cancellableContinuation = cancellableContinuation2;
                        }
                    }
                    cancellableContinuation2 = null;
                    recomposer.f14807r = null;
                    job.S(new w(recomposer, th));
                    cancellableContinuation = cancellableContinuation2;
                } else {
                    recomposer.f14794e = a2;
                    recomposer.f14812w.setValue(State.ShutDown);
                    Unit unit = Unit.f40552a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cancellableContinuation != null) {
            Result.Companion companion = Result.f40519A;
            cancellableContinuation.q(Result.b(Unit.f40552a));
        }
        return Unit.f40552a;
    }

    public static final Unit v0(Recomposer recomposer, Throwable th, Throwable th2) {
        synchronized (recomposer.f14792c) {
            if (th == null) {
                th = null;
            } else if (th2 != null) {
                try {
                    if (th2 instanceof CancellationException) {
                        th2 = null;
                    }
                    if (th2 != null) {
                        kotlin.ExceptionsKt.a(th, th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            recomposer.f14794e = th;
            recomposer.f14812w.setValue(State.ShutDown);
        }
        return Unit.f40552a;
    }

    public final boolean A0() {
        return !this.f14799j.isEmpty() || z0();
    }

    public final boolean B0() {
        return this.f14798i.p() != 0 || z0() || MultiValueMap.k(this.f14801l);
    }

    public final boolean C0() {
        boolean z2;
        synchronized (this.f14792c) {
            if (!this.f14797h.e()) {
                if (this.f14798i.p() == 0) {
                    if (!z0()) {
                        z2 = false;
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }

    public final boolean D0() {
        boolean z2;
        synchronized (this.f14792c) {
            z2 = this.f14809t;
        }
        if (z2) {
            for (Job b2 : this.f14814y.C()) {
                if (b2.b()) {
                }
            }
            return false;
        }
        return true;
    }

    public final Object E0(Continuation continuation) {
        Object E2 = FlowKt.E(x0(), new Recomposer$join$2((Continuation) null), continuation);
        return E2 == IntrinsicsKt.f() ? E2 : Unit.f40552a;
    }

    public final List F0() {
        List G0;
        synchronized (this.f14792c) {
            G0 = G0();
        }
        return G0;
    }

    public final List G0() {
        List list = this.f14796g;
        if (list != null) {
            return list;
        }
        List list2 = this.f14795f;
        List m2 = list2.isEmpty() ? CollectionsKt.m() : new ArrayList(list2);
        this.f14796g = m2;
        return m2;
    }

    public final void H0() {
        synchronized (this.f14792c) {
            this.f14811v = true;
            Unit unit = Unit.f40552a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r0.isEmpty() != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        K0(r0, (androidx.collection.MutableScatterSet) null);
        J0(r0, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r0 = new java.util.ArrayList();
        J0(r0, r5, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I0(androidx.compose.runtime.ControlledComposition r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f14792c
            monitor-enter(r0)
            java.util.List r1 = r5.f14800k     // Catch:{ all -> 0x0039 }
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0039 }
            int r2 = r2.size()     // Catch:{ all -> 0x0039 }
            r3 = 0
        L_0x000d:
            if (r3 >= r2) goto L_0x003e
            java.lang.Object r4 = r1.get(r3)     // Catch:{ all -> 0x0039 }
            androidx.compose.runtime.MovableContentStateReference r4 = (androidx.compose.runtime.MovableContentStateReference) r4     // Catch:{ all -> 0x0039 }
            androidx.compose.runtime.ControlledComposition r4 = r4.b()     // Catch:{ all -> 0x0039 }
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r6)     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x003b
            kotlin.Unit r1 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            J0(r0, r5, r6)
        L_0x002a:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0038
            r1 = 0
            r5.K0(r0, r1)
            J0(r0, r5, r6)
            goto L_0x002a
        L_0x0038:
            return
        L_0x0039:
            r6 = move-exception
            goto L_0x0040
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x003e:
            monitor-exit(r0)
            return
        L_0x0040:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.I0(androidx.compose.runtime.ControlledComposition):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0147, code lost:
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014c, code lost:
        if (r4 >= r3) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0158, code lost:
        if (((kotlin.Pair) r10.get(r4)).f() == null) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015a, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015d, code lost:
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016b, code lost:
        if (r9 >= r4) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016d, code lost:
        r11 = (kotlin.Pair) r10.get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0177, code lost:
        if (r11.f() != null) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0179, code lost:
        r11 = (androidx.compose.runtime.MovableContentStateReference) r11.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0182, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0183, code lost:
        if (r11 == null) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0185, code lost:
        r3.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0188, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018b, code lost:
        r4 = r1.f14792c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018d, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        kotlin.collections.CollectionsKt.B(r1.f14800k, r3);
        r3 = kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0198, code lost:
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a6, code lost:
        if (r9 >= r4) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a8, code lost:
        r11 = r10.get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b3, code lost:
        if (((kotlin.Pair) r11).f() == null) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b5, code lost:
        r3.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b8, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bb, code lost:
        r10 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List K0(java.util.List r17, androidx.collection.MutableScatterSet r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.util.HashMap r2 = new java.util.HashMap
            int r3 = r17.size()
            r2.<init>(r3)
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r5 = 0
        L_0x0015:
            if (r5 >= r3) goto L_0x0038
            java.lang.Object r6 = r0.get(r5)
            r7 = r6
            androidx.compose.runtime.MovableContentStateReference r7 = (androidx.compose.runtime.MovableContentStateReference) r7
            androidx.compose.runtime.ControlledComposition r7 = r7.b()
            java.lang.Object r8 = r2.get(r7)
            if (r8 != 0) goto L_0x0030
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r2.put(r7, r8)
        L_0x0030:
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.add(r6)
            int r5 = r5 + 1
            goto L_0x0015
        L_0x0038:
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0040:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01d9
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            androidx.compose.runtime.ControlledComposition r5 = (androidx.compose.runtime.ControlledComposition) r5
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            boolean r6 = r5.q()
            if (r6 == 0) goto L_0x0063
            java.lang.String r6 = "Check failed"
            androidx.compose.runtime.ComposerKt.v(r6)
        L_0x0063:
            androidx.compose.runtime.snapshots.Snapshot$Companion r6 = androidx.compose.runtime.snapshots.Snapshot.f15255e
            kotlin.jvm.functions.Function1 r7 = r1.P0(r5)
            r8 = r18
            kotlin.jvm.functions.Function1 r9 = r1.c1(r5, r8)
            androidx.compose.runtime.snapshots.MutableSnapshot r6 = r6.o(r7, r9)
            androidx.compose.runtime.snapshots.Snapshot r7 = r6.l()     // Catch:{ all -> 0x01cd }
            java.lang.Object r9 = r1.f14792c     // Catch:{ all -> 0x0180 }
            monitor-enter(r9)     // Catch:{ all -> 0x0180 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00a8 }
            int r11 = r3.size()     // Catch:{ all -> 0x00a8 }
            r10.<init>(r11)     // Catch:{ all -> 0x00a8 }
            r11 = r3
            java.util.Collection r11 = (java.util.Collection) r11     // Catch:{ all -> 0x00a8 }
            int r11 = r11.size()     // Catch:{ all -> 0x00a8 }
            r12 = 0
        L_0x008b:
            if (r12 >= r11) goto L_0x00b5
            java.lang.Object r13 = r3.get(r12)     // Catch:{ all -> 0x00a8 }
            androidx.compose.runtime.MovableContentStateReference r13 = (androidx.compose.runtime.MovableContentStateReference) r13     // Catch:{ all -> 0x00a8 }
            androidx.collection.MutableScatterMap r14 = r1.f14801l     // Catch:{ all -> 0x00a8 }
            androidx.compose.runtime.MovableContent r15 = r13.c()     // Catch:{ all -> 0x00a8 }
            java.lang.Object r14 = androidx.compose.runtime.collection.MultiValueMap.m(r14, r15)     // Catch:{ all -> 0x00a8 }
            r15 = r14
            androidx.compose.runtime.MovableContentStateReference r15 = (androidx.compose.runtime.MovableContentStateReference) r15     // Catch:{ all -> 0x00a8 }
            if (r15 == 0) goto L_0x00ab
            androidx.compose.runtime.NestedContentMap r4 = r1.f14802m     // Catch:{ all -> 0x00a8 }
            r4.f(r15)     // Catch:{ all -> 0x00a8 }
            goto L_0x00ab
        L_0x00a8:
            r0 = move-exception
            goto L_0x01cf
        L_0x00ab:
            kotlin.Pair r4 = kotlin.TuplesKt.a(r13, r14)     // Catch:{ all -> 0x00a8 }
            r10.add(r4)     // Catch:{ all -> 0x00a8 }
            int r12 = r12 + 1
            goto L_0x008b
        L_0x00b5:
            boolean r3 = androidx.compose.runtime.ComposeRuntimeFlags.f14564b     // Catch:{ all -> 0x00a8 }
            if (r3 == 0) goto L_0x0130
            int r3 = r10.size()     // Catch:{ all -> 0x00a8 }
            r4 = 0
        L_0x00be:
            if (r4 >= r3) goto L_0x0130
            java.lang.Object r11 = r10.get(r4)     // Catch:{ all -> 0x00a8 }
            kotlin.Pair r11 = (kotlin.Pair) r11     // Catch:{ all -> 0x00a8 }
            java.lang.Object r12 = r11.f()     // Catch:{ all -> 0x00a8 }
            if (r12 != 0) goto L_0x012d
            androidx.compose.runtime.NestedContentMap r12 = r1.f14802m     // Catch:{ all -> 0x00a8 }
            java.lang.Object r11 = r11.e()     // Catch:{ all -> 0x00a8 }
            androidx.compose.runtime.MovableContentStateReference r11 = (androidx.compose.runtime.MovableContentStateReference) r11     // Catch:{ all -> 0x00a8 }
            androidx.compose.runtime.MovableContent r11 = r11.c()     // Catch:{ all -> 0x00a8 }
            boolean r11 = r12.d(r11)     // Catch:{ all -> 0x00a8 }
            if (r11 == 0) goto L_0x012d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00a8 }
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.x(r10, r4)     // Catch:{ all -> 0x00a8 }
            r3.<init>(r4)     // Catch:{ all -> 0x00a8 }
            java.util.Iterator r4 = r10.iterator()     // Catch:{ all -> 0x00a8 }
        L_0x00ed:
            boolean r10 = r4.hasNext()     // Catch:{ all -> 0x00a8 }
            if (r10 == 0) goto L_0x012b
            java.lang.Object r10 = r4.next()     // Catch:{ all -> 0x00a8 }
            kotlin.Pair r10 = (kotlin.Pair) r10     // Catch:{ all -> 0x00a8 }
            java.lang.Object r11 = r10.f()     // Catch:{ all -> 0x00a8 }
            if (r11 != 0) goto L_0x0127
            androidx.compose.runtime.NestedContentMap r11 = r1.f14802m     // Catch:{ all -> 0x00a8 }
            java.lang.Object r12 = r10.e()     // Catch:{ all -> 0x00a8 }
            androidx.compose.runtime.MovableContentStateReference r12 = (androidx.compose.runtime.MovableContentStateReference) r12     // Catch:{ all -> 0x00a8 }
            androidx.compose.runtime.MovableContent r12 = r12.c()     // Catch:{ all -> 0x00a8 }
            androidx.compose.runtime.NestedMovableContent r11 = r11.e(r12)     // Catch:{ all -> 0x00a8 }
            if (r11 != 0) goto L_0x0112
            goto L_0x0127
        L_0x0112:
            androidx.compose.runtime.MovableContentStateReference r12 = r11.b()     // Catch:{ all -> 0x00a8 }
            androidx.compose.runtime.MovableContentStateReference r11 = r11.a()     // Catch:{ all -> 0x00a8 }
            androidx.collection.MutableScatterMap r13 = r1.f14804o     // Catch:{ all -> 0x00a8 }
            androidx.compose.runtime.collection.MultiValueMap.a(r13, r11, r12)     // Catch:{ all -> 0x00a8 }
            java.lang.Object r10 = r10.e()     // Catch:{ all -> 0x00a8 }
            kotlin.Pair r10 = kotlin.TuplesKt.a(r10, r12)     // Catch:{ all -> 0x00a8 }
        L_0x0127:
            r3.add(r10)     // Catch:{ all -> 0x00a8 }
            goto L_0x00ed
        L_0x012b:
            r10 = r3
            goto L_0x0130
        L_0x012d:
            int r4 = r4 + 1
            goto L_0x00be
        L_0x0130:
            monitor-exit(r9)     // Catch:{ all -> 0x0180 }
            int r3 = r10.size()     // Catch:{ all -> 0x0180 }
            r4 = 0
        L_0x0136:
            if (r4 >= r3) goto L_0x01c0
            java.lang.Object r9 = r10.get(r4)     // Catch:{ all -> 0x0180 }
            kotlin.Pair r9 = (kotlin.Pair) r9     // Catch:{ all -> 0x0180 }
            java.lang.Object r9 = r9.f()     // Catch:{ all -> 0x0180 }
            if (r9 != 0) goto L_0x0147
            int r4 = r4 + 1
            goto L_0x0136
        L_0x0147:
            int r3 = r10.size()     // Catch:{ all -> 0x0180 }
            r4 = 0
        L_0x014c:
            if (r4 >= r3) goto L_0x01c0
            java.lang.Object r9 = r10.get(r4)     // Catch:{ all -> 0x0180 }
            kotlin.Pair r9 = (kotlin.Pair) r9     // Catch:{ all -> 0x0180 }
            java.lang.Object r9 = r9.f()     // Catch:{ all -> 0x0180 }
            if (r9 == 0) goto L_0x015d
            int r4 = r4 + 1
            goto L_0x014c
        L_0x015d:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0180 }
            int r4 = r10.size()     // Catch:{ all -> 0x0180 }
            r3.<init>(r4)     // Catch:{ all -> 0x0180 }
            int r4 = r10.size()     // Catch:{ all -> 0x0180 }
            r9 = 0
        L_0x016b:
            if (r9 >= r4) goto L_0x018b
            java.lang.Object r11 = r10.get(r9)     // Catch:{ all -> 0x0180 }
            kotlin.Pair r11 = (kotlin.Pair) r11     // Catch:{ all -> 0x0180 }
            java.lang.Object r12 = r11.f()     // Catch:{ all -> 0x0180 }
            if (r12 != 0) goto L_0x0182
            java.lang.Object r11 = r11.e()     // Catch:{ all -> 0x0180 }
            androidx.compose.runtime.MovableContentStateReference r11 = (androidx.compose.runtime.MovableContentStateReference) r11     // Catch:{ all -> 0x0180 }
            goto L_0x0183
        L_0x0180:
            r0 = move-exception
            goto L_0x01d1
        L_0x0182:
            r11 = 0
        L_0x0183:
            if (r11 == 0) goto L_0x0188
            r3.add(r11)     // Catch:{ all -> 0x0180 }
        L_0x0188:
            int r9 = r9 + 1
            goto L_0x016b
        L_0x018b:
            java.lang.Object r4 = r1.f14792c     // Catch:{ all -> 0x0180 }
            monitor-enter(r4)     // Catch:{ all -> 0x0180 }
            java.util.List r9 = r1.f14800k     // Catch:{ all -> 0x01bd }
            java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ all -> 0x01bd }
            kotlin.collections.CollectionsKt.B(r9, r3)     // Catch:{ all -> 0x01bd }
            kotlin.Unit r3 = kotlin.Unit.f40552a     // Catch:{ all -> 0x01bd }
            monitor-exit(r4)     // Catch:{ all -> 0x0180 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0180 }
            int r4 = r10.size()     // Catch:{ all -> 0x0180 }
            r3.<init>(r4)     // Catch:{ all -> 0x0180 }
            int r4 = r10.size()     // Catch:{ all -> 0x0180 }
            r9 = 0
        L_0x01a6:
            if (r9 >= r4) goto L_0x01bb
            java.lang.Object r11 = r10.get(r9)     // Catch:{ all -> 0x0180 }
            r12 = r11
            kotlin.Pair r12 = (kotlin.Pair) r12     // Catch:{ all -> 0x0180 }
            java.lang.Object r12 = r12.f()     // Catch:{ all -> 0x0180 }
            if (r12 == 0) goto L_0x01b8
            r3.add(r11)     // Catch:{ all -> 0x0180 }
        L_0x01b8:
            int r9 = r9 + 1
            goto L_0x01a6
        L_0x01bb:
            r10 = r3
            goto L_0x01c0
        L_0x01bd:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0180 }
            throw r0     // Catch:{ all -> 0x0180 }
        L_0x01c0:
            r5.t(r10)     // Catch:{ all -> 0x0180 }
            kotlin.Unit r3 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0180 }
            r6.s(r7)     // Catch:{ all -> 0x01cd }
            r1.l0(r6)
            goto L_0x0040
        L_0x01cd:
            r0 = move-exception
            goto L_0x01d5
        L_0x01cf:
            monitor-exit(r9)     // Catch:{ all -> 0x0180 }
            throw r0     // Catch:{ all -> 0x0180 }
        L_0x01d1:
            r6.s(r7)     // Catch:{ all -> 0x01cd }
            throw r0     // Catch:{ all -> 0x01cd }
        L_0x01d5:
            r1.l0(r6)
            throw r0
        L_0x01d9:
            java.util.Set r0 = r2.keySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.M0(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.K0(java.util.List, androidx.collection.MutableScatterSet):java.util.List");
    }

    public final ControlledComposition L0(ControlledComposition controlledComposition, MutableScatterSet mutableScatterSet) {
        Set set;
        Snapshot l2;
        if (controlledComposition.q() || controlledComposition.i() || ((set = this.f14806q) != null && set.contains(controlledComposition))) {
            return null;
        }
        MutableSnapshot o2 = Snapshot.f15255e.o(P0(controlledComposition), c1(controlledComposition, mutableScatterSet));
        try {
            l2 = o2.l();
            if (mutableScatterSet != null) {
                if (mutableScatterSet.e()) {
                    controlledComposition.m(new v(mutableScatterSet, controlledComposition));
                }
            }
            boolean z2 = controlledComposition.z();
            o2.s(l2);
            l0(o2);
            if (z2) {
                return controlledComposition;
            }
            return null;
        } catch (Throwable th) {
            l0(o2);
            throw th;
        }
    }

    public final void N0(Throwable th, ControlledComposition controlledComposition, boolean z2) {
        if (!((Boolean) F.get()).booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.f14792c) {
                RecomposerErrorState recomposerErrorState = this.f14810u;
                if (recomposerErrorState == null) {
                    this.f14810u = new RecomposerErrorState(false, th);
                    Unit unit = Unit.f40552a;
                } else {
                    throw recomposerErrorState.a();
                }
            }
            throw th;
        }
        synchronized (this.f14792c) {
            try {
                Utils_androidKt.a("Error was captured in composition while live edit was enabled.", th);
                this.f14799j.clear();
                this.f14798i.l();
                this.f14797h = new MutableScatterSet(0, 1, (DefaultConstructorMarker) null);
                this.f14800k.clear();
                MultiValueMap.c(this.f14801l);
                this.f14803n.k();
                this.f14810u = new RecomposerErrorState(z2, th);
                if (controlledComposition != null) {
                    T0(controlledComposition);
                }
                s0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Function1 P0(ControlledComposition controlledComposition) {
        return new q(controlledComposition);
    }

    public final Object R0(Function3 function3, Continuation continuation) {
        Object g2 = BuildersKt.g(this.f14791b, new Recomposer$recompositionRunner$2(this, function3, MonotonicFrameClockKt.a(continuation.f()), (Continuation) null), continuation);
        return g2 == IntrinsicsKt.f() ? g2 : Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r6 >= r0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        ((androidx.compose.runtime.ControlledComposition) r1.get(r6)).n(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (((androidx.compose.runtime.Recomposer.State) r7.f14812w.getValue()).compareTo(androidx.compose.runtime.Recomposer.State.f14819A) <= 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        r0 = r7.f14792c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (s0() != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        r1 = B0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        throw new java.lang.IllegalStateException("called outside of runRecomposeAndApplyChanges");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
        monitor-enter(r7.f14792c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r7.f14797h.j(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0078, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean S0() {
        /*
            r7 = this;
            kotlin.collections.CollectionsKt.m()
            java.lang.Object r0 = r7.f14792c
            monitor-enter(r0)
            androidx.collection.MutableScatterSet r1 = r7.f14797h     // Catch:{ all -> 0x0014 }
            boolean r1 = r1.d()     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x0016
            boolean r1 = r7.B0()     // Catch:{ all -> 0x0014 }
            monitor-exit(r0)
            return r1
        L_0x0014:
            r1 = move-exception
            goto L_0x007c
        L_0x0016:
            java.util.List r1 = r7.G0()     // Catch:{ all -> 0x0014 }
            androidx.collection.MutableScatterSet r2 = r7.f14797h     // Catch:{ all -> 0x0014 }
            java.util.Set r2 = androidx.compose.runtime.collection.ScatterSetWrapperKt.a(r2)     // Catch:{ all -> 0x0014 }
            androidx.collection.MutableScatterSet r3 = new androidx.collection.MutableScatterSet     // Catch:{ all -> 0x0014 }
            r4 = 0
            r5 = 1
            r6 = 0
            r3.<init>(r6, r5, r4)     // Catch:{ all -> 0x0014 }
            r7.f14797h = r3     // Catch:{ all -> 0x0014 }
            monitor-exit(r0)
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0050 }
            int r0 = r0.size()     // Catch:{ all -> 0x0050 }
        L_0x0032:
            if (r6 >= r0) goto L_0x0052
            java.lang.Object r3 = r1.get(r6)     // Catch:{ all -> 0x0050 }
            androidx.compose.runtime.ControlledComposition r3 = (androidx.compose.runtime.ControlledComposition) r3     // Catch:{ all -> 0x0050 }
            r3.n(r2)     // Catch:{ all -> 0x0050 }
            kotlinx.coroutines.flow.MutableStateFlow r3 = r7.f14812w     // Catch:{ all -> 0x0050 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0050 }
            androidx.compose.runtime.Recomposer$State r3 = (androidx.compose.runtime.Recomposer.State) r3     // Catch:{ all -> 0x0050 }
            androidx.compose.runtime.Recomposer$State r4 = androidx.compose.runtime.Recomposer.State.ShuttingDown     // Catch:{ all -> 0x0050 }
            int r3 = r3.compareTo(r4)     // Catch:{ all -> 0x0050 }
            if (r3 <= 0) goto L_0x0052
            int r6 = r6 + 1
            goto L_0x0032
        L_0x0050:
            r0 = move-exception
            goto L_0x006d
        L_0x0052:
            java.lang.Object r0 = r7.f14792c
            monitor-enter(r0)
            kotlinx.coroutines.CancellableContinuation r1 = r7.s0()     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x0063
            boolean r1 = r7.B0()     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)
            return r1
        L_0x0061:
            r1 = move-exception
            goto L_0x006b
        L_0x0063:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "called outside of runRecomposeAndApplyChanges"
            r1.<init>(r2)     // Catch:{ all -> 0x0061 }
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x006b:
            monitor-exit(r0)
            throw r1
        L_0x006d:
            java.lang.Object r1 = r7.f14792c
            monitor-enter(r1)
            androidx.collection.MutableScatterSet r3 = r7.f14797h     // Catch:{ all -> 0x0079 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x0079 }
            r3.j(r2)     // Catch:{ all -> 0x0079 }
            monitor-exit(r1)
            throw r0
        L_0x0079:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x007c:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.S0():boolean");
    }

    public final void T0(ControlledComposition controlledComposition) {
        List list = this.f14805p;
        if (list == null) {
            list = new ArrayList();
            this.f14805p = list;
        }
        if (!list.contains(controlledComposition)) {
            list.add(controlledComposition);
        }
        W0(controlledComposition);
    }

    public final void U0(ControlledComposition controlledComposition) {
        MutableObjectList mutableObjectList = this.f14788A;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.f1937a;
            int i2 = mutableObjectList.f1938b;
            for (int i3 = 0; i3 < i2; i3++) {
                CompositionRegistrationObserver compositionRegistrationObserver = (CompositionRegistrationObserver) objArr[i3];
                if (controlledComposition instanceof ObservableComposition) {
                    compositionRegistrationObserver.a((ObservableComposition) controlledComposition);
                }
            }
        }
    }

    public final void V0(Job job) {
        synchronized (this.f14792c) {
            Throwable th = this.f14794e;
            if (th != null) {
                throw th;
            } else if (((State) this.f14812w.getValue()).compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            } else if (this.f14793d == null) {
                this.f14793d = job;
                s0();
            } else {
                throw new IllegalStateException("Recomposer already running");
            }
        }
    }

    public final void W0(ControlledComposition controlledComposition) {
        if (this.f14795f.remove(controlledComposition)) {
            this.f14796g = null;
            b1(controlledComposition);
        }
    }

    public final void X0() {
        CancellableContinuation cancellableContinuation;
        synchronized (this.f14792c) {
            if (this.f14811v) {
                this.f14811v = false;
                cancellableContinuation = s0();
            } else {
                cancellableContinuation = null;
            }
        }
        if (cancellableContinuation != null) {
            Result.Companion companion = Result.f40519A;
            cancellableContinuation.q(Result.b(Unit.f40552a));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Y0(androidx.compose.runtime.MonotonicFrameClock r7, androidx.compose.runtime.ProduceFrameSignal r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.runtime.Recomposer$runFrameLoop$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = (androidx.compose.runtime.Recomposer$runFrameLoop$1) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.I = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = new androidx.compose.runtime.Recomposer$runFrameLoop$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.G
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.I
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x005c
            if (r2 == r4) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r7 = r0.F
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.E
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r2 = r0.D
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.C
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            kotlin.ResultKt.b(r9)
        L_0x003b:
            r9 = r8
            r8 = r2
            r2 = r7
            r7 = r5
            goto L_0x0069
        L_0x0040:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0048:
            java.lang.Object r7 = r0.F
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.E
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r2 = r0.D
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.C
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            kotlin.ResultKt.b(r9)
            goto L_0x0080
        L_0x005c:
            kotlin.ResultKt.b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0069:
            java.lang.Object r5 = r6.f14792c
            r0.C = r7
            r0.D = r8
            r0.E = r9
            r0.F = r2
            r0.I = r4
            java.lang.Object r5 = r8.c(r5, r0)
            if (r5 != r1) goto L_0x007c
            return r1
        L_0x007c:
            r5 = r7
            r7 = r2
            r2 = r8
            r8 = r9
        L_0x0080:
            androidx.compose.runtime.u r9 = new androidx.compose.runtime.u
            r9.<init>(r6, r8, r7, r2)
            r0.C = r5
            r0.D = r2
            r0.E = r8
            r0.F = r7
            r0.I = r3
            java.lang.Object r9 = r5.Q(r9, r0)
            if (r9 != r1) goto L_0x003b
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.Y0(androidx.compose.runtime.MonotonicFrameClock, androidx.compose.runtime.ProduceFrameSignal, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void a(ControlledComposition controlledComposition, Function2 function2) {
        boolean z2;
        MutableSnapshot o2;
        Snapshot l2;
        boolean q2 = controlledComposition.q();
        synchronized (this.f14792c) {
            if (((State) this.f14812w.getValue()).compareTo(State.ShuttingDown) > 0) {
                boolean contains = G0().contains(controlledComposition);
                z2 = !contains;
                if (!contains) {
                    k0(controlledComposition);
                }
            } else {
                z2 = true;
            }
        }
        try {
            Snapshot.Companion companion = Snapshot.f15255e;
            o2 = companion.o(P0(controlledComposition), c1(controlledComposition, (MutableScatterSet) null));
            l2 = o2.l();
            controlledComposition.e(function2);
            Unit unit = Unit.f40552a;
            o2.s(l2);
            l0(o2);
            if (!q2) {
                companion.g();
            }
            try {
                I0(controlledComposition);
                try {
                    controlledComposition.o();
                    controlledComposition.h();
                    if (!q2) {
                        companion.g();
                    }
                } catch (Throwable th) {
                    O0(this, th, (ControlledComposition) null, false, 6, (Object) null);
                }
            } catch (Throwable th2) {
                N0(th2, controlledComposition, true);
            }
        } catch (Throwable th3) {
            N0(th3, controlledComposition, true);
            if (z2) {
                synchronized (this.f14792c) {
                    W0(controlledComposition);
                    Unit unit2 = Unit.f40552a;
                }
            }
        }
    }

    public final Object a1(Continuation continuation) {
        Object R0 = R0(new Recomposer$runRecomposeAndApplyChanges$2(this, (Continuation) null), continuation);
        return R0 == IntrinsicsKt.f() ? R0 : Unit.f40552a;
    }

    public void b(MovableContentStateReference movableContentStateReference) {
        CancellableContinuation s0;
        synchronized (this.f14792c) {
            try {
                MultiValueMap.a(this.f14801l, movableContentStateReference.c(), movableContentStateReference);
                if (movableContentStateReference.f() != null) {
                    r0(this, movableContentStateReference, movableContentStateReference);
                }
                s0 = s0();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (s0 != null) {
            Result.Companion companion = Result.f40519A;
            s0.q(Result.b(Unit.f40552a));
        }
    }

    public final void b1(ControlledComposition controlledComposition) {
        MutableObjectList mutableObjectList = this.f14788A;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.f1937a;
            int i2 = mutableObjectList.f1938b;
            for (int i3 = 0; i3 < i2; i3++) {
                CompositionRegistrationObserver compositionRegistrationObserver = (CompositionRegistrationObserver) objArr[i3];
                if (controlledComposition instanceof ObservableComposition) {
                    compositionRegistrationObserver.b((ObservableComposition) controlledComposition);
                }
            }
        }
    }

    public final Function1 c1(ControlledComposition controlledComposition, MutableScatterSet mutableScatterSet) {
        return new t(controlledComposition, mutableScatterSet);
    }

    public boolean d() {
        return ((Boolean) F.get()).booleanValue();
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return ComposerKt.E();
    }

    public long g() {
        return (long) 1000;
    }

    public Composition h() {
        return null;
    }

    public CoroutineContext j() {
        return this.f14815z;
    }

    public final void k0(ControlledComposition controlledComposition) {
        this.f14795f.add(controlledComposition);
        this.f14796g = null;
        U0(controlledComposition);
    }

    public CoroutineContext l() {
        return EmptyCoroutineContext.f40721z;
    }

    public final void l0(MutableSnapshot mutableSnapshot) {
        try {
            if (mutableSnapshot.E() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            mutableSnapshot.d();
        }
    }

    public void m(MovableContentStateReference movableContentStateReference) {
        CancellableContinuation s0;
        synchronized (this.f14792c) {
            this.f14800k.add(movableContentStateReference);
            s0 = s0();
        }
        if (s0 != null) {
            Result.Companion companion = Result.f40519A;
            s0.q(Result.b(Unit.f40552a));
        }
    }

    public final Object m0(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl;
        if (C0()) {
            return Unit.f40552a;
        }
        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl2.G();
        synchronized (this.f14792c) {
            if (C0()) {
                cancellableContinuationImpl = cancellableContinuationImpl2;
            } else {
                this.f14807r = cancellableContinuationImpl2;
                cancellableContinuationImpl = null;
            }
        }
        if (cancellableContinuationImpl != null) {
            Result.Companion companion = Result.f40519A;
            cancellableContinuationImpl.q(Result.b(Unit.f40552a));
        }
        Object A2 = cancellableContinuationImpl2.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
    }

    public void n(ControlledComposition controlledComposition) {
        CancellableContinuation cancellableContinuation;
        synchronized (this.f14792c) {
            if (!this.f14798i.m(controlledComposition)) {
                this.f14798i.d(controlledComposition);
                cancellableContinuation = s0();
            } else {
                cancellableContinuation = null;
            }
        }
        if (cancellableContinuation != null) {
            Result.Companion companion = Result.f40519A;
            cancellableContinuation.q(Result.b(Unit.f40552a));
        }
    }

    public void o(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState, Applier applier) {
        MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
        MovableContentState movableContentState2 = movableContentState;
        synchronized (this.f14792c) {
            try {
                this.f14803n.x(movableContentStateReference2, movableContentState2);
                ObjectList h2 = MultiValueMap.h(this.f14804o, movableContentStateReference2);
                if (h2.h()) {
                    ScatterMap e2 = movableContentState2.e(applier, h2);
                    Object[] objArr = e2.f1960b;
                    Object[] objArr2 = e2.f1961c;
                    long[] jArr = e2.f1959a;
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
                                        this.f14803n.x((MovableContentStateReference) objArr[i5], (MovableContentState) objArr2[i5]);
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
                }
                Unit unit = Unit.f40552a;
            } finally {
            }
        }
    }

    public final void o0() {
        synchronized (this.f14792c) {
            try {
                if (((State) this.f14812w.getValue()).compareTo(State.Idle) >= 0) {
                    this.f14812w.setValue(State.ShuttingDown);
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Job.DefaultImpls.a(this.f14814y, (CancellationException) null, 1, (Object) null);
    }

    public MovableContentState p(MovableContentStateReference movableContentStateReference) {
        MovableContentState movableContentState;
        synchronized (this.f14792c) {
            movableContentState = (MovableContentState) this.f14803n.u(movableContentStateReference);
        }
        return movableContentState;
    }

    public final void p0() {
        for (ControlledComposition b1 : G0()) {
            b1(b1);
        }
        this.f14795f.clear();
        this.f14796g = CollectionsKt.m();
    }

    public void q(Set set) {
    }

    public final void q0() {
        if (this.f14814y.a()) {
            synchronized (this.f14792c) {
                this.f14809t = true;
                Unit unit = Unit.f40552a;
            }
        }
    }

    public void s(RecomposeScopeImpl recomposeScopeImpl) {
        MutableScatterSet mutableScatterSet = (MutableScatterSet) this.f14813x.a();
        if (mutableScatterSet == null) {
            mutableScatterSet = ScatterSetKt.a();
            this.f14813x.b(mutableScatterSet);
        }
        mutableScatterSet.h(recomposeScopeImpl);
    }

    public final CancellableContinuation s0() {
        State state;
        if (((State) this.f14812w.getValue()).compareTo(State.ShuttingDown) <= 0) {
            p0();
            this.f14797h = new MutableScatterSet(0, 1, (DefaultConstructorMarker) null);
            this.f14798i.l();
            this.f14799j.clear();
            this.f14800k.clear();
            this.f14805p = null;
            CancellableContinuation cancellableContinuation = this.f14807r;
            if (cancellableContinuation != null) {
                CancellableContinuation.DefaultImpls.a(cancellableContinuation, (Throwable) null, 1, (Object) null);
            }
            this.f14807r = null;
            this.f14810u = null;
            return null;
        }
        if (this.f14810u != null) {
            state = State.Inactive;
        } else if (this.f14793d == null) {
            this.f14797h = new MutableScatterSet(0, 1, (DefaultConstructorMarker) null);
            this.f14798i.l();
            state = z0() ? State.InactivePendingWork : State.Inactive;
        } else {
            state = (this.f14798i.p() == 0 && !this.f14797h.e() && this.f14799j.isEmpty() && this.f14800k.isEmpty() && this.f14808s <= 0 && !z0() && !MultiValueMap.k(this.f14801l)) ? State.Idle : State.PendingWork;
        }
        this.f14812w.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        CancellableContinuation cancellableContinuation2 = this.f14807r;
        this.f14807r = null;
        return cancellableContinuation2;
    }

    public void t(ControlledComposition controlledComposition) {
        synchronized (this.f14792c) {
            try {
                Set set = this.f14806q;
                if (set == null) {
                    set = new LinkedHashSet();
                    this.f14806q = set;
                }
                set.add(controlledComposition);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t0() {
        int i2;
        MutableObjectList mutableObjectList;
        synchronized (this.f14792c) {
            try {
                if (MultiValueMap.k(this.f14801l)) {
                    ObjectList q2 = MultiValueMap.q(this.f14801l);
                    MultiValueMap.c(this.f14801l);
                    this.f14802m.c();
                    MultiValueMap.c(this.f14804o);
                    MutableObjectList mutableObjectList2 = new MutableObjectList(q2.e());
                    Object[] objArr = q2.f1937a;
                    int i3 = q2.f1938b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr[i4];
                        mutableObjectList2.n(TuplesKt.a(movableContentStateReference, this.f14803n.e(movableContentStateReference)));
                    }
                    this.f14803n.k();
                    mutableObjectList = mutableObjectList2;
                } else {
                    mutableObjectList = ObjectListKt.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = mutableObjectList.f1937a;
        int i5 = mutableObjectList.f1938b;
        for (i2 = 0; i2 < i5; i2++) {
            Pair pair = (Pair) objArr2[i2];
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.a();
            MovableContentState movableContentState = (MovableContentState) pair.b();
            if (movableContentState != null) {
                movableContentStateReference2.b().s(movableContentState);
            }
        }
    }

    public void w(ControlledComposition controlledComposition) {
        synchronized (this.f14792c) {
            W0(controlledComposition);
            this.f14798i.v(controlledComposition);
            this.f14799j.remove(controlledComposition);
            Unit unit = Unit.f40552a;
        }
    }

    public final long w0() {
        return this.f14790a;
    }

    public final StateFlow x0() {
        return this.f14812w;
    }

    public final boolean y0() {
        boolean z0;
        synchronized (this.f14792c) {
            z0 = z0();
        }
        return z0;
    }

    public final boolean z0() {
        return !this.f14811v && this.f14791b.q();
    }
}
