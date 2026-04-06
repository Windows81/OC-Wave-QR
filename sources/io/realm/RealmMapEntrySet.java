package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.util.Pair;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

class RealmMapEntrySet<K, V> implements Set<Map.Entry<K, V>> {

    /* renamed from: A  reason: collision with root package name */
    public final OsMap f40023A;

    /* renamed from: B  reason: collision with root package name */
    public final IteratorType f40024B;
    public final EqualsHelper C;
    public final TypeSelectorForMap D;

    /* renamed from: z  reason: collision with root package name */
    public final BaseRealm f40025z;

    /* renamed from: io.realm.RealmMapEntrySet$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40026a;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.realm.RealmMapEntrySet$IteratorType[] r0 = io.realm.RealmMapEntrySet.IteratorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40026a = r0
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.LONG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40026a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.BYTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40026a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.SHORT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40026a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.INTEGER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f40026a     // Catch:{ NoSuchFieldError -> 0x003e }
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.FLOAT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f40026a     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f40026a     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.STRING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f40026a     // Catch:{ NoSuchFieldError -> 0x0060 }
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f40026a     // Catch:{ NoSuchFieldError -> 0x006c }
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.DATE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f40026a     // Catch:{ NoSuchFieldError -> 0x0078 }
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.DECIMAL128     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f40026a     // Catch:{ NoSuchFieldError -> 0x0084 }
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.BINARY     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f40026a     // Catch:{ NoSuchFieldError -> 0x0090 }
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.OBJECT_ID     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f40026a     // Catch:{ NoSuchFieldError -> 0x009c }
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.UUID     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f40026a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.MIXED     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f40026a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.OBJECT     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.realm.RealmMapEntrySet.AnonymousClass1.<clinit>():void");
        }
    }

    public static class BinaryValueIterator<K> extends EntrySetIterator<K, byte[]> {
        public BinaryValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        public Map.Entry b(int i2) {
            Pair h2 = this.f40029z.h(i2);
            return h2.f40372b == null ? new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Object) null) : new AbstractMap.SimpleImmutableEntry(h2.f40371a, (byte[]) h2.f40372b);
        }
    }

    public static class BooleanValueIterator<K> extends EntrySetIterator<K, Boolean> {
        public BooleanValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        public Map.Entry b(int i2) {
            Pair h2 = this.f40029z.h(i2);
            return h2.f40372b == null ? new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Object) null) : new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Boolean) h2.f40372b);
        }
    }

    public static class ByteValueIterator<K> extends EntrySetIterator<K, Byte> {
        public ByteValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        public Map.Entry b(int i2) {
            Pair h2 = this.f40029z.h(i2);
            Object obj = h2.f40372b;
            return obj == null ? new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Object) null) : new AbstractMap.SimpleImmutableEntry(h2.f40371a, Byte.valueOf(((Long) obj).byteValue()));
        }
    }

    public static class DateValueIterator<K> extends EntrySetIterator<K, Date> {
        public DateValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        public Map.Entry b(int i2) {
            Pair h2 = this.f40029z.h(i2);
            return h2.f40372b == null ? new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Object) null) : new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Date) h2.f40372b);
        }
    }

    public static class Decimal128ValueIterator<K> extends EntrySetIterator<K, Decimal128> {
        public Decimal128ValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        public Map.Entry b(int i2) {
            Pair h2 = this.f40029z.h(i2);
            return h2.f40372b == null ? new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Object) null) : new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Decimal128) h2.f40372b);
        }
    }

    public static class DoubleValueIterator<K> extends EntrySetIterator<K, Double> {
        public DoubleValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        public Map.Entry b(int i2) {
            Pair h2 = this.f40029z.h(i2);
            return h2.f40372b == null ? new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Object) null) : new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Double) h2.f40372b);
        }
    }

    public static abstract class EntrySetIterator<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: A  reason: collision with root package name */
        public final BaseRealm f40027A;

        /* renamed from: B  reason: collision with root package name */
        public int f40028B = -1;

        /* renamed from: z  reason: collision with root package name */
        public final OsMap f40029z;

        public EntrySetIterator(OsMap osMap, BaseRealm baseRealm) {
            this.f40029z = osMap;
            this.f40027A = baseRealm;
        }

        public abstract Map.Entry b(int i2);

        /* renamed from: c */
        public Map.Entry next() {
            this.f40028B++;
            long q2 = this.f40029z.q();
            int i2 = this.f40028B;
            if (((long) i2) < q2) {
                return b(i2);
            }
            throw new NoSuchElementException("Cannot access index " + this.f40028B + " when size is " + q2 + ". Remember to check hasNext() before using next().");
        }

        public boolean hasNext() {
            return ((long) (this.f40028B + 1)) < this.f40029z.q();
        }
    }

    public static class FloatValueIterator<K> extends EntrySetIterator<K, Float> {
        public FloatValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        public Map.Entry b(int i2) {
            Pair h2 = this.f40029z.h(i2);
            return h2.f40372b == null ? new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Object) null) : new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Float) h2.f40372b);
        }
    }

    public static class IntegerValueIterator<K> extends EntrySetIterator<K, Integer> {
        public IntegerValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        public Map.Entry b(int i2) {
            Pair h2 = this.f40029z.h(i2);
            Object obj = h2.f40372b;
            return obj == null ? new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Object) null) : new AbstractMap.SimpleImmutableEntry(h2.f40371a, Integer.valueOf(((Long) obj).intValue()));
        }
    }

    public enum IteratorType {
        LONG,
        BYTE,
        SHORT,
        INTEGER,
        FLOAT,
        DOUBLE,
        STRING,
        BOOLEAN,
        DATE,
        DECIMAL128,
        BINARY,
        OBJECT_ID,
        UUID,
        MIXED,
        OBJECT
    }

    public static class LongValueIterator<K> extends EntrySetIterator<K, Long> {
        public LongValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        public Map.Entry b(int i2) {
            Pair h2 = this.f40029z.h(i2);
            Object obj = h2.f40372b;
            if (obj == null) {
                return new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Object) null);
            }
            return new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Long) obj);
        }
    }

    public static class ObjectIdValueIterator<K> extends EntrySetIterator<K, ObjectId> {
        public ObjectIdValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        public Map.Entry b(int i2) {
            Pair h2 = this.f40029z.h(i2);
            return h2.f40372b == null ? new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Object) null) : new AbstractMap.SimpleImmutableEntry(h2.f40371a, (ObjectId) h2.f40372b);
        }
    }

    public static class RealmAnyValueIterator<K> extends EntrySetIterator<K, RealmAny> {
        public RealmAnyValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        public Map.Entry b(int i2) {
            Pair j2 = this.f40029z.j(i2);
            return new AbstractMap.SimpleImmutableEntry(j2.f40371a, new RealmAny(RealmAnyOperator.c(this.f40027A, (NativeRealmAny) j2.f40372b)));
        }
    }

    public static class RealmModelValueIterator<K, V> extends EntrySetIterator<K, V> {
        public final TypeSelectorForMap C;

        public RealmModelValueIterator(OsMap osMap, BaseRealm baseRealm, TypeSelectorForMap typeSelectorForMap) {
            super(osMap, baseRealm);
            this.C = typeSelectorForMap;
        }

        public Map.Entry b(int i2) {
            Pair i3 = this.f40029z.i(i2);
            Object obj = i3.f40371a;
            long longValue = ((Long) i3.f40372b).longValue();
            return longValue == -1 ? new AbstractMap.SimpleImmutableEntry(obj, (Object) null) : this.C.a(this.f40027A, longValue, obj);
        }
    }

    public static class ShortValueIterator<K> extends EntrySetIterator<K, Short> {
        public ShortValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        public Map.Entry b(int i2) {
            Pair h2 = this.f40029z.h(i2);
            Object obj = h2.f40372b;
            return obj == null ? new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Object) null) : new AbstractMap.SimpleImmutableEntry(h2.f40371a, Short.valueOf(((Long) obj).shortValue()));
        }
    }

    public static class StringValueIterator<K> extends EntrySetIterator<K, String> {
        public StringValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        public Map.Entry b(int i2) {
            Pair h2 = this.f40029z.h(i2);
            return h2.f40372b == null ? new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Object) null) : new AbstractMap.SimpleImmutableEntry(h2.f40371a, (String) h2.f40372b);
        }
    }

    public static class UUIDValueIterator<K> extends EntrySetIterator<K, UUID> {
        public UUIDValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        public Map.Entry b(int i2) {
            Pair h2 = this.f40029z.h(i2);
            return h2.f40372b == null ? new AbstractMap.SimpleImmutableEntry(h2.f40371a, (Object) null) : new AbstractMap.SimpleImmutableEntry(h2.f40371a, (UUID) h2.f40372b);
        }
    }

    public RealmMapEntrySet(BaseRealm baseRealm, OsMap osMap, IteratorType iteratorType, TypeSelectorForMap typeSelectorForMap) {
        this.f40025z = baseRealm;
        this.f40023A = osMap;
        this.f40024B = iteratorType;
        this.C = new GenericEquals();
        this.D = typeSelectorForMap;
    }

    public static EntrySetIterator g(IteratorType iteratorType, OsMap osMap, BaseRealm baseRealm, TypeSelectorForMap typeSelectorForMap) {
        switch (AnonymousClass1.f40026a[iteratorType.ordinal()]) {
            case 1:
                return new LongValueIterator(osMap, baseRealm);
            case 2:
                return new ByteValueIterator(osMap, baseRealm);
            case 3:
                return new ShortValueIterator(osMap, baseRealm);
            case 4:
                return new IntegerValueIterator(osMap, baseRealm);
            case 5:
                return new FloatValueIterator(osMap, baseRealm);
            case 6:
                return new DoubleValueIterator(osMap, baseRealm);
            case 7:
                return new StringValueIterator(osMap, baseRealm);
            case 8:
                return new BooleanValueIterator(osMap, baseRealm);
            case 9:
                return new DateValueIterator(osMap, baseRealm);
            case 10:
                return new Decimal128ValueIterator(osMap, baseRealm);
            case 11:
                return new BinaryValueIterator(osMap, baseRealm);
            case 12:
                return new ObjectIdValueIterator(osMap, baseRealm);
            case 13:
                return new UUIDValueIterator(osMap, baseRealm);
            case 14:
                return new RealmAnyValueIterator(osMap, baseRealm);
            case 15:
                if (typeSelectorForMap != null) {
                    return new RealmModelValueIterator(osMap, baseRealm, typeSelectorForMap);
                }
                throw new IllegalArgumentException("Missing class container when creating RealmModelValueIterator.");
            default:
                throw new IllegalArgumentException("Invalid iterator type.");
        }
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    public void clear() {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    public boolean contains(Object obj) {
        Iterator it = iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null || obj != null) {
                if (!(obj instanceof Map.Entry)) {
                    break;
                } else if (entry != null && this.C.b(entry, (Map.Entry) obj)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean containsAll(java.util.Collection r4) {
        /*
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000b
            boolean r4 = r3.isEmpty()
            return r4
        L_0x000b:
            java.util.Iterator r4 = r4.iterator()
        L_0x000f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r4.next()
            boolean r1 = r0 instanceof java.util.Map.Entry
            r2 = 0
            if (r1 == 0) goto L_0x0026
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x000f
        L_0x0026:
            return r2
        L_0x0027:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.RealmMapEntrySet.containsAll(java.util.Collection):boolean");
    }

    /* renamed from: e */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    public boolean isEmpty() {
        return this.f40023A.q() == 0;
    }

    public Iterator iterator() {
        return g(this.f40024B, this.f40023A, this.f40025z, this.D);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    public int size() {
        long q2 = this.f40023A.q();
        if (q2 < 2147483647L) {
            return (int) q2;
        }
        return Integer.MAX_VALUE;
    }

    public Object[] toArray() {
        Object[] objArr = new Object[((int) this.f40023A.q())];
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            objArr[i2] = (Map.Entry) it.next();
            i2++;
        }
        return objArr;
    }

    public Object[] toArray(Object[] objArr) {
        long q2 = this.f40023A.q();
        Object[] objArr2 = (((long) objArr.length) == q2 || ((long) objArr.length) > q2) ? objArr : (Object[]) Array.newInstance(Map.Entry.class, (int) q2);
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            objArr2[i2] = (Map.Entry) it.next();
            i2++;
        }
        if (((long) objArr.length) > q2) {
            objArr2[i2] = null;
        }
        return objArr2;
    }

    public RealmMapEntrySet(BaseRealm baseRealm, OsMap osMap, IteratorType iteratorType, EqualsHelper equalsHelper, TypeSelectorForMap typeSelectorForMap) {
        this.f40025z = baseRealm;
        this.f40023A = osMap;
        this.f40024B = iteratorType;
        this.C = equalsHelper;
        this.D = typeSelectorForMap;
    }
}
