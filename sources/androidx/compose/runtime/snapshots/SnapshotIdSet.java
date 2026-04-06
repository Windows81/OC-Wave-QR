package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;

@Metadata
public final class SnapshotIdSet implements Iterable<Long>, KMappedMarker {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);
    public static final SnapshotIdSet E = new SnapshotIdSet(0, 0, 0, (long[]) null);

    /* renamed from: A  reason: collision with root package name */
    public final long f15272A;

    /* renamed from: B  reason: collision with root package name */
    public final long f15273B;
    public final long[] C;

    /* renamed from: z  reason: collision with root package name */
    public final long f15274z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SnapshotIdSet a() {
            return SnapshotIdSet.E;
        }

        public Companion() {
        }
    }

    public SnapshotIdSet(long j2, long j3, long j4, long[] jArr) {
        this.f15274z = j2;
        this.f15272A = j3;
        this.f15273B = j4;
        this.C = jArr;
    }

    public Iterator iterator() {
        return SequencesKt.b(new SnapshotIdSet$iterator$1(this, (Continuation) null)).iterator();
    }

    public final SnapshotIdSet n(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2;
        long[] jArr;
        SnapshotIdSet snapshotIdSet3 = E;
        if (snapshotIdSet == snapshotIdSet3) {
            return this;
        }
        if (this == snapshotIdSet3) {
            return snapshotIdSet3;
        }
        long j2 = snapshotIdSet.f15273B;
        long j3 = this.f15273B;
        if (j2 == j3 && snapshotIdSet.C == (jArr = this.C)) {
            return new SnapshotIdSet((~snapshotIdSet.f15274z) & this.f15274z, (~snapshotIdSet.f15272A) & this.f15272A, j3, jArr);
        }
        long[] e2 = snapshotIdSet.C;
        if (e2 != null) {
            snapshotIdSet2 = this;
            for (long o2 : e2) {
                snapshotIdSet2 = snapshotIdSet2.o(o2);
            }
        } else {
            snapshotIdSet2 = this;
        }
        if (snapshotIdSet.f15272A != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((snapshotIdSet.f15272A & (1 << i2)) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.o(snapshotIdSet.f15273B + ((long) i2));
                }
            }
        }
        if (snapshotIdSet.f15274z != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((snapshotIdSet.f15274z & (1 << i3)) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.o(snapshotIdSet.f15273B + ((long) i3) + ((long) 64));
                }
            }
        }
        return snapshotIdSet2;
    }

    public final SnapshotIdSet o(long j2) {
        long[] jArr;
        int a2;
        long j3 = j2 - this.f15273B;
        long j4 = (long) 0;
        if (Intrinsics.l(j3, j4) >= 0 && Intrinsics.l(j3, (long) 64) < 0) {
            long j5 = 1 << ((int) j3);
            long j6 = this.f15272A;
            if ((j6 & j5) != 0) {
                return new SnapshotIdSet(this.f15274z, j6 & (~j5), this.f15273B, this.C);
            }
        } else if (Intrinsics.l(j3, (long) 64) >= 0 && Intrinsics.l(j3, (long) 128) < 0) {
            long j7 = 1 << (((int) j3) - 64);
            long j8 = this.f15274z;
            if ((j8 & j7) != 0) {
                return new SnapshotIdSet(j8 & (~j7), this.f15272A, this.f15273B, this.C);
            }
        } else if (Intrinsics.l(j3, j4) < 0 && (jArr = this.C) != null && (a2 = SnapshotId_jvmKt.a(jArr, j2)) >= 0) {
            return new SnapshotIdSet(this.f15274z, this.f15272A, this.f15273B, SnapshotId_jvmKt.e(jArr, a2));
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r3 = r0.C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p(long r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            long r3 = r0.f15273B
            long r3 = r1 - r3
            r5 = 0
            long r6 = (long) r5
            int r8 = kotlin.jvm.internal.Intrinsics.l(r3, r6)
            r9 = 0
            r11 = 1
            r13 = 1
            r14 = 64
            r15 = r6
            if (r8 < 0) goto L_0x002d
            long r5 = (long) r14
            int r5 = kotlin.jvm.internal.Intrinsics.l(r3, r5)
            if (r5 >= 0) goto L_0x002d
            int r1 = (int) r3
            long r1 = r11 << r1
            long r3 = r0.f15272A
            long r1 = r1 & r3
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x002b
        L_0x0029:
            r5 = r13
            goto L_0x005c
        L_0x002b:
            r5 = 0
            goto L_0x005c
        L_0x002d:
            long r5 = (long) r14
            int r5 = kotlin.jvm.internal.Intrinsics.l(r3, r5)
            if (r5 < 0) goto L_0x0049
            r5 = 128(0x80, float:1.794E-43)
            long r5 = (long) r5
            int r5 = kotlin.jvm.internal.Intrinsics.l(r3, r5)
            if (r5 >= 0) goto L_0x0049
            int r1 = (int) r3
            int r1 = r1 - r14
            long r1 = r11 << r1
            long r3 = r0.f15274z
            long r1 = r1 & r3
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x002b
            goto L_0x0029
        L_0x0049:
            r5 = r15
            int r3 = kotlin.jvm.internal.Intrinsics.l(r3, r5)
            if (r3 <= 0) goto L_0x0051
            goto L_0x002b
        L_0x0051:
            long[] r3 = r0.C
            if (r3 == 0) goto L_0x002b
            int r1 = androidx.compose.runtime.snapshots.SnapshotId_jvmKt.a(r3, r1)
            if (r1 < 0) goto L_0x002b
            goto L_0x0029
        L_0x005c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.p(long):boolean");
    }

    public final long q(long j2) {
        long[] jArr = this.C;
        if (jArr != null) {
            return jArr[0];
        }
        long j3 = this.f15272A;
        if (j3 != 0) {
            return this.f15273B + ((long) Long.numberOfTrailingZeros(j3));
        }
        long j4 = this.f15274z;
        return j4 != 0 ? this.f15273B + ((long) 64) + ((long) Long.numberOfTrailingZeros(j4)) : j2;
    }

    public final SnapshotIdSet s(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2;
        long[] jArr;
        SnapshotIdSet snapshotIdSet3 = E;
        if (snapshotIdSet == snapshotIdSet3) {
            return this;
        }
        if (this == snapshotIdSet3) {
            return snapshotIdSet;
        }
        long j2 = snapshotIdSet.f15273B;
        long j3 = this.f15273B;
        if (j2 == j3 && snapshotIdSet.C == (jArr = this.C)) {
            return new SnapshotIdSet(snapshotIdSet.f15274z | this.f15274z, snapshotIdSet.f15272A | this.f15272A, j3, jArr);
        }
        int i2 = 0;
        if (this.C == null) {
            long[] e2 = this.C;
            if (e2 != null) {
                for (long u2 : e2) {
                    snapshotIdSet = snapshotIdSet.u(u2);
                }
            }
            if (this.f15272A != 0) {
                for (int i3 = 0; i3 < 64; i3++) {
                    if ((this.f15272A & (1 << i3)) != 0) {
                        snapshotIdSet = snapshotIdSet.u(this.f15273B + ((long) i3));
                    }
                }
            }
            if (this.f15274z != 0) {
                while (i2 < 64) {
                    if ((this.f15274z & (1 << i2)) != 0) {
                        snapshotIdSet = snapshotIdSet.u(this.f15273B + ((long) i2) + ((long) 64));
                    }
                    i2++;
                }
            }
            return snapshotIdSet;
        }
        long[] e3 = snapshotIdSet.C;
        if (e3 != null) {
            snapshotIdSet2 = this;
            for (long u3 : e3) {
                snapshotIdSet2 = snapshotIdSet2.u(u3);
            }
        } else {
            snapshotIdSet2 = this;
        }
        if (snapshotIdSet.f15272A != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if ((snapshotIdSet.f15272A & (1 << i4)) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.u(snapshotIdSet.f15273B + ((long) i4));
                }
            }
        }
        if (snapshotIdSet.f15274z != 0) {
            while (i2 < 64) {
                if ((snapshotIdSet.f15274z & (1 << i2)) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.u(snapshotIdSet.f15273B + ((long) i2) + ((long) 64));
                }
                i2++;
            }
        }
        return snapshotIdSet2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        sb.append(ListUtilsKt.d(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        sb.append(']');
        return sb.toString();
    }

    public final SnapshotIdSet u(long j2) {
        long j3;
        long j4;
        long[] jArr;
        long j5 = j2;
        long j6 = j5 - this.f15273B;
        long j7 = (long) 0;
        long j8 = j7;
        if (Intrinsics.l(j6, j7) < 0 || Intrinsics.l(j6, (long) 64) >= 0) {
            long j9 = (long) 64;
            if (Intrinsics.l(j6, j9) < 0 || Intrinsics.l(j6, (long) 128) >= 0) {
                long j10 = (long) 128;
                if (Intrinsics.l(j6, j10) < 0) {
                    long[] jArr2 = this.C;
                    if (jArr2 == null) {
                        return new SnapshotIdSet(this.f15274z, this.f15272A, this.f15273B, new long[]{j5});
                    }
                    int a2 = SnapshotId_jvmKt.a(jArr2, j5);
                    if (a2 < 0) {
                        return new SnapshotIdSet(this.f15274z, this.f15272A, this.f15273B, SnapshotId_jvmKt.d(jArr2, -(a2 + 1), j5));
                    }
                } else if (!p(j2)) {
                    long j11 = this.f15274z;
                    long j12 = this.f15272A;
                    long j13 = this.f15273B;
                    long j14 = j12;
                    long j15 = (long) 1;
                    long j16 = j11;
                    long j17 = ((j5 + j15) / j9) * j9;
                    if (Intrinsics.l(j17, j8) < 0) {
                        j17 = (Long.MAX_VALUE - j10) + j15;
                    }
                    SnapshotIdArrayBuilder snapshotIdArrayBuilder = null;
                    long j18 = j16;
                    while (true) {
                        if (Intrinsics.l(j13, j17) >= 0) {
                            j3 = j13;
                            j4 = j14;
                            break;
                        }
                        if (j14 != 0) {
                            if (snapshotIdArrayBuilder == null) {
                                snapshotIdArrayBuilder = new SnapshotIdArrayBuilder(this.C);
                            }
                            for (int i2 = 0; i2 < 64; i2++) {
                                if ((j14 & (1 << i2)) != 0) {
                                    snapshotIdArrayBuilder.a(((long) i2) + j13);
                                }
                            }
                        }
                        if (j18 == 0) {
                            j3 = j17;
                            j4 = 0;
                            break;
                        }
                        j13 += j9;
                        j14 = j18;
                        j18 = 0;
                    }
                    if (snapshotIdArrayBuilder == null || (jArr = snapshotIdArrayBuilder.b()) == null) {
                        jArr = this.C;
                    }
                    return new SnapshotIdSet(j18, j4, j3, jArr).u(j5);
                }
            } else {
                long j19 = 1 << (((int) j6) - 64);
                long j20 = this.f15274z;
                if ((j20 & j19) == 0) {
                    return new SnapshotIdSet(j20 | j19, this.f15272A, this.f15273B, this.C);
                }
            }
        } else {
            long j21 = 1 << ((int) j6);
            long j22 = this.f15272A;
            if ((j22 & j21) == 0) {
                return new SnapshotIdSet(this.f15274z, j22 | j21, this.f15273B, this.C);
            }
        }
        return this;
    }
}
