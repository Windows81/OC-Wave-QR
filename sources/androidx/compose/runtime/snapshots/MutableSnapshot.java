package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class MutableSnapshot extends Snapshot {

    /* renamed from: p  reason: collision with root package name */
    public static final Companion f15235p = new Companion((DefaultConstructorMarker) null);

    /* renamed from: q  reason: collision with root package name */
    public static final int f15236q = 8;

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f15237r = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public final Function1 f15238g;

    /* renamed from: h  reason: collision with root package name */
    public final Function1 f15239h;

    /* renamed from: i  reason: collision with root package name */
    public int f15240i;

    /* renamed from: j  reason: collision with root package name */
    public MutableScatterSet f15241j;

    /* renamed from: k  reason: collision with root package name */
    public List f15242k;

    /* renamed from: l  reason: collision with root package name */
    public SnapshotIdSet f15243l = SnapshotIdSet.D.a();

    /* renamed from: m  reason: collision with root package name */
    public int[] f15244m = f15237r;

    /* renamed from: n  reason: collision with root package name */
    public int f15245n = 1;

    /* renamed from: o  reason: collision with root package name */
    public boolean f15246o;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public MutableSnapshot(long j2, SnapshotIdSet snapshotIdSet, Function1 function1, Function1 function12) {
        super(j2, snapshotIdSet, (DefaultConstructorMarker) null);
        this.f15238g = function1;
        this.f15239h = function12;
    }

    public final void C() {
        MutableScatterSet G = G();
        if (G != null) {
            U();
            S((MutableScatterSet) null);
            long i2 = i();
            Object[] objArr = G.f1967b;
            long[] jArr = G.f1966a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j2 = jArr[i3];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((255 & j2) < 128) {
                                for (StateRecord h2 = ((StateObject) objArr[(i3 << 3) + i5]).h(); h2 != null; h2 = h2.f()) {
                                    if (h2.g() == i2 || CollectionsKt.W(this.f15243l, Long.valueOf(h2.g()))) {
                                        h2.i(SnapshotKt.f15277b);
                                    }
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        b();
    }

    public final void D() {
        long j2;
        M(i());
        Unit unit = Unit.f40552a;
        if (!F() && !e()) {
            long i2 = i();
            synchronized (SnapshotKt.O()) {
                long n2 = SnapshotKt.f15281f;
                j2 = (long) 1;
                SnapshotKt.f15281f = SnapshotKt.f15281f + j2;
                v(n2);
                SnapshotKt.f15280e = SnapshotKt.f15280e.u(i());
            }
            u(SnapshotKt.E(f(), i2 + j2, i()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a1, code lost:
        r7.f15246o = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
        if (r1 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a5, code lost:
        r4 = androidx.compose.runtime.collection.ScatterSetWrapperKt.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        if (r4.isEmpty() != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        r5 = r2.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (r6 >= r5) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bc, code lost:
        ((kotlin.jvm.functions.Function2) r2.get(r6)).m(r4, r7);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c7, code lost:
        if (r8 == null) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r8.e() == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        r4 = androidx.compose.runtime.collection.ScatterSetWrapperKt.a(r8);
        r5 = r2.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00db, code lost:
        if (r6 >= r5) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dd, code lost:
        ((kotlin.jvm.functions.Function2) r2.get(r6)).m(r4, r7);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e8, code lost:
        androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.d(r7, r8);
        r2 = androidx.compose.runtime.snapshots.SnapshotKt.O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ef, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r();
        androidx.compose.runtime.snapshots.SnapshotKt.H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0100, code lost:
        if (r1 == null) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0102, code lost:
        r15 = r1.f1967b;
        r1 = r1.f1966a;
        r3 = r1.length - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0109, code lost:
        if (r3 < 0) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010b, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010c, code lost:
        r4 = r1[r9];
        r19 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0116, code lost:
        if (((((~r4) << 7) & r4) & -9187201950435737472L) == -9187201950435737472L) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0118, code lost:
        r0 = 8 - ((~(r9 - r3)) >>> 31);
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0120, code lost:
        if (r1 >= r0) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0128, code lost:
        if ((r4 & 255) >= 128) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012a, code lost:
        androidx.compose.runtime.snapshots.SnapshotKt.b0((androidx.compose.runtime.snapshots.StateObject) r15[(r9 << 3) + r1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0136, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0139, code lost:
        r4 = r4 >> 8;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0141, code lost:
        if (r0 != 8) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0146, code lost:
        if (r9 == r3) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0148, code lost:
        r9 = r9 + 1;
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014e, code lost:
        if (r8 == null) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0150, code lost:
        r0 = r8.f1967b;
        r1 = r8.f1966a;
        r3 = r1.length - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0157, code lost:
        if (r3 < 0) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0159, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015a, code lost:
        r8 = r1[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0162, code lost:
        if (((((~r8) << 7) & r8) & -9187201950435737472L) == -9187201950435737472L) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0164, code lost:
        r5 = 8 - ((~(r4 - r3)) >>> 31);
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016c, code lost:
        if (r10 >= r5) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0176, code lost:
        if ((r8 & 255) >= 128) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0178, code lost:
        androidx.compose.runtime.snapshots.SnapshotKt.b0((androidx.compose.runtime.snapshots.StateObject) r0[(r4 << 3) + r10]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0182, code lost:
        r8 = r8 >> 8;
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0186, code lost:
        r11 = 1;
        r19 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018b, code lost:
        if (r5 != 8) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x018e, code lost:
        r11 = 1;
        r19 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0193, code lost:
        if (r4 == r3) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0195, code lost:
        r4 = r4 + r11;
        r10 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0199, code lost:
        r0 = r7.f15242k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x019b, code lost:
        if (r0 == null) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x019d, code lost:
        r1 = r0.size();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a5, code lost:
        if (r3 >= r1) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a7, code lost:
        androidx.compose.runtime.snapshots.SnapshotKt.b0((androidx.compose.runtime.snapshots.StateObject) r0.get(r3));
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b3, code lost:
        r7.f15242k = null;
        r0 = kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b8, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01bb, code lost:
        return androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.f15262a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01bd, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult E() {
        /*
            r23 = this;
            r7 = r23
            r0 = 1
            androidx.collection.MutableScatterSet r8 = r23.G()
            r9 = 0
            if (r8 == 0) goto L_0x0024
            androidx.compose.runtime.snapshots.GlobalSnapshot r1 = androidx.compose.runtime.snapshots.SnapshotKt.f15286k
            long r2 = r1.i()
            androidx.compose.runtime.snapshots.SnapshotIdSet r4 = androidx.compose.runtime.snapshots.SnapshotKt.f15280e
            long r5 = r1.i()
            androidx.compose.runtime.snapshots.SnapshotIdSet r1 = r4.o(r5)
            java.util.Map r1 = androidx.compose.runtime.snapshots.SnapshotKt.Y(r2, r7, r1)
            r5 = r1
            goto L_0x0025
        L_0x0024:
            r5 = r9
        L_0x0025:
            java.util.List r1 = kotlin.collections.CollectionsKt.m()
            java.lang.Object r10 = androidx.compose.runtime.snapshots.SnapshotKt.O()
            monitor-enter(r10)
            androidx.compose.runtime.snapshots.SnapshotKt.o0(r23)     // Catch:{ all -> 0x0078 }
            if (r8 == 0) goto L_0x007b
            int r2 = r8.c()     // Catch:{ all -> 0x0078 }
            if (r2 != 0) goto L_0x003a
            goto L_0x007b
        L_0x003a:
            androidx.compose.runtime.snapshots.GlobalSnapshot r11 = androidx.compose.runtime.snapshots.SnapshotKt.f15286k     // Catch:{ all -> 0x0078 }
            long r2 = androidx.compose.runtime.snapshots.SnapshotKt.f15281f     // Catch:{ all -> 0x0078 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r1 = androidx.compose.runtime.snapshots.SnapshotKt.f15280e     // Catch:{ all -> 0x0078 }
            long r12 = r11.i()     // Catch:{ all -> 0x0078 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r1.o(r12)     // Catch:{ all -> 0x0078 }
            r1 = r23
            r4 = r8
            androidx.compose.runtime.snapshots.SnapshotApplyResult r1 = r1.L(r2, r4, r5, r6)     // Catch:{ all -> 0x0078 }
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r2 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.f15262a     // Catch:{ all -> 0x0078 }
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r1, r2)     // Catch:{ all -> 0x0078 }
            if (r2 != 0) goto L_0x005f
            monitor-exit(r10)
            return r1
        L_0x005f:
            r23.c()     // Catch:{ all -> 0x0078 }
            androidx.collection.MutableScatterSet r1 = r11.G()     // Catch:{ all -> 0x0078 }
            kotlin.jvm.functions.Function1 r2 = androidx.compose.runtime.snapshots.SnapshotKt.f15276a     // Catch:{ all -> 0x0078 }
            java.lang.Object unused = androidx.compose.runtime.snapshots.SnapshotKt.h0(r11, r2)     // Catch:{ all -> 0x0078 }
            r7.S(r9)     // Catch:{ all -> 0x0078 }
            r11.S(r9)     // Catch:{ all -> 0x0078 }
            java.util.List r2 = androidx.compose.runtime.snapshots.SnapshotKt.f15284i     // Catch:{ all -> 0x0078 }
            goto L_0x009e
        L_0x0078:
            r0 = move-exception
            goto L_0x01be
        L_0x007b:
            r23.c()     // Catch:{ all -> 0x0078 }
            androidx.compose.runtime.snapshots.GlobalSnapshot r2 = androidx.compose.runtime.snapshots.SnapshotKt.f15286k     // Catch:{ all -> 0x0078 }
            androidx.collection.MutableScatterSet r3 = r2.G()     // Catch:{ all -> 0x0078 }
            kotlin.jvm.functions.Function1 r4 = androidx.compose.runtime.snapshots.SnapshotKt.f15276a     // Catch:{ all -> 0x0078 }
            java.lang.Object unused = androidx.compose.runtime.snapshots.SnapshotKt.h0(r2, r4)     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x009c
            boolean r2 = r3.e()     // Catch:{ all -> 0x0078 }
            if (r2 == 0) goto L_0x009c
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.f15284i     // Catch:{ all -> 0x0078 }
            r2 = r1
            r1 = r3
            goto L_0x009e
        L_0x009c:
            r2 = r1
            r1 = r9
        L_0x009e:
            kotlin.Unit r3 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0078 }
            monitor-exit(r10)
            r7.f15246o = r0
            if (r1 == 0) goto L_0x00c7
            java.util.Set r4 = androidx.compose.runtime.collection.ScatterSetWrapperKt.a(r1)
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x00c7
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r6 = 0
        L_0x00ba:
            if (r6 >= r5) goto L_0x00c7
            java.lang.Object r10 = r2.get(r6)
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r10.m(r4, r7)
            int r6 = r6 + r0
            goto L_0x00ba
        L_0x00c7:
            if (r8 == 0) goto L_0x00e8
            boolean r4 = r8.e()
            if (r4 == 0) goto L_0x00e8
            java.util.Set r4 = androidx.compose.runtime.collection.ScatterSetWrapperKt.a(r8)
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r6 = 0
        L_0x00db:
            if (r6 >= r5) goto L_0x00e8
            java.lang.Object r10 = r2.get(r6)
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r10.m(r4, r7)
            int r6 = r6 + r0
            goto L_0x00db
        L_0x00e8:
            androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.d(r7, r8)
            java.lang.Object r2 = androidx.compose.runtime.snapshots.SnapshotKt.O()
            monitor-enter(r2)
            r23.r()     // Catch:{ all -> 0x0136 }
            androidx.compose.runtime.snapshots.SnapshotKt.H()     // Catch:{ all -> 0x0136 }
            r10 = 255(0xff, double:1.26E-321)
            r6 = 7
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r14 = 8
            if (r1 == 0) goto L_0x014e
            java.lang.Object[] r15 = r1.f1967b     // Catch:{ all -> 0x0136 }
            long[] r1 = r1.f1966a     // Catch:{ all -> 0x0136 }
            int r3 = r1.length     // Catch:{ all -> 0x0136 }
            int r3 = r3 + -2
            if (r3 < 0) goto L_0x014e
            r9 = 0
        L_0x010c:
            r4 = r1[r9]     // Catch:{ all -> 0x0136 }
            r19 = r1
            long r0 = ~r4     // Catch:{ all -> 0x0136 }
            long r0 = r0 << r6
            long r0 = r0 & r4
            long r0 = r0 & r12
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0144
            int r0 = r9 - r3
            int r0 = ~r0     // Catch:{ all -> 0x0136 }
            int r0 = r0 >>> 31
            int r0 = 8 - r0
            r1 = 0
        L_0x0120:
            if (r1 >= r0) goto L_0x013f
            long r20 = r4 & r10
            r16 = 128(0x80, double:6.32E-322)
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L_0x0139
            int r20 = r9 << 3
            int r20 = r20 + r1
            r20 = r15[r20]     // Catch:{ all -> 0x0136 }
            androidx.compose.runtime.snapshots.StateObject r20 = (androidx.compose.runtime.snapshots.StateObject) r20     // Catch:{ all -> 0x0136 }
            androidx.compose.runtime.snapshots.SnapshotKt.b0(r20)     // Catch:{ all -> 0x0136 }
            goto L_0x0139
        L_0x0136:
            r0 = move-exception
            goto L_0x01bc
        L_0x0139:
            long r4 = r4 >> r14
            r18 = 1
            int r1 = r1 + 1
            goto L_0x0120
        L_0x013f:
            r18 = 1
            if (r0 != r14) goto L_0x014e
            goto L_0x0146
        L_0x0144:
            r18 = 1
        L_0x0146:
            if (r9 == r3) goto L_0x014e
            int r9 = r9 + 1
            r1 = r19
            r0 = 1
            goto L_0x010c
        L_0x014e:
            if (r8 == 0) goto L_0x0199
            java.lang.Object[] r0 = r8.f1967b     // Catch:{ all -> 0x0136 }
            long[] r1 = r8.f1966a     // Catch:{ all -> 0x0136 }
            int r3 = r1.length     // Catch:{ all -> 0x0136 }
            int r3 = r3 + -2
            if (r3 < 0) goto L_0x0199
            r4 = 0
        L_0x015a:
            r8 = r1[r4]     // Catch:{ all -> 0x0136 }
            long r10 = ~r8     // Catch:{ all -> 0x0136 }
            long r10 = r10 << r6
            long r10 = r10 & r8
            long r10 = r10 & r12
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x018e
            int r5 = r4 - r3
            int r5 = ~r5     // Catch:{ all -> 0x0136 }
            int r5 = r5 >>> 31
            int r5 = 8 - r5
            r10 = 0
        L_0x016c:
            if (r10 >= r5) goto L_0x0186
            r19 = 255(0xff, double:1.26E-321)
            long r21 = r8 & r19
            r16 = 128(0x80, double:6.32E-322)
            int r11 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r11 >= 0) goto L_0x0182
            int r11 = r4 << 3
            int r11 = r11 + r10
            r11 = r0[r11]     // Catch:{ all -> 0x0136 }
            androidx.compose.runtime.snapshots.StateObject r11 = (androidx.compose.runtime.snapshots.StateObject) r11     // Catch:{ all -> 0x0136 }
            androidx.compose.runtime.snapshots.SnapshotKt.b0(r11)     // Catch:{ all -> 0x0136 }
        L_0x0182:
            long r8 = r8 >> r14
            r11 = 1
            int r10 = r10 + r11
            goto L_0x016c
        L_0x0186:
            r11 = 1
            r16 = 128(0x80, double:6.32E-322)
            r19 = 255(0xff, double:1.26E-321)
            if (r5 != r14) goto L_0x0199
            goto L_0x0193
        L_0x018e:
            r11 = 1
            r16 = 128(0x80, double:6.32E-322)
            r19 = 255(0xff, double:1.26E-321)
        L_0x0193:
            if (r4 == r3) goto L_0x0199
            int r4 = r4 + r11
            r10 = r19
            goto L_0x015a
        L_0x0199:
            java.util.List r0 = r7.f15242k     // Catch:{ all -> 0x0136 }
            if (r0 == 0) goto L_0x01b3
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x0136 }
            int r1 = r1.size()     // Catch:{ all -> 0x0136 }
            r3 = 0
        L_0x01a5:
            if (r3 >= r1) goto L_0x01b3
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0136 }
            androidx.compose.runtime.snapshots.StateObject r4 = (androidx.compose.runtime.snapshots.StateObject) r4     // Catch:{ all -> 0x0136 }
            androidx.compose.runtime.snapshots.SnapshotKt.b0(r4)     // Catch:{ all -> 0x0136 }
            r4 = 1
            int r3 = r3 + r4
            goto L_0x01a5
        L_0x01b3:
            r0 = 0
            r7.f15242k = r0     // Catch:{ all -> 0x0136 }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0136 }
            monitor-exit(r2)
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r0 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.f15262a
            return r0
        L_0x01bc:
            monitor-exit(r2)
            throw r0
        L_0x01be:
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.E():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    public final boolean F() {
        return this.f15246o;
    }

    public MutableScatterSet G() {
        return this.f15241j;
    }

    public final SnapshotIdSet H() {
        return this.f15243l;
    }

    public final int[] I() {
        return this.f15244m;
    }

    /* renamed from: J */
    public Function1 g() {
        return this.f15238g;
    }

    public boolean K() {
        MutableScatterSet G = G();
        return G != null && G.e();
    }

    public final SnapshotApplyResult L(long j2, MutableScatterSet mutableScatterSet, Map map, SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2;
        long[] jArr;
        Object[] objArr;
        int i2;
        int i3;
        SnapshotIdSet snapshotIdSet3;
        long[] jArr2;
        Object[] objArr2;
        int i4;
        StateRecord v2;
        StateRecord stateRecord;
        long j3 = j2;
        MutableScatterSet mutableScatterSet2 = mutableScatterSet;
        Map map2 = map;
        SnapshotIdSet s2 = f().u(i()).s(this.f15243l);
        Object[] objArr3 = mutableScatterSet2.f1967b;
        long[] jArr3 = mutableScatterSet2.f1966a;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        List list = null;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j4 = jArr3[i5];
                List list2 = list;
                if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j4 & 255) < 128) {
                            StateObject stateObject = (StateObject) objArr3[(i5 << 3) + i7];
                            objArr2 = objArr3;
                            StateRecord h2 = stateObject.h();
                            jArr2 = jArr3;
                            StateRecord v3 = SnapshotKt.d0(h2, j3, snapshotIdSet);
                            if (v3 == null || (v2 = SnapshotKt.d0(h2, i(), s2)) == null || v2.g() == SnapshotId_jvmKt.c(1) || Intrinsics.d(v3, v2)) {
                                snapshotIdSet3 = s2;
                                i4 = length;
                            } else {
                                i4 = length;
                                snapshotIdSet3 = s2;
                                StateRecord v4 = SnapshotKt.d0(h2, i(), f());
                                if (v4 != null) {
                                    if (map2 == null || (stateRecord = (StateRecord) map2.get(v3)) == null) {
                                        stateRecord = stateObject.i(v2, v3, v4);
                                    }
                                    if (stateRecord == null) {
                                        return new SnapshotApplyResult.Failure(this);
                                    }
                                    if (!Intrinsics.d(stateRecord, v4)) {
                                        if (Intrinsics.d(stateRecord, v3)) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(TuplesKt.a(stateObject, v3.e(i())));
                                            if (list2 == null) {
                                                list2 = new ArrayList();
                                            }
                                            List list3 = list2;
                                            list3.add(stateObject);
                                            list2 = list3;
                                        } else {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(!Intrinsics.d(stateRecord, v2) ? TuplesKt.a(stateObject, stateRecord) : TuplesKt.a(stateObject, v2.e(i())));
                                        }
                                    }
                                } else {
                                    Void unused = SnapshotKt.c0();
                                    throw new KotlinNothingValueException();
                                }
                            }
                        } else {
                            snapshotIdSet3 = s2;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i4 = length;
                        }
                        j4 >>= 8;
                        i7++;
                        MutableScatterSet mutableScatterSet3 = mutableScatterSet;
                        length = i4;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        s2 = snapshotIdSet3;
                        j3 = j2;
                    }
                    snapshotIdSet2 = s2;
                    objArr = objArr3;
                    jArr = jArr3;
                    i2 = length;
                    i3 = 1;
                    list = list2;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    snapshotIdSet2 = s2;
                    objArr = objArr3;
                    jArr = jArr3;
                    i2 = length;
                    i3 = 1;
                    list = list2;
                }
                if (i5 == i2) {
                    break;
                }
                i5 += i3;
                MutableScatterSet mutableScatterSet4 = mutableScatterSet;
                length = i2;
                objArr3 = objArr;
                jArr3 = jArr;
                s2 = snapshotIdSet2;
                j3 = j2;
            }
        }
        if (arrayList != null) {
            D();
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                Pair pair = (Pair) arrayList.get(i8);
                StateObject stateObject2 = (StateObject) pair.a();
                StateRecord stateRecord2 = (StateRecord) pair.b();
                stateRecord2.i(j2);
                synchronized (SnapshotKt.O()) {
                    stateRecord2.h(stateObject2.h());
                    stateObject2.g(stateRecord2);
                    Unit unit = Unit.f40552a;
                }
            }
        }
        if (list != null) {
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                mutableScatterSet.y((StateObject) list.get(i9));
            }
            List list4 = this.f15242k;
            if (list4 != null) {
                list = CollectionsKt.x0(list4, list);
            }
            this.f15242k = list;
        }
        return SnapshotApplyResult.Success.f15262a;
    }

    public final void M(long j2) {
        synchronized (SnapshotKt.O()) {
            this.f15243l = this.f15243l.u(j2);
            Unit unit = Unit.f40552a;
        }
    }

    public final void N(SnapshotIdSet snapshotIdSet) {
        synchronized (SnapshotKt.O()) {
            this.f15243l = this.f15243l.s(snapshotIdSet);
            Unit unit = Unit.f40552a;
        }
    }

    public final void O(int i2) {
        if (i2 >= 0) {
            this.f15244m = ArraysKt.C(this.f15244m, i2);
        }
    }

    public final void P(int[] iArr) {
        if (iArr.length != 0) {
            int[] iArr2 = this.f15244m;
            if (iArr2.length != 0) {
                iArr = ArraysKt.D(iArr2, iArr);
            }
            this.f15244m = iArr;
        }
    }

    public final void Q() {
        for (int f0 : this.f15244m) {
            SnapshotKt.f0(f0);
        }
    }

    public final void R(boolean z2) {
        this.f15246o = z2;
    }

    public void S(MutableScatterSet mutableScatterSet) {
        this.f15241j = mutableScatterSet;
    }

    public MutableSnapshot T(Function1 function1, Function1 function12) {
        Map map;
        long j2;
        NestedMutableSnapshot nestedMutableSnapshot;
        B();
        V();
        PersistentList b2 = SnapshotObserverKt.f15386a;
        Function1 function13 = function1;
        Function1 function14 = function12;
        if (b2 != null) {
            Pair f2 = SnapshotObserverKt.f(b2, this, false, function13, function14);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) f2.e();
            Function1 a2 = snapshotInstanceObservers.a();
            function14 = snapshotInstanceObservers.b();
            map = (Map) f2.f();
            function13 = a2;
        } else {
            map = null;
        }
        M(i());
        synchronized (SnapshotKt.O()) {
            long n2 = SnapshotKt.f15281f;
            j2 = (long) 1;
            SnapshotKt.f15281f = SnapshotKt.f15281f + j2;
            SnapshotKt.f15280e = SnapshotKt.f15280e.u(n2);
            SnapshotIdSet f3 = f();
            u(f3.u(n2));
            nestedMutableSnapshot = new NestedMutableSnapshot(n2, SnapshotKt.E(f3, i() + j2, n2), SnapshotKt.Q(function13, g(), false, 4, (Object) null), SnapshotKt.S(function14, k()), this);
        }
        if (!F() && !e()) {
            long i2 = i();
            synchronized (SnapshotKt.O()) {
                long n3 = SnapshotKt.f15281f;
                SnapshotKt.f15281f = SnapshotKt.f15281f + j2;
                v(n3);
                SnapshotKt.f15280e = SnapshotKt.f15280e.u(i());
                Unit unit = Unit.f40552a;
            }
            u(SnapshotKt.E(f(), i2 + j2, i()));
        }
        if (b2 != null) {
            SnapshotObserverKt.c(b2, this, nestedMutableSnapshot, map);
        }
        return nestedMutableSnapshot;
    }

    public final void U() {
        if (this.f15246o) {
            PreconditionsKt.b("Unsupported operation on a snapshot that has been applied");
        }
    }

    public final void V() {
        if (!(!this.f15246o || this.f15260d >= 0)) {
            PreconditionsKt.b("Unsupported operation on a disposed or applied snapshot");
        }
    }

    public void c() {
        SnapshotKt.f15280e = SnapshotKt.f15280e.o(i()).n(this.f15243l);
    }

    public void d() {
        if (!e()) {
            super.d();
            n(this);
            SnapshotObserverKt.e(this);
        }
    }

    public boolean h() {
        return false;
    }

    public int j() {
        return this.f15240i;
    }

    public Function1 k() {
        return this.f15239h;
    }

    public void m(Snapshot snapshot) {
        this.f15245n++;
    }

    public void n(Snapshot snapshot) {
        if (!(this.f15245n > 0)) {
            PreconditionsKt.a("no pending nested snapshots");
        }
        int i2 = this.f15245n - 1;
        this.f15245n = i2;
        if (i2 == 0 && !this.f15246o) {
            C();
        }
    }

    public void o() {
        if (!this.f15246o && !e()) {
            D();
        }
    }

    public void p(StateObject stateObject) {
        MutableScatterSet G = G();
        if (G == null) {
            G = ScatterSetKt.a();
            S(G);
        }
        G.h(stateObject);
    }

    public void r() {
        Q();
        super.r();
    }

    public void w(int i2) {
        this.f15240i = i2;
    }

    public Snapshot x(Function1 function1) {
        Map map;
        long j2;
        NestedReadonlySnapshot nestedReadonlySnapshot;
        B();
        V();
        long i2 = i();
        MutableSnapshot mutableSnapshot = this instanceof GlobalSnapshot ? null : this;
        PersistentList b2 = SnapshotObserverKt.f15386a;
        Function1 function12 = function1;
        if (b2 != null) {
            Pair f2 = SnapshotObserverKt.f(b2, mutableSnapshot, true, function12, (Function1) null);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) f2.e();
            Function1 a2 = snapshotInstanceObservers.a();
            snapshotInstanceObservers.b();
            map = (Map) f2.f();
            function12 = a2;
        } else {
            map = null;
        }
        M(i());
        synchronized (SnapshotKt.O()) {
            long n2 = SnapshotKt.f15281f;
            j2 = (long) 1;
            SnapshotKt.f15281f = SnapshotKt.f15281f + j2;
            SnapshotKt.f15280e = SnapshotKt.f15280e.u(n2);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(n2, SnapshotKt.E(f(), i2 + j2, n2), SnapshotKt.Q(function12, g(), false, 4, (Object) null), this);
        }
        if (!F() && !e()) {
            long i3 = i();
            synchronized (SnapshotKt.O()) {
                long n3 = SnapshotKt.f15281f;
                SnapshotKt.f15281f = SnapshotKt.f15281f + j2;
                v(n3);
                SnapshotKt.f15280e = SnapshotKt.f15280e.u(i());
                Unit unit = Unit.f40552a;
            }
            u(SnapshotKt.E(f(), i3 + j2, i()));
        }
        if (b2 != null) {
            SnapshotObserverKt.c(b2, mutableSnapshot, nestedReadonlySnapshot, map);
        }
        return nestedReadonlySnapshot;
    }
}
