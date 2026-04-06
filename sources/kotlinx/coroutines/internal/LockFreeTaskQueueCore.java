package kotlinx.coroutines.internal;

import androidx.concurrent.futures.a;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class LockFreeTaskQueueCore<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f41847e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41848f;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f41849g;

    /* renamed from: h  reason: collision with root package name */
    public static final Symbol f41850h = new Symbol("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final int f41851a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f41852b;

    /* renamed from: c  reason: collision with root package name */
    public final int f41853c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f41854d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(long j2) {
            return (j2 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j2, int i2) {
            return d(j2, 1073741823) | ((long) i2);
        }

        public final long c(long j2, int i2) {
            return d(j2, 1152921503533105152L) | (((long) i2) << 30);
        }

        public final long d(long j2, long j3) {
            return j2 & (~j3);
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Placeholder {

        /* renamed from: a  reason: collision with root package name */
        public final int f41855a;

        public Placeholder(int i2) {
            this.f41855a = i2;
        }
    }

    static {
        Class<LockFreeTaskQueueCore> cls = LockFreeTaskQueueCore.class;
        f41848f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next$volatile");
        f41849g = AtomicLongFieldUpdater.newUpdater(cls, "_state$volatile");
    }

    public LockFreeTaskQueueCore(int i2, boolean z2) {
        this.f41851a = i2;
        this.f41852b = z2;
        int i3 = i2 - 1;
        this.f41853c = i3;
        this.f41854d = new AtomicReferenceArray(i2);
        if (i3 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        } else if ((i2 & i3) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072 A[LOOP:1: B:20:0x0072->B:23:0x0089, LOOP_START, PHI: r0 
      PHI: (r0v3 kotlinx.coroutines.internal.LockFreeTaskQueueCore) = (r0v2 kotlinx.coroutines.internal.LockFreeTaskQueueCore), (r0v5 kotlinx.coroutines.internal.LockFreeTaskQueueCore) binds: [B:19:0x0068, B:23:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f41849g
        L_0x0004:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0018
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r13 = f41847e
            int r13 = r13.a(r3)
            return r13
        L_0x0018:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f41853c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L_0x0032
            return r6
        L_0x0032:
            boolean r2 = r12.f41852b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L_0x0053
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f()
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x0053
            int r2 = r12.f41851a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L_0x0052
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L_0x0004
        L_0x0052:
            return r6
        L_0x0053:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f41849g
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r5 = f41847e
            long r5 = r5.c(r3, r1)
            r1 = r2
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0004
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f()
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L_0x0072:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f41849g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x008b
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r0.l()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r0.e(r9, r13)
            if (r0 != 0) goto L_0x0072
        L_0x008b:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeTaskQueueCore.a(java.lang.Object):int");
    }

    public final LockFreeTaskQueueCore b(long j2) {
        LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(this.f41851a * 2, this.f41852b);
        int i2 = (int) (1073741823 & j2);
        int i3 = (int) ((1152921503533105152L & j2) >> 30);
        while (true) {
            int i4 = this.f41853c;
            if ((i2 & i4) != (i4 & i3)) {
                Object obj = f().get(this.f41853c & i2);
                if (obj == null) {
                    obj = new Placeholder(i2);
                }
                lockFreeTaskQueueCore.f().set(lockFreeTaskQueueCore.f41853c & i2, obj);
                i2++;
            } else {
                f41849g.set(lockFreeTaskQueueCore, f41847e.d(j2, 1152921504606846976L));
                return lockFreeTaskQueueCore;
            }
        }
    }

    public final LockFreeTaskQueueCore c(long j2) {
        AtomicReferenceFieldUpdater h2 = f41848f;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) h2.get(this);
            if (lockFreeTaskQueueCore != null) {
                return lockFreeTaskQueueCore;
            }
            a.a(f41848f, this, (Object) null, b(j2));
        }
    }

    public final boolean d() {
        long j2;
        AtomicLongFieldUpdater i2 = f41849g;
        do {
            j2 = i2.get(this);
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!i2.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    public final LockFreeTaskQueueCore e(int i2, Object obj) {
        Object obj2 = f().get(this.f41853c & i2);
        if (!(obj2 instanceof Placeholder) || ((Placeholder) obj2).f41855a != i2) {
            return null;
        }
        f().set(i2 & this.f41853c, obj);
        return this;
    }

    public final /* synthetic */ AtomicReferenceArray f() {
        return this.f41854d;
    }

    public final int g() {
        long j2 = f41849g.get(this);
        return (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j2))) & 1073741823;
    }

    public final boolean j() {
        long j2 = f41849g.get(this);
        return ((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }

    public final long k() {
        long j2;
        long j3;
        AtomicLongFieldUpdater i2 = f41849g;
        do {
            j2 = i2.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                return j2;
            }
            j3 = j2 | 1152921504606846976L;
        } while (!i2.compareAndSet(this, j2, j3));
        return j3;
    }

    public final LockFreeTaskQueueCore l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater i2 = f41849g;
        while (true) {
            long j2 = i2.get(this);
            if ((1152921504606846976L & j2) != 0) {
                return f41850h;
            }
            int i3 = (int) (1073741823 & j2);
            int i4 = this.f41853c;
            if ((((int) ((1152921503533105152L & j2) >> 30)) & i4) == (i4 & i3)) {
                return null;
            }
            Object obj = f().get(this.f41853c & i3);
            if (obj == null) {
                if (this.f41852b) {
                    return null;
                }
            } else if (obj instanceof Placeholder) {
                return null;
            } else {
                int i5 = (i3 + 1) & 1073741823;
                if (f41849g.compareAndSet(this, j2, f41847e.b(j2, i5))) {
                    f().set(this.f41853c & i3, (Object) null);
                    return obj;
                } else if (this.f41852b) {
                    LockFreeTaskQueueCore lockFreeTaskQueueCore = this;
                    do {
                        lockFreeTaskQueueCore = lockFreeTaskQueueCore.n(i3, i5);
                    } while (lockFreeTaskQueueCore != null);
                    return obj;
                }
            }
        }
    }

    public final LockFreeTaskQueueCore n(int i2, int i3) {
        long j2;
        int i4;
        AtomicLongFieldUpdater i5 = f41849g;
        do {
            j2 = i5.get(this);
            i4 = (int) (1073741823 & j2);
            if ((1152921504606846976L & j2) != 0) {
                return l();
            }
        } while (!f41849g.compareAndSet(this, j2, f41847e.b(j2, i3)));
        f().set(this.f41853c & i4, (Object) null);
        return null;
    }
}
