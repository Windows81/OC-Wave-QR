package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class LongList {

    /* renamed from: a  reason: collision with root package name */
    public long[] f1818a;

    /* renamed from: b  reason: collision with root package name */
    public int f1819b;

    public /* synthetic */ LongList(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public static /* synthetic */ String c(LongList longList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
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
            return longList.b(charSequence, charSequence6, charSequence5, i4, charSequence4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final long a(int i2) {
        if (i2 < 0 || i2 >= this.f1819b) {
            RuntimeHelpersKt.c("Index must be between 0 and size");
        }
        return this.f1818a[i2];
    }

    public final String b(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4) {
        Intrinsics.i(charSequence, "separator");
        Intrinsics.i(charSequence2, "prefix");
        Intrinsics.i(charSequence3, "postfix");
        Intrinsics.i(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.f1818a;
        int i3 = this.f1819b;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                sb.append(charSequence3);
                break;
            }
            long j2 = jArr[i4];
            if (i4 == i2) {
                sb.append(charSequence4);
                break;
            }
            if (i4 != 0) {
                sb.append(charSequence);
            }
            sb.append(j2);
            i4++;
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r9 = (androidx.collection.LongList) r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.collection.LongList
            r1 = 0
            if (r0 == 0) goto L_0x0030
            androidx.collection.LongList r9 = (androidx.collection.LongList) r9
            int r0 = r9.f1819b
            int r2 = r8.f1819b
            if (r0 == r2) goto L_0x000e
            goto L_0x0030
        L_0x000e:
            long[] r0 = r8.f1818a
            long[] r9 = r9.f1818a
            kotlin.ranges.IntRange r2 = kotlin.ranges.RangesKt.v(r1, r2)
            int r3 = r2.n()
            int r2 = r2.o()
            if (r3 > r2) goto L_0x002e
        L_0x0020:
            r4 = r0[r3]
            r6 = r9[r3]
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0029
            return r1
        L_0x0029:
            if (r3 == r2) goto L_0x002e
            int r3 = r3 + 1
            goto L_0x0020
        L_0x002e:
            r9 = 1
            return r9
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongList.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        long[] jArr = this.f1818a;
        int i2 = this.f1819b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += Long.hashCode(jArr[i4]) * 31;
        }
        return i3;
    }

    public String toString() {
        return c(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, 25, (Object) null);
    }

    public LongList(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = LongSetKt.a();
        } else {
            jArr = new long[i2];
        }
        this.f1818a = jArr;
    }
}
