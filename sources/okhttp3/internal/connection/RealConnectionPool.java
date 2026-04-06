package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;

@Metadata
public final class RealConnectionPool {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f42959f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f42960a;

    /* renamed from: b  reason: collision with root package name */
    public final long f42961b;

    /* renamed from: c  reason: collision with root package name */
    public final TaskQueue f42962c;

    /* renamed from: d  reason: collision with root package name */
    public final RealConnectionPool$cleanupTask$1 f42963d = new RealConnectionPool$cleanupTask$1(this, Util.f42806i + " ConnectionPool");

    /* renamed from: e  reason: collision with root package name */
    public final ConcurrentLinkedQueue f42964e = new ConcurrentLinkedQueue();

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public RealConnectionPool(TaskRunner taskRunner, int i2, long j2, TimeUnit timeUnit) {
        Intrinsics.i(taskRunner, "taskRunner");
        Intrinsics.i(timeUnit, "timeUnit");
        this.f42960a = i2;
        this.f42961b = timeUnit.toNanos(j2);
        this.f42962c = taskRunner.i();
        if (j2 <= 0) {
            throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j2).toString());
        }
    }

    public final boolean a(Address address, RealCall realCall, List list, boolean z2) {
        Intrinsics.i(address, "address");
        Intrinsics.i(realCall, "call");
        Iterator it = this.f42964e.iterator();
        while (it.hasNext()) {
            RealConnection realConnection = (RealConnection) it.next();
            Intrinsics.h(realConnection, "connection");
            synchronized (realConnection) {
                if (z2) {
                    try {
                        if (realConnection.w()) {
                        }
                        Unit unit = Unit.f40552a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (realConnection.u(address, list)) {
                    realCall.e(realConnection);
                    return true;
                }
                Unit unit2 = Unit.f40552a;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0079, code lost:
        okhttp3.internal.Util.n(r4.F());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0086, code lost:
        if (r11.f42964e.isEmpty() == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0088, code lost:
        r11.f42962c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008d, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(long r12) {
        /*
            r11 = this;
            r0 = 1
            java.util.concurrent.ConcurrentLinkedQueue r1 = r11.f42964e
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
            r4 = -9223372036854775808
            r5 = r4
            r4 = r3
            r3 = r2
        L_0x000e:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x003c
            java.lang.Object r7 = r1.next()
            okhttp3.internal.connection.RealConnection r7 = (okhttp3.internal.connection.RealConnection) r7
            java.lang.String r8 = "connection"
            kotlin.jvm.internal.Intrinsics.h(r7, r8)
            monitor-enter(r7)
            int r8 = r11.d(r7, r12)     // Catch:{ all -> 0x0039 }
            if (r8 <= 0) goto L_0x0028
            int r3 = r3 + r0
            goto L_0x0037
        L_0x0028:
            int r2 = r2 + r0
            long r8 = r7.p()     // Catch:{ all -> 0x0039 }
            long r8 = r12 - r8
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x0035
            r4 = r7
            r5 = r8
        L_0x0035:
            kotlin.Unit r8 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r7)
            goto L_0x000e
        L_0x0039:
            r12 = move-exception
            monitor-exit(r7)
            throw r12
        L_0x003c:
            long r7 = r11.f42961b
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0051
            int r1 = r11.f42960a
            if (r2 <= r1) goto L_0x0047
            goto L_0x0051
        L_0x0047:
            if (r2 <= 0) goto L_0x004b
            long r7 = r7 - r5
            return r7
        L_0x004b:
            if (r3 <= 0) goto L_0x004e
            return r7
        L_0x004e:
            r12 = -1
            return r12
        L_0x0051:
            kotlin.jvm.internal.Intrinsics.f(r4)
            monitor-enter(r4)
            java.util.List r1 = r4.o()     // Catch:{ all -> 0x008e }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x008e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x008e }
            r2 = 0
            if (r1 != 0) goto L_0x0065
            monitor-exit(r4)
            return r2
        L_0x0065:
            long r7 = r4.p()     // Catch:{ all -> 0x008e }
            long r7 = r7 + r5
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x0070
            monitor-exit(r4)
            return r2
        L_0x0070:
            r4.E(r0)     // Catch:{ all -> 0x008e }
            java.util.concurrent.ConcurrentLinkedQueue r12 = r11.f42964e     // Catch:{ all -> 0x008e }
            r12.remove(r4)     // Catch:{ all -> 0x008e }
            monitor-exit(r4)
            java.net.Socket r12 = r4.F()
            okhttp3.internal.Util.n(r12)
            java.util.concurrent.ConcurrentLinkedQueue r12 = r11.f42964e
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x008d
            okhttp3.internal.concurrent.TaskQueue r12 = r11.f42962c
            r12.a()
        L_0x008d:
            return r2
        L_0x008e:
            r12 = move-exception
            monitor-exit(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnectionPool.b(long):long");
    }

    public final boolean c(RealConnection realConnection) {
        Intrinsics.i(realConnection, "connection");
        if (Util.f42805h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        } else if (realConnection.q() || this.f42960a == 0) {
            realConnection.E(true);
            this.f42964e.remove(realConnection);
            if (this.f42964e.isEmpty()) {
                this.f42962c.a();
            }
            return true;
        } else {
            TaskQueue.j(this.f42962c, this.f42963d, 0, 2, (Object) null);
            return false;
        }
    }

    public final int d(RealConnection realConnection, long j2) {
        if (!Util.f42805h || Thread.holdsLock(realConnection)) {
            List o2 = realConnection.o();
            int i2 = 0;
            while (i2 < o2.size()) {
                Reference reference = (Reference) o2.get(i2);
                if (reference.get() != null) {
                    i2++;
                } else {
                    Intrinsics.g(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                    Platform.f43200a.g().m("A connection to " + realConnection.B().a().l() + " was leaked. Did you forget to close a response body?", ((RealCall.CallReference) reference).a());
                    o2.remove(i2);
                    realConnection.E(true);
                    if (o2.isEmpty()) {
                        realConnection.D(j2 - this.f42961b);
                        return 0;
                    }
                }
            }
            return o2.size();
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
    }

    public final void e(RealConnection realConnection) {
        Intrinsics.i(realConnection, "connection");
        if (!Util.f42805h || Thread.holdsLock(realConnection)) {
            this.f42964e.add(realConnection);
            TaskQueue.j(this.f42962c, this.f42963d, 0, 2, (Object) null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
    }
}
