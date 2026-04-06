package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class CheckboxKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f9386a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f9387b = Dp.m((float) 20);

    /* renamed from: c  reason: collision with root package name */
    public static final float f9388c;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9391a;

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
                f9391a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.WhenMappings.<clinit>():void");
        }
    }

    static {
        float f2 = (float) 2;
        f9386a = Dp.m(f2);
        f9388c = Dp.m(f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(boolean r29, kotlin.jvm.functions.Function1 r30, androidx.compose.ui.Modifier r31, boolean r32, androidx.compose.material3.CheckboxColors r33, androidx.compose.foundation.interaction.MutableInteractionSource r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r1 = r29
            r2 = r30
            r7 = r36
            r0 = -1406741137(0xffffffffac26d56f, float:-2.3708498E-12)
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
            r8 = 32
            if (r6 == 0) goto L_0x002f
            r4 = r4 | 48
            goto L_0x003e
        L_0x002f:
            r6 = r7 & 48
            if (r6 != 0) goto L_0x003e
            boolean r6 = r3.l(r2)
            if (r6 == 0) goto L_0x003b
            r6 = r8
            goto L_0x003d
        L_0x003b:
            r6 = 16
        L_0x003d:
            r4 = r4 | r6
        L_0x003e:
            r6 = r37 & 4
            if (r6 == 0) goto L_0x0047
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0044:
            r9 = r31
            goto L_0x0059
        L_0x0047:
            r9 = r7 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0044
            r9 = r31
            boolean r10 = r3.W(r9)
            if (r10 == 0) goto L_0x0056
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r4 = r4 | r10
        L_0x0059:
            r10 = r37 & 8
            if (r10 == 0) goto L_0x0062
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x005f:
            r11 = r32
            goto L_0x0074
        L_0x0062:
            r11 = r7 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x005f
            r11 = r32
            boolean r12 = r3.d(r11)
            if (r12 == 0) goto L_0x0071
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x0071:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r4 = r4 | r12
        L_0x0074:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x008d
            r12 = r37 & 16
            if (r12 != 0) goto L_0x0087
            r12 = r33
            boolean r13 = r3.W(r12)
            if (r13 == 0) goto L_0x0089
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008b
        L_0x0087:
            r12 = r33
        L_0x0089:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x008b:
            r4 = r4 | r13
            goto L_0x008f
        L_0x008d:
            r12 = r33
        L_0x008f:
            r13 = r37 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x0099
            r4 = r4 | r14
        L_0x0096:
            r14 = r34
            goto L_0x00aa
        L_0x0099:
            r14 = r14 & r7
            if (r14 != 0) goto L_0x0096
            r14 = r34
            boolean r15 = r3.W(r14)
            if (r15 == 0) goto L_0x00a7
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a9
        L_0x00a7:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00a9:
            r4 = r4 | r15
        L_0x00aa:
            r15 = 74899(0x12493, float:1.04956E-40)
            r15 = r15 & r4
            r5 = 74898(0x12492, float:1.04954E-40)
            r16 = 0
            r17 = 1
            if (r15 == r5) goto L_0x00ba
            r5 = r17
            goto L_0x00bc
        L_0x00ba:
            r5 = r16
        L_0x00bc:
            r15 = r4 & 1
            boolean r5 = r3.E(r5, r15)
            if (r5 == 0) goto L_0x01bd
            r3.p()
            r5 = r7 & 1
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            r15 = 6
            if (r5 == 0) goto L_0x00e9
            boolean r5 = r3.J()
            if (r5 == 0) goto L_0x00d6
            goto L_0x00e9
        L_0x00d6:
            r3.B()
            r5 = r37 & 16
            if (r5 == 0) goto L_0x00df
            r4 = r4 & r18
        L_0x00df:
            r5 = r11
            r6 = r12
            r19 = r14
        L_0x00e3:
            r28 = r9
            r9 = r4
            r4 = r28
            goto L_0x0106
        L_0x00e9:
            if (r6 == 0) goto L_0x00ee
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            r9 = r5
        L_0x00ee:
            if (r10 == 0) goto L_0x00f2
            r11 = r17
        L_0x00f2:
            r5 = r37 & 16
            if (r5 == 0) goto L_0x00ff
            androidx.compose.material3.CheckboxDefaults r5 = androidx.compose.material3.CheckboxDefaults.f9383a
            androidx.compose.material3.CheckboxColors r5 = r5.a(r3, r15)
            r4 = r4 & r18
            r12 = r5
        L_0x00ff:
            if (r13 == 0) goto L_0x00df
            r5 = r11
            r6 = r12
            r19 = 0
            goto L_0x00e3
        L_0x0106:
            r3.U()
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x0115
            r10 = -1
            java.lang.String r11 = "androidx.compose.material3.Checkbox (Checkbox.kt:97)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r10, r11)
        L_0x0115:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r0 = r3.C(r0)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
            androidx.compose.material3.CheckboxDefaults r10 = androidx.compose.material3.CheckboxDefaults.f9383a
            float r10 = r10.c()
            float r0 = r0.B1(r10)
            double r10 = (double) r0
            double r10 = java.lang.Math.floor(r10)
            float r0 = (float) r10
            androidx.compose.ui.state.ToggleableState r10 = androidx.compose.ui.state.ToggleableStateKt.a(r29)
            if (r2 == 0) goto L_0x0169
            r11 = 2066152950(0x7b26fdf6, float:8.670722E35)
            r3.X(r11)
            r11 = r9 & 112(0x70, float:1.57E-43)
            if (r11 != r8) goto L_0x0142
            r8 = r17
            goto L_0x0144
        L_0x0142:
            r8 = r16
        L_0x0144:
            r11 = r9 & 14
            r12 = 4
            if (r11 != r12) goto L_0x014b
            r16 = r17
        L_0x014b:
            r8 = r8 | r16
            java.lang.Object r11 = r3.g()
            if (r8 != 0) goto L_0x015b
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r11 != r8) goto L_0x0163
        L_0x015b:
            androidx.compose.material3.f0 r11 = new androidx.compose.material3.f0
            r11.<init>(r2, r1)
            r3.N(r11)
        L_0x0163:
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            r3.M()
            goto L_0x0173
        L_0x0169:
            r8 = 2066218639(0x7b27fe8f, float:8.722766E35)
            r3.X(r8)
            r3.M()
            r11 = 0
        L_0x0173:
            androidx.compose.ui.graphics.drawscope.Stroke r12 = new androidx.compose.ui.graphics.drawscope.Stroke
            androidx.compose.ui.graphics.StrokeCap$Companion r8 = androidx.compose.ui.graphics.StrokeCap.f16130b
            int r23 = r8.c()
            r26 = 26
            r27 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r20 = r12
            r21 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            androidx.compose.ui.graphics.drawscope.Stroke r13 = new androidx.compose.ui.graphics.drawscope.Stroke
            r26 = 30
            r23 = 0
            r20 = r13
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            int r0 = r9 << 6
            r8 = 33546240(0x1ffe000, float:9.399363E-38)
            r17 = r0 & r8
            r18 = 0
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r4
            r13 = r5
            r14 = r6
            r15 = r19
            r16 = r3
            l(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01b7
            androidx.compose.runtime.ComposerKt.X()
        L_0x01b7:
            r9 = r4
            r4 = r5
            r5 = r6
            r6 = r19
            goto L_0x01c3
        L_0x01bd:
            r3.B()
            r4 = r11
            r5 = r12
            r6 = r14
        L_0x01c3:
            androidx.compose.runtime.ScopeUpdateScope r10 = r3.x()
            if (r10 == 0) goto L_0x01db
            androidx.compose.material3.g0 r11 = new androidx.compose.material3.g0
            r0 = r11
            r1 = r29
            r2 = r30
            r3 = r9
            r7 = r36
            r8 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.a(r11)
        L_0x01db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.f(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.CheckboxColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit g(Function1 function1, boolean z2) {
        function1.invoke(Boolean.valueOf(!z2));
        return Unit.f40552a;
    }

    public static final Unit h(boolean z2, Function1 function1, Modifier modifier, boolean z3, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        f(z2, function1, modifier, z3, checkboxColors, mutableInteractionSource, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v44, resolved type: androidx.compose.material3.CheckDrawingCache} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.compose.material3.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: androidx.compose.material3.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: androidx.compose.material3.CheckDrawingCache} */
    /* JADX WARNING: type inference failed for: r6v23 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ad, code lost:
        if (r1 == r7.a()) goto L_0x02af;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(boolean r35, androidx.compose.ui.state.ToggleableState r36, androidx.compose.ui.Modifier r37, androidx.compose.material3.CheckboxColors r38, androidx.compose.ui.graphics.drawscope.Stroke r39, androidx.compose.ui.graphics.drawscope.Stroke r40, androidx.compose.runtime.Composer r41, int r42) {
        /*
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r14 = r39
            r15 = r40
            r0 = r42
            r5 = -891330208(0xffffffffcadf6160, float:-7319728.0)
            r6 = r41
            androidx.compose.runtime.Composer r13 = r6.q(r5)
            r6 = r0 & 6
            r12 = 2
            if (r6 != 0) goto L_0x0027
            boolean r6 = r13.d(r1)
            if (r6 == 0) goto L_0x0024
            r6 = 4
            goto L_0x0025
        L_0x0024:
            r6 = r12
        L_0x0025:
            r6 = r6 | r0
            goto L_0x0028
        L_0x0027:
            r6 = r0
        L_0x0028:
            r7 = r0 & 48
            if (r7 != 0) goto L_0x003c
            int r7 = r36.ordinal()
            boolean r7 = r13.i(r7)
            if (r7 == 0) goto L_0x0039
            r7 = 32
            goto L_0x003b
        L_0x0039:
            r7 = 16
        L_0x003b:
            r6 = r6 | r7
        L_0x003c:
            r7 = r0 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            boolean r7 = r13.W(r3)
            if (r7 == 0) goto L_0x0049
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x004b
        L_0x0049:
            r7 = 128(0x80, float:1.794E-43)
        L_0x004b:
            r6 = r6 | r7
        L_0x004c:
            r7 = r0 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x005c
            boolean r7 = r13.W(r4)
            if (r7 == 0) goto L_0x0059
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x005b
        L_0x0059:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x005b:
            r6 = r6 | r7
        L_0x005c:
            r7 = r0 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x006c
            boolean r7 = r13.l(r14)
            if (r7 == 0) goto L_0x0069
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006b
        L_0x0069:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x006b:
            r6 = r6 | r7
        L_0x006c:
            r7 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 & r0
            if (r7 != 0) goto L_0x007d
            boolean r7 = r13.l(r15)
            if (r7 == 0) goto L_0x007a
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007c
        L_0x007a:
            r7 = 65536(0x10000, float:9.18355E-41)
        L_0x007c:
            r6 = r6 | r7
        L_0x007d:
            r11 = r6
            r6 = 74899(0x12493, float:1.04956E-40)
            r6 = r6 & r11
            r7 = 74898(0x12492, float:1.04954E-40)
            r10 = 0
            if (r6 == r7) goto L_0x008a
            r6 = 1
            goto L_0x008b
        L_0x008a:
            r6 = r10
        L_0x008b:
            r7 = r11 & 1
            boolean r6 = r13.E(r6, r7)
            if (r6 == 0) goto L_0x02cd
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            r8 = -1
            if (r6 == 0) goto L_0x009f
            java.lang.String r6 = "androidx.compose.material3.CheckboxImpl (Checkbox.kt:401)"
            androidx.compose.runtime.ComposerKt.Y(r5, r11, r8, r6)
        L_0x009f:
            int r5 = r11 >> 3
            r7 = r5 & 14
            r6 = 0
            androidx.compose.animation.core.Transition r16 = androidx.compose.animation.core.TransitionKt.j(r2, r6, r13, r7, r12)
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r6 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultSpatial
            r12 = 6
            androidx.compose.animation.core.FiniteAnimationSpec r12 = androidx.compose.material3.MotionSchemeKt.b(r6, r13, r12)
            androidx.compose.material3.CheckboxKt$CheckboxImpl$checkDrawFraction$1 r6 = new androidx.compose.material3.CheckboxKt$CheckboxImpl$checkDrawFraction$1
            r6.<init>(r12)
            kotlin.jvm.internal.FloatCompanionObject r18 = kotlin.jvm.internal.FloatCompanionObject.f40896a
            androidx.compose.animation.core.TwoWayConverter r19 = androidx.compose.animation.core.VectorConvertersKt.i(r18)
            java.lang.Object r20 = r16.i()
            androidx.compose.ui.state.ToggleableState r20 = (androidx.compose.ui.state.ToggleableState) r20
            r9 = -768316570(0xffffffffd2346b66, float:-1.9372399E11)
            r13.X(r9)
            boolean r21 = androidx.compose.runtime.ComposerKt.P()
            java.lang.String r0 = "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:415)"
            if (r21 == 0) goto L_0x00d1
            androidx.compose.runtime.ComposerKt.Y(r9, r10, r8, r0)
        L_0x00d1:
            int[] r21 = androidx.compose.material3.CheckboxKt.WhenMappings.f9391a
            int r20 = r20.ordinal()
            r8 = r21[r20]
            r10 = 3
            r23 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r9 = 1
            if (r8 == r9) goto L_0x00e6
            r9 = 2
            if (r8 == r9) goto L_0x00ef
            if (r8 != r10) goto L_0x00e9
        L_0x00e6:
            r8 = r24
            goto L_0x00f1
        L_0x00e9:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00ef:
            r8 = r23
        L_0x00f1:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x00fa
            androidx.compose.runtime.ComposerKt.X()
        L_0x00fa:
            r13.M()
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.Object r9 = r16.q()
            androidx.compose.ui.state.ToggleableState r9 = (androidx.compose.ui.state.ToggleableState) r9
            r10 = -768316570(0xffffffffd2346b66, float:-1.9372399E11)
            r13.X(r10)
            boolean r25 = androidx.compose.runtime.ComposerKt.P()
            if (r25 == 0) goto L_0x011d
            r25 = r7
            r22 = r11
            r7 = 0
            r11 = -1
            androidx.compose.runtime.ComposerKt.Y(r10, r7, r11, r0)
            goto L_0x0122
        L_0x011d:
            r25 = r7
            r22 = r11
            r11 = -1
        L_0x0122:
            int r0 = r9.ordinal()
            r0 = r21[r0]
            r9 = 1
            if (r0 == r9) goto L_0x013e
            r10 = 2
            if (r0 == r10) goto L_0x013a
            r7 = 3
            if (r0 != r7) goto L_0x0134
        L_0x0131:
            r0 = r24
            goto L_0x0141
        L_0x0134:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x013a:
            r7 = 3
            r0 = r23
            goto L_0x0141
        L_0x013e:
            r7 = 3
            r10 = 2
            goto L_0x0131
        L_0x0141:
            boolean r17 = androidx.compose.runtime.ComposerKt.P()
            if (r17 == 0) goto L_0x014a
            androidx.compose.runtime.ComposerKt.X()
        L_0x014a:
            r13.M()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.animation.core.Transition$Segment r7 = r16.o()
            r17 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r17)
            java.lang.Object r6 = r6.d(r7, r13, r9)
            r9 = r6
            androidx.compose.animation.core.FiniteAnimationSpec r9 = (androidx.compose.animation.core.FiniteAnimationSpec) r9
            java.lang.String r20 = "FloatAnimation"
            r27 = 0
            r7 = 0
            r6 = r16
            r14 = r7
            r26 = 3
            r7 = r8
            r8 = r0
            r0 = 1
            r14 = r17
            r17 = r10
            r10 = r19
            r0 = r11
            r19 = r22
            r11 = r20
            r0 = r12
            r12 = r13
            r14 = r13
            r13 = r27
            androidx.compose.runtime.State r13 = androidx.compose.animation.core.TransitionKt.f(r6, r7, r8, r9, r10, r11, r12, r13)
            androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 r6 = new androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1
            r6.<init>(r0)
            androidx.compose.animation.core.TwoWayConverter r10 = androidx.compose.animation.core.VectorConvertersKt.i(r18)
            java.lang.Object r0 = r16.i()
            androidx.compose.ui.state.ToggleableState r0 = (androidx.compose.ui.state.ToggleableState) r0
            r7 = 1840054703(0x6dad01af, float:6.692868E27)
            r14.X(r7)
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            java.lang.String r9 = "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:433)"
            if (r8 == 0) goto L_0x01a5
            r8 = 0
            r11 = -1
            androidx.compose.runtime.ComposerKt.Y(r7, r8, r11, r9)
        L_0x01a5:
            int r0 = r0.ordinal()
            r0 = r21[r0]
            r8 = 1
            if (r0 == r8) goto L_0x01c1
            r12 = 2
            if (r0 == r12) goto L_0x01bd
            r8 = 3
            if (r0 != r8) goto L_0x01b7
            r0 = r24
            goto L_0x01c4
        L_0x01b7:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01bd:
            r8 = 3
        L_0x01be:
            r0 = r23
            goto L_0x01c4
        L_0x01c1:
            r8 = 3
            r12 = 2
            goto L_0x01be
        L_0x01c4:
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x01cd
            androidx.compose.runtime.ComposerKt.X()
        L_0x01cd:
            r14.M()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r11 = r16.q()
            androidx.compose.ui.state.ToggleableState r11 = (androidx.compose.ui.state.ToggleableState) r11
            r14.X(r7)
            boolean r17 = androidx.compose.runtime.ComposerKt.P()
            if (r17 == 0) goto L_0x01e8
            r8 = 0
            r12 = -1
            androidx.compose.runtime.ComposerKt.Y(r7, r8, r12, r9)
        L_0x01e8:
            int r7 = r11.ordinal()
            r7 = r21[r7]
            r8 = 1
            if (r7 == r8) goto L_0x0200
            r12 = 2
            if (r7 == r12) goto L_0x0201
            r8 = 3
            if (r7 != r8) goto L_0x01fa
            r23 = r24
            goto L_0x0201
        L_0x01fa:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0200:
            r12 = 2
        L_0x0201:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x020a
            androidx.compose.runtime.ComposerKt.X()
        L_0x020a:
            r14.M()
            java.lang.Float r8 = java.lang.Float.valueOf(r23)
            androidx.compose.animation.core.Transition$Segment r7 = r16.o()
            r9 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            java.lang.Object r6 = r6.d(r7, r14, r11)
            r9 = r6
            androidx.compose.animation.core.FiniteAnimationSpec r9 = (androidx.compose.animation.core.FiniteAnimationSpec) r9
            java.lang.String r11 = "FloatAnimation"
            r6 = r16
            r7 = r0
            r0 = r12
            r12 = r14
            r28 = r13
            r13 = r27
            androidx.compose.runtime.State r11 = androidx.compose.animation.core.TransitionKt.f(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r6 = r14.g()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r7.a()
            if (r6 != r8) goto L_0x0250
            androidx.compose.material3.CheckDrawingCache r6 = new androidx.compose.material3.CheckDrawingCache
            r33 = 7
            r34 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r29 = r6
            r29.<init>(r30, r31, r32, r33, r34)
            r14.N(r6)
        L_0x0250:
            r13 = r6
            androidx.compose.material3.CheckDrawingCache r13 = (androidx.compose.material3.CheckDrawingCache) r13
            int r6 = r19 >> 6
            r6 = r6 & 112(0x70, float:1.57E-43)
            r6 = r25 | r6
            androidx.compose.runtime.State r9 = r4.c(r2, r14, r6)
            r6 = r19 & 126(0x7e, float:1.77E-43)
            r5 = r5 & 896(0x380, float:1.256E-42)
            r5 = r5 | r6
            androidx.compose.runtime.State r6 = r4.b(r1, r2, r14, r5)
            androidx.compose.runtime.State r8 = r4.a(r1, r2, r14, r5)
            androidx.compose.ui.Alignment$Companion r5 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r5 = r5.e()
            r10 = 0
            r12 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.E(r3, r5, r10, r0, r12)
            float r5 = f9387b
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.o(r0, r5)
            boolean r5 = r14.W(r6)
            boolean r10 = r14.W(r8)
            r5 = r5 | r10
            boolean r10 = r14.l(r15)
            r5 = r5 | r10
            boolean r10 = r14.W(r9)
            r5 = r5 | r10
            r10 = r28
            boolean r12 = r14.W(r10)
            r5 = r5 | r12
            boolean r12 = r14.W(r11)
            r5 = r5 | r12
            r12 = r39
            boolean r16 = r14.l(r12)
            r5 = r5 | r16
            java.lang.Object r1 = r14.g()
            if (r5 != 0) goto L_0x02af
            java.lang.Object r5 = r7.a()
            if (r1 != r5) goto L_0x02bd
        L_0x02af:
            androidx.compose.material3.i0 r1 = new androidx.compose.material3.i0
            r5 = r1
            r7 = r8
            r8 = r40
            r12 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r14.N(r1)
        L_0x02bd:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r5 = 0
            androidx.compose.foundation.CanvasKt.b(r0, r1, r14, r5)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02d1
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x02d1
        L_0x02cd:
            r14 = r13
            r14.B()
        L_0x02d1:
            androidx.compose.runtime.ScopeUpdateScope r8 = r14.x()
            if (r8 == 0) goto L_0x02ee
            androidx.compose.material3.j0 r9 = new androidx.compose.material3.j0
            r0 = r9
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r40
            r7 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x02ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.i(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.Modifier, androidx.compose.material3.CheckboxColors, androidx.compose.ui.graphics.drawscope.Stroke, androidx.compose.ui.graphics.drawscope.Stroke, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit j(State state, State state2, Stroke stroke, State state3, State state4, State state5, Stroke stroke2, CheckDrawingCache checkDrawingCache, DrawScope drawScope) {
        DrawScope drawScope2 = drawScope;
        n(drawScope2, ((Color) state.getValue()).v(), ((Color) state2.getValue()).v(), drawScope.B1(f9388c), stroke);
        o(drawScope2, ((Color) state3.getValue()).v(), ((Number) state4.getValue()).floatValue(), ((Number) state5.getValue()).floatValue(), stroke2, checkDrawingCache);
        return Unit.f40552a;
    }

    public static final Unit k(boolean z2, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, Stroke stroke, Stroke stroke2, int i2, Composer composer, int i3) {
        i(z2, toggleableState, modifier, checkboxColors, stroke, stroke2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(androidx.compose.ui.state.ToggleableState r28, kotlin.jvm.functions.Function0 r29, androidx.compose.ui.graphics.drawscope.Stroke r30, androidx.compose.ui.graphics.drawscope.Stroke r31, androidx.compose.ui.Modifier r32, boolean r33, androidx.compose.material3.CheckboxColors r34, androidx.compose.foundation.interaction.MutableInteractionSource r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            r7 = r29
            r9 = r37
            r10 = r38
            r0 = -406243761(0xffffffffe7c9364f, float:-1.900395E24)
            r1 = r36
            androidx.compose.runtime.Composer r8 = r1.q(r0)
            r1 = r10 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r9 | 6
            goto L_0x002a
        L_0x0016:
            r1 = r9 & 6
            if (r1 != 0) goto L_0x0029
            int r1 = r28.ordinal()
            boolean r1 = r8.i(r1)
            if (r1 == 0) goto L_0x0026
            r1 = 4
            goto L_0x0027
        L_0x0026:
            r1 = 2
        L_0x0027:
            r1 = r1 | r9
            goto L_0x002a
        L_0x0029:
            r1 = r9
        L_0x002a:
            r3 = r10 & 2
            if (r3 == 0) goto L_0x0031
            r1 = r1 | 48
            goto L_0x0041
        L_0x0031:
            r3 = r9 & 48
            if (r3 != 0) goto L_0x0041
            boolean r3 = r8.l(r7)
            if (r3 == 0) goto L_0x003e
            r3 = 32
            goto L_0x0040
        L_0x003e:
            r3 = 16
        L_0x0040:
            r1 = r1 | r3
        L_0x0041:
            r3 = r10 & 4
            if (r3 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
            r15 = r30
            goto L_0x005c
        L_0x004a:
            r3 = r9 & 384(0x180, float:5.38E-43)
            r15 = r30
            if (r3 != 0) goto L_0x005c
            boolean r3 = r8.l(r15)
            if (r3 == 0) goto L_0x0059
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r3 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r1 = r1 | r3
        L_0x005c:
            r3 = r10 & 8
            if (r3 == 0) goto L_0x0065
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r14 = r31
            goto L_0x0077
        L_0x0065:
            r3 = r9 & 3072(0xc00, float:4.305E-42)
            r14 = r31
            if (r3 != 0) goto L_0x0077
            boolean r3 = r8.l(r14)
            if (r3 == 0) goto L_0x0074
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r1 = r1 | r3
        L_0x0077:
            r3 = r10 & 16
            if (r3 == 0) goto L_0x0080
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r4 = r32
            goto L_0x0092
        L_0x0080:
            r4 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x007d
            r4 = r32
            boolean r5 = r8.W(r4)
            if (r5 == 0) goto L_0x008f
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r1 = r1 | r5
        L_0x0092:
            r5 = r10 & 32
            r6 = 196608(0x30000, float:2.75506E-40)
            if (r5 == 0) goto L_0x009c
            r1 = r1 | r6
        L_0x0099:
            r6 = r33
            goto L_0x00ad
        L_0x009c:
            r6 = r6 & r9
            if (r6 != 0) goto L_0x0099
            r6 = r33
            boolean r11 = r8.d(r6)
            if (r11 == 0) goto L_0x00aa
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00aa:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r1 = r1 | r11
        L_0x00ad:
            r11 = 1572864(0x180000, float:2.204052E-39)
            r11 = r11 & r9
            if (r11 != 0) goto L_0x00c7
            r11 = r10 & 64
            if (r11 != 0) goto L_0x00c1
            r11 = r34
            boolean r12 = r8.W(r11)
            if (r12 == 0) goto L_0x00c3
            r12 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c5
        L_0x00c1:
            r11 = r34
        L_0x00c3:
            r12 = 524288(0x80000, float:7.34684E-40)
        L_0x00c5:
            r1 = r1 | r12
            goto L_0x00c9
        L_0x00c7:
            r11 = r34
        L_0x00c9:
            r12 = r10 & 128(0x80, float:1.794E-43)
            r13 = 12582912(0xc00000, float:1.7632415E-38)
            if (r12 == 0) goto L_0x00d3
            r1 = r1 | r13
        L_0x00d0:
            r13 = r35
            goto L_0x00e5
        L_0x00d3:
            r13 = r13 & r9
            if (r13 != 0) goto L_0x00d0
            r13 = r35
            boolean r16 = r8.W(r13)
            if (r16 == 0) goto L_0x00e1
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e3
        L_0x00e1:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e3:
            r1 = r1 | r16
        L_0x00e5:
            r16 = 4793491(0x492493, float:6.717112E-39)
            r2 = r1 & r16
            r0 = 4793490(0x492492, float:6.71711E-39)
            r17 = 1
            if (r2 == r0) goto L_0x00f4
            r0 = r17
            goto L_0x00f5
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            r2 = r1 & 1
            boolean r0 = r8.E(r0, r2)
            if (r0 == 0) goto L_0x01ea
            r8.p()
            r0 = r9 & 1
            r2 = 6
            if (r0 == 0) goto L_0x0120
            boolean r0 = r8.J()
            if (r0 == 0) goto L_0x010c
            goto L_0x0120
        L_0x010c:
            r8.B()
            r0 = r10 & 64
            if (r0 == 0) goto L_0x0117
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r0
        L_0x0117:
            r19 = r6
            r20 = r11
            r21 = r13
            r11 = r1
            r13 = r4
            goto L_0x014d
        L_0x0120:
            if (r3 == 0) goto L_0x0125
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0126
        L_0x0125:
            r0 = r4
        L_0x0126:
            if (r5 == 0) goto L_0x012a
            r6 = r17
        L_0x012a:
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0139
            androidx.compose.material3.CheckboxDefaults r3 = androidx.compose.material3.CheckboxDefaults.f9383a
            androidx.compose.material3.CheckboxColors r3 = r3.a(r8, r2)
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r4
            r11 = r3
        L_0x0139:
            if (r12 == 0) goto L_0x0145
            r3 = 0
            r13 = r0
            r21 = r3
            r19 = r6
            r20 = r11
        L_0x0143:
            r11 = r1
            goto L_0x014d
        L_0x0145:
            r19 = r6
            r20 = r11
            r21 = r13
            r13 = r0
            goto L_0x0143
        L_0x014d:
            r8.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x015f
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)"
            r3 = -406243761(0xffffffffe7c9364f, float:-1.900395E24)
            androidx.compose.runtime.ComposerKt.Y(r3, r11, r0, r1)
        L_0x015f:
            if (r7 == 0) goto L_0x0194
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.semantics.Role$Companion r1 = androidx.compose.ui.semantics.Role.f18040b
            int r1 = r1.c()
            androidx.compose.material3.tokens.CheckboxTokens r3 = androidx.compose.material3.tokens.CheckboxTokens.f12895a
            float r3 = r3.d()
            r4 = 2
            float r4 = (float) r4
            float r3 = r3 / r4
            float r23 = androidx.compose.ui.unit.Dp.m(r3)
            r26 = 4
            r27 = 0
            r22 = 0
            r24 = 0
            androidx.compose.foundation.IndicationNodeFactory r3 = androidx.compose.material3.RippleKt.e(r22, r23, r24, r26, r27)
            androidx.compose.ui.semantics.Role r5 = androidx.compose.ui.semantics.Role.j(r1)
            r1 = r28
            r12 = r2
            r2 = r21
            r4 = r19
            r6 = r29
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.ToggleableKt.e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0197
        L_0x0194:
            r12 = r2
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
        L_0x0197:
            if (r7 == 0) goto L_0x01a0
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r1 = androidx.compose.material3.InteractiveComponentSizeKt.h(r1)
            goto L_0x01a2
        L_0x01a0:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
        L_0x01a2:
            androidx.compose.ui.Modifier r1 = r13.o0(r1)
            androidx.compose.ui.Modifier r0 = r1.o0(r0)
            float r1 = f9386a
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.i(r0, r1)
            int r1 = r11 >> 15
            r1 = r1 & 14
            int r2 = r11 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r11 >> 9
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            int r2 = r11 << 6
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r2
            r1 = r1 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r3
            r18 = r1 | r2
            r11 = r19
            r12 = r28
            r4 = r13
            r13 = r0
            r14 = r20
            r15 = r30
            r16 = r31
            r17 = r8
            i(r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01e4
            androidx.compose.runtime.ComposerKt.X()
        L_0x01e4:
            r5 = r4
            r6 = r19
            r11 = r20
            goto L_0x01f0
        L_0x01ea:
            r8.B()
            r5 = r4
            r21 = r13
        L_0x01f0:
            androidx.compose.runtime.ScopeUpdateScope r12 = r8.x()
            if (r12 == 0) goto L_0x020e
            androidx.compose.material3.h0 r13 = new androidx.compose.material3.h0
            r0 = r13
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r7 = r11
            r8 = r21
            r9 = r37
            r10 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.a(r13)
        L_0x020e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.l(androidx.compose.ui.state.ToggleableState, kotlin.jvm.functions.Function0, androidx.compose.ui.graphics.drawscope.Stroke, androidx.compose.ui.graphics.drawscope.Stroke, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.CheckboxColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit m(ToggleableState toggleableState, Function0 function0, Stroke stroke, Stroke stroke2, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        l(toggleableState, function0, stroke, stroke2, modifier, z2, checkboxColors, mutableInteractionSource, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void n(DrawScope drawScope, long j2, long j3, float f2, Stroke stroke) {
        float f3 = stroke.f() / 2.0f;
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.c() >> 32));
        if (Color.n(j2, j3)) {
            long floatToRawIntBits = (long) Float.floatToRawIntBits(intBitsToFloat);
            DrawScope drawScope2 = drawScope;
            long j4 = j2;
            DrawScope.m2(drawScope2, j4, 0, Size.d((((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L) | (floatToRawIntBits << 32)), CornerRadius.b((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L)), Fill.f16295a, 0.0f, (ColorFilter) null, 0, 226, (Object) null);
            return;
        }
        float f4 = stroke.f();
        float f5 = stroke.f();
        long e2 = Offset.e((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
        float f6 = (float) 2;
        float f7 = intBitsToFloat - (stroke.f() * f6);
        long d2 = Size.d((((long) Float.floatToRawIntBits(intBitsToFloat - (stroke.f() * f6))) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L));
        float max = Math.max(0.0f, f2 - stroke.f());
        DrawScope.m2(drawScope, j2, e2, d2, CornerRadius.b((((long) Float.floatToRawIntBits(max)) << 32) | (((long) Float.floatToRawIntBits(max)) & 4294967295L)), Fill.f16295a, 0.0f, (ColorFilter) null, 0, 224, (Object) null);
        long e3 = Offset.e((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        float f8 = intBitsToFloat - stroke.f();
        float f9 = f2 - f3;
        DrawScope drawScope3 = drawScope;
        long j5 = j3;
        DrawScope.m2(drawScope3, j5, e3, Size.d((((long) Float.floatToRawIntBits(intBitsToFloat - stroke.f())) & 4294967295L) | (((long) Float.floatToRawIntBits(f8)) << 32)), CornerRadius.b((((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L)), stroke, 0.0f, (ColorFilter) null, 0, 224, (Object) null);
    }

    public static final void o(DrawScope drawScope, long j2, float f2, float f3, Stroke stroke, CheckDrawingCache checkDrawingCache) {
        float f4 = f3;
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.c() >> 32));
        float b2 = MathHelpersKt.b(0.4f, 0.5f, f4);
        float b3 = MathHelpersKt.b(0.7f, 0.5f, f4);
        float b4 = MathHelpersKt.b(0.5f, 0.5f, f4);
        float b5 = MathHelpersKt.b(0.3f, 0.5f, f4);
        checkDrawingCache.a().t();
        checkDrawingCache.a().q(0.2f * intBitsToFloat, b4 * intBitsToFloat);
        checkDrawingCache.a().z(b2 * intBitsToFloat, b3 * intBitsToFloat);
        checkDrawingCache.a().z(0.8f * intBitsToFloat, intBitsToFloat * b5);
        checkDrawingCache.b().a(checkDrawingCache.a(), false);
        checkDrawingCache.c().t();
        checkDrawingCache.b().c(0.0f, checkDrawingCache.b().b() * f2, checkDrawingCache.c(), true);
        DrawScope.E1(drawScope, checkDrawingCache.c(), j2, 0.0f, stroke, (ColorFilter) null, 0, 52, (Object) null);
    }
}
