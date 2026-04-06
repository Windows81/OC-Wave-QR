package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.d;

@Metadata
public final class ConcurrentWeakMap<K, V> extends AbstractMutableMap<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f41515A;

    /* renamed from: B  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41516B;
    private volatile /* synthetic */ int _size$volatile;
    private volatile /* synthetic */ Object core$volatile;

    /* renamed from: z  reason: collision with root package name */
    public final ReferenceQueue f41517z;

    @Metadata
    public final class Core {

        /* renamed from: g  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f41518g = AtomicIntegerFieldUpdater.newUpdater(Core.class, "load$volatile");

        /* renamed from: a  reason: collision with root package name */
        public final int f41519a;

        /* renamed from: b  reason: collision with root package name */
        public final int f41520b;

        /* renamed from: c  reason: collision with root package name */
        public final int f41521c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ AtomicReferenceArray f41522d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ AtomicReferenceArray f41523e;
        private volatile /* synthetic */ int load$volatile;

        @Metadata
        public final class KeyValueIterator<E> implements Iterator<E>, KMutableIterator {

            /* renamed from: A  reason: collision with root package name */
            public int f41525A = -1;

            /* renamed from: B  reason: collision with root package name */
            public Object f41526B;
            public Object C;

            /* renamed from: z  reason: collision with root package name */
            public final Function2 f41527z;

            public KeyValueIterator(Function2 function2) {
                this.f41527z = function2;
                b();
            }

            public final void b() {
                Object obj;
                while (true) {
                    int i2 = this.f41525A + 1;
                    this.f41525A = i2;
                    if (i2 < Core.this.f41519a) {
                        HashedWeakRef hashedWeakRef = (HashedWeakRef) Core.this.e().get(this.f41525A);
                        if (!(hashedWeakRef == null || (obj = hashedWeakRef.get()) == null)) {
                            this.f41526B = obj;
                            Object obj2 = Core.this.g().get(this.f41525A);
                            if (obj2 instanceof Marked) {
                                obj2 = ((Marked) obj2).f41565a;
                            }
                            if (obj2 != null) {
                                this.C = obj2;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }

            /* renamed from: c */
            public Void remove() {
                Void unused = ConcurrentWeakMapKt.e();
                throw new KotlinNothingValueException();
            }

            public boolean hasNext() {
                return this.f41525A < Core.this.f41519a;
            }

            public Object next() {
                if (this.f41525A < Core.this.f41519a) {
                    Function2 function2 = this.f41527z;
                    Object obj = this.f41526B;
                    if (obj == null) {
                        Intrinsics.y("key");
                        obj = Unit.f40552a;
                    }
                    Object obj2 = this.C;
                    if (obj2 == null) {
                        Intrinsics.y("value");
                        obj2 = Unit.f40552a;
                    }
                    Object m2 = function2.m(obj, obj2);
                    b();
                    return m2;
                }
                throw new NoSuchElementException();
            }
        }

        public Core(int i2) {
            this.f41519a = i2;
            this.f41520b = Integer.numberOfLeadingZeros(i2) + 1;
            this.f41521c = (i2 * 2) / 3;
            this.f41522d = new AtomicReferenceArray(i2);
            this.f41523e = new AtomicReferenceArray(i2);
        }

        public static /* synthetic */ Object k(Core core, Object obj, Object obj2, HashedWeakRef hashedWeakRef, int i2, Object obj3) {
            if ((i2 & 4) != 0) {
                hashedWeakRef = null;
            }
            return core.j(obj, obj2, hashedWeakRef);
        }

        public final Object d(Object obj) {
            int h2 = h(obj.hashCode());
            while (true) {
                HashedWeakRef hashedWeakRef = (HashedWeakRef) e().get(h2);
                if (hashedWeakRef == null) {
                    return null;
                }
                Object obj2 = hashedWeakRef.get();
                if (Intrinsics.d(obj, obj2)) {
                    Object obj3 = g().get(h2);
                    return obj3 instanceof Marked ? ((Marked) obj3).f41565a : obj3;
                }
                if (obj2 == null) {
                    m(h2);
                }
                if (h2 == 0) {
                    h2 = this.f41519a;
                }
                h2--;
            }
        }

        public final /* synthetic */ AtomicReferenceArray e() {
            return this.f41522d;
        }

        public final /* synthetic */ AtomicReferenceArray g() {
            return this.f41523e;
        }

        public final int h(int i2) {
            return (i2 * -1640531527) >>> this.f41520b;
        }

        public final Iterator i(Function2 function2) {
            return new KeyValueIterator(function2);
        }

        public final Object j(Object obj, Object obj2, HashedWeakRef hashedWeakRef) {
            Object obj3;
            int i2;
            int h2 = h(obj.hashCode());
            boolean z2 = false;
            while (true) {
                HashedWeakRef hashedWeakRef2 = (HashedWeakRef) e().get(h2);
                if (hashedWeakRef2 == null) {
                    if (obj2 != null) {
                        if (!z2) {
                            AtomicIntegerFieldUpdater f2 = f41518g;
                            do {
                                i2 = f2.get(this);
                                if (i2 >= this.f41521c) {
                                    return ConcurrentWeakMapKt.f41532a;
                                }
                            } while (!f2.compareAndSet(this, i2, i2 + 1));
                            z2 = true;
                        }
                        if (hashedWeakRef == null) {
                            hashedWeakRef = new HashedWeakRef(obj, ConcurrentWeakMap.this.f41517z);
                        }
                        if (d.a(e(), h2, (Object) null, hashedWeakRef)) {
                            break;
                        }
                    } else {
                        return null;
                    }
                } else {
                    Object obj4 = hashedWeakRef2.get();
                    if (!Intrinsics.d(obj, obj4)) {
                        if (obj4 == null) {
                            m(h2);
                        }
                        if (h2 == 0) {
                            h2 = this.f41519a;
                        }
                        h2--;
                    } else if (z2) {
                        f41518g.decrementAndGet(this);
                    }
                }
            }
            do {
                obj3 = g().get(h2);
                if (obj3 instanceof Marked) {
                    return ConcurrentWeakMapKt.f41532a;
                }
            } while (!d.a(g(), h2, obj3, obj2));
            return obj3;
        }

        public final Core l() {
            Object obj;
            while (true) {
                Core core = new Core(Integer.highestOneBit(RangesKt.e(ConcurrentWeakMap.this.size(), 4)) * 4);
                int i2 = this.f41519a;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        return core;
                    }
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) e().get(i3);
                    Object obj2 = hashedWeakRef != null ? hashedWeakRef.get() : null;
                    if (hashedWeakRef != null && obj2 == null) {
                        m(i3);
                    }
                    while (true) {
                        obj = g().get(i3);
                        if (!(obj instanceof Marked)) {
                            if (d.a(g(), i3, obj, ConcurrentWeakMapKt.d(obj))) {
                                break;
                            }
                        } else {
                            obj = ((Marked) obj).f41565a;
                            break;
                        }
                    }
                    if (obj2 == null || obj == null || core.j(obj2, obj, hashedWeakRef) != ConcurrentWeakMapKt.f41532a) {
                        i3++;
                    }
                }
            }
        }

        public final void m(int i2) {
            Object obj;
            do {
                obj = g().get(i2);
                if (obj == null || (obj instanceof Marked)) {
                    return;
                }
            } while (!d.a(g(), i2, obj, (Object) null));
            ConcurrentWeakMap.this.n();
        }
    }

    @Metadata
    public static final class Entry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

        /* renamed from: A  reason: collision with root package name */
        public final Object f41528A;

        /* renamed from: z  reason: collision with root package name */
        public final Object f41529z;

        public Entry(Object obj, Object obj2) {
            this.f41529z = obj;
            this.f41528A = obj2;
        }

        public Object getKey() {
            return this.f41529z;
        }

        public Object getValue() {
            return this.f41528A;
        }

        public Object setValue(Object obj) {
            Void unused = ConcurrentWeakMapKt.e();
            throw new KotlinNothingValueException();
        }
    }

    @Metadata
    public final class KeyValueSet<E> extends AbstractMutableSet<E> {

        /* renamed from: z  reason: collision with root package name */
        public final Function2 f41531z;

        public KeyValueSet(Function2 function2) {
            this.f41531z = function2;
        }

        public boolean add(Object obj) {
            Void unused = ConcurrentWeakMapKt.e();
            throw new KotlinNothingValueException();
        }

        public int e() {
            return ConcurrentWeakMap.this.size();
        }

        public Iterator iterator() {
            return ((Core) ConcurrentWeakMap.f41516B.get(ConcurrentWeakMap.this)).i(this.f41531z);
        }
    }

    static {
        Class<ConcurrentWeakMap> cls = ConcurrentWeakMap.class;
        f41515A = AtomicIntegerFieldUpdater.newUpdater(cls, "_size$volatile");
        f41516B = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "core$volatile");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConcurrentWeakMap(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2);
    }

    public static final Map.Entry h(Object obj, Object obj2) {
        return new Entry(obj, obj2);
    }

    public static final Object i(Object obj, Object obj2) {
        return obj;
    }

    public Set a() {
        return new KeyValueSet(new b());
    }

    public Set b() {
        return new KeyValueSet(new a());
    }

    public int c() {
        return f41515A.get(this);
    }

    public void clear() {
        for (Object remove : keySet()) {
            remove(remove);
        }
    }

    public Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return ((Core) f41516B.get(this)).d(obj);
    }

    public final void n() {
        f41515A.decrementAndGet(this);
    }

    public Object put(Object obj, Object obj2) {
        Object k2 = Core.k((Core) f41516B.get(this), obj, obj2, (HashedWeakRef) null, 4, (Object) null);
        if (k2 == ConcurrentWeakMapKt.f41532a) {
            k2 = q(obj, obj2);
        }
        if (k2 == null) {
            f41515A.incrementAndGet(this);
        }
        return k2;
    }

    public final synchronized Object q(Object obj, Object obj2) {
        Object k2;
        Core core = (Core) f41516B.get(this);
        while (true) {
            k2 = Core.k(core, obj, obj2, (HashedWeakRef) null, 4, (Object) null);
            if (k2 == ConcurrentWeakMapKt.f41532a) {
                core = core.l();
                f41516B.set(this, core);
            }
        }
        return k2;
    }

    public Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        Object k2 = Core.k((Core) f41516B.get(this), obj, (Object) null, (HashedWeakRef) null, 4, (Object) null);
        if (k2 == ConcurrentWeakMapKt.f41532a) {
            k2 = q(obj, (Object) null);
        }
        if (k2 != null) {
            f41515A.decrementAndGet(this);
        }
        return k2;
    }

    public ConcurrentWeakMap(boolean z2) {
        this.core$volatile = new Core(16);
        this.f41517z = z2 ? new ReferenceQueue() : null;
    }
}
