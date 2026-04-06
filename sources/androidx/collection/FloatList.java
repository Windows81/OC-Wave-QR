package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class FloatList {

    /* renamed from: a  reason: collision with root package name */
    public float[] f1746a;

    /* renamed from: b  reason: collision with root package name */
    public int f1747b;

    public /* synthetic */ FloatList(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public static /* synthetic */ String c(FloatList floatList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
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
            return floatList.b(charSequence, charSequence6, charSequence5, i4, charSequence4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final float a(int i2) {
        if (i2 < 0 || i2 >= this.f1747b) {
            RuntimeHelpersKt.c("Index must be between 0 and size");
        }
        return this.f1746a[i2];
    }

    public final String b(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4) {
        Intrinsics.i(charSequence, "separator");
        Intrinsics.i(charSequence2, "prefix");
        Intrinsics.i(charSequence3, "postfix");
        Intrinsics.i(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.f1746a;
        int i3 = this.f1747b;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                sb.append(charSequence3);
                break;
            }
            float f2 = fArr[i4];
            if (i4 == i2) {
                sb.append(charSequence4);
                break;
            }
            if (i4 != 0) {
                sb.append(charSequence);
            }
            sb.append(f2);
            i4++;
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r7 = (androidx.collection.FloatList) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.collection.FloatList
            r1 = 0
            if (r0 == 0) goto L_0x0030
            androidx.collection.FloatList r7 = (androidx.collection.FloatList) r7
            int r0 = r7.f1747b
            int r2 = r6.f1747b
            if (r0 == r2) goto L_0x000e
            goto L_0x0030
        L_0x000e:
            float[] r0 = r6.f1746a
            float[] r7 = r7.f1746a
            kotlin.ranges.IntRange r2 = kotlin.ranges.RangesKt.v(r1, r2)
            int r3 = r2.n()
            int r2 = r2.o()
            if (r3 > r2) goto L_0x002e
        L_0x0020:
            r4 = r0[r3]
            r5 = r7[r3]
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x002d
            if (r3 == r2) goto L_0x002e
            int r3 = r3 + 1
            goto L_0x0020
        L_0x002d:
            return r1
        L_0x002e:
            r7 = 1
            return r7
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatList.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        float[] fArr = this.f1746a;
        int i2 = this.f1747b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += Float.hashCode(fArr[i4]) * 31;
        }
        return i3;
    }

    public String toString() {
        return c(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, 25, (Object) null);
    }

    public FloatList(int i2) {
        float[] fArr;
        if (i2 == 0) {
            fArr = FloatSetKt.a();
        } else {
            fArr = new float[i2];
        }
        this.f1746a = fArr;
    }
}
