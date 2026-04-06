package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzne<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public int f25696A;

    /* renamed from: B  reason: collision with root package name */
    public Map f25697B;
    public boolean C;
    public volatile zznp D;
    public Map E;

    /* renamed from: z  reason: collision with root package name */
    public Object[] f25698z;

    public final int a() {
        return this.f25696A;
    }

    public final int c(Comparable comparable) {
        int i2;
        int i3 = this.f25696A;
        int i4 = i3 - 1;
        if (i4 >= 0) {
            int compareTo = comparable.compareTo((Comparable) ((zznk) this.f25698z[i4]).getKey());
            if (compareTo > 0) {
                i2 = i3 + 1;
                return -i2;
            } else if (compareTo == 0) {
                return i4;
            }
        }
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) / 2;
            int compareTo2 = comparable.compareTo((Comparable) ((zznk) this.f25698z[i6]).getKey());
            if (compareTo2 < 0) {
                i4 = i6 - 1;
            } else if (compareTo2 <= 0) {
                return i6;
            } else {
                i5 = i6 + 1;
            }
        }
        i2 = i5 + 1;
        return -i2;
    }

    public void clear() {
        s();
        if (this.f25696A != 0) {
            this.f25698z = null;
            this.f25696A = 0;
        }
        if (!this.f25697B.isEmpty()) {
            this.f25697B.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return c(comparable) >= 0 || this.f25697B.containsKey(comparable);
    }

    public Set entrySet() {
        if (this.D == null) {
            this.D = new zznp(this);
        }
        return this.D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzne)) {
            return super.equals(obj);
        }
        zzne zzne = (zzne) obj;
        int size = size();
        if (size != zzne.size()) {
            return false;
        }
        int i2 = this.f25696A;
        if (i2 != zzne.f25696A) {
            return entrySet().equals(zzne.entrySet());
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!g(i3).equals(zzne.g(i3))) {
                return false;
            }
        }
        if (i2 != size) {
            return this.f25697B.equals(zzne.f25697B);
        }
        return true;
    }

    /* renamed from: f */
    public final Object put(Comparable comparable, Object obj) {
        s();
        int c2 = c(comparable);
        if (c2 >= 0) {
            return ((zznk) this.f25698z[c2]).setValue(obj);
        }
        s();
        if (this.f25698z == null) {
            this.f25698z = new Object[16];
        }
        int i2 = -(c2 + 1);
        if (i2 >= 16) {
            return r().put(comparable, obj);
        }
        int i3 = this.f25696A;
        if (i3 == 16) {
            zznk zznk = (zznk) this.f25698z[15];
            this.f25696A = i3 - 1;
            r().put((Comparable) zznk.getKey(), zznk.getValue());
        }
        Object[] objArr = this.f25698z;
        System.arraycopy(objArr, i2, objArr, i2 + 1, (objArr.length - i2) - 1);
        this.f25698z[i2] = new zznk(this, comparable, obj);
        this.f25696A++;
        return null;
    }

    public final Map.Entry g(int i2) {
        if (i2 < this.f25696A) {
            return (zznk) this.f25698z[i2];
        }
        throw new ArrayIndexOutOfBoundsException(i2);
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int c2 = c(comparable);
        return c2 >= 0 ? ((zznk) this.f25698z[c2]).getValue() : this.f25697B.get(comparable);
    }

    public final Iterable h() {
        return this.f25697B.isEmpty() ? Collections.emptySet() : this.f25697B.entrySet();
    }

    public int hashCode() {
        int i2 = this.f25696A;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += this.f25698z[i4].hashCode();
        }
        return this.f25697B.size() > 0 ? i3 + this.f25697B.hashCode() : i3;
    }

    public final Object i(int i2) {
        s();
        Object value = ((zznk) this.f25698z[i2]).getValue();
        Object[] objArr = this.f25698z;
        System.arraycopy(objArr, i2 + 1, objArr, i2, (this.f25696A - i2) - 1);
        this.f25696A--;
        if (!this.f25697B.isEmpty()) {
            Iterator it = r().entrySet().iterator();
            this.f25698z[this.f25696A] = new zznk(this, (Map.Entry) it.next());
            this.f25696A++;
            it.remove();
        }
        return value;
    }

    public final Set m() {
        return new zzni(this);
    }

    public void n() {
        if (!this.C) {
            this.f25697B = this.f25697B.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f25697B);
            this.E = this.E.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.E);
            this.C = true;
        }
    }

    public final boolean p() {
        return this.C;
    }

    public final SortedMap r() {
        s();
        if (this.f25697B.isEmpty() && !(this.f25697B instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f25697B = treeMap;
            this.E = treeMap.descendingMap();
        }
        return (SortedMap) this.f25697B;
    }

    public Object remove(Object obj) {
        s();
        Comparable comparable = (Comparable) obj;
        int c2 = c(comparable);
        if (c2 >= 0) {
            return i(c2);
        }
        if (this.f25697B.isEmpty()) {
            return null;
        }
        return this.f25697B.remove(comparable);
    }

    public final void s() {
        if (this.C) {
            throw new UnsupportedOperationException();
        }
    }

    public int size() {
        return this.f25696A + this.f25697B.size();
    }

    public zzne() {
        this.f25697B = Collections.emptyMap();
        this.E = Collections.emptyMap();
    }
}
