package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class IntList {

    /* renamed from: a  reason: collision with root package name */
    public int[] f1783a;

    /* renamed from: b  reason: collision with root package name */
    public int f1784b;

    public /* synthetic */ IntList(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public static /* synthetic */ int b(IntList intList, int i2, int i3, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                i3 = 0;
            }
            if ((i5 & 4) != 0) {
                i4 = intList.f1784b;
            }
            return intList.a(i2, i3, i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
    }

    public static /* synthetic */ String h(IntList intList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
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
            return intList.g(charSequence, charSequence6, charSequence5, i4, charSequence4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final int a(int i2, int i3, int i4) {
        if (i3 < 0 || i3 >= i4 || i4 > this.f1784b) {
            RuntimeHelpersKt.c("");
        }
        int i5 = i4 - 1;
        while (i3 <= i5) {
            int i6 = (i3 + i5) >>> 1;
            int i7 = this.f1783a[i6];
            if (i7 < i2) {
                i3 = i6 + 1;
            } else if (i7 <= i2) {
                return i6;
            } else {
                i5 = i6 - 1;
            }
        }
        return -(i3 + 1);
    }

    public final boolean c(int i2) {
        int[] iArr = this.f1783a;
        int i3 = this.f1784b;
        for (int i4 = 0; i4 < i3; i4++) {
            if (iArr[i4] == i2) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        if (this.f1784b == 0) {
            RuntimeHelpersKt.d("IntList is empty.");
        }
        return this.f1783a[0];
    }

    public final int e(int i2) {
        if (i2 < 0 || i2 >= this.f1784b) {
            RuntimeHelpersKt.c("Index must be between 0 and size");
        }
        return this.f1783a[i2];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r7 = (androidx.collection.IntList) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.collection.IntList
            r1 = 0
            if (r0 == 0) goto L_0x002e
            androidx.collection.IntList r7 = (androidx.collection.IntList) r7
            int r0 = r7.f1784b
            int r2 = r6.f1784b
            if (r0 == r2) goto L_0x000e
            goto L_0x002e
        L_0x000e:
            int[] r0 = r6.f1783a
            int[] r7 = r7.f1783a
            kotlin.ranges.IntRange r2 = kotlin.ranges.RangesKt.v(r1, r2)
            int r3 = r2.n()
            int r2 = r2.o()
            if (r3 > r2) goto L_0x002c
        L_0x0020:
            r4 = r0[r3]
            r5 = r7[r3]
            if (r4 == r5) goto L_0x0027
            return r1
        L_0x0027:
            if (r3 == r2) goto L_0x002c
            int r3 = r3 + 1
            goto L_0x0020
        L_0x002c:
            r7 = 1
            return r7
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntList.equals(java.lang.Object):boolean");
    }

    public final int f(int i2) {
        int[] iArr = this.f1783a;
        int i3 = this.f1784b;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i2 == iArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    public final String g(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4) {
        Intrinsics.i(charSequence, "separator");
        Intrinsics.i(charSequence2, "prefix");
        Intrinsics.i(charSequence3, "postfix");
        Intrinsics.i(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.f1783a;
        int i3 = this.f1784b;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                sb.append(charSequence3);
                break;
            }
            int i5 = iArr[i4];
            if (i4 == i2) {
                sb.append(charSequence4);
                break;
            }
            if (i4 != 0) {
                sb.append(charSequence);
            }
            sb.append(i5);
            i4++;
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    public int hashCode() {
        int[] iArr = this.f1783a;
        int i2 = this.f1784b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += Integer.hashCode(iArr[i4]) * 31;
        }
        return i3;
    }

    public final int i() {
        if (this.f1784b == 0) {
            RuntimeHelpersKt.d("IntList is empty.");
        }
        return this.f1783a[this.f1784b - 1];
    }

    public String toString() {
        return h(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, 25, (Object) null);
    }

    public IntList(int i2) {
        int[] iArr;
        if (i2 == 0) {
            iArr = IntSetKt.a();
        } else {
            iArr = new int[i2];
        }
        this.f1783a = iArr;
    }
}
