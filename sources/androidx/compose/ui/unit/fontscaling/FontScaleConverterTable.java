package androidx.compose.ui.unit.fontscaling;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FontScaleConverterTable implements FontScaleConverter {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f19194c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f19195d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final float[] f19196a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f19197b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float b(float f2, float[] fArr, float[] fArr2) {
            float f3;
            float f4;
            float f5;
            float a2;
            float abs = Math.abs(f2);
            float signum = Math.signum(f2);
            int binarySearch = Arrays.binarySearch(fArr, abs);
            if (binarySearch >= 0) {
                a2 = fArr2[binarySearch];
            } else {
                int i2 = -(binarySearch + 1);
                int i3 = i2 - 1;
                float f6 = 0.0f;
                if (i3 >= fArr.length - 1) {
                    float f7 = fArr[fArr.length - 1];
                    float f8 = fArr2[fArr.length - 1];
                    if (f7 == 0.0f) {
                        return 0.0f;
                    }
                    return f2 * (f8 / f7);
                }
                if (i3 == -1) {
                    float f9 = fArr[0];
                    f4 = fArr2[0];
                    f3 = f9;
                    f5 = 0.0f;
                } else {
                    float f10 = fArr[i3];
                    float f11 = fArr[i2];
                    f5 = fArr2[i3];
                    f6 = f10;
                    f3 = f11;
                    f4 = fArr2[i2];
                }
                a2 = MathUtils.f19198a.a(f5, f4, f6, f3, abs);
            }
            return signum * a2;
        }

        public Companion() {
        }
    }

    public FontScaleConverterTable(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f19196a = fArr;
        this.f19197b = fArr2;
    }

    public float a(float f2) {
        return f19194c.b(f2, this.f19197b, this.f19196a);
    }

    public float b(float f2) {
        return f19194c.b(f2, this.f19196a, this.f19197b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FontScaleConverterTable)) {
            return false;
        }
        FontScaleConverterTable fontScaleConverterTable = (FontScaleConverterTable) obj;
        return Arrays.equals(this.f19196a, fontScaleConverterTable.f19196a) && Arrays.equals(this.f19197b, fontScaleConverterTable.f19197b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f19196a) * 31) + Arrays.hashCode(this.f19197b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f19196a);
        Intrinsics.h(arrays, "toString(...)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f19197b);
        Intrinsics.h(arrays2, "toString(...)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
