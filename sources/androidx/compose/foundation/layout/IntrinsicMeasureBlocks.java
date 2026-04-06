package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class IntrinsicMeasureBlocks {

    /* renamed from: a  reason: collision with root package name */
    public static final IntrinsicMeasureBlocks f4066a = new IntrinsicMeasureBlocks();

    public final int a(List list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i3, i2);
        Collection collection = list;
        int size = collection.size();
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i5);
            float e2 = RowColumnImplKt.e(RowColumnImplKt.c(intrinsicMeasurable));
            if (e2 == 0.0f) {
                int min2 = Math.min(intrinsicMeasurable.a0(Integer.MAX_VALUE), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - min);
                min += min2;
                i4 = Math.max(i4, intrinsicMeasurable.C(min2));
            } else if (e2 > 0.0f) {
                f2 += e2;
            }
        }
        int round = f2 == 0.0f ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(((float) Math.max(i2 - min, 0)) / f2);
        int size2 = collection.size();
        for (int i6 = 0; i6 < size2; i6++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i6);
            float e3 = RowColumnImplKt.e(RowColumnImplKt.c(intrinsicMeasurable2));
            if (e3 > 0.0f) {
                i4 = Math.max(i4, intrinsicMeasurable2.C(round != Integer.MAX_VALUE ? Math.round(((float) round) * e3) : Integer.MAX_VALUE));
            }
        }
        return i4;
    }

    public final int b(List list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        float f2 = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i6);
            float e2 = RowColumnImplKt.e(RowColumnImplKt.c(intrinsicMeasurable));
            int a0 = intrinsicMeasurable.a0(i2);
            if (e2 == 0.0f) {
                i5 += a0;
            } else if (e2 > 0.0f) {
                f2 += e2;
                i4 = Math.max(i4, Math.round(((float) a0) / e2));
            }
        }
        return Math.round(((float) i4) * f2) + i5 + ((list.size() - 1) * i3);
    }

    public final int c(List list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i3, i2);
        Collection collection = list;
        int size = collection.size();
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i5);
            float e2 = RowColumnImplKt.e(RowColumnImplKt.c(intrinsicMeasurable));
            if (e2 == 0.0f) {
                int min2 = Math.min(intrinsicMeasurable.a0(Integer.MAX_VALUE), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - min);
                min += min2;
                i4 = Math.max(i4, intrinsicMeasurable.q0(min2));
            } else if (e2 > 0.0f) {
                f2 += e2;
            }
        }
        int round = f2 == 0.0f ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(((float) Math.max(i2 - min, 0)) / f2);
        int size2 = collection.size();
        for (int i6 = 0; i6 < size2; i6++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i6);
            float e3 = RowColumnImplKt.e(RowColumnImplKt.c(intrinsicMeasurable2));
            if (e3 > 0.0f) {
                i4 = Math.max(i4, intrinsicMeasurable2.q0(round != Integer.MAX_VALUE ? Math.round(((float) round) * e3) : Integer.MAX_VALUE));
            }
        }
        return i4;
    }

    public final int d(List list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        float f2 = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i6);
            float e2 = RowColumnImplKt.e(RowColumnImplKt.c(intrinsicMeasurable));
            int Z = intrinsicMeasurable.Z(i2);
            if (e2 == 0.0f) {
                i5 += Z;
            } else if (e2 > 0.0f) {
                f2 += e2;
                i4 = Math.max(i4, Math.round(((float) Z) / e2));
            }
        }
        return Math.round(((float) i4) * f2) + i5 + ((list.size() - 1) * i3);
    }

    public final int e(List list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        float f2 = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i6);
            float e2 = RowColumnImplKt.e(RowColumnImplKt.c(intrinsicMeasurable));
            int C = intrinsicMeasurable.C(i2);
            if (e2 == 0.0f) {
                i5 += C;
            } else if (e2 > 0.0f) {
                f2 += e2;
                i4 = Math.max(i4, Math.round(((float) C) / e2));
            }
        }
        return Math.round(((float) i4) * f2) + i5 + ((list.size() - 1) * i3);
    }

    public final int f(List list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i3, i2);
        Collection collection = list;
        int size = collection.size();
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i5);
            float e2 = RowColumnImplKt.e(RowColumnImplKt.c(intrinsicMeasurable));
            if (e2 == 0.0f) {
                int min2 = Math.min(intrinsicMeasurable.C(Integer.MAX_VALUE), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - min);
                min += min2;
                i4 = Math.max(i4, intrinsicMeasurable.a0(min2));
            } else if (e2 > 0.0f) {
                f2 += e2;
            }
        }
        int round = f2 == 0.0f ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(((float) Math.max(i2 - min, 0)) / f2);
        int size2 = collection.size();
        for (int i6 = 0; i6 < size2; i6++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i6);
            float e3 = RowColumnImplKt.e(RowColumnImplKt.c(intrinsicMeasurable2));
            if (e3 > 0.0f) {
                i4 = Math.max(i4, intrinsicMeasurable2.a0(round != Integer.MAX_VALUE ? Math.round(((float) round) * e3) : Integer.MAX_VALUE));
            }
        }
        return i4;
    }

    public final int g(List list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        float f2 = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i6);
            float e2 = RowColumnImplKt.e(RowColumnImplKt.c(intrinsicMeasurable));
            int q0 = intrinsicMeasurable.q0(i2);
            if (e2 == 0.0f) {
                i5 += q0;
            } else if (e2 > 0.0f) {
                f2 += e2;
                i4 = Math.max(i4, Math.round(((float) q0) / e2));
            }
        }
        return Math.round(((float) i4) * f2) + i5 + ((list.size() - 1) * i3);
    }

    public final int h(List list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i3, i2);
        Collection collection = list;
        int size = collection.size();
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i5);
            float e2 = RowColumnImplKt.e(RowColumnImplKt.c(intrinsicMeasurable));
            if (e2 == 0.0f) {
                int min2 = Math.min(intrinsicMeasurable.C(Integer.MAX_VALUE), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - min);
                min += min2;
                i4 = Math.max(i4, intrinsicMeasurable.Z(min2));
            } else if (e2 > 0.0f) {
                f2 += e2;
            }
        }
        int round = f2 == 0.0f ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(((float) Math.max(i2 - min, 0)) / f2);
        int size2 = collection.size();
        for (int i6 = 0; i6 < size2; i6++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i6);
            float e3 = RowColumnImplKt.e(RowColumnImplKt.c(intrinsicMeasurable2));
            if (e3 > 0.0f) {
                i4 = Math.max(i4, intrinsicMeasurable2.Z(round != Integer.MAX_VALUE ? Math.round(((float) round) * e3) : Integer.MAX_VALUE));
            }
        }
        return i4;
    }
}
