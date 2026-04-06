package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
public class CycleDetectingLockFactory {

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentMap f29452b = new MapMaker().h().f();

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f29453c = Logger.getLogger(CycleDetectingLockFactory.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal f29454d = new ThreadLocal<ArrayList<LockGraphNode>>() {
        /* renamed from: a */
        public ArrayList initialValue() {
            return Lists.k(3);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final Policy f29455a;

    public interface CycleDetectingLock {
        LockGraphNode a();

        boolean b();
    }

    public final class CycleDetectingReentrantReadWriteLock extends ReentrantReadWriteLock implements CycleDetectingLock {

        /* renamed from: A  reason: collision with root package name */
        public final CycleDetectingReentrantWriteLock f29460A;

        /* renamed from: B  reason: collision with root package name */
        public final LockGraphNode f29461B;

        /* renamed from: z  reason: collision with root package name */
        public final CycleDetectingReentrantReadLock f29462z;

        public LockGraphNode a() {
            return this.f29461B;
        }

        public boolean b() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }

        public ReentrantReadWriteLock.ReadLock readLock() {
            return this.f29462z;
        }

        public ReentrantReadWriteLock.WriteLock writeLock() {
            return this.f29460A;
        }
    }

    public static class ExampleStackTrace extends IllegalStateException {

        /* renamed from: A  reason: collision with root package name */
        public static final ImmutableSet f29465A = ImmutableSet.F(CycleDetectingLockFactory.class.getName(), ExampleStackTrace.class.getName(), LockGraphNode.class.getName());

        /* renamed from: z  reason: collision with root package name */
        public static final StackTraceElement[] f29466z = new StackTraceElement[0];

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ExampleStackTrace(com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r4, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r5) {
            /*
                r3 = this;
                java.lang.String r4 = r4.d()
                java.lang.String r5 = r5.d()
                java.lang.String r0 = java.lang.String.valueOf(r4)
                int r0 = r0.length()
                int r0 = r0 + 4
                java.lang.String r1 = java.lang.String.valueOf(r5)
                int r1 = r1.length()
                int r0 = r0 + r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                r1.append(r4)
                java.lang.String r4 = " -> "
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = r1.toString()
                r3.<init>(r4)
                java.lang.StackTraceElement[] r4 = r3.getStackTrace()
                int r5 = r4.length
                r0 = 0
            L_0x0038:
                if (r0 >= r5) goto L_0x006d
                java.lang.Class<com.google.common.util.concurrent.CycleDetectingLockFactory$WithExplicitOrdering> r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.WithExplicitOrdering.class
                java.lang.String r1 = r1.getName()
                r2 = r4[r0]
                java.lang.String r2 = r2.getClassName()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0052
                java.lang.StackTraceElement[] r4 = f29466z
                r3.setStackTrace(r4)
                goto L_0x006d
            L_0x0052:
                com.google.common.collect.ImmutableSet r1 = f29465A
                r2 = r4[r0]
                java.lang.String r2 = r2.getClassName()
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L_0x006a
                java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r4, r0, r5)
                java.lang.StackTraceElement[] r4 = (java.lang.StackTraceElement[]) r4
                r3.setStackTrace(r4)
                goto L_0x006d
            L_0x006a:
                int r0 = r0 + 1
                goto L_0x0038
            L_0x006d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace.<init>(com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode):void");
        }
    }

    public static class LockGraphNode {

        /* renamed from: a  reason: collision with root package name */
        public final Map f29467a;

        /* renamed from: b  reason: collision with root package name */
        public final Map f29468b;

        /* renamed from: c  reason: collision with root package name */
        public final String f29469c;

        public void a(Policy policy, LockGraphNode lockGraphNode) {
            Preconditions.z(this != lockGraphNode, "Attempted to acquire multiple locks with the same rank %s", lockGraphNode.d());
            if (!this.f29467a.containsKey(lockGraphNode)) {
                PotentialDeadlockException potentialDeadlockException = (PotentialDeadlockException) this.f29468b.get(lockGraphNode);
                if (potentialDeadlockException != null) {
                    policy.d(new PotentialDeadlockException(lockGraphNode, this, potentialDeadlockException.a()));
                    return;
                }
                ExampleStackTrace c2 = lockGraphNode.c(this, Sets.j());
                if (c2 == null) {
                    this.f29467a.put(lockGraphNode, new ExampleStackTrace(lockGraphNode, this));
                    return;
                }
                PotentialDeadlockException potentialDeadlockException2 = new PotentialDeadlockException(lockGraphNode, this, c2);
                this.f29468b.put(lockGraphNode, potentialDeadlockException2);
                policy.d(potentialDeadlockException2);
            }
        }

        public void b(Policy policy, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a(policy, (LockGraphNode) it.next());
            }
        }

        public final ExampleStackTrace c(LockGraphNode lockGraphNode, Set set) {
            if (!set.add(this)) {
                return null;
            }
            ExampleStackTrace exampleStackTrace = (ExampleStackTrace) this.f29467a.get(lockGraphNode);
            if (exampleStackTrace != null) {
                return exampleStackTrace;
            }
            for (Map.Entry entry : this.f29467a.entrySet()) {
                LockGraphNode lockGraphNode2 = (LockGraphNode) entry.getKey();
                ExampleStackTrace c2 = lockGraphNode2.c(lockGraphNode, set);
                if (c2 != null) {
                    ExampleStackTrace exampleStackTrace2 = new ExampleStackTrace(lockGraphNode2, this);
                    exampleStackTrace2.setStackTrace(((ExampleStackTrace) entry.getValue()).getStackTrace());
                    exampleStackTrace2.initCause(c2);
                    return exampleStackTrace2;
                }
            }
            return null;
        }

        public String d() {
            return this.f29469c;
        }
    }

    public enum Policies implements Policy {
        THROW {
            public void d(PotentialDeadlockException potentialDeadlockException) {
                throw potentialDeadlockException;
            }
        },
        WARN {
            public void d(PotentialDeadlockException potentialDeadlockException) {
                CycleDetectingLockFactory.f29453c.log(Level.SEVERE, "Detected potential deadlock", potentialDeadlockException);
            }
        },
        DISABLED {
            public void d(PotentialDeadlockException potentialDeadlockException) {
            }
        }
    }

    public interface Policy {
        void d(PotentialDeadlockException potentialDeadlockException);
    }

    public static final class PotentialDeadlockException extends ExampleStackTrace {

        /* renamed from: B  reason: collision with root package name */
        public final ExampleStackTrace f29473B;

        public ExampleStackTrace a() {
            return this.f29473B;
        }

        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb = new StringBuilder(message);
            for (Throwable th = this.f29473B; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }

        public PotentialDeadlockException(LockGraphNode lockGraphNode, LockGraphNode lockGraphNode2, ExampleStackTrace exampleStackTrace) {
            super(lockGraphNode, lockGraphNode2);
            this.f29473B = exampleStackTrace;
            initCause(exampleStackTrace);
        }
    }

    public static final class WithExplicitOrdering<E extends Enum<E>> extends CycleDetectingLockFactory {
    }

    public static void e(CycleDetectingLock cycleDetectingLock) {
        if (!cycleDetectingLock.b()) {
            ArrayList arrayList = (ArrayList) f29454d.get();
            LockGraphNode a2 = cycleDetectingLock.a();
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == a2) {
                    arrayList.remove(size);
                    return;
                }
            }
        }
    }

    public final void a(CycleDetectingLock cycleDetectingLock) {
        if (!cycleDetectingLock.b()) {
            ArrayList arrayList = (ArrayList) f29454d.get();
            LockGraphNode a2 = cycleDetectingLock.a();
            a2.b(this.f29455a, arrayList);
            arrayList.add(a2);
        }
    }

    public final class CycleDetectingReentrantLock extends ReentrantLock implements CycleDetectingLock {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ CycleDetectingLockFactory f29456A;

        /* renamed from: z  reason: collision with root package name */
        public final LockGraphNode f29457z;

        public LockGraphNode a() {
            return this.f29457z;
        }

        public boolean b() {
            return isHeldByCurrentThread();
        }

        public void lock() {
            this.f29456A.a(this);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.e(this);
            }
        }

        public void lockInterruptibly() {
            this.f29456A.a(this);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.e(this);
            }
        }

        public boolean tryLock() {
            this.f29456A.a(this);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.e(this);
            }
        }

        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.e(this);
            }
        }

        public boolean tryLock(long j2, TimeUnit timeUnit) {
            this.f29456A.a(this);
            try {
                return super.tryLock(j2, timeUnit);
            } finally {
                CycleDetectingLockFactory.e(this);
            }
        }
    }

    public class CycleDetectingReentrantReadLock extends ReentrantReadWriteLock.ReadLock {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ CycleDetectingLockFactory f29458A;

        /* renamed from: z  reason: collision with root package name */
        public final CycleDetectingReentrantReadWriteLock f29459z;

        public void lock() {
            this.f29458A.a(this.f29459z);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.e(this.f29459z);
            }
        }

        public void lockInterruptibly() {
            this.f29458A.a(this.f29459z);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.e(this.f29459z);
            }
        }

        public boolean tryLock() {
            this.f29458A.a(this.f29459z);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.e(this.f29459z);
            }
        }

        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.e(this.f29459z);
            }
        }

        public boolean tryLock(long j2, TimeUnit timeUnit) {
            this.f29458A.a(this.f29459z);
            try {
                return super.tryLock(j2, timeUnit);
            } finally {
                CycleDetectingLockFactory.e(this.f29459z);
            }
        }
    }

    public class CycleDetectingReentrantWriteLock extends ReentrantReadWriteLock.WriteLock {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ CycleDetectingLockFactory f29463A;

        /* renamed from: z  reason: collision with root package name */
        public final CycleDetectingReentrantReadWriteLock f29464z;

        public void lock() {
            this.f29463A.a(this.f29464z);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.e(this.f29464z);
            }
        }

        public void lockInterruptibly() {
            this.f29463A.a(this.f29464z);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.e(this.f29464z);
            }
        }

        public boolean tryLock() {
            this.f29463A.a(this.f29464z);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.e(this.f29464z);
            }
        }

        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.e(this.f29464z);
            }
        }

        public boolean tryLock(long j2, TimeUnit timeUnit) {
            this.f29463A.a(this.f29464z);
            try {
                return super.tryLock(j2, timeUnit);
            } finally {
                CycleDetectingLockFactory.e(this.f29464z);
            }
        }
    }
}
