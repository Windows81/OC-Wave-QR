package androidx.compose.material3;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.tokens.TypographyTokensKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f11427a = CompositionLocalKt.g(SnapshotStateKt.r(), new C0179l7());

    public static final TextStyle g() {
        return TypographyTokensKt.a();
    }

    public static final void h(TextStyle textStyle, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(15327438);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(textStyle) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function2) ? 32 : 16;
        }
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(15327438, i3, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:459)");
            }
            ProvidableCompositionLocal providableCompositionLocal = f11427a;
            CompositionLocalKt.c(providableCompositionLocal.d(((TextStyle) q2.C(providableCompositionLocal)).J(textStyle)), function2, q2, (i3 & 112) | ProvidedValue.f14769i);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0206o7(textStyle, function2, i2));
        }
    }

    public static final Unit i(TextStyle textStyle, Function2 function2, int i2, Composer composer, int i3) {
        h(textStyle, function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(java.lang.String r59, androidx.compose.ui.Modifier r60, long r61, androidx.compose.foundation.text.TextAutoSize r63, long r64, androidx.compose.ui.text.font.FontStyle r66, androidx.compose.ui.text.font.FontWeight r67, androidx.compose.ui.text.font.FontFamily r68, long r69, androidx.compose.ui.text.style.TextDecoration r71, androidx.compose.ui.text.style.TextAlign r72, long r73, int r75, boolean r76, int r77, int r78, kotlin.jvm.functions.Function1 r79, androidx.compose.ui.text.TextStyle r80, androidx.compose.runtime.Composer r81, int r82, int r83, int r84) {
        /*
            r15 = r82
            r14 = r83
            r13 = r84
            r0 = 1809465675(0x6bda414b, float:5.2770833E26)
            r1 = r81
            androidx.compose.runtime.Composer r0 = r1.q(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r15 | 6
            r4 = r1
            r1 = r59
            goto L_0x002d
        L_0x0019:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002a
            r1 = r59
            boolean r4 = r0.W(r1)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r15
            goto L_0x002d
        L_0x002a:
            r1 = r59
            r4 = r15
        L_0x002d:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r8 = r60
            goto L_0x0048
        L_0x0036:
            r8 = r15 & 48
            if (r8 != 0) goto L_0x0033
            r8 = r60
            boolean r9 = r0.W(r8)
            if (r9 == 0) goto L_0x0045
            r9 = 32
            goto L_0x0047
        L_0x0045:
            r9 = 16
        L_0x0047:
            r4 = r4 | r9
        L_0x0048:
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
            r2 = r61
            goto L_0x0064
        L_0x0051:
            r12 = r15 & 384(0x180, float:5.38E-43)
            r2 = r61
            if (r12 != 0) goto L_0x0064
            boolean r16 = r0.j(r2)
            if (r16 == 0) goto L_0x0060
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r16
        L_0x0064:
            r16 = r13 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0071
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r6 = r63
            goto L_0x0084
        L_0x0071:
            r6 = r15 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x006e
            r6 = r63
            boolean r20 = r0.l(r6)
            if (r20 == 0) goto L_0x0080
            r20 = r18
            goto L_0x0082
        L_0x0080:
            r20 = r17
        L_0x0082:
            r4 = r4 | r20
        L_0x0084:
            r20 = r13 & 16
            r21 = 8192(0x2000, float:1.14794E-41)
            r22 = 16384(0x4000, float:2.2959E-41)
            if (r20 == 0) goto L_0x0091
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r10 = r64
            goto L_0x00a4
        L_0x0091:
            r7 = r15 & 24576(0x6000, float:3.4438E-41)
            r10 = r64
            if (r7 != 0) goto L_0x00a4
            boolean r25 = r0.j(r10)
            if (r25 == 0) goto L_0x00a0
            r25 = r22
            goto L_0x00a2
        L_0x00a0:
            r25 = r21
        L_0x00a2:
            r4 = r4 | r25
        L_0x00a4:
            r25 = r13 & 32
            r26 = 65536(0x10000, float:9.18355E-41)
            r27 = 196608(0x30000, float:2.75506E-40)
            r28 = 131072(0x20000, float:1.83671E-40)
            if (r25 == 0) goto L_0x00b3
            r4 = r4 | r27
            r7 = r66
            goto L_0x00c6
        L_0x00b3:
            r29 = r15 & r27
            r7 = r66
            if (r29 != 0) goto L_0x00c6
            boolean r30 = r0.W(r7)
            if (r30 == 0) goto L_0x00c2
            r30 = r28
            goto L_0x00c4
        L_0x00c2:
            r30 = r26
        L_0x00c4:
            r4 = r4 | r30
        L_0x00c6:
            r30 = r13 & 64
            r31 = 1572864(0x180000, float:2.204052E-39)
            if (r30 == 0) goto L_0x00d1
            r4 = r4 | r31
            r12 = r67
            goto L_0x00e4
        L_0x00d1:
            r32 = r15 & r31
            r12 = r67
            if (r32 != 0) goto L_0x00e4
            boolean r33 = r0.W(r12)
            if (r33 == 0) goto L_0x00e0
            r33 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r33 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r4 = r4 | r33
        L_0x00e4:
            r1 = r13 & 128(0x80, float:1.794E-43)
            r33 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x00ef
            r4 = r4 | r33
            r2 = r68
            goto L_0x0101
        L_0x00ef:
            r34 = r15 & r33
            r2 = r68
            if (r34 != 0) goto L_0x0101
            boolean r3 = r0.W(r2)
            if (r3 == 0) goto L_0x00fe
            r3 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r3 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r4 = r4 | r3
        L_0x0101:
            r3 = r13 & 256(0x100, float:3.59E-43)
            r34 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x010c
            r4 = r4 | r34
            r6 = r69
            goto L_0x011f
        L_0x010c:
            r34 = r15 & r34
            r6 = r69
            if (r34 != 0) goto L_0x011f
            boolean r34 = r0.j(r6)
            if (r34 == 0) goto L_0x011b
            r34 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011d
        L_0x011b:
            r34 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011d:
            r4 = r4 | r34
        L_0x011f:
            r2 = r13 & 512(0x200, float:7.175E-43)
            r34 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x012a
            r4 = r4 | r34
            r6 = r71
            goto L_0x013c
        L_0x012a:
            r34 = r15 & r34
            r6 = r71
            if (r34 != 0) goto L_0x013c
            boolean r7 = r0.W(r6)
            if (r7 == 0) goto L_0x0139
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013b
        L_0x0139:
            r7 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013b:
            r4 = r4 | r7
        L_0x013c:
            r7 = r13 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x0145
            r32 = r14 | 6
            r6 = r72
            goto L_0x015b
        L_0x0145:
            r34 = r14 & 6
            r6 = r72
            if (r34 != 0) goto L_0x0159
            boolean r34 = r0.W(r6)
            if (r34 == 0) goto L_0x0154
            r32 = 4
            goto L_0x0156
        L_0x0154:
            r32 = 2
        L_0x0156:
            r32 = r14 | r32
            goto L_0x015b
        L_0x0159:
            r32 = r14
        L_0x015b:
            r6 = r13 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0166
            r32 = r32 | 48
            r10 = r73
        L_0x0163:
            r8 = r32
            goto L_0x017a
        L_0x0166:
            r34 = r14 & 48
            r10 = r73
            if (r34 != 0) goto L_0x0163
            boolean r34 = r0.j(r10)
            if (r34 == 0) goto L_0x0175
            r23 = 32
            goto L_0x0177
        L_0x0175:
            r23 = 16
        L_0x0177:
            r32 = r32 | r23
            goto L_0x0163
        L_0x017a:
            r10 = r13 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x0183
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0180:
            r11 = r75
            goto L_0x0196
        L_0x0183:
            r11 = r14 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0180
            r11 = r75
            boolean r19 = r0.i(r11)
            if (r19 == 0) goto L_0x0192
            r24 = 256(0x100, float:3.59E-43)
            goto L_0x0194
        L_0x0192:
            r24 = 128(0x80, float:1.794E-43)
        L_0x0194:
            r8 = r8 | r24
        L_0x0196:
            r11 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x019f
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x019c:
            r12 = r76
            goto L_0x01af
        L_0x019f:
            r12 = r14 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x019c
            r12 = r76
            boolean r19 = r0.d(r12)
            if (r19 == 0) goto L_0x01ad
            r17 = r18
        L_0x01ad:
            r8 = r8 | r17
        L_0x01af:
            r12 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x01ba
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            r17 = r12
        L_0x01b7:
            r12 = r77
            goto L_0x01cc
        L_0x01ba:
            r17 = r12
            r12 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x01b7
            r12 = r77
            boolean r18 = r0.i(r12)
            if (r18 == 0) goto L_0x01ca
            r21 = r22
        L_0x01ca:
            r8 = r8 | r21
        L_0x01cc:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r13 & r18
            if (r18 == 0) goto L_0x01d8
            r8 = r8 | r27
            r12 = r78
            goto L_0x01eb
        L_0x01d8:
            r19 = r14 & r27
            r12 = r78
            if (r19 != 0) goto L_0x01eb
            boolean r19 = r0.i(r12)
            if (r19 == 0) goto L_0x01e7
            r19 = r28
            goto L_0x01e9
        L_0x01e7:
            r19 = r26
        L_0x01e9:
            r8 = r8 | r19
        L_0x01eb:
            r19 = r13 & r26
            if (r19 == 0) goto L_0x01f4
            r8 = r8 | r31
            r12 = r79
            goto L_0x0207
        L_0x01f4:
            r21 = r14 & r31
            r12 = r79
            if (r21 != 0) goto L_0x0207
            boolean r21 = r0.l(r12)
            if (r21 == 0) goto L_0x0203
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0205
        L_0x0203:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x0205:
            r8 = r8 | r21
        L_0x0207:
            r21 = r14 & r33
            if (r21 != 0) goto L_0x021f
            r21 = r13 & r28
            r12 = r80
            if (r21 != 0) goto L_0x021a
            boolean r21 = r0.W(r12)
            if (r21 == 0) goto L_0x021a
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x021c
        L_0x021a:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x021c:
            r8 = r8 | r21
            goto L_0x0221
        L_0x021f:
            r12 = r80
        L_0x0221:
            r21 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r4 & r21
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            r21 = 1
            if (r12 != r14) goto L_0x0239
            r12 = 4793491(0x492493, float:6.717112E-39)
            r12 = r12 & r8
            r14 = 4793490(0x492492, float:6.71711E-39)
            if (r12 == r14) goto L_0x0237
            goto L_0x0239
        L_0x0237:
            r12 = 0
            goto L_0x023b
        L_0x0239:
            r12 = r21
        L_0x023b:
            r14 = r4 & 1
            boolean r12 = r0.E(r12, r14)
            if (r12 == 0) goto L_0x041f
            r0.p()
            r12 = r15 & 1
            if (r12 == 0) goto L_0x0281
            boolean r12 = r0.J()
            if (r12 == 0) goto L_0x0251
            goto L_0x0281
        L_0x0251:
            r0.B()
            r1 = r13 & r28
            if (r1 == 0) goto L_0x025c
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r8 = r8 & r1
        L_0x025c:
            r5 = r60
            r22 = r61
            r12 = r63
            r1 = r64
            r14 = r66
            r16 = r67
            r3 = r68
            r6 = r69
            r9 = r72
            r10 = r73
            r17 = r75
            r18 = r76
            r19 = r77
            r21 = r78
            r20 = r79
            r56 = r80
            r13 = r8
            r8 = r71
            goto L_0x0329
        L_0x0281:
            if (r5 == 0) goto L_0x0286
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0288
        L_0x0286:
            r5 = r60
        L_0x0288:
            if (r9 == 0) goto L_0x0291
            androidx.compose.ui.graphics.Color$Companion r9 = androidx.compose.ui.graphics.Color.f15975b
            long r22 = r9.f()
            goto L_0x0293
        L_0x0291:
            r22 = r61
        L_0x0293:
            r9 = 0
            if (r16 == 0) goto L_0x0298
            r12 = r9
            goto L_0x029a
        L_0x0298:
            r12 = r63
        L_0x029a:
            if (r20 == 0) goto L_0x02a3
            androidx.compose.ui.unit.TextUnit$Companion r14 = androidx.compose.ui.unit.TextUnit.f19177b
            long r26 = r14.a()
            goto L_0x02a5
        L_0x02a3:
            r26 = r64
        L_0x02a5:
            if (r25 == 0) goto L_0x02a9
            r14 = r9
            goto L_0x02ab
        L_0x02a9:
            r14 = r66
        L_0x02ab:
            if (r30 == 0) goto L_0x02b0
            r16 = r9
            goto L_0x02b2
        L_0x02b0:
            r16 = r67
        L_0x02b2:
            if (r1 == 0) goto L_0x02b6
            r1 = r9
            goto L_0x02b8
        L_0x02b6:
            r1 = r68
        L_0x02b8:
            if (r3 == 0) goto L_0x02c1
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.ui.unit.TextUnit.f19177b
            long r24 = r3.a()
            goto L_0x02c3
        L_0x02c1:
            r24 = r69
        L_0x02c3:
            if (r2 == 0) goto L_0x02c7
            r2 = r9
            goto L_0x02c9
        L_0x02c7:
            r2 = r71
        L_0x02c9:
            if (r7 == 0) goto L_0x02cd
            r3 = r9
            goto L_0x02cf
        L_0x02cd:
            r3 = r72
        L_0x02cf:
            if (r6 == 0) goto L_0x02d8
            androidx.compose.ui.unit.TextUnit$Companion r6 = androidx.compose.ui.unit.TextUnit.f19177b
            long r6 = r6.a()
            goto L_0x02da
        L_0x02d8:
            r6 = r73
        L_0x02da:
            if (r10 == 0) goto L_0x02e3
            androidx.compose.ui.text.style.TextOverflow$Companion r10 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r10 = r10.a()
            goto L_0x02e5
        L_0x02e3:
            r10 = r75
        L_0x02e5:
            if (r11 == 0) goto L_0x02ea
            r11 = r21
            goto L_0x02ec
        L_0x02ea:
            r11 = r76
        L_0x02ec:
            if (r17 == 0) goto L_0x02f2
            r17 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02f4
        L_0x02f2:
            r17 = r77
        L_0x02f4:
            if (r18 == 0) goto L_0x02f7
            goto L_0x02f9
        L_0x02f7:
            r21 = r78
        L_0x02f9:
            if (r19 == 0) goto L_0x02fc
            goto L_0x02fe
        L_0x02fc:
            r9 = r79
        L_0x02fe:
            r18 = r13 & r28
            r60 = r1
            if (r18 == 0) goto L_0x0326
            androidx.compose.runtime.ProvidableCompositionLocal r1 = f11427a
            java.lang.Object r1 = r0.C(r1)
            androidx.compose.ui.text.TextStyle r1 = (androidx.compose.ui.text.TextStyle) r1
            r18 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r8 = r8 & r18
            r56 = r1
        L_0x0313:
            r13 = r8
            r20 = r9
            r18 = r11
            r19 = r17
            r8 = r2
            r9 = r3
            r17 = r10
            r1 = r26
            r3 = r60
            r10 = r6
            r6 = r24
            goto L_0x0329
        L_0x0326:
            r56 = r80
            goto L_0x0313
        L_0x0329:
            r0.U()
            boolean r24 = androidx.compose.runtime.ComposerKt.P()
            if (r24 == 0) goto L_0x033d
            r15 = 1809465675(0x6bda414b, float:5.2770833E26)
            r73 = r12
            java.lang.String r12 = "androidx.compose.material3.Text (Text.kt:120)"
            androidx.compose.runtime.ComposerKt.Y(r15, r4, r13, r12)
            goto L_0x033f
        L_0x033d:
            r73 = r12
        L_0x033f:
            r12 = -565217106(0xffffffffde4f78ae, float:-3.73747257E18)
            r0.X(r12)
            r24 = 16
            int r12 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r12 == 0) goto L_0x034e
            r25 = r22
            goto L_0x0372
        L_0x034e:
            r12 = -565216333(0xffffffffde4f7bb3, float:-3.73768505E18)
            r0.X(r12)
            long r24 = r56.h()
            r26 = 16
            int r12 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r12 == 0) goto L_0x035f
            goto L_0x036d
        L_0x035f:
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.material3.ContentColorKt.a()
            java.lang.Object r12 = r0.C(r12)
            androidx.compose.ui.graphics.Color r12 = (androidx.compose.ui.graphics.Color) r12
            long r24 = r12.v()
        L_0x036d:
            r0.M()
            r25 = r24
        L_0x0372:
            r0.M()
            if (r9 == 0) goto L_0x037e
            int r12 = r9.n()
        L_0x037b:
            r44 = r12
            goto L_0x0385
        L_0x037e:
            androidx.compose.ui.text.style.TextAlign$Companion r12 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r12 = r12.g()
            goto L_0x037b
        L_0x0385:
            r54 = 16609104(0xfd6f50, float:2.3274312E-38)
            r55 = 0
            r31 = 0
            r33 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r42 = 0
            r43 = 0
            r45 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r24 = r56
            r27 = r1
            r29 = r16
            r30 = r14
            r32 = r3
            r34 = r6
            r41 = r8
            r46 = r10
            androidx.compose.ui.text.TextStyle r12 = androidx.compose.ui.text.TextStyle.L(r24, r25, r27, r29, r30, r31, r32, r33, r34, r36, r37, r38, r39, r41, r42, r43, r44, r45, r46, r48, r49, r50, r51, r52, r53, r54, r55)
            r15 = r4 & 126(0x7e, float:1.77E-43)
            r74 = r1
            int r1 = r13 >> 9
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r15
            int r2 = r13 << 6
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r2
            r1 = r1 | r13
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r2
            r1 = r1 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r2
            r1 = r1 | r13
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r13
            r1 = r1 | r2
            int r2 = r4 << 18
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r4
            r1 = r1 | r2
            r2 = 256(0x100, float:3.59E-43)
            r4 = 0
            r60 = r59
            r61 = r5
            r62 = r12
            r63 = r20
            r64 = r17
            r65 = r18
            r66 = r19
            r67 = r21
            r68 = r4
            r69 = r73
            r70 = r0
            r71 = r1
            r72 = r2
            androidx.compose.foundation.text.BasicTextKt.f(r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0407
            androidx.compose.runtime.ComposerKt.X()
        L_0x0407:
            r2 = r5
            r13 = r8
            r8 = r14
            r5 = r73
            r14 = r9
            r9 = r16
            r15 = r10
            r10 = r3
            r11 = r6
            r3 = r22
            r22 = r56
            r6 = r74
            r58 = r21
            r21 = r20
            r20 = r58
            goto L_0x0444
        L_0x041f:
            r0.B()
            r2 = r60
            r3 = r61
            r5 = r63
            r6 = r64
            r8 = r66
            r9 = r67
            r10 = r68
            r11 = r69
            r13 = r71
            r14 = r72
            r15 = r73
            r17 = r75
            r18 = r76
            r19 = r77
            r20 = r78
            r21 = r79
            r22 = r80
        L_0x0444:
            androidx.compose.runtime.ScopeUpdateScope r1 = r0.x()
            if (r1 == 0) goto L_0x0462
            androidx.compose.material3.p7 r0 = new androidx.compose.material3.p7
            r60 = r0
            r57 = r1
            r1 = r59
            r23 = r82
            r24 = r83
            r25 = r84
            r0.<init>(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = r60
            r0 = r57
            r0.a(r1)
        L_0x0462:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.j(java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.foundation.text.TextAutoSize, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: androidx.compose.ui.text.AnnotatedString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:308:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(androidx.compose.ui.text.AnnotatedString r67, androidx.compose.ui.Modifier r68, long r69, androidx.compose.foundation.text.TextAutoSize r71, long r72, androidx.compose.ui.text.font.FontStyle r74, androidx.compose.ui.text.font.FontWeight r75, androidx.compose.ui.text.font.FontFamily r76, long r77, androidx.compose.ui.text.style.TextDecoration r79, androidx.compose.ui.text.style.TextAlign r80, long r81, int r83, boolean r84, int r85, int r86, java.util.Map r87, kotlin.jvm.functions.Function1 r88, androidx.compose.ui.text.TextStyle r89, androidx.compose.runtime.Composer r90, int r91, int r92, int r93) {
        /*
            r1 = r67
            r15 = r91
            r14 = r92
            r13 = r93
            r0 = 292247417(0x116b5779, float:1.8565186E-28)
            r2 = r90
            androidx.compose.runtime.Composer r0 = r2.q(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0018
            r2 = r15 | 6
            goto L_0x0028
        L_0x0018:
            r2 = r15 & 6
            if (r2 != 0) goto L_0x0027
            boolean r2 = r0.W(r1)
            if (r2 == 0) goto L_0x0024
            r2 = 4
            goto L_0x0025
        L_0x0024:
            r2 = 2
        L_0x0025:
            r2 = r2 | r15
            goto L_0x0028
        L_0x0027:
            r2 = r15
        L_0x0028:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0031
            r2 = r2 | 48
        L_0x002e:
            r8 = r68
            goto L_0x0043
        L_0x0031:
            r8 = r15 & 48
            if (r8 != 0) goto L_0x002e
            r8 = r68
            boolean r9 = r0.W(r8)
            if (r9 == 0) goto L_0x0040
            r9 = 32
            goto L_0x0042
        L_0x0040:
            r9 = 16
        L_0x0042:
            r2 = r2 | r9
        L_0x0043:
            r9 = r13 & 4
            if (r9 == 0) goto L_0x004c
            r2 = r2 | 384(0x180, float:5.38E-43)
            r6 = r69
            goto L_0x005f
        L_0x004c:
            r12 = r15 & 384(0x180, float:5.38E-43)
            r6 = r69
            if (r12 != 0) goto L_0x005f
            boolean r16 = r0.j(r6)
            if (r16 == 0) goto L_0x005b
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r2 = r2 | r16
        L_0x005f:
            r16 = r13 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x006c
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r3 = r71
            goto L_0x007f
        L_0x006c:
            r3 = r15 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0069
            r3 = r71
            boolean r20 = r0.l(r3)
            if (r20 == 0) goto L_0x007b
            r20 = r18
            goto L_0x007d
        L_0x007b:
            r20 = r17
        L_0x007d:
            r2 = r2 | r20
        L_0x007f:
            r20 = r13 & 16
            r21 = 8192(0x2000, float:1.14794E-41)
            r22 = 16384(0x4000, float:2.2959E-41)
            if (r20 == 0) goto L_0x008c
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r11 = r72
            goto L_0x009f
        L_0x008c:
            r10 = r15 & 24576(0x6000, float:3.4438E-41)
            r11 = r72
            if (r10 != 0) goto L_0x009f
            boolean r25 = r0.j(r11)
            if (r25 == 0) goto L_0x009b
            r25 = r22
            goto L_0x009d
        L_0x009b:
            r25 = r21
        L_0x009d:
            r2 = r2 | r25
        L_0x009f:
            r25 = r13 & 32
            r26 = 65536(0x10000, float:9.18355E-41)
            r27 = 131072(0x20000, float:1.83671E-40)
            r28 = 196608(0x30000, float:2.75506E-40)
            if (r25 == 0) goto L_0x00ae
            r2 = r2 | r28
            r10 = r74
            goto L_0x00c1
        L_0x00ae:
            r29 = r15 & r28
            r10 = r74
            if (r29 != 0) goto L_0x00c1
            boolean r30 = r0.W(r10)
            if (r30 == 0) goto L_0x00bd
            r30 = r27
            goto L_0x00bf
        L_0x00bd:
            r30 = r26
        L_0x00bf:
            r2 = r2 | r30
        L_0x00c1:
            r30 = r13 & 64
            r31 = 1572864(0x180000, float:2.204052E-39)
            if (r30 == 0) goto L_0x00cc
            r2 = r2 | r31
            r4 = r75
            goto L_0x00df
        L_0x00cc:
            r32 = r15 & r31
            r4 = r75
            if (r32 != 0) goto L_0x00df
            boolean r33 = r0.W(r4)
            if (r33 == 0) goto L_0x00db
            r33 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r33 = 524288(0x80000, float:7.34684E-40)
        L_0x00dd:
            r2 = r2 | r33
        L_0x00df:
            r3 = r13 & 128(0x80, float:1.794E-43)
            r33 = 12582912(0xc00000, float:1.7632415E-38)
            if (r3 == 0) goto L_0x00ea
            r2 = r2 | r33
            r4 = r76
            goto L_0x00fd
        L_0x00ea:
            r34 = r15 & r33
            r4 = r76
            if (r34 != 0) goto L_0x00fd
            boolean r34 = r0.W(r4)
            if (r34 == 0) goto L_0x00f9
            r34 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f9:
            r34 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r2 = r2 | r34
        L_0x00fd:
            r4 = r13 & 256(0x100, float:3.59E-43)
            r34 = 100663296(0x6000000, float:2.4074124E-35)
            if (r4 == 0) goto L_0x0108
            r2 = r2 | r34
            r6 = r77
            goto L_0x011b
        L_0x0108:
            r34 = r15 & r34
            r6 = r77
            if (r34 != 0) goto L_0x011b
            boolean r34 = r0.j(r6)
            if (r34 == 0) goto L_0x0117
            r34 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0119
        L_0x0117:
            r34 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0119:
            r2 = r2 | r34
        L_0x011b:
            r6 = r13 & 512(0x200, float:7.175E-43)
            r7 = 805306368(0x30000000, float:4.656613E-10)
            if (r6 == 0) goto L_0x0125
            r2 = r2 | r7
        L_0x0122:
            r7 = r79
            goto L_0x0137
        L_0x0125:
            r7 = r7 & r15
            if (r7 != 0) goto L_0x0122
            r7 = r79
            boolean r34 = r0.W(r7)
            if (r34 == 0) goto L_0x0133
            r34 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0135
        L_0x0133:
            r34 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0135:
            r2 = r2 | r34
        L_0x0137:
            r7 = r13 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x0140
            r19 = r14 | 6
            r8 = r80
            goto L_0x0156
        L_0x0140:
            r34 = r14 & 6
            r8 = r80
            if (r34 != 0) goto L_0x0154
            boolean r34 = r0.W(r8)
            if (r34 == 0) goto L_0x014f
            r19 = 4
            goto L_0x0151
        L_0x014f:
            r19 = 2
        L_0x0151:
            r19 = r14 | r19
            goto L_0x0156
        L_0x0154:
            r19 = r14
        L_0x0156:
            r8 = r13 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0161
            r19 = r19 | 48
            r10 = r81
        L_0x015e:
            r12 = r19
            goto L_0x0175
        L_0x0161:
            r34 = r14 & 48
            r10 = r81
            if (r34 != 0) goto L_0x015e
            boolean r12 = r0.j(r10)
            if (r12 == 0) goto L_0x0170
            r24 = 32
            goto L_0x0172
        L_0x0170:
            r24 = 16
        L_0x0172:
            r19 = r19 | r24
            goto L_0x015e
        L_0x0175:
            r10 = r13 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x017e
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x017b:
            r11 = r83
            goto L_0x0191
        L_0x017e:
            r11 = r14 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x017b
            r11 = r83
            boolean r19 = r0.i(r11)
            if (r19 == 0) goto L_0x018d
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x018f
        L_0x018d:
            r23 = 128(0x80, float:1.794E-43)
        L_0x018f:
            r12 = r12 | r23
        L_0x0191:
            r11 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x019a
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x0197:
            r1 = r84
            goto L_0x01aa
        L_0x019a:
            r1 = r14 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0197
            r1 = r84
            boolean r19 = r0.d(r1)
            if (r19 == 0) goto L_0x01a8
            r17 = r18
        L_0x01a8:
            r12 = r12 | r17
        L_0x01aa:
            r1 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x01b5
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
            r17 = r1
        L_0x01b2:
            r1 = r85
            goto L_0x01c7
        L_0x01b5:
            r17 = r1
            r1 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x01b2
            r1 = r85
            boolean r18 = r0.i(r1)
            if (r18 == 0) goto L_0x01c5
            r21 = r22
        L_0x01c5:
            r12 = r12 | r21
        L_0x01c7:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r13 & r18
            if (r18 == 0) goto L_0x01d3
            r12 = r12 | r28
            r1 = r86
            goto L_0x01e6
        L_0x01d3:
            r19 = r14 & r28
            r1 = r86
            if (r19 != 0) goto L_0x01e6
            boolean r19 = r0.i(r1)
            if (r19 == 0) goto L_0x01e2
            r19 = r27
            goto L_0x01e4
        L_0x01e2:
            r19 = r26
        L_0x01e4:
            r12 = r12 | r19
        L_0x01e6:
            r19 = r13 & r26
            if (r19 == 0) goto L_0x01ef
            r12 = r12 | r31
            r1 = r87
            goto L_0x0202
        L_0x01ef:
            r21 = r14 & r31
            r1 = r87
            if (r21 != 0) goto L_0x0202
            boolean r21 = r0.l(r1)
            if (r21 == 0) goto L_0x01fe
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0200
        L_0x01fe:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x0200:
            r12 = r12 | r21
        L_0x0202:
            r21 = r13 & r27
            if (r21 == 0) goto L_0x020b
            r12 = r12 | r33
            r1 = r88
            goto L_0x021e
        L_0x020b:
            r22 = r14 & r33
            r1 = r88
            if (r22 != 0) goto L_0x021e
            boolean r22 = r0.l(r1)
            if (r22 == 0) goto L_0x021a
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x021c
        L_0x021a:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x021c:
            r12 = r12 | r22
        L_0x021e:
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            r22 = r14 & r22
            if (r22 != 0) goto L_0x023a
            r22 = 262144(0x40000, float:3.67342E-40)
            r22 = r13 & r22
            r1 = r89
            if (r22 != 0) goto L_0x0235
            boolean r22 = r0.W(r1)
            if (r22 == 0) goto L_0x0235
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0237
        L_0x0235:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0237:
            r12 = r12 | r22
            goto L_0x023c
        L_0x023a:
            r1 = r89
        L_0x023c:
            r22 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r2 & r22
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            r22 = 1
            if (r1 != r14) goto L_0x0254
            r1 = 38347923(0x2492493, float:1.4777644E-37)
            r1 = r1 & r12
            r14 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 == r14) goto L_0x0252
            goto L_0x0254
        L_0x0252:
            r1 = 0
            goto L_0x0256
        L_0x0254:
            r1 = r22
        L_0x0256:
            r14 = r2 & 1
            boolean r1 = r0.E(r1, r14)
            if (r1 == 0) goto L_0x04a3
            r0.p()
            r1 = r15 & 1
            if (r1 == 0) goto L_0x029f
            boolean r1 = r0.J()
            if (r1 == 0) goto L_0x026c
            goto L_0x029f
        L_0x026c:
            r0.B()
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r13
            if (r1 == 0) goto L_0x0278
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r12 = r12 & r1
        L_0x0278:
            r1 = r68
            r23 = r69
            r9 = r71
            r26 = r72
            r14 = r74
            r16 = r75
            r3 = r76
            r28 = r77
            r4 = r79
            r5 = r80
            r6 = r81
            r8 = r83
            r10 = r84
            r11 = r85
            r17 = r86
            r18 = r87
            r19 = r89
            r13 = r12
            r12 = r88
            goto L_0x0363
        L_0x029f:
            if (r5 == 0) goto L_0x02a4
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            goto L_0x02a6
        L_0x02a4:
            r1 = r68
        L_0x02a6:
            if (r9 == 0) goto L_0x02af
            androidx.compose.ui.graphics.Color$Companion r5 = androidx.compose.ui.graphics.Color.f15975b
            long r23 = r5.f()
            goto L_0x02b1
        L_0x02af:
            r23 = r69
        L_0x02b1:
            r5 = 0
            if (r16 == 0) goto L_0x02b6
            r9 = r5
            goto L_0x02b8
        L_0x02b6:
            r9 = r71
        L_0x02b8:
            if (r20 == 0) goto L_0x02c1
            androidx.compose.ui.unit.TextUnit$Companion r14 = androidx.compose.ui.unit.TextUnit.f19177b
            long r26 = r14.a()
            goto L_0x02c3
        L_0x02c1:
            r26 = r72
        L_0x02c3:
            if (r25 == 0) goto L_0x02c7
            r14 = r5
            goto L_0x02c9
        L_0x02c7:
            r14 = r74
        L_0x02c9:
            if (r30 == 0) goto L_0x02ce
            r16 = r5
            goto L_0x02d0
        L_0x02ce:
            r16 = r75
        L_0x02d0:
            if (r3 == 0) goto L_0x02d4
            r3 = r5
            goto L_0x02d6
        L_0x02d4:
            r3 = r76
        L_0x02d6:
            if (r4 == 0) goto L_0x02df
            androidx.compose.ui.unit.TextUnit$Companion r4 = androidx.compose.ui.unit.TextUnit.f19177b
            long r28 = r4.a()
            goto L_0x02e1
        L_0x02df:
            r28 = r77
        L_0x02e1:
            if (r6 == 0) goto L_0x02e5
            r4 = r5
            goto L_0x02e7
        L_0x02e5:
            r4 = r79
        L_0x02e7:
            if (r7 == 0) goto L_0x02ea
            goto L_0x02ec
        L_0x02ea:
            r5 = r80
        L_0x02ec:
            if (r8 == 0) goto L_0x02f5
            androidx.compose.ui.unit.TextUnit$Companion r6 = androidx.compose.ui.unit.TextUnit.f19177b
            long r6 = r6.a()
            goto L_0x02f7
        L_0x02f5:
            r6 = r81
        L_0x02f7:
            if (r10 == 0) goto L_0x0300
            androidx.compose.ui.text.style.TextOverflow$Companion r8 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r8 = r8.a()
            goto L_0x0302
        L_0x0300:
            r8 = r83
        L_0x0302:
            if (r11 == 0) goto L_0x0307
            r10 = r22
            goto L_0x0309
        L_0x0307:
            r10 = r84
        L_0x0309:
            if (r17 == 0) goto L_0x030f
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0311
        L_0x030f:
            r11 = r85
        L_0x0311:
            if (r18 == 0) goto L_0x0316
            r17 = r22
            goto L_0x0318
        L_0x0316:
            r17 = r86
        L_0x0318:
            if (r19 == 0) goto L_0x031f
            java.util.Map r18 = kotlin.collections.MapsKt.h()
            goto L_0x0321
        L_0x031f:
            r18 = r87
        L_0x0321:
            r68 = r1
            if (r21 == 0) goto L_0x033e
            java.lang.Object r1 = r0.g()
            androidx.compose.runtime.Composer$Companion r19 = androidx.compose.runtime.Composer.f14567a
            r69 = r3
            java.lang.Object r3 = r19.a()
            if (r1 != r3) goto L_0x033b
            androidx.compose.material3.m7 r1 = new androidx.compose.material3.m7
            r1.<init>()
            r0.N(r1)
        L_0x033b:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            goto L_0x0342
        L_0x033e:
            r69 = r3
            r1 = r88
        L_0x0342:
            r3 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r13
            if (r3 == 0) goto L_0x035d
            androidx.compose.runtime.ProvidableCompositionLocal r3 = f11427a
            java.lang.Object r3 = r0.C(r3)
            androidx.compose.ui.text.TextStyle r3 = (androidx.compose.ui.text.TextStyle) r3
            r19 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r12 = r12 & r19
            r19 = r3
            r13 = r12
            r3 = r69
        L_0x0359:
            r12 = r1
            r1 = r68
            goto L_0x0363
        L_0x035d:
            r3 = r69
            r19 = r89
            r13 = r12
            goto L_0x0359
        L_0x0363:
            r0.U()
            boolean r20 = androidx.compose.runtime.ComposerKt.P()
            if (r20 == 0) goto L_0x0377
            r15 = 292247417(0x116b5779, float:1.8565186E-28)
            r83 = r9
            java.lang.String r9 = "androidx.compose.material3.Text (Text.kt:228)"
            androidx.compose.runtime.ComposerKt.Y(r15, r2, r13, r9)
            goto L_0x0379
        L_0x0377:
            r83 = r9
        L_0x0379:
            r9 = 1676919644(0x63f3c35c, float:8.993272E21)
            r0.X(r9)
            r20 = 16
            int r9 = (r23 > r20 ? 1 : (r23 == r20 ? 0 : -1))
            if (r9 == 0) goto L_0x0388
            r34 = r23
            goto L_0x03ac
        L_0x0388:
            r9 = 1676920417(0x63f3c661, float:8.993707E21)
            r0.X(r9)
            long r20 = r19.h()
            r30 = 16
            int r9 = (r20 > r30 ? 1 : (r20 == r30 ? 0 : -1))
            if (r9 == 0) goto L_0x0399
            goto L_0x03a7
        L_0x0399:
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.material3.ContentColorKt.a()
            java.lang.Object r9 = r0.C(r9)
            androidx.compose.ui.graphics.Color r9 = (androidx.compose.ui.graphics.Color) r9
            long r20 = r9.v()
        L_0x03a7:
            r0.M()
            r34 = r20
        L_0x03ac:
            r0.M()
            r9 = 0
            androidx.compose.ui.text.TextLinkStyles r9 = r(r0, r9)
            r15 = r2 & 14
            r84 = r11
            r11 = 4
            if (r15 != r11) goto L_0x03bc
            goto L_0x03be
        L_0x03bc:
            r22 = 0
        L_0x03be:
            boolean r11 = r0.W(r9)
            r11 = r22 | r11
            java.lang.Object r15 = r0.g()
            if (r11 != 0) goto L_0x03d2
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r15 != r11) goto L_0x03d5
        L_0x03d2:
            r11 = r67
            goto L_0x03d8
        L_0x03d5:
            r11 = r67
            goto L_0x03df
        L_0x03d8:
            androidx.compose.ui.text.AnnotatedString r15 = o(r11, r9)
            r0.N(r15)
        L_0x03df:
            r9 = r15
            androidx.compose.ui.text.AnnotatedString r9 = (androidx.compose.ui.text.AnnotatedString) r9
            if (r5 == 0) goto L_0x03eb
            int r15 = r5.n()
        L_0x03e8:
            r53 = r15
            goto L_0x03f2
        L_0x03eb:
            androidx.compose.ui.text.style.TextAlign$Companion r15 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r15 = r15.g()
            goto L_0x03e8
        L_0x03f2:
            r63 = 16609104(0xfd6f50, float:2.3274312E-38)
            r64 = 0
            r40 = 0
            r42 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r51 = 0
            r52 = 0
            r54 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r33 = r19
            r36 = r26
            r38 = r16
            r39 = r14
            r41 = r3
            r43 = r28
            r50 = r4
            r55 = r6
            androidx.compose.ui.text.TextStyle r15 = androidx.compose.ui.text.TextStyle.L(r33, r34, r36, r38, r39, r40, r41, r42, r43, r45, r46, r47, r48, r50, r51, r52, r53, r54, r55, r57, r58, r59, r60, r61, r62, r63, r64)
            r20 = r2 & 112(0x70, float:1.57E-43)
            r85 = r3
            int r3 = r13 >> 12
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r3 = r20 | r3
            int r13 = r13 << 6
            r20 = 57344(0xe000, float:8.0356E-41)
            r20 = r13 & r20
            r3 = r3 | r20
            r20 = 458752(0x70000, float:6.42848E-40)
            r20 = r13 & r20
            r3 = r3 | r20
            r20 = 3670016(0x380000, float:5.142788E-39)
            r20 = r13 & r20
            r3 = r3 | r20
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            r20 = r13 & r20
            r3 = r3 | r20
            r20 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r20
            r3 = r3 | r13
            int r2 = r2 >> 9
            r2 = r2 & 14
            r13 = 512(0x200, float:7.175E-43)
            r20 = 0
            r68 = r9
            r69 = r1
            r70 = r15
            r71 = r12
            r72 = r8
            r73 = r10
            r74 = r84
            r75 = r17
            r76 = r18
            r77 = r20
            r78 = r83
            r79 = r0
            r80 = r3
            r81 = r2
            r82 = r13
            androidx.compose.foundation.text.BasicTextKt.d(r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0485
            androidx.compose.runtime.ComposerKt.X()
        L_0x0485:
            r2 = r1
            r13 = r4
            r22 = r12
            r9 = r16
            r20 = r17
            r21 = r18
            r3 = r23
            r15 = r6
            r17 = r8
            r18 = r10
            r8 = r14
            r23 = r19
            r6 = r26
            r19 = r84
            r10 = r85
            r14 = r5
            r5 = r83
            goto L_0x04cc
        L_0x04a3:
            r11 = r67
            r0.B()
            r2 = r68
            r3 = r69
            r5 = r71
            r6 = r72
            r8 = r74
            r9 = r75
            r10 = r76
            r28 = r77
            r13 = r79
            r14 = r80
            r15 = r81
            r17 = r83
            r18 = r84
            r19 = r85
            r20 = r86
            r21 = r87
            r22 = r88
            r23 = r89
        L_0x04cc:
            androidx.compose.runtime.ScopeUpdateScope r12 = r0.x()
            if (r12 == 0) goto L_0x04ed
            androidx.compose.material3.n7 r1 = new androidx.compose.material3.n7
            r0 = r1
            r65 = r1
            r1 = r67
            r66 = r12
            r11 = r28
            r24 = r91
            r25 = r92
            r26 = r93
            r0.<init>(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = r65
            r0 = r66
            r0.a(r1)
        L_0x04ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.k(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, androidx.compose.foundation.text.TextAutoSize, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final Unit l(String str, Modifier modifier, long j2, TextAutoSize textAutoSize, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, int i4, Function1 function1, TextStyle textStyle, int i5, int i6, int i7, Composer composer, int i8) {
        j(str, modifier, j2, textAutoSize, j3, fontStyle, fontWeight, fontFamily, j4, textDecoration, textAlign, j5, i2, z2, i3, i4, function1, textStyle, composer, RecomposeScopeImplKt.a(i5 | 1), RecomposeScopeImplKt.a(i6), i7);
        return Unit.f40552a;
    }

    public static final Unit m(TextLayoutResult textLayoutResult) {
        return Unit.f40552a;
    }

    public static final Unit n(AnnotatedString annotatedString, Modifier modifier, long j2, TextAutoSize textAutoSize, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, int i4, Map map, Function1 function1, TextStyle textStyle, int i5, int i6, int i7, Composer composer, int i8) {
        k(annotatedString, modifier, j2, textAutoSize, j3, fontStyle, fontWeight, fontFamily, j4, textDecoration, textAlign, j5, i2, z2, i3, i4, map, function1, textStyle, composer, RecomposeScopeImplKt.a(i5 | 1), RecomposeScopeImplKt.a(i6), i7);
        return Unit.f40552a;
    }

    public static final AnnotatedString o(AnnotatedString annotatedString, TextLinkStyles textLinkStyles) {
        return annotatedString.q(new C0224q7(textLinkStyles));
    }

    public static final AnnotatedString.Range p(TextLinkStyles textLinkStyles, AnnotatedString.Range range) {
        AnnotatedString.Annotation annotation = (AnnotatedString.Annotation) range.g();
        if (annotation instanceof LinkAnnotation.Url) {
            LinkAnnotation.Url url = (LinkAnnotation.Url) annotation;
            if (url.b() == null) {
                Intrinsics.g(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation.Url>");
                return AnnotatedString.Range.e(range, LinkAnnotation.Url.d(url, (String) null, textLinkStyles, (LinkInteractionListener) null, 5, (Object) null), 0, 0, (String) null, 14, (Object) null);
            }
        }
        if (annotation instanceof LinkAnnotation.Clickable) {
            LinkAnnotation.Clickable clickable = (LinkAnnotation.Clickable) annotation;
            if (clickable.b() == null) {
                Intrinsics.g(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation.Clickable>");
                return AnnotatedString.Range.e(range, LinkAnnotation.Clickable.d(clickable, (String) null, textLinkStyles, (LinkInteractionListener) null, 5, (Object) null), 0, 0, (String) null, 14, (Object) null);
            }
        }
        return range;
    }

    public static final ProvidableCompositionLocal q() {
        return f11427a;
    }

    public static final TextLinkStyles r(Composer composer, int i2) {
        Composer composer2 = composer;
        if (ComposerKt.P()) {
            ComposerKt.Y(1113329403, i2, -1, "androidx.compose.material3.rememberTextLinkStyles (Text.kt:481)");
        }
        long N = MaterialTheme.f10273a.a(composer2, 6).N();
        boolean j2 = composer2.j(N);
        Object g2 = composer.g();
        if (j2 || g2 == Composer.f14567a.a()) {
            TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(N, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, TextDecoration.f19089b.d(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61438, (DefaultConstructorMarker) null), (SpanStyle) null, (SpanStyle) null, (SpanStyle) null, 14, (DefaultConstructorMarker) null);
            composer2.N(textLinkStyles);
            g2 = textLinkStyles;
        }
        TextLinkStyles textLinkStyles2 = (TextLinkStyles) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return textLinkStyles2;
    }
}
