package androidx.compose.ui.text.android;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata
public final class LayoutHelper {

    /* renamed from: a  reason: collision with root package name */
    public final Layout f18526a;

    /* renamed from: b  reason: collision with root package name */
    public final List f18527b;

    /* renamed from: c  reason: collision with root package name */
    public final List f18528c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean[] f18529d;

    /* renamed from: e  reason: collision with root package name */
    public char[] f18530e;

    /* renamed from: f  reason: collision with root package name */
    public final int f18531f;

    @Metadata
    public static final class BidiRun {

        /* renamed from: a  reason: collision with root package name */
        public final int f18532a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18533b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f18534c;

        public BidiRun(int i2, int i3, boolean z2) {
            this.f18532a = i2;
            this.f18533b = i3;
            this.f18534c = z2;
        }

        public final int a() {
            return this.f18533b;
        }

        public final int b() {
            return this.f18532a;
        }

        public final boolean c() {
            return this.f18534c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) obj;
            return this.f18532a == bidiRun.f18532a && this.f18533b == bidiRun.f18533b && this.f18534c == bidiRun.f18534c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f18532a) * 31) + Integer.hashCode(this.f18533b)) * 31) + Boolean.hashCode(this.f18534c);
        }

        public String toString() {
            return "BidiRun(start=" + this.f18532a + ", end=" + this.f18533b + ", isRtl=" + this.f18534c + ')';
        }
    }

    public LayoutHelper(Layout layout) {
        this.f18526a = layout;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            int i0 = StringsKt.i0(this.f18526a.getText(), 10, i2, false, 4, (Object) null);
            i2 = i0 < 0 ? this.f18526a.getText().length() : i0 + 1;
            arrayList.add(Integer.valueOf(i2));
        } while (i2 < this.f18526a.getText().length());
        this.f18527b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add((Object) null);
        }
        this.f18528c = arrayList2;
        this.f18529d = new boolean[this.f18527b.size()];
        this.f18531f = this.f18527b.size();
    }

    public static /* synthetic */ int g(LayoutHelper layoutHelper, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return layoutHelper.f(i2, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r3.getRunCount() == 1) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.text.Bidi a(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.f18529d
            boolean r0 = r0[r12]
            if (r0 == 0) goto L_0x000f
            java.util.List r0 = r11.f18528c
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        L_0x000f:
            r0 = 0
            if (r12 != 0) goto L_0x0014
            r1 = r0
            goto L_0x0022
        L_0x0014:
            java.util.List r1 = r11.f18527b
            int r2 = r12 + -1
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L_0x0022:
            java.util.List r2 = r11.f18527b
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.f18530e
            if (r3 == 0) goto L_0x003a
            int r4 = r3.length
            if (r4 >= r8) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r10 = r3
            goto L_0x003d
        L_0x003a:
            char[] r3 = new char[r8]
            goto L_0x0038
        L_0x003d:
            android.text.Layout r3 = r11.f18526a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0062
            boolean r9 = r11.j(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L_0x0063
        L_0x0062:
            r0 = r1
        L_0x0063:
            java.util.List r3 = r11.f18528c
            r3.set(r12, r0)
            boolean[] r3 = r11.f18529d
            r3[r12] = r2
            if (r0 == 0) goto L_0x0075
            char[] r12 = r11.f18530e
            if (r10 != r12) goto L_0x0074
            r10 = r1
            goto L_0x0075
        L_0x0074:
            r10 = r12
        L_0x0075:
            r11.f18530e = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutHelper.a(int):java.text.Bidi");
    }

    public final float b(int i2, boolean z2) {
        int j2 = RangesKt.j(i2, this.f18526a.getLineEnd(this.f18526a.getLineForOffset(i2)));
        return z2 ? this.f18526a.getPrimaryHorizontal(j2) : this.f18526a.getSecondaryHorizontal(j2);
    }

    public final float c(int i2, boolean z2, boolean z3) {
        int i3 = i2;
        boolean z4 = z3;
        if (!z4) {
            return b(i2, z2);
        }
        int a2 = LayoutCompat_androidKt.a(this.f18526a, i3, z4);
        int lineStart = this.f18526a.getLineStart(a2);
        int lineEnd = this.f18526a.getLineEnd(a2);
        if (i3 != lineStart && i3 != lineEnd) {
            return b(i2, z2);
        }
        if (i3 == 0 || i3 == this.f18526a.getText().length()) {
            return b(i2, z2);
        }
        int f2 = f(i3, z4);
        boolean j2 = j(f2);
        int k2 = k(lineEnd, lineStart);
        int h2 = h(f2);
        int i4 = lineStart - h2;
        int i5 = k2 - h2;
        Bidi a3 = a(f2);
        Bidi createLineBidi = a3 != null ? a3.createLineBidi(i4, i5) : null;
        boolean z5 = false;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = this.f18526a.isRtlCharAt(lineStart);
            if (z2 || j2 == isRtlCharAt) {
                j2 = !j2;
            }
            if (i3 == lineStart) {
                z5 = j2;
            } else if (!j2) {
                z5 = true;
            }
            Layout layout = this.f18526a;
            return z5 ? layout.getLineLeft(a2) : layout.getLineRight(a2);
        }
        int runCount = createLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            bidiRunArr[i6] = new BidiRun(createLineBidi.getRunStart(i6) + lineStart, createLineBidi.getRunLimit(i6) + lineStart, createLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) createLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i8 = -1;
        if (i3 == lineStart) {
            int i9 = 0;
            while (true) {
                if (i9 >= runCount) {
                    break;
                } else if (bidiRunArr[i9].b() == i3) {
                    i8 = i9;
                    break;
                } else {
                    i9++;
                }
            }
            BidiRun bidiRun = bidiRunArr[i8];
            if (z2 || j2 == bidiRun.c()) {
                j2 = !j2;
            }
            return (i8 != 0 || !j2) ? (i8 != ArraysKt.m0(bidiRunArr) || j2) ? j2 ? this.f18526a.getPrimaryHorizontal(bidiRunArr[i8 - 1].b()) : this.f18526a.getPrimaryHorizontal(bidiRunArr[i8 + 1].b()) : this.f18526a.getLineRight(a2) : this.f18526a.getLineLeft(a2);
        }
        if (i3 > k2) {
            i3 = k(i3, lineStart);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= runCount) {
                break;
            } else if (bidiRunArr[i10].a() == i3) {
                i8 = i10;
                break;
            } else {
                i10++;
            }
        }
        BidiRun bidiRun2 = bidiRunArr[i8];
        if (!z2 && j2 != bidiRun2.c()) {
            j2 = !j2;
        }
        return (i8 != 0 || !j2) ? (i8 != ArraysKt.m0(bidiRunArr) || j2) ? j2 ? this.f18526a.getPrimaryHorizontal(bidiRunArr[i8 - 1].a()) : this.f18526a.getPrimaryHorizontal(bidiRunArr[i8 + 1].a()) : this.f18526a.getLineRight(a2) : this.f18526a.getLineLeft(a2);
    }

    public final BidiRun[] d(int i2) {
        Bidi createLineBidi;
        int lineStart = this.f18526a.getLineStart(i2);
        int lineEnd = this.f18526a.getLineEnd(i2);
        int g2 = g(this, lineStart, false, 2, (Object) null);
        int h2 = h(g2);
        int i3 = lineStart - h2;
        int i4 = lineEnd - h2;
        Bidi a2 = a(g2);
        if (a2 == null || (createLineBidi = a2.createLineBidi(i3, i4)) == null) {
            return new BidiRun[]{new BidiRun(lineStart, lineEnd, this.f18526a.isRtlCharAt(lineStart))};
        }
        int runCount = createLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i5 = 0; i5 < runCount; i5++) {
            int runStart = createLineBidi.getRunStart(i5) + lineStart;
            int runLimit = createLineBidi.getRunLimit(i5) + lineStart;
            boolean z2 = true;
            if (createLineBidi.getRunLevel(i5) % 2 != 1) {
                z2 = false;
            }
            bidiRunArr[i5] = new BidiRun(runStart, runLimit, z2);
        }
        return bidiRunArr;
    }

    public final int e(int i2) {
        return k(this.f18526a.getLineEnd(i2), this.f18526a.getLineStart(i2));
    }

    public final int f(int i2, boolean z2) {
        int l2 = CollectionsKt.l(this.f18527b, Integer.valueOf(i2), 0, 0, 6, (Object) null);
        int i3 = l2 < 0 ? -(l2 + 1) : l2 + 1;
        if (z2 && i3 > 0) {
            int i4 = i3 - 1;
            if (i2 == ((Number) this.f18527b.get(i4)).intValue()) {
                return i4;
            }
        }
        return i3;
    }

    public final int h(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return ((Number) this.f18527b.get(i2 - 1)).intValue();
    }

    public final boolean i(char c2) {
        return c2 == ' ' || c2 == 10 || c2 == 5760 || (Intrinsics.k(c2, 8192) >= 0 && Intrinsics.k(c2, 8202) <= 0 && c2 != 8199) || c2 == 8287 || c2 == 12288;
    }

    public final boolean j(int i2) {
        return this.f18526a.getParagraphDirection(this.f18526a.getLineForOffset(h(i2))) == -1;
    }

    public final int k(int i2, int i3) {
        while (i2 > i3 && i(this.f18526a.getText().charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }
}
