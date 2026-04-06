package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.material3.tokens.SearchViewTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class SearchBarDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final SearchBarDefaults f10786a = new SearchBarDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f10787b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f10788c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f10789d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f10790e = SearchBarTokens.f13920a.b();

    static {
        ElevationTokens elevationTokens = ElevationTokens.f13121a;
        float a2 = elevationTokens.a();
        f10787b = a2;
        f10788c = elevationTokens.a();
        f10789d = a2;
    }

    public static final Unit f(Function1 function1, FocusState focusState) {
        if (focusState.f()) {
            function1.invoke(Boolean.TRUE);
        }
        return Unit.f40552a;
    }

    public static final Unit g(String str, boolean z2, String str2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.e0(semanticsPropertyReceiver, str);
        if (z2) {
            SemanticsPropertiesKt.x0(semanticsPropertyReceiver, str2);
        }
        return Unit.f40552a;
    }

    public static final Unit h(Function1 function1, String str, KeyboardActionScope keyboardActionScope) {
        function1.invoke(str);
        return Unit.f40552a;
    }

    public static final Unit i(SearchBarDefaults searchBarDefaults, String str, Function1 function1, Function1 function12, boolean z2, Function1 function13, Modifier modifier, boolean z3, Function2 function2, Function2 function22, Function2 function23, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        searchBarDefaults.e(str, function1, function12, z2, function13, modifier, z3, function2, function22, function23, textFieldColors, mutableInteractionSource, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3), i4);
        return Unit.f40552a;
    }

    public static final boolean j(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v1, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.lang.String r73, kotlin.jvm.functions.Function1 r74, kotlin.jvm.functions.Function1 r75, boolean r76, kotlin.jvm.functions.Function1 r77, androidx.compose.ui.Modifier r78, boolean r79, kotlin.jvm.functions.Function2 r80, kotlin.jvm.functions.Function2 r81, kotlin.jvm.functions.Function2 r82, androidx.compose.material3.TextFieldColors r83, androidx.compose.foundation.interaction.MutableInteractionSource r84, androidx.compose.runtime.Composer r85, int r86, int r87, int r88) {
        /*
            r72 = this;
            r15 = r73
            r14 = r75
            r12 = r76
            r11 = r77
            r10 = r86
            r9 = r87
            r13 = r88
            r3 = 256(0x100, float:3.59E-43)
            r4 = 128(0x80, float:1.794E-43)
            r5 = 32
            r6 = 16
            r8 = 748018311(0x2c95da87, float:4.259096E-12)
            r2 = r85
            androidx.compose.runtime.Composer r2 = r2.q(r8)
            r8 = 1
            r17 = r13 & 1
            r18 = 2
            r8 = 4
            if (r17 == 0) goto L_0x002a
            r17 = r10 | 6
            goto L_0x003e
        L_0x002a:
            r17 = r10 & 6
            if (r17 != 0) goto L_0x003c
            boolean r17 = r2.W(r15)
            if (r17 == 0) goto L_0x0037
            r17 = r8
            goto L_0x0039
        L_0x0037:
            r17 = r18
        L_0x0039:
            r17 = r10 | r17
            goto L_0x003e
        L_0x003c:
            r17 = r10
        L_0x003e:
            r19 = r13 & 2
            if (r19 == 0) goto L_0x0049
            r17 = r17 | 48
            r7 = r74
        L_0x0046:
            r0 = r17
            goto L_0x005d
        L_0x0049:
            r19 = r10 & 48
            r7 = r74
            if (r19 != 0) goto L_0x0046
            boolean r20 = r2.l(r7)
            if (r20 == 0) goto L_0x0058
            r20 = r5
            goto L_0x005a
        L_0x0058:
            r20 = r6
        L_0x005a:
            r17 = r17 | r20
            goto L_0x0046
        L_0x005d:
            r17 = r13 & 4
            if (r17 == 0) goto L_0x0064
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0072
        L_0x0064:
            r8 = r10 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0072
            boolean r8 = r2.l(r14)
            if (r8 == 0) goto L_0x0070
            r8 = r3
            goto L_0x0071
        L_0x0070:
            r8 = r4
        L_0x0071:
            r0 = r0 | r8
        L_0x0072:
            r8 = r13 & 8
            if (r8 == 0) goto L_0x0079
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0079:
            r8 = r10 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0089
            boolean r8 = r2.d(r12)
            if (r8 == 0) goto L_0x0086
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r0 = r0 | r8
        L_0x0089:
            r8 = r13 & 16
            if (r8 == 0) goto L_0x0090
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x0090:
            r8 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x00a0
            boolean r8 = r2.l(r11)
            if (r8 == 0) goto L_0x009d
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r0 = r0 | r8
        L_0x00a0:
            r8 = r13 & 32
            r21 = 196608(0x30000, float:2.75506E-40)
            if (r8 == 0) goto L_0x00ab
            r0 = r0 | r21
            r5 = r78
            goto L_0x00be
        L_0x00ab:
            r21 = r10 & r21
            r5 = r78
            if (r21 != 0) goto L_0x00be
            boolean r22 = r2.W(r5)
            if (r22 == 0) goto L_0x00ba
            r22 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r22 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r0 = r0 | r22
        L_0x00be:
            r22 = r13 & 64
            r23 = 1572864(0x180000, float:2.204052E-39)
            if (r22 == 0) goto L_0x00c9
            r0 = r0 | r23
            r6 = r79
            goto L_0x00dc
        L_0x00c9:
            r23 = r10 & r23
            r6 = r79
            if (r23 != 0) goto L_0x00dc
            boolean r23 = r2.d(r6)
            if (r23 == 0) goto L_0x00d8
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r0 = r0 | r23
        L_0x00dc:
            r1 = r13 & 128(0x80, float:1.794E-43)
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x00e5
            r0 = r0 | r24
            goto L_0x00f8
        L_0x00e5:
            r24 = r10 & r24
            r4 = r80
            if (r24 != 0) goto L_0x00f8
            boolean r25 = r2.l(r4)
            if (r25 == 0) goto L_0x00f4
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f4:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r0 = r0 | r25
        L_0x00f8:
            r4 = r13 & 256(0x100, float:3.59E-43)
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            if (r4 == 0) goto L_0x0103
            r0 = r0 | r23
            r3 = r81
            goto L_0x0116
        L_0x0103:
            r23 = r10 & r23
            r3 = r81
            if (r23 != 0) goto L_0x0116
            boolean r23 = r2.l(r3)
            if (r23 == 0) goto L_0x0112
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0114
        L_0x0112:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0114:
            r0 = r0 | r23
        L_0x0116:
            r3 = r13 & 512(0x200, float:7.175E-43)
            r20 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x0121
            r0 = r0 | r20
            r5 = r82
            goto L_0x0134
        L_0x0121:
            r20 = r10 & r20
            r5 = r82
            if (r20 != 0) goto L_0x0134
            boolean r20 = r2.l(r5)
            if (r20 == 0) goto L_0x0130
            r20 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0132
        L_0x0130:
            r20 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0132:
            r0 = r0 | r20
        L_0x0134:
            r20 = r9 & 6
            if (r20 != 0) goto L_0x014d
            r5 = 1024(0x400, float:1.435E-42)
            r6 = r13 & 1024(0x400, float:1.435E-42)
            r5 = r83
            if (r6 != 0) goto L_0x0148
            boolean r6 = r2.W(r5)
            if (r6 == 0) goto L_0x0148
            r18 = 4
        L_0x0148:
            r6 = r9 | r18
        L_0x014a:
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0151
        L_0x014d:
            r5 = r83
            r6 = r9
            goto L_0x014a
        L_0x0151:
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x015a
            r6 = r6 | 48
        L_0x0157:
            r5 = r84
            goto L_0x016d
        L_0x015a:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0157
            r5 = r84
            boolean r18 = r2.W(r5)
            if (r18 == 0) goto L_0x0169
            r17 = 32
            goto L_0x016b
        L_0x0169:
            r17 = 16
        L_0x016b:
            r6 = r6 | r17
        L_0x016d:
            r5 = r13 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L_0x0176
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0173:
            r5 = r72
            goto L_0x0189
        L_0x0176:
            r5 = r9 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0173
            r5 = r72
            boolean r17 = r2.W(r5)
            if (r17 == 0) goto L_0x0185
            r24 = 256(0x100, float:3.59E-43)
            goto L_0x0187
        L_0x0185:
            r24 = 128(0x80, float:1.794E-43)
        L_0x0187:
            r6 = r6 | r24
        L_0x0189:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r0 & r17
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r9) goto L_0x019d
            r5 = r6 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r5 == r9) goto L_0x019a
            goto L_0x019d
        L_0x019a:
            r5 = 0
        L_0x019b:
            r9 = 1
            goto L_0x019f
        L_0x019d:
            r5 = 1
            goto L_0x019b
        L_0x019f:
            r14 = r0 & 1
            boolean r5 = r2.E(r5, r14)
            if (r5 == 0) goto L_0x04d8
            r2.p()
            r5 = r10 & 1
            if (r5 == 0) goto L_0x01cf
            boolean r5 = r2.J()
            if (r5 == 0) goto L_0x01b5
            goto L_0x01cf
        L_0x01b5:
            r2.B()
            r1 = 1024(0x400, float:1.435E-42)
            r1 = r1 & r13
            if (r1 == 0) goto L_0x01bf
            r6 = r6 & -15
        L_0x01bf:
            r29 = r78
            r9 = r79
            r30 = r80
            r31 = r81
            r32 = r82
            r8 = r83
            r33 = r84
            goto L_0x0259
        L_0x01cf:
            if (r8 == 0) goto L_0x01d4
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01d6
        L_0x01d4:
            r5 = r78
        L_0x01d6:
            if (r22 == 0) goto L_0x01da
            r8 = 1
            goto L_0x01dc
        L_0x01da:
            r8 = r79
        L_0x01dc:
            if (r1 == 0) goto L_0x01e0
            r1 = 0
            goto L_0x01e2
        L_0x01e0:
            r1 = r80
        L_0x01e2:
            if (r4 == 0) goto L_0x01e6
            r4 = 0
            goto L_0x01e8
        L_0x01e6:
            r4 = r81
        L_0x01e8:
            if (r3 == 0) goto L_0x01ee
            r3 = 0
        L_0x01eb:
            r9 = 1024(0x400, float:1.435E-42)
            goto L_0x01f1
        L_0x01ee:
            r3 = r82
            goto L_0x01eb
        L_0x01f1:
            r9 = r9 & r13
            if (r9 == 0) goto L_0x023a
            int r9 = r6 << 3
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r66 = r9
            r67 = 8388607(0x7fffff, float:1.1754942E-38)
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r59 = 0
            r61 = 0
            r64 = 0
            r65 = 0
            r17 = r72
            r63 = r2
            androidx.compose.material3.TextFieldColors r9 = r17.p(r18, r20, r22, r24, r26, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r64, r65, r66, r67)
            r6 = r6 & -15
            goto L_0x023c
        L_0x023a:
            r9 = r83
        L_0x023c:
            if (r7 == 0) goto L_0x024e
            r30 = r1
            r32 = r3
            r31 = r4
            r29 = r5
            r33 = 0
        L_0x0248:
            r71 = r9
            r9 = r8
            r8 = r71
            goto L_0x0259
        L_0x024e:
            r33 = r84
            r30 = r1
            r32 = r3
            r31 = r4
            r29 = r5
            goto L_0x0248
        L_0x0259:
            r2.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x026a
            java.lang.String r1 = "androidx.compose.material3.SearchBarDefaults.InputField (SearchBar.kt:1655)"
            r3 = 748018311(0x2c95da87, float:4.259096E-12)
            androidx.compose.runtime.ComposerKt.Y(r3, r0, r6, r1)
        L_0x026a:
            if (r33 != 0) goto L_0x028d
            r1 = 1923851092(0x72aba354, float:6.799282E30)
            r2.X(r1)
            java.lang.Object r1 = r2.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r1 != r3) goto L_0x0285
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r2.N(r1)
        L_0x0285:
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = (androidx.compose.foundation.interaction.MutableInteractionSource) r1
            r2.M()
            r7 = r1
        L_0x028b:
            r1 = 0
            goto L_0x0299
        L_0x028d:
            r1 = 1586079715(0x5e89a7e3, float:4.9595731E18)
            r2.X(r1)
            r2.M()
            r7 = r33
            goto L_0x028b
        L_0x0299:
            androidx.compose.runtime.State r3 = androidx.compose.foundation.interaction.FocusInteractionKt.a(r7, r2, r1)
            java.lang.Object r1 = r3.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r6 = r1.booleanValue()
            java.lang.Object r1 = r2.g()
            androidx.compose.runtime.Composer$Companion r34 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r34.a()
            if (r1 != r3) goto L_0x02bb
            androidx.compose.ui.focus.FocusRequester r1 = new androidx.compose.ui.focus.FocusRequester
            r1.<init>()
            r2.N(r1)
        L_0x02bb:
            androidx.compose.ui.focus.FocusRequester r1 = (androidx.compose.ui.focus.FocusRequester) r1
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r3 = r2.C(r3)
            r5 = r3
            androidx.compose.ui.focus.FocusManager r5 = (androidx.compose.ui.focus.FocusManager) r5
            androidx.compose.material3.internal.Strings$Companion r3 = androidx.compose.material3.internal.Strings.f12320b
            int r3 = androidx.compose.material3.R.string.M
            int r3 = androidx.compose.material3.internal.Strings.a(r3)
            r4 = 0
            java.lang.String r3 = androidx.compose.material3.internal.Strings_androidKt.b(r3, r2, r4)
            int r17 = androidx.compose.material3.R.string.P
            int r14 = androidx.compose.material3.internal.Strings.a(r17)
            java.lang.String r14 = androidx.compose.material3.internal.Strings_androidKt.b(r14, r2, r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.material3.TextKt.q()
            java.lang.Object r4 = r2.C(r4)
            androidx.compose.ui.text.TextStyle r4 = (androidx.compose.ui.text.TextStyle) r4
            long r17 = r4.h()
            r19 = 16
            int r4 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x02f6
        L_0x02f3:
            r36 = r17
            goto L_0x02fc
        L_0x02f6:
            r4 = 0
            long r17 = r8.w(r9, r4, r6)
            goto L_0x02f3
        L_0x02fc:
            float r4 = androidx.compose.material3.SearchBarKt.L()
            float r17 = androidx.compose.material3.SearchBarKt.f10818f
            float r18 = f10790e
            r19 = 8
            r20 = 0
            r21 = 0
            r78 = r29
            r79 = r4
            r80 = r18
            r81 = r17
            r82 = r21
            r83 = r19
            r84 = r20
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.x(r78, r79, r80, r81, r82, r83, r84)
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.focus.FocusRequesterModifierKt.a(r4, r1)
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r0
            r78 = r5
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 != r5) goto L_0x032e
            r4 = 1
            goto L_0x032f
        L_0x032e:
            r4 = 0
        L_0x032f:
            java.lang.Object r5 = r2.g()
            if (r4 != 0) goto L_0x033b
            java.lang.Object r4 = r34.a()
            if (r5 != r4) goto L_0x0343
        L_0x033b:
            androidx.compose.material3.s5 r5 = new androidx.compose.material3.s5
            r5.<init>(r11)
            r2.N(r5)
        L_0x0343:
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.focus.FocusChangedModifierKt.a(r1, r5)
            boolean r4 = r2.W(r3)
            r5 = r0 & 7168(0x1c00, float:1.0045E-41)
            r79 = r6
            r6 = 2048(0x800, float:2.87E-42)
            if (r5 != r6) goto L_0x0357
            r5 = 1
            goto L_0x0358
        L_0x0357:
            r5 = 0
        L_0x0358:
            r4 = r4 | r5
            boolean r5 = r2.W(r14)
            r4 = r4 | r5
            java.lang.Object r5 = r2.g()
            if (r4 != 0) goto L_0x036a
            java.lang.Object r4 = r34.a()
            if (r5 != r4) goto L_0x0372
        L_0x036a:
            androidx.compose.material3.t5 r5 = new androidx.compose.material3.t5
            r5.<init>(r3, r12, r14)
            r2.N(r5)
        L_0x0372:
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r3 = 0
            r4 = 0
            r14 = 1
            androidx.compose.ui.Modifier r23 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r1, r3, r5, r14, r4)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.material3.TextKt.q()
            java.lang.Object r1 = r2.C(r1)
            androidx.compose.ui.text.TextStyle r1 = (androidx.compose.ui.text.TextStyle) r1
            androidx.compose.ui.text.TextStyle r3 = new androidx.compose.ui.text.TextStyle
            r35 = r3
            r65 = 16777214(0xfffffe, float:2.3509884E-38)
            r66 = 0
            r38 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r48 = 0
            r49 = 0
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
            r63 = 0
            r64 = 0
            r35.<init>(r36, r38, r40, r41, r42, r43, r44, r45, r47, r48, r49, r50, r52, r53, r54, r55, r56, r57, r59, r60, r61, r62, r63, r64, r65, r66)
            androidx.compose.ui.text.TextStyle r25 = r1.J(r3)
            androidx.compose.ui.graphics.SolidColor r6 = new androidx.compose.ui.graphics.SolidColor
            r1 = 0
            long r3 = r8.f(r1)
            r5 = 0
            r6.<init>(r3, r5)
            androidx.compose.foundation.text.KeyboardOptions r22 = new androidx.compose.foundation.text.KeyboardOptions
            androidx.compose.ui.text.input.ImeAction$Companion r3 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r39 = r3.g()
            r43 = 119(0x77, float:1.67E-43)
            r36 = 0
            r37 = 0
            r38 = 0
            r35 = r22
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r3 = r0 & 896(0x380, float:1.256E-42)
            r4 = 256(0x100, float:3.59E-43)
            if (r3 != r4) goto L_0x03eb
            r3 = r14
            goto L_0x03ec
        L_0x03eb:
            r3 = r1
        L_0x03ec:
            r4 = r0 & 14
            r1 = 4
            if (r4 != r1) goto L_0x03f3
            r1 = r14
            goto L_0x03f4
        L_0x03f3:
            r1 = 0
        L_0x03f4:
            r1 = r1 | r3
            java.lang.Object r3 = r2.g()
            if (r1 != 0) goto L_0x0407
            java.lang.Object r1 = r34.a()
            if (r3 != r1) goto L_0x0402
            goto L_0x0407
        L_0x0402:
            r1 = r75
            r35 = 0
            goto L_0x0413
        L_0x0407:
            androidx.compose.material3.u5 r3 = new androidx.compose.material3.u5
            r1 = r75
            r35 = 0
            r3.<init>(r1, r15)
            r2.N(r3)
        L_0x0413:
            r41 = r3
            kotlin.jvm.functions.Function1 r41 = (kotlin.jvm.functions.Function1) r41
            androidx.compose.foundation.text.KeyboardActions r36 = new androidx.compose.foundation.text.KeyboardActions
            r16 = r36
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r42 = 0
            r43 = 47
            r44 = 0
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44)
            androidx.compose.material3.SearchBarDefaults$InputField$23 r3 = new androidx.compose.material3.SearchBarDefaults$InputField$23
            r17 = r0
            r0 = r3
            r1 = r73
            r13 = r2
            r2 = r9
            r14 = r3
            r3 = r7
            r18 = r4
            r4 = r30
            r68 = r78
            r36 = r5
            r5 = r31
            r37 = r79
            r38 = r6
            r6 = r32
            r39 = r7
            r7 = r8
            r40 = r8
            r15 = 1
            r8 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 54
            r1 = -813926844(0xffffffffcf7c7644, float:-4.23560909E9)
            androidx.compose.runtime.internal.ComposableLambda r24 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r15, r14, r13, r0)
            r0 = 102236160(0x6180000, float:2.8588023E-35)
            r0 = r18 | r0
            r1 = r17 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r17 >> 9
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r26 = r0 | r2
            r27 = 196608(0x30000, float:2.75506E-40)
            r28 = 7696(0x1e10, float:1.0784E-41)
            r0 = 0
            r2 = r13
            r13 = r0
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r8 = r9
            r9 = r73
            r10 = r74
            r11 = r23
            r12 = r8
            r0 = r36
            r14 = r25
            r3 = r15
            r15 = r22
            r22 = r39
            r23 = r38
            r25 = r2
            androidx.compose.foundation.text.BasicTextFieldKt.e(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r76 != 0) goto L_0x0496
            if (r37 == 0) goto L_0x0496
            goto L_0x0498
        L_0x0496:
            r3 = r35
        L_0x0498:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r76)
            boolean r5 = r2.d(r3)
            r6 = r68
            boolean r7 = r2.l(r6)
            r5 = r5 | r7
            java.lang.Object r7 = r2.g()
            if (r5 != 0) goto L_0x04b3
            java.lang.Object r5 = r34.a()
            if (r7 != r5) goto L_0x04bb
        L_0x04b3:
            androidx.compose.material3.SearchBarDefaults$InputField$24$1 r7 = new androidx.compose.material3.SearchBarDefaults$InputField$24$1
            r7.<init>(r3, r6, r0)
            r2.N(r7)
        L_0x04bb:
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r0 = r1 & 14
            androidx.compose.runtime.EffectsKt.g(r4, r7, r2, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x04cb
            androidx.compose.runtime.ComposerKt.X()
        L_0x04cb:
            r7 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r13 = r33
            r12 = r40
            goto L_0x04e9
        L_0x04d8:
            r2.B()
            r7 = r78
            r8 = r79
            r9 = r80
            r10 = r81
            r11 = r82
            r12 = r83
            r13 = r84
        L_0x04e9:
            androidx.compose.runtime.ScopeUpdateScope r15 = r2.x()
            if (r15 == 0) goto L_0x0512
            androidx.compose.material3.v5 r14 = new androidx.compose.material3.v5
            r0 = r14
            r1 = r72
            r2 = r73
            r3 = r74
            r4 = r75
            r5 = r76
            r6 = r77
            r69 = r14
            r14 = r86
            r70 = r15
            r15 = r87
            r16 = r88
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r69
            r0 = r70
            r0.a(r1)
        L_0x0512:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarDefaults.e(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public final Shape l(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-2009956471, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.kt:1043)");
        }
        Shape g2 = ShapesKt.g(SearchViewTokens.f13936a.a(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g2;
    }

    public final WindowInsets m(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1745169224, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenWindowInsets> (SearchBar.kt:1059)");
        }
        WindowInsets c2 = WindowInsets_androidKt.c(WindowInsets.f4206a, composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return c2;
    }

    public final float n() {
        return f10790e;
    }

    public final Shape o(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1770571533, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.kt:1039)");
        }
        Shape g2 = ShapesKt.g(SearchBarTokens.f13920a.c(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g2;
    }

    public final TextFieldColors p(long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, Composer composer, int i2, int i3, int i4, int i5) {
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        Composer composer2 = composer;
        int i6 = i2;
        int i7 = i3;
        int i8 = i5;
        long k2 = (i8 & 1) != 0 ? ColorSchemeKt.k(SearchBarTokens.f13920a.d(), composer2, 6) : j2;
        long k3 = (i8 & 2) != 0 ? ColorSchemeKt.k(SearchBarTokens.f13920a.d(), composer2, 6) : j3;
        if ((i8 & 4) != 0) {
            FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.f13329a;
            j24 = Color.l(ColorSchemeKt.k(filledTextFieldTokens.g(), composer2, 6), filledTextFieldTokens.h(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j24 = j4;
        }
        long k4 = (i8 & 8) != 0 ? ColorSchemeKt.k(FilledTextFieldTokens.f13329a.b(), composer2, 6) : j5;
        TextSelectionColors textSelectionColors2 = (i8 & 16) != 0 ? (TextSelectionColors) composer2.C(TextSelectionColorsKt.b()) : textSelectionColors;
        long k5 = (i8 & 32) != 0 ? ColorSchemeKt.k(SearchBarTokens.f13920a.e(), composer2, 6) : j6;
        long k6 = (i8 & 64) != 0 ? ColorSchemeKt.k(SearchBarTokens.f13920a.e(), composer2, 6) : j7;
        if ((i8 & 128) != 0) {
            FilledTextFieldTokens filledTextFieldTokens2 = FilledTextFieldTokens.f13329a;
            j25 = Color.l(ColorSchemeKt.k(filledTextFieldTokens2.k(), composer2, 6), filledTextFieldTokens2.l(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j25 = j8;
        }
        long k7 = (i8 & 256) != 0 ? ColorSchemeKt.k(SearchBarTokens.f13920a.g(), composer2, 6) : j9;
        long k8 = (i8 & 512) != 0 ? ColorSchemeKt.k(SearchBarTokens.f13920a.g(), composer2, 6) : j10;
        if ((i8 & 1024) != 0) {
            FilledTextFieldTokens filledTextFieldTokens3 = FilledTextFieldTokens.f13329a;
            j26 = Color.l(ColorSchemeKt.k(filledTextFieldTokens3.o(), composer2, 6), filledTextFieldTokens3.p(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j26 = j11;
        }
        long k9 = (i8 & 2048) != 0 ? ColorSchemeKt.k(SearchBarTokens.f13920a.f(), composer2, 6) : j12;
        long k10 = (i8 & 4096) != 0 ? ColorSchemeKt.k(SearchBarTokens.f13920a.f(), composer2, 6) : j13;
        if ((i8 & 8192) != 0) {
            FilledTextFieldTokens filledTextFieldTokens4 = FilledTextFieldTokens.f13329a;
            j27 = Color.l(ColorSchemeKt.k(filledTextFieldTokens4.g(), composer2, 6), filledTextFieldTokens4.h(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j27 = j14;
        }
        long k11 = (i8 & 16384) != 0 ? ColorSchemeKt.k(FilledTextFieldTokens.f13329a.F(), composer2, 6) : j15;
        long k12 = (32768 & i8) != 0 ? ColorSchemeKt.k(FilledTextFieldTokens.f13329a.F(), composer2, 6) : j16;
        if ((65536 & i8) != 0) {
            FilledTextFieldTokens filledTextFieldTokens5 = FilledTextFieldTokens.f13329a;
            j28 = Color.l(ColorSchemeKt.k(filledTextFieldTokens5.F(), composer2, 6), filledTextFieldTokens5.h(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j28 = j17;
        }
        long k13 = (131072 & i8) != 0 ? ColorSchemeKt.k(FilledTextFieldTokens.f13329a.G(), composer2, 6) : j18;
        long k14 = (262144 & i8) != 0 ? ColorSchemeKt.k(FilledTextFieldTokens.f13329a.G(), composer2, 6) : j19;
        if ((524288 & i8) != 0) {
            FilledTextFieldTokens filledTextFieldTokens6 = FilledTextFieldTokens.f13329a;
            j29 = Color.l(ColorSchemeKt.k(filledTextFieldTokens6.G(), composer2, 6), filledTextFieldTokens6.h(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j29 = j20;
        }
        long k15 = (1048576 & i8) != 0 ? ColorSchemeKt.k(SearchBarTokens.f13920a.a(), composer2, 6) : j21;
        long k16 = (2097152 & i8) != 0 ? ColorSchemeKt.k(SearchBarTokens.f13920a.a(), composer2, 6) : j22;
        long k17 = (i8 & 4194304) != 0 ? ColorSchemeKt.k(SearchBarTokens.f13920a.a(), composer2, 6) : j23;
        if (ComposerKt.P()) {
            ComposerKt.Y(-2000124979, i6, i7, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:1220)");
        }
        int i9 = i4 << 12;
        int i10 = i7 << 3;
        int i11 = i7 << 18;
        int i12 = i7 >> 24;
        TextFieldColors h2 = TextFieldDefaults.f11367a.h(k2, k3, j24, 0, k15, k16, k17, 0, k4, 0, textSelectionColors2, 0, 0, 0, 0, k5, k6, j25, 0, k7, k8, j26, 0, 0, 0, 0, 0, k9, k10, j27, 0, 0, 0, 0, 0, k11, k12, j28, 0, k13, k14, j29, 0, composer, (i6 & 1022) | (57344 & i9) | (i9 & 458752) | (i9 & 3670016) | ((i6 << 15) & 234881024), ((i6 >> 12) & 14) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | ((i6 << 3) & 1879048192), ((i6 >> 27) & 14) | (i10 & 112) | (29360128 & i11) | (i11 & 234881024) | (i11 & 1879048192), (33488896 & i10) | ((i7 << 6) & 1879048192), (i12 & 14) | 3072 | (i12 & 112), 1204058760, 2191);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return h2;
    }
}
