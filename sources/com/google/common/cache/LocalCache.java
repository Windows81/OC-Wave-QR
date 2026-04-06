package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.Uninterruptibles;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public static final Logger V = Logger.getLogger(LocalCache.class.getName());
    public static final ValueReference W = new ValueReference<Object, Object>() {
        public int a() {
            return 0;
        }

        public boolean b() {
            return false;
        }

        public ReferenceEntry c() {
            return null;
        }

        public void d(Object obj) {
        }

        public boolean e() {
            return false;
        }

        public Object f() {
            return null;
        }

        public ValueReference g(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return this;
        }

        public Object get() {
            return null;
        }
    };
    public static final Queue X = new AbstractQueue<Object>() {
        public Iterator iterator() {
            return ImmutableSet.D().iterator();
        }

        public boolean offer(Object obj) {
            return true;
        }

        public Object peek() {
            return null;
        }

        public Object poll() {
            return null;
        }

        public int size() {
            return 0;
        }
    };

    /* renamed from: A  reason: collision with root package name */
    public final int f27874A;

    /* renamed from: B  reason: collision with root package name */
    public final Segment[] f27875B;
    public final int C;
    public final Equivalence D;
    public final Equivalence E;
    public final Strength F;
    public final Strength G;
    public final long H;
    public final Weigher I;
    public final long J;
    public final long K;
    public final long L;
    public final Queue M;
    public final RemovalListener N;
    public final Ticker O;
    public final EntryFactory P;
    public final AbstractCache.StatsCounter Q;
    public final CacheLoader R;
    public Set S;
    public Collection T;
    public Set U;

    /* renamed from: z  reason: collision with root package name */
    public final int f27876z;

    public abstract class AbstractCacheSet<T> extends AbstractSet<T> {
        public AbstractCacheSet() {
        }

        public void clear() {
            LocalCache.this.clear();
        }

        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        public int size() {
            return LocalCache.this.size();
        }

        public Object[] toArray() {
            return LocalCache.E(this).toArray();
        }

        public Object[] toArray(Object[] objArr) {
            return LocalCache.E(this).toArray(objArr);
        }
    }

    public static abstract class AbstractReferenceEntry<K, V> implements ReferenceEntry<K, V> {
        public ReferenceEntry A() {
            throw new UnsupportedOperationException();
        }

        public ValueReference d() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry f() {
            throw new UnsupportedOperationException();
        }

        public Object getKey() {
            throw new UnsupportedOperationException();
        }

        public int h() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry j() {
            throw new UnsupportedOperationException();
        }

        public void k(ValueReference valueReference) {
            throw new UnsupportedOperationException();
        }

        public long l() {
            throw new UnsupportedOperationException();
        }

        public void m(long j2) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry n() {
            throw new UnsupportedOperationException();
        }

        public long o() {
            throw new UnsupportedOperationException();
        }

        public void p(long j2) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry r() {
            throw new UnsupportedOperationException();
        }

        public void t(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void x(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void y(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void z(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class AccessQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {

        /* renamed from: z  reason: collision with root package name */
        public final ReferenceEntry f27878z = new AbstractReferenceEntry<K, V>(this) {

            /* renamed from: A  reason: collision with root package name */
            public ReferenceEntry f27879A = this;

            /* renamed from: z  reason: collision with root package name */
            public ReferenceEntry f27880z = this;

            public ReferenceEntry j() {
                return this.f27879A;
            }

            public void m(long j2) {
            }

            public long o() {
                return Long.MAX_VALUE;
            }

            public ReferenceEntry r() {
                return this.f27880z;
            }

            public void t(ReferenceEntry referenceEntry) {
                this.f27880z = referenceEntry;
            }

            public void z(ReferenceEntry referenceEntry) {
                this.f27879A = referenceEntry;
            }
        };

        public void clear() {
            ReferenceEntry r2 = this.f27878z.r();
            while (true) {
                ReferenceEntry referenceEntry = this.f27878z;
                if (r2 != referenceEntry) {
                    ReferenceEntry r3 = r2.r();
                    LocalCache.t(r2);
                    r2 = r3;
                } else {
                    referenceEntry.t(referenceEntry);
                    ReferenceEntry referenceEntry2 = this.f27878z;
                    referenceEntry2.z(referenceEntry2);
                    return;
                }
            }
        }

        public boolean contains(Object obj) {
            return ((ReferenceEntry) obj).r() != NullEntry.INSTANCE;
        }

        /* renamed from: e */
        public boolean offer(ReferenceEntry referenceEntry) {
            LocalCache.b(referenceEntry.j(), referenceEntry.r());
            LocalCache.b(this.f27878z.j(), referenceEntry);
            LocalCache.b(referenceEntry, this.f27878z);
            return true;
        }

        /* renamed from: g */
        public ReferenceEntry peek() {
            ReferenceEntry r2 = this.f27878z.r();
            if (r2 == this.f27878z) {
                return null;
            }
            return r2;
        }

        /* renamed from: h */
        public ReferenceEntry poll() {
            ReferenceEntry r2 = this.f27878z.r();
            if (r2 == this.f27878z) {
                return null;
            }
            remove(r2);
            return r2;
        }

        public boolean isEmpty() {
            return this.f27878z.r() == this.f27878z;
        }

        public Iterator iterator() {
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) {
                /* renamed from: c */
                public ReferenceEntry b(ReferenceEntry referenceEntry) {
                    ReferenceEntry r2 = referenceEntry.r();
                    if (r2 == AccessQueue.this.f27878z) {
                        return null;
                    }
                    return r2;
                }
            };
        }

        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry j2 = referenceEntry.j();
            ReferenceEntry r2 = referenceEntry.r();
            LocalCache.b(j2, r2);
            LocalCache.t(referenceEntry);
            return r2 != NullEntry.INSTANCE;
        }

        public int size() {
            int i2 = 0;
            for (ReferenceEntry r2 = this.f27878z.r(); r2 != this.f27878z; r2 = r2.r()) {
                i2++;
            }
            return i2;
        }
    }

    public enum EntryFactory {
        STRONG {
            public ReferenceEntry l(Segment segment, Object obj, int i2, ReferenceEntry referenceEntry) {
                return new StrongEntry(obj, i2, referenceEntry);
            }
        },
        STRONG_ACCESS {
            public ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
                ReferenceEntry h2 = super.h(segment, referenceEntry, referenceEntry2);
                f(referenceEntry, h2);
                return h2;
            }

            public ReferenceEntry l(Segment segment, Object obj, int i2, ReferenceEntry referenceEntry) {
                return new StrongAccessEntry(obj, i2, referenceEntry);
            }
        },
        STRONG_WRITE {
            public ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
                ReferenceEntry h2 = super.h(segment, referenceEntry, referenceEntry2);
                j(referenceEntry, h2);
                return h2;
            }

            public ReferenceEntry l(Segment segment, Object obj, int i2, ReferenceEntry referenceEntry) {
                return new StrongWriteEntry(obj, i2, referenceEntry);
            }
        },
        STRONG_ACCESS_WRITE {
            public ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
                ReferenceEntry h2 = super.h(segment, referenceEntry, referenceEntry2);
                f(referenceEntry, h2);
                j(referenceEntry, h2);
                return h2;
            }

            public ReferenceEntry l(Segment segment, Object obj, int i2, ReferenceEntry referenceEntry) {
                return new StrongAccessWriteEntry(obj, i2, referenceEntry);
            }
        },
        WEAK {
            public ReferenceEntry l(Segment segment, Object obj, int i2, ReferenceEntry referenceEntry) {
                return new WeakEntry(segment.G, obj, i2, referenceEntry);
            }
        },
        WEAK_ACCESS {
            public ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
                ReferenceEntry h2 = super.h(segment, referenceEntry, referenceEntry2);
                f(referenceEntry, h2);
                return h2;
            }

            public ReferenceEntry l(Segment segment, Object obj, int i2, ReferenceEntry referenceEntry) {
                return new WeakAccessEntry(segment.G, obj, i2, referenceEntry);
            }
        },
        WEAK_WRITE {
            public ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
                ReferenceEntry h2 = super.h(segment, referenceEntry, referenceEntry2);
                j(referenceEntry, h2);
                return h2;
            }

            public ReferenceEntry l(Segment segment, Object obj, int i2, ReferenceEntry referenceEntry) {
                return new WeakWriteEntry(segment.G, obj, i2, referenceEntry);
            }
        },
        WEAK_ACCESS_WRITE {
            public ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
                ReferenceEntry h2 = super.h(segment, referenceEntry, referenceEntry2);
                f(referenceEntry, h2);
                j(referenceEntry, h2);
                return h2;
            }

            public ReferenceEntry l(Segment segment, Object obj, int i2, ReferenceEntry referenceEntry) {
                return new WeakAccessWriteEntry(segment.G, obj, i2, referenceEntry);
            }
        };
        
        public static final EntryFactory[] H = null;

        static {
            AnonymousClass1 r0;
            AnonymousClass2 r1;
            AnonymousClass3 r3;
            AnonymousClass4 r5;
            AnonymousClass5 r7;
            AnonymousClass6 r9;
            AnonymousClass7 r11;
            AnonymousClass8 r13;
            H = new EntryFactory[]{r0, r1, r3, r5, r7, r9, r11, r13};
        }

        public static EntryFactory k(Strength strength, boolean z2, boolean z3) {
            char c2 = 0;
            boolean z4 = (strength == Strength.WEAK ? (char) 4 : 0) | z2;
            if (z3) {
                c2 = 2;
            }
            return H[z4 | c2];
        }

        public void f(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            referenceEntry2.m(referenceEntry.o());
            LocalCache.b(referenceEntry.j(), referenceEntry2);
            LocalCache.b(referenceEntry2, referenceEntry.r());
            LocalCache.t(referenceEntry);
        }

        public ReferenceEntry h(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            return l(segment, referenceEntry.getKey(), referenceEntry.h(), referenceEntry2);
        }

        public void j(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            referenceEntry2.p(referenceEntry.l());
            LocalCache.c(referenceEntry.A(), referenceEntry2);
            LocalCache.c(referenceEntry2, referenceEntry.n());
            LocalCache.u(referenceEntry);
        }

        public abstract ReferenceEntry l(Segment segment, Object obj, int i2, ReferenceEntry referenceEntry);
    }

    public final class EntryIterator extends LocalCache<K, V>.HashIterator<Map.Entry<K, V>> {
        public EntryIterator(LocalCache localCache) {
            super();
        }

        /* renamed from: g */
        public Map.Entry next() {
            return d();
        }
    }

    public final class EntrySet extends LocalCache<K, V>.AbstractCacheSet<Map.Entry<K, V>> {
        public EntrySet() {
            super();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
            r0 = r3.f27885A.get((r0 = r4.getKey()));
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
                com.google.common.cache.LocalCache r2 = com.google.common.cache.LocalCache.this
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L_0x0026
                com.google.common.cache.LocalCache r2 = com.google.common.cache.LocalCache.this
                com.google.common.base.Equivalence r2 = r2.E
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.d(r4, r0)
                if (r4 == 0) goto L_0x0026
                r1 = 1
            L_0x0026:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.EntrySet.contains(java.lang.Object):boolean");
        }

        public Iterator iterator() {
            return new EntryIterator(LocalCache.this);
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
                com.google.common.cache.LocalCache r2 = com.google.common.cache.LocalCache.this
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L_0x001b
                r1 = 1
            L_0x001b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.EntrySet.remove(java.lang.Object):boolean");
        }
    }

    public abstract class HashIterator<T> implements Iterator<T> {

        /* renamed from: A  reason: collision with root package name */
        public int f27886A = -1;

        /* renamed from: B  reason: collision with root package name */
        public Segment f27887B;
        public AtomicReferenceArray C;
        public ReferenceEntry D;
        public WriteThroughEntry E;
        public WriteThroughEntry F;

        /* renamed from: z  reason: collision with root package name */
        public int f27888z;

        public HashIterator() {
            this.f27888z = LocalCache.this.f27875B.length - 1;
            b();
        }

        public final void b() {
            this.E = null;
            if (!e() && !f()) {
                while (true) {
                    int i2 = this.f27888z;
                    if (i2 >= 0) {
                        Segment[] segmentArr = LocalCache.this.f27875B;
                        this.f27888z = i2 - 1;
                        Segment segment = segmentArr[i2];
                        this.f27887B = segment;
                        if (segment.f27900A != 0) {
                            AtomicReferenceArray atomicReferenceArray = this.f27887B.E;
                            this.C = atomicReferenceArray;
                            this.f27886A = atomicReferenceArray.length() - 1;
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
        public boolean c(ReferenceEntry referenceEntry) {
            try {
                long a2 = LocalCache.this.O.a();
                Object key = referenceEntry.getKey();
                Object m2 = LocalCache.this.m(referenceEntry, a2);
                if (m2 != null) {
                    this.E = new WriteThroughEntry(key, m2);
                    this.f27887B.E();
                    return true;
                }
                this.f27887B.E();
                return false;
            } catch (Throwable th) {
                this.f27887B.E();
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
            ReferenceEntry referenceEntry = this.D;
            if (referenceEntry == null) {
                return false;
            }
            while (true) {
                this.D = referenceEntry.f();
                ReferenceEntry referenceEntry2 = this.D;
                if (referenceEntry2 == null) {
                    return false;
                }
                if (c(referenceEntry2)) {
                    return true;
                }
                referenceEntry = this.D;
            }
        }

        public boolean f() {
            while (true) {
                int i2 = this.f27886A;
                if (i2 < 0) {
                    return false;
                }
                AtomicReferenceArray atomicReferenceArray = this.C;
                this.f27886A = i2 - 1;
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i2);
                this.D = referenceEntry;
                if (referenceEntry != null && (c(referenceEntry) || e())) {
                    return true;
                }
            }
        }

        public boolean hasNext() {
            return this.E != null;
        }

        public void remove() {
            Preconditions.w(this.F != null);
            LocalCache.this.remove(this.F.getKey());
            this.F = null;
        }
    }

    public final class KeyIterator extends LocalCache<K, V>.HashIterator<K> {
        public KeyIterator(LocalCache localCache) {
            super();
        }

        public Object next() {
            return d().getKey();
        }
    }

    public final class KeySet extends LocalCache<K, V>.AbstractCacheSet<K> {
        public KeySet() {
            super();
        }

        public boolean contains(Object obj) {
            return LocalCache.this.containsKey(obj);
        }

        public Iterator iterator() {
            return new KeyIterator(LocalCache.this);
        }

        public boolean remove(Object obj) {
            return LocalCache.this.remove(obj) != null;
        }
    }

    public static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements LoadingCache<K, V>, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public transient LoadingCache f27890A;

        public final Object apply(Object obj) {
            return this.f27890A.apply(obj);
        }
    }

    public static class LoadingValueReference<K, V> implements ValueReference<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public final SettableFuture f27891A;

        /* renamed from: B  reason: collision with root package name */
        public final Stopwatch f27892B;

        /* renamed from: z  reason: collision with root package name */
        public volatile ValueReference f27893z;

        public LoadingValueReference() {
            this(LocalCache.F());
        }

        public int a() {
            return this.f27893z.a();
        }

        public boolean b() {
            return this.f27893z.b();
        }

        public ReferenceEntry c() {
            return null;
        }

        public void d(Object obj) {
            if (obj != null) {
                l(obj);
            } else {
                this.f27893z = LocalCache.F();
            }
        }

        public boolean e() {
            return true;
        }

        public Object f() {
            return Uninterruptibles.a(this.f27891A);
        }

        public ValueReference g(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return this;
        }

        public Object get() {
            return this.f27893z.get();
        }

        public long h() {
            return this.f27892B.e(TimeUnit.NANOSECONDS);
        }

        public final ListenableFuture i(Throwable th) {
            return Futures.d(th);
        }

        public ValueReference j() {
            return this.f27893z;
        }

        public ListenableFuture k(Object obj, CacheLoader cacheLoader) {
            try {
                this.f27892B.h();
                Object obj2 = this.f27893z.get();
                if (obj2 == null) {
                    Object a2 = cacheLoader.a(obj);
                    return l(a2) ? this.f27891A : Futures.e(a2);
                }
                ListenableFuture b2 = cacheLoader.b(obj, obj2);
                return b2 == null ? Futures.e((Object) null) : Futures.f(b2, new Function<V, V>() {
                    public Object apply(Object obj) {
                        LoadingValueReference.this.l(obj);
                        return obj;
                    }
                }, MoreExecutors.a());
            } catch (Throwable th) {
                ListenableFuture i2 = m(th) ? this.f27891A : i(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return i2;
            }
        }

        public boolean l(Object obj) {
            return this.f27891A.B(obj);
        }

        public boolean m(Throwable th) {
            return this.f27891A.D(th);
        }

        public LoadingValueReference(ValueReference valueReference) {
            this.f27891A = SettableFuture.G();
            this.f27892B = Stopwatch.d();
            this.f27893z = valueReference;
        }
    }

    public static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements LoadingCache<K, V> {
        public LocalLoadingCache(CacheBuilder cacheBuilder, CacheLoader cacheLoader) {
            super();
        }

        public Object a(Object obj) {
            try {
                return get(obj);
            } catch (ExecutionException e2) {
                throw new UncheckedExecutionException(e2.getCause());
            }
        }

        public final Object apply(Object obj) {
            return a(obj);
        }

        public Object get(Object obj) {
            return this.f27895z.n(obj);
        }
    }

    public static class LocalManualCache<K, V> implements Cache<K, V>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final LocalCache f27895z;

        /* renamed from: com.google.common.cache.LocalCache$LocalManualCache$1  reason: invalid class name */
        class AnonymousClass1 extends CacheLoader<Object, Object> {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ Callable f27896z;

            public Object a(Object obj) {
                return this.f27896z.call();
            }
        }

        public LocalManualCache(LocalCache localCache) {
            this.f27895z = localCache;
        }
    }

    public static class ManualSerializationProxy<K, V> extends ForwardingCache<K, V> implements Serializable {

        /* renamed from: z  reason: collision with root package name */
        public transient Cache f27897z;

        /* renamed from: Q */
        public Cache M() {
            return this.f27897z;
        }
    }

    public enum NullEntry implements ReferenceEntry<Object, Object> {
        INSTANCE;

        public ReferenceEntry A() {
            return this;
        }

        public ValueReference d() {
            return null;
        }

        public ReferenceEntry f() {
            return null;
        }

        public Object getKey() {
            return null;
        }

        public int h() {
            return 0;
        }

        public ReferenceEntry j() {
            return this;
        }

        public void k(ValueReference valueReference) {
        }

        public long l() {
            return 0;
        }

        public void m(long j2) {
        }

        public ReferenceEntry n() {
            return this;
        }

        public long o() {
            return 0;
        }

        public void p(long j2) {
        }

        public ReferenceEntry r() {
            return this;
        }

        public void t(ReferenceEntry referenceEntry) {
        }

        public void x(ReferenceEntry referenceEntry) {
        }

        public void y(ReferenceEntry referenceEntry) {
        }

        public void z(ReferenceEntry referenceEntry) {
        }
    }

    public static class Segment<K, V> extends ReentrantLock {

        /* renamed from: A  reason: collision with root package name */
        public volatile int f27900A;

        /* renamed from: B  reason: collision with root package name */
        public long f27901B;
        public int C;
        public int D;
        public volatile AtomicReferenceArray E;
        public final long F;
        public final ReferenceQueue G;
        public final ReferenceQueue H;
        public final Queue I;
        public final AtomicInteger J = new AtomicInteger();
        public final Queue K;
        public final Queue L;
        public final AbstractCache.StatsCounter M;

        /* renamed from: z  reason: collision with root package name */
        public final LocalCache f27902z;

        public Segment(LocalCache localCache, int i2, long j2, AbstractCache.StatsCounter statsCounter) {
            this.f27902z = localCache;
            this.F = j2;
            this.M = (AbstractCache.StatsCounter) Preconditions.q(statsCounter);
            x(D(i2));
            ReferenceQueue referenceQueue = null;
            this.G = localCache.J() ? new ReferenceQueue() : null;
            this.H = localCache.K() ? new ReferenceQueue() : referenceQueue;
            this.I = localCache.I() ? new ConcurrentLinkedQueue() : LocalCache.g();
            this.K = localCache.M() ? new WriteQueue() : LocalCache.g();
            this.L = localCache.I() ? new AccessQueue() : LocalCache.g();
        }

        public Object A(Object obj, int i2, LoadingValueReference loadingValueReference, CacheLoader cacheLoader) {
            return r(obj, i2, loadingValueReference, loadingValueReference.k(obj, cacheLoader));
        }

        public Object B(Object obj, int i2, CacheLoader cacheLoader) {
            LoadingValueReference loadingValueReference;
            boolean z2;
            ValueReference valueReference;
            Object A2;
            Object obj2 = obj;
            int i3 = i2;
            lock();
            try {
                long a2 = this.f27902z.O.a();
                G(a2);
                int i4 = this.f27900A - 1;
                AtomicReferenceArray atomicReferenceArray = this.E;
                int length = i3 & (atomicReferenceArray.length() - 1);
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (true) {
                    loadingValueReference = null;
                    if (referenceEntry2 == null) {
                        z2 = true;
                        valueReference = null;
                        break;
                    }
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.h() != i3 || key == null || !this.f27902z.D.d(obj2, key)) {
                        referenceEntry2 = referenceEntry2.f();
                    } else {
                        ValueReference d2 = referenceEntry2.d();
                        if (d2.e()) {
                            z2 = false;
                        } else {
                            Object obj3 = d2.get();
                            if (obj3 == null) {
                                l(key, i2, obj3, d2.a(), RemovalCause.COLLECTED);
                            } else if (this.f27902z.p(referenceEntry2, a2)) {
                                l(key, i2, obj3, d2.a(), RemovalCause.EXPIRED);
                            } else {
                                K(referenceEntry2, a2);
                                this.M.b(1);
                                unlock();
                                F();
                                return obj3;
                            }
                            this.K.remove(referenceEntry2);
                            this.L.remove(referenceEntry2);
                            this.f27900A = i4;
                            z2 = true;
                        }
                        valueReference = d2;
                    }
                }
                if (z2) {
                    loadingValueReference = new LoadingValueReference();
                    if (referenceEntry2 == null) {
                        referenceEntry2 = C(obj2, i3, referenceEntry);
                        referenceEntry2.k(loadingValueReference);
                        atomicReferenceArray.set(length, referenceEntry2);
                    } else {
                        referenceEntry2.k(loadingValueReference);
                    }
                }
                if (!z2) {
                    return f0(referenceEntry2, obj2, valueReference);
                }
                try {
                    synchronized (referenceEntry2) {
                        A2 = A(obj2, i3, loadingValueReference, cacheLoader);
                    }
                    this.M.c(1);
                    return A2;
                } catch (Throwable th) {
                    this.M.c(1);
                    throw th;
                }
            } finally {
                unlock();
                F();
            }
        }

        public ReferenceEntry C(Object obj, int i2, ReferenceEntry referenceEntry) {
            return this.f27902z.P.l(this, Preconditions.q(obj), i2, referenceEntry);
        }

        public AtomicReferenceArray D(int i2) {
            return new AtomicReferenceArray(i2);
        }

        public void E() {
            if ((this.J.incrementAndGet() & 63) == 0) {
                a();
            }
        }

        public void F() {
            Z();
        }

        public void G(long j2) {
            Y(j2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
            r1 = r12.d();
            r10 = r1.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
            if (r10 != null) goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
            r7.C++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
            if (r1.b() == false) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
            l(r15, r16, r10, r1.a(), com.google.common.cache.RemovalCause.f27931B);
            b0(r12, r15, r17, r8);
            r0 = r7.f27900A;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
            b0(r12, r15, r17, r8);
            r0 = r7.f27900A + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
            r7.f27900A = r0;
            m(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0094, code lost:
            if (r18 == false) goto L_0x00a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            K(r12, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
            return r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r7.C++;
            l(r15, r16, r10, r1.a(), com.google.common.cache.RemovalCause.f27930A);
            b0(r12, r15, r17, r8);
            m(r12);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object H(java.lang.Object r15, int r16, java.lang.Object r17, boolean r18) {
            /*
                r14 = this;
                r7 = r14
                r0 = r15
                r3 = r16
                r14.lock()
                com.google.common.cache.LocalCache r1 = r7.f27902z     // Catch:{ all -> 0x001e }
                com.google.common.base.Ticker r1 = r1.O     // Catch:{ all -> 0x001e }
                long r8 = r1.a()     // Catch:{ all -> 0x001e }
                r14.G(r8)     // Catch:{ all -> 0x001e }
                int r1 = r7.f27900A     // Catch:{ all -> 0x001e }
                int r1 = r1 + 1
                int r2 = r7.D     // Catch:{ all -> 0x001e }
                if (r1 <= r2) goto L_0x0021
                r14.n()     // Catch:{ all -> 0x001e }
                goto L_0x0021
            L_0x001e:
                r0 = move-exception
                goto L_0x00e7
            L_0x0021:
                java.util.concurrent.atomic.AtomicReferenceArray r10 = r7.E     // Catch:{ all -> 0x001e }
                int r1 = r10.length()     // Catch:{ all -> 0x001e }
                int r1 = r1 + -1
                r11 = r3 & r1
                java.lang.Object r1 = r10.get(r11)     // Catch:{ all -> 0x001e }
                com.google.common.cache.ReferenceEntry r1 = (com.google.common.cache.ReferenceEntry) r1     // Catch:{ all -> 0x001e }
                r12 = r1
            L_0x0032:
                r13 = 0
                if (r12 == 0) goto L_0x00c7
                java.lang.Object r2 = r12.getKey()     // Catch:{ all -> 0x001e }
                int r4 = r12.h()     // Catch:{ all -> 0x001e }
                if (r4 != r3) goto L_0x00c1
                if (r2 == 0) goto L_0x00c1
                com.google.common.cache.LocalCache r4 = r7.f27902z     // Catch:{ all -> 0x001e }
                com.google.common.base.Equivalence r4 = r4.D     // Catch:{ all -> 0x001e }
                boolean r2 = r4.d(r15, r2)     // Catch:{ all -> 0x001e }
                if (r2 == 0) goto L_0x00c1
                com.google.common.cache.LocalCache$ValueReference r1 = r12.d()     // Catch:{ all -> 0x001e }
                java.lang.Object r10 = r1.get()     // Catch:{ all -> 0x001e }
                if (r10 != 0) goto L_0x0094
                int r2 = r7.C     // Catch:{ all -> 0x001e }
                int r2 = r2 + 1
                r7.C = r2     // Catch:{ all -> 0x001e }
                boolean r2 = r1.b()     // Catch:{ all -> 0x001e }
                if (r2 == 0) goto L_0x007b
                int r5 = r1.a()     // Catch:{ all -> 0x001e }
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.COLLECTED     // Catch:{ all -> 0x001e }
                r1 = r14
                r2 = r15
                r3 = r16
                r4 = r10
                r1.l(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x001e }
                r1 = r14
                r2 = r12
                r3 = r15
                r4 = r17
                r5 = r8
                r1.b0(r2, r3, r4, r5)     // Catch:{ all -> 0x001e }
                int r0 = r7.f27900A     // Catch:{ all -> 0x001e }
                goto L_0x0088
            L_0x007b:
                r1 = r14
                r2 = r12
                r3 = r15
                r4 = r17
                r5 = r8
                r1.b0(r2, r3, r4, r5)     // Catch:{ all -> 0x001e }
                int r0 = r7.f27900A     // Catch:{ all -> 0x001e }
                int r0 = r0 + 1
            L_0x0088:
                r7.f27900A = r0     // Catch:{ all -> 0x001e }
                r14.m(r12)     // Catch:{ all -> 0x001e }
            L_0x008d:
                r14.unlock()
                r14.F()
                return r13
            L_0x0094:
                if (r18 == 0) goto L_0x00a0
                r14.K(r12, r8)     // Catch:{ all -> 0x001e }
            L_0x0099:
                r14.unlock()
                r14.F()
                return r10
            L_0x00a0:
                int r2 = r7.C     // Catch:{ all -> 0x001e }
                int r2 = r2 + 1
                r7.C = r2     // Catch:{ all -> 0x001e }
                int r5 = r1.a()     // Catch:{ all -> 0x001e }
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch:{ all -> 0x001e }
                r1 = r14
                r2 = r15
                r3 = r16
                r4 = r10
                r1.l(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x001e }
                r1 = r14
                r2 = r12
                r3 = r15
                r4 = r17
                r5 = r8
                r1.b0(r2, r3, r4, r5)     // Catch:{ all -> 0x001e }
                r14.m(r12)     // Catch:{ all -> 0x001e }
                goto L_0x0099
            L_0x00c1:
                com.google.common.cache.ReferenceEntry r12 = r12.f()     // Catch:{ all -> 0x001e }
                goto L_0x0032
            L_0x00c7:
                int r2 = r7.C     // Catch:{ all -> 0x001e }
                int r2 = r2 + 1
                r7.C = r2     // Catch:{ all -> 0x001e }
                com.google.common.cache.ReferenceEntry r12 = r14.C(r15, r3, r1)     // Catch:{ all -> 0x001e }
                r1 = r14
                r2 = r12
                r3 = r15
                r4 = r17
                r5 = r8
                r1.b0(r2, r3, r4, r5)     // Catch:{ all -> 0x001e }
                r10.set(r11, r12)     // Catch:{ all -> 0x001e }
                int r0 = r7.f27900A     // Catch:{ all -> 0x001e }
                int r0 = r0 + 1
                r7.f27900A = r0     // Catch:{ all -> 0x001e }
                r14.m(r12)     // Catch:{ all -> 0x001e }
                goto L_0x008d
            L_0x00e7:
                r14.unlock()
                r14.F()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.H(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.google.common.cache.ReferenceEntry} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean I(com.google.common.cache.ReferenceEntry r13, int r14) {
            /*
                r12 = this;
                r12.lock()
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.E     // Catch:{ all -> 0x0044 }
                int r1 = r0.length()     // Catch:{ all -> 0x0044 }
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r14
                java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x0044 }
                r5 = r3
                com.google.common.cache.ReferenceEntry r5 = (com.google.common.cache.ReferenceEntry) r5     // Catch:{ all -> 0x0044 }
                r6 = r5
            L_0x0014:
                if (r6 == 0) goto L_0x004b
                if (r6 != r13) goto L_0x0046
                int r13 = r12.C     // Catch:{ all -> 0x0044 }
                int r13 = r13 + r2
                r12.C = r13     // Catch:{ all -> 0x0044 }
                java.lang.Object r7 = r6.getKey()     // Catch:{ all -> 0x0044 }
                com.google.common.cache.LocalCache$ValueReference r13 = r6.d()     // Catch:{ all -> 0x0044 }
                java.lang.Object r9 = r13.get()     // Catch:{ all -> 0x0044 }
                com.google.common.cache.LocalCache$ValueReference r10 = r6.d()     // Catch:{ all -> 0x0044 }
                com.google.common.cache.RemovalCause r11 = com.google.common.cache.RemovalCause.COLLECTED     // Catch:{ all -> 0x0044 }
                r4 = r12
                r8 = r14
                com.google.common.cache.ReferenceEntry r13 = r4.V(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0044 }
                int r14 = r12.f27900A     // Catch:{ all -> 0x0044 }
                int r14 = r14 - r2
                r0.set(r1, r13)     // Catch:{ all -> 0x0044 }
                r12.f27900A = r14     // Catch:{ all -> 0x0044 }
                r12.unlock()
                r12.F()
                return r2
            L_0x0044:
                r13 = move-exception
                goto L_0x0053
            L_0x0046:
                com.google.common.cache.ReferenceEntry r6 = r6.f()     // Catch:{ all -> 0x0044 }
                goto L_0x0014
            L_0x004b:
                r12.unlock()
                r12.F()
                r13 = 0
                return r13
            L_0x0053:
                r12.unlock()
                r12.F()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.I(com.google.common.cache.ReferenceEntry, int):boolean");
        }

        public boolean J(Object obj, int i2, ValueReference valueReference) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.E;
                int length = (atomicReferenceArray.length() - 1) & i2;
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (referenceEntry2 != null) {
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.h() != i2 || key == null || !this.f27902z.D.d(obj, key)) {
                        referenceEntry2 = referenceEntry2.f();
                    } else if (referenceEntry2.d() == valueReference) {
                        this.C++;
                        atomicReferenceArray.set(length, V(referenceEntry, referenceEntry2, key, i2, valueReference.get(), valueReference, RemovalCause.COLLECTED));
                        this.f27900A--;
                        return true;
                    } else {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            F();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    F();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    F();
                }
            }
        }

        public void K(ReferenceEntry referenceEntry, long j2) {
            if (this.f27902z.y()) {
                referenceEntry.m(j2);
            }
            this.L.add(referenceEntry);
        }

        public void L(ReferenceEntry referenceEntry, long j2) {
            if (this.f27902z.y()) {
                referenceEntry.m(j2);
            }
            this.I.add(referenceEntry);
        }

        public void M(ReferenceEntry referenceEntry, int i2, long j2) {
            i();
            this.f27901B += (long) i2;
            if (this.f27902z.y()) {
                referenceEntry.m(j2);
            }
            if (this.f27902z.A()) {
                referenceEntry.p(j2);
            }
            this.L.add(referenceEntry);
            this.K.add(referenceEntry);
        }

        public Object N(Object obj, int i2, CacheLoader cacheLoader, boolean z2) {
            LoadingValueReference y2 = y(obj, i2, z2);
            if (y2 == null) {
                return null;
            }
            ListenableFuture z3 = z(obj, i2, y2, cacheLoader);
            if (z3.isDone()) {
                try {
                    return Uninterruptibles.a(z3);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        public Object P(Object obj, int i2) {
            RemovalCause removalCause;
            lock();
            try {
                G(this.f27902z.O.a());
                AtomicReferenceArray atomicReferenceArray = this.E;
                int length = (atomicReferenceArray.length() - 1) & i2;
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    }
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.h() != i2 || key == null || !this.f27902z.D.d(obj, key)) {
                        referenceEntry2 = referenceEntry2.f();
                    } else {
                        ValueReference d2 = referenceEntry2.d();
                        Object obj2 = d2.get();
                        if (obj2 != null) {
                            removalCause = RemovalCause.EXPLICIT;
                        } else if (d2.b()) {
                            removalCause = RemovalCause.COLLECTED;
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.C++;
                        atomicReferenceArray.set(length, V(referenceEntry, referenceEntry2, key, i2, obj2, d2, removalCause2));
                        this.f27900A--;
                        unlock();
                        F();
                        return obj2;
                    }
                }
                unlock();
                F();
                return null;
            } catch (Throwable th) {
                unlock();
                F();
                throw th;
            }
        }

        public boolean Q(Object obj, int i2, Object obj2) {
            RemovalCause removalCause;
            lock();
            try {
                G(this.f27902z.O.a());
                AtomicReferenceArray atomicReferenceArray = this.E;
                boolean z2 = true;
                int length = (atomicReferenceArray.length() - 1) & i2;
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    }
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.h() != i2 || key == null || !this.f27902z.D.d(obj, key)) {
                        referenceEntry2 = referenceEntry2.f();
                    } else {
                        ValueReference d2 = referenceEntry2.d();
                        Object obj3 = d2.get();
                        if (this.f27902z.E.d(obj2, obj3)) {
                            removalCause = RemovalCause.EXPLICIT;
                        } else if (obj3 == null && d2.b()) {
                            removalCause = RemovalCause.COLLECTED;
                        }
                        this.C++;
                        atomicReferenceArray.set(length, V(referenceEntry, referenceEntry2, key, i2, obj3, d2, removalCause));
                        this.f27900A--;
                        if (removalCause != RemovalCause.EXPLICIT) {
                            z2 = false;
                        }
                        unlock();
                        F();
                        return z2;
                    }
                }
                unlock();
                F();
                return false;
            } catch (Throwable th) {
                unlock();
                F();
                throw th;
            }
        }

        public void R(ReferenceEntry referenceEntry) {
            l(referenceEntry.getKey(), referenceEntry.h(), referenceEntry.d().get(), referenceEntry.d().a(), RemovalCause.COLLECTED);
            this.K.remove(referenceEntry);
            this.L.remove(referenceEntry);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.google.common.cache.ReferenceEntry} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean S(com.google.common.cache.ReferenceEntry r13, int r14, com.google.common.cache.RemovalCause r15) {
            /*
                r12 = this;
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.E
                int r1 = r0.length()
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r14
                java.lang.Object r3 = r0.get(r1)
                r5 = r3
                com.google.common.cache.ReferenceEntry r5 = (com.google.common.cache.ReferenceEntry) r5
                r6 = r5
            L_0x0011:
                if (r6 == 0) goto L_0x003f
                if (r6 != r13) goto L_0x003a
                int r13 = r12.C
                int r13 = r13 + r2
                r12.C = r13
                java.lang.Object r7 = r6.getKey()
                com.google.common.cache.LocalCache$ValueReference r13 = r6.d()
                java.lang.Object r9 = r13.get()
                com.google.common.cache.LocalCache$ValueReference r10 = r6.d()
                r4 = r12
                r8 = r14
                r11 = r15
                com.google.common.cache.ReferenceEntry r13 = r4.V(r5, r6, r7, r8, r9, r10, r11)
                int r14 = r12.f27900A
                int r14 = r14 - r2
                r0.set(r1, r13)
                r12.f27900A = r14
                return r2
            L_0x003a:
                com.google.common.cache.ReferenceEntry r6 = r6.f()
                goto L_0x0011
            L_0x003f:
                r13 = 0
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.S(com.google.common.cache.ReferenceEntry, int, com.google.common.cache.RemovalCause):boolean");
        }

        public ReferenceEntry T(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            int i2 = this.f27900A;
            ReferenceEntry f2 = referenceEntry2.f();
            while (referenceEntry != referenceEntry2) {
                ReferenceEntry g2 = g(referenceEntry, f2);
                if (g2 != null) {
                    f2 = g2;
                } else {
                    R(referenceEntry);
                    i2--;
                }
                referenceEntry = referenceEntry.f();
            }
            this.f27900A = i2;
            return f2;
        }

        public boolean U(Object obj, int i2, LoadingValueReference loadingValueReference) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.E;
                int length = (atomicReferenceArray.length() - 1) & i2;
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    }
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.h() != i2 || key == null || !this.f27902z.D.d(obj, key)) {
                        referenceEntry2 = referenceEntry2.f();
                    } else if (referenceEntry2.d() == loadingValueReference) {
                        if (loadingValueReference.b()) {
                            referenceEntry2.k(loadingValueReference.j());
                        } else {
                            atomicReferenceArray.set(length, T(referenceEntry, referenceEntry2));
                        }
                        return true;
                    }
                }
                unlock();
                F();
                return false;
            } finally {
                unlock();
                F();
            }
        }

        public ReferenceEntry V(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj, int i2, Object obj2, ValueReference valueReference, RemovalCause removalCause) {
            l(obj, i2, obj2, valueReference.a(), removalCause);
            this.K.remove(referenceEntry2);
            this.L.remove(referenceEntry2);
            if (!valueReference.e()) {
                return T(referenceEntry, referenceEntry2);
            }
            valueReference.d((Object) null);
            return referenceEntry;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
            r15 = r12.d();
            r16 = r15.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
            if (r16 != null) goto L_0x0076;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
            if (r15.b() == false) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
            r9.C++;
            r10.set(r11, V(r2, r12, r4, r19, r16, r15, com.google.common.cache.RemovalCause.f27931B));
            r9.f27900A--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r9.C++;
            l(r18, r19, r16, r15.a(), com.google.common.cache.RemovalCause.f27930A);
            b0(r12, r18, r20, r7);
            m(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x009b, code lost:
            unlock();
            F();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
            return r16;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object W(java.lang.Object r18, int r19, java.lang.Object r20) {
            /*
                r17 = this;
                r9 = r17
                r0 = r19
                r17.lock()
                com.google.common.cache.LocalCache r1 = r9.f27902z     // Catch:{ all -> 0x006d }
                com.google.common.base.Ticker r1 = r1.O     // Catch:{ all -> 0x006d }
                long r7 = r1.a()     // Catch:{ all -> 0x006d }
                r9.G(r7)     // Catch:{ all -> 0x006d }
                java.util.concurrent.atomic.AtomicReferenceArray r10 = r9.E     // Catch:{ all -> 0x006d }
                int r1 = r10.length()     // Catch:{ all -> 0x006d }
                int r1 = r1 + -1
                r11 = r0 & r1
                java.lang.Object r1 = r10.get(r11)     // Catch:{ all -> 0x006d }
                r2 = r1
                com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2     // Catch:{ all -> 0x006d }
                r12 = r2
            L_0x0024:
                r13 = 0
                if (r12 == 0) goto L_0x006f
                java.lang.Object r4 = r12.getKey()     // Catch:{ all -> 0x006d }
                int r1 = r12.h()     // Catch:{ all -> 0x006d }
                if (r1 != r0) goto L_0x00a2
                if (r4 == 0) goto L_0x00a2
                com.google.common.cache.LocalCache r1 = r9.f27902z     // Catch:{ all -> 0x006d }
                com.google.common.base.Equivalence r1 = r1.D     // Catch:{ all -> 0x006d }
                r14 = r18
                boolean r1 = r1.d(r14, r4)     // Catch:{ all -> 0x006d }
                if (r1 == 0) goto L_0x00a4
                com.google.common.cache.LocalCache$ValueReference r15 = r12.d()     // Catch:{ all -> 0x006d }
                java.lang.Object r16 = r15.get()     // Catch:{ all -> 0x006d }
                if (r16 != 0) goto L_0x0076
                boolean r1 = r15.b()     // Catch:{ all -> 0x006d }
                if (r1 == 0) goto L_0x006f
                int r1 = r9.C     // Catch:{ all -> 0x006d }
                int r1 = r1 + 1
                r9.C = r1     // Catch:{ all -> 0x006d }
                com.google.common.cache.RemovalCause r8 = com.google.common.cache.RemovalCause.COLLECTED     // Catch:{ all -> 0x006d }
                r1 = r17
                r3 = r12
                r5 = r19
                r6 = r16
                r7 = r15
                com.google.common.cache.ReferenceEntry r0 = r1.V(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x006d }
                int r1 = r9.f27900A     // Catch:{ all -> 0x006d }
                int r1 = r1 + -1
                r10.set(r11, r0)     // Catch:{ all -> 0x006d }
                r9.f27900A = r1     // Catch:{ all -> 0x006d }
                goto L_0x006f
            L_0x006d:
                r0 = move-exception
                goto L_0x00aa
            L_0x006f:
                r17.unlock()
                r17.F()
                return r13
            L_0x0076:
                int r1 = r9.C     // Catch:{ all -> 0x006d }
                int r1 = r1 + 1
                r9.C = r1     // Catch:{ all -> 0x006d }
                int r5 = r15.a()     // Catch:{ all -> 0x006d }
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch:{ all -> 0x006d }
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r16
                r1.l(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x006d }
                r1 = r17
                r2 = r12
                r3 = r18
                r4 = r20
                r5 = r7
                r1.b0(r2, r3, r4, r5)     // Catch:{ all -> 0x006d }
                r9.m(r12)     // Catch:{ all -> 0x006d }
                r17.unlock()
                r17.F()
                return r16
            L_0x00a2:
                r14 = r18
            L_0x00a4:
                com.google.common.cache.ReferenceEntry r12 = r12.f()     // Catch:{ all -> 0x006d }
                goto L_0x0024
            L_0x00aa:
                r17.unlock()
                r17.F()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.W(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
            r16 = r13.d();
            r6 = r16.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
            if (r6 != null) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
            if (r16.b() == false) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
            r9.C++;
            r10.set(r12, V(r2, r13, r4, r19, r6, r16, com.google.common.cache.RemovalCause.f27931B));
            r9.f27900A--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
            if (r9.f27902z.E.d(r20, r6) == false) goto L_0x00aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
            r9.C++;
            l(r18, r19, r6, r16.a(), com.google.common.cache.RemovalCause.f27930A);
            b0(r13, r18, r21, r7);
            m(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a3, code lost:
            unlock();
            F();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a9, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            K(r13, r7);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean X(java.lang.Object r18, int r19, java.lang.Object r20, java.lang.Object r21) {
            /*
                r17 = this;
                r9 = r17
                r0 = r19
                r17.lock()
                com.google.common.cache.LocalCache r1 = r9.f27902z     // Catch:{ all -> 0x006a }
                com.google.common.base.Ticker r1 = r1.O     // Catch:{ all -> 0x006a }
                long r7 = r1.a()     // Catch:{ all -> 0x006a }
                r9.G(r7)     // Catch:{ all -> 0x006a }
                java.util.concurrent.atomic.AtomicReferenceArray r10 = r9.E     // Catch:{ all -> 0x006a }
                int r1 = r10.length()     // Catch:{ all -> 0x006a }
                r11 = 1
                int r1 = r1 - r11
                r12 = r0 & r1
                java.lang.Object r1 = r10.get(r12)     // Catch:{ all -> 0x006a }
                r2 = r1
                com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2     // Catch:{ all -> 0x006a }
                r13 = r2
            L_0x0024:
                r14 = 0
                if (r13 == 0) goto L_0x006c
                java.lang.Object r4 = r13.getKey()     // Catch:{ all -> 0x006a }
                int r1 = r13.h()     // Catch:{ all -> 0x006a }
                if (r1 != r0) goto L_0x00b1
                if (r4 == 0) goto L_0x00b1
                com.google.common.cache.LocalCache r1 = r9.f27902z     // Catch:{ all -> 0x006a }
                com.google.common.base.Equivalence r1 = r1.D     // Catch:{ all -> 0x006a }
                r15 = r18
                boolean r1 = r1.d(r15, r4)     // Catch:{ all -> 0x006a }
                if (r1 == 0) goto L_0x00ae
                com.google.common.cache.LocalCache$ValueReference r16 = r13.d()     // Catch:{ all -> 0x006a }
                java.lang.Object r6 = r16.get()     // Catch:{ all -> 0x006a }
                if (r6 != 0) goto L_0x0073
                boolean r1 = r16.b()     // Catch:{ all -> 0x006a }
                if (r1 == 0) goto L_0x006c
                int r1 = r9.C     // Catch:{ all -> 0x006a }
                int r1 = r1 + r11
                r9.C = r1     // Catch:{ all -> 0x006a }
                com.google.common.cache.RemovalCause r8 = com.google.common.cache.RemovalCause.COLLECTED     // Catch:{ all -> 0x006a }
                r1 = r17
                r3 = r13
                r5 = r19
                r7 = r16
                com.google.common.cache.ReferenceEntry r0 = r1.V(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x006a }
                int r1 = r9.f27900A     // Catch:{ all -> 0x006a }
                int r1 = r1 - r11
                r10.set(r12, r0)     // Catch:{ all -> 0x006a }
                r9.f27900A = r1     // Catch:{ all -> 0x006a }
                goto L_0x006c
            L_0x006a:
                r0 = move-exception
                goto L_0x00ba
            L_0x006c:
                r17.unlock()
                r17.F()
                return r14
            L_0x0073:
                com.google.common.cache.LocalCache r1 = r9.f27902z     // Catch:{ all -> 0x006a }
                com.google.common.base.Equivalence r1 = r1.E     // Catch:{ all -> 0x006a }
                r3 = r20
                boolean r1 = r1.d(r3, r6)     // Catch:{ all -> 0x006a }
                if (r1 == 0) goto L_0x00aa
                int r1 = r9.C     // Catch:{ all -> 0x006a }
                int r1 = r1 + r11
                r9.C = r1     // Catch:{ all -> 0x006a }
                int r5 = r16.a()     // Catch:{ all -> 0x006a }
                com.google.common.cache.RemovalCause r10 = com.google.common.cache.RemovalCause.REPLACED     // Catch:{ all -> 0x006a }
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r6
                r6 = r10
                r1.l(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x006a }
                r1 = r17
                r2 = r13
                r3 = r18
                r4 = r21
                r5 = r7
                r1.b0(r2, r3, r4, r5)     // Catch:{ all -> 0x006a }
                r9.m(r13)     // Catch:{ all -> 0x006a }
                r17.unlock()
                r17.F()
                return r11
            L_0x00aa:
                r9.K(r13, r7)     // Catch:{ all -> 0x006a }
                goto L_0x006c
            L_0x00ae:
                r3 = r20
                goto L_0x00b4
            L_0x00b1:
                r15 = r18
                goto L_0x00ae
            L_0x00b4:
                com.google.common.cache.ReferenceEntry r13 = r13.f()     // Catch:{ all -> 0x006a }
                goto L_0x0024
            L_0x00ba:
                r17.unlock()
                r17.F()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.X(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        public void Y(long j2) {
            if (tryLock()) {
                try {
                    j();
                    o(j2);
                    this.J.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public void Z() {
            if (!isHeldByCurrentThread()) {
                this.f27902z.v();
            }
        }

        public void a() {
            Y(this.f27902z.O.a());
            Z();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
            r3 = N(r4, r5, r9, true);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a0(com.google.common.cache.ReferenceEntry r3, java.lang.Object r4, int r5, java.lang.Object r6, long r7, com.google.common.cache.CacheLoader r9) {
            /*
                r2 = this;
                com.google.common.cache.LocalCache r0 = r2.f27902z
                boolean r0 = r0.B()
                if (r0 == 0) goto L_0x0027
                long r0 = r3.l()
                long r7 = r7 - r0
                com.google.common.cache.LocalCache r0 = r2.f27902z
                long r0 = r0.L
                int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r7 <= 0) goto L_0x0027
                com.google.common.cache.LocalCache$ValueReference r3 = r3.d()
                boolean r3 = r3.e()
                if (r3 != 0) goto L_0x0027
                r3 = 1
                java.lang.Object r3 = r2.N(r4, r5, r9, r3)
                if (r3 == 0) goto L_0x0027
                return r3
            L_0x0027:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.a0(com.google.common.cache.ReferenceEntry, java.lang.Object, int, java.lang.Object, long, com.google.common.cache.CacheLoader):java.lang.Object");
        }

        public void b() {
            RemovalCause removalCause;
            if (this.f27900A != 0) {
                lock();
                try {
                    G(this.f27902z.O.a());
                    AtomicReferenceArray atomicReferenceArray = this.E;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i2); referenceEntry != null; referenceEntry = referenceEntry.f()) {
                            if (referenceEntry.d().b()) {
                                Object key = referenceEntry.getKey();
                                Object obj = referenceEntry.d().get();
                                if (key != null) {
                                    if (obj != null) {
                                        removalCause = RemovalCause.EXPLICIT;
                                        l(key, referenceEntry.h(), obj, referenceEntry.d().a(), removalCause);
                                    }
                                }
                                removalCause = RemovalCause.COLLECTED;
                                l(key, referenceEntry.h(), obj, referenceEntry.d().a(), removalCause);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, (Object) null);
                    }
                    d();
                    this.K.clear();
                    this.L.clear();
                    this.J.set(0);
                    this.C++;
                    this.f27900A = 0;
                    unlock();
                    F();
                } catch (Throwable th) {
                    unlock();
                    F();
                    throw th;
                }
            }
        }

        public void b0(ReferenceEntry referenceEntry, Object obj, Object obj2, long j2) {
            ValueReference d2 = referenceEntry.d();
            int d3 = this.f27902z.I.d(obj, obj2);
            Preconditions.x(d3 >= 0, "Weights must be non-negative");
            referenceEntry.k(this.f27902z.G.h(this, referenceEntry, obj2, d3));
            M(referenceEntry, d3, j2);
            d2.d(obj2);
        }

        public void c() {
            do {
            } while (this.G.poll() != null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
            r1 = r14.d();
            r4 = r1.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
            if (r18 == r1) goto L_0x0076;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
            if (r4 != null) goto L_0x0061;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
            if (r1 == com.google.common.cache.LocalCache.W) goto L_0x0061;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
            l(r16, r17, r19, 0, com.google.common.cache.RemovalCause.f27930A);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
            unlock();
            F();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r7.C++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
            if (r18.b() == false) goto L_0x0098;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
            if (r4 != null) goto L_0x0087;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
            r1 = com.google.common.cache.RemovalCause.f27931B;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
            r1 = com.google.common.cache.RemovalCause.f27930A;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
            l(r16, r17, r4, r18.a(), r1);
            r11 = r11 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
            b0(r14, r16, r19, r8);
            r7.f27900A = r11;
            m(r14);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c0(java.lang.Object r16, int r17, com.google.common.cache.LocalCache.LoadingValueReference r18, java.lang.Object r19) {
            /*
                r15 = this;
                r7 = r15
                r0 = r16
                r3 = r17
                r15.lock()
                com.google.common.cache.LocalCache r1 = r7.f27902z     // Catch:{ all -> 0x0023 }
                com.google.common.base.Ticker r1 = r1.O     // Catch:{ all -> 0x0023 }
                long r8 = r1.a()     // Catch:{ all -> 0x0023 }
                r15.G(r8)     // Catch:{ all -> 0x0023 }
                int r1 = r7.f27900A     // Catch:{ all -> 0x0023 }
                r10 = 1
                int r1 = r1 + r10
                int r2 = r7.D     // Catch:{ all -> 0x0023 }
                if (r1 <= r2) goto L_0x0021
                r15.n()     // Catch:{ all -> 0x0023 }
                int r1 = r7.f27900A     // Catch:{ all -> 0x0023 }
                int r1 = r1 + r10
            L_0x0021:
                r11 = r1
                goto L_0x0026
            L_0x0023:
                r0 = move-exception
                goto L_0x00d1
            L_0x0026:
                java.util.concurrent.atomic.AtomicReferenceArray r12 = r7.E     // Catch:{ all -> 0x0023 }
                int r1 = r12.length()     // Catch:{ all -> 0x0023 }
                int r1 = r1 - r10
                r13 = r3 & r1
                java.lang.Object r1 = r12.get(r13)     // Catch:{ all -> 0x0023 }
                com.google.common.cache.ReferenceEntry r1 = (com.google.common.cache.ReferenceEntry) r1     // Catch:{ all -> 0x0023 }
                r14 = r1
            L_0x0036:
                if (r14 == 0) goto L_0x00b5
                java.lang.Object r2 = r14.getKey()     // Catch:{ all -> 0x0023 }
                int r4 = r14.h()     // Catch:{ all -> 0x0023 }
                if (r4 != r3) goto L_0x00ae
                if (r2 == 0) goto L_0x00ae
                com.google.common.cache.LocalCache r4 = r7.f27902z     // Catch:{ all -> 0x0023 }
                com.google.common.base.Equivalence r4 = r4.D     // Catch:{ all -> 0x0023 }
                boolean r2 = r4.d(r0, r2)     // Catch:{ all -> 0x0023 }
                if (r2 == 0) goto L_0x00ae
                com.google.common.cache.LocalCache$ValueReference r1 = r14.d()     // Catch:{ all -> 0x0023 }
                java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x0023 }
                r2 = r18
                if (r2 == r1) goto L_0x0076
                if (r4 != 0) goto L_0x0061
                com.google.common.cache.LocalCache$ValueReference r5 = com.google.common.cache.LocalCache.W     // Catch:{ all -> 0x0023 }
                if (r1 == r5) goto L_0x0061
                goto L_0x0076
            L_0x0061:
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch:{ all -> 0x0023 }
                r5 = 0
                r1 = r15
                r2 = r16
                r3 = r17
                r4 = r19
                r1.l(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0023 }
                r15.unlock()
                r15.F()
                r0 = 0
                return r0
            L_0x0076:
                int r1 = r7.C     // Catch:{ all -> 0x0023 }
                int r1 = r1 + r10
                r7.C = r1     // Catch:{ all -> 0x0023 }
                boolean r1 = r18.b()     // Catch:{ all -> 0x0023 }
                if (r1 == 0) goto L_0x0098
                if (r4 != 0) goto L_0x0087
                com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.COLLECTED     // Catch:{ all -> 0x0023 }
            L_0x0085:
                r6 = r1
                goto L_0x008a
            L_0x0087:
                com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.REPLACED     // Catch:{ all -> 0x0023 }
                goto L_0x0085
            L_0x008a:
                int r5 = r18.a()     // Catch:{ all -> 0x0023 }
                r1 = r15
                r2 = r16
                r3 = r17
                r1.l(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0023 }
                int r11 = r11 + -1
            L_0x0098:
                r1 = r15
                r2 = r14
                r3 = r16
                r4 = r19
                r5 = r8
                r1.b0(r2, r3, r4, r5)     // Catch:{ all -> 0x0023 }
                r7.f27900A = r11     // Catch:{ all -> 0x0023 }
                r15.m(r14)     // Catch:{ all -> 0x0023 }
            L_0x00a7:
                r15.unlock()
                r15.F()
                return r10
            L_0x00ae:
                r2 = r18
                com.google.common.cache.ReferenceEntry r14 = r14.f()     // Catch:{ all -> 0x0023 }
                goto L_0x0036
            L_0x00b5:
                int r2 = r7.C     // Catch:{ all -> 0x0023 }
                int r2 = r2 + r10
                r7.C = r2     // Catch:{ all -> 0x0023 }
                com.google.common.cache.ReferenceEntry r14 = r15.C(r0, r3, r1)     // Catch:{ all -> 0x0023 }
                r1 = r15
                r2 = r14
                r3 = r16
                r4 = r19
                r5 = r8
                r1.b0(r2, r3, r4, r5)     // Catch:{ all -> 0x0023 }
                r12.set(r13, r14)     // Catch:{ all -> 0x0023 }
                r7.f27900A = r11     // Catch:{ all -> 0x0023 }
                r15.m(r14)     // Catch:{ all -> 0x0023 }
                goto L_0x00a7
            L_0x00d1:
                r15.unlock()
                r15.F()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.c0(java.lang.Object, int, com.google.common.cache.LocalCache$LoadingValueReference, java.lang.Object):boolean");
        }

        public void d() {
            if (this.f27902z.J()) {
                c();
            }
            if (this.f27902z.K()) {
                e();
            }
        }

        public void d0() {
            if (tryLock()) {
                try {
                    j();
                } finally {
                    unlock();
                }
            }
        }

        public void e() {
            do {
            } while (this.H.poll() != null);
        }

        public void e0(long j2) {
            if (tryLock()) {
                try {
                    o(j2);
                } finally {
                    unlock();
                }
            }
        }

        public boolean f(Object obj, int i2) {
            try {
                boolean z2 = false;
                if (this.f27900A != 0) {
                    ReferenceEntry u2 = u(obj, i2, this.f27902z.O.a());
                    if (u2 == null) {
                        return false;
                    }
                    if (u2.d().get() != null) {
                        z2 = true;
                    }
                    E();
                    return z2;
                }
                E();
                return false;
            } finally {
                E();
            }
        }

        public Object f0(ReferenceEntry referenceEntry, Object obj, ValueReference valueReference) {
            if (valueReference.e()) {
                Preconditions.z(!Thread.holdsLock(referenceEntry), "Recursive load of: %s", obj);
                try {
                    Object f2 = valueReference.f();
                    if (f2 != null) {
                        L(referenceEntry, this.f27902z.O.a());
                        return f2;
                    }
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 35);
                    sb.append("CacheLoader returned null for key ");
                    sb.append(valueOf);
                    sb.append(".");
                    throw new CacheLoader.InvalidCacheLoadException(sb.toString());
                } finally {
                    this.M.c(1);
                }
            } else {
                throw new AssertionError();
            }
        }

        public ReferenceEntry g(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            if (referenceEntry.getKey() == null) {
                return null;
            }
            ValueReference d2 = referenceEntry.d();
            Object obj = d2.get();
            if (obj == null && d2.b()) {
                return null;
            }
            ReferenceEntry h2 = this.f27902z.P.h(this, referenceEntry, referenceEntry2);
            h2.k(d2.g(this.H, obj, h2));
            return h2;
        }

        public void h() {
            int i2 = 0;
            do {
                Reference poll = this.G.poll();
                if (poll != null) {
                    this.f27902z.w((ReferenceEntry) poll);
                    i2++;
                } else {
                    return;
                }
            } while (i2 != 16);
        }

        public void i() {
            while (true) {
                ReferenceEntry referenceEntry = (ReferenceEntry) this.I.poll();
                if (referenceEntry == null) {
                    return;
                }
                if (this.L.contains(referenceEntry)) {
                    this.L.add(referenceEntry);
                }
            }
        }

        public void j() {
            if (this.f27902z.J()) {
                h();
            }
            if (this.f27902z.K()) {
                k();
            }
        }

        public void k() {
            int i2 = 0;
            do {
                Reference poll = this.H.poll();
                if (poll != null) {
                    this.f27902z.x((ValueReference) poll);
                    i2++;
                } else {
                    return;
                }
            } while (i2 != 16);
        }

        public void l(Object obj, int i2, Object obj2, int i3, RemovalCause removalCause) {
            this.f27901B -= (long) i3;
            if (removalCause.f()) {
                this.M.a();
            }
            if (this.f27902z.M != LocalCache.X) {
                this.f27902z.M.offer(RemovalNotification.a(obj, obj2, removalCause));
            }
        }

        public void m(ReferenceEntry referenceEntry) {
            if (this.f27902z.h()) {
                i();
                if (((long) referenceEntry.d().a()) <= this.F || S(referenceEntry, referenceEntry.h(), RemovalCause.SIZE)) {
                    while (this.f27901B > this.F) {
                        ReferenceEntry w2 = w();
                        if (!S(w2, w2.h(), RemovalCause.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        public void n() {
            AtomicReferenceArray atomicReferenceArray = this.E;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i2 = this.f27900A;
                AtomicReferenceArray D2 = D(length << 1);
                this.D = (D2.length() * 3) / 4;
                int length2 = D2.length() - 1;
                for (int i3 = 0; i3 < length; i3++) {
                    ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i3);
                    if (referenceEntry != null) {
                        ReferenceEntry f2 = referenceEntry.f();
                        int h2 = referenceEntry.h() & length2;
                        if (f2 == null) {
                            D2.set(h2, referenceEntry);
                        } else {
                            ReferenceEntry referenceEntry2 = referenceEntry;
                            while (f2 != null) {
                                int h3 = f2.h() & length2;
                                if (h3 != h2) {
                                    referenceEntry2 = f2;
                                    h2 = h3;
                                }
                                f2 = f2.f();
                            }
                            D2.set(h2, referenceEntry2);
                            while (referenceEntry != referenceEntry2) {
                                int h4 = referenceEntry.h() & length2;
                                ReferenceEntry g2 = g(referenceEntry, (ReferenceEntry) D2.get(h4));
                                if (g2 != null) {
                                    D2.set(h4, g2);
                                } else {
                                    R(referenceEntry);
                                    i2--;
                                }
                                referenceEntry = referenceEntry.f();
                            }
                        }
                    }
                }
                this.E = D2;
                this.f27900A = i2;
            }
        }

        public void o(long j2) {
            ReferenceEntry referenceEntry;
            ReferenceEntry referenceEntry2;
            i();
            do {
                referenceEntry = (ReferenceEntry) this.K.peek();
                if (referenceEntry == null || !this.f27902z.p(referenceEntry, j2)) {
                    do {
                        referenceEntry2 = (ReferenceEntry) this.L.peek();
                        if (referenceEntry2 == null || !this.f27902z.p(referenceEntry2, j2)) {
                            return;
                        }
                    } while (S(referenceEntry2, referenceEntry2.h(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (S(referenceEntry, referenceEntry.h(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        public Object p(Object obj, int i2) {
            try {
                if (this.f27900A != 0) {
                    long a2 = this.f27902z.O.a();
                    ReferenceEntry u2 = u(obj, i2, a2);
                    if (u2 == null) {
                        return null;
                    }
                    Object obj2 = u2.d().get();
                    if (obj2 != null) {
                        L(u2, a2);
                        Object a0 = a0(u2, u2.getKey(), i2, obj2, a2, this.f27902z.R);
                        E();
                        return a0;
                    }
                    d0();
                }
                E();
                return null;
            } finally {
                E();
            }
        }

        public Object q(Object obj, int i2, CacheLoader cacheLoader) {
            ReferenceEntry s2;
            Preconditions.q(obj);
            Preconditions.q(cacheLoader);
            try {
                if (!(this.f27900A == 0 || (s2 = s(obj, i2)) == null)) {
                    long a2 = this.f27902z.O.a();
                    Object v2 = v(s2, a2);
                    if (v2 != null) {
                        L(s2, a2);
                        this.M.b(1);
                        Object a0 = a0(s2, obj, i2, v2, a2, cacheLoader);
                        E();
                        return a0;
                    }
                    ValueReference d2 = s2.d();
                    if (d2.e()) {
                        Object f0 = f0(s2, obj, d2);
                        E();
                        return f0;
                    }
                }
                Object B2 = B(obj, i2, cacheLoader);
                E();
                return B2;
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof Error) {
                    throw new ExecutionError((Error) cause);
                } else if (cause instanceof RuntimeException) {
                    throw new UncheckedExecutionException(cause);
                } else {
                    throw e2;
                }
            } catch (Throwable th) {
                E();
                throw th;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object r(java.lang.Object r5, int r6, com.google.common.cache.LocalCache.LoadingValueReference r7, com.google.common.util.concurrent.ListenableFuture r8) {
            /*
                r4 = this;
                java.lang.Object r8 = com.google.common.util.concurrent.Uninterruptibles.a(r8)     // Catch:{ all -> 0x003b }
                if (r8 == 0) goto L_0x0015
                com.google.common.cache.AbstractCache$StatsCounter r0 = r4.M     // Catch:{ all -> 0x0013 }
                long r1 = r7.h()     // Catch:{ all -> 0x0013 }
                r0.e(r1)     // Catch:{ all -> 0x0013 }
                r4.c0(r5, r6, r7, r8)     // Catch:{ all -> 0x0013 }
                return r8
            L_0x0013:
                r0 = move-exception
                goto L_0x003d
            L_0x0015:
                com.google.common.cache.CacheLoader$InvalidCacheLoadException r0 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException     // Catch:{ all -> 0x0013 }
                java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0013 }
                int r2 = r1.length()     // Catch:{ all -> 0x0013 }
                int r2 = r2 + 35
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0013 }
                r3.<init>(r2)     // Catch:{ all -> 0x0013 }
                java.lang.String r2 = "CacheLoader returned null for key "
                r3.append(r2)     // Catch:{ all -> 0x0013 }
                r3.append(r1)     // Catch:{ all -> 0x0013 }
                java.lang.String r1 = "."
                r3.append(r1)     // Catch:{ all -> 0x0013 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0013 }
                r0.<init>(r1)     // Catch:{ all -> 0x0013 }
                throw r0     // Catch:{ all -> 0x0013 }
            L_0x003b:
                r0 = move-exception
                r8 = 0
            L_0x003d:
                if (r8 != 0) goto L_0x004b
                com.google.common.cache.AbstractCache$StatsCounter r8 = r4.M
                long r1 = r7.h()
                r8.d(r1)
                r4.U(r5, r6, r7)
            L_0x004b:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.r(java.lang.Object, int, com.google.common.cache.LocalCache$LoadingValueReference, com.google.common.util.concurrent.ListenableFuture):java.lang.Object");
        }

        public ReferenceEntry s(Object obj, int i2) {
            for (ReferenceEntry t2 = t(i2); t2 != null; t2 = t2.f()) {
                if (t2.h() == i2) {
                    Object key = t2.getKey();
                    if (key == null) {
                        d0();
                    } else if (this.f27902z.D.d(obj, key)) {
                        return t2;
                    }
                }
            }
            return null;
        }

        public ReferenceEntry t(int i2) {
            AtomicReferenceArray atomicReferenceArray = this.E;
            return (ReferenceEntry) atomicReferenceArray.get(i2 & (atomicReferenceArray.length() - 1));
        }

        public ReferenceEntry u(Object obj, int i2, long j2) {
            ReferenceEntry s2 = s(obj, i2);
            if (s2 == null) {
                return null;
            }
            if (!this.f27902z.p(s2, j2)) {
                return s2;
            }
            e0(j2);
            return null;
        }

        public Object v(ReferenceEntry referenceEntry, long j2) {
            if (referenceEntry.getKey() == null) {
                d0();
                return null;
            }
            Object obj = referenceEntry.d().get();
            if (obj == null) {
                d0();
                return null;
            } else if (!this.f27902z.p(referenceEntry, j2)) {
                return obj;
            } else {
                e0(j2);
                return null;
            }
        }

        public ReferenceEntry w() {
            for (ReferenceEntry referenceEntry : this.L) {
                if (referenceEntry.d().a() > 0) {
                    return referenceEntry;
                }
            }
            throw new AssertionError();
        }

        public void x(AtomicReferenceArray atomicReferenceArray) {
            this.D = (atomicReferenceArray.length() * 3) / 4;
            if (!this.f27902z.f()) {
                int i2 = this.D;
                if (((long) i2) == this.F) {
                    this.D = i2 + 1;
                }
            }
            this.E = atomicReferenceArray;
        }

        /* JADX INFO: finally extract failed */
        public LoadingValueReference y(Object obj, int i2, boolean z2) {
            lock();
            try {
                long a2 = this.f27902z.O.a();
                G(a2);
                AtomicReferenceArray atomicReferenceArray = this.E;
                int length = (atomicReferenceArray.length() - 1) & i2;
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (referenceEntry2 != null) {
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.h() != i2 || key == null || !this.f27902z.D.d(obj, key)) {
                        referenceEntry2 = referenceEntry2.f();
                    } else {
                        ValueReference d2 = referenceEntry2.d();
                        if (!d2.e()) {
                            if (!z2 || a2 - referenceEntry2.l() >= this.f27902z.L) {
                                this.C++;
                                LoadingValueReference loadingValueReference = new LoadingValueReference(d2);
                                referenceEntry2.k(loadingValueReference);
                                unlock();
                                F();
                                return loadingValueReference;
                            }
                        }
                        unlock();
                        F();
                        return null;
                    }
                }
                this.C++;
                LoadingValueReference loadingValueReference2 = new LoadingValueReference();
                ReferenceEntry C2 = C(obj, i2, referenceEntry);
                C2.k(loadingValueReference2);
                atomicReferenceArray.set(length, C2);
                unlock();
                F();
                return loadingValueReference2;
            } catch (Throwable th) {
                unlock();
                F();
                throw th;
            }
        }

        public ListenableFuture z(Object obj, int i2, LoadingValueReference loadingValueReference, CacheLoader cacheLoader) {
            ListenableFuture k2 = loadingValueReference.k(obj, cacheLoader);
            final Object obj2 = obj;
            final int i3 = i2;
            final LoadingValueReference loadingValueReference2 = loadingValueReference;
            final ListenableFuture listenableFuture = k2;
            k2.C(new Runnable() {
                public void run() {
                    try {
                        Segment.this.r(obj2, i3, loadingValueReference2, listenableFuture);
                    } catch (Throwable th) {
                        LocalCache.V.log(Level.WARNING, "Exception thrown during refresh", th);
                        loadingValueReference2.m(th);
                    }
                }
            }, MoreExecutors.a());
            return k2;
        }
    }

    public static class SoftValueReference<K, V> extends SoftReference<V> implements ValueReference<K, V> {

        /* renamed from: z  reason: collision with root package name */
        public final ReferenceEntry f27906z;

        public SoftValueReference(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            super(obj, referenceQueue);
            this.f27906z = referenceEntry;
        }

        public int a() {
            return 1;
        }

        public boolean b() {
            return true;
        }

        public ReferenceEntry c() {
            return this.f27906z;
        }

        public void d(Object obj) {
        }

        public boolean e() {
            return false;
        }

        public Object f() {
            return get();
        }

        public ValueReference g(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return new SoftValueReference(referenceQueue, obj, referenceEntry);
        }
    }

    public enum Strength {
        STRONG {
            public Equivalence f() {
                return Equivalence.c();
            }

            public ValueReference h(Segment segment, ReferenceEntry referenceEntry, Object obj, int i2) {
                return i2 == 1 ? new StrongValueReference(obj) : new WeightedStrongValueReference(obj, i2);
            }
        },
        SOFT {
            public Equivalence f() {
                return Equivalence.f();
            }

            public ValueReference h(Segment segment, ReferenceEntry referenceEntry, Object obj, int i2) {
                return i2 == 1 ? new SoftValueReference(segment.H, obj, referenceEntry) : new WeightedSoftValueReference(segment.H, obj, referenceEntry, i2);
            }
        },
        WEAK {
            public Equivalence f() {
                return Equivalence.f();
            }

            public ValueReference h(Segment segment, ReferenceEntry referenceEntry, Object obj, int i2) {
                return i2 == 1 ? new WeakValueReference(segment.H, obj, referenceEntry) : new WeightedWeakValueReference(segment.H, obj, referenceEntry, i2);
            }
        };

        public abstract Equivalence f();

        public abstract ValueReference h(Segment segment, ReferenceEntry referenceEntry, Object obj, int i2);
    }

    public static final class StrongAccessEntry<K, V> extends StrongEntry<K, V> {
        public volatile long D = Long.MAX_VALUE;
        public ReferenceEntry E = LocalCache.s();
        public ReferenceEntry F = LocalCache.s();

        public StrongAccessEntry(Object obj, int i2, ReferenceEntry referenceEntry) {
            super(obj, i2, referenceEntry);
        }

        public ReferenceEntry j() {
            return this.F;
        }

        public void m(long j2) {
            this.D = j2;
        }

        public long o() {
            return this.D;
        }

        public ReferenceEntry r() {
            return this.E;
        }

        public void t(ReferenceEntry referenceEntry) {
            this.E = referenceEntry;
        }

        public void z(ReferenceEntry referenceEntry) {
            this.F = referenceEntry;
        }
    }

    public static final class StrongAccessWriteEntry<K, V> extends StrongEntry<K, V> {
        public volatile long D = Long.MAX_VALUE;
        public ReferenceEntry E = LocalCache.s();
        public ReferenceEntry F = LocalCache.s();
        public volatile long G = Long.MAX_VALUE;
        public ReferenceEntry H = LocalCache.s();
        public ReferenceEntry I = LocalCache.s();

        public StrongAccessWriteEntry(Object obj, int i2, ReferenceEntry referenceEntry) {
            super(obj, i2, referenceEntry);
        }

        public ReferenceEntry A() {
            return this.I;
        }

        public ReferenceEntry j() {
            return this.F;
        }

        public long l() {
            return this.G;
        }

        public void m(long j2) {
            this.D = j2;
        }

        public ReferenceEntry n() {
            return this.H;
        }

        public long o() {
            return this.D;
        }

        public void p(long j2) {
            this.G = j2;
        }

        public ReferenceEntry r() {
            return this.E;
        }

        public void t(ReferenceEntry referenceEntry) {
            this.E = referenceEntry;
        }

        public void x(ReferenceEntry referenceEntry) {
            this.H = referenceEntry;
        }

        public void y(ReferenceEntry referenceEntry) {
            this.I = referenceEntry;
        }

        public void z(ReferenceEntry referenceEntry) {
            this.F = referenceEntry;
        }
    }

    public static class StrongEntry<K, V> extends AbstractReferenceEntry<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public final int f27910A;

        /* renamed from: B  reason: collision with root package name */
        public final ReferenceEntry f27911B;
        public volatile ValueReference C = LocalCache.F();

        /* renamed from: z  reason: collision with root package name */
        public final Object f27912z;

        public StrongEntry(Object obj, int i2, ReferenceEntry referenceEntry) {
            this.f27912z = obj;
            this.f27910A = i2;
            this.f27911B = referenceEntry;
        }

        public ValueReference d() {
            return this.C;
        }

        public ReferenceEntry f() {
            return this.f27911B;
        }

        public Object getKey() {
            return this.f27912z;
        }

        public int h() {
            return this.f27910A;
        }

        public void k(ValueReference valueReference) {
            this.C = valueReference;
        }
    }

    public static class StrongValueReference<K, V> implements ValueReference<K, V> {

        /* renamed from: z  reason: collision with root package name */
        public final Object f27913z;

        public StrongValueReference(Object obj) {
            this.f27913z = obj;
        }

        public int a() {
            return 1;
        }

        public boolean b() {
            return true;
        }

        public ReferenceEntry c() {
            return null;
        }

        public void d(Object obj) {
        }

        public boolean e() {
            return false;
        }

        public Object f() {
            return get();
        }

        public ValueReference g(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return this;
        }

        public Object get() {
            return this.f27913z;
        }
    }

    public static final class StrongWriteEntry<K, V> extends StrongEntry<K, V> {
        public volatile long D = Long.MAX_VALUE;
        public ReferenceEntry E = LocalCache.s();
        public ReferenceEntry F = LocalCache.s();

        public StrongWriteEntry(Object obj, int i2, ReferenceEntry referenceEntry) {
            super(obj, i2, referenceEntry);
        }

        public ReferenceEntry A() {
            return this.F;
        }

        public long l() {
            return this.D;
        }

        public ReferenceEntry n() {
            return this.E;
        }

        public void p(long j2) {
            this.D = j2;
        }

        public void x(ReferenceEntry referenceEntry) {
            this.E = referenceEntry;
        }

        public void y(ReferenceEntry referenceEntry) {
            this.F = referenceEntry;
        }
    }

    public final class ValueIterator extends LocalCache<K, V>.HashIterator<V> {
        public ValueIterator(LocalCache localCache) {
            super();
        }

        public Object next() {
            return d().getValue();
        }
    }

    public interface ValueReference<K, V> {
        int a();

        boolean b();

        ReferenceEntry c();

        void d(Object obj);

        boolean e();

        Object f();

        ValueReference g(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry);

        Object get();
    }

    public final class Values extends AbstractCollection<V> {
        public Values() {
        }

        public void clear() {
            LocalCache.this.clear();
        }

        public boolean contains(Object obj) {
            return LocalCache.this.containsValue(obj);
        }

        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        public Iterator iterator() {
            return new ValueIterator(LocalCache.this);
        }

        public int size() {
            return LocalCache.this.size();
        }

        public Object[] toArray() {
            return LocalCache.E(this).toArray();
        }

        public Object[] toArray(Object[] objArr) {
            return LocalCache.E(this).toArray(objArr);
        }
    }

    public static final class WeakAccessEntry<K, V> extends WeakEntry<K, V> {
        public volatile long C = Long.MAX_VALUE;
        public ReferenceEntry D = LocalCache.s();
        public ReferenceEntry E = LocalCache.s();

        public WeakAccessEntry(ReferenceQueue referenceQueue, Object obj, int i2, ReferenceEntry referenceEntry) {
            super(referenceQueue, obj, i2, referenceEntry);
        }

        public ReferenceEntry j() {
            return this.E;
        }

        public void m(long j2) {
            this.C = j2;
        }

        public long o() {
            return this.C;
        }

        public ReferenceEntry r() {
            return this.D;
        }

        public void t(ReferenceEntry referenceEntry) {
            this.D = referenceEntry;
        }

        public void z(ReferenceEntry referenceEntry) {
            this.E = referenceEntry;
        }
    }

    public static final class WeakAccessWriteEntry<K, V> extends WeakEntry<K, V> {
        public volatile long C = Long.MAX_VALUE;
        public ReferenceEntry D = LocalCache.s();
        public ReferenceEntry E = LocalCache.s();
        public volatile long F = Long.MAX_VALUE;
        public ReferenceEntry G = LocalCache.s();
        public ReferenceEntry H = LocalCache.s();

        public WeakAccessWriteEntry(ReferenceQueue referenceQueue, Object obj, int i2, ReferenceEntry referenceEntry) {
            super(referenceQueue, obj, i2, referenceEntry);
        }

        public ReferenceEntry A() {
            return this.H;
        }

        public ReferenceEntry j() {
            return this.E;
        }

        public long l() {
            return this.F;
        }

        public void m(long j2) {
            this.C = j2;
        }

        public ReferenceEntry n() {
            return this.G;
        }

        public long o() {
            return this.C;
        }

        public void p(long j2) {
            this.F = j2;
        }

        public ReferenceEntry r() {
            return this.D;
        }

        public void t(ReferenceEntry referenceEntry) {
            this.D = referenceEntry;
        }

        public void x(ReferenceEntry referenceEntry) {
            this.G = referenceEntry;
        }

        public void y(ReferenceEntry referenceEntry) {
            this.H = referenceEntry;
        }

        public void z(ReferenceEntry referenceEntry) {
            this.E = referenceEntry;
        }
    }

    public static class WeakEntry<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public final ReferenceEntry f27915A;

        /* renamed from: B  reason: collision with root package name */
        public volatile ValueReference f27916B = LocalCache.F();

        /* renamed from: z  reason: collision with root package name */
        public final int f27917z;

        public WeakEntry(ReferenceQueue referenceQueue, Object obj, int i2, ReferenceEntry referenceEntry) {
            super(obj, referenceQueue);
            this.f27917z = i2;
            this.f27915A = referenceEntry;
        }

        public ReferenceEntry A() {
            throw new UnsupportedOperationException();
        }

        public ValueReference d() {
            return this.f27916B;
        }

        public ReferenceEntry f() {
            return this.f27915A;
        }

        public Object getKey() {
            return get();
        }

        public int h() {
            return this.f27917z;
        }

        public ReferenceEntry j() {
            throw new UnsupportedOperationException();
        }

        public void k(ValueReference valueReference) {
            this.f27916B = valueReference;
        }

        public long l() {
            throw new UnsupportedOperationException();
        }

        public void m(long j2) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry n() {
            throw new UnsupportedOperationException();
        }

        public long o() {
            throw new UnsupportedOperationException();
        }

        public void p(long j2) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry r() {
            throw new UnsupportedOperationException();
        }

        public void t(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void x(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void y(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void z(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }
    }

    public static class WeakValueReference<K, V> extends WeakReference<V> implements ValueReference<K, V> {

        /* renamed from: z  reason: collision with root package name */
        public final ReferenceEntry f27918z;

        public WeakValueReference(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            super(obj, referenceQueue);
            this.f27918z = referenceEntry;
        }

        public int a() {
            return 1;
        }

        public boolean b() {
            return true;
        }

        public ReferenceEntry c() {
            return this.f27918z;
        }

        public void d(Object obj) {
        }

        public boolean e() {
            return false;
        }

        public Object f() {
            return get();
        }

        public ValueReference g(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return new WeakValueReference(referenceQueue, obj, referenceEntry);
        }
    }

    public static final class WeakWriteEntry<K, V> extends WeakEntry<K, V> {
        public volatile long C = Long.MAX_VALUE;
        public ReferenceEntry D = LocalCache.s();
        public ReferenceEntry E = LocalCache.s();

        public WeakWriteEntry(ReferenceQueue referenceQueue, Object obj, int i2, ReferenceEntry referenceEntry) {
            super(referenceQueue, obj, i2, referenceEntry);
        }

        public ReferenceEntry A() {
            return this.E;
        }

        public long l() {
            return this.C;
        }

        public ReferenceEntry n() {
            return this.D;
        }

        public void p(long j2) {
            this.C = j2;
        }

        public void x(ReferenceEntry referenceEntry) {
            this.D = referenceEntry;
        }

        public void y(ReferenceEntry referenceEntry) {
            this.E = referenceEntry;
        }
    }

    public static final class WeightedSoftValueReference<K, V> extends SoftValueReference<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public final int f27919A;

        public WeightedSoftValueReference(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry, int i2) {
            super(referenceQueue, obj, referenceEntry);
            this.f27919A = i2;
        }

        public int a() {
            return this.f27919A;
        }

        public ValueReference g(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return new WeightedSoftValueReference(referenceQueue, obj, referenceEntry, this.f27919A);
        }
    }

    public static final class WeightedStrongValueReference<K, V> extends StrongValueReference<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public final int f27920A;

        public WeightedStrongValueReference(Object obj, int i2) {
            super(obj);
            this.f27920A = i2;
        }

        public int a() {
            return this.f27920A;
        }
    }

    public static final class WeightedWeakValueReference<K, V> extends WeakValueReference<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public final int f27921A;

        public WeightedWeakValueReference(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry, int i2) {
            super(referenceQueue, obj, referenceEntry);
            this.f27921A = i2;
        }

        public int a() {
            return this.f27921A;
        }

        public ValueReference g(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return new WeightedWeakValueReference(referenceQueue, obj, referenceEntry, this.f27921A);
        }
    }

    public static final class WriteQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {

        /* renamed from: z  reason: collision with root package name */
        public final ReferenceEntry f27922z = new AbstractReferenceEntry<K, V>(this) {

            /* renamed from: A  reason: collision with root package name */
            public ReferenceEntry f27923A = this;

            /* renamed from: z  reason: collision with root package name */
            public ReferenceEntry f27924z = this;

            public ReferenceEntry A() {
                return this.f27923A;
            }

            public long l() {
                return Long.MAX_VALUE;
            }

            public ReferenceEntry n() {
                return this.f27924z;
            }

            public void p(long j2) {
            }

            public void x(ReferenceEntry referenceEntry) {
                this.f27924z = referenceEntry;
            }

            public void y(ReferenceEntry referenceEntry) {
                this.f27923A = referenceEntry;
            }
        };

        public void clear() {
            ReferenceEntry n2 = this.f27922z.n();
            while (true) {
                ReferenceEntry referenceEntry = this.f27922z;
                if (n2 != referenceEntry) {
                    ReferenceEntry n3 = n2.n();
                    LocalCache.u(n2);
                    n2 = n3;
                } else {
                    referenceEntry.x(referenceEntry);
                    ReferenceEntry referenceEntry2 = this.f27922z;
                    referenceEntry2.y(referenceEntry2);
                    return;
                }
            }
        }

        public boolean contains(Object obj) {
            return ((ReferenceEntry) obj).n() != NullEntry.INSTANCE;
        }

        /* renamed from: e */
        public boolean offer(ReferenceEntry referenceEntry) {
            LocalCache.c(referenceEntry.A(), referenceEntry.n());
            LocalCache.c(this.f27922z.A(), referenceEntry);
            LocalCache.c(referenceEntry, this.f27922z);
            return true;
        }

        /* renamed from: g */
        public ReferenceEntry peek() {
            ReferenceEntry n2 = this.f27922z.n();
            if (n2 == this.f27922z) {
                return null;
            }
            return n2;
        }

        /* renamed from: h */
        public ReferenceEntry poll() {
            ReferenceEntry n2 = this.f27922z.n();
            if (n2 == this.f27922z) {
                return null;
            }
            remove(n2);
            return n2;
        }

        public boolean isEmpty() {
            return this.f27922z.n() == this.f27922z;
        }

        public Iterator iterator() {
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) {
                /* renamed from: c */
                public ReferenceEntry b(ReferenceEntry referenceEntry) {
                    ReferenceEntry n2 = referenceEntry.n();
                    if (n2 == WriteQueue.this.f27922z) {
                        return null;
                    }
                    return n2;
                }
            };
        }

        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry A2 = referenceEntry.A();
            ReferenceEntry n2 = referenceEntry.n();
            LocalCache.c(A2, n2);
            LocalCache.u(referenceEntry);
            return n2 != NullEntry.INSTANCE;
        }

        public int size() {
            int i2 = 0;
            for (ReferenceEntry n2 = this.f27922z.n(); n2 != this.f27922z; n2 = n2.n()) {
                i2++;
            }
            return i2;
        }
    }

    public final class WriteThroughEntry implements Map.Entry<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public Object f27926A;

        /* renamed from: z  reason: collision with root package name */
        public final Object f27928z;

        public WriteThroughEntry(Object obj, Object obj2) {
            this.f27928z = obj;
            this.f27926A = obj2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f27928z.equals(entry.getKey()) && this.f27926A.equals(entry.getValue());
        }

        public Object getKey() {
            return this.f27928z;
        }

        public Object getValue() {
            return this.f27926A;
        }

        public int hashCode() {
            return this.f27928z.hashCode() ^ this.f27926A.hashCode();
        }

        public Object setValue(Object obj) {
            Object put = LocalCache.this.put(this.f27928z, obj);
            this.f27926A = obj;
            return put;
        }

        public String toString() {
            String valueOf = String.valueOf(getKey());
            String valueOf2 = String.valueOf(getValue());
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb.append(valueOf);
            sb.append("=");
            sb.append(valueOf2);
            return sb.toString();
        }
    }

    public LocalCache(CacheBuilder cacheBuilder, CacheLoader cacheLoader) {
        this.C = Math.min(cacheBuilder.c(), 65536);
        Strength h2 = cacheBuilder.h();
        this.F = h2;
        this.G = cacheBuilder.o();
        this.D = cacheBuilder.g();
        this.E = cacheBuilder.n();
        long i2 = cacheBuilder.i();
        this.H = i2;
        this.I = cacheBuilder.p();
        this.J = cacheBuilder.d();
        this.K = cacheBuilder.e();
        this.L = cacheBuilder.j();
        RemovalListener k2 = cacheBuilder.k();
        this.N = k2;
        this.M = k2 == CacheBuilder.NullListener.INSTANCE ? g() : new ConcurrentLinkedQueue();
        this.O = cacheBuilder.m(z());
        this.P = EntryFactory.k(h2, G(), L());
        this.Q = (AbstractCache.StatsCounter) cacheBuilder.l().get();
        this.R = cacheLoader;
        int min = Math.min(cacheBuilder.f(), 1073741824);
        if (h() && !f()) {
            min = (int) Math.min((long) min, i2);
        }
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        int i6 = 1;
        while (i6 < this.C && (!h() || ((long) (i6 * 20)) <= this.H)) {
            i5++;
            i6 <<= 1;
        }
        this.f27874A = 32 - i5;
        this.f27876z = i6 - 1;
        this.f27875B = r(i6);
        int i7 = min / i6;
        while (i4 < (i7 * i6 < min ? i7 + 1 : i7)) {
            i4 <<= 1;
        }
        if (h()) {
            long j2 = this.H;
            long j3 = (long) i6;
            long j4 = (j2 / j3) + 1;
            long j5 = j2 % j3;
            while (true) {
                Segment[] segmentArr = this.f27875B;
                if (i3 < segmentArr.length) {
                    if (((long) i3) == j5) {
                        j4--;
                    }
                    segmentArr[i3] = e(i4, j4, (AbstractCache.StatsCounter) cacheBuilder.l().get());
                    i3++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                Segment[] segmentArr2 = this.f27875B;
                if (i3 < segmentArr2.length) {
                    segmentArr2[i3] = e(i4, -1, (AbstractCache.StatsCounter) cacheBuilder.l().get());
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public static int C(int i2) {
        int i3 = i2 + ((i2 << 15) ^ -12931);
        int i4 = i3 ^ (i3 >>> 10);
        int i5 = i4 + (i4 << 3);
        int i6 = i5 ^ (i5 >>> 6);
        int i7 = i6 + (i6 << 2) + (i6 << 14);
        return i7 ^ (i7 >>> 16);
    }

    public static ArrayList E(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterators.a(arrayList, collection.iterator());
        return arrayList;
    }

    public static ValueReference F() {
        return W;
    }

    public static void b(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
        referenceEntry.t(referenceEntry2);
        referenceEntry2.z(referenceEntry);
    }

    public static void c(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
        referenceEntry.x(referenceEntry2);
        referenceEntry2.y(referenceEntry);
    }

    public static Queue g() {
        return X;
    }

    public static ReferenceEntry s() {
        return NullEntry.INSTANCE;
    }

    public static void t(ReferenceEntry referenceEntry) {
        ReferenceEntry s2 = s();
        referenceEntry.t(s2);
        referenceEntry.z(s2);
    }

    public static void u(ReferenceEntry referenceEntry) {
        ReferenceEntry s2 = s();
        referenceEntry.x(s2);
        referenceEntry.y(s2);
    }

    public boolean A() {
        return j() || B();
    }

    public boolean B() {
        return this.L > 0;
    }

    public Segment D(int i2) {
        return this.f27875B[(i2 >>> this.f27874A) & this.f27876z];
    }

    public boolean G() {
        return I() || y();
    }

    public boolean I() {
        return i() || h();
    }

    public boolean J() {
        return this.F != Strength.STRONG;
    }

    public boolean K() {
        return this.G != Strength.STRONG;
    }

    public boolean L() {
        return M() || A();
    }

    public boolean M() {
        return j();
    }

    public void clear() {
        for (Segment b2 : this.f27875B) {
            b2.b();
        }
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int o2 = o(obj);
        return D(o2).f(obj, o2);
    }

    public boolean containsValue(Object obj) {
        Object obj2 = obj;
        boolean z2 = false;
        if (obj2 == null) {
            return false;
        }
        long a2 = this.O.a();
        Segment[] segmentArr = this.f27875B;
        long j2 = -1;
        int i2 = 0;
        while (i2 < 3) {
            int length = segmentArr.length;
            long j3 = 0;
            int i3 = z2;
            while (i3 < length) {
                Segment segment = segmentArr[i3];
                int i4 = segment.f27900A;
                AtomicReferenceArray atomicReferenceArray = segment.E;
                for (int i5 = z2; i5 < atomicReferenceArray.length(); i5++) {
                    ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i5);
                    while (referenceEntry != null) {
                        Segment[] segmentArr2 = segmentArr;
                        Object v2 = segment.v(referenceEntry, a2);
                        long j4 = a2;
                        if (v2 != null && this.E.d(obj2, v2)) {
                            return true;
                        }
                        referenceEntry = referenceEntry.f();
                        segmentArr = segmentArr2;
                        a2 = j4;
                    }
                    long j5 = a2;
                    Segment[] segmentArr3 = segmentArr;
                }
                Segment[] segmentArr4 = segmentArr;
                j3 += (long) segment.C;
                i3++;
                a2 = a2;
                z2 = false;
            }
            long j6 = a2;
            Segment[] segmentArr5 = segmentArr;
            if (j3 == j2) {
                return false;
            }
            i2++;
            j2 = j3;
            segmentArr = segmentArr5;
            a2 = j6;
            z2 = false;
        }
        return z2;
    }

    public Segment e(int i2, long j2, AbstractCache.StatsCounter statsCounter) {
        return new Segment(this, i2, j2, statsCounter);
    }

    public Set entrySet() {
        Set set = this.U;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.U = entrySet;
        return entrySet;
    }

    public boolean f() {
        return this.I != CacheBuilder.OneWeigher.INSTANCE;
    }

    public Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int o2 = o(obj);
        return D(o2).p(obj, o2);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public boolean h() {
        return this.H >= 0;
    }

    public boolean i() {
        return this.J > 0;
    }

    public boolean isEmpty() {
        Segment[] segmentArr = this.f27875B;
        long j2 = 0;
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].f27900A != 0) {
                return false;
            }
            j2 += (long) segmentArr[i2].C;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < segmentArr.length; i3++) {
            if (segmentArr[i3].f27900A != 0) {
                return false;
            }
            j2 -= (long) segmentArr[i3].C;
        }
        return j2 == 0;
    }

    public boolean j() {
        return this.K > 0;
    }

    public Object k(Object obj, CacheLoader cacheLoader) {
        int o2 = o(Preconditions.q(obj));
        return D(o2).q(obj, o2, cacheLoader);
    }

    public Set keySet() {
        Set set = this.S;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.S = keySet;
        return keySet;
    }

    public Object m(ReferenceEntry referenceEntry, long j2) {
        Object obj;
        if (referenceEntry.getKey() == null || (obj = referenceEntry.d().get()) == null || p(referenceEntry, j2)) {
            return null;
        }
        return obj;
    }

    public Object n(Object obj) {
        return k(obj, this.R);
    }

    public int o(Object obj) {
        return C(this.D.e(obj));
    }

    public boolean p(ReferenceEntry referenceEntry, long j2) {
        Preconditions.q(referenceEntry);
        if (!i() || j2 - referenceEntry.o() < this.J) {
            return j() && j2 - referenceEntry.l() >= this.K;
        }
        return true;
    }

    public Object put(Object obj, Object obj2) {
        Preconditions.q(obj);
        Preconditions.q(obj2);
        int o2 = o(obj);
        return D(o2).H(obj, o2, obj2, false);
    }

    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Preconditions.q(obj);
        Preconditions.q(obj2);
        int o2 = o(obj);
        return D(o2).H(obj, o2, obj2, true);
    }

    public long q() {
        Segment[] segmentArr = this.f27875B;
        long j2 = 0;
        for (Segment segment : segmentArr) {
            j2 += (long) Math.max(0, segment.f27900A);
        }
        return j2;
    }

    public final Segment[] r(int i2) {
        return new Segment[i2];
    }

    public Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int o2 = o(obj);
        return D(o2).P(obj, o2);
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        Preconditions.q(obj);
        Preconditions.q(obj3);
        if (obj2 == null) {
            return false;
        }
        int o2 = o(obj);
        return D(o2).X(obj, o2, obj2, obj3);
    }

    public int size() {
        return Ints.k(q());
    }

    public void v() {
        while (true) {
            RemovalNotification removalNotification = (RemovalNotification) this.M.poll();
            if (removalNotification != null) {
                try {
                    this.N.d(removalNotification);
                } catch (Throwable th) {
                    V.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            } else {
                return;
            }
        }
    }

    public Collection values() {
        Collection collection = this.T;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.T = values;
        return values;
    }

    public void w(ReferenceEntry referenceEntry) {
        int h2 = referenceEntry.h();
        D(h2).I(referenceEntry, h2);
    }

    public void x(ValueReference valueReference) {
        ReferenceEntry c2 = valueReference.c();
        int h2 = c2.h();
        D(h2).J(c2.getKey(), h2, valueReference);
    }

    public boolean y() {
        return i();
    }

    public boolean z() {
        return A() || y();
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int o2 = o(obj);
        return D(o2).Q(obj, o2, obj2);
    }

    public Object replace(Object obj, Object obj2) {
        Preconditions.q(obj);
        Preconditions.q(obj2);
        int o2 = o(obj);
        return D(o2).W(obj, o2, obj2);
    }
}
