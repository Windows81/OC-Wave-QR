package androidx.compose.material;

import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.Metadata;

@Metadata
public final class AlertDialogKt$AlertDialogBaselineLayout$2 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final AlertDialogKt$AlertDialogBaselineLayout$2 f7046a = new AlertDialogKt$AlertDialogBaselineLayout$2();

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.layout.MeasureResult b(androidx.compose.ui.layout.MeasureScope r17, java.util.List r18, long r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.size()
            r3 = 0
            r4 = r3
        L_0x000a:
            r5 = 0
            if (r4 >= r2) goto L_0x0024
            java.lang.Object r6 = r1.get(r4)
            r7 = r6
            androidx.compose.ui.layout.Measurable r7 = (androidx.compose.ui.layout.Measurable) r7
            java.lang.Object r7 = androidx.compose.ui.layout.LayoutIdKt.a(r7)
            java.lang.String r8 = "title"
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r8)
            if (r7 == 0) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x0024:
            r6 = r5
        L_0x0025:
            androidx.compose.ui.layout.Measurable r6 = (androidx.compose.ui.layout.Measurable) r6
            if (r6 == 0) goto L_0x003b
            r13 = 11
            r14 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r7 = r19
            long r7 = androidx.compose.ui.unit.Constraints.d(r7, r9, r10, r11, r12, r13, r14)
            androidx.compose.ui.layout.Placeable r2 = r6.c0(r7)
            goto L_0x003c
        L_0x003b:
            r2 = r5
        L_0x003c:
            int r4 = r18.size()
            r6 = r3
        L_0x0041:
            if (r6 >= r4) goto L_0x005a
            java.lang.Object r7 = r1.get(r6)
            r8 = r7
            androidx.compose.ui.layout.Measurable r8 = (androidx.compose.ui.layout.Measurable) r8
            java.lang.Object r8 = androidx.compose.ui.layout.LayoutIdKt.a(r8)
            java.lang.String r9 = "text"
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r9)
            if (r8 == 0) goto L_0x0057
            goto L_0x005b
        L_0x0057:
            int r6 = r6 + 1
            goto L_0x0041
        L_0x005a:
            r7 = r5
        L_0x005b:
            androidx.compose.ui.layout.Measurable r7 = (androidx.compose.ui.layout.Measurable) r7
            if (r7 == 0) goto L_0x0071
            r14 = 11
            r15 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r8 = r19
            long r8 = androidx.compose.ui.unit.Constraints.d(r8, r10, r11, r12, r13, r14, r15)
            androidx.compose.ui.layout.Placeable r1 = r7.c0(r8)
            goto L_0x0072
        L_0x0071:
            r1 = r5
        L_0x0072:
            if (r2 == 0) goto L_0x0079
            int r4 = r2.L0()
            goto L_0x007a
        L_0x0079:
            r4 = r3
        L_0x007a:
            if (r1 == 0) goto L_0x0081
            int r6 = r1.L0()
            goto L_0x0082
        L_0x0081:
            r6 = r3
        L_0x0082:
            int r4 = java.lang.Math.max(r4, r6)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x00a9
            androidx.compose.ui.layout.HorizontalAlignmentLine r7 = androidx.compose.ui.layout.AlignmentLineKt.a()
            int r7 = r2.f0(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r7 = r7.intValue()
            if (r7 != r6) goto L_0x009e
            r7 = r5
            goto L_0x00a2
        L_0x009e:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
        L_0x00a2:
            if (r7 == 0) goto L_0x00a9
            int r7 = r7.intValue()
            goto L_0x00aa
        L_0x00a9:
            r7 = r3
        L_0x00aa:
            if (r2 == 0) goto L_0x00c3
            androidx.compose.ui.layout.HorizontalAlignmentLine r8 = androidx.compose.ui.layout.AlignmentLineKt.b()
            int r8 = r2.f0(r8)
            if (r8 != r6) goto L_0x00b8
            r8 = r5
            goto L_0x00bc
        L_0x00b8:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
        L_0x00bc:
            if (r8 == 0) goto L_0x00c3
            int r8 = r8.intValue()
            goto L_0x00c4
        L_0x00c3:
            r8 = r3
        L_0x00c4:
            long r9 = androidx.compose.material.AlertDialogKt.f7043c
            int r9 = r0.K1(r9)
            int r9 = r9 - r7
            if (r1 == 0) goto L_0x00e5
            androidx.compose.ui.layout.HorizontalAlignmentLine r7 = androidx.compose.ui.layout.AlignmentLineKt.a()
            int r7 = r1.f0(r7)
            if (r7 != r6) goto L_0x00da
            goto L_0x00de
        L_0x00da:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
        L_0x00de:
            if (r5 == 0) goto L_0x00e5
            int r5 = r5.intValue()
            goto L_0x00e6
        L_0x00e5:
            r5 = r3
        L_0x00e6:
            if (r2 != 0) goto L_0x00f1
            long r6 = androidx.compose.material.AlertDialogKt.f7045e
            int r6 = r0.K1(r6)
            goto L_0x00f9
        L_0x00f1:
            long r6 = androidx.compose.material.AlertDialogKt.f7044d
            int r6 = r0.K1(r6)
        L_0x00f9:
            if (r2 == 0) goto L_0x0101
            int r7 = r2.C0()
            int r7 = r7 + r9
            goto L_0x0102
        L_0x0101:
            r7 = r3
        L_0x0102:
            if (r2 != 0) goto L_0x0107
            int r10 = r6 - r5
            goto L_0x0111
        L_0x0107:
            if (r8 != 0) goto L_0x010d
            int r10 = r7 - r5
        L_0x010b:
            int r10 = r10 + r6
            goto L_0x0111
        L_0x010d:
            int r10 = r9 + r8
            int r10 = r10 - r5
            goto L_0x010b
        L_0x0111:
            if (r1 == 0) goto L_0x012b
            if (r8 != 0) goto L_0x011c
            int r3 = r1.C0()
            int r3 = r3 + r6
            int r3 = r3 - r5
            goto L_0x012b
        L_0x011c:
            int r11 = r1.C0()
            int r11 = r11 + r6
            int r11 = r11 - r5
            if (r2 == 0) goto L_0x0128
            int r3 = r2.C0()
        L_0x0128:
            int r3 = r3 - r8
            int r11 = r11 - r3
            r3 = r11
        L_0x012b:
            int r3 = r3 + r7
            androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1 r5 = new androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1
            r5.<init>(r2, r9, r1, r10)
            r6 = 4
            r7 = 0
            r8 = 0
            r0 = r17
            r1 = r4
            r2 = r3
            r3 = r8
            r4 = r5
            r5 = r6
            r6 = r7
            androidx.compose.ui.layout.MeasureResult r0 = androidx.compose.ui.layout.MeasureScope.R1(r0, r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2.b(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
    }
}
