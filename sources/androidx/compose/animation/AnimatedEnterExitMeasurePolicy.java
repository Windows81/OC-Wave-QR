package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final AnimatedVisibilityScopeImpl f2096a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2097b;

    public AnimatedEnterExitMeasurePolicy(AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl) {
        this.f2096a = animatedVisibilityScopeImpl;
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Placeable c0 = ((Measurable) list.get(i4)).c0(j2);
            i2 = Math.max(i2, c0.L0());
            i3 = Math.max(i3, c0.C0());
            arrayList.add(c0);
        }
        if (measureScope.w1()) {
            this.f2097b = true;
            this.f2096a.a().setValue(IntSize.b(IntSize.c((4294967295L & ((long) i3)) | (((long) i2) << 32))));
        } else if (!this.f2097b) {
            this.f2096a.a().setValue(IntSize.b(IntSize.c((4294967295L & ((long) i3)) | (((long) i2) << 32))));
        }
        return MeasureScope.R1(measureScope, i2, i3, (Map) null, new AnimatedEnterExitMeasurePolicy$measure$1(arrayList), 4, (Object) null);
    }

    public int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int a0 = ((IntrinsicMeasurable) list.get(0)).a0(i2);
        int o2 = CollectionsKt.o(list);
        int i3 = 1;
        if (1 <= o2) {
            while (true) {
                int a02 = ((IntrinsicMeasurable) list.get(i3)).a0(i2);
                if (a02 > a0) {
                    a0 = a02;
                }
                if (i3 == o2) {
                    break;
                }
                i3++;
            }
        }
        return a0;
    }

    public int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int q0 = ((IntrinsicMeasurable) list.get(0)).q0(i2);
        int o2 = CollectionsKt.o(list);
        int i3 = 1;
        if (1 <= o2) {
            while (true) {
                int q02 = ((IntrinsicMeasurable) list.get(i3)).q0(i2);
                if (q02 > q0) {
                    q0 = q02;
                }
                if (i3 == o2) {
                    break;
                }
                i3++;
            }
        }
        return q0;
    }

    public int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int Z = ((IntrinsicMeasurable) list.get(0)).Z(i2);
        int o2 = CollectionsKt.o(list);
        int i3 = 1;
        if (1 <= o2) {
            while (true) {
                int Z2 = ((IntrinsicMeasurable) list.get(i3)).Z(i2);
                if (Z2 > Z) {
                    Z = Z2;
                }
                if (i3 == o2) {
                    break;
                }
                i3++;
            }
        }
        return Z;
    }

    public int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int C = ((IntrinsicMeasurable) list.get(0)).C(i2);
        int o2 = CollectionsKt.o(list);
        int i3 = 1;
        if (1 <= o2) {
            while (true) {
                int C2 = ((IntrinsicMeasurable) list.get(i3)).C(i2);
                if (C2 > C) {
                    C = C2;
                }
                if (i3 == o2) {
                    break;
                }
                i3++;
            }
        }
        return C;
    }
}
