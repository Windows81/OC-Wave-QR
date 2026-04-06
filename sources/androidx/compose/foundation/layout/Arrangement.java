package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Arrangement {

    /* renamed from: a  reason: collision with root package name */
    public static final Arrangement f3739a = new Arrangement();

    /* renamed from: b  reason: collision with root package name */
    public static final Horizontal f3740b = new Arrangement$Start$1();

    /* renamed from: c  reason: collision with root package name */
    public static final Horizontal f3741c = new Arrangement$End$1();

    /* renamed from: d  reason: collision with root package name */
    public static final Vertical f3742d = new Arrangement$Top$1();

    /* renamed from: e  reason: collision with root package name */
    public static final Vertical f3743e = new Arrangement$Bottom$1();

    /* renamed from: f  reason: collision with root package name */
    public static final HorizontalOrVertical f3744f = new Arrangement$Center$1();

    /* renamed from: g  reason: collision with root package name */
    public static final HorizontalOrVertical f3745g = new Arrangement$SpaceEvenly$1();

    /* renamed from: h  reason: collision with root package name */
    public static final HorizontalOrVertical f3746h = new Arrangement$SpaceBetween$1();

    /* renamed from: i  reason: collision with root package name */
    public static final HorizontalOrVertical f3747i = new Arrangement$SpaceAround$1();

    @Metadata
    public static final class Absolute {

        /* renamed from: a  reason: collision with root package name */
        public static final Absolute f3748a = new Absolute();

        /* renamed from: b  reason: collision with root package name */
        public static final Horizontal f3749b = new Arrangement$Absolute$Left$1();

        /* renamed from: c  reason: collision with root package name */
        public static final Horizontal f3750c = new Arrangement$Absolute$Center$1();

        /* renamed from: d  reason: collision with root package name */
        public static final Horizontal f3751d = new Arrangement$Absolute$Right$1();

        /* renamed from: e  reason: collision with root package name */
        public static final Horizontal f3752e = new Arrangement$Absolute$SpaceBetween$1();

        /* renamed from: f  reason: collision with root package name */
        public static final Horizontal f3753f = new Arrangement$Absolute$SpaceEvenly$1();

        /* renamed from: g  reason: collision with root package name */
        public static final Horizontal f3754g = new Arrangement$Absolute$SpaceAround$1();

        public final Horizontal a() {
            return f3749b;
        }

        public final Horizontal b() {
            return f3751d;
        }

        public final HorizontalOrVertical c(float f2) {
            return new SpacedAligned(f2, false, (Function2) null, (DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public interface Horizontal {

        @Metadata
        public static final class DefaultImpls {
        }

        float a() {
            return Dp.m((float) 0);
        }

        void c(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);
    }

    @Metadata
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        @Metadata
        public static final class DefaultImpls {
        }

        float a() {
            return Dp.m((float) 0);
        }
    }

    @Metadata
    public static final class SpacedAligned implements HorizontalOrVertical {

        /* renamed from: a  reason: collision with root package name */
        public final float f3762a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3763b;

        /* renamed from: c  reason: collision with root package name */
        public final Function2 f3764c;

        /* renamed from: d  reason: collision with root package name */
        public final float f3765d;

        public /* synthetic */ SpacedAligned(float f2, boolean z2, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f2, z2, function2);
        }

        public float a() {
            return this.f3765d;
        }

        public void b(Density density, int i2, int[] iArr, int[] iArr2) {
            c(density, i2, iArr, LayoutDirection.Ltr, iArr2);
        }

        public void c(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i3;
            int i4;
            if (iArr.length != 0) {
                int P1 = density.P1(this.f3762a);
                boolean z2 = this.f3763b && layoutDirection == LayoutDirection.Rtl;
                Arrangement arrangement = Arrangement.f3739a;
                if (!z2) {
                    int length = iArr.length;
                    int i5 = 0;
                    i4 = 0;
                    i3 = 0;
                    int i6 = 0;
                    while (i5 < length) {
                        int i7 = iArr[i5];
                        int min = Math.min(i4, i2 - i7);
                        iArr2[i6] = min;
                        int min2 = Math.min(P1, (i2 - min) - i7);
                        int i8 = iArr2[i6] + i7 + min2;
                        i5++;
                        i6++;
                        int i9 = i8;
                        i3 = min2;
                        i4 = i9;
                    }
                } else {
                    int length2 = iArr.length - 1;
                    int i10 = 0;
                    int i11 = 0;
                    while (-1 < length2) {
                        int i12 = iArr[length2];
                        int min3 = Math.min(i4, i2 - i12);
                        iArr2[length2] = min3;
                        int min4 = Math.min(P1, (i2 - min3) - i12);
                        length2--;
                        int i13 = iArr2[length2] + i12 + min4;
                        i11 = min4;
                        i10 = i13;
                    }
                }
                int i14 = i4 - i3;
                Function2 function2 = this.f3764c;
                if (function2 != null && i14 < i2) {
                    int intValue = ((Number) function2.m(Integer.valueOf(i2 - i14), layoutDirection)).intValue();
                    int length3 = iArr2.length;
                    for (int i15 = 0; i15 < length3; i15++) {
                        iArr2[i15] = iArr2[i15] + intValue;
                    }
                }
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) obj;
            return Dp.o(this.f3762a, spacedAligned.f3762a) && this.f3763b == spacedAligned.f3763b && Intrinsics.d(this.f3764c, spacedAligned.f3764c);
        }

        public int hashCode() {
            int p2 = ((Dp.p(this.f3762a) * 31) + Boolean.hashCode(this.f3763b)) * 31;
            Function2 function2 = this.f3764c;
            return p2 + (function2 == null ? 0 : function2.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3763b ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append(Dp.r(this.f3762a));
            sb.append(", ");
            sb.append(this.f3764c);
            sb.append(')');
            return sb.toString();
        }

        public SpacedAligned(float f2, boolean z2, Function2 function2) {
            this.f3762a = f2;
            this.f3763b = z2;
            this.f3764c = function2;
            this.f3765d = f2;
        }
    }

    @Metadata
    public interface Vertical {

        @Metadata
        public static final class DefaultImpls {
        }

        float a() {
            return Dp.m((float) 0);
        }

        void b(Density density, int i2, int[] iArr, int[] iArr2);
    }

    public final Vertical a() {
        return f3743e;
    }

    public final HorizontalOrVertical b() {
        return f3744f;
    }

    public final Horizontal c() {
        return f3741c;
    }

    public final HorizontalOrVertical d() {
        return f3746h;
    }

    public final HorizontalOrVertical e() {
        return f3745g;
    }

    public final Horizontal f() {
        return f3740b;
    }

    public final Vertical g() {
        return f3742d;
    }

    public final void h(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = ((float) (i2 - i4)) / ((float) 2);
        if (!z2) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += (float) i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i8 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += (float) i8;
            } else {
                return;
            }
        }
    }

    public final void i(int[] iArr, int[] iArr2, boolean z2) {
        int i2 = 0;
        if (!z2) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i6 = iArr[length2];
                iArr2[length2] = i2;
                i2 += i6;
            } else {
                return;
            }
        }
    }

    public final void j(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int i6 = i2 - i4;
        if (!z2) {
            int length = iArr.length;
            int i7 = 0;
            while (i3 < length) {
                int i8 = iArr[i3];
                iArr2[i7] = i6;
                i6 += i8;
                i3++;
                i7++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i9 = iArr[length2];
                iArr2[length2] = i6;
                i6 += i9;
            } else {
                return;
            }
        }
    }

    public final void k(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = !(iArr.length == 0) ? ((float) (i2 - i4)) / ((float) iArr.length) : 0.0f;
        float f2 = length / ((float) 2);
        if (!z2) {
            int length2 = iArr.length;
            int i6 = 0;
            while (i3 < length2) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += ((float) i7) + length;
                i3++;
                i6++;
            }
            return;
        }
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i8 = iArr[length3];
            iArr2[length3] = Math.round(f2);
            f2 += ((float) i8) + length;
        }
    }

    public final void l(int i2, int[] iArr, int[] iArr2, boolean z2) {
        if (iArr.length != 0) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 : iArr) {
                i4 += i5;
            }
            float max = ((float) (i2 - i4)) / ((float) Math.max(ArraysKt.k0(iArr), 1));
            float f2 = (!z2 || iArr.length != 1) ? 0.0f : max;
            if (!z2) {
                int length = iArr.length;
                int i6 = 0;
                while (i3 < length) {
                    int i7 = iArr[i3];
                    iArr2[i6] = Math.round(f2);
                    f2 += ((float) i7) + max;
                    i3++;
                    i6++;
                }
                return;
            }
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i8 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += ((float) i8) + max;
            }
        }
    }

    public final void m(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = ((float) (i2 - i4)) / ((float) (iArr.length + 1));
        if (!z2) {
            int length2 = iArr.length;
            float f2 = length;
            int i6 = 0;
            while (i3 < length2) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += ((float) i7) + length;
                i3++;
                i6++;
            }
            return;
        }
        float f3 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i8 = iArr[length3];
            iArr2[length3] = Math.round(f3);
            f3 += ((float) i8) + length;
        }
    }

    public final HorizontalOrVertical n(float f2) {
        return new SpacedAligned(f2, true, Arrangement$spacedBy$1.f3768z, (DefaultConstructorMarker) null);
    }

    public final Horizontal o(float f2, Alignment.Horizontal horizontal) {
        return new SpacedAligned(f2, true, new Arrangement$spacedBy$2(horizontal), (DefaultConstructorMarker) null);
    }

    public final Vertical p(float f2, Alignment.Vertical vertical) {
        return new SpacedAligned(f2, false, new Arrangement$spacedBy$3(vertical), (DefaultConstructorMarker) null);
    }
}
