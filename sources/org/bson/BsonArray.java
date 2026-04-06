package org.bson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class BsonArray extends BsonValue implements List<BsonValue>, Cloneable {

    /* renamed from: z  reason: collision with root package name */
    public final List f43608z;

    /* renamed from: org.bson.BsonArray$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f43609a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                org.bson.BsonType[] r0 = org.bson.BsonType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43609a = r0
                org.bson.BsonType r1 = org.bson.BsonType.DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43609a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.bson.BsonType r1 = org.bson.BsonType.ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43609a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.bson.BsonType r1 = org.bson.BsonType.BINARY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43609a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bson.BsonArray.AnonymousClass1.<clinit>():void");
        }
    }

    public BsonArray(List list) {
        this(list, true);
    }

    public boolean addAll(Collection collection) {
        return this.f43608z.addAll(collection);
    }

    public void clear() {
        this.f43608z.clear();
    }

    public boolean contains(Object obj) {
        return this.f43608z.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return this.f43608z.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BsonArray)) {
            return false;
        }
        return u0().equals(((BsonArray) obj).u0());
    }

    public int hashCode() {
        return this.f43608z.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f43608z.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f43608z.isEmpty();
    }

    public Iterator iterator() {
        return this.f43608z.iterator();
    }

    public BsonType j0() {
        return BsonType.ARRAY;
    }

    /* renamed from: l0 */
    public void add(int i2, BsonValue bsonValue) {
        this.f43608z.add(i2, bsonValue);
    }

    public int lastIndexOf(Object obj) {
        return this.f43608z.lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        return this.f43608z.listIterator();
    }

    /* renamed from: p0 */
    public boolean add(BsonValue bsonValue) {
        return this.f43608z.add(bsonValue);
    }

    /* renamed from: q0 */
    public BsonArray clone() {
        BsonArray bsonArray = new BsonArray();
        Iterator it = iterator();
        while (it.hasNext()) {
            BsonValue bsonValue = (BsonValue) it.next();
            int i2 = AnonymousClass1.f43609a[bsonValue.j0().ordinal()];
            if (i2 == 1) {
                bsonArray.add(bsonValue.R().clone());
            } else if (i2 == 2) {
                bsonArray.add(bsonValue.n().clone());
            } else if (i2 == 3) {
                bsonArray.add(BsonBinary.l0(bsonValue.o()));
            } else if (i2 != 4) {
                bsonArray.add(bsonValue);
            } else {
                bsonArray.add(BsonJavaScriptWithScope.l0(bsonValue.Z()));
            }
        }
        return bsonArray;
    }

    /* renamed from: r0 */
    public BsonValue get(int i2) {
        return (BsonValue) this.f43608z.get(i2);
    }

    public boolean removeAll(Collection collection) {
        return this.f43608z.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return this.f43608z.retainAll(collection);
    }

    public int size() {
        return this.f43608z.size();
    }

    public List subList(int i2, int i3) {
        return this.f43608z.subList(i2, i3);
    }

    public Object[] toArray() {
        return this.f43608z.toArray();
    }

    public String toString() {
        return "BsonArray{values=" + this.f43608z + '}';
    }

    public List u0() {
        return Collections.unmodifiableList(this.f43608z);
    }

    /* renamed from: v0 */
    public BsonValue remove(int i2) {
        return (BsonValue) this.f43608z.remove(i2);
    }

    /* renamed from: x0 */
    public BsonValue set(int i2, BsonValue bsonValue) {
        return (BsonValue) this.f43608z.set(i2, bsonValue);
    }

    public BsonArray() {
        this(new ArrayList(), false);
    }

    public boolean addAll(int i2, Collection collection) {
        return this.f43608z.addAll(i2, collection);
    }

    public ListIterator listIterator(int i2) {
        return this.f43608z.listIterator(i2);
    }

    public boolean remove(Object obj) {
        return this.f43608z.remove(obj);
    }

    public Object[] toArray(Object[] objArr) {
        return this.f43608z.toArray(objArr);
    }

    public BsonArray(List list, boolean z2) {
        if (z2) {
            this.f43608z = new ArrayList(list);
        } else {
            this.f43608z = list;
        }
    }
}
