package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;

@Metadata
public final class ColumnKt {

    /* renamed from: a  reason: collision with root package name */
    public static final MeasurePolicy f3809a = new ColumnMeasurePolicy(Arrangement.f3739a.g(), Alignment.f15444a.k());

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: androidx.compose.ui.layout.MeasurePolicy} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.layout.MeasurePolicy a(androidx.compose.foundation.layout.Arrangement.Vertical r5, androidx.compose.ui.Alignment.Horizontal r6, androidx.compose.runtime.Composer r7, int r8) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:108)"
            r2 = 1089876336(0x40f63170, float:7.693535)
            androidx.compose.runtime.ComposerKt.Y(r2, r8, r0, r1)
        L_0x000f:
            androidx.compose.foundation.layout.Arrangement r0 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r0 = r0.g()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r5, r0)
            if (r0 == 0) goto L_0x0033
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r0 = r0.k()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r6, r0)
            if (r0 == 0) goto L_0x0033
            r5 = 346089448(0x14a0e7e8, float:1.6247342E-26)
            r7.X(r5)
            r7.M()
            androidx.compose.ui.layout.MeasurePolicy r5 = f3809a
            goto L_0x0080
        L_0x0033:
            r0 = 346143295(0x14a1ba3f, float:1.6330307E-26)
            r7.X(r0)
            r0 = r8 & 14
            r0 = r0 ^ 6
            r1 = 0
            r2 = 1
            r3 = 4
            if (r0 <= r3) goto L_0x0048
            boolean r0 = r7.W(r5)
            if (r0 != 0) goto L_0x004c
        L_0x0048:
            r0 = r8 & 6
            if (r0 != r3) goto L_0x004e
        L_0x004c:
            r0 = r2
            goto L_0x004f
        L_0x004e:
            r0 = r1
        L_0x004f:
            r3 = r8 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r4 = 32
            if (r3 <= r4) goto L_0x005d
            boolean r3 = r7.W(r6)
            if (r3 != 0) goto L_0x0061
        L_0x005d:
            r8 = r8 & 48
            if (r8 != r4) goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            r8 = r0 | r1
            java.lang.Object r0 = r7.g()
            if (r8 != 0) goto L_0x0072
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r0 != r8) goto L_0x007a
        L_0x0072:
            androidx.compose.foundation.layout.ColumnMeasurePolicy r0 = new androidx.compose.foundation.layout.ColumnMeasurePolicy
            r0.<init>(r5, r6)
            r7.N(r0)
        L_0x007a:
            r5 = r0
            androidx.compose.foundation.layout.ColumnMeasurePolicy r5 = (androidx.compose.foundation.layout.ColumnMeasurePolicy) r5
            r7.M()
        L_0x0080:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0089
            androidx.compose.runtime.ComposerKt.X()
        L_0x0089:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.ColumnKt.a(androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MeasurePolicy");
    }

    public static final long b(boolean z2, int i2, int i3, int i4, int i5) {
        return !z2 ? ConstraintsKt.a(i3, i5, i2, i4) : Constraints.f19137b.a(i3, i5, i2, i4);
    }
}
