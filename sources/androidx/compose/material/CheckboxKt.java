package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class CheckboxKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f7448a = Dp.m((float) 24);

    /* renamed from: b  reason: collision with root package name */
    public static final float f7449b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f7450c = Dp.m((float) 20);

    /* renamed from: d  reason: collision with root package name */
    public static final float f7451d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f7452e;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7469a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.state.ToggleableState[] r0 = androidx.compose.ui.state.ToggleableState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.ui.state.ToggleableState.On     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.ui.state.ToggleableState.Off     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.ui.state.ToggleableState.Indeterminate     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f7469a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.WhenMappings.<clinit>():void");
        }
    }

    static {
        float f2 = (float) 2;
        f7449b = Dp.m(f2);
        f7451d = Dp.m(f2);
        f7452e = Dp.m(f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(boolean r29, kotlin.jvm.functions.Function1 r30, androidx.compose.ui.Modifier r31, boolean r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, androidx.compose.material.CheckboxColors r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r1 = r29
            r2 = r30
            r7 = r36
            r0 = -2118660998(0xffffffff81b7cc7a, float:-6.751699E-38)
            r3 = r35
            androidx.compose.runtime.Composer r3 = r3.q(r0)
            r4 = r37 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r7 | 6
            goto L_0x0026
        L_0x0016:
            r4 = r7 & 6
            if (r4 != 0) goto L_0x0025
            boolean r4 = r3.d(r1)
            if (r4 == 0) goto L_0x0022
            r4 = 4
            goto L_0x0023
        L_0x0022:
            r4 = 2
        L_0x0023:
            r4 = r4 | r7
            goto L_0x0026
        L_0x0025:
            r4 = r7
        L_0x0026:
            r6 = r37 & 2
            if (r6 == 0) goto L_0x002d
            r4 = r4 | 48
            goto L_0x003d
        L_0x002d:
            r6 = r7 & 48
            if (r6 != 0) goto L_0x003d
            boolean r6 = r3.l(r2)
            if (r6 == 0) goto L_0x003a
            r6 = 32
            goto L_0x003c
        L_0x003a:
            r6 = 16
        L_0x003c:
            r4 = r4 | r6
        L_0x003d:
            r6 = r37 & 4
            if (r6 == 0) goto L_0x0046
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0043:
            r8 = r31
            goto L_0x0058
        L_0x0046:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0043
            r8 = r31
            boolean r9 = r3.W(r8)
            if (r9 == 0) goto L_0x0055
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r4 = r4 | r9
        L_0x0058:
            r9 = r37 & 8
            if (r9 == 0) goto L_0x0061
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x005e:
            r10 = r32
            goto L_0x0073
        L_0x0061:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x005e
            r10 = r32
            boolean r11 = r3.d(r10)
            if (r11 == 0) goto L_0x0070
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0072
        L_0x0070:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0072:
            r4 = r4 | r11
        L_0x0073:
            r11 = r37 & 16
            if (r11 == 0) goto L_0x007c
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0079:
            r12 = r33
            goto L_0x008e
        L_0x007c:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0079
            r12 = r33
            boolean r13 = r3.W(r12)
            if (r13 == 0) goto L_0x008b
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008d
        L_0x008b:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x008d:
            r4 = r4 | r13
        L_0x008e:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r7
            if (r13 != 0) goto L_0x00a8
            r13 = r37 & 32
            if (r13 != 0) goto L_0x00a2
            r13 = r34
            boolean r14 = r3.W(r13)
            if (r14 == 0) goto L_0x00a4
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a6
        L_0x00a2:
            r13 = r34
        L_0x00a4:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00a6:
            r4 = r4 | r14
            goto L_0x00aa
        L_0x00a8:
            r13 = r34
        L_0x00aa:
            r14 = 74899(0x12493, float:1.04956E-40)
            r14 = r14 & r4
            r15 = 74898(0x12492, float:1.04954E-40)
            r22 = 0
            r23 = 1
            if (r14 == r15) goto L_0x00ba
            r14 = r23
            goto L_0x00bc
        L_0x00ba:
            r14 = r22
        L_0x00bc:
            r15 = r4 & 1
            boolean r14 = r3.E(r14, r15)
            if (r14 == 0) goto L_0x0197
            r3.p()
            r14 = r7 & 1
            r24 = 0
            r25 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r14 == 0) goto L_0x00ea
            boolean r14 = r3.J()
            if (r14 == 0) goto L_0x00d7
            goto L_0x00ea
        L_0x00d7:
            r3.B()
            r6 = r37 & 32
            if (r6 == 0) goto L_0x00e0
            r4 = r4 & r25
        L_0x00e0:
            r6 = r8
            r26 = r10
            r27 = r12
        L_0x00e5:
            r5 = 32
            r8 = r4
            r4 = r13
            goto L_0x0121
        L_0x00ea:
            if (r6 == 0) goto L_0x00ef
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00f0
        L_0x00ef:
            r6 = r8
        L_0x00f0:
            if (r9 == 0) goto L_0x00f5
            r26 = r23
            goto L_0x00f7
        L_0x00f5:
            r26 = r10
        L_0x00f7:
            if (r11 == 0) goto L_0x00fc
            r27 = r24
            goto L_0x00fe
        L_0x00fc:
            r27 = r12
        L_0x00fe:
            r8 = r37 & 32
            if (r8 == 0) goto L_0x00e5
            androidx.compose.material.CheckboxDefaults r8 = androidx.compose.material.CheckboxDefaults.f7447a
            r20 = 196608(0x30000, float:2.75506E-40)
            r21 = 31
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r5 = 32
            r19 = r3
            androidx.compose.material.CheckboxColors r8 = r8.a(r9, r11, r13, r15, r17, r19, r20, r21)
            r4 = r4 & r25
            r28 = r8
            r8 = r4
            r4 = r28
        L_0x0121:
            r3.U()
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0130
            r9 = -1
            java.lang.String r10 = "androidx.compose.material.Checkbox (Checkbox.kt:91)"
            androidx.compose.runtime.ComposerKt.Y(r0, r8, r9, r10)
        L_0x0130:
            androidx.compose.ui.state.ToggleableState r0 = androidx.compose.ui.state.ToggleableStateKt.a(r29)
            if (r2 == 0) goto L_0x016a
            r9 = -1450332004(0xffffffffa98db09c, float:-6.292295E-14)
            r3.X(r9)
            r9 = r8 & 112(0x70, float:1.57E-43)
            if (r9 != r5) goto L_0x0143
            r5 = r23
            goto L_0x0145
        L_0x0143:
            r5 = r22
        L_0x0145:
            r9 = r8 & 14
            r10 = 4
            if (r9 != r10) goto L_0x014c
            r22 = r23
        L_0x014c:
            r5 = r5 | r22
            java.lang.Object r9 = r3.g()
            if (r5 != 0) goto L_0x015c
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r9 != r5) goto L_0x0164
        L_0x015c:
            androidx.compose.material.CheckboxKt$Checkbox$1$1 r9 = new androidx.compose.material.CheckboxKt$Checkbox$1$1
            r9.<init>(r2, r1)
            r3.N(r9)
        L_0x0164:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r3.M()
            goto L_0x0175
        L_0x016a:
            r5 = -1450267308(0xffffffffa98ead54, float:-6.3361344E-14)
            r3.X(r5)
            r3.M()
            r9 = r24
        L_0x0175:
            r5 = 524160(0x7ff80, float:7.34505E-40)
            r15 = r8 & r5
            r16 = 0
            r8 = r0
            r10 = r6
            r11 = r26
            r12 = r27
            r13 = r4
            r14 = r3
            h(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0190
            androidx.compose.runtime.ComposerKt.X()
        L_0x0190:
            r8 = r6
            r5 = r27
            r6 = r4
            r4 = r26
            goto L_0x019d
        L_0x0197:
            r3.B()
            r4 = r10
            r5 = r12
            r6 = r13
        L_0x019d:
            androidx.compose.runtime.ScopeUpdateScope r9 = r3.x()
            if (r9 == 0) goto L_0x01b5
            androidx.compose.material.CheckboxKt$Checkbox$2 r10 = new androidx.compose.material.CheckboxKt$Checkbox$2
            r0 = r10
            r1 = r29
            r2 = r30
            r3 = r8
            r7 = r36
            r8 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x01b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.a(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v41, resolved type: androidx.compose.material.CheckDrawingCache} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: androidx.compose.material.CheckDrawingCache} */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x023d, code lost:
        if (r13 == r8.a()) goto L_0x023f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(boolean r36, androidx.compose.ui.state.ToggleableState r37, androidx.compose.ui.Modifier r38, androidx.compose.material.CheckboxColors r39, androidx.compose.runtime.Composer r40, int r41) {
        /*
            r1 = r36
            r2 = r37
            r3 = r38
            r4 = r39
            r5 = r41
            r0 = -2118895727(0xffffffff81b43791, float:-6.620129E-38)
            r6 = r40
            androidx.compose.runtime.Composer r14 = r6.q(r0)
            r6 = r5 & 6
            r15 = 2
            if (r6 != 0) goto L_0x0023
            boolean r6 = r14.d(r1)
            if (r6 == 0) goto L_0x0020
            r6 = 4
            goto L_0x0021
        L_0x0020:
            r6 = r15
        L_0x0021:
            r6 = r6 | r5
            goto L_0x0024
        L_0x0023:
            r6 = r5
        L_0x0024:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x0034
            boolean r7 = r14.W(r2)
            if (r7 == 0) goto L_0x0031
            r7 = 32
            goto L_0x0033
        L_0x0031:
            r7 = 16
        L_0x0033:
            r6 = r6 | r7
        L_0x0034:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0044
            boolean r7 = r14.W(r3)
            if (r7 == 0) goto L_0x0041
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r6 = r6 | r7
        L_0x0044:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0054
            boolean r7 = r14.W(r4)
            if (r7 == 0) goto L_0x0051
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0053
        L_0x0051:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r6 = r6 | r7
        L_0x0054:
            r13 = r6
            r6 = r13 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            r12 = 0
            r11 = 1
            if (r6 == r7) goto L_0x005f
            r6 = r11
            goto L_0x0060
        L_0x005f:
            r6 = r12
        L_0x0060:
            r7 = r13 & 1
            boolean r6 = r14.E(r6, r7)
            if (r6 == 0) goto L_0x0262
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            r10 = -1
            if (r6 == 0) goto L_0x0074
            java.lang.String r6 = "androidx.compose.material.CheckboxImpl (Checkbox.kt:258)"
            androidx.compose.runtime.ComposerKt.Y(r0, r13, r10, r6)
        L_0x0074:
            int r0 = r13 >> 3
            r9 = r0 & 14
            r8 = 0
            androidx.compose.animation.core.Transition r16 = androidx.compose.animation.core.TransitionKt.j(r2, r8, r14, r9, r15)
            androidx.compose.material.CheckboxKt$CheckboxImpl$checkDrawFraction$2 r6 = androidx.compose.material.CheckboxKt$CheckboxImpl$checkDrawFraction$2.f7465z
            kotlin.jvm.internal.FloatCompanionObject r17 = kotlin.jvm.internal.FloatCompanionObject.f40896a
            androidx.compose.animation.core.TwoWayConverter r18 = androidx.compose.animation.core.VectorConvertersKt.i(r17)
            java.lang.Object r7 = r16.i()
            androidx.compose.ui.state.ToggleableState r7 = (androidx.compose.ui.state.ToggleableState) r7
            r8 = -1798345588(0xffffffff94cf6c8c, float:-2.0944473E-26)
            r14.X(r8)
            boolean r19 = androidx.compose.runtime.ComposerKt.P()
            java.lang.String r15 = "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:270)"
            if (r19 == 0) goto L_0x009c
            androidx.compose.runtime.ComposerKt.Y(r8, r12, r10, r15)
        L_0x009c:
            int[] r19 = androidx.compose.material.CheckboxKt.WhenMappings.f7469a
            int r7 = r7.ordinal()
            r7 = r19[r7]
            r20 = r13
            r13 = 3
            r21 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
            if (r7 == r11) goto L_0x00b2
            r11 = 2
            if (r7 == r11) goto L_0x00bb
            if (r7 != r13) goto L_0x00b5
        L_0x00b2:
            r7 = r22
            goto L_0x00bd
        L_0x00b5:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00bb:
            r7 = r21
        L_0x00bd:
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x00c6
            androidx.compose.runtime.ComposerKt.X()
        L_0x00c6:
            r14.M()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r11 = r16.q()
            androidx.compose.ui.state.ToggleableState r11 = (androidx.compose.ui.state.ToggleableState) r11
            r14.X(r8)
            boolean r23 = androidx.compose.runtime.ComposerKt.P()
            if (r23 == 0) goto L_0x00df
            androidx.compose.runtime.ComposerKt.Y(r8, r12, r10, r15)
        L_0x00df:
            int r8 = r11.ordinal()
            r8 = r19[r8]
            r11 = 1
            if (r8 == r11) goto L_0x00ed
            r15 = 2
            if (r8 == r15) goto L_0x00f6
            if (r8 != r13) goto L_0x00f0
        L_0x00ed:
            r8 = r22
            goto L_0x00f8
        L_0x00f0:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00f6:
            r8 = r21
        L_0x00f8:
            boolean r15 = androidx.compose.runtime.ComposerKt.P()
            if (r15 == 0) goto L_0x0101
            androidx.compose.runtime.ComposerKt.X()
        L_0x0101:
            r14.M()
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            androidx.compose.animation.core.Transition$Segment r15 = r16.o()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            java.lang.Object r6 = r6.d(r15, r14, r10)
            r10 = r6
            androidx.compose.animation.core.FiniteAnimationSpec r10 = (androidx.compose.animation.core.FiniteAnimationSpec) r10
            java.lang.String r15 = "FloatAnimation"
            r23 = 0
            r6 = r16
            r24 = r9
            r9 = r10
            r10 = r18
            r11 = r15
            r15 = r12
            r12 = r14
            r18 = r20
            r13 = r23
            androidx.compose.runtime.State r33 = androidx.compose.animation.core.TransitionKt.f(r6, r7, r8, r9, r10, r11, r12, r13)
            androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 r6 = androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.f7464z
            androidx.compose.animation.core.TwoWayConverter r10 = androidx.compose.animation.core.VectorConvertersKt.i(r17)
            java.lang.Object r7 = r16.i()
            androidx.compose.ui.state.ToggleableState r7 = (androidx.compose.ui.state.ToggleableState) r7
            r8 = -2098942571(0xffffffff82e4ad95, float:-3.360122E-37)
            r14.X(r8)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            java.lang.String r11 = "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:287)"
            if (r9 == 0) goto L_0x014c
            r9 = -1
            androidx.compose.runtime.ComposerKt.Y(r8, r15, r9, r11)
            goto L_0x014d
        L_0x014c:
            r9 = -1
        L_0x014d:
            int r7 = r7.ordinal()
            r7 = r19[r7]
            r12 = 1
            if (r7 == r12) goto L_0x0165
            r13 = 2
            if (r7 == r13) goto L_0x0165
            r13 = 3
            if (r7 != r13) goto L_0x015f
            r7 = r22
            goto L_0x0168
        L_0x015f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0165:
            r13 = 3
            r7 = r21
        L_0x0168:
            boolean r17 = androidx.compose.runtime.ComposerKt.P()
            if (r17 == 0) goto L_0x0171
            androidx.compose.runtime.ComposerKt.X()
        L_0x0171:
            r14.M()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r17 = r16.q()
            androidx.compose.ui.state.ToggleableState r17 = (androidx.compose.ui.state.ToggleableState) r17
            r14.X(r8)
            boolean r20 = androidx.compose.runtime.ComposerKt.P()
            if (r20 == 0) goto L_0x018a
            androidx.compose.runtime.ComposerKt.Y(r8, r15, r9, r11)
        L_0x018a:
            int r8 = r17.ordinal()
            r8 = r19[r8]
            if (r8 == r12) goto L_0x01a0
            r9 = 2
            if (r8 == r9) goto L_0x01a0
            if (r8 != r13) goto L_0x019a
            r21 = r22
            goto L_0x01a0
        L_0x019a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01a0:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x01a9
            androidx.compose.runtime.ComposerKt.X()
        L_0x01a9:
            r14.M()
            java.lang.Float r8 = java.lang.Float.valueOf(r21)
            androidx.compose.animation.core.Transition$Segment r9 = r16.o()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            java.lang.Object r6 = r6.d(r9, r14, r11)
            r9 = r6
            androidx.compose.animation.core.FiniteAnimationSpec r9 = (androidx.compose.animation.core.FiniteAnimationSpec) r9
            java.lang.String r11 = "FloatAnimation"
            r6 = r16
            r12 = r14
            r35 = r33
            r13 = r23
            androidx.compose.runtime.State r6 = androidx.compose.animation.core.TransitionKt.f(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r7 = r14.g()
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r8.a()
            if (r7 != r9) goto L_0x01ec
            androidx.compose.material.CheckDrawingCache r7 = new androidx.compose.material.CheckDrawingCache
            r29 = 7
            r30 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r25 = r7
            r25.<init>(r26, r27, r28, r29, r30)
            r14.N(r7)
        L_0x01ec:
            r29 = r7
            androidx.compose.material.CheckDrawingCache r29 = (androidx.compose.material.CheckDrawingCache) r29
            int r7 = r18 >> 6
            r7 = r7 & 112(0x70, float:1.57E-43)
            r7 = r24 | r7
            androidx.compose.runtime.State r7 = r4.a(r2, r14, r7)
            r9 = r18 & 126(0x7e, float:1.77E-43)
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r9
            androidx.compose.runtime.State r9 = r4.b(r1, r2, r14, r0)
            androidx.compose.runtime.State r0 = r4.c(r1, r2, r14, r0)
            androidx.compose.ui.Alignment$Companion r10 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r10 = r10.e()
            r11 = 2
            r12 = 0
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.SizeKt.E(r3, r10, r15, r11, r12)
            float r11 = f7450c
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.SizeKt.o(r10, r11)
            boolean r11 = r14.W(r9)
            boolean r12 = r14.W(r0)
            r11 = r11 | r12
            boolean r12 = r14.W(r7)
            r11 = r11 | r12
            r12 = r35
            boolean r13 = r14.W(r12)
            r11 = r11 | r13
            boolean r13 = r14.W(r6)
            r11 = r11 | r13
            java.lang.Object r13 = r14.g()
            if (r11 != 0) goto L_0x023f
            java.lang.Object r8 = r8.a()
            if (r13 != r8) goto L_0x0253
        L_0x023f:
            androidx.compose.material.CheckboxKt$CheckboxImpl$1$1 r13 = new androidx.compose.material.CheckboxKt$CheckboxImpl$1$1
            r28 = r13
            r30 = r9
            r31 = r0
            r32 = r7
            r33 = r12
            r34 = r6
            r28.<init>(r29, r30, r31, r32, r33, r34)
            r14.N(r13)
        L_0x0253:
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            androidx.compose.foundation.CanvasKt.b(r10, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0265
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0265
        L_0x0262:
            r14.B()
        L_0x0265:
            androidx.compose.runtime.ScopeUpdateScope r6 = r14.x()
            if (r6 == 0) goto L_0x027e
            androidx.compose.material.CheckboxKt$CheckboxImpl$2 r7 = new androidx.compose.material.CheckboxKt$CheckboxImpl$2
            r0 = r7
            r1 = r36
            r2 = r37
            r3 = r38
            r4 = r39
            r5 = r41
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x027e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.b(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.Modifier, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int):void");
    }

    public static final float c(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float d(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final long e(State state) {
        return ((Color) state.getValue()).v();
    }

    public static final long f(State state) {
        return ((Color) state.getValue()).v();
    }

    public static final long g(State state) {
        return ((Color) state.getValue()).v();
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(androidx.compose.ui.state.ToggleableState r24, kotlin.jvm.functions.Function0 r25, androidx.compose.ui.Modifier r26, boolean r27, androidx.compose.foundation.interaction.MutableInteractionSource r28, androidx.compose.material.CheckboxColors r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r7 = r25
            r8 = r31
            r0 = 2031255194(0x79127e9a, float:4.7540195E34)
            r1 = r30
            androidx.compose.runtime.Composer r6 = r1.q(r0)
            r1 = r32 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r8 | 6
            r5 = r24
            goto L_0x0028
        L_0x0016:
            r1 = r8 & 6
            r5 = r24
            if (r1 != 0) goto L_0x0027
            boolean r1 = r6.W(r5)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r8
            goto L_0x0028
        L_0x0027:
            r1 = r8
        L_0x0028:
            r2 = r32 & 2
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
            goto L_0x003f
        L_0x002f:
            r2 = r8 & 48
            if (r2 != 0) goto L_0x003f
            boolean r2 = r6.l(r7)
            if (r2 == 0) goto L_0x003c
            r2 = 32
            goto L_0x003e
        L_0x003c:
            r2 = 16
        L_0x003e:
            r1 = r1 | r2
        L_0x003f:
            r2 = r32 & 4
            if (r2 == 0) goto L_0x0048
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0045:
            r3 = r26
            goto L_0x005a
        L_0x0048:
            r3 = r8 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0045
            r3 = r26
            boolean r4 = r6.W(r3)
            if (r4 == 0) goto L_0x0057
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r1 = r1 | r4
        L_0x005a:
            r4 = r32 & 8
            if (r4 == 0) goto L_0x0063
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0060:
            r9 = r27
            goto L_0x0075
        L_0x0063:
            r9 = r8 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0060
            r9 = r27
            boolean r10 = r6.d(r9)
            if (r10 == 0) goto L_0x0072
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r1 = r1 | r10
        L_0x0075:
            r10 = r32 & 16
            if (r10 == 0) goto L_0x007e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007b:
            r11 = r28
            goto L_0x0090
        L_0x007e:
            r11 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x007b
            r11 = r28
            boolean r12 = r6.W(r11)
            if (r12 == 0) goto L_0x008d
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r1 = r1 | r12
        L_0x0090:
            r12 = 196608(0x30000, float:2.75506E-40)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x00aa
            r12 = r32 & 32
            if (r12 != 0) goto L_0x00a4
            r12 = r29
            boolean r13 = r6.W(r12)
            if (r13 == 0) goto L_0x00a6
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00a4:
            r12 = r29
        L_0x00a6:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00a8:
            r1 = r1 | r13
            goto L_0x00ac
        L_0x00aa:
            r12 = r29
        L_0x00ac:
            r13 = 74899(0x12493, float:1.04956E-40)
            r13 = r13 & r1
            r14 = 74898(0x12492, float:1.04954E-40)
            r15 = 1
            if (r13 == r14) goto L_0x00b8
            r13 = r15
            goto L_0x00b9
        L_0x00b8:
            r13 = 0
        L_0x00b9:
            r14 = r1 & 1
            boolean r13 = r6.E(r13, r14)
            if (r13 == 0) goto L_0x018d
            r6.p()
            r13 = r8 & 1
            r23 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r13 == 0) goto L_0x00df
            boolean r13 = r6.J()
            if (r13 == 0) goto L_0x00d2
            goto L_0x00df
        L_0x00d2:
            r6.B()
            r2 = r32 & 32
            if (r2 == 0) goto L_0x00db
            r1 = r1 & r23
        L_0x00db:
            r13 = r1
            r10 = r9
            r9 = r3
            goto L_0x0115
        L_0x00df:
            if (r2 == 0) goto L_0x00e4
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00e5
        L_0x00e4:
            r2 = r3
        L_0x00e5:
            if (r4 == 0) goto L_0x00e9
            r3 = r15
            goto L_0x00ea
        L_0x00e9:
            r3 = r9
        L_0x00ea:
            if (r10 == 0) goto L_0x00ee
            r4 = 0
            goto L_0x00ef
        L_0x00ee:
            r4 = r11
        L_0x00ef:
            r9 = r32 & 32
            if (r9 == 0) goto L_0x0111
            androidx.compose.material.CheckboxDefaults r9 = androidx.compose.material.CheckboxDefaults.f7447a
            r21 = 196608(0x30000, float:2.75506E-40)
            r22 = 31
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = r6
            androidx.compose.material.CheckboxColors r9 = r9.a(r10, r12, r14, r16, r18, r20, r21, r22)
            r1 = r1 & r23
            r13 = r1
            r10 = r3
            r11 = r4
            r12 = r9
            r9 = r2
            goto L_0x0115
        L_0x0111:
            r13 = r1
            r9 = r2
            r10 = r3
            r11 = r4
        L_0x0115:
            r6.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0124
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.TriStateCheckbox (Checkbox.kt:140)"
            androidx.compose.runtime.ComposerKt.Y(r0, r13, r1, r2)
        L_0x0124:
            if (r7 == 0) goto L_0x014c
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.semantics.Role$Companion r1 = androidx.compose.ui.semantics.Role.f18040b
            int r1 = r1.c()
            float r15 = f7448a
            r18 = 4
            r19 = 0
            r14 = 0
            r16 = 0
            androidx.compose.foundation.IndicationNodeFactory r3 = androidx.compose.material.RippleKt.f(r14, r15, r16, r18, r19)
            androidx.compose.ui.semantics.Role r14 = androidx.compose.ui.semantics.Role.j(r1)
            r1 = r24
            r2 = r11
            r4 = r10
            r5 = r14
            r14 = r6
            r6 = r25
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.ToggleableKt.e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x014f
        L_0x014c:
            r14 = r6
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
        L_0x014f:
            if (r7 == 0) goto L_0x0158
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r1 = androidx.compose.material.InteractiveComponentSizeKt.c(r1)
            goto L_0x015a
        L_0x0158:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
        L_0x015a:
            androidx.compose.ui.Modifier r1 = r9.o0(r1)
            androidx.compose.ui.Modifier r0 = r1.o0(r0)
            float r1 = f7449b
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.i(r0, r1)
            int r0 = r13 >> 9
            r0 = r0 & 14
            int r1 = r13 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r13 >> 6
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = r0 | r1
            r1 = r10
            r2 = r24
            r4 = r12
            r5 = r14
            b(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0188
            androidx.compose.runtime.ComposerKt.X()
        L_0x0188:
            r3 = r9
            r4 = r10
        L_0x018a:
            r5 = r11
            r6 = r12
            goto L_0x0193
        L_0x018d:
            r14 = r6
            r14.B()
            r4 = r9
            goto L_0x018a
        L_0x0193:
            androidx.compose.runtime.ScopeUpdateScope r9 = r14.x()
            if (r9 == 0) goto L_0x01aa
            androidx.compose.material.CheckboxKt$TriStateCheckbox$1 r10 = new androidx.compose.material.CheckboxKt$TriStateCheckbox$1
            r0 = r10
            r1 = r24
            r2 = r25
            r7 = r31
            r8 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x01aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.h(androidx.compose.ui.state.ToggleableState, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void s(DrawScope drawScope, long j2, long j3, float f2, float f3) {
        float f4 = f2;
        float f5 = f3;
        float f6 = f5 / 2.0f;
        Stroke stroke = new Stroke(f3, 0.0f, 0, 0, (PathEffect) null, 30, (DefaultConstructorMarker) null);
        float i2 = Size.i(drawScope.c());
        if (Color.n(j2, j3)) {
            DrawScope.m2(drawScope, j2, 0, SizeKt.a(i2, i2), CornerRadiusKt.a(f4, 0.0f, 2, (Object) null), Fill.f16295a, 0.0f, (ColorFilter) null, 0, 226, (Object) null);
            return;
        }
        float f7 = i2 - (((float) 2) * f5);
        DrawScope.m2(drawScope, j2, OffsetKt.a(f5, f5), SizeKt.a(f7, f7), CornerRadiusKt.a(Math.max(0.0f, f4 - f5), 0.0f, 2, (Object) null), Fill.f16295a, 0.0f, (ColorFilter) null, 0, 224, (Object) null);
        float f8 = i2 - f5;
        DrawScope.m2(drawScope, j3, OffsetKt.a(f6, f6), SizeKt.a(f8, f8), CornerRadiusKt.a(f4 - f6, 0.0f, 2, (Object) null), stroke, 0.0f, (ColorFilter) null, 0, 224, (Object) null);
    }

    public static final void t(DrawScope drawScope, long j2, float f2, float f3, float f4, CheckDrawingCache checkDrawingCache) {
        float f5 = f3;
        Stroke stroke = new Stroke(f4, 0.0f, StrokeCap.f16130b.c(), 0, (PathEffect) null, 26, (DefaultConstructorMarker) null);
        float i2 = Size.i(drawScope.c());
        float b2 = MathHelpersKt.b(0.4f, 0.5f, f3);
        float b3 = MathHelpersKt.b(0.7f, 0.5f, f3);
        float b4 = MathHelpersKt.b(0.5f, 0.5f, f3);
        float b5 = MathHelpersKt.b(0.3f, 0.5f, f3);
        checkDrawingCache.a().b();
        checkDrawingCache.a().q(0.2f * i2, b4 * i2);
        checkDrawingCache.a().z(b2 * i2, b3 * i2);
        checkDrawingCache.a().z(0.8f * i2, i2 * b5);
        checkDrawingCache.b().a(checkDrawingCache.a(), false);
        checkDrawingCache.c().b();
        checkDrawingCache.b().c(0.0f, checkDrawingCache.b().b() * f2, checkDrawingCache.c(), true);
        DrawScope.E1(drawScope, checkDrawingCache.c(), j2, 0.0f, stroke, (ColorFilter) null, 0, 52, (Object) null);
    }
}
