package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class SimpleArrayMap<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public Object[] f1993A;

    /* renamed from: B  reason: collision with root package name */
    public int f1994B;

    /* renamed from: z  reason: collision with root package name */
    public int[] f1995z;

    public SimpleArrayMap() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public final int a(Object obj) {
        int i2 = this.f1994B * 2;
        Object[] objArr = this.f1993A;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (Intrinsics.d(obj, objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public void b(int i2) {
        int i3 = this.f1994B;
        int[] iArr = this.f1995z;
        if (iArr.length < i2) {
            int[] copyOf = Arrays.copyOf(iArr, i2);
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f1995z = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f1993A, i2 * 2);
            Intrinsics.h(copyOf2, "copyOf(...)");
            this.f1993A = copyOf2;
        }
        if (this.f1994B != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(Object obj, int i2) {
        int i3 = this.f1994B;
        if (i3 == 0) {
            return -1;
        }
        int a2 = ContainerHelpersKt.a(this.f1995z, i3, i2);
        if (a2 < 0 || Intrinsics.d(obj, this.f1993A[a2 << 1])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f1995z[i4] == i2) {
            if (Intrinsics.d(obj, this.f1993A[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f1995z[i5] == i2) {
            if (Intrinsics.d(obj, this.f1993A[i5 << 1])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public void clear() {
        if (this.f1994B > 0) {
            this.f1995z = ContainerHelpersKt.f2006a;
            this.f1993A = ContainerHelpersKt.f2008c;
            this.f1994B = 0;
        }
        if (this.f1994B > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public int e(Object obj) {
        return obj == null ? f() : c(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                if (size() != ((SimpleArrayMap) obj).size()) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i2 = this.f1994B;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object g2 = g(i3);
                    Object j2 = j(i3);
                    Object obj2 = simpleArrayMap.get(g2);
                    if (j2 == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(g2)) {
                            return false;
                        }
                    } else if (!Intrinsics.d(j2, obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            } else {
                int i4 = this.f1994B;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object g3 = g(i5);
                    Object j3 = j(i5);
                    Object obj3 = ((Map) obj).get(g3);
                    if (j3 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(g3)) {
                            return false;
                        }
                    } else if (!Intrinsics.d(j3, obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i2 = this.f1994B;
        if (i2 == 0) {
            return -1;
        }
        int a2 = ContainerHelpersKt.a(this.f1995z, i2, 0);
        if (a2 < 0 || this.f1993A[a2 << 1] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f1995z[i3] == 0) {
            if (this.f1993A[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.f1995z[i4] == 0) {
            if (this.f1993A[i4 << 1] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public Object g(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.f1994B) {
            z2 = true;
        }
        if (!z2) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
        }
        return this.f1993A[i2 << 1];
    }

    public Object get(Object obj) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return this.f1993A[(e2 << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int e2 = e(obj);
        return e2 >= 0 ? this.f1993A[(e2 << 1) + 1] : obj2;
    }

    public Object h(int i2) {
        if (!(i2 >= 0 && i2 < this.f1994B)) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
        }
        Object[] objArr = this.f1993A;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.f1994B;
        if (i4 <= 1) {
            clear();
        } else {
            int i5 = i4 - 1;
            int[] iArr = this.f1995z;
            int i6 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i5) {
                    int i7 = i2 + 1;
                    ArraysKt.j(iArr, iArr, i2, i7, i4);
                    Object[] objArr2 = this.f1993A;
                    ArraysKt.l(objArr2, objArr2, i3, i7 << 1, i4 << 1);
                }
                Object[] objArr3 = this.f1993A;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                if (i4 > 8) {
                    i6 = i4 + (i4 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i6);
                Intrinsics.h(copyOf, "copyOf(...)");
                this.f1995z = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f1993A, i6 << 1);
                Intrinsics.h(copyOf2, "copyOf(...)");
                this.f1993A = copyOf2;
                if (i4 == this.f1994B) {
                    if (i2 > 0) {
                        ArraysKt.j(iArr, this.f1995z, 0, 0, i2);
                        ArraysKt.l(objArr, this.f1993A, 0, 0, i3);
                    }
                    if (i2 < i5) {
                        int i9 = i2 + 1;
                        ArraysKt.j(iArr, this.f1995z, i2, i9, i4);
                        ArraysKt.l(objArr, this.f1993A, i3, i9 << 1, i4 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            if (i4 == this.f1994B) {
                this.f1994B = i5;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f1995z;
        Object[] objArr = this.f1993A;
        int i2 = this.f1994B;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj != null ? obj.hashCode() : 0) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public Object i(int i2, Object obj) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.f1994B) {
            z2 = true;
        }
        if (!z2) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
        }
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f1993A;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public boolean isEmpty() {
        return this.f1994B <= 0;
    }

    public Object j(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.f1994B) {
            z2 = true;
        }
        if (!z2) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
        }
        return this.f1993A[(i2 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i2 = this.f1994B;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c2 = obj != null ? c(obj, hashCode) : f();
        if (c2 >= 0) {
            int i3 = (c2 << 1) + 1;
            Object[] objArr = this.f1993A;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~c2;
        int[] iArr = this.f1995z;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i5);
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f1995z = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f1993A, i5 << 1);
            Intrinsics.h(copyOf2, "copyOf(...)");
            this.f1993A = copyOf2;
            if (i2 != this.f1994B) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.f1995z;
            int i6 = i4 + 1;
            ArraysKt.j(iArr2, iArr2, i6, i4, i2);
            Object[] objArr2 = this.f1993A;
            ArraysKt.l(objArr2, objArr2, i6 << 1, i4 << 1, this.f1994B << 1);
        }
        int i7 = this.f1994B;
        if (i2 == i7) {
            int[] iArr3 = this.f1995z;
            if (i4 < iArr3.length) {
                iArr3[i4] = hashCode;
                Object[] objArr3 = this.f1993A;
                int i8 = i4 << 1;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.f1994B = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return h(e2);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return i(e2, obj2);
        }
        return null;
    }

    public int size() {
        return this.f1994B;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1994B * 28);
        sb.append('{');
        int i2 = this.f1994B;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object g2 = g(i3);
            if (g2 != sb) {
                sb.append(g2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object j2 = j(i3);
            if (j2 != sb) {
                sb.append(j2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    public SimpleArrayMap(int i2) {
        int[] iArr;
        Object[] objArr;
        if (i2 == 0) {
            iArr = ContainerHelpersKt.f2006a;
        } else {
            iArr = new int[i2];
        }
        this.f1995z = iArr;
        if (i2 == 0) {
            objArr = ContainerHelpersKt.f2008c;
        } else {
            objArr = new Object[(i2 << 1)];
        }
        this.f1993A = objArr;
    }

    public boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0 || !Intrinsics.d(obj2, j(e2))) {
            return false;
        }
        h(e2);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int e2 = e(obj);
        if (e2 < 0 || !Intrinsics.d(obj2, j(e2))) {
            return false;
        }
        i(e2, obj3);
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleArrayMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2);
    }
}
