package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.System_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DerivedSnapshotState<T> extends StateObjectImpl implements DerivedState<T> {

    /* renamed from: A  reason: collision with root package name */
    public final Function0 f14645A;

    /* renamed from: B  reason: collision with root package name */
    public final SnapshotMutationPolicy f14646B;
    public ResultRecord C = new ResultRecord(SnapshotKt.M().i());

    @Metadata
    public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {

        /* renamed from: h  reason: collision with root package name */
        public static final Companion f14647h = new Companion((DefaultConstructorMarker) null);

        /* renamed from: i  reason: collision with root package name */
        public static final int f14648i = 8;

        /* renamed from: j  reason: collision with root package name */
        public static final Object f14649j = new Object();

        /* renamed from: c  reason: collision with root package name */
        public long f14650c;

        /* renamed from: d  reason: collision with root package name */
        public int f14651d;

        /* renamed from: e  reason: collision with root package name */
        public ObjectIntMap f14652e = ObjectIntMapKt.a();

        /* renamed from: f  reason: collision with root package name */
        public Object f14653f = f14649j;

        /* renamed from: g  reason: collision with root package name */
        public int f14654g;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Object a() {
                return ResultRecord.f14649j;
            }

            public Companion() {
            }
        }

        public ResultRecord(long j2) {
            super(j2);
        }

        public Object a() {
            return this.f14653f;
        }

        public ObjectIntMap b() {
            return this.f14652e;
        }

        public void c(StateRecord stateRecord) {
            Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            ResultRecord resultRecord = (ResultRecord) stateRecord;
            n(resultRecord.b());
            this.f14653f = resultRecord.f14653f;
            this.f14654g = resultRecord.f14654g;
        }

        public StateRecord d() {
            return e(SnapshotKt.M().i());
        }

        public StateRecord e(long j2) {
            return new ResultRecord(j2);
        }

        public final Object k() {
            return this.f14653f;
        }

        public final boolean l(DerivedState derivedState, Snapshot snapshot) {
            boolean z2;
            boolean z3;
            synchronized (SnapshotKt.O()) {
                z2 = true;
                z3 = (this.f14650c == snapshot.i() && this.f14651d == snapshot.j()) ? false : true;
            }
            if (this.f14653f == f14649j || (z3 && this.f14654g != m(derivedState, snapshot))) {
                z2 = false;
            }
            if (z2 && z3) {
                synchronized (SnapshotKt.O()) {
                    this.f14650c = snapshot.i();
                    this.f14651d = snapshot.j();
                    Unit unit = Unit.f40552a;
                }
            }
            return z2;
        }

        /* JADX INFO: finally extract failed */
        public final int m(DerivedState derivedState, Snapshot snapshot) {
            ObjectIntMap b2;
            int i2;
            int i3;
            DerivedState derivedState2 = derivedState;
            Snapshot snapshot2 = snapshot;
            synchronized (SnapshotKt.O()) {
                try {
                    b2 = b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            char c2 = 7;
            if (!b2.h()) {
                return 7;
            }
            MutableVector c3 = SnapshotStateKt.c();
            Object[] objArr = c3.f15005z;
            int p2 = c3.p();
            for (int i4 = 0; i4 < p2; i4++) {
                ((DerivedStateObserver) objArr[i4]).b(derivedState2);
            }
            try {
                Object[] objArr2 = b2.f1932b;
                int[] iArr = b2.f1933c;
                long[] jArr = b2.f1931a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 7;
                    int i6 = 0;
                    while (true) {
                        long j2 = jArr[i6];
                        if ((((~j2) << c2) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                            int i7 = 8;
                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j2 & 255) < 128) {
                                    int i10 = (i6 << 3) + i9;
                                    StateObject stateObject = (StateObject) objArr2[i10];
                                    if (iArr[i10] == 1) {
                                        StateRecord w2 = stateObject instanceof DerivedSnapshotState ? ((DerivedSnapshotState) stateObject).w(snapshot2) : SnapshotKt.L(stateObject.h(), snapshot2);
                                        i5 = (((i5 * 31) + System_jvmKt.a(w2)) * 31) + Long.hashCode(w2.g());
                                    }
                                    i3 = 8;
                                } else {
                                    i3 = i7;
                                }
                                j2 >>= i3;
                                i9++;
                                i7 = i3;
                            }
                            if (i8 != i7) {
                                break;
                            }
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        c2 = 7;
                    }
                    i2 = i5;
                } else {
                    i2 = 7;
                }
                Unit unit = Unit.f40552a;
                Object[] objArr3 = c3.f15005z;
                int p3 = c3.p();
                for (int i11 = 0; i11 < p3; i11++) {
                    ((DerivedStateObserver) objArr3[i11]).a(derivedState2);
                }
                return i2;
            } catch (Throwable th2) {
                Object[] objArr4 = c3.f15005z;
                int p4 = c3.p();
                for (int i12 = 0; i12 < p4; i12++) {
                    ((DerivedStateObserver) objArr4[i12]).a(derivedState2);
                }
                throw th2;
            }
        }

        public void n(ObjectIntMap objectIntMap) {
            this.f14652e = objectIntMap;
        }

        public final void o(Object obj) {
            this.f14653f = obj;
        }

        public final void p(int i2) {
            this.f14654g = i2;
        }

        public final void q(long j2) {
            this.f14650c = j2;
        }

        public final void r(int i2) {
            this.f14651d = i2;
        }
    }

    public DerivedSnapshotState(Function0 function0, SnapshotMutationPolicy snapshotMutationPolicy) {
        this.f14645A = function0;
        this.f14646B = snapshotMutationPolicy;
    }

    public static final Unit y(DerivedSnapshotState derivedSnapshotState, IntRef intRef, MutableObjectIntMap mutableObjectIntMap, int i2, Object obj) {
        if (obj != derivedSnapshotState) {
            if (obj instanceof StateObject) {
                mutableObjectIntMap.u(obj, Math.min(intRef.a() - i2, mutableObjectIntMap.e(obj, Integer.MAX_VALUE)));
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("A derived state calculation cannot read itself");
    }

    public SnapshotMutationPolicy d() {
        return this.f14646B;
    }

    public void g(StateRecord stateRecord) {
        Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.C = (ResultRecord) stateRecord;
    }

    public Object getValue() {
        Snapshot.Companion companion = Snapshot.f15255e;
        Function1 g2 = companion.c().g();
        if (g2 != null) {
            g2.invoke(this);
        }
        Snapshot c2 = companion.c();
        return x((ResultRecord) SnapshotKt.L(this.C, c2), c2, true, this.f14645A).k();
    }

    public StateRecord h() {
        return this.C;
    }

    public DerivedState.Record s() {
        Snapshot c2 = Snapshot.f15255e.c();
        return x((ResultRecord) SnapshotKt.L(this.C, c2), c2, false, this.f14645A);
    }

    public String toString() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.K(this.C);
        return "DerivedState(value=" + z() + ")@" + hashCode();
    }

    public final StateRecord w(Snapshot snapshot) {
        return x((ResultRecord) SnapshotKt.L(this.C, snapshot), snapshot, false, this.f14645A);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final androidx.compose.runtime.DerivedSnapshotState.ResultRecord x(androidx.compose.runtime.DerivedSnapshotState.ResultRecord r23, androidx.compose.runtime.snapshots.Snapshot r24, boolean r25, kotlin.jvm.functions.Function0 r26) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            r2 = 1
            r3 = r24
            boolean r4 = r0.l(r1, r3)
            r5 = 0
            if (r4 == 0) goto L_0x00e6
            if (r25 == 0) goto L_0x00e5
            androidx.compose.runtime.collection.MutableVector r4 = androidx.compose.runtime.SnapshotStateKt.c()
            java.lang.Object[] r6 = r4.f15005z
            int r7 = r4.p()
            r8 = r5
        L_0x001b:
            if (r8 >= r7) goto L_0x0026
            r9 = r6[r8]
            androidx.compose.runtime.DerivedStateObserver r9 = (androidx.compose.runtime.DerivedStateObserver) r9
            r9.b(r1)
            int r8 = r8 + r2
            goto L_0x001b
        L_0x0026:
            androidx.collection.ObjectIntMap r6 = r23.b()     // Catch:{ all -> 0x0043 }
            androidx.compose.runtime.internal.SnapshotThreadLocal r7 = androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.a()     // Catch:{ all -> 0x0043 }
            java.lang.Object r7 = r7.a()     // Catch:{ all -> 0x0043 }
            androidx.compose.runtime.internal.IntRef r7 = (androidx.compose.runtime.internal.IntRef) r7     // Catch:{ all -> 0x0043 }
            if (r7 != 0) goto L_0x0046
            androidx.compose.runtime.internal.IntRef r7 = new androidx.compose.runtime.internal.IntRef     // Catch:{ all -> 0x0043 }
            r7.<init>(r5)     // Catch:{ all -> 0x0043 }
            androidx.compose.runtime.internal.SnapshotThreadLocal r8 = androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.a()     // Catch:{ all -> 0x0043 }
            r8.b(r7)     // Catch:{ all -> 0x0043 }
            goto L_0x0046
        L_0x0043:
            r0 = move-exception
            goto L_0x00d1
        L_0x0046:
            int r8 = r7.a()     // Catch:{ all -> 0x0043 }
            java.lang.Object[] r9 = r6.f1932b     // Catch:{ all -> 0x0043 }
            int[] r10 = r6.f1933c     // Catch:{ all -> 0x0043 }
            long[] r6 = r6.f1931a     // Catch:{ all -> 0x0043 }
            int r11 = r6.length     // Catch:{ all -> 0x0043 }
            int r11 = r11 + -2
            if (r11 < 0) goto L_0x00b9
            r12 = r5
        L_0x0056:
            r13 = r6[r12]     // Catch:{ all -> 0x0043 }
            r25 = r6
            long r5 = ~r13     // Catch:{ all -> 0x0043 }
            r16 = 7
            long r5 = r5 << r16
            long r5 = r5 & r13
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r16
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x00b0
            int r5 = r12 - r11
            int r5 = ~r5     // Catch:{ all -> 0x0043 }
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r15 = 0
        L_0x0075:
            if (r15 >= r5) goto L_0x00a8
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r13 & r17
            r19 = 128(0x80, double:6.32E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L_0x009e
            int r17 = r12 << 3
            int r17 = r17 + r15
            r18 = r9[r17]     // Catch:{ all -> 0x0043 }
            r17 = r10[r17]     // Catch:{ all -> 0x0043 }
            r2 = r18
            androidx.compose.runtime.snapshots.StateObject r2 = (androidx.compose.runtime.snapshots.StateObject) r2     // Catch:{ all -> 0x0043 }
            int r6 = r8 + r17
            r7.b(r6)     // Catch:{ all -> 0x0043 }
            kotlin.jvm.functions.Function1 r6 = r24.g()     // Catch:{ all -> 0x0043 }
            if (r6 == 0) goto L_0x009b
            r6.invoke(r2)     // Catch:{ all -> 0x0043 }
        L_0x009b:
            r2 = 8
            goto L_0x009f
        L_0x009e:
            r2 = r6
        L_0x009f:
            long r13 = r13 >> r2
            r6 = 1
            int r15 = r15 + r6
            r21 = r6
            r6 = r2
            r2 = r21
            goto L_0x0075
        L_0x00a8:
            r21 = r6
            r6 = r2
            r2 = r21
            if (r5 != r2) goto L_0x00b9
            goto L_0x00b1
        L_0x00b0:
            r6 = r2
        L_0x00b1:
            if (r12 == r11) goto L_0x00b9
            int r12 = r12 + r6
            r2 = r6
            r5 = 0
            r6 = r25
            goto L_0x0056
        L_0x00b9:
            r7.b(r8)     // Catch:{ all -> 0x0043 }
            kotlin.Unit r2 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0043 }
            java.lang.Object[] r2 = r4.f15005z
            int r3 = r4.p()
            r5 = 0
        L_0x00c5:
            if (r5 >= r3) goto L_0x00e5
            r4 = r2[r5]
            androidx.compose.runtime.DerivedStateObserver r4 = (androidx.compose.runtime.DerivedStateObserver) r4
            r4.a(r1)
            r4 = 1
            int r5 = r5 + r4
            goto L_0x00c5
        L_0x00d1:
            java.lang.Object[] r2 = r4.f15005z
            int r3 = r4.p()
            r5 = 0
        L_0x00d8:
            if (r5 >= r3) goto L_0x00e4
            r4 = r2[r5]
            androidx.compose.runtime.DerivedStateObserver r4 = (androidx.compose.runtime.DerivedStateObserver) r4
            r4.a(r1)
            r4 = 1
            int r5 = r5 + r4
            goto L_0x00d8
        L_0x00e4:
            throw r0
        L_0x00e5:
            return r0
        L_0x00e6:
            r4 = r2
            androidx.collection.MutableObjectIntMap r2 = new androidx.collection.MutableObjectIntMap
            r3 = 0
            r5 = 0
            r2.<init>(r5, r4, r3)
            androidx.compose.runtime.internal.SnapshotThreadLocal r4 = androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.a()
            java.lang.Object r4 = r4.a()
            androidx.compose.runtime.internal.IntRef r4 = (androidx.compose.runtime.internal.IntRef) r4
            if (r4 != 0) goto L_0x0106
            androidx.compose.runtime.internal.IntRef r4 = new androidx.compose.runtime.internal.IntRef
            r4.<init>(r5)
            androidx.compose.runtime.internal.SnapshotThreadLocal r6 = androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.a()
            r6.b(r4)
        L_0x0106:
            int r6 = r4.a()
            androidx.compose.runtime.collection.MutableVector r7 = androidx.compose.runtime.SnapshotStateKt.c()
            java.lang.Object[] r8 = r7.f15005z
            int r9 = r7.p()
            r10 = r5
        L_0x0115:
            if (r10 >= r9) goto L_0x0121
            r11 = r8[r10]
            androidx.compose.runtime.DerivedStateObserver r11 = (androidx.compose.runtime.DerivedStateObserver) r11
            r11.b(r1)
            r11 = 1
            int r10 = r10 + r11
            goto L_0x0115
        L_0x0121:
            r11 = 1
            int r8 = r6 + 1
            r4.b(r8)     // Catch:{ all -> 0x01ca }
            androidx.compose.runtime.snapshots.Snapshot$Companion r8 = androidx.compose.runtime.snapshots.Snapshot.f15255e     // Catch:{ all -> 0x01ca }
            androidx.compose.runtime.m r9 = new androidx.compose.runtime.m     // Catch:{ all -> 0x01ca }
            r9.<init>(r1, r4, r2, r6)     // Catch:{ all -> 0x01ca }
            r10 = r26
            java.lang.Object r3 = r8.h(r9, r3, r10)     // Catch:{ all -> 0x01ca }
            r4.b(r6)     // Catch:{ all -> 0x01ca }
            java.lang.Object[] r4 = r7.f15005z
            int r6 = r7.p()
        L_0x013d:
            if (r5 >= r6) goto L_0x0149
            r7 = r4[r5]
            androidx.compose.runtime.DerivedStateObserver r7 = (androidx.compose.runtime.DerivedStateObserver) r7
            r7.a(r1)
            r7 = 1
            int r5 = r5 + r7
            goto L_0x013d
        L_0x0149:
            java.lang.Object r4 = androidx.compose.runtime.snapshots.SnapshotKt.O()
            monitor-enter(r4)
            androidx.compose.runtime.snapshots.Snapshot$Companion r5 = androidx.compose.runtime.snapshots.Snapshot.f15255e     // Catch:{ all -> 0x017c }
            androidx.compose.runtime.snapshots.Snapshot r6 = r5.c()     // Catch:{ all -> 0x017c }
            java.lang.Object r7 = r23.k()     // Catch:{ all -> 0x017c }
            androidx.compose.runtime.DerivedSnapshotState$ResultRecord$Companion r8 = androidx.compose.runtime.DerivedSnapshotState.ResultRecord.f14647h     // Catch:{ all -> 0x017c }
            java.lang.Object r8 = r8.a()     // Catch:{ all -> 0x017c }
            if (r7 == r8) goto L_0x017e
            androidx.compose.runtime.SnapshotMutationPolicy r7 = r22.d()     // Catch:{ all -> 0x017c }
            if (r7 == 0) goto L_0x017e
            java.lang.Object r8 = r23.k()     // Catch:{ all -> 0x017c }
            boolean r7 = r7.a(r3, r8)     // Catch:{ all -> 0x017c }
            r8 = 1
            if (r7 != r8) goto L_0x017e
            r0.n(r2)     // Catch:{ all -> 0x017c }
            int r2 = r0.m(r1, r6)     // Catch:{ all -> 0x017c }
            r0.p(r2)     // Catch:{ all -> 0x017c }
            goto L_0x0193
        L_0x017c:
            r0 = move-exception
            goto L_0x01c8
        L_0x017e:
            androidx.compose.runtime.DerivedSnapshotState$ResultRecord r0 = r1.C     // Catch:{ all -> 0x017c }
            androidx.compose.runtime.snapshots.StateRecord r0 = androidx.compose.runtime.snapshots.SnapshotKt.V(r0, r1, r6)     // Catch:{ all -> 0x017c }
            androidx.compose.runtime.DerivedSnapshotState$ResultRecord r0 = (androidx.compose.runtime.DerivedSnapshotState.ResultRecord) r0     // Catch:{ all -> 0x017c }
            r0.n(r2)     // Catch:{ all -> 0x017c }
            int r2 = r0.m(r1, r6)     // Catch:{ all -> 0x017c }
            r0.p(r2)     // Catch:{ all -> 0x017c }
            r0.o(r3)     // Catch:{ all -> 0x017c }
        L_0x0193:
            monitor-exit(r4)
            androidx.compose.runtime.internal.SnapshotThreadLocal r2 = androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.a()
            java.lang.Object r2 = r2.a()
            androidx.compose.runtime.internal.IntRef r2 = (androidx.compose.runtime.internal.IntRef) r2
            if (r2 == 0) goto L_0x01c7
            int r2 = r2.a()
            if (r2 != 0) goto L_0x01c7
            r5.g()
            java.lang.Object r2 = androidx.compose.runtime.snapshots.SnapshotKt.O()
            monitor-enter(r2)
            androidx.compose.runtime.snapshots.Snapshot r3 = r5.c()     // Catch:{ all -> 0x01c4 }
            long r4 = r3.i()     // Catch:{ all -> 0x01c4 }
            r0.q(r4)     // Catch:{ all -> 0x01c4 }
            int r3 = r3.j()     // Catch:{ all -> 0x01c4 }
            r0.r(r3)     // Catch:{ all -> 0x01c4 }
            kotlin.Unit r3 = kotlin.Unit.f40552a     // Catch:{ all -> 0x01c4 }
            monitor-exit(r2)
            goto L_0x01c7
        L_0x01c4:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01c7:
            return r0
        L_0x01c8:
            monitor-exit(r4)
            throw r0
        L_0x01ca:
            r0 = move-exception
            java.lang.Object[] r2 = r7.f15005z
            int r3 = r7.p()
        L_0x01d1:
            if (r5 >= r3) goto L_0x01dd
            r4 = r2[r5]
            androidx.compose.runtime.DerivedStateObserver r4 = (androidx.compose.runtime.DerivedStateObserver) r4
            r4.a(r1)
            r4 = 1
            int r5 = r5 + r4
            goto L_0x01d1
        L_0x01dd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.DerivedSnapshotState.x(androidx.compose.runtime.DerivedSnapshotState$ResultRecord, androidx.compose.runtime.snapshots.Snapshot, boolean, kotlin.jvm.functions.Function0):androidx.compose.runtime.DerivedSnapshotState$ResultRecord");
    }

    public final String z() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.K(this.C);
        return resultRecord.l(this, Snapshot.f15255e.c()) ? String.valueOf(resultRecord.k()) : "<Not calculated>";
    }
}
