package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap.InternalEntry;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

class MapMakerInternalMap<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final WeakValueReference I = new WeakValueReference<Object, Object, DummyInternalEntry>() {
        /* renamed from: b */
        public WeakValueReference a(ReferenceQueue referenceQueue, DummyInternalEntry dummyInternalEntry) {
            return this;
        }

        public void clear() {
        }

        /* renamed from: d */
        public DummyInternalEntry c() {
            return null;
        }

        public Object get() {
            return null;
        }
    };

    /* renamed from: A  reason: collision with root package name */
    public final transient int f28329A;

    /* renamed from: B  reason: collision with root package name */
    public final transient Segment[] f28330B;
    public final int C;
    public final Equivalence D;
    public final transient InternalEntryHelper E;
    public transient Set F;
    public transient Collection G;
    public transient Set H;

    /* renamed from: z  reason: collision with root package name */
    public final transient int f28331z;

    public static abstract class AbstractSerializationProxy<K, V> extends ForwardingConcurrentMap<K, V> implements Serializable {

        /* renamed from: z  reason: collision with root package name */
        public transient ConcurrentMap f28332z;

        /* renamed from: S */
        public ConcurrentMap Q() {
            return this.f28332z;
        }
    }

    public static abstract class AbstractStrongKeyEntry<K, V, E extends InternalEntry<K, V, E>> implements InternalEntry<K, V, E> {

        /* renamed from: A  reason: collision with root package name */
        public final int f28333A;

        /* renamed from: B  reason: collision with root package name */
        public final InternalEntry f28334B;

        /* renamed from: z  reason: collision with root package name */
        public final Object f28335z;

        public AbstractStrongKeyEntry(Object obj, int i2, InternalEntry internalEntry) {
            this.f28335z = obj;
            this.f28333A = i2;
            this.f28334B = internalEntry;
        }

        public InternalEntry f() {
            return this.f28334B;
        }

        public Object getKey() {
            return this.f28335z;
        }

        public int h() {
            return this.f28333A;
        }
    }

    public static abstract class AbstractWeakKeyEntry<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<K> implements InternalEntry<K, V, E> {

        /* renamed from: A  reason: collision with root package name */
        public final InternalEntry f28336A;

        /* renamed from: z  reason: collision with root package name */
        public final int f28337z;

        public AbstractWeakKeyEntry(ReferenceQueue referenceQueue, Object obj, int i2, InternalEntry internalEntry) {
            super(obj, referenceQueue);
            this.f28337z = i2;
            this.f28336A = internalEntry;
        }

        public InternalEntry f() {
            return this.f28336A;
        }

        public Object getKey() {
            return get();
        }

        public int h() {
            return this.f28337z;
        }
    }

    public static final class CleanupMapTask implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public final WeakReference f28338z;

        public void run() {
            MapMakerInternalMap mapMakerInternalMap = (MapMakerInternalMap) this.f28338z.get();
            if (mapMakerInternalMap != null) {
                for (Segment B2 : mapMakerInternalMap.f28330B) {
                    B2.B();
                }
                return;
            }
            throw new CancellationException();
        }
    }

    public static final class DummyInternalEntry implements InternalEntry<Object, Object, DummyInternalEntry> {
        /* renamed from: a */
        public DummyInternalEntry f() {
            throw new AssertionError();
        }

        public Object getKey() {
            throw new AssertionError();
        }

        public Object getValue() {
            throw new AssertionError();
        }

        public int h() {
            throw new AssertionError();
        }
    }

    public final class EntryIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<Map.Entry<K, V>> {
        public EntryIterator(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        /* renamed from: g */
        public Map.Entry next() {
            return d();
        }
    }

    public final class EntrySet extends SafeToArraySet<Map.Entry<K, V>> {
        public EntrySet() {
            super();
        }

        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
            r0 = r3.f28339z.get((r0 = r4.getKey()));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean contains(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x000f
                return r1
            L_0x000f:
                com.google.common.collect.MapMakerInternalMap r2 = com.google.common.collect.MapMakerInternalMap.this
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L_0x0028
                com.google.common.collect.MapMakerInternalMap r2 = com.google.common.collect.MapMakerInternalMap.this
                com.google.common.base.Equivalence r2 = r2.p()
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.d(r4, r0)
                if (r4 == 0) goto L_0x0028
                r1 = 1
            L_0x0028:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.EntrySet.contains(java.lang.Object):boolean");
        }

        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public Iterator iterator() {
            return new EntryIterator(MapMakerInternalMap.this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
            r0 = r4.getKey();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 == 0) goto L_0x001b
                com.google.common.collect.MapMakerInternalMap r2 = com.google.common.collect.MapMakerInternalMap.this
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L_0x001b
                r1 = 1
            L_0x001b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.EntrySet.remove(java.lang.Object):boolean");
        }

        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    public abstract class HashIterator<T> implements Iterator<T> {

        /* renamed from: A  reason: collision with root package name */
        public int f28340A = -1;

        /* renamed from: B  reason: collision with root package name */
        public Segment f28341B;
        public AtomicReferenceArray C;
        public InternalEntry D;
        public WriteThroughEntry E;
        public WriteThroughEntry F;

        /* renamed from: z  reason: collision with root package name */
        public int f28342z;

        public HashIterator() {
            this.f28342z = MapMakerInternalMap.this.f28330B.length - 1;
            b();
        }

        public final void b() {
            this.E = null;
            if (!e() && !f()) {
                while (true) {
                    int i2 = this.f28342z;
                    if (i2 >= 0) {
                        Segment[] segmentArr = MapMakerInternalMap.this.f28330B;
                        this.f28342z = i2 - 1;
                        Segment segment = segmentArr[i2];
                        this.f28341B = segment;
                        if (segment.f28344A != 0) {
                            AtomicReferenceArray atomicReferenceArray = this.f28341B.D;
                            this.C = atomicReferenceArray;
                            this.f28340A = atomicReferenceArray.length() - 1;
                            if (f()) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* JADX INFO: finally extract failed */
        public boolean c(InternalEntry internalEntry) {
            try {
                Object key = internalEntry.getKey();
                Object f2 = MapMakerInternalMap.this.f(internalEntry);
                if (f2 != null) {
                    this.E = new WriteThroughEntry(key, f2);
                    this.f28341B.r();
                    return true;
                }
                this.f28341B.r();
                return false;
            } catch (Throwable th) {
                this.f28341B.r();
                throw th;
            }
        }

        public WriteThroughEntry d() {
            WriteThroughEntry writeThroughEntry = this.E;
            if (writeThroughEntry != null) {
                this.F = writeThroughEntry;
                b();
                return this.F;
            }
            throw new NoSuchElementException();
        }

        public boolean e() {
            InternalEntry internalEntry = this.D;
            if (internalEntry == null) {
                return false;
            }
            while (true) {
                this.D = internalEntry.f();
                InternalEntry internalEntry2 = this.D;
                if (internalEntry2 == null) {
                    return false;
                }
                if (c(internalEntry2)) {
                    return true;
                }
                internalEntry = this.D;
            }
        }

        public boolean f() {
            while (true) {
                int i2 = this.f28340A;
                if (i2 < 0) {
                    return false;
                }
                AtomicReferenceArray atomicReferenceArray = this.C;
                this.f28340A = i2 - 1;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(i2);
                this.D = internalEntry;
                if (internalEntry != null && (c(internalEntry) || e())) {
                    return true;
                }
            }
        }

        public boolean hasNext() {
            return this.E != null;
        }

        public void remove() {
            CollectPreconditions.e(this.F != null);
            MapMakerInternalMap.this.remove(this.F.getKey());
            this.F = null;
        }
    }

    public interface InternalEntry<K, V, E extends InternalEntry<K, V, E>> {
        InternalEntry f();

        Object getKey();

        Object getValue();

        int h();
    }

    public interface InternalEntryHelper<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> {
        InternalEntry a(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2);

        Strength b();

        void c(Segment segment, InternalEntry internalEntry, Object obj);

        Segment d(MapMakerInternalMap mapMakerInternalMap, int i2, int i3);

        InternalEntry e(Segment segment, Object obj, int i2, InternalEntry internalEntry);
    }

    public final class KeyIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<K> {
        public KeyIterator(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        public Object next() {
            return d().getKey();
        }
    }

    public final class KeySet extends SafeToArraySet<K> {
        public KeySet() {
            super();
        }

        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public Iterator iterator() {
            return new KeyIterator(MapMakerInternalMap.this);
        }

        public boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    public static abstract class SafeToArraySet<E> extends AbstractSet<E> {
        public SafeToArraySet() {
        }

        public Object[] toArray() {
            return MapMakerInternalMap.n(this).toArray();
        }

        public Object[] toArray(Object[] objArr) {
            return MapMakerInternalMap.n(this).toArray(objArr);
        }
    }

    public static abstract class Segment<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {

        /* renamed from: A  reason: collision with root package name */
        public volatile int f28344A;

        /* renamed from: B  reason: collision with root package name */
        public int f28345B;
        public int C;
        public volatile AtomicReferenceArray D;
        public final int E;
        public final AtomicInteger F = new AtomicInteger();

        /* renamed from: z  reason: collision with root package name */
        public final MapMakerInternalMap f28346z;

        public Segment(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
            this.f28346z = mapMakerInternalMap;
            this.E = i3;
            m(q(i2));
        }

        public static boolean n(InternalEntry internalEntry) {
            return internalEntry.getValue() == null;
        }

        public boolean A(Object obj, int i2, Object obj2, Object obj3) {
            lock();
            try {
                s();
                AtomicReferenceArray atomicReferenceArray = this.D;
                int length = (atomicReferenceArray.length() - 1) & i2;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                InternalEntry internalEntry2 = internalEntry;
                while (internalEntry2 != null) {
                    Object key = internalEntry2.getKey();
                    if (internalEntry2.h() != i2 || key == null || !this.f28346z.D.d(obj, key)) {
                        internalEntry2 = internalEntry2.f();
                    } else {
                        Object value = internalEntry2.getValue();
                        if (value == null) {
                            if (n(internalEntry2)) {
                                this.f28345B++;
                                atomicReferenceArray.set(length, y(internalEntry, internalEntry2));
                                this.f28344A--;
                            }
                            return false;
                        } else if (this.f28346z.p().d(obj2, value)) {
                            this.f28345B++;
                            E(internalEntry2, obj3);
                            unlock();
                            return true;
                        } else {
                            unlock();
                            return false;
                        }
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        public void B() {
            C();
        }

        public void C() {
            if (tryLock()) {
                try {
                    p();
                    this.F.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract Segment D();

        public void E(InternalEntry internalEntry, Object obj) {
            this.f28346z.E.c(D(), internalEntry, obj);
        }

        public void F() {
            if (tryLock()) {
                try {
                    p();
                } finally {
                    unlock();
                }
            }
        }

        public void a() {
            if (this.f28344A != 0) {
                lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = this.D;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, (Object) null);
                    }
                    o();
                    this.F.set(0);
                    this.f28345B++;
                    this.f28344A = 0;
                    unlock();
                } catch (Throwable th) {
                    unlock();
                    throw th;
                }
            }
        }

        public void b(ReferenceQueue referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        public boolean c(Object obj, int i2) {
            try {
                boolean z2 = false;
                if (this.f28344A != 0) {
                    InternalEntry k2 = k(obj, i2);
                    if (!(k2 == null || k2.getValue() == null)) {
                        z2 = true;
                    }
                    return z2;
                }
                r();
                return false;
            } finally {
                r();
            }
        }

        public InternalEntry d(InternalEntry internalEntry, InternalEntry internalEntry2) {
            return this.f28346z.E.a(D(), internalEntry, internalEntry2);
        }

        public void e(ReferenceQueue referenceQueue) {
            int i2 = 0;
            do {
                Reference poll = referenceQueue.poll();
                if (poll != null) {
                    this.f28346z.i((InternalEntry) poll);
                    i2++;
                } else {
                    return;
                }
            } while (i2 != 16);
        }

        public void f(ReferenceQueue referenceQueue) {
            int i2 = 0;
            do {
                Reference poll = referenceQueue.poll();
                if (poll != null) {
                    this.f28346z.j((WeakValueReference) poll);
                    i2++;
                } else {
                    return;
                }
            } while (i2 != 16);
        }

        public void g() {
            AtomicReferenceArray atomicReferenceArray = this.D;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i2 = this.f28344A;
                AtomicReferenceArray q2 = q(length << 1);
                this.C = (q2.length() * 3) / 4;
                int length2 = q2.length() - 1;
                for (int i3 = 0; i3 < length; i3++) {
                    InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(i3);
                    if (internalEntry != null) {
                        InternalEntry f2 = internalEntry.f();
                        int h2 = internalEntry.h() & length2;
                        if (f2 == null) {
                            q2.set(h2, internalEntry);
                        } else {
                            InternalEntry internalEntry2 = internalEntry;
                            while (f2 != null) {
                                int h3 = f2.h() & length2;
                                if (h3 != h2) {
                                    internalEntry2 = f2;
                                    h2 = h3;
                                }
                                f2 = f2.f();
                            }
                            q2.set(h2, internalEntry2);
                            while (internalEntry != internalEntry2) {
                                int h4 = internalEntry.h() & length2;
                                InternalEntry d2 = d(internalEntry, (InternalEntry) q2.get(h4));
                                if (d2 != null) {
                                    q2.set(h4, d2);
                                } else {
                                    i2--;
                                }
                                internalEntry = internalEntry.f();
                            }
                        }
                    }
                }
                this.D = q2;
                this.f28344A = i2;
            }
        }

        /* JADX INFO: finally extract failed */
        public Object h(Object obj, int i2) {
            try {
                InternalEntry k2 = k(obj, i2);
                if (k2 == null) {
                    r();
                    return null;
                }
                Object value = k2.getValue();
                if (value == null) {
                    F();
                }
                r();
                return value;
            } catch (Throwable th) {
                r();
                throw th;
            }
        }

        public InternalEntry i(Object obj, int i2) {
            if (this.f28344A == 0) {
                return null;
            }
            for (InternalEntry j2 = j(i2); j2 != null; j2 = j2.f()) {
                if (j2.h() == i2) {
                    Object key = j2.getKey();
                    if (key == null) {
                        F();
                    } else if (this.f28346z.D.d(obj, key)) {
                        return j2;
                    }
                }
            }
            return null;
        }

        public InternalEntry j(int i2) {
            AtomicReferenceArray atomicReferenceArray = this.D;
            return (InternalEntry) atomicReferenceArray.get(i2 & (atomicReferenceArray.length() - 1));
        }

        public InternalEntry k(Object obj, int i2) {
            return i(obj, i2);
        }

        public Object l(InternalEntry internalEntry) {
            if (internalEntry.getKey() == null) {
                F();
                return null;
            }
            Object value = internalEntry.getValue();
            if (value != null) {
                return value;
            }
            F();
            return null;
        }

        public void m(AtomicReferenceArray atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.C = length;
            if (length == this.E) {
                this.C = length + 1;
            }
            this.D = atomicReferenceArray;
        }

        public void o() {
        }

        public void p() {
        }

        public AtomicReferenceArray q(int i2) {
            return new AtomicReferenceArray(i2);
        }

        public void r() {
            if ((this.F.incrementAndGet() & 63) == 0) {
                B();
            }
        }

        public void s() {
            C();
        }

        public Object t(Object obj, int i2, Object obj2, boolean z2) {
            lock();
            try {
                s();
                int i3 = this.f28344A + 1;
                if (i3 > this.C) {
                    g();
                    i3 = this.f28344A + 1;
                }
                AtomicReferenceArray atomicReferenceArray = this.D;
                int length = (atomicReferenceArray.length() - 1) & i2;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                InternalEntry internalEntry2 = internalEntry;
                while (internalEntry2 != null) {
                    Object key = internalEntry2.getKey();
                    if (internalEntry2.h() != i2 || key == null || !this.f28346z.D.d(obj, key)) {
                        internalEntry2 = internalEntry2.f();
                    } else {
                        Object value = internalEntry2.getValue();
                        if (value == null) {
                            this.f28345B++;
                            E(internalEntry2, obj2);
                            this.f28344A = this.f28344A;
                            unlock();
                            return null;
                        } else if (z2) {
                            unlock();
                            return value;
                        } else {
                            this.f28345B++;
                            E(internalEntry2, obj2);
                            unlock();
                            return value;
                        }
                    }
                }
                this.f28345B++;
                InternalEntry e2 = this.f28346z.E.e(D(), obj, i2, internalEntry);
                E(e2, obj2);
                atomicReferenceArray.set(length, e2);
                this.f28344A = i3;
                unlock();
                return null;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }

        public boolean u(InternalEntry internalEntry, int i2) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.D;
                int length = i2 & (atomicReferenceArray.length() - 1);
                InternalEntry internalEntry2 = (InternalEntry) atomicReferenceArray.get(length);
                for (InternalEntry internalEntry3 = internalEntry2; internalEntry3 != null; internalEntry3 = internalEntry3.f()) {
                    if (internalEntry3 == internalEntry) {
                        this.f28345B++;
                        atomicReferenceArray.set(length, y(internalEntry2, internalEntry3));
                        this.f28344A--;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        public boolean v(Object obj, int i2, WeakValueReference weakValueReference) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.D;
                int length = (atomicReferenceArray.length() - 1) & i2;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                InternalEntry internalEntry2 = internalEntry;
                while (internalEntry2 != null) {
                    Object key = internalEntry2.getKey();
                    if (internalEntry2.h() != i2 || key == null || !this.f28346z.D.d(obj, key)) {
                        internalEntry2 = internalEntry2.f();
                    } else if (((WeakValueEntry) internalEntry2).d() == weakValueReference) {
                        this.f28345B++;
                        atomicReferenceArray.set(length, y(internalEntry, internalEntry2));
                        this.f28344A--;
                        return true;
                    } else {
                        unlock();
                        return false;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        public Object w(Object obj, int i2) {
            lock();
            try {
                s();
                AtomicReferenceArray atomicReferenceArray = this.D;
                int length = (atomicReferenceArray.length() - 1) & i2;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                InternalEntry internalEntry2 = internalEntry;
                while (internalEntry2 != null) {
                    Object key = internalEntry2.getKey();
                    if (internalEntry2.h() != i2 || key == null || !this.f28346z.D.d(obj, key)) {
                        internalEntry2 = internalEntry2.f();
                    } else {
                        Object value = internalEntry2.getValue();
                        if (value == null) {
                            if (!n(internalEntry2)) {
                                unlock();
                                return null;
                            }
                        }
                        this.f28345B++;
                        atomicReferenceArray.set(length, y(internalEntry, internalEntry2));
                        this.f28344A--;
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        public boolean x(Object obj, int i2, Object obj2) {
            lock();
            try {
                s();
                AtomicReferenceArray atomicReferenceArray = this.D;
                int length = (atomicReferenceArray.length() - 1) & i2;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                InternalEntry internalEntry2 = internalEntry;
                while (true) {
                    boolean z2 = false;
                    if (internalEntry2 != null) {
                        Object key = internalEntry2.getKey();
                        if (internalEntry2.h() != i2 || key == null || !this.f28346z.D.d(obj, key)) {
                            internalEntry2 = internalEntry2.f();
                        } else {
                            if (this.f28346z.p().d(obj2, internalEntry2.getValue())) {
                                z2 = true;
                            } else if (!n(internalEntry2)) {
                                unlock();
                                return false;
                            }
                            this.f28345B++;
                            atomicReferenceArray.set(length, y(internalEntry, internalEntry2));
                            this.f28344A--;
                            return z2;
                        }
                    } else {
                        unlock();
                        return false;
                    }
                }
            } finally {
                unlock();
            }
        }

        public InternalEntry y(InternalEntry internalEntry, InternalEntry internalEntry2) {
            int i2 = this.f28344A;
            InternalEntry f2 = internalEntry2.f();
            while (internalEntry != internalEntry2) {
                InternalEntry d2 = d(internalEntry, f2);
                if (d2 != null) {
                    f2 = d2;
                } else {
                    i2--;
                }
                internalEntry = internalEntry.f();
            }
            this.f28344A = i2;
            return f2;
        }

        public Object z(Object obj, int i2, Object obj2) {
            lock();
            try {
                s();
                AtomicReferenceArray atomicReferenceArray = this.D;
                int length = (atomicReferenceArray.length() - 1) & i2;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                InternalEntry internalEntry2 = internalEntry;
                while (internalEntry2 != null) {
                    Object key = internalEntry2.getKey();
                    if (internalEntry2.h() != i2 || key == null || !this.f28346z.D.d(obj, key)) {
                        internalEntry2 = internalEntry2.f();
                    } else {
                        Object value = internalEntry2.getValue();
                        if (value == null) {
                            if (n(internalEntry2)) {
                                this.f28345B++;
                                atomicReferenceArray.set(length, y(internalEntry, internalEntry2));
                                this.f28344A--;
                            }
                            return null;
                        }
                        this.f28345B++;
                        E(internalEntry2, obj2);
                        unlock();
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }
    }

    public static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
    }

    public enum Strength {
        STRONG {
            public Equivalence f() {
                return Equivalence.c();
            }
        },
        WEAK {
            public Equivalence f() {
                return Equivalence.f();
            }
        };

        public abstract Equivalence f();
    }

    public static final class StrongKeyDummyValueEntry<K> extends AbstractStrongKeyEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> {

        public static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {

            /* renamed from: a  reason: collision with root package name */
            public static final Helper f28350a = new Helper();

            public Strength b() {
                return Strength.STRONG;
            }

            /* renamed from: f */
            public StrongKeyDummyValueEntry a(StrongKeyDummyValueSegment strongKeyDummyValueSegment, StrongKeyDummyValueEntry strongKeyDummyValueEntry, StrongKeyDummyValueEntry strongKeyDummyValueEntry2) {
                return strongKeyDummyValueEntry.a(strongKeyDummyValueEntry2);
            }

            /* renamed from: g */
            public StrongKeyDummyValueEntry e(StrongKeyDummyValueSegment strongKeyDummyValueSegment, Object obj, int i2, StrongKeyDummyValueEntry strongKeyDummyValueEntry) {
                return new StrongKeyDummyValueEntry(obj, i2, strongKeyDummyValueEntry);
            }

            /* renamed from: h */
            public StrongKeyDummyValueSegment d(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
                return new StrongKeyDummyValueSegment(mapMakerInternalMap, i2, i3);
            }

            /* renamed from: i */
            public void c(StrongKeyDummyValueSegment strongKeyDummyValueSegment, StrongKeyDummyValueEntry strongKeyDummyValueEntry, MapMaker.Dummy dummy) {
            }
        }

        public StrongKeyDummyValueEntry(Object obj, int i2, StrongKeyDummyValueEntry strongKeyDummyValueEntry) {
            super(obj, i2, strongKeyDummyValueEntry);
        }

        public StrongKeyDummyValueEntry a(StrongKeyDummyValueEntry strongKeyDummyValueEntry) {
            return new StrongKeyDummyValueEntry(this.f28335z, this.f28333A, strongKeyDummyValueEntry);
        }

        /* renamed from: b */
        public MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    public static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {
        public StrongKeyDummyValueSegment(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
            super(mapMakerInternalMap, i2, i3);
        }

        /* renamed from: G */
        public StrongKeyDummyValueSegment D() {
            return this;
        }
    }

    public static final class StrongKeyStrongValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, StrongKeyStrongValueEntry<K, V>> {
        public volatile Object C = null;

        public static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            public static final Helper f28351a = new Helper();

            public static Helper g() {
                return f28351a;
            }

            public Strength b() {
                return Strength.STRONG;
            }

            /* renamed from: f */
            public StrongKeyStrongValueEntry a(StrongKeyStrongValueSegment strongKeyStrongValueSegment, StrongKeyStrongValueEntry strongKeyStrongValueEntry, StrongKeyStrongValueEntry strongKeyStrongValueEntry2) {
                return strongKeyStrongValueEntry.a(strongKeyStrongValueEntry2);
            }

            /* renamed from: h */
            public StrongKeyStrongValueEntry e(StrongKeyStrongValueSegment strongKeyStrongValueSegment, Object obj, int i2, StrongKeyStrongValueEntry strongKeyStrongValueEntry) {
                return new StrongKeyStrongValueEntry(obj, i2, strongKeyStrongValueEntry);
            }

            /* renamed from: i */
            public StrongKeyStrongValueSegment d(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
                return new StrongKeyStrongValueSegment(mapMakerInternalMap, i2, i3);
            }

            /* renamed from: j */
            public void c(StrongKeyStrongValueSegment strongKeyStrongValueSegment, StrongKeyStrongValueEntry strongKeyStrongValueEntry, Object obj) {
                strongKeyStrongValueEntry.b(obj);
            }
        }

        public StrongKeyStrongValueEntry(Object obj, int i2, StrongKeyStrongValueEntry strongKeyStrongValueEntry) {
            super(obj, i2, strongKeyStrongValueEntry);
        }

        public StrongKeyStrongValueEntry a(StrongKeyStrongValueEntry strongKeyStrongValueEntry) {
            StrongKeyStrongValueEntry strongKeyStrongValueEntry2 = new StrongKeyStrongValueEntry(this.f28335z, this.f28333A, strongKeyStrongValueEntry);
            strongKeyStrongValueEntry2.C = this.C;
            return strongKeyStrongValueEntry2;
        }

        public void b(Object obj) {
            this.C = obj;
        }

        public Object getValue() {
            return this.C;
        }
    }

    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {
        public StrongKeyStrongValueSegment(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
            super(mapMakerInternalMap, i2, i3);
        }

        /* renamed from: G */
        public StrongKeyStrongValueSegment D() {
            return this;
        }
    }

    public static final class StrongKeyWeakValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, StrongKeyWeakValueEntry<K, V>> {
        public volatile WeakValueReference C = MapMakerInternalMap.o();

        public static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            public static final Helper f28352a = new Helper();

            public static Helper g() {
                return f28352a;
            }

            public Strength b() {
                return Strength.WEAK;
            }

            /* renamed from: f */
            public StrongKeyWeakValueEntry a(StrongKeyWeakValueSegment strongKeyWeakValueSegment, StrongKeyWeakValueEntry strongKeyWeakValueEntry, StrongKeyWeakValueEntry strongKeyWeakValueEntry2) {
                if (Segment.n(strongKeyWeakValueEntry)) {
                    return null;
                }
                return strongKeyWeakValueEntry.a(strongKeyWeakValueSegment.G, strongKeyWeakValueEntry2);
            }

            /* renamed from: h */
            public StrongKeyWeakValueEntry e(StrongKeyWeakValueSegment strongKeyWeakValueSegment, Object obj, int i2, StrongKeyWeakValueEntry strongKeyWeakValueEntry) {
                return new StrongKeyWeakValueEntry(obj, i2, strongKeyWeakValueEntry);
            }

            /* renamed from: i */
            public StrongKeyWeakValueSegment d(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
                return new StrongKeyWeakValueSegment(mapMakerInternalMap, i2, i3);
            }

            /* renamed from: j */
            public void c(StrongKeyWeakValueSegment strongKeyWeakValueSegment, StrongKeyWeakValueEntry strongKeyWeakValueEntry, Object obj) {
                strongKeyWeakValueEntry.b(obj, strongKeyWeakValueSegment.G);
            }
        }

        public StrongKeyWeakValueEntry(Object obj, int i2, StrongKeyWeakValueEntry strongKeyWeakValueEntry) {
            super(obj, i2, strongKeyWeakValueEntry);
        }

        public StrongKeyWeakValueEntry a(ReferenceQueue referenceQueue, StrongKeyWeakValueEntry strongKeyWeakValueEntry) {
            StrongKeyWeakValueEntry strongKeyWeakValueEntry2 = new StrongKeyWeakValueEntry(this.f28335z, this.f28333A, strongKeyWeakValueEntry);
            strongKeyWeakValueEntry2.C = this.C.a(referenceQueue, strongKeyWeakValueEntry2);
            return strongKeyWeakValueEntry2;
        }

        public void b(Object obj, ReferenceQueue referenceQueue) {
            WeakValueReference weakValueReference = this.C;
            this.C = new WeakValueReferenceImpl(referenceQueue, obj, this);
            weakValueReference.clear();
        }

        public WeakValueReference d() {
            return this.C;
        }

        public Object getValue() {
            return this.C.get();
        }
    }

    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {
        public final ReferenceQueue G = new ReferenceQueue();

        public StrongKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
            super(mapMakerInternalMap, i2, i3);
        }

        /* renamed from: H */
        public StrongKeyWeakValueSegment D() {
            return this;
        }

        public void o() {
            b(this.G);
        }

        public void p() {
            f(this.G);
        }
    }

    public interface StrongValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
    }

    public final class ValueIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<V> {
        public ValueIterator(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        public Object next() {
            return d().getValue();
        }
    }

    public final class Values extends AbstractCollection<V> {
        public Values() {
        }

        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public Iterator iterator() {
            return new ValueIterator(MapMakerInternalMap.this);
        }

        public int size() {
            return MapMakerInternalMap.this.size();
        }

        public Object[] toArray() {
            return MapMakerInternalMap.n(this).toArray();
        }

        public Object[] toArray(Object[] objArr) {
            return MapMakerInternalMap.n(this).toArray(objArr);
        }
    }

    public static final class WeakKeyDummyValueEntry<K> extends AbstractWeakKeyEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> {

        public static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {

            /* renamed from: a  reason: collision with root package name */
            public static final Helper f28354a = new Helper();

            public Strength b() {
                return Strength.STRONG;
            }

            /* renamed from: f */
            public WeakKeyDummyValueEntry a(WeakKeyDummyValueSegment weakKeyDummyValueSegment, WeakKeyDummyValueEntry weakKeyDummyValueEntry, WeakKeyDummyValueEntry weakKeyDummyValueEntry2) {
                if (weakKeyDummyValueEntry.getKey() == null) {
                    return null;
                }
                return weakKeyDummyValueEntry.a(weakKeyDummyValueSegment.G, weakKeyDummyValueEntry2);
            }

            /* renamed from: g */
            public WeakKeyDummyValueEntry e(WeakKeyDummyValueSegment weakKeyDummyValueSegment, Object obj, int i2, WeakKeyDummyValueEntry weakKeyDummyValueEntry) {
                return new WeakKeyDummyValueEntry(weakKeyDummyValueSegment.G, obj, i2, weakKeyDummyValueEntry);
            }

            /* renamed from: h */
            public WeakKeyDummyValueSegment d(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
                return new WeakKeyDummyValueSegment(mapMakerInternalMap, i2, i3);
            }

            /* renamed from: i */
            public void c(WeakKeyDummyValueSegment weakKeyDummyValueSegment, WeakKeyDummyValueEntry weakKeyDummyValueEntry, MapMaker.Dummy dummy) {
            }
        }

        public WeakKeyDummyValueEntry(ReferenceQueue referenceQueue, Object obj, int i2, WeakKeyDummyValueEntry weakKeyDummyValueEntry) {
            super(referenceQueue, obj, i2, weakKeyDummyValueEntry);
        }

        public WeakKeyDummyValueEntry a(ReferenceQueue referenceQueue, WeakKeyDummyValueEntry weakKeyDummyValueEntry) {
            return new WeakKeyDummyValueEntry(referenceQueue, getKey(), this.f28337z, weakKeyDummyValueEntry);
        }

        /* renamed from: b */
        public MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    public static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {
        public final ReferenceQueue G = new ReferenceQueue();

        public WeakKeyDummyValueSegment(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
            super(mapMakerInternalMap, i2, i3);
        }

        /* renamed from: H */
        public WeakKeyDummyValueSegment D() {
            return this;
        }

        public void o() {
            b(this.G);
        }

        public void p() {
            e(this.G);
        }
    }

    public static final class WeakKeyStrongValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, WeakKeyStrongValueEntry<K, V>> {

        /* renamed from: B  reason: collision with root package name */
        public volatile Object f28355B = null;

        public static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            public static final Helper f28356a = new Helper();

            public static Helper g() {
                return f28356a;
            }

            public Strength b() {
                return Strength.STRONG;
            }

            /* renamed from: f */
            public WeakKeyStrongValueEntry a(WeakKeyStrongValueSegment weakKeyStrongValueSegment, WeakKeyStrongValueEntry weakKeyStrongValueEntry, WeakKeyStrongValueEntry weakKeyStrongValueEntry2) {
                if (weakKeyStrongValueEntry.getKey() == null) {
                    return null;
                }
                return weakKeyStrongValueEntry.a(weakKeyStrongValueSegment.G, weakKeyStrongValueEntry2);
            }

            /* renamed from: h */
            public WeakKeyStrongValueEntry e(WeakKeyStrongValueSegment weakKeyStrongValueSegment, Object obj, int i2, WeakKeyStrongValueEntry weakKeyStrongValueEntry) {
                return new WeakKeyStrongValueEntry(weakKeyStrongValueSegment.G, obj, i2, weakKeyStrongValueEntry);
            }

            /* renamed from: i */
            public WeakKeyStrongValueSegment d(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
                return new WeakKeyStrongValueSegment(mapMakerInternalMap, i2, i3);
            }

            /* renamed from: j */
            public void c(WeakKeyStrongValueSegment weakKeyStrongValueSegment, WeakKeyStrongValueEntry weakKeyStrongValueEntry, Object obj) {
                weakKeyStrongValueEntry.b(obj);
            }
        }

        public WeakKeyStrongValueEntry(ReferenceQueue referenceQueue, Object obj, int i2, WeakKeyStrongValueEntry weakKeyStrongValueEntry) {
            super(referenceQueue, obj, i2, weakKeyStrongValueEntry);
        }

        public WeakKeyStrongValueEntry a(ReferenceQueue referenceQueue, WeakKeyStrongValueEntry weakKeyStrongValueEntry) {
            WeakKeyStrongValueEntry weakKeyStrongValueEntry2 = new WeakKeyStrongValueEntry(referenceQueue, getKey(), this.f28337z, weakKeyStrongValueEntry);
            weakKeyStrongValueEntry2.b(this.f28355B);
            return weakKeyStrongValueEntry2;
        }

        public void b(Object obj) {
            this.f28355B = obj;
        }

        public Object getValue() {
            return this.f28355B;
        }
    }

    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {
        public final ReferenceQueue G = new ReferenceQueue();

        public WeakKeyStrongValueSegment(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
            super(mapMakerInternalMap, i2, i3);
        }

        /* renamed from: H */
        public WeakKeyStrongValueSegment D() {
            return this;
        }

        public void o() {
            b(this.G);
        }

        public void p() {
            e(this.G);
        }
    }

    public static final class WeakKeyWeakValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, WeakKeyWeakValueEntry<K, V>> {

        /* renamed from: B  reason: collision with root package name */
        public volatile WeakValueReference f28357B = MapMakerInternalMap.o();

        public static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            public static final Helper f28358a = new Helper();

            public static Helper g() {
                return f28358a;
            }

            public Strength b() {
                return Strength.WEAK;
            }

            /* renamed from: f */
            public WeakKeyWeakValueEntry a(WeakKeyWeakValueSegment weakKeyWeakValueSegment, WeakKeyWeakValueEntry weakKeyWeakValueEntry, WeakKeyWeakValueEntry weakKeyWeakValueEntry2) {
                if (weakKeyWeakValueEntry.getKey() != null && !Segment.n(weakKeyWeakValueEntry)) {
                    return weakKeyWeakValueEntry.a(weakKeyWeakValueSegment.G, weakKeyWeakValueSegment.H, weakKeyWeakValueEntry2);
                }
                return null;
            }

            /* renamed from: h */
            public WeakKeyWeakValueEntry e(WeakKeyWeakValueSegment weakKeyWeakValueSegment, Object obj, int i2, WeakKeyWeakValueEntry weakKeyWeakValueEntry) {
                return new WeakKeyWeakValueEntry(weakKeyWeakValueSegment.G, obj, i2, weakKeyWeakValueEntry);
            }

            /* renamed from: i */
            public WeakKeyWeakValueSegment d(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
                return new WeakKeyWeakValueSegment(mapMakerInternalMap, i2, i3);
            }

            /* renamed from: j */
            public void c(WeakKeyWeakValueSegment weakKeyWeakValueSegment, WeakKeyWeakValueEntry weakKeyWeakValueEntry, Object obj) {
                weakKeyWeakValueEntry.b(obj, weakKeyWeakValueSegment.H);
            }
        }

        public WeakKeyWeakValueEntry(ReferenceQueue referenceQueue, Object obj, int i2, WeakKeyWeakValueEntry weakKeyWeakValueEntry) {
            super(referenceQueue, obj, i2, weakKeyWeakValueEntry);
        }

        public WeakKeyWeakValueEntry a(ReferenceQueue referenceQueue, ReferenceQueue referenceQueue2, WeakKeyWeakValueEntry weakKeyWeakValueEntry) {
            WeakKeyWeakValueEntry weakKeyWeakValueEntry2 = new WeakKeyWeakValueEntry(referenceQueue, getKey(), this.f28337z, weakKeyWeakValueEntry);
            weakKeyWeakValueEntry2.f28357B = this.f28357B.a(referenceQueue2, weakKeyWeakValueEntry2);
            return weakKeyWeakValueEntry2;
        }

        public void b(Object obj, ReferenceQueue referenceQueue) {
            WeakValueReference weakValueReference = this.f28357B;
            this.f28357B = new WeakValueReferenceImpl(referenceQueue, obj, this);
            weakValueReference.clear();
        }

        public WeakValueReference d() {
            return this.f28357B;
        }

        public Object getValue() {
            return this.f28357B.get();
        }
    }

    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {
        public final ReferenceQueue G = new ReferenceQueue();
        public final ReferenceQueue H = new ReferenceQueue();

        public WeakKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
            super(mapMakerInternalMap, i2, i3);
        }

        /* renamed from: I */
        public WeakKeyWeakValueSegment D() {
            return this;
        }

        public void o() {
            b(this.G);
        }

        public void p() {
            e(this.G);
            f(this.H);
        }
    }

    public interface WeakValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
        WeakValueReference d();
    }

    public interface WeakValueReference<K, V, E extends InternalEntry<K, V, E>> {
        WeakValueReference a(ReferenceQueue referenceQueue, InternalEntry internalEntry);

        InternalEntry c();

        void clear();

        Object get();
    }

    public static final class WeakValueReferenceImpl<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<V> implements WeakValueReference<K, V, E> {

        /* renamed from: z  reason: collision with root package name */
        public final InternalEntry f28359z;

        public WeakValueReferenceImpl(ReferenceQueue referenceQueue, Object obj, InternalEntry internalEntry) {
            super(obj, referenceQueue);
            this.f28359z = internalEntry;
        }

        public WeakValueReference a(ReferenceQueue referenceQueue, InternalEntry internalEntry) {
            return new WeakValueReferenceImpl(referenceQueue, get(), internalEntry);
        }

        public InternalEntry c() {
            return this.f28359z;
        }
    }

    public final class WriteThroughEntry extends AbstractMapEntry<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public Object f28360A;

        /* renamed from: z  reason: collision with root package name */
        public final Object f28362z;

        public WriteThroughEntry(Object obj, Object obj2) {
            this.f28362z = obj;
            this.f28360A = obj2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f28362z.equals(entry.getKey()) && this.f28360A.equals(entry.getValue());
        }

        public Object getKey() {
            return this.f28362z;
        }

        public Object getValue() {
            return this.f28360A;
        }

        public int hashCode() {
            return this.f28362z.hashCode() ^ this.f28360A.hashCode();
        }

        public Object setValue(Object obj) {
            Object put = MapMakerInternalMap.this.put(this.f28362z, obj);
            this.f28360A = obj;
            return put;
        }
    }

    public MapMakerInternalMap(MapMaker mapMaker, InternalEntryHelper internalEntryHelper) {
        this.C = Math.min(mapMaker.a(), 65536);
        this.D = mapMaker.c();
        this.E = internalEntryHelper;
        int min = Math.min(mapMaker.b(), 1073741824);
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        while (i5 < this.C) {
            i4++;
            i5 <<= 1;
        }
        this.f28329A = 32 - i4;
        this.f28331z = i5 - 1;
        this.f28330B = h(i5);
        int i6 = min / i5;
        while (i3 < (i5 * i6 < min ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        while (true) {
            Segment[] segmentArr = this.f28330B;
            if (i2 < segmentArr.length) {
                segmentArr[i2] = c(i3, -1);
                i2++;
            } else {
                return;
            }
        }
    }

    public static MapMakerInternalMap b(MapMaker mapMaker) {
        Strength d2 = mapMaker.d();
        Strength strength = Strength.STRONG;
        if (d2 == strength && mapMaker.e() == strength) {
            return new MapMakerInternalMap(mapMaker, StrongKeyStrongValueEntry.Helper.g());
        }
        if (mapMaker.d() == strength && mapMaker.e() == Strength.WEAK) {
            return new MapMakerInternalMap(mapMaker, StrongKeyWeakValueEntry.Helper.g());
        }
        Strength d3 = mapMaker.d();
        Strength strength2 = Strength.WEAK;
        if (d3 == strength2 && mapMaker.e() == strength) {
            return new MapMakerInternalMap(mapMaker, WeakKeyStrongValueEntry.Helper.g());
        }
        if (mapMaker.d() == strength2 && mapMaker.e() == strength2) {
            return new MapMakerInternalMap(mapMaker, WeakKeyWeakValueEntry.Helper.g());
        }
        throw new AssertionError();
    }

    public static int k(int i2) {
        int i3 = i2 + ((i2 << 15) ^ -12931);
        int i4 = i3 ^ (i3 >>> 10);
        int i5 = i4 + (i4 << 3);
        int i6 = i5 ^ (i5 >>> 6);
        int i7 = i6 + (i6 << 2) + (i6 << 14);
        return i7 ^ (i7 >>> 16);
    }

    public static ArrayList n(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterators.a(arrayList, collection.iterator());
        return arrayList;
    }

    public static WeakValueReference o() {
        return I;
    }

    public Segment c(int i2, int i3) {
        return this.E.d(this, i2, i3);
    }

    public void clear() {
        for (Segment a2 : this.f28330B) {
            a2.a();
        }
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int g2 = g(obj);
        return m(g2).c(obj, g2);
    }

    public boolean containsValue(Object obj) {
        Object obj2 = obj;
        boolean z2 = false;
        if (obj2 == null) {
            return false;
        }
        Segment[] segmentArr = this.f28330B;
        long j2 = -1;
        int i2 = 0;
        while (i2 < 3) {
            int length = segmentArr.length;
            long j3 = 0;
            int i3 = z2;
            while (i3 < length) {
                Segment segment = segmentArr[i3];
                int i4 = segment.f28344A;
                AtomicReferenceArray atomicReferenceArray = segment.D;
                for (int i5 = z2; i5 < atomicReferenceArray.length(); i5++) {
                    for (InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(i5); internalEntry != null; internalEntry = internalEntry.f()) {
                        Object l2 = segment.l(internalEntry);
                        if (l2 != null && p().d(obj2, l2)) {
                            return true;
                        }
                    }
                }
                j3 += (long) segment.f28345B;
                i3++;
                z2 = false;
            }
            if (j3 == j2) {
                return false;
            }
            i2++;
            j2 = j3;
            z2 = false;
        }
        return z2;
    }

    public InternalEntry e(Object obj) {
        if (obj == null) {
            return null;
        }
        int g2 = g(obj);
        return m(g2).i(obj, g2);
    }

    public Set entrySet() {
        Set set = this.H;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.H = entrySet;
        return entrySet;
    }

    public Object f(InternalEntry internalEntry) {
        if (internalEntry.getKey() == null) {
            return null;
        }
        return internalEntry.getValue();
    }

    public int g(Object obj) {
        return k(this.D.e(obj));
    }

    public Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int g2 = g(obj);
        return m(g2).h(obj, g2);
    }

    public final Segment[] h(int i2) {
        return new Segment[i2];
    }

    public void i(InternalEntry internalEntry) {
        int h2 = internalEntry.h();
        m(h2).u(internalEntry, h2);
    }

    public boolean isEmpty() {
        Segment[] segmentArr = this.f28330B;
        long j2 = 0;
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].f28344A != 0) {
                return false;
            }
            j2 += (long) segmentArr[i2].f28345B;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < segmentArr.length; i3++) {
            if (segmentArr[i3].f28344A != 0) {
                return false;
            }
            j2 -= (long) segmentArr[i3].f28345B;
        }
        return j2 == 0;
    }

    public void j(WeakValueReference weakValueReference) {
        InternalEntry c2 = weakValueReference.c();
        int h2 = c2.h();
        m(h2).v(c2.getKey(), h2, weakValueReference);
    }

    public Set keySet() {
        Set set = this.F;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.F = keySet;
        return keySet;
    }

    public Segment m(int i2) {
        return this.f28330B[(i2 >>> this.f28329A) & this.f28331z];
    }

    public Equivalence p() {
        return this.E.b().f();
    }

    public Object put(Object obj, Object obj2) {
        Preconditions.q(obj);
        Preconditions.q(obj2);
        int g2 = g(obj);
        return m(g2).t(obj, g2, obj2, false);
    }

    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Preconditions.q(obj);
        Preconditions.q(obj2);
        int g2 = g(obj);
        return m(g2).t(obj, g2, obj2, true);
    }

    public Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int g2 = g(obj);
        return m(g2).w(obj, g2);
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        Preconditions.q(obj);
        Preconditions.q(obj3);
        if (obj2 == null) {
            return false;
        }
        int g2 = g(obj);
        return m(g2).A(obj, g2, obj2, obj3);
    }

    public int size() {
        Segment[] segmentArr = this.f28330B;
        long j2 = 0;
        for (Segment segment : segmentArr) {
            j2 += (long) segment.f28344A;
        }
        return Ints.k(j2);
    }

    public Collection values() {
        Collection collection = this.G;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.G = values;
        return values;
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int g2 = g(obj);
        return m(g2).x(obj, g2, obj2);
    }

    public Object replace(Object obj, Object obj2) {
        Preconditions.q(obj);
        Preconditions.q(obj2);
        int g2 = g(obj);
        return m(g2).z(obj, g2, obj2);
    }
}
