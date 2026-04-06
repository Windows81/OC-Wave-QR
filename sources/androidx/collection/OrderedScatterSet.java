package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class OrderedScatterSet<E> {

    /* renamed from: a  reason: collision with root package name */
    public long[] f1948a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f1949b;

    /* renamed from: c  reason: collision with root package name */
    public long[] f1950c;

    /* renamed from: d  reason: collision with root package name */
    public int f1951d;

    /* renamed from: e  reason: collision with root package name */
    public int f1952e;

    /* renamed from: f  reason: collision with root package name */
    public int f1953f;

    /* renamed from: g  reason: collision with root package name */
    public int f1954g;

    public /* synthetic */ OrderedScatterSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ String f(OrderedScatterSet orderedScatterSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
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
            return orderedScatterSet.e(charSequence, charSequence6, charSequence5, i4, charSequence7, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & -9187201950435737472L) == 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        r11 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto L_0x000c
            int r3 = r18.hashCode()
            goto L_0x000d
        L_0x000c:
            r3 = r2
        L_0x000d:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f1953f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L_0x001c:
            long[] r7 = r0.f1948a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L_0x0048:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L_0x0067
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f1949b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.Intrinsics.d(r15, r1)
            if (r15 == 0) goto L_0x0061
            goto L_0x0071
        L_0x0061:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L_0x0048
        L_0x0067:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L_0x0075
            r11 = -1
        L_0x0071:
            if (r11 < 0) goto L_0x0074
            r2 = r12
        L_0x0074:
            return r2
        L_0x0075:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.OrderedScatterSet.a(java.lang.Object):boolean");
    }

    public final int b() {
        return this.f1953f;
    }

    public final int c() {
        return this.f1954g;
    }

    public final boolean d() {
        return this.f1954g == 0;
    }

    public final String e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1) {
        Intrinsics.i(charSequence, "separator");
        Intrinsics.i(charSequence2, "prefix");
        Intrinsics.i(charSequence3, "postfix");
        Intrinsics.i(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr = this.f1949b;
        long[] jArr = this.f1950c;
        int i3 = this.f1952e;
        int i4 = 0;
        while (true) {
            if (i3 == Integer.MAX_VALUE) {
                sb.append(charSequence3);
                break;
            }
            int i5 = (int) ((jArr[i3] >> 31) & 2147483647L);
            Object obj = objArr[i3];
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
            i3 = i5;
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof androidx.collection.OrderedScatterSet
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            androidx.collection.OrderedScatterSet r1 = (androidx.collection.OrderedScatterSet) r1
            int r3 = r1.c()
            int r5 = r17.c()
            if (r3 == r5) goto L_0x001b
            return r4
        L_0x001b:
            java.lang.Object[] r3 = r0.f1949b
            long[] r5 = r0.f1948a
            int r6 = r5.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0061
            r7 = r4
        L_0x0025:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x005c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L_0x003f:
            if (r12 >= r10) goto L_0x005a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L_0x0056
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.a(r13)
            if (r13 != 0) goto L_0x0056
            return r4
        L_0x0056:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L_0x003f
        L_0x005a:
            if (r10 != r11) goto L_0x0061
        L_0x005c:
            if (r7 == r6) goto L_0x0061
            int r7 = r7 + 1
            goto L_0x0025
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.OrderedScatterSet.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i2 = (this.f1953f * 31) + this.f1954g;
        Object[] objArr = this.f1949b;
        long[] jArr = this.f1948a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            Object obj = objArr[(i3 << 3) + i5];
                            if (!Intrinsics.d(obj, this)) {
                                i2 += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    public String toString() {
        return f(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, new OrderedScatterSet$toString$1(this), 25, (Object) null);
    }

    public OrderedScatterSet() {
        this.f1948a = ScatterMapKt.f1964a;
        this.f1949b = ContainerHelpersKt.f2008c;
        this.f1950c = SieveCacheKt.a();
        this.f1951d = Integer.MAX_VALUE;
        this.f1952e = Integer.MAX_VALUE;
    }
}
