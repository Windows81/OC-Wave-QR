package com.hansecom.abt.ui.components.quickSelectionButton;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.util.formatters.CurrencyValueFormater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class QuickSelectionGridKt {
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.Object r20, kotlinx.collections.immutable.PersistentList r21, kotlin.jvm.functions.Function1 r22, androidx.compose.ui.Modifier r23, boolean r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r26
            java.lang.String r0 = "selectedValue"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            java.lang.String r0 = "values"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "onValueClick"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            r0 = -503243694(0xffffffffe2011c52, float:-5.954177E20)
            r1 = r25
            androidx.compose.runtime.Composer r15 = r1.q(r0)
            r1 = r27 & 1
            if (r1 == 0) goto L_0x0027
            r1 = r10 | 6
            goto L_0x0040
        L_0x0027:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x003f
            r1 = r10 & 8
            if (r1 != 0) goto L_0x0034
            boolean r1 = r15.W(r7)
            goto L_0x0038
        L_0x0034:
            boolean r1 = r15.l(r7)
        L_0x0038:
            if (r1 == 0) goto L_0x003c
            r1 = 4
            goto L_0x003d
        L_0x003c:
            r1 = 2
        L_0x003d:
            r1 = r1 | r10
            goto L_0x0040
        L_0x003f:
            r1 = r10
        L_0x0040:
            r2 = r27 & 2
            if (r2 == 0) goto L_0x0047
            r1 = r1 | 48
            goto L_0x0060
        L_0x0047:
            r2 = r10 & 48
            if (r2 != 0) goto L_0x0060
            r2 = r10 & 64
            if (r2 != 0) goto L_0x0054
            boolean r2 = r15.W(r8)
            goto L_0x0058
        L_0x0054:
            boolean r2 = r15.l(r8)
        L_0x0058:
            if (r2 == 0) goto L_0x005d
            r2 = 32
            goto L_0x005f
        L_0x005d:
            r2 = 16
        L_0x005f:
            r1 = r1 | r2
        L_0x0060:
            r2 = r27 & 4
            if (r2 == 0) goto L_0x0067
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0077
        L_0x0067:
            r2 = r10 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0077
            boolean r2 = r15.l(r9)
            if (r2 == 0) goto L_0x0074
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0076
        L_0x0074:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0076:
            r1 = r1 | r2
        L_0x0077:
            r2 = r27 & 8
            if (r2 == 0) goto L_0x0080
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x007d:
            r3 = r23
            goto L_0x0092
        L_0x0080:
            r3 = r10 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x007d
            r3 = r23
            boolean r4 = r15.W(r3)
            if (r4 == 0) goto L_0x008f
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0091
        L_0x008f:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0091:
            r1 = r1 | r4
        L_0x0092:
            r4 = r27 & 16
            if (r4 == 0) goto L_0x009c
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0098:
            r5 = r24
        L_0x009a:
            r11 = r1
            goto L_0x00af
        L_0x009c:
            r5 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0098
            r5 = r24
            boolean r6 = r15.d(r5)
            if (r6 == 0) goto L_0x00ab
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ad
        L_0x00ab:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x00ad:
            r1 = r1 | r6
            goto L_0x009a
        L_0x00af:
            r1 = r11 & 9363(0x2493, float:1.312E-41)
            r6 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r6) goto L_0x00c2
            boolean r1 = r15.t()
            if (r1 != 0) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            r15.B()
            r4 = r3
            r1 = r15
            goto L_0x0123
        L_0x00c2:
            if (r2 == 0) goto L_0x00c9
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r18 = r1
            goto L_0x00cb
        L_0x00c9:
            r18 = r3
        L_0x00cb:
            r12 = 1
            if (r4 == 0) goto L_0x00d1
            r19 = r12
            goto L_0x00d3
        L_0x00d1:
            r19 = r5
        L_0x00d3:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00df
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.ui.components.quickSelectionButton.QuickSelectionGrid (QuickSelectionGrid.kt:36)"
            androidx.compose.runtime.ComposerKt.Y(r0, r11, r1, r2)
        L_0x00df:
            r0 = 58
            float r0 = (float) r0
            float r1 = androidx.compose.ui.unit.Dp.m(r0)
            r0 = 12
            float r0 = (float) r0
            float r2 = androidx.compose.ui.unit.Dp.m(r0)
            com.hansecom.abt.ui.components.quickSelectionButton.QuickSelectionGridKt$QuickSelectionGrid$1 r13 = new com.hansecom.abt.ui.components.quickSelectionButton.QuickSelectionGridKt$QuickSelectionGrid$1
            r0 = r13
            r3 = r21
            r4 = r20
            r5 = r22
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 54
            r1 = 1189111740(0x46e067bc, float:28723.867)
            androidx.compose.runtime.internal.ComposableLambda r14 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r12, r13, r15, r0)
            int r0 = r11 >> 9
            r0 = r0 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r17 = 6
            r12 = 0
            r13 = 0
            r11 = r18
            r1 = r15
            r16 = r0
            androidx.compose.foundation.layout.BoxWithConstraintsKt.a(r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x011f
            androidx.compose.runtime.ComposerKt.X()
        L_0x011f:
            r4 = r18
            r5 = r19
        L_0x0123:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x013c
            com.hansecom.abt.ui.components.quickSelectionButton.g r12 = new com.hansecom.abt.ui.components.quickSelectionButton.g
            r0 = r12
            r1 = r20
            r2 = r21
            r3 = r22
            r6 = r26
            r7 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11.a(r12)
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.quickSelectionButton.QuickSelectionGridKt.b(java.lang.Object, kotlinx.collections.immutable.PersistentList, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(Object obj, PersistentList persistentList, Function1 function1, Modifier modifier, boolean z2, int i2, int i3, Composer composer, int i4) {
        b(obj, persistentList, function1, modifier, z2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final String e(Object obj) {
        return obj instanceof String ? CurrencyValueFormater.f39045a.b((String) obj, false) : obj instanceof Number ? CurrencyValueFormater.f39045a.a((Number) obj, false) : obj.toString();
    }
}
