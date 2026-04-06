package androidx.compose.material3;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;

@Metadata
public final class DatePickerDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final DatePickerDefaults f9682a = new DatePickerDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final IntRange f9683b = new IntRange(1900, 2100);

    /* renamed from: c  reason: collision with root package name */
    public static final float f9684c = ElevationTokens.f13121a.a();

    /* renamed from: d  reason: collision with root package name */
    public static final SelectableDates f9685d = new DatePickerDefaults$AllDates$1();

    public static final Unit e(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m0(semanticsPropertyReceiver, LiveRegionMode.f18031b.b());
        SemanticsPropertiesKt.e0(semanticsPropertyReceiver, str);
        return Unit.f40552a;
    }

    public static final Unit f(DatePickerDefaults datePickerDefaults, Long l2, int i2, DatePickerFormatter datePickerFormatter, Modifier modifier, long j2, int i3, int i4, Composer composer, int i5) {
        datePickerDefaults.d(l2, i2, datePickerFormatter, modifier, j2, composer, RecomposeScopeImplKt.a(i3 | 1), i4);
        return Unit.f40552a;
    }

    public static final Unit h(DatePickerDefaults datePickerDefaults, int i2, Modifier modifier, long j2, int i3, int i4, Composer composer, int i5) {
        datePickerDefaults.g(i2, modifier, j2, composer, RecomposeScopeImplKt.a(i3 | 1), i4);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.lang.Long r40, int r41, androidx.compose.material3.DatePickerFormatter r42, androidx.compose.ui.Modifier r43, long r44, androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            r39 = this;
            r10 = r39
            r6 = r40
            r7 = r41
            r8 = r42
            r9 = r47
            r0 = 32
            r1 = 2
            r2 = 4
            r3 = 16
            r4 = 1913724796(0x72111f7c, float:2.874457E30)
            r5 = r46
            androidx.compose.runtime.Composer r13 = r5.q(r4)
            r11 = 1
            r5 = r48 & 1
            if (r5 == 0) goto L_0x0021
            r5 = r9 | 6
            goto L_0x0031
        L_0x0021:
            r5 = r9 & 6
            if (r5 != 0) goto L_0x0030
            boolean r5 = r13.W(r6)
            if (r5 == 0) goto L_0x002d
            r5 = r2
            goto L_0x002e
        L_0x002d:
            r5 = r1
        L_0x002e:
            r5 = r5 | r9
            goto L_0x0031
        L_0x0030:
            r5 = r9
        L_0x0031:
            r1 = r48 & 2
            if (r1 == 0) goto L_0x0038
            r5 = r5 | 48
            goto L_0x0046
        L_0x0038:
            r1 = r9 & 48
            if (r1 != 0) goto L_0x0046
            boolean r1 = r13.i(r7)
            if (r1 == 0) goto L_0x0044
            r1 = r0
            goto L_0x0045
        L_0x0044:
            r1 = r3
        L_0x0045:
            r5 = r5 | r1
        L_0x0046:
            r1 = r48 & 4
            if (r1 == 0) goto L_0x004d
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x004d:
            r1 = r9 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0066
            r1 = r9 & 512(0x200, float:7.175E-43)
            if (r1 != 0) goto L_0x005a
            boolean r1 = r13.W(r8)
            goto L_0x005e
        L_0x005a:
            boolean r1 = r13.l(r8)
        L_0x005e:
            if (r1 == 0) goto L_0x0063
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r1 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r5 = r5 | r1
        L_0x0066:
            r1 = r48 & 8
            if (r1 == 0) goto L_0x006f
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r2 = r43
            goto L_0x0081
        L_0x006f:
            r2 = r9 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x006c
            r2 = r43
            boolean r12 = r13.W(r2)
            if (r12 == 0) goto L_0x007e
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r5 = r5 | r12
        L_0x0081:
            r12 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0098
            r12 = r48 & 16
            r14 = r44
            if (r12 != 0) goto L_0x0094
            boolean r12 = r13.j(r14)
            if (r12 == 0) goto L_0x0094
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r5 = r5 | r12
            goto L_0x009a
        L_0x0098:
            r14 = r44
        L_0x009a:
            r0 = r48 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r0 == 0) goto L_0x00a2
            r5 = r5 | r12
            goto L_0x00b2
        L_0x00a2:
            r0 = r9 & r12
            if (r0 != 0) goto L_0x00b2
            boolean r0 = r13.W(r10)
            if (r0 == 0) goto L_0x00af
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r5 = r5 | r0
        L_0x00b2:
            r0 = 74899(0x12493, float:1.04956E-40)
            r0 = r0 & r5
            r12 = 74898(0x12492, float:1.04954E-40)
            r4 = 0
            if (r0 == r12) goto L_0x00be
            r0 = r11
            goto L_0x00bf
        L_0x00be:
            r0 = r4
        L_0x00bf:
            r12 = r5 & 1
            boolean r0 = r13.E(r0, r12)
            if (r0 == 0) goto L_0x02b1
            r13.p()
            r0 = r9 & 1
            r12 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r13.J()
            if (r0 == 0) goto L_0x00d8
            goto L_0x00e5
        L_0x00d8:
            r13.B()
            r0 = r48 & 16
            if (r0 == 0) goto L_0x00e0
            r5 = r5 & r12
        L_0x00e0:
            r37 = r14
            r14 = r2
        L_0x00e3:
            r15 = r5
            goto L_0x0104
        L_0x00e5:
            if (r1 == 0) goto L_0x00ea
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00eb
        L_0x00ea:
            r0 = r2
        L_0x00eb:
            r1 = r48 & 16
            if (r1 == 0) goto L_0x0100
            int r1 = r5 >> 15
            r1 = r1 & 14
            androidx.compose.material3.DatePickerColors r1 = r10.i(r13, r1)
            long r1 = r1.g()
            r5 = r5 & r12
            r14 = r0
            r37 = r1
            goto L_0x00e3
        L_0x0100:
            r37 = r14
            r14 = r0
            goto L_0x00e3
        L_0x0104:
            r13.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0116
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:684)"
            r2 = 1913724796(0x72111f7c, float:2.874457E30)
            androidx.compose.runtime.ComposerKt.Y(r2, r15, r0, r1)
        L_0x0116:
            java.util.Locale r12 = androidx.compose.material3.CalendarLocale_androidKt.a(r13, r4)
            r5 = 4
            r16 = 0
            r3 = 0
            r0 = r42
            r1 = r40
            r2 = r12
            r4 = r5
            r5 = r16
            java.lang.String r0 = androidx.compose.material3.DatePickerFormatter.b(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = r8.a(r6, r12, r11)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x018a
            r1 = 380185931(0x16a92d4b, float:2.7332006E-25)
            r13.X(r1)
            androidx.compose.material3.DisplayMode$Companion r1 = androidx.compose.material3.DisplayMode.f9856b
            int r3 = r1.b()
            boolean r3 = androidx.compose.material3.DisplayMode.f(r7, r3)
            if (r3 == 0) goto L_0x015b
            r1 = 843549871(0x32478caf, float:1.1615312E-8)
            r13.X(r1)
            androidx.compose.material3.internal.Strings$Companion r1 = androidx.compose.material3.internal.Strings.f12320b
            int r1 = androidx.compose.material3.R.string.f10670q
            int r1 = androidx.compose.material3.internal.Strings.a(r1)
            r3 = 0
            java.lang.String r1 = androidx.compose.material3.internal.Strings_androidKt.b(r1, r13, r3)
            r13.M()
            goto L_0x0186
        L_0x015b:
            r3 = 0
            int r1 = r1.a()
            boolean r1 = androidx.compose.material3.DisplayMode.f(r7, r1)
            if (r1 == 0) goto L_0x017c
            r1 = 843552842(0x3247984a, float:1.1617951E-8)
            r13.X(r1)
            androidx.compose.material3.internal.Strings$Companion r1 = androidx.compose.material3.internal.Strings.f12320b
            int r1 = androidx.compose.material3.R.string.f10665l
            int r1 = androidx.compose.material3.internal.Strings.a(r1)
            java.lang.String r1 = androidx.compose.material3.internal.Strings_androidKt.b(r1, r13, r3)
            r13.M()
            goto L_0x0186
        L_0x017c:
            r1 = 380407362(0x16ac8e42, float:2.7877876E-25)
            r13.X(r1)
            r13.M()
            r1 = r2
        L_0x0186:
            r13.M()
            goto L_0x0194
        L_0x018a:
            r3 = 0
            r4 = 843542258(0x32476ef2, float:1.1608551E-8)
            r13.X(r4)
            r13.M()
        L_0x0194:
            if (r0 != 0) goto L_0x01ec
            r0 = 380507587(0x16ae15c3, float:2.812495E-25)
            r13.X(r0)
            androidx.compose.material3.DisplayMode$Companion r0 = androidx.compose.material3.DisplayMode.f9856b
            int r4 = r0.b()
            boolean r4 = androidx.compose.material3.DisplayMode.f(r7, r4)
            if (r4 == 0) goto L_0x01be
            r0 = 843560257(0x3247b541, float:1.1624537E-8)
            r13.X(r0)
            androidx.compose.material3.internal.Strings$Companion r0 = androidx.compose.material3.internal.Strings.f12320b
            int r0 = androidx.compose.material3.R.string.f10667n
            int r0 = androidx.compose.material3.internal.Strings.a(r0)
            java.lang.String r0 = androidx.compose.material3.internal.Strings_androidKt.b(r0, r13, r3)
            r13.M()
            goto L_0x01e8
        L_0x01be:
            int r0 = r0.a()
            boolean r0 = androidx.compose.material3.DisplayMode.f(r7, r0)
            if (r0 == 0) goto L_0x01de
            r0 = 843562784(0x3247bf20, float:1.1626781E-8)
            r13.X(r0)
            androidx.compose.material3.internal.Strings$Companion r0 = androidx.compose.material3.internal.Strings.f12320b
            int r0 = androidx.compose.material3.R.string.f10659f
            int r0 = androidx.compose.material3.internal.Strings.a(r0)
            java.lang.String r0 = androidx.compose.material3.internal.Strings_androidKt.b(r0, r13, r3)
            r13.M()
            goto L_0x01e8
        L_0x01de:
            r0 = 380705954(0x16b11ca2, float:2.8613962E-25)
            r13.X(r0)
            r13.M()
            r0 = r2
        L_0x01e8:
            r13.M()
            goto L_0x01f5
        L_0x01ec:
            r4 = 843557408(0x3247aa20, float:1.16220065E-8)
            r13.X(r4)
            r13.M()
        L_0x01f5:
            androidx.compose.material3.DisplayMode$Companion r4 = androidx.compose.material3.DisplayMode.f9856b
            int r5 = r4.b()
            boolean r5 = androidx.compose.material3.DisplayMode.f(r7, r5)
            if (r5 == 0) goto L_0x0217
            r2 = 843570444(0x3247dd0c, float:1.1633585E-8)
            r13.X(r2)
            androidx.compose.material3.internal.Strings$Companion r2 = androidx.compose.material3.internal.Strings.f12320b
            int r2 = androidx.compose.material3.R.string.f10668o
            int r2 = androidx.compose.material3.internal.Strings.a(r2)
            java.lang.String r2 = androidx.compose.material3.internal.Strings_androidKt.b(r2, r13, r3)
            r13.M()
            goto L_0x0240
        L_0x0217:
            int r4 = r4.a()
            boolean r4 = androidx.compose.material3.DisplayMode.f(r7, r4)
            if (r4 == 0) goto L_0x0237
            r2 = 843573323(0x3247e84b, float:1.1636142E-8)
            r13.X(r2)
            androidx.compose.material3.internal.Strings$Companion r2 = androidx.compose.material3.internal.Strings.f12320b
            int r2 = androidx.compose.material3.R.string.f10660g
            int r2 = androidx.compose.material3.internal.Strings.a(r2)
            java.lang.String r2 = androidx.compose.material3.internal.Strings_androidKt.b(r2, r13, r3)
            r13.M()
            goto L_0x0240
        L_0x0237:
            r4 = 381043234(0x16b64222, float:2.9445422E-25)
            r13.X(r4)
            r13.M()
        L_0x0240:
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r11)
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "format(...)"
            kotlin.jvm.internal.Intrinsics.h(r1, r2)
            boolean r2 = r13.W(r1)
            java.lang.Object r4 = r13.g()
            if (r2 != 0) goto L_0x0263
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x026b
        L_0x0263:
            androidx.compose.material3.H0 r4 = new androidx.compose.material3.H0
            r4.<init>(r1)
            r13.N(r4)
        L_0x026b:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r1 = 0
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r14, r3, r4, r11, r1)
            int r1 = r15 >> 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r34 = r1
            r35 = 24576(0x6000, float:3.4438E-41)
            r36 = 245752(0x3bff8, float:3.44372E-40)
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 1
            r30 = 0
            r31 = 0
            r32 = 0
            r11 = r0
            r0 = r13
            r2 = r14
            r13 = r37
            r33 = r0
            androidx.compose.material3.TextKt.j(r11, r12, r13, r15, r16, r18, r19, r20, r21, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x02ad
            androidx.compose.runtime.ComposerKt.X()
        L_0x02ad:
            r5 = r2
            r14 = r37
            goto L_0x02b6
        L_0x02b1:
            r0 = r13
            r0.B()
            r5 = r2
        L_0x02b6:
            androidx.compose.runtime.ScopeUpdateScope r11 = r0.x()
            if (r11 == 0) goto L_0x02d2
            androidx.compose.material3.I0 r12 = new androidx.compose.material3.I0
            r0 = r12
            r1 = r39
            r2 = r40
            r3 = r41
            r4 = r42
            r6 = r14
            r8 = r47
            r9 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            r11.a(r12)
        L_0x02d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerDefaults.d(java.lang.Long, int, androidx.compose.material3.DatePickerFormatter, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(int r38, androidx.compose.ui.Modifier r39, long r40, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            r37 = this;
            r8 = r37
            r2 = r38
            r6 = r43
            r0 = 2
            r1 = 4
            r3 = -390880814(0xffffffffe8b3a1d2, float:-6.786309E24)
            r4 = r42
            androidx.compose.runtime.Composer r4 = r4.q(r3)
            r5 = 1
            r7 = r44 & 1
            if (r7 == 0) goto L_0x0019
            r7 = r6 | 6
            goto L_0x0029
        L_0x0019:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0028
            boolean r7 = r4.i(r2)
            if (r7 == 0) goto L_0x0025
            r7 = r1
            goto L_0x0026
        L_0x0025:
            r7 = r0
        L_0x0026:
            r7 = r7 | r6
            goto L_0x0029
        L_0x0028:
            r7 = r6
        L_0x0029:
            r0 = r44 & 2
            if (r0 == 0) goto L_0x0032
            r7 = r7 | 48
        L_0x002f:
            r9 = r39
            goto L_0x0044
        L_0x0032:
            r9 = r6 & 48
            if (r9 != 0) goto L_0x002f
            r9 = r39
            boolean r10 = r4.W(r9)
            if (r10 == 0) goto L_0x0041
            r10 = 32
            goto L_0x0043
        L_0x0041:
            r10 = 16
        L_0x0043:
            r7 = r7 | r10
        L_0x0044:
            r10 = r6 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x005d
            r10 = r44 & 4
            if (r10 != 0) goto L_0x0057
            r10 = r40
            boolean r12 = r4.j(r10)
            if (r12 == 0) goto L_0x0059
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r10 = r40
        L_0x0059:
            r12 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r7 = r7 | r12
            goto L_0x005f
        L_0x005d:
            r10 = r40
        L_0x005f:
            r12 = r44 & 8
            if (r12 == 0) goto L_0x0066
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0076
        L_0x0066:
            r12 = r6 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0076
            boolean r12 = r4.W(r8)
            if (r12 == 0) goto L_0x0073
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r7 = r7 | r12
        L_0x0076:
            r12 = r7 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            r14 = 0
            if (r12 == r13) goto L_0x007f
            r12 = r5
            goto L_0x0080
        L_0x007f:
            r12 = r14
        L_0x0080:
            r13 = r7 & 1
            boolean r12 = r4.E(r12, r13)
            if (r12 == 0) goto L_0x017f
            r4.p()
            r5 = r5 & r6
            if (r5 == 0) goto L_0x00a2
            boolean r5 = r4.J()
            if (r5 == 0) goto L_0x0095
            goto L_0x00a2
        L_0x0095:
            r4.B()
            r0 = r44 & 4
            if (r0 == 0) goto L_0x009e
            r7 = r7 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x009e:
            r0 = r9
            r35 = r10
            goto L_0x00bc
        L_0x00a2:
            if (r0 == 0) goto L_0x00a7
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r9 = r0
        L_0x00a7:
            r0 = r44 & 4
            if (r0 == 0) goto L_0x009e
            int r0 = r7 >> 9
            r0 = r0 & 14
            androidx.compose.material3.DatePickerColors r0 = r8.i(r4, r0)
            long r0 = r0.j()
            r7 = r7 & -897(0xfffffffffffffc7f, float:NaN)
            r35 = r0
            r0 = r9
        L_0x00bc:
            r4.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00cb
            r1 = -1
            java.lang.String r5 = "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:649)"
            androidx.compose.runtime.ComposerKt.Y(r3, r7, r1, r5)
        L_0x00cb:
            androidx.compose.material3.DisplayMode$Companion r1 = androidx.compose.material3.DisplayMode.f9856b
            int r3 = r1.b()
            boolean r3 = androidx.compose.material3.DisplayMode.f(r2, r3)
            if (r3 == 0) goto L_0x011b
            r1 = -1974299164(0xffffffff8a5295e4, float:-1.01393235E-32)
            r4.X(r1)
            androidx.compose.material3.internal.Strings$Companion r1 = androidx.compose.material3.internal.Strings.f12320b
            int r1 = androidx.compose.material3.R.string.f10677x
            int r1 = androidx.compose.material3.internal.Strings.a(r1)
            java.lang.String r9 = androidx.compose.material3.internal.Strings_androidKt.b(r1, r4, r14)
            r1 = r7 & 1008(0x3f0, float:1.413E-42)
            r32 = r1
            r33 = 0
            r34 = 262136(0x3fff8, float:3.67331E-40)
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r10 = r0
            r11 = r35
            r31 = r4
            androidx.compose.material3.TextKt.j(r9, r10, r11, r13, r14, r16, r17, r18, r19, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r4.M()
            goto L_0x0172
        L_0x011b:
            int r1 = r1.a()
            boolean r1 = androidx.compose.material3.DisplayMode.f(r2, r1)
            if (r1 == 0) goto L_0x0169
            r1 = -1974291869(0xffffffff8a52b263, float:-1.0144683E-32)
            r4.X(r1)
            androidx.compose.material3.internal.Strings$Companion r1 = androidx.compose.material3.internal.Strings.f12320b
            int r1 = androidx.compose.material3.R.string.f10666m
            int r1 = androidx.compose.material3.internal.Strings.a(r1)
            java.lang.String r9 = androidx.compose.material3.internal.Strings_androidKt.b(r1, r4, r14)
            r1 = r7 & 1008(0x3f0, float:1.413E-42)
            r32 = r1
            r33 = 0
            r34 = 262136(0x3fff8, float:3.67331E-40)
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r10 = r0
            r11 = r35
            r31 = r4
            androidx.compose.material3.TextKt.j(r9, r10, r11, r13, r14, r16, r17, r18, r19, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r4.M()
            goto L_0x0172
        L_0x0169:
            r1 = -1073325776(0xffffffffc0065930, float:-2.0991936)
            r4.X(r1)
            r4.M()
        L_0x0172:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x017b
            androidx.compose.runtime.ComposerKt.X()
        L_0x017b:
            r3 = r0
            r10 = r35
            goto L_0x0183
        L_0x017f:
            r4.B()
            r3 = r9
        L_0x0183:
            androidx.compose.runtime.ScopeUpdateScope r9 = r4.x()
            if (r9 == 0) goto L_0x019b
            androidx.compose.material3.J0 r12 = new androidx.compose.material3.J0
            r0 = r12
            r1 = r37
            r2 = r38
            r4 = r10
            r6 = r43
            r7 = r44
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r9.a(r12)
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerDefaults.g(int, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public final DatePickerColors i(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-275219611, i2, -1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:447)");
        }
        DatePickerColors j2 = j(MaterialTheme.f10273a.a(composer, 6), composer, (i2 << 3) & 112);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return j2;
    }

    public final DatePickerColors j(ColorScheme colorScheme, Composer composer, int i2) {
        ColorScheme colorScheme2 = colorScheme;
        Composer composer2 = composer;
        int i3 = i2;
        if (ComposerKt.P()) {
            ComposerKt.Y(1180555308, i3, -1, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:546)");
        }
        DatePickerColors e2 = colorScheme.e();
        if (e2 == null) {
            composer2.X(642416503);
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.f13010a;
            e2 = new DatePickerColors(ColorSchemeKt.i(colorScheme2, datePickerModalTokens.a()), ColorSchemeKt.i(colorScheme2, datePickerModalTokens.p()), ColorSchemeKt.i(colorScheme2, datePickerModalTokens.o()), ColorSchemeKt.i(colorScheme2, datePickerModalTokens.B()), ColorSchemeKt.i(colorScheme2, datePickerModalTokens.r()), colorScheme.G(), ColorSchemeKt.i(colorScheme2, datePickerModalTokens.A()), Color.l(ColorSchemeKt.i(colorScheme2, datePickerModalTokens.A()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, datePickerModalTokens.m()), ColorSchemeKt.i(colorScheme2, datePickerModalTokens.y()), Color.l(ColorSchemeKt.i(colorScheme2, datePickerModalTokens.y()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, datePickerModalTokens.x()), Color.l(ColorSchemeKt.i(colorScheme2, datePickerModalTokens.x()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, datePickerModalTokens.n()), Color.l(ColorSchemeKt.i(colorScheme2, datePickerModalTokens.n()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, datePickerModalTokens.i()), Color.l(ColorSchemeKt.i(colorScheme2, datePickerModalTokens.i()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, datePickerModalTokens.h()), Color.l(ColorSchemeKt.i(colorScheme2, datePickerModalTokens.h()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, datePickerModalTokens.m()), ColorSchemeKt.i(colorScheme2, datePickerModalTokens.k()), ColorSchemeKt.i(colorScheme2, datePickerModalTokens.q()), ColorSchemeKt.i(colorScheme2, datePickerModalTokens.t()), ColorSchemeKt.i(colorScheme2, DividerTokens.f13051a.a()), OutlinedTextFieldDefaults.f10533a.l(colorScheme2, composer2, (i3 & 14) | 48), (DefaultConstructorMarker) null);
            colorScheme2.n0(e2);
            composer.M();
        } else {
            composer2.X(642290457);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return e2;
    }

    public final FlingBehavior k(LazyListState lazyListState, DecayAnimationSpec decayAnimationSpec, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            decayAnimationSpec = DecayAnimationSpecKt.c(0.0f, 0.0f, 3, (Object) null);
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(-2036003494, i2, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:741)");
        }
        FiniteAnimationSpec b2 = MotionSchemeKt.b(MotionSchemeKeyTokens.DefaultEffects, composer, 6);
        boolean W = ((((i2 & 14) ^ 6) > 4 && composer.W(lazyListState)) || (i2 & 6) == 4) | composer.W(decayAnimationSpec);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = SnapFlingBehaviorKt.n(new DatePickerDefaults$rememberSnapFlingBehavior$1$snapLayoutInfoProvider$1(LazyListSnapLayoutInfoProviderKt.b(lazyListState, (SnapPosition) null, 2, (Object) null)), decayAnimationSpec, b2);
            composer.N(g2);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return targetedFlingBehavior;
    }
}
