package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class ObjectList<E> {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f1937a;

    /* renamed from: b  reason: collision with root package name */
    public int f1938b;

    public /* synthetic */ ObjectList(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public static /* synthetic */ String j(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                charSequence = ", ";
            }
            CharSequence charSequence5 = "";
            CharSequence charSequence6 = (i3 & 2) != 0 ? charSequence5 : charSequence2;
            if ((i3 & 4) == 0) {
                charSequence5 = charSequence3;
            }
            if ((i3 & 8) != 0) {
                i2 = -1;
            }
            int i4 = i2;
            if ((i3 & 16) != 0) {
                charSequence4 = "...";
            }
            CharSequence charSequence7 = charSequence4;
            if ((i3 & 32) != 0) {
                function1 = null;
            }
            return objectList.i(charSequence, charSequence6, charSequence5, i4, charSequence7, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean a(Object obj) {
        return f(obj) >= 0;
    }

    public final boolean b(Iterable iterable) {
        Intrinsics.i(iterable, "elements");
        for (Object a2 : iterable) {
            if (!a(a2)) {
                return false;
            }
        }
        return true;
    }

    public final Object c() {
        if (g()) {
            RuntimeHelpersKt.d("ObjectList is empty.");
        }
        return this.f1937a[0];
    }

    public final Object d(int i2) {
        if (i2 < 0 || i2 >= this.f1938b) {
            l(i2);
        }
        return this.f1937a[i2];
    }

    public final int e() {
        return this.f1938b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r7 = (androidx.collection.ObjectList) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.collection.ObjectList
            r1 = 0
            if (r0 == 0) goto L_0x0032
            androidx.collection.ObjectList r7 = (androidx.collection.ObjectList) r7
            int r0 = r7.f1938b
            int r2 = r6.f1938b
            if (r0 == r2) goto L_0x000e
            goto L_0x0032
        L_0x000e:
            java.lang.Object[] r0 = r6.f1937a
            java.lang.Object[] r7 = r7.f1937a
            kotlin.ranges.IntRange r2 = kotlin.ranges.RangesKt.v(r1, r2)
            int r3 = r2.n()
            int r2 = r2.o()
            if (r3 > r2) goto L_0x0030
        L_0x0020:
            r4 = r0[r3]
            r5 = r7[r3]
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r5)
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            if (r3 == r2) goto L_0x0030
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0030:
            r7 = 1
            return r7
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectList.equals(java.lang.Object):boolean");
    }

    public final int f(Object obj) {
        int i2 = 0;
        if (obj == null) {
            Object[] objArr = this.f1937a;
            int i3 = this.f1938b;
            while (i2 < i3) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        Object[] objArr2 = this.f1937a;
        int i4 = this.f1938b;
        while (i2 < i4) {
            if (obj.equals(objArr2[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final boolean g() {
        return this.f1938b == 0;
    }

    public final boolean h() {
        return this.f1938b != 0;
    }

    public int hashCode() {
        Object[] objArr = this.f1937a;
        int i2 = this.f1938b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            i3 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i3;
    }

    public final String i(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1) {
        Intrinsics.i(charSequence, "separator");
        Intrinsics.i(charSequence2, "prefix");
        Intrinsics.i(charSequence3, "postfix");
        Intrinsics.i(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr = this.f1937a;
        int i3 = this.f1938b;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                sb.append(charSequence3);
                break;
            }
            Object obj = objArr[i4];
            if (i4 == i2) {
                sb.append(charSequence4);
                break;
            }
            if (i4 != 0) {
                sb.append(charSequence);
            }
            if (function1 == null) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) function1.invoke(obj));
            }
            i4++;
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    public final int k(Object obj) {
        if (obj == null) {
            Object[] objArr = this.f1937a;
            for (int i2 = this.f1938b - 1; -1 < i2; i2--) {
                if (objArr[i2] == null) {
                    return i2;
                }
            }
        } else {
            Object[] objArr2 = this.f1937a;
            for (int i3 = this.f1938b - 1; -1 < i3; i3--) {
                if (obj.equals(objArr2[i3])) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public final void l(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i2);
        sb.append(" must be in 0..");
        sb.append(this.f1938b - 1);
        RuntimeHelpersKt.c(sb.toString());
    }

    public String toString() {
        return j(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, new ObjectList$toString$1(this), 25, (Object) null);
    }

    public ObjectList(int i2) {
        Object[] objArr;
        if (i2 == 0) {
            objArr = ObjectListKt.f1940a;
        } else {
            objArr = new Object[i2];
        }
        this.f1937a = objArr;
    }
}
