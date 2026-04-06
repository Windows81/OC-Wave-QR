package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

@Metadata
public final class DateInputKt {

    /* renamed from: a  reason: collision with root package name */
    public static final PaddingValues f9641a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f9642b = Dp.m((float) 16);

    static {
        float f2 = (float) 24;
        f9641a = PaddingKt.e(Dp.m(f2), Dp.m((float) 10), Dp.m(f2), 0.0f, 8, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: androidx.compose.material3.internal.DateInputFormat} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(java.lang.Long r22, kotlin.jvm.functions.Function1 r23, androidx.compose.material3.internal.CalendarModel r24, kotlin.ranges.IntRange r25, androidx.compose.material3.DatePickerFormatter r26, androidx.compose.material3.SelectableDates r27, androidx.compose.material3.DatePickerColors r28, androidx.compose.ui.focus.FocusRequester r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            r15 = r22
            r14 = r24
            r13 = r26
            r12 = r31
            r9 = 1
            r0 = -432341251(0xffffffffe63afefd, float:-2.2076597E23)
            r1 = r30
            androidx.compose.runtime.Composer r11 = r1.q(r0)
            r1 = r12 & 6
            if (r1 != 0) goto L_0x0021
            boolean r1 = r11.W(r15)
            if (r1 == 0) goto L_0x001e
            r1 = 4
            goto L_0x001f
        L_0x001e:
            r1 = 2
        L_0x001f:
            r1 = r1 | r12
            goto L_0x0022
        L_0x0021:
            r1 = r12
        L_0x0022:
            r2 = r12 & 48
            r10 = r23
            if (r2 != 0) goto L_0x0034
            boolean r2 = r11.l(r10)
            if (r2 == 0) goto L_0x0031
            r2 = 32
            goto L_0x0033
        L_0x0031:
            r2 = 16
        L_0x0033:
            r1 = r1 | r2
        L_0x0034:
            r2 = r12 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0044
            boolean r2 = r11.l(r14)
            if (r2 == 0) goto L_0x0041
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r1 = r1 | r2
        L_0x0044:
            r2 = r12 & 3072(0xc00, float:4.305E-42)
            r8 = r25
            if (r2 != 0) goto L_0x0056
            boolean r2 = r11.l(r8)
            if (r2 == 0) goto L_0x0053
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0055
        L_0x0053:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r1 = r1 | r2
        L_0x0056:
            r2 = r12 & 24576(0x6000, float:3.4438E-41)
            r4 = 32768(0x8000, float:4.5918E-41)
            if (r2 != 0) goto L_0x0072
            r2 = r12 & r4
            if (r2 != 0) goto L_0x0066
            boolean r2 = r11.W(r13)
            goto L_0x006a
        L_0x0066:
            boolean r2 = r11.l(r13)
        L_0x006a:
            if (r2 == 0) goto L_0x006f
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0071
        L_0x006f:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0071:
            r1 = r1 | r2
        L_0x0072:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r12
            r7 = r27
            if (r2 != 0) goto L_0x0085
            boolean r2 = r11.W(r7)
            if (r2 == 0) goto L_0x0082
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0084
        L_0x0082:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x0084:
            r1 = r1 | r2
        L_0x0085:
            r2 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 & r12
            r6 = r28
            if (r2 != 0) goto L_0x0098
            boolean r2 = r11.W(r6)
            if (r2 == 0) goto L_0x0095
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0097
        L_0x0095:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x0097:
            r1 = r1 | r2
        L_0x0098:
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 & r12
            r5 = r29
            if (r2 != 0) goto L_0x00ab
            boolean r2 = r11.W(r5)
            if (r2 == 0) goto L_0x00a8
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00aa
        L_0x00a8:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x00aa:
            r1 = r1 | r2
        L_0x00ab:
            r2 = r1
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r1 & r2
            r4 = 4793490(0x492492, float:6.71711E-39)
            r3 = 0
            if (r1 == r4) goto L_0x00b8
            r1 = r9
            goto L_0x00b9
        L_0x00b8:
            r1 = r3
        L_0x00b9:
            r4 = r2 & 1
            boolean r1 = r11.E(r1, r4)
            if (r1 == 0) goto L_0x01eb
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00cd
            r1 = -1
            java.lang.String r4 = "androidx.compose.material3.DateInputContent (DateInput.kt:67)"
            androidx.compose.runtime.ComposerKt.Y(r0, r2, r1, r4)
        L_0x00cd:
            java.util.Locale r0 = r24.f()
            boolean r0 = r11.W(r0)
            java.lang.Object r1 = r11.g()
            if (r0 != 0) goto L_0x00e3
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x00ee
        L_0x00e3:
            java.util.Locale r0 = r24.f()
            androidx.compose.material3.internal.DateInputFormat r1 = r14.c(r0)
            r11.N(r1)
        L_0x00ee:
            r4 = r1
            androidx.compose.material3.internal.DateInputFormat r4 = (androidx.compose.material3.internal.DateInputFormat) r4
            androidx.compose.material3.internal.Strings$Companion r0 = androidx.compose.material3.internal.Strings.f12320b
            int r0 = androidx.compose.material3.R.string.f10661h
            int r0 = androidx.compose.material3.internal.Strings.a(r0)
            java.lang.String r17 = androidx.compose.material3.internal.Strings_androidKt.b(r0, r11, r3)
            int r0 = androidx.compose.material3.R.string.f10663j
            int r0 = androidx.compose.material3.internal.Strings.a(r0)
            java.lang.String r18 = androidx.compose.material3.internal.Strings_androidKt.b(r0, r11, r3)
            int r0 = androidx.compose.material3.R.string.f10662i
            int r0 = androidx.compose.material3.internal.Strings.a(r0)
            java.lang.String r19 = androidx.compose.material3.internal.Strings_androidKt.b(r0, r11, r3)
            boolean r0 = r11.W(r4)
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r2
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r1 == r3) goto L_0x012c
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x012a
            boolean r1 = r11.W(r13)
            if (r1 == 0) goto L_0x012a
            goto L_0x012c
        L_0x012a:
            r1 = 0
            goto L_0x012d
        L_0x012c:
            r1 = r9
        L_0x012d:
            r0 = r0 | r1
            java.lang.Object r1 = r11.g()
            if (r0 != 0) goto L_0x0142
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x013d
            goto L_0x0142
        L_0x013d:
            r20 = r2
            r21 = r4
            goto L_0x0162
        L_0x0142:
            androidx.compose.material3.DateInputValidator r3 = new androidx.compose.material3.DateInputValidator
            java.lang.String r16 = ""
            r0 = r3
            r1 = r25
            r20 = r2
            r2 = r27
            r9 = r3
            r3 = r4
            r21 = r4
            r4 = r26
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.N(r9)
            r1 = r9
        L_0x0162:
            r7 = r1
            androidx.compose.material3.DateInputValidator r7 = (androidx.compose.material3.DateInputValidator) r7
            java.lang.String r0 = r21.b()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            int r1 = androidx.compose.material3.R.string.f10664k
            int r1 = androidx.compose.material3.internal.Strings.a(r1)
            r2 = 0
            java.lang.String r1 = androidx.compose.material3.internal.Strings_androidKt.b(r1, r11, r2)
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r3 = 0
            r4 = 0
            r5 = 1
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r2, r3, r5, r4)
            androidx.compose.foundation.layout.PaddingValues r3 = f9641a
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.h(r2, r3)
            androidx.compose.material3.InputIdentifier$Companion r3 = androidx.compose.material3.InputIdentifier.f10146b
            int r6 = r3.b()
            r7.b(r15)
            java.util.Locale r9 = r24.f()
            androidx.compose.material3.DateInputKt$DateInputContent$2 r3 = new androidx.compose.material3.DateInputKt$DateInputContent$2
            r3.<init>(r1, r0)
            r1 = -752164549(0xffffffffd32ae13b, float:-7.3392318E11)
            r4 = 54
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r5, r3, r11, r4)
            androidx.compose.material3.DateInputKt$DateInputContent$3 r1 = new androidx.compose.material3.DateInputKt$DateInputContent$3
            r1.<init>(r0)
            r0 = -1179434278(0xffffffffb9b342da, float:-3.419135E-4)
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r5, r1, r11, r4)
            int r0 = r20 << 3
            r1 = r0 & 112(0x70, float:1.57E-43)
            r3 = 1794054(0x1b6006, float:2.514005E-39)
            r1 = r1 | r3
            r3 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r16 = r1 | r0
            int r0 = r20 >> 18
            r17 = r0 & 126(0x7e, float:1.77E-43)
            r0 = r2
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r8
            r8 = r21
            r10 = r28
            r18 = r11
            r11 = r29
            r12 = r18
            r13 = r16
            r14 = r17
            i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01f0
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x01f0
        L_0x01eb:
            r18 = r11
            r18.B()
        L_0x01f0:
            androidx.compose.runtime.ScopeUpdateScope r10 = r18.x()
            if (r10 == 0) goto L_0x0211
            androidx.compose.material3.z0 r11 = new androidx.compose.material3.z0
            r0 = r11
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputKt.g(java.lang.Long, kotlin.jvm.functions.Function1, androidx.compose.material3.internal.CalendarModel, kotlin.ranges.IntRange, androidx.compose.material3.DatePickerFormatter, androidx.compose.material3.SelectableDates, androidx.compose.material3.DatePickerColors, androidx.compose.ui.focus.FocusRequester, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit h(Long l2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i2, Composer composer, int i3) {
        g(l2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: androidx.compose.material3.C0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: androidx.compose.material3.C0} */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(androidx.compose.ui.Modifier r41, java.lang.Long r42, kotlin.jvm.functions.Function1 r43, androidx.compose.material3.internal.CalendarModel r44, kotlin.jvm.functions.Function2 r45, kotlin.jvm.functions.Function2 r46, int r47, androidx.compose.material3.DateInputValidator r48, androidx.compose.material3.internal.DateInputFormat r49, java.util.Locale r50, androidx.compose.material3.DatePickerColors r51, androidx.compose.ui.focus.FocusRequester r52, androidx.compose.runtime.Composer r53, int r54, int r55) {
        /*
            r7 = r42
            r15 = r44
            r14 = r49
            r13 = r50
            r12 = r52
            r11 = r54
            r0 = 1456309913(0x56cd8699, float:1.12988988E14)
            r1 = r53
            androidx.compose.runtime.Composer r10 = r1.q(r0)
            r1 = r11 & 6
            r3 = 4
            r9 = r41
            if (r1 != 0) goto L_0x0027
            boolean r1 = r10.W(r9)
            if (r1 == 0) goto L_0x0024
            r1 = r3
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r11
            goto L_0x0028
        L_0x0027:
            r1 = r11
        L_0x0028:
            r4 = r11 & 48
            r5 = 16
            if (r4 != 0) goto L_0x0039
            boolean r4 = r10.W(r7)
            if (r4 == 0) goto L_0x0037
            r4 = 32
            goto L_0x0038
        L_0x0037:
            r4 = r5
        L_0x0038:
            r1 = r1 | r4
        L_0x0039:
            r4 = r11 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004d
            r4 = r43
            boolean r16 = r10.l(r4)
            if (r16 == 0) goto L_0x0048
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x004a
        L_0x0048:
            r16 = 128(0x80, float:1.794E-43)
        L_0x004a:
            r1 = r1 | r16
            goto L_0x004f
        L_0x004d:
            r4 = r43
        L_0x004f:
            r2 = r11 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x005f
            boolean r2 = r10.l(r15)
            if (r2 == 0) goto L_0x005c
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x005e
        L_0x005c:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x005e:
            r1 = r1 | r2
        L_0x005f:
            r2 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0073
            r2 = r45
            boolean r16 = r10.l(r2)
            if (r16 == 0) goto L_0x006e
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0070
        L_0x006e:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0070:
            r1 = r1 | r16
            goto L_0x0075
        L_0x0073:
            r2 = r45
        L_0x0075:
            r16 = 196608(0x30000, float:2.75506E-40)
            r16 = r11 & r16
            r0 = r46
            if (r16 != 0) goto L_0x008a
            boolean r17 = r10.l(r0)
            if (r17 == 0) goto L_0x0086
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0088
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x0088:
            r1 = r1 | r17
        L_0x008a:
            r17 = 1572864(0x180000, float:2.204052E-39)
            r17 = r11 & r17
            r8 = r47
            if (r17 != 0) goto L_0x009f
            boolean r19 = r10.i(r8)
            if (r19 == 0) goto L_0x009b
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x009d
        L_0x009b:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x009d:
            r1 = r1 | r19
        L_0x009f:
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r19 = r11 & r19
            r8 = r48
            if (r19 != 0) goto L_0x00b4
            boolean r20 = r10.W(r8)
            if (r20 == 0) goto L_0x00b0
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00b2
        L_0x00b0:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00b2:
            r1 = r1 | r20
        L_0x00b4:
            r20 = 100663296(0x6000000, float:2.4074124E-35)
            r20 = r11 & r20
            if (r20 != 0) goto L_0x00c7
            boolean r20 = r10.W(r14)
            if (r20 == 0) goto L_0x00c3
            r20 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00c5
        L_0x00c3:
            r20 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00c5:
            r1 = r1 | r20
        L_0x00c7:
            r20 = 805306368(0x30000000, float:4.656613E-10)
            r20 = r11 & r20
            if (r20 != 0) goto L_0x00da
            boolean r20 = r10.l(r13)
            if (r20 == 0) goto L_0x00d6
            r20 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00d8
        L_0x00d6:
            r20 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00d8:
            r1 = r1 | r20
        L_0x00da:
            r20 = r55 & 6
            r7 = r51
            if (r20 != 0) goto L_0x00eb
            boolean r20 = r10.W(r7)
            if (r20 == 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r3 = 2
        L_0x00e8:
            r3 = r55 | r3
            goto L_0x00ed
        L_0x00eb:
            r3 = r55
        L_0x00ed:
            r20 = r55 & 48
            if (r20 != 0) goto L_0x00fa
            boolean r20 = r10.W(r12)
            if (r20 == 0) goto L_0x00f9
            r5 = 32
        L_0x00f9:
            r3 = r3 | r5
        L_0x00fa:
            r5 = r3
            r3 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r3 & r1
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r6) goto L_0x010d
            r3 = r5 & 19
            r6 = 18
            if (r3 == r6) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            r3 = 0
            goto L_0x010e
        L_0x010d:
            r3 = 1
        L_0x010e:
            r6 = r1 & 1
            boolean r3 = r10.E(r3, r6)
            if (r3 == 0) goto L_0x03ab
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0124
            java.lang.String r3 = "androidx.compose.material3.DateInputTextField (DateInput.kt:128)"
            r6 = 1456309913(0x56cd8699, float:1.12988988E14)
            androidx.compose.runtime.ComposerKt.Y(r6, r1, r5, r3)
        L_0x0124:
            r3 = 0
            java.lang.Object[] r6 = new java.lang.Object[r3]
            androidx.compose.ui.text.input.TextFieldValue$Companion r3 = androidx.compose.ui.text.input.TextFieldValue.f18892d
            androidx.compose.runtime.saveable.Saver r3 = r3.a()
            java.lang.Object r7 = r10.g()
            androidx.compose.runtime.Composer$Companion r36 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r36.a()
            if (r7 != r0) goto L_0x0141
            androidx.compose.material3.A0 r7 = new androidx.compose.material3.A0
            r7.<init>()
            r10.N(r7)
        L_0x0141:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r0 = 384(0x180, float:5.38E-43)
            androidx.compose.runtime.MutableState r7 = androidx.compose.runtime.saveable.RememberSaveableKt.g(r6, r3, r7, r10, r0)
            androidx.compose.ui.text.input.TextFieldValue r0 = n(r7)
            java.lang.Object[] r6 = new java.lang.Object[]{r0}
            boolean r0 = r10.W(r7)
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r1
            r2 = 8388608(0x800000, float:1.17549435E-38)
            if (r3 != r2) goto L_0x015e
            r2 = 1
            goto L_0x015f
        L_0x015e:
            r2 = 0
        L_0x015f:
            r0 = r0 | r2
            boolean r2 = r10.l(r15)
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r1
            r16 = r3
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            if (r2 != r3) goto L_0x0170
            r3 = 1
            goto L_0x0171
        L_0x0170:
            r3 = 0
        L_0x0171:
            r0 = r0 | r3
            boolean r3 = r10.l(r13)
            r0 = r0 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r1
            r20 = r1
            r1 = 1048576(0x100000, float:1.469368E-39)
            if (r3 != r1) goto L_0x0182
            r1 = 1
            goto L_0x0183
        L_0x0182:
            r1 = 0
        L_0x0183:
            r0 = r0 | r1
            java.lang.Object r1 = r10.g()
            if (r0 != 0) goto L_0x019c
            java.lang.Object r0 = r36.a()
            if (r1 != r0) goto L_0x0191
            goto L_0x019c
        L_0x0191:
            r12 = r2
            r37 = r5
            r11 = r6
            r9 = r16
            r14 = r20
            r16 = r3
            goto L_0x01bd
        L_0x019c:
            androidx.compose.material3.B0 r1 = new androidx.compose.material3.B0
            r0 = r1
            r8 = r1
            r14 = r20
            r1 = r48
            r12 = r2
            r2 = r44
            r11 = r3
            r9 = r16
            r3 = r49
            r4 = r50
            r37 = r5
            r5 = r47
            r16 = r11
            r11 = r6
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.N(r8)
            r1 = r8
        L_0x01bd:
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r0 = 0
            java.lang.Object r1 = androidx.compose.runtime.saveable.RememberSaveableKt.j(r11, r1, r10, r0)
            androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
            java.lang.Object r0 = r1.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.StringsKt.l0(r0)
            if (r0 == 0) goto L_0x01d5
            float r0 = f9642b
            goto L_0x01fb
        L_0x01d5:
            androidx.compose.material3.TextFieldDefaults r20 = androidx.compose.material3.TextFieldDefaults.f11367a
            r25 = 15
            r26 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            androidx.compose.foundation.layout.PaddingValues r0 = androidx.compose.material3.TextFieldDefaults.v(r20, r21, r22, r23, r24, r25, r26)
            float r2 = f9642b
            float r3 = r0.a()
            float r0 = r0.d()
            float r3 = r3 + r0
            float r0 = androidx.compose.ui.unit.Dp.m(r3)
            float r2 = r2 - r0
            float r0 = androidx.compose.ui.unit.Dp.m(r2)
        L_0x01fb:
            androidx.compose.ui.text.input.TextFieldValue r2 = n(r7)
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            if (r12 != r3) goto L_0x0205
            r3 = 1
            goto L_0x0206
        L_0x0205:
            r3 = 0
        L_0x0206:
            boolean r4 = r10.W(r7)
            r3 = r3 | r4
            boolean r4 = r10.W(r1)
            r3 = r3 | r4
            r4 = r14 & 896(0x380, float:1.256E-42)
            r5 = 256(0x100, float:3.59E-43)
            if (r4 != r5) goto L_0x0218
            r4 = 1
            goto L_0x0219
        L_0x0218:
            r4 = 0
        L_0x0219:
            r3 = r3 | r4
            boolean r4 = r10.l(r15)
            r3 = r3 | r4
            boolean r4 = r10.l(r13)
            r3 = r3 | r4
            r4 = 8388608(0x800000, float:1.17549435E-38)
            if (r9 != r4) goto L_0x022a
            r4 = 1
            goto L_0x022b
        L_0x022a:
            r4 = 0
        L_0x022b:
            r3 = r3 | r4
            r5 = r16
            r4 = 1048576(0x100000, float:1.469368E-39)
            if (r5 != r4) goto L_0x0234
            r4 = 1
            goto L_0x0235
        L_0x0234:
            r4 = 0
        L_0x0235:
            r3 = r3 | r4
            java.lang.Object r4 = r10.g()
            if (r3 != 0) goto L_0x024d
            java.lang.Object r3 = r36.a()
            if (r4 != r3) goto L_0x0243
            goto L_0x024d
        L_0x0243:
            r3 = r49
            r5 = r52
            r6 = r10
            r38 = r12
            r39 = r14
            goto L_0x0270
        L_0x024d:
            androidx.compose.material3.C0 r4 = new androidx.compose.material3.C0
            r3 = 32
            r8 = r4
            r9 = r49
            r6 = r10
            r10 = r1
            r11 = r43
            r5 = r52
            r38 = r12
            r12 = r44
            r13 = r50
            r3 = r49
            r39 = r14
            r14 = r48
            r15 = r47
            r16 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r6.N(r4)
        L_0x0270:
            r9 = r4
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r16 = 7
            r17 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r11 = r41
            r15 = r0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.m(r11, r12, r13, r14, r15, r16, r17)
            boolean r4 = r6.W(r1)
            java.lang.Object r8 = r6.g()
            if (r4 != 0) goto L_0x0291
            java.lang.Object r4 = r36.a()
            if (r8 != r4) goto L_0x0299
        L_0x0291:
            androidx.compose.material3.D0 r8 = new androidx.compose.material3.D0
            r8.<init>(r1)
            r6.N(r8)
        L_0x0299:
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r4 = 0
            r10 = 1
            r15 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r0, r15, r8, r10, r4)
            if (r5 == 0) goto L_0x02ab
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.focus.FocusRequesterModifierKt.a(r8, r5)
            goto L_0x02ad
        L_0x02ab:
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
        L_0x02ad:
            androidx.compose.ui.Modifier r10 = r0.o0(r8)
            androidx.compose.material3.DateInputKt$DateInputTextField$3 r0 = new androidx.compose.material3.DateInputKt$DateInputTextField$3
            r0.<init>(r1)
            r8 = 54
            r11 = -357881838(0xffffffffeaab2812, float:-1.0345777E26)
            r14 = 1
            androidx.compose.runtime.internal.ComposableLambda r20 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r11, r14, r0, r6, r8)
            java.lang.Object r0 = r1.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.StringsKt.l0(r0)
            r21 = r0 ^ 1
            androidx.compose.material3.DateVisualTransformation r0 = new androidx.compose.material3.DateVisualTransformation
            r22 = r0
            r0.<init>(r3)
            androidx.compose.foundation.text.KeyboardOptions r24 = new androidx.compose.foundation.text.KeyboardOptions
            r23 = r24
            java.lang.Boolean r26 = java.lang.Boolean.FALSE
            androidx.compose.ui.text.input.KeyboardType$Companion r0 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r27 = r0.d()
            androidx.compose.ui.text.input.ImeAction$Companion r0 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r28 = r0.b()
            r32 = 113(0x71, float:1.58E-43)
            r33 = 0
            r25 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            androidx.compose.material3.TextFieldColors r30 = r51.d()
            int r0 = r39 << 6
            r1 = 33030144(0x1f80000, float:9.110081E-38)
            r32 = r0 & r1
            r34 = 0
            r35 = 4001592(0x3d0f38, float:5.607425E-39)
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r24 = 0
            r25 = 1
            r26 = 0
            r27 = 0
            r28 = 0
            r33 = 12779904(0xc30180, float:1.790846E-38)
            r8 = r2
            r0 = r14
            r14 = r45
            r1 = r15
            r15 = r46
            r31 = r6
            androidx.compose.material3.OutlinedTextFieldKt.f(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            kotlin.Unit r2 = kotlin.Unit.f40552a
            r8 = r37 & 112(0x70, float:1.57E-43)
            r9 = 32
            if (r8 != r9) goto L_0x0331
            r8 = r0
            goto L_0x0332
        L_0x0331:
            r8 = r1
        L_0x0332:
            java.lang.Object r9 = r6.g()
            if (r8 != 0) goto L_0x033e
            java.lang.Object r8 = r36.a()
            if (r9 != r8) goto L_0x0346
        L_0x033e:
            androidx.compose.material3.DateInputKt$DateInputTextField$4$1 r9 = new androidx.compose.material3.DateInputKt$DateInputTextField$4$1
            r9.<init>(r5, r4)
            r6.N(r9)
        L_0x0346:
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r4 = 6
            androidx.compose.runtime.EffectsKt.g(r2, r9, r6, r4)
            r2 = r39 & 112(0x70, float:1.57E-43)
            r4 = 32
            r8 = r44
            if (r2 != r4) goto L_0x0356
            r2 = r0
            goto L_0x0357
        L_0x0356:
            r2 = r1
        L_0x0357:
            boolean r4 = r6.l(r8)
            r2 = r2 | r4
            r9 = r38
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            if (r9 != r4) goto L_0x0363
            r1 = r0
        L_0x0363:
            r0 = r2 | r1
            r10 = r50
            boolean r1 = r6.l(r10)
            r0 = r0 | r1
            boolean r1 = r6.W(r7)
            r0 = r0 | r1
            java.lang.Object r1 = r6.g()
            if (r0 != 0) goto L_0x0380
            java.lang.Object r0 = r36.a()
            if (r1 != r0) goto L_0x037e
            goto L_0x0380
        L_0x037e:
            r7 = r6
            goto L_0x0396
        L_0x0380:
            androidx.compose.material3.DateInputKt$DateInputTextField$5$1 r9 = new androidx.compose.material3.DateInputKt$DateInputTextField$5$1
            r11 = 0
            r0 = r9
            r1 = r42
            r2 = r44
            r3 = r49
            r4 = r50
            r5 = r7
            r7 = r6
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.N(r9)
            r1 = r9
        L_0x0396:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            int r0 = r39 >> 3
            r0 = r0 & 14
            r2 = r42
            androidx.compose.runtime.EffectsKt.g(r2, r1, r7, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x03b3
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x03b3
        L_0x03ab:
            r2 = r42
            r7 = r10
            r10 = r13
            r8 = r15
            r7.B()
        L_0x03b3:
            androidx.compose.runtime.ScopeUpdateScope r15 = r7.x()
            if (r15 == 0) goto L_0x03e2
            androidx.compose.material3.E0 r14 = new androidx.compose.material3.E0
            r0 = r14
            r1 = r41
            r2 = r42
            r3 = r43
            r4 = r44
            r5 = r45
            r6 = r46
            r7 = r47
            r8 = r48
            r9 = r49
            r10 = r50
            r11 = r51
            r12 = r52
            r13 = r54
            r40 = r14
            r14 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r40
            r15.a(r0)
        L_0x03e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputKt.i(androidx.compose.ui.Modifier, java.lang.Long, kotlin.jvm.functions.Function1, androidx.compose.material3.internal.CalendarModel, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, int, androidx.compose.material3.DateInputValidator, androidx.compose.material3.internal.DateInputFormat, java.util.Locale, androidx.compose.material3.DatePickerColors, androidx.compose.ui.focus.FocusRequester, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit j(DateInputFormat dateInputFormat, MutableState mutableState, Function1 function1, CalendarModel calendarModel, Locale locale, DateInputValidator dateInputValidator, int i2, MutableState mutableState2, TextFieldValue textFieldValue) {
        if (textFieldValue.i().length() <= dateInputFormat.c().length()) {
            String i3 = textFieldValue.i();
            int i4 = 0;
            while (true) {
                if (i4 >= i3.length()) {
                    o(mutableState2, textFieldValue);
                    String obj = StringsKt.f1(textFieldValue.i()).toString();
                    Long l2 = null;
                    if (obj.length() != 0 && obj.length() >= dateInputFormat.c().length()) {
                        CalendarDate l3 = calendarModel.l(obj, dateInputFormat.c(), locale);
                        mutableState.setValue(dateInputValidator.c(l3, i2, locale));
                        if (((CharSequence) mutableState.getValue()).length() == 0 && l3 != null) {
                            l2 = Long.valueOf(l3.j());
                        }
                        function1.invoke(l2);
                    } else {
                        mutableState.setValue("");
                        function1.invoke((Object) null);
                    }
                } else if (!Character.isDigit(i3.charAt(i4))) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        return Unit.f40552a;
    }

    public static final Unit k(MutableState mutableState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!StringsKt.l0((CharSequence) mutableState.getValue())) {
            SemanticsPropertiesKt.o(semanticsPropertyReceiver, (String) mutableState.getValue());
        }
        return Unit.f40552a;
    }

    public static final Unit l(Modifier modifier, Long l2, Function1 function1, CalendarModel calendarModel, Function2 function2, Function2 function22, int i2, DateInputValidator dateInputValidator, DateInputFormat dateInputFormat, Locale locale, DatePickerColors datePickerColors, FocusRequester focusRequester, int i3, int i4, Composer composer, int i5) {
        i(modifier, l2, function1, calendarModel, function2, function22, i2, dateInputValidator, dateInputFormat, locale, datePickerColors, focusRequester, composer, RecomposeScopeImplKt.a(i3 | 1), RecomposeScopeImplKt.a(i4));
        return Unit.f40552a;
    }

    public static final MutableState m() {
        return SnapshotStateKt__SnapshotStateKt.e(new TextFieldValue((String) null, 0, (TextRange) null, 7, (DefaultConstructorMarker) null), (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public static final TextFieldValue n(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    public static final void o(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    public static final MutableState p(DateInputValidator dateInputValidator, CalendarModel calendarModel, DateInputFormat dateInputFormat, Locale locale, int i2, MutableState mutableState) {
        return SnapshotStateKt__SnapshotStateKt.e(n(mutableState).i().length() > 0 ? dateInputValidator.c(calendarModel.l(n(mutableState).i(), dateInputFormat.c(), locale), i2, locale) : "", (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public static final PaddingValues r() {
        return f9641a;
    }
}
