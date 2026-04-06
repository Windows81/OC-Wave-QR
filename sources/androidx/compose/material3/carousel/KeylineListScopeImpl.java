package androidx.compose.material3.carousel;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
final class KeylineListScopeImpl implements KeylineListScope {

    /* renamed from: a  reason: collision with root package name */
    public int f11940a = -1;

    /* renamed from: b  reason: collision with root package name */
    public float f11941b;

    /* renamed from: c  reason: collision with root package name */
    public int f11942c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final List f11943d = new ArrayList();

    @Metadata
    public static final class TmpKeyline {

        /* renamed from: a  reason: collision with root package name */
        public final float f11944a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f11945b;

        public TmpKeyline(float f2, boolean z2) {
            this.f11944a = f2;
            this.f11945b = z2;
        }

        public final float a() {
            return this.f11944a;
        }

        public final boolean b() {
            return this.f11945b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TmpKeyline)) {
                return false;
            }
            TmpKeyline tmpKeyline = (TmpKeyline) obj;
            return Float.compare(this.f11944a, tmpKeyline.f11944a) == 0 && this.f11945b == tmpKeyline.f11945b;
        }

        public int hashCode() {
            return (Float.hashCode(this.f11944a) * 31) + Boolean.hashCode(this.f11945b);
        }

        public String toString() {
            return "TmpKeyline(size=" + this.f11944a + ", isAnchor=" + this.f11945b + ')';
        }
    }

    public void a(float f2, boolean z2) {
        this.f11943d.add(new TmpKeyline(f2, z2));
        if (f2 > this.f11941b) {
            this.f11940a = CollectionsKt.o(this.f11943d);
            this.f11941b = f2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List b(int r29, float r30, int r31, int r32, float r33, float r34, float r35, java.util.List r36) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r34
            r14 = r36
            java.lang.Object r2 = r14.get(r1)
            androidx.compose.material3.carousel.KeylineListScopeImpl$TmpKeyline r2 = (androidx.compose.material3.carousel.KeylineListScopeImpl.TmpKeyline) r2
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            float r3 = r2.a()
            boolean r3 = r0.e(r3, r10)
            r16 = 0
            r9 = 2
            if (r3 == 0) goto L_0x0031
            float r3 = r2.a()
            float r4 = (float) r9
            float r3 = r3 / r4
            float r3 = r10 - r3
        L_0x002e:
            r17 = r3
            goto L_0x0046
        L_0x0031:
            float r3 = r2.a()
            boolean r3 = r0.f(r3, r10, r13)
            if (r3 == 0) goto L_0x0044
            float r3 = r2.a()
            float r4 = (float) r9
            float r3 = r3 / r4
            float r3 = r3 + r10
            float r3 = r3 - r13
            goto L_0x002e
        L_0x0044:
            r17 = r16
        L_0x0046:
            androidx.compose.material3.carousel.Keyline r8 = new androidx.compose.material3.carousel.Keyline
            float r3 = r2.a()
            r18 = 1
            r7 = 0
            if (r11 > r1) goto L_0x0056
            if (r1 > r12) goto L_0x0056
            r6 = r18
            goto L_0x0057
        L_0x0056:
            r6 = r7
        L_0x0057:
            boolean r19 = r2.b()
            r20 = 1
            r2 = r8
            r4 = r30
            r5 = r30
            r13 = r7
            r7 = r19
            r13 = r8
            r8 = r20
            r12 = r9
            r9 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r15.add(r13)
            float r2 = (float) r12
            float r3 = r33 / r2
            float r4 = r10 - r3
            float r4 = r4 - r35
            int r5 = r1 + -1
            r6 = 0
            kotlin.ranges.IntProgression r5 = kotlin.ranges.RangesKt.s(r5, r6)
            java.util.Iterator r5 = r5.iterator()
            r6 = r4
        L_0x0084:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00e7
            r7 = r5
            kotlin.collections.IntIterator r7 = (kotlin.collections.IntIterator) r7
            int r7 = r7.b()
            java.lang.Object r8 = r14.get(r7)
            androidx.compose.material3.carousel.KeylineListScopeImpl$TmpKeyline r8 = (androidx.compose.material3.carousel.KeylineListScopeImpl.TmpKeyline) r8
            float r9 = r8.a()
            float r9 = r9 / r2
            float r9 = r4 - r9
            float r23 = r6 - r3
            float r12 = r8.a()
            boolean r12 = r0.e(r12, r9)
            if (r12 == 0) goto L_0x00b8
            float r12 = r8.a()
            float r12 = r12 / r2
            float r12 = r9 - r12
            float r12 = java.lang.Math.abs(r12)
            r27 = r12
            goto L_0x00ba
        L_0x00b8:
            r27 = r16
        L_0x00ba:
            androidx.compose.material3.carousel.Keyline r12 = new androidx.compose.material3.carousel.Keyline
            float r21 = r8.a()
            r13 = r32
            if (r11 > r7) goto L_0x00c9
            if (r7 > r13) goto L_0x00c9
            r24 = r18
            goto L_0x00cb
        L_0x00c9:
            r24 = 0
        L_0x00cb:
            boolean r25 = r8.b()
            r26 = 0
            r20 = r12
            r22 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r7 = 0
            r15.add(r7, r12)
            float r8 = r8.a()
            float r8 = r8 + r35
            float r4 = r4 - r8
            float r8 = r33 + r35
            float r6 = r6 - r8
            goto L_0x0084
        L_0x00e7:
            r13 = r32
            r7 = 0
            float r4 = r10 + r3
            float r4 = r4 + r35
            int r1 = r1 + 1
            int r5 = r36.size()
            kotlin.ranges.IntRange r1 = kotlin.ranges.RangesKt.v(r1, r5)
            java.util.Iterator r1 = r1.iterator()
            r5 = r4
        L_0x00fd:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x015c
            r6 = r1
            kotlin.collections.IntIterator r6 = (kotlin.collections.IntIterator) r6
            int r6 = r6.b()
            java.lang.Object r8 = r14.get(r6)
            androidx.compose.material3.carousel.KeylineListScopeImpl$TmpKeyline r8 = (androidx.compose.material3.carousel.KeylineListScopeImpl.TmpKeyline) r8
            float r9 = r8.a()
            float r9 = r9 / r2
            float r9 = r9 + r4
            float r22 = r5 + r3
            float r10 = r8.a()
            r12 = r7
            r7 = r34
            boolean r10 = r0.f(r10, r9, r7)
            if (r10 == 0) goto L_0x012f
            float r10 = r8.a()
            float r10 = r10 / r2
            float r10 = r10 + r9
            float r10 = r10 - r7
            r26 = r10
            goto L_0x0131
        L_0x012f:
            r26 = r16
        L_0x0131:
            androidx.compose.material3.carousel.Keyline r10 = new androidx.compose.material3.carousel.Keyline
            float r20 = r8.a()
            if (r11 > r6) goto L_0x013e
            if (r6 > r13) goto L_0x013e
            r23 = r18
            goto L_0x0140
        L_0x013e:
            r23 = r12
        L_0x0140:
            boolean r24 = r8.b()
            r25 = 0
            r19 = r10
            r21 = r9
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r15.add(r10)
            float r6 = r8.a()
            float r6 = r6 + r35
            float r4 = r4 + r6
            float r6 = r33 + r35
            float r5 = r5 + r6
            r7 = r12
            goto L_0x00fd
        L_0x015c:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.KeylineListScopeImpl.b(int, float, int, int, float, float, float, java.util.List):java.util.List");
    }

    public final KeylineList c(float f2, float f3, int i2, float f4) {
        return new KeylineList(b(i2, f4, this.f11940a, d(), this.f11941b, f2, f3, this.f11943d));
    }

    public final int d() {
        int i2 = this.f11940a;
        while (i2 < CollectionsKt.o(this.f11943d)) {
            int i3 = i2 + 1;
            if (((TmpKeyline) this.f11943d.get(i3)).a() != this.f11941b) {
                break;
            }
            i2 = i3;
        }
        return i2;
    }

    public final boolean e(float f2, float f3) {
        float f4 = f2 / ((float) 2);
        return f3 - f4 < 0.0f && f3 + f4 > 0.0f;
    }

    public final boolean f(float f2, float f3, float f4) {
        float f5 = f2 / ((float) 2);
        return f3 - f5 < f4 && f3 + f5 > f4;
    }
}
