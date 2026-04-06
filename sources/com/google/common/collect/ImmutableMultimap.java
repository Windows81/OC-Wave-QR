package com.google.common.collect;

import com.google.common.collect.Multiset;
import com.google.common.collect.Serialization;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public abstract class ImmutableMultimap<K, V> extends BaseImmutableMultimap<K, V> implements Serializable {
    public final transient ImmutableMap D;
    public final transient int E;

    @DoNotMock
    public static class Builder<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final Map f28174a = Platform.f();

        /* renamed from: b  reason: collision with root package name */
        public Comparator f28175b;

        /* renamed from: c  reason: collision with root package name */
        public Comparator f28176c;

        public ImmutableMultimap a() {
            Collection entrySet = this.f28174a.entrySet();
            Comparator comparator = this.f28175b;
            if (comparator != null) {
                entrySet = Ordering.a(comparator).h().b(entrySet);
            }
            return ImmutableListMultimap.v(entrySet, this.f28176c);
        }

        public Collection b() {
            return new ArrayList();
        }

        public Builder c(Object obj, Object obj2) {
            CollectPreconditions.a(obj, obj2);
            Collection collection = (Collection) this.f28174a.get(obj);
            if (collection == null) {
                Map map = this.f28174a;
                Collection b2 = b();
                map.put(obj, b2);
                collection = b2;
            }
            collection.add(obj2);
            return this;
        }
    }

    public static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {

        /* renamed from: A  reason: collision with root package name */
        public final ImmutableMultimap f28177A;

        public EntryCollection(ImmutableMultimap immutableMultimap) {
            this.f28177A = immutableMultimap;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f28177A.F(entry.getKey(), entry.getValue());
        }

        public boolean n() {
            return this.f28177A.q();
        }

        /* renamed from: o */
        public UnmodifiableIterator iterator() {
            return this.f28177A.e();
        }

        public int size() {
            return this.f28177A.size();
        }
    }

    public static class FieldSettersHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final Serialization.FieldSetter f28178a;

        /* renamed from: b  reason: collision with root package name */
        public static final Serialization.FieldSetter f28179b;

        static {
            Class<ImmutableMultimap> cls = ImmutableMultimap.class;
            f28178a = Serialization.a(cls, "map");
            f28179b = Serialization.a(cls, "size");
        }
    }

    public class Keys extends ImmutableMultiset<K> {
        public final /* synthetic */ ImmutableMultimap C;

        public int L0(Object obj) {
            Collection collection = (Collection) this.C.D.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        public boolean contains(Object obj) {
            return this.C.containsKey(obj);
        }

        public boolean n() {
            return true;
        }

        /* renamed from: s */
        public ImmutableSet k() {
            return this.C.keySet();
        }

        public int size() {
            return this.C.size();
        }

        public Multiset.Entry v(int i2) {
            Map.Entry entry = (Map.Entry) this.C.D.entrySet().e().get(i2);
            return Multisets.g(entry.getKey(), ((Collection) entry.getValue()).size());
        }
    }

    public static final class KeysSerializedForm implements Serializable {
    }

    public static final class Values<K, V> extends ImmutableCollection<V> {

        /* renamed from: A  reason: collision with root package name */
        public final transient ImmutableMultimap f28180A;

        public Values(ImmutableMultimap immutableMultimap) {
            this.f28180A = immutableMultimap;
        }

        public boolean contains(Object obj) {
            return this.f28180A.containsValue(obj);
        }

        public int g(Object[] objArr, int i2) {
            UnmodifiableIterator o2 = this.f28180A.D.values().iterator();
            while (o2.hasNext()) {
                i2 = ((ImmutableCollection) o2.next()).g(objArr, i2);
            }
            return i2;
        }

        public boolean n() {
            return true;
        }

        /* renamed from: o */
        public UnmodifiableIterator iterator() {
            return this.f28180A.f();
        }

        public int size() {
            return this.f28180A.size();
        }
    }

    public ImmutableMultimap(ImmutableMap immutableMap, int i2) {
        this.D = immutableMap;
        this.E = i2;
    }

    public /* bridge */ /* synthetic */ boolean F(Object obj, Object obj2) {
        return super.F(obj, obj2);
    }

    public Map a() {
        throw new AssertionError("should never be called");
    }

    public Set c() {
        throw new AssertionError("unreachable");
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return this.D.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public ImmutableMap E() {
        return this.D;
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* renamed from: j */
    public ImmutableCollection b() {
        return new EntryCollection(this);
    }

    /* renamed from: k */
    public ImmutableCollection d() {
        return new Values(this);
    }

    /* renamed from: l */
    public ImmutableCollection m() {
        return (ImmutableCollection) super.m();
    }

    /* renamed from: o */
    public UnmodifiableIterator e() {
        return new UnmodifiableIterator<Map.Entry<K, V>>() {

            /* renamed from: A  reason: collision with root package name */
            public Object f28168A = null;

            /* renamed from: B  reason: collision with root package name */
            public Iterator f28169B = Iterators.m();

            /* renamed from: z  reason: collision with root package name */
            public final Iterator f28170z;

            {
                this.f28170z = ImmutableMultimap.this.D.entrySet().iterator();
            }

            /* renamed from: b */
            public Map.Entry next() {
                if (!this.f28169B.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f28170z.next();
                    this.f28168A = entry.getKey();
                    this.f28169B = ((ImmutableCollection) entry.getValue()).iterator();
                }
                Object obj = this.f28168A;
                Objects.requireNonNull(obj);
                return Maps.t(obj, this.f28169B.next());
            }

            public boolean hasNext() {
                return this.f28169B.hasNext() || this.f28170z.hasNext();
            }
        };
    }

    /* renamed from: p */
    public abstract ImmutableCollection get(Object obj);

    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public boolean q() {
        return this.D.k();
    }

    /* renamed from: r */
    public ImmutableSet keySet() {
        return this.D.keySet();
    }

    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: s */
    public ImmutableCollection h(Object obj) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.E;
    }

    /* renamed from: t */
    public UnmodifiableIterator f() {
        return new UnmodifiableIterator<V>() {

            /* renamed from: A  reason: collision with root package name */
            public Iterator f28171A = Iterators.m();

            /* renamed from: z  reason: collision with root package name */
            public Iterator f28173z;

            {
                this.f28173z = ImmutableMultimap.this.D.values().iterator();
            }

            public boolean hasNext() {
                return this.f28171A.hasNext() || this.f28173z.hasNext();
            }

            public Object next() {
                if (!this.f28171A.hasNext()) {
                    this.f28171A = ((ImmutableCollection) this.f28173z.next()).iterator();
                }
                return this.f28171A.next();
            }
        };
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
