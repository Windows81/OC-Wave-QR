package androidx.compose.ui.graphics;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class AndroidShader_androidKt {
    public static final Shader a(long j2, long j3, List list, List list2, int i2) {
        List list3 = list;
        g(list, list2);
        int d2 = d(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)), e(list, d2), f(list2, list, d2), AndroidTileMode_androidKt.a(i2));
    }

    public static final Shader b(long j2, float f2, List list, List list2, int i2) {
        g(list, list2);
        int d2 = d(list);
        return new RadialGradient(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f2, e(list, d2), f(list2, list, d2), AndroidTileMode_androidKt.a(i2));
    }

    public static final Shader c(long j2, List list, List list2) {
        g(list, list2);
        int d2 = d(list);
        return new SweepGradient(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), e(list, d2), f(list2, list, d2));
    }

    public static final int d(List list) {
        return 0;
    }

    public static final int[] e(List list, int i2) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ColorKt.j(((Color) list.get(i3)).v());
        }
        return iArr;
    }

    public static final float[] f(List list, List list2, int i2) {
        if (i2 != 0) {
            float[] fArr = new float[(list2.size() + i2)];
            fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
            int o2 = CollectionsKt.o(list2);
            int i3 = 1;
            for (int i4 = 1; i4 < o2; i4++) {
                long v2 = ((Color) list2.get(i4)).v();
                float floatValue = list != null ? ((Number) list.get(i4)).floatValue() : ((float) i4) / ((float) CollectionsKt.o(list2));
                int i5 = i3 + 1;
                fArr[i3] = floatValue;
                if (Color.o(v2) == 0.0f) {
                    i3 += 2;
                    fArr[i5] = floatValue;
                } else {
                    i3 = i5;
                }
            }
            fArr[i3] = list != null ? ((Number) list.get(CollectionsKt.o(list2))).floatValue() : 1.0f;
            return fArr;
        } else if (list != null) {
            return CollectionsKt.J0(list);
        } else {
            return null;
        }
    }

    public static final void g(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
