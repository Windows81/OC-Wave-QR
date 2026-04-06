package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DateRangePickerDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final DateRangePickerDefaults f9781a = new DateRangePickerDefaults();

    public static final Unit g(String str, String str2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m0(semanticsPropertyReceiver, LiveRegionMode.f18031b.b());
        SemanticsPropertiesKt.e0(semanticsPropertyReceiver, str + ", " + str2);
        return Unit.f40552a;
    }

    public static final Unit h(DateRangePickerDefaults dateRangePickerDefaults, Long l2, Long l3, int i2, DatePickerFormatter datePickerFormatter, Modifier modifier, long j2, String str, String str2, Function2 function2, Function2 function22, Function2 function23, Locale locale, int i3, int i4, Composer composer, int i5) {
        dateRangePickerDefaults.e(l2, l3, i2, datePickerFormatter, modifier, j2, str, str2, function2, function22, function23, locale, composer, RecomposeScopeImplKt.a(i3 | 1), RecomposeScopeImplKt.a(i4));
        return Unit.f40552a;
    }

    public static final Unit i(DateRangePickerDefaults dateRangePickerDefaults, Long l2, Long l3, int i2, DatePickerFormatter datePickerFormatter, Modifier modifier, long j2, int i3, int i4, Composer composer, int i5) {
        dateRangePickerDefaults.f(l2, l3, i2, datePickerFormatter, modifier, j2, composer, RecomposeScopeImplKt.a(i3 | 1), i4);
        return Unit.f40552a;
    }

    public static final Unit k(DateRangePickerDefaults dateRangePickerDefaults, int i2, Modifier modifier, long j2, int i3, int i4, Composer composer, int i5) {
        dateRangePickerDefaults.j(i2, modifier, j2, composer, RecomposeScopeImplKt.a(i3 | 1), i4);
        return Unit.f40552a;
    }

    public final void e(Long l2, Long l3, int i2, DatePickerFormatter datePickerFormatter, Modifier modifier, long j2, String str, String str2, Function2 function2, Function2 function22, Function2 function23, Locale locale, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        Composer composer2;
        Long l4 = l2;
        Long l5 = l3;
        int i7 = i2;
        DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
        Modifier modifier2 = modifier;
        String str3 = str;
        String str4 = str2;
        Function2 function24 = function2;
        Function2 function25 = function22;
        Function2 function26 = function23;
        Locale locale2 = locale;
        int i8 = i3;
        Composer q2 = composer.q(1381313200);
        int i9 = 2;
        if ((i8 & 6) == 0) {
            i5 = (q2.W(l4) ? 4 : 2) | i8;
        } else {
            i5 = i8;
        }
        int i10 = 16;
        if ((i8 & 48) == 0) {
            i5 |= q2.W(l5) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i5 |= q2.i(i7) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i5 |= (i8 & 4096) == 0 ? q2.W(datePickerFormatter2) : q2.l(datePickerFormatter2) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i5 |= q2.W(modifier2) ? 16384 : 8192;
        }
        long j3 = j2;
        if ((196608 & i8) == 0) {
            i5 |= q2.j(j3) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= q2.W(str3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= q2.W(str4) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= q2.l(function24) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= q2.l(function25) ? 536870912 : 268435456;
        }
        int i11 = i5;
        if ((i4 & 6) == 0) {
            if (q2.l(function26)) {
                i9 = 4;
            }
            i6 = i4 | i9;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            if (q2.l(locale2)) {
                i10 = 32;
            }
            i6 |= i10;
        }
        int i12 = i6;
        if (q2.E(((306783379 & i11) == 306783378 && (i12 & 19) == 18) ? false : true, i11 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1381313200, i11, i12, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:468)");
            }
            DatePickerFormatter datePickerFormatter3 = datePickerFormatter;
            Composer composer3 = q2;
            Locale locale3 = locale;
            int i13 = i12;
            int i14 = i11;
            Locale locale4 = locale;
            String b2 = DatePickerFormatter.b(datePickerFormatter3, l2, locale3, false, 4, (Object) null);
            String b3 = DatePickerFormatter.b(datePickerFormatter3, l3, locale3, false, 4, (Object) null);
            String a2 = datePickerFormatter2.a(l4, locale4, true);
            String str5 = "";
            if (a2 == null) {
                composer2 = composer3;
                composer2.X(620891895);
                DisplayMode.Companion companion = DisplayMode.f9856b;
                if (DisplayMode.f(i7, companion.b())) {
                    composer2.X(297125251);
                    Strings.Companion companion2 = Strings.f12320b;
                    a2 = Strings_androidKt.b(Strings.a(R.string.f10670q), composer2, 0);
                    composer2.M();
                } else if (DisplayMode.f(i7, companion.a())) {
                    composer2.X(297128222);
                    Strings.Companion companion3 = Strings.f12320b;
                    a2 = Strings_androidKt.b(Strings.a(R.string.f10665l), composer2, 0);
                    composer2.M();
                } else {
                    composer2.X(621113326);
                    composer2.M();
                    a2 = str5;
                }
                composer2.M();
            } else {
                composer2 = composer3;
                composer2.X(297117483);
                composer2.M();
            }
            String a3 = datePickerFormatter2.a(l5, locale4, true);
            if (a3 == null) {
                composer2.X(621382935);
                DisplayMode.Companion companion4 = DisplayMode.f9856b;
                if (DisplayMode.f(i7, companion4.b())) {
                    composer2.X(297141091);
                    Strings.Companion companion5 = Strings.f12320b;
                    str5 = Strings_androidKt.b(Strings.a(R.string.f10670q), composer2, 0);
                    composer2.M();
                } else if (DisplayMode.f(i7, companion4.a())) {
                    composer2.X(297144062);
                    Strings.Companion companion6 = Strings.f12320b;
                    str5 = Strings_androidKt.b(Strings.a(R.string.f10665l), composer2, 0);
                    composer2.M();
                } else {
                    composer2.X(621604366);
                    composer2.M();
                }
                composer2.M();
                a3 = str5;
            } else {
                composer2.X(297133385);
                composer2.M();
            }
            String str6 = str3 + ": " + a2;
            String str7 = str4 + ": " + a3;
            boolean W = composer2.W(str6) | composer2.W(str7);
            Object g2 = composer2.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new M1(str6, str7);
                composer2.N(g2);
            }
            Modifier a4 = SemanticsModifierKt.a(modifier2, (Function1) g2);
            MeasurePolicy b4 = RowKt.b(Arrangement.f3739a.n(Dp.m((float) 4)), Alignment.f15444a.i(), composer2, 54);
            int a5 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer2.I();
            Modifier e2 = ComposedModifierKt.e(composer2, a4);
            ComposeUiNode.Companion companion7 = ComposeUiNode.f17222h;
            Function0 a6 = companion7.a();
            if (composer2.v() == null) {
                ComposablesKt.d();
            }
            composer2.s();
            if (composer2.n()) {
                composer2.y(a6);
            } else {
                composer2.K();
            }
            Composer b5 = Updater.b(composer2);
            Updater.g(b5, b4, companion7.c());
            Updater.g(b5, I, companion7.e());
            Function2 b6 = companion7.b();
            if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a5))) {
                b5.N(Integer.valueOf(a5));
                b5.A(Integer.valueOf(a5), b6);
            }
            Updater.g(b5, e2, companion7.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            if (b2 != null) {
                composer2.X(-177386503);
                TextKt.j(b2, (Modifier) null, j2, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, (i14 >> 9) & 896, 0, 262138);
                composer2.M();
            } else {
                composer2.X(-177297192);
                function24.m(composer2, Integer.valueOf((i14 >> 24) & 14));
                composer2.M();
            }
            function23.m(composer2, Integer.valueOf(i13 & 14));
            if (b3 != null) {
                composer2.X(-177171301);
                TextKt.j(b3, (Modifier) null, j2, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, (i14 >> 9) & 896, 0, 262138);
                composer2.M();
                Function2 function27 = function22;
            } else {
                composer2.X(-177083974);
                function22.m(composer2, Integer.valueOf((i14 >> 27) & 14));
                composer2.M();
            }
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            N1 n1 = r0;
            N1 n12 = new N1(this, l2, l3, i2, datePickerFormatter, modifier, j2, str, str2, function2, function22, function23, locale, i3, i4);
            x2.a(n1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0109, code lost:
        if ((r31 & 32) != 0) goto L_0x010b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.lang.Long r22, java.lang.Long r23, int r24, androidx.compose.material3.DatePickerFormatter r25, androidx.compose.ui.Modifier r26, long r27, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r21 = this;
            r14 = r25
            r6 = r30
            r0 = 16
            r1 = 2
            r2 = 4
            r3 = 6
            r4 = 32
            r5 = 1655228151(0x62a8c6f7, float:1.556695E21)
            r7 = r29
            androidx.compose.runtime.Composer r7 = r7.q(r5)
            r12 = 1
            r8 = r31 & 1
            if (r8 == 0) goto L_0x001e
            r8 = r6 | 6
            r15 = r22
            goto L_0x0030
        L_0x001e:
            r8 = r6 & 6
            r15 = r22
            if (r8 != 0) goto L_0x002f
            boolean r8 = r7.W(r15)
            if (r8 == 0) goto L_0x002c
            r8 = r2
            goto L_0x002d
        L_0x002c:
            r8 = r1
        L_0x002d:
            r8 = r8 | r6
            goto L_0x0030
        L_0x002f:
            r8 = r6
        L_0x0030:
            r1 = r31 & 2
            if (r1 == 0) goto L_0x0039
            r8 = r8 | 48
        L_0x0036:
            r1 = r23
            goto L_0x0049
        L_0x0039:
            r1 = r6 & 48
            if (r1 != 0) goto L_0x0036
            r1 = r23
            boolean r9 = r7.W(r1)
            if (r9 == 0) goto L_0x0047
            r9 = r4
            goto L_0x0048
        L_0x0047:
            r9 = r0
        L_0x0048:
            r8 = r8 | r9
        L_0x0049:
            r2 = r31 & 4
            if (r2 == 0) goto L_0x0052
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r2 = r24
            goto L_0x0064
        L_0x0052:
            r2 = r6 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x004f
            r2 = r24
            boolean r9 = r7.i(r2)
            if (r9 == 0) goto L_0x0061
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r8 = r8 | r9
        L_0x0064:
            r9 = r31 & 8
            if (r9 == 0) goto L_0x006b
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x006b:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0084
            r9 = r6 & 4096(0x1000, float:5.74E-42)
            if (r9 != 0) goto L_0x0078
            boolean r9 = r7.W(r14)
            goto L_0x007c
        L_0x0078:
            boolean r9 = r7.l(r14)
        L_0x007c:
            if (r9 == 0) goto L_0x0081
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r8 = r8 | r9
        L_0x0084:
            r0 = r31 & 16
            if (r0 == 0) goto L_0x008d
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x008a:
            r9 = r26
            goto L_0x009f
        L_0x008d:
            r9 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x008a
            r9 = r26
            boolean r10 = r7.W(r9)
            if (r10 == 0) goto L_0x009c
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r8 = r8 | r10
        L_0x009f:
            r10 = 196608(0x30000, float:2.75506E-40)
            r10 = r10 & r6
            if (r10 != 0) goto L_0x00b9
            r10 = r31 & 32
            if (r10 != 0) goto L_0x00b3
            r10 = r27
            boolean r13 = r7.j(r10)
            if (r13 == 0) goto L_0x00b5
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b3:
            r10 = r27
        L_0x00b5:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r8 = r8 | r13
            goto L_0x00bb
        L_0x00b9:
            r10 = r27
        L_0x00bb:
            r13 = r31 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r13 == 0) goto L_0x00c6
            r8 = r8 | r16
        L_0x00c3:
            r13 = r21
            goto L_0x00d9
        L_0x00c6:
            r13 = r6 & r16
            if (r13 != 0) goto L_0x00c3
            r13 = r21
            boolean r16 = r7.W(r13)
            if (r16 == 0) goto L_0x00d5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r8 = r8 | r16
        L_0x00d9:
            r16 = 599187(0x92493, float:8.3964E-40)
            r5 = r8 & r16
            r3 = 599186(0x92492, float:8.39638E-40)
            r4 = 0
            if (r5 == r3) goto L_0x00e6
            r3 = r12
            goto L_0x00e7
        L_0x00e6:
            r3 = r4
        L_0x00e7:
            r5 = r8 & 1
            boolean r3 = r7.E(r3, r5)
            if (r3 == 0) goto L_0x01c3
            r7.p()
            r3 = r6 & 1
            r5 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r3 == 0) goto L_0x00ff
            boolean r3 = r7.J()
            if (r3 == 0) goto L_0x0102
        L_0x00ff:
            r3 = 32
            goto L_0x0110
        L_0x0102:
            r7.B()
            r3 = 32
            r0 = r31 & 32
            if (r0 == 0) goto L_0x010c
        L_0x010b:
            r8 = r8 & r5
        L_0x010c:
            r0 = r8
            r18 = r9
            goto L_0x0125
        L_0x0110:
            if (r0 == 0) goto L_0x0115
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r9 = r0
        L_0x0115:
            r0 = r31 & 32
            if (r0 == 0) goto L_0x010c
            androidx.compose.material3.DatePickerDefaults r0 = androidx.compose.material3.DatePickerDefaults.f9682a
            r3 = 6
            androidx.compose.material3.DatePickerColors r0 = r0.i(r7, r3)
            long r10 = r0.g()
            goto L_0x010b
        L_0x0125:
            r7.U()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0137
            r3 = -1
            java.lang.String r5 = "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)"
            r8 = 1655228151(0x62a8c6f7, float:1.556695E21)
            androidx.compose.runtime.ComposerKt.Y(r8, r0, r3, r5)
        L_0x0137:
            androidx.compose.material3.internal.Strings$Companion r3 = androidx.compose.material3.internal.Strings.f12320b
            int r3 = androidx.compose.material3.R.string.G
            int r3 = androidx.compose.material3.internal.Strings.a(r3)
            java.lang.String r3 = androidx.compose.material3.internal.Strings_androidKt.b(r3, r7, r4)
            r8 = r3
            int r5 = androidx.compose.material3.R.string.D
            int r5 = androidx.compose.material3.internal.Strings.a(r5)
            java.lang.String r5 = androidx.compose.material3.internal.Strings_androidKt.b(r5, r7, r4)
            r9 = r5
            androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$1 r4 = new androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$1
            r4.<init>(r3, r10)
            r3 = 850203865(0x32ad14d9, float:2.0149331E-8)
            r1 = 54
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r3, r12, r4, r7, r1)
            r1 = r10
            r10 = r3
            androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$2 r3 = new androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$2
            r3.<init>(r5, r1)
            r4 = 282231642(0x10d2835a, float:8.3032774E-29)
            r5 = 54
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r12, r3, r7, r5)
            androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$3 r3 = new androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$3
            r3.<init>(r1)
            r4 = -320655704(0xffffffffece32ea8, float:-2.1971719E27)
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r12, r3, r7, r5)
            r3 = 0
            java.util.Locale r3 = androidx.compose.material3.CalendarLocale_androidKt.a(r7, r3)
            r13 = r3
            r3 = r0 & 14
            r4 = 905969664(0x36000000, float:1.9073486E-6)
            r3 = r3 | r4
            r4 = r0 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = r0 & 896(0x380, float:1.256E-42)
            r3 = r3 | r4
            r4 = r0 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r0
            r3 = r3 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r0
            r3 = r3 | r4
            r15 = r3
            int r0 = r0 >> 12
            r0 = r0 & 896(0x380, float:1.256E-42)
            r3 = 6
            r16 = r0 | 6
            r0 = r21
            r19 = r1
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r18
            r17 = r7
            r6 = r19
            r14 = r17
            r0.e(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01be
            androidx.compose.runtime.ComposerKt.X()
        L_0x01be:
            r6 = r18
            r7 = r19
            goto L_0x01ca
        L_0x01c3:
            r17 = r7
            r17.B()
            r6 = r9
            r7 = r10
        L_0x01ca:
            androidx.compose.runtime.ScopeUpdateScope r11 = r17.x()
            if (r11 == 0) goto L_0x01e7
            androidx.compose.material3.L1 r12 = new androidx.compose.material3.L1
            r0 = r12
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r9 = r30
            r10 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            r11.a(r12)
        L_0x01e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerDefaults.f(java.lang.Long, java.lang.Long, int, androidx.compose.material3.DatePickerFormatter, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(int r36, androidx.compose.ui.Modifier r37, long r38, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            r35 = this;
            r2 = r36
            r6 = r41
            r0 = 2
            r1 = 6
            r3 = 4
            r4 = 694693107(0x29682cf3, float:5.1553336E-14)
            r5 = r40
            androidx.compose.runtime.Composer r5 = r5.q(r4)
            r7 = 1
            r8 = r42 & 1
            if (r8 == 0) goto L_0x0018
            r8 = r6 | 6
            goto L_0x0028
        L_0x0018:
            r8 = r6 & 6
            if (r8 != 0) goto L_0x0027
            boolean r8 = r5.i(r2)
            if (r8 == 0) goto L_0x0024
            r8 = r3
            goto L_0x0025
        L_0x0024:
            r8 = r0
        L_0x0025:
            r8 = r8 | r6
            goto L_0x0028
        L_0x0027:
            r8 = r6
        L_0x0028:
            r0 = r42 & 2
            if (r0 == 0) goto L_0x0031
            r8 = r8 | 48
        L_0x002e:
            r9 = r37
            goto L_0x0043
        L_0x0031:
            r9 = r6 & 48
            if (r9 != 0) goto L_0x002e
            r9 = r37
            boolean r10 = r5.W(r9)
            if (r10 == 0) goto L_0x0040
            r10 = 32
            goto L_0x0042
        L_0x0040:
            r10 = 16
        L_0x0042:
            r8 = r8 | r10
        L_0x0043:
            r10 = r6 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x005c
            r10 = r42 & 4
            if (r10 != 0) goto L_0x0056
            r10 = r38
            boolean r12 = r5.j(r10)
            if (r12 == 0) goto L_0x0058
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0056:
            r10 = r38
        L_0x0058:
            r12 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r8 = r8 | r12
            goto L_0x005e
        L_0x005c:
            r10 = r38
        L_0x005e:
            r12 = r8 & 147(0x93, float:2.06E-43)
            r13 = 146(0x92, float:2.05E-43)
            r14 = 0
            if (r12 == r13) goto L_0x0067
            r12 = r7
            goto L_0x0068
        L_0x0067:
            r12 = r14
        L_0x0068:
            r13 = r8 & 1
            boolean r12 = r5.E(r12, r13)
            if (r12 == 0) goto L_0x0161
            r5.p()
            r7 = r7 & r6
            if (r7 == 0) goto L_0x008a
            boolean r7 = r5.J()
            if (r7 == 0) goto L_0x007d
            goto L_0x008a
        L_0x007d:
            r5.B()
            r0 = r42 & 4
            if (r0 == 0) goto L_0x0086
            r8 = r8 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0086:
            r0 = r9
            r33 = r10
            goto L_0x00a2
        L_0x008a:
            if (r0 == 0) goto L_0x008f
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r9 = r0
        L_0x008f:
            r0 = r42 & 4
            if (r0 == 0) goto L_0x0086
            androidx.compose.material3.DatePickerDefaults r0 = androidx.compose.material3.DatePickerDefaults.f9682a
            androidx.compose.material3.DatePickerColors r0 = r0.i(r5, r1)
            long r0 = r0.j()
            r8 = r8 & -897(0xfffffffffffffc7f, float:NaN)
            r33 = r0
            r0 = r9
        L_0x00a2:
            r5.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00b1
            r1 = -1
            java.lang.String r3 = "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:371)"
            androidx.compose.runtime.ComposerKt.Y(r4, r8, r1, r3)
        L_0x00b1:
            androidx.compose.material3.DisplayMode$Companion r1 = androidx.compose.material3.DisplayMode.f9856b
            int r3 = r1.b()
            boolean r3 = androidx.compose.material3.DisplayMode.f(r2, r3)
            if (r3 == 0) goto L_0x00ff
            r1 = 1880154051(0x7010dfc3, float:1.7934541E29)
            r5.X(r1)
            androidx.compose.material3.internal.Strings$Companion r1 = androidx.compose.material3.internal.Strings.f12320b
            int r1 = androidx.compose.material3.R.string.H
            int r1 = androidx.compose.material3.internal.Strings.a(r1)
            java.lang.String r7 = androidx.compose.material3.internal.Strings_androidKt.b(r1, r5, r14)
            r1 = r8 & 1008(0x3f0, float:1.413E-42)
            r30 = r1
            r31 = 0
            r32 = 262136(0x3fff8, float:3.67331E-40)
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r8 = r0
            r9 = r33
            r29 = r5
            androidx.compose.material3.TextKt.j(r7, r8, r9, r11, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r5.M()
            goto L_0x0154
        L_0x00ff:
            int r1 = r1.a()
            boolean r1 = androidx.compose.material3.DisplayMode.f(r2, r1)
            if (r1 == 0) goto L_0x014b
            r1 = 1880161282(0x7010fc02, float:1.79482E29)
            r5.X(r1)
            androidx.compose.material3.internal.Strings$Companion r1 = androidx.compose.material3.internal.Strings.f12320b
            int r1 = androidx.compose.material3.R.string.f10653B
            int r1 = androidx.compose.material3.internal.Strings.a(r1)
            java.lang.String r7 = androidx.compose.material3.internal.Strings_androidKt.b(r1, r5, r14)
            r1 = r8 & 1008(0x3f0, float:1.413E-42)
            r30 = r1
            r31 = 0
            r32 = 262136(0x3fff8, float:3.67331E-40)
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r8 = r0
            r9 = r33
            r29 = r5
            androidx.compose.material3.TextKt.j(r7, r8, r9, r11, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r5.M()
            goto L_0x0154
        L_0x014b:
            r1 = -1844364305(0xffffffff92113bef, float:-4.5827806E-28)
            r5.X(r1)
            r5.M()
        L_0x0154:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x015d
            androidx.compose.runtime.ComposerKt.X()
        L_0x015d:
            r3 = r0
            r10 = r33
            goto L_0x0165
        L_0x0161:
            r5.B()
            r3 = r9
        L_0x0165:
            androidx.compose.runtime.ScopeUpdateScope r8 = r5.x()
            if (r8 == 0) goto L_0x017d
            androidx.compose.material3.K1 r9 = new androidx.compose.material3.K1
            r0 = r9
            r1 = r35
            r2 = r36
            r4 = r10
            r6 = r41
            r7 = r42
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.a(r9)
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerDefaults.j(int, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }
}
