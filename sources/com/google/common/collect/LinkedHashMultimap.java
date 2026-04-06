package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {
    public transient int F;
    public transient ValueEntry G;

    public static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements ValueSetLink<K, V> {

        /* renamed from: B  reason: collision with root package name */
        public final int f28273B;
        public ValueEntry C;
        public ValueSetLink D;
        public ValueSetLink E;
        public ValueEntry F;
        public ValueEntry G;

        public ValueEntry(Object obj, Object obj2, int i2, ValueEntry valueEntry) {
            super(obj, obj2);
            this.f28273B = i2;
            this.C = valueEntry;
        }

        public ValueEntry a() {
            ValueEntry valueEntry = this.F;
            Objects.requireNonNull(valueEntry);
            return valueEntry;
        }

        public ValueEntry b() {
            ValueEntry valueEntry = this.G;
            Objects.requireNonNull(valueEntry);
            return valueEntry;
        }

        public boolean c(Object obj, int i2) {
            return this.f28273B == i2 && com.google.common.base.Objects.a(getValue(), obj);
        }

        public void d(ValueEntry valueEntry) {
            this.F = valueEntry;
        }

        public void e(ValueSetLink valueSetLink) {
            this.E = valueSetLink;
        }

        public void f(ValueEntry valueEntry) {
            this.G = valueEntry;
        }

        public ValueSetLink g() {
            ValueSetLink valueSetLink = this.D;
            Objects.requireNonNull(valueSetLink);
            return valueSetLink;
        }

        public ValueSetLink h() {
            ValueSetLink valueSetLink = this.E;
            Objects.requireNonNull(valueSetLink);
            return valueSetLink;
        }

        public void i(ValueSetLink valueSetLink) {
            this.D = valueSetLink;
        }
    }

    public final class ValueSet extends Sets.ImprovedAbstractSet<V> implements ValueSetLink<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public ValueEntry[] f28274A;

        /* renamed from: B  reason: collision with root package name */
        public int f28275B = 0;
        public int C = 0;
        public ValueSetLink D;
        public ValueSetLink E;

        /* renamed from: z  reason: collision with root package name */
        public final Object f28276z;

        public ValueSet(Object obj, int i2) {
            this.f28276z = obj;
            this.D = this;
            this.E = this;
            this.f28274A = new ValueEntry[Hashing.a(i2, 1.0d)];
        }

        public boolean add(Object obj) {
            int d2 = Hashing.d(obj);
            int o2 = o() & d2;
            ValueEntry valueEntry = this.f28274A[o2];
            for (ValueEntry valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.C) {
                if (valueEntry2.c(obj, d2)) {
                    return false;
                }
            }
            ValueEntry valueEntry3 = new ValueEntry(this.f28276z, obj, d2, valueEntry);
            LinkedHashMultimap.P(this.E, valueEntry3);
            LinkedHashMultimap.P(valueEntry3, this);
            LinkedHashMultimap.N(LinkedHashMultimap.this.G.a(), valueEntry3);
            LinkedHashMultimap.N(valueEntry3, LinkedHashMultimap.this.G);
            this.f28274A[o2] = valueEntry3;
            this.f28275B++;
            this.C++;
            p();
            return true;
        }

        public void clear() {
            Arrays.fill(this.f28274A, (Object) null);
            this.f28275B = 0;
            for (ValueSetLink valueSetLink = this.D; valueSetLink != this; valueSetLink = valueSetLink.h()) {
                LinkedHashMultimap.L((ValueEntry) valueSetLink);
            }
            LinkedHashMultimap.P(this, this);
            this.C++;
        }

        public boolean contains(Object obj) {
            int d2 = Hashing.d(obj);
            for (ValueEntry valueEntry = this.f28274A[o() & d2]; valueEntry != null; valueEntry = valueEntry.C) {
                if (valueEntry.c(obj, d2)) {
                    return true;
                }
            }
            return false;
        }

        public void e(ValueSetLink valueSetLink) {
            this.D = valueSetLink;
        }

        public ValueSetLink g() {
            return this.E;
        }

        public ValueSetLink h() {
            return this.D;
        }

        public void i(ValueSetLink valueSetLink) {
            this.E = valueSetLink;
        }

        public Iterator iterator() {
            return new Iterator<V>() {

                /* renamed from: A  reason: collision with root package name */
                public ValueEntry f28277A;

                /* renamed from: B  reason: collision with root package name */
                public int f28278B;

                /* renamed from: z  reason: collision with root package name */
                public ValueSetLink f28279z;

                {
                    this.f28279z = ValueSet.this.D;
                    this.f28278B = ValueSet.this.C;
                }

                public final void b() {
                    if (ValueSet.this.C != this.f28278B) {
                        throw new ConcurrentModificationException();
                    }
                }

                public boolean hasNext() {
                    b();
                    return this.f28279z != ValueSet.this;
                }

                public Object next() {
                    if (hasNext()) {
                        ValueEntry valueEntry = (ValueEntry) this.f28279z;
                        Object value = valueEntry.getValue();
                        this.f28277A = valueEntry;
                        this.f28279z = valueEntry.h();
                        return value;
                    }
                    throw new NoSuchElementException();
                }

                public void remove() {
                    b();
                    Preconditions.x(this.f28277A != null, "no calls to next() since the last call to remove()");
                    ValueSet.this.remove(this.f28277A.getValue());
                    this.f28278B = ValueSet.this.C;
                    this.f28277A = null;
                }
            };
        }

        public final int o() {
            return this.f28274A.length - 1;
        }

        public final void p() {
            if (Hashing.b(this.f28275B, this.f28274A.length, 1.0d)) {
                int length = this.f28274A.length * 2;
                ValueEntry[] valueEntryArr = new ValueEntry[length];
                this.f28274A = valueEntryArr;
                int i2 = length - 1;
                for (ValueSetLink valueSetLink = this.D; valueSetLink != this; valueSetLink = valueSetLink.h()) {
                    ValueEntry valueEntry = (ValueEntry) valueSetLink;
                    int i3 = valueEntry.f28273B & i2;
                    valueEntry.C = valueEntryArr[i3];
                    valueEntryArr[i3] = valueEntry;
                }
            }
        }

        public boolean remove(Object obj) {
            int d2 = Hashing.d(obj);
            int o2 = o() & d2;
            ValueEntry valueEntry = null;
            for (ValueEntry valueEntry2 = this.f28274A[o2]; valueEntry2 != null; valueEntry2 = valueEntry2.C) {
                if (valueEntry2.c(obj, d2)) {
                    if (valueEntry == null) {
                        this.f28274A[o2] = valueEntry2.C;
                    } else {
                        valueEntry.C = valueEntry2.C;
                    }
                    LinkedHashMultimap.M(valueEntry2);
                    LinkedHashMultimap.L(valueEntry2);
                    this.f28275B--;
                    this.C++;
                    return true;
                }
                valueEntry = valueEntry2;
            }
            return false;
        }

        public int size() {
            return this.f28275B;
        }
    }

    public interface ValueSetLink<K, V> {
        void e(ValueSetLink valueSetLink);

        ValueSetLink g();

        ValueSetLink h();

        void i(ValueSetLink valueSetLink);
    }

    public static void L(ValueEntry valueEntry) {
        N(valueEntry.a(), valueEntry.b());
    }

    public static void M(ValueSetLink valueSetLink) {
        P(valueSetLink.g(), valueSetLink.h());
    }

    public static void N(ValueEntry valueEntry, ValueEntry valueEntry2) {
        valueEntry.f(valueEntry2);
        valueEntry2.d(valueEntry);
    }

    public static void P(ValueSetLink valueSetLink, ValueSetLink valueSetLink2) {
        valueSetLink.e(valueSetLink2);
        valueSetLink2.i(valueSetLink);
    }

    /* renamed from: C */
    public Set r() {
        return Platform.d(this.F);
    }

    public /* bridge */ /* synthetic */ Map E() {
        return super.E();
    }

    public /* bridge */ /* synthetic */ boolean F(Object obj, Object obj2) {
        return super.F(obj, obj2);
    }

    public void clear() {
        super.clear();
        ValueEntry valueEntry = this.G;
        N(valueEntry, valueEntry);
    }

    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public Iterator e() {
        return new Iterator<Map.Entry<K, V>>() {

            /* renamed from: A  reason: collision with root package name */
            public ValueEntry f28270A;

            /* renamed from: z  reason: collision with root package name */
            public ValueEntry f28272z;

            {
                this.f28272z = LinkedHashMultimap.this.G.b();
            }

            /* renamed from: b */
            public Map.Entry next() {
                if (hasNext()) {
                    ValueEntry valueEntry = this.f28272z;
                    this.f28270A = valueEntry;
                    this.f28272z = valueEntry.b();
                    return valueEntry;
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                return this.f28272z != LinkedHashMultimap.this.G;
            }

            public void remove() {
                Preconditions.x(this.f28270A != null, "no calls to next() since the last call to remove()");
                LinkedHashMultimap.this.remove(this.f28270A.getKey(), this.f28270A.getValue());
                this.f28270A = null;
            }
        };
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Iterator f() {
        return Maps.X(e());
    }

    public /* bridge */ /* synthetic */ Set get(Object obj) {
        return super.get(obj);
    }

    public /* bridge */ /* synthetic */ Set h(Object obj) {
        return super.h(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public Set keySet() {
        return super.keySet();
    }

    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public Collection s(Object obj) {
        return new ValueSet(obj, this.F);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public Set m() {
        return super.m();
    }
}
