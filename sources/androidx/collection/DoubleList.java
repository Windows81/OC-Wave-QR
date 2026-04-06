package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class DoubleList {

    /* renamed from: a  reason: collision with root package name */
    public double[] f1727a;

    /* renamed from: b  reason: collision with root package name */
    public int f1728b;

    public /* synthetic */ DoubleList(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public static /* synthetic */ String b(DoubleList doubleList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
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
            return doubleList.a(charSequence, charSequence6, charSequence5, i4, charSequence4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4) {
        Intrinsics.i(charSequence, "separator");
        Intrinsics.i(charSequence2, "prefix");
        Intrinsics.i(charSequence3, "postfix");
        Intrinsics.i(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        double[] dArr = this.f1727a;
        int i3 = this.f1728b;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                sb.append(charSequence3);
                break;
            }
            double d2 = dArr[i4];
            if (i4 == i2) {
                sb.append(charSequence4);
                break;
            }
            if (i4 != 0) {
                sb.append(charSequence);
            }
            sb.append(d2);
            i4++;
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r9 = (androidx.collection.DoubleList) r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.collection.DoubleList
            r1 = 0
            if (r0 == 0) goto L_0x0030
            androidx.collection.DoubleList r9 = (androidx.collection.DoubleList) r9
            int r0 = r9.f1728b
            int r2 = r8.f1728b
            if (r0 == r2) goto L_0x000e
            goto L_0x0030
        L_0x000e:
            double[] r0 = r8.f1727a
            double[] r9 = r9.f1727a
            kotlin.ranges.IntRange r2 = kotlin.ranges.RangesKt.v(r1, r2)
            int r3 = r2.n()
            int r2 = r2.o()
            if (r3 > r2) goto L_0x002e
        L_0x0020:
            r4 = r0[r3]
            r6 = r9[r3]
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x002d
            if (r3 == r2) goto L_0x002e
            int r3 = r3 + 1
            goto L_0x0020
        L_0x002d:
            return r1
        L_0x002e:
            r9 = 1
            return r9
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.DoubleList.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        double[] dArr = this.f1727a;
        int i2 = this.f1728b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += Double.hashCode(dArr[i4]) * 31;
        }
        return i3;
    }

    public String toString() {
        return b(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, 25, (Object) null);
    }

    public DoubleList(int i2) {
        double[] dArr;
        if (i2 == 0) {
            dArr = DoubleSetKt.a();
        } else {
            dArr = new double[i2];
        }
        this.f1727a = dArr;
    }
}
