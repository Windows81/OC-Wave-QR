package com.hansecom.abt.ui.components.formFields;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.input.VisualTransformation;
import com.hansecom.abt.util.formatters.CurrencyValueFormater;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ValueFieldKt {

    /* renamed from: a  reason: collision with root package name */
    public static final char f38341a = new DecimalFormatSymbols(Locale.US).getDecimalSeparator();

    /* renamed from: b  reason: collision with root package name */
    public static final int f38342b = CurrencyValueFormater.f39045a.e().getDefaultFractionDigits();

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r79, kotlin.jvm.functions.Function1 r80, androidx.compose.ui.Modifier r81, java.lang.String r82, java.lang.String r83, boolean r84, androidx.compose.ui.text.input.VisualTransformation r85, androidx.compose.ui.focus.FocusRequester r86, int r87, boolean r88, androidx.compose.runtime.Composer r89, int r90, int r91) {
        /*
            r10 = r79
            r11 = r80
            r12 = r90
            r13 = r91
            r14 = 8
            r0 = 128(0x80, float:1.794E-43)
            r1 = 16
            r2 = 2
            r3 = 4
            r15 = 6
            r4 = 256(0x100, float:3.59E-43)
            r5 = 32
            java.lang.String r6 = "value"
            kotlin.jvm.internal.Intrinsics.i(r10, r6)
            java.lang.String r6 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.i(r11, r6)
            r6 = 1560075652(0x5cfcdd84, float:5.69402025E17)
            r7 = r89
            androidx.compose.runtime.Composer r9 = r7.q(r6)
            r8 = 1
            r7 = r13 & 1
            if (r7 == 0) goto L_0x0030
            r7 = r12 | 6
            goto L_0x0040
        L_0x0030:
            r7 = r12 & 6
            if (r7 != 0) goto L_0x003f
            boolean r7 = r9.W(r10)
            if (r7 == 0) goto L_0x003c
            r7 = r3
            goto L_0x003d
        L_0x003c:
            r7 = r2
        L_0x003d:
            r7 = r7 | r12
            goto L_0x0040
        L_0x003f:
            r7 = r12
        L_0x0040:
            r2 = r2 & r13
            if (r2 == 0) goto L_0x0046
            r7 = r7 | 48
            goto L_0x0054
        L_0x0046:
            r2 = r12 & 48
            if (r2 != 0) goto L_0x0054
            boolean r2 = r9.l(r11)
            if (r2 == 0) goto L_0x0052
            r2 = r5
            goto L_0x0053
        L_0x0052:
            r2 = r1
        L_0x0053:
            r7 = r7 | r2
        L_0x0054:
            r2 = r13 & 4
            if (r2 == 0) goto L_0x005d
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x005a:
            r3 = r81
            goto L_0x0070
        L_0x005d:
            r3 = r12 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x005a
            r3 = r81
            boolean r16 = r9.W(r3)
            if (r16 == 0) goto L_0x006c
            r16 = r4
            goto L_0x006e
        L_0x006c:
            r16 = r0
        L_0x006e:
            r7 = r7 | r16
        L_0x0070:
            r16 = r13 & 8
            if (r16 == 0) goto L_0x0079
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0076:
            r14 = r82
            goto L_0x008c
        L_0x0079:
            r14 = r12 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x0076
            r14 = r82
            boolean r18 = r9.W(r14)
            if (r18 == 0) goto L_0x0088
            r18 = 2048(0x800, float:2.87E-42)
            goto L_0x008a
        L_0x0088:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x008a:
            r7 = r7 | r18
        L_0x008c:
            r1 = r1 & r13
            if (r1 == 0) goto L_0x0094
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0091:
            r6 = r83
            goto L_0x00a7
        L_0x0094:
            r6 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0091
            r6 = r83
            boolean r19 = r9.W(r6)
            if (r19 == 0) goto L_0x00a3
            r19 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a5
        L_0x00a3:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r7 = r7 | r19
        L_0x00a7:
            r19 = 196608(0x30000, float:2.75506E-40)
            r19 = r12 & r19
            if (r19 != 0) goto L_0x00c1
            r19 = r13 & 32
            r15 = r84
            if (r19 != 0) goto L_0x00bc
            boolean r20 = r9.d(r15)
            if (r20 == 0) goto L_0x00bc
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r7 = r7 | r20
            goto L_0x00c3
        L_0x00c1:
            r15 = r84
        L_0x00c3:
            r20 = 1572864(0x180000, float:2.204052E-39)
            r20 = r12 & r20
            if (r20 != 0) goto L_0x00dd
            r20 = r13 & 64
            r5 = r85
            if (r20 != 0) goto L_0x00d8
            boolean r21 = r9.W(r5)
            if (r21 == 0) goto L_0x00d8
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r7 = r7 | r21
            goto L_0x00df
        L_0x00dd:
            r5 = r85
        L_0x00df:
            r0 = r0 & r13
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e9
            r7 = r7 | r21
            r8 = r86
            goto L_0x00fc
        L_0x00e9:
            r21 = r12 & r21
            r8 = r86
            if (r21 != 0) goto L_0x00fc
            boolean r21 = r9.W(r8)
            if (r21 == 0) goto L_0x00f8
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f8:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r7 = r7 | r21
        L_0x00fc:
            r21 = 100663296(0x6000000, float:2.4074124E-35)
            r21 = r12 & r21
            if (r21 != 0) goto L_0x0118
            r3 = r13 & 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x0111
            r3 = r87
            boolean r21 = r9.i(r3)
            if (r21 == 0) goto L_0x0113
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0115
        L_0x0111:
            r3 = r87
        L_0x0113:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0115:
            r7 = r7 | r21
            goto L_0x011a
        L_0x0118:
            r3 = r87
        L_0x011a:
            r4 = r13 & 512(0x200, float:7.175E-43)
            r22 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x0125
            r7 = r7 | r22
            r3 = r88
            goto L_0x0138
        L_0x0125:
            r22 = r12 & r22
            r3 = r88
            if (r22 != 0) goto L_0x0138
            boolean r22 = r9.d(r3)
            if (r22 == 0) goto L_0x0134
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0136
        L_0x0134:
            r22 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0136:
            r7 = r7 | r22
        L_0x0138:
            r22 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r7 & r22
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r5) goto L_0x015a
            boolean r3 = r9.t()
            if (r3 != 0) goto L_0x0149
            goto L_0x015a
        L_0x0149:
            r9.B()
            r3 = r81
            r7 = r85
            r10 = r88
            r5 = r6
            r4 = r14
            r6 = r15
            r15 = r9
            r9 = r87
            goto L_0x040c
        L_0x015a:
            r9.p()
            r22 = 1
            r3 = r12 & 1
            r23 = -3670017(0xffffffffffc7ffff, float:NaN)
            r24 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r3 == 0) goto L_0x019b
            boolean r3 = r9.J()
            if (r3 == 0) goto L_0x0170
            goto L_0x019b
        L_0x0170:
            r9.B()
            r0 = 32
            r0 = r0 & r13
            if (r0 == 0) goto L_0x017a
            r7 = r7 & r24
        L_0x017a:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0180
            r7 = r7 & r23
        L_0x0180:
            r0 = 256(0x100, float:3.59E-43)
            r0 = r0 & r13
            if (r0 == 0) goto L_0x0189
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r0
        L_0x0189:
            r43 = r85
            r45 = r87
            r46 = r88
            r41 = r6
        L_0x0191:
            r44 = r8
            r42 = r15
        L_0x0195:
            r8 = r7
            r15 = r14
            r14 = r81
            goto L_0x022f
        L_0x019b:
            if (r2 == 0) goto L_0x01a0
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01a2
        L_0x01a0:
            r2 = r81
        L_0x01a2:
            java.lang.String r3 = ""
            if (r16 == 0) goto L_0x01a7
            r14 = r3
        L_0x01a7:
            if (r1 == 0) goto L_0x01ac
        L_0x01a9:
            r1 = 32
            goto L_0x01ae
        L_0x01ac:
            r3 = r6
            goto L_0x01a9
        L_0x01ae:
            r1 = r1 & r13
            if (r1 == 0) goto L_0x01be
            int r1 = r3.length()
            if (r1 <= 0) goto L_0x01ba
            r1 = r22
            goto L_0x01bb
        L_0x01ba:
            r1 = 0
        L_0x01bb:
            r7 = r7 & r24
            r15 = r1
        L_0x01be:
            r1 = r13 & 64
            if (r1 == 0) goto L_0x01d8
            com.hansecom.abt.ui.components.formFields.ValueTransformation r1 = new com.hansecom.abt.ui.components.formFields.ValueTransformation
            com.hansecom.abt.ui.theme.AbtTheme r6 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r5 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r6 = r6.b(r9, r5)
            long r5 = r6.a()
            r81 = r2
            r2 = 0
            r1.<init>(r5, r2)
            r7 = r7 & r23
            goto L_0x01dc
        L_0x01d8:
            r81 = r2
            r1 = r85
        L_0x01dc:
            if (r0 == 0) goto L_0x01fe
            r0 = 1179766199(0x4651cdb7, float:13427.429)
            r9.X(r0)
            java.lang.Object r0 = r9.g()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x01f8
            androidx.compose.ui.focus.FocusRequester r0 = new androidx.compose.ui.focus.FocusRequester
            r0.<init>()
            r9.N(r0)
        L_0x01f8:
            androidx.compose.ui.focus.FocusRequester r0 = (androidx.compose.ui.focus.FocusRequester) r0
            r9.M()
            r8 = r0
        L_0x01fe:
            r0 = 256(0x100, float:3.59E-43)
            r0 = r0 & r13
            if (r0 == 0) goto L_0x0213
            androidx.compose.foundation.text.KeyboardOptions$Companion r0 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r0 = r0.a()
            int r0 = r0.i()
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r2 & r7
            r7 = r2
            goto L_0x0215
        L_0x0213:
            r0 = r87
        L_0x0215:
            if (r4 == 0) goto L_0x0225
            r45 = r0
            r43 = r1
            r41 = r3
            r44 = r8
            r42 = r15
            r46 = r22
            goto L_0x0195
        L_0x0225:
            r46 = r88
            r45 = r0
            r43 = r1
            r41 = r3
            goto L_0x0191
        L_0x022f:
            r9.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0241
            r0 = -1
            java.lang.String r1 = "com.hansecom.abt.ui.components.formFields.ValueField (ValueField.kt:59)"
            r2 = 1560075652(0x5cfcdd84, float:5.69402025E17)
            androidx.compose.runtime.ComposerKt.Y(r2, r8, r0, r1)
        L_0x0241:
            com.hansecom.abt.ui.theme.AbtTheme r7 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r0 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r1 = r7.d(r9, r0)
            androidx.compose.ui.text.TextStyle r47 = r1.h()
            androidx.compose.ui.text.style.TextAlign$Companion r0 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r67 = r0.a()
            r77 = 16744447(0xff7fff, float:2.3463968E-38)
            r78 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r68 = 0
            r69 = 0
            r71 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            r75 = 0
            r76 = 0
            androidx.compose.ui.text.TextStyle r18 = androidx.compose.ui.text.TextStyle.c(r47, r48, r50, r52, r53, r54, r55, r56, r57, r59, r60, r61, r62, r64, r65, r66, r67, r68, r69, r71, r72, r73, r74, r75, r76, r77, r78)
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.layout.Arrangement r0 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r0 = r0.g()
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r1 = r1.k()
            r2 = 0
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.ColumnKt.a(r0, r1, r9, r2)
            int r1 = androidx.compose.runtime.ComposablesKt.a(r9, r2)
            androidx.compose.runtime.CompositionLocalMap r2 = r9.I()
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.ComposedModifierKt.e(r9, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r5 = r4.a()
            androidx.compose.runtime.Applier r16 = r9.v()
            if (r16 != 0) goto L_0x02b7
            androidx.compose.runtime.ComposablesKt.d()
        L_0x02b7:
            r9.s()
            boolean r16 = r9.n()
            if (r16 == 0) goto L_0x02c4
            r9.y(r5)
            goto L_0x02c7
        L_0x02c4:
            r9.K()
        L_0x02c7:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r9)
            r81 = r6
            kotlin.jvm.functions.Function2 r6 = r4.c()
            androidx.compose.runtime.Updater.g(r5, r0, r6)
            kotlin.jvm.functions.Function2 r0 = r4.e()
            androidx.compose.runtime.Updater.g(r5, r2, r0)
            kotlin.jvm.functions.Function2 r0 = r4.b()
            boolean r2 = r5.n()
            if (r2 != 0) goto L_0x02f3
            java.lang.Object r2 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r6)
            if (r2 != 0) goto L_0x0301
        L_0x02f3:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r5.N(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.A(r1, r0)
        L_0x0301:
            kotlin.jvm.functions.Function2 r0 = r4.d()
            androidx.compose.runtime.Updater.g(r5, r3, r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.r()
            com.hansecom.abt.ui.components.formFields.EmptyTextToolbar r1 = com.hansecom.abt.ui.components.formFields.EmptyTextToolbar.f38318a
            androidx.compose.runtime.ProvidedValue r6 = r0.d(r1)
            com.hansecom.abt.ui.components.formFields.ValueFieldKt$ValueField$2$1 r5 = new com.hansecom.abt.ui.components.formFields.ValueFieldKt$ValueField$2$1
            r0 = r5
            r1 = r14
            r2 = r44
            r3 = r45
            r4 = r79
            r10 = r5
            r5 = r80
            r11 = r81
            r12 = r6
            r6 = r46
            r13 = r7
            r7 = r18
            r16 = r8
            r81 = r14
            r14 = r22
            r8 = r42
            r82 = r15
            r15 = r9
            r9 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 54
            r1 = 1939738126(0x739e0e0e, float:2.5044799E31)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r14, r10, r15, r0)
            int r1 = androidx.compose.runtime.ProvidedValue.f14769i
            r1 = r1 | 48
            androidx.compose.runtime.CompositionLocalKt.c(r12, r0, r15, r1)
            r0 = 8
            float r0 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.i(r11, r0)
            r1 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r0, r15, r1)
            int r0 = r41.length()
            if (r0 <= 0) goto L_0x03a4
            r0 = 643542415(0x265bad8f, float:7.6216104E-16)
            r15.X(r0)
            com.hansecom.abt.ui.theme.typography.AbtTypography r0 = r13.d(r15, r1)
            androidx.compose.ui.text.TextStyle r36 = r0.d()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r13.b(r15, r1)
            long r18 = r0.b()
            int r0 = r16 >> 12
            r38 = r0 & 14
            r39 = 0
            r40 = 65530(0xfffa, float:9.1827E-41)
            r17 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r16 = r41
            r37 = r15
            com.hansecom.abt.ui.components.AbtTextKt.c(r16, r17, r18, r20, r22, r23, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r15.M()
            goto L_0x03f0
        L_0x03a4:
            r0 = 643733003(0x265e960b, float:7.722507E-16)
            r15.X(r0)
            r0 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r0 = r13.d(r15, r0)
            androidx.compose.ui.text.TextStyle r36 = r0.d()
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.ContentColorKt.a()
            java.lang.Object r0 = r15.C(r0)
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.ui.graphics.Color) r0
            long r18 = r0.v()
            int r0 = r16 >> 9
            r38 = r0 & 14
            r39 = 0
            r40 = 65530(0xfffa, float:9.1827E-41)
            r17 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r16 = r82
            r37 = r15
            com.hansecom.abt.ui.components.AbtTextKt.c(r16, r17, r18, r20, r22, r23, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r15.M()
        L_0x03f0:
            r15.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x03fc
            androidx.compose.runtime.ComposerKt.X()
        L_0x03fc:
            r3 = r81
            r4 = r82
            r5 = r41
            r6 = r42
            r7 = r43
            r8 = r44
            r9 = r45
            r10 = r46
        L_0x040c:
            androidx.compose.runtime.ScopeUpdateScope r13 = r15.x()
            if (r13 == 0) goto L_0x0423
            com.hansecom.abt.ui.components.formFields.d0 r14 = new com.hansecom.abt.ui.components.formFields.d0
            r0 = r14
            r1 = r79
            r2 = r80
            r11 = r90
            r12 = r91
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0423:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.formFields.ValueFieldKt.b(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.ui.focus.FocusRequester, int, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(String str, Function1 function1, Modifier modifier, String str2, String str3, boolean z2, VisualTransformation visualTransformation, FocusRequester focusRequester, int i2, boolean z3, int i3, int i4, Composer composer, int i5) {
        b(str, function1, modifier, str2, str3, z2, visualTransformation, focusRequester, i2, z3, composer, RecomposeScopeImplKt.a(i3 | 1), i4);
        return Unit.f40552a;
    }
}
