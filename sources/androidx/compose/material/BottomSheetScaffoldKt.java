package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BottomSheetScaffoldKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f7358a = Dp.m((float) 16);

    /* renamed from: b  reason: collision with root package name */
    public static final float f7359b = Dp.m((float) 56);

    /* renamed from: c  reason: collision with root package name */
    public static final float f7360c = Dp.m((float) 125);

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.material.BottomSheetState r26, boolean r27, androidx.compose.ui.graphics.Shape r28, float r29, long r30, long r32, float r34, androidx.compose.ui.Modifier r35, kotlin.jvm.functions.Function3 r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            r1 = r26
            r9 = r34
            r11 = r36
            r12 = r38
            r13 = r39
            r0 = -412323066(0xffffffffe76c7306, float:-1.1166003E24)
            r2 = r37
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x001a
            r3 = r12 | 6
            goto L_0x002a
        L_0x001a:
            r3 = r12 & 6
            if (r3 != 0) goto L_0x0029
            boolean r3 = r2.W(r1)
            if (r3 == 0) goto L_0x0026
            r3 = 4
            goto L_0x0027
        L_0x0026:
            r3 = 2
        L_0x0027:
            r3 = r3 | r12
            goto L_0x002a
        L_0x0029:
            r3 = r12
        L_0x002a:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0033
            r3 = r3 | 48
        L_0x0030:
            r5 = r27
            goto L_0x0045
        L_0x0033:
            r5 = r12 & 48
            if (r5 != 0) goto L_0x0030
            r5 = r27
            boolean r6 = r2.d(r5)
            if (r6 == 0) goto L_0x0042
            r6 = 32
            goto L_0x0044
        L_0x0042:
            r6 = 16
        L_0x0044:
            r3 = r3 | r6
        L_0x0045:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r6 = r28
            goto L_0x0060
        L_0x004e:
            r6 = r12 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004b
            r6 = r28
            boolean r7 = r2.W(r6)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r7
        L_0x0060:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x0069
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0066:
            r7 = r29
            goto L_0x007b
        L_0x0069:
            r7 = r12 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0066
            r7 = r29
            boolean r8 = r2.h(r7)
            if (r8 == 0) goto L_0x0078
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r3 = r3 | r8
        L_0x007b:
            r8 = r13 & 16
            if (r8 == 0) goto L_0x0084
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r14 = r30
            goto L_0x0096
        L_0x0084:
            r8 = r12 & 24576(0x6000, float:3.4438E-41)
            r14 = r30
            if (r8 != 0) goto L_0x0096
            boolean r8 = r2.j(r14)
            if (r8 == 0) goto L_0x0093
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r3 = r3 | r8
        L_0x0096:
            r8 = r13 & 32
            r10 = 196608(0x30000, float:2.75506E-40)
            if (r8 == 0) goto L_0x00a0
            r3 = r3 | r10
            r4 = r32
            goto L_0x00b2
        L_0x00a0:
            r8 = r12 & r10
            r4 = r32
            if (r8 != 0) goto L_0x00b2
            boolean r8 = r2.j(r4)
            if (r8 == 0) goto L_0x00af
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r8 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r8
        L_0x00b2:
            r8 = r13 & 64
            r10 = 1572864(0x180000, float:2.204052E-39)
            if (r8 == 0) goto L_0x00ba
            r3 = r3 | r10
            goto L_0x00ca
        L_0x00ba:
            r8 = r12 & r10
            if (r8 != 0) goto L_0x00ca
            boolean r8 = r2.h(r9)
            if (r8 == 0) goto L_0x00c7
            r8 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c9
        L_0x00c7:
            r8 = 524288(0x80000, float:7.34684E-40)
        L_0x00c9:
            r3 = r3 | r8
        L_0x00ca:
            r8 = r13 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r8 == 0) goto L_0x00d5
            r3 = r3 | r16
            r10 = r35
            goto L_0x00e8
        L_0x00d5:
            r16 = r12 & r16
            r10 = r35
            if (r16 != 0) goto L_0x00e8
            boolean r16 = r2.W(r10)
            if (r16 == 0) goto L_0x00e4
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e6
        L_0x00e4:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e6:
            r3 = r3 | r16
        L_0x00e8:
            r0 = r13 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f1
            r3 = r3 | r17
            goto L_0x0101
        L_0x00f1:
            r0 = r12 & r17
            if (r0 != 0) goto L_0x0101
            boolean r0 = r2.l(r11)
            if (r0 == 0) goto L_0x00fe
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0100
        L_0x00fe:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0100:
            r3 = r3 | r0
        L_0x0101:
            r0 = 38347923(0x2492493, float:1.4777644E-37)
            r0 = r0 & r3
            r4 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 == r4) goto L_0x010c
            r0 = 1
            goto L_0x010d
        L_0x010c:
            r0 = 0
        L_0x010d:
            r4 = r3 & 1
            boolean r0 = r2.E(r0, r4)
            if (r0 == 0) goto L_0x01fb
            if (r8 == 0) goto L_0x011a
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r10 = r0
        L_0x011a:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0129
            r0 = -1
            java.lang.String r4 = "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:387)"
            r8 = -412323066(0xffffffffe76c7306, float:-1.1166003E24)
            androidx.compose.runtime.ComposerKt.Y(r8, r3, r0, r4)
        L_0x0129:
            java.lang.Object r0 = r2.g()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r4.a()
            if (r0 != r8) goto L_0x013e
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r0 = androidx.compose.runtime.EffectsKt.j(r0, r2)
            r2.N(r0)
        L_0x013e:
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r8 = r2.C(r8)
            androidx.compose.ui.unit.Density r8 = (androidx.compose.ui.unit.Density) r8
            float r8 = r8.B1(r9)
            androidx.compose.material.AnchoredDraggableState r5 = r26.c()
            androidx.compose.foundation.gestures.Orientation r6 = androidx.compose.foundation.gestures.Orientation.Vertical
            boolean r16 = r2.h(r8)
            r7 = r3 & 14
            r9 = 4
            if (r7 != r9) goto L_0x015f
            r9 = 1
            goto L_0x0160
        L_0x015f:
            r9 = 0
        L_0x0160:
            r9 = r16 | r9
            java.lang.Object r12 = r2.g()
            if (r9 != 0) goto L_0x016e
            java.lang.Object r9 = r4.a()
            if (r12 != r9) goto L_0x0176
        L_0x016e:
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$1$1 r12 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$1$1
            r12.<init>(r1, r8)
            r2.N(r12)
        L_0x0176:
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            androidx.compose.ui.Modifier r5 = androidx.compose.material.AnchoredDraggableKt.h(r10, r5, r6, r12)
            androidx.compose.material.AnchoredDraggableState r8 = r26.c()
            r21 = 56
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r14 = r5
            r15 = r8
            r16 = r6
            r17 = r27
            androidx.compose.ui.Modifier r5 = androidx.compose.material.AnchoredDraggableKt.e(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r6 = 4
            if (r7 != r6) goto L_0x0199
            r6 = 1
            goto L_0x019a
        L_0x0199:
            r6 = 0
        L_0x019a:
            boolean r7 = r2.l(r0)
            r6 = r6 | r7
            java.lang.Object r7 = r2.g()
            if (r6 != 0) goto L_0x01ab
            java.lang.Object r4 = r4.a()
            if (r7 != r4) goto L_0x01b3
        L_0x01ab:
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1 r7 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1
            r7.<init>(r1, r0)
            r2.N(r7)
        L_0x01b3:
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r0 = 0
            r4 = 0
            r6 = 1
            androidx.compose.ui.Modifier r14 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r5, r4, r7, r6, r0)
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$3 r0 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$3
            r0.<init>(r11)
            r4 = 54
            r5 = 2055704138(0x7a878e4a, float:3.5192302E35)
            androidx.compose.runtime.internal.ComposableLambda r22 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r6, r0, r2, r4)
            int r0 = r3 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r4 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r4
            int r4 = r3 >> 6
            r5 = r4 & 896(0x380, float:1.256E-42)
            r0 = r0 | r5
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            int r3 = r3 << 6
            r3 = r3 & r4
            r24 = r0 | r3
            r25 = 16
            r20 = 0
            r15 = r28
            r16 = r30
            r18 = r32
            r21 = r29
            r23 = r2
            androidx.compose.material.SurfaceKt.a(r14, r15, r16, r18, r20, r21, r22, r23, r24, r25)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01fe
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x01fe
        L_0x01fb:
            r2.B()
        L_0x01fe:
            androidx.compose.runtime.ScopeUpdateScope r14 = r2.x()
            if (r14 == 0) goto L_0x0221
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$4 r15 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$4
            r0 = r15
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r7 = r32
            r9 = r34
            r11 = r36
            r12 = r38
            r13 = r39
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13)
            r14.a(r15)
        L_0x0221:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.a(androidx.compose.material.BottomSheetState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, float, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(kotlin.jvm.functions.Function3 r34, androidx.compose.ui.Modifier r35, androidx.compose.material.BottomSheetScaffoldState r36, kotlin.jvm.functions.Function2 r37, kotlin.jvm.functions.Function3 r38, kotlin.jvm.functions.Function2 r39, int r40, boolean r41, androidx.compose.ui.graphics.Shape r42, float r43, long r44, long r46, float r48, long r49, long r51, kotlin.jvm.functions.Function3 r53, androidx.compose.runtime.Composer r54, int r55, int r56, int r57) {
        /*
            r15 = r55
            r13 = r56
            r14 = r57
            r0 = -423121424(0xffffffffe6c7adf0, float:-4.7147976E23)
            r1 = r54
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r15 | 6
            r5 = r2
            r2 = r34
            goto L_0x002d
        L_0x0019:
            r2 = r15 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r34
            boolean r5 = r1.l(r2)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r15
            goto L_0x002d
        L_0x002a:
            r2 = r34
            r5 = r15
        L_0x002d:
            r6 = r14 & 2
            if (r6 == 0) goto L_0x0036
            r5 = r5 | 48
        L_0x0033:
            r9 = r35
            goto L_0x0048
        L_0x0036:
            r9 = r15 & 48
            if (r9 != 0) goto L_0x0033
            r9 = r35
            boolean r10 = r1.W(r9)
            if (r10 == 0) goto L_0x0045
            r10 = 32
            goto L_0x0047
        L_0x0045:
            r10 = 16
        L_0x0047:
            r5 = r5 | r10
        L_0x0048:
            r10 = r15 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0062
            r10 = r14 & 4
            if (r10 != 0) goto L_0x005b
            r10 = r36
            boolean r16 = r1.W(r10)
            if (r16 == 0) goto L_0x005d
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005b:
            r10 = r36
        L_0x005d:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r5 = r5 | r16
            goto L_0x0064
        L_0x0062:
            r10 = r36
        L_0x0064:
            r16 = r14 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0071
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r3 = r37
            goto L_0x0084
        L_0x0071:
            r3 = r15 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x006e
            r3 = r37
            boolean r19 = r1.l(r3)
            if (r19 == 0) goto L_0x0080
            r19 = r18
            goto L_0x0082
        L_0x0080:
            r19 = r17
        L_0x0082:
            r5 = r5 | r19
        L_0x0084:
            r19 = r14 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x0091
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r4 = r38
            goto L_0x00a4
        L_0x0091:
            r4 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x008e
            r4 = r38
            boolean r23 = r1.l(r4)
            if (r23 == 0) goto L_0x00a0
            r23 = r21
            goto L_0x00a2
        L_0x00a0:
            r23 = r20
        L_0x00a2:
            r5 = r5 | r23
        L_0x00a4:
            r23 = r14 & 32
            r24 = 196608(0x30000, float:2.75506E-40)
            if (r23 == 0) goto L_0x00af
            r5 = r5 | r24
            r7 = r39
            goto L_0x00c2
        L_0x00af:
            r25 = r15 & r24
            r7 = r39
            if (r25 != 0) goto L_0x00c2
            boolean r26 = r1.l(r7)
            if (r26 == 0) goto L_0x00be
            r26 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r26 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r5 = r5 | r26
        L_0x00c2:
            r26 = r14 & 64
            r27 = 1572864(0x180000, float:2.204052E-39)
            if (r26 == 0) goto L_0x00cd
            r5 = r5 | r27
            r8 = r40
            goto L_0x00e0
        L_0x00cd:
            r28 = r15 & r27
            r8 = r40
            if (r28 != 0) goto L_0x00e0
            boolean r29 = r1.i(r8)
            if (r29 == 0) goto L_0x00dc
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r5 = r5 | r29
        L_0x00e0:
            r11 = r14 & 128(0x80, float:1.794E-43)
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            if (r11 == 0) goto L_0x00eb
            r5 = r5 | r30
            r12 = r41
            goto L_0x00fe
        L_0x00eb:
            r30 = r15 & r30
            r12 = r41
            if (r30 != 0) goto L_0x00fe
            boolean r31 = r1.d(r12)
            if (r31 == 0) goto L_0x00fa
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r5 = r5 | r31
        L_0x00fe:
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            r31 = r15 & r31
            if (r31 != 0) goto L_0x011a
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0113
            r0 = r42
            boolean r32 = r1.W(r0)
            if (r32 == 0) goto L_0x0115
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0117
        L_0x0113:
            r0 = r42
        L_0x0115:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0117:
            r5 = r5 | r32
            goto L_0x011c
        L_0x011a:
            r0 = r42
        L_0x011c:
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r32 = r15 & r32
            if (r32 != 0) goto L_0x0138
            r0 = r14 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0131
            r0 = r43
            boolean r32 = r1.h(r0)
            if (r32 == 0) goto L_0x0133
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0135
        L_0x0131:
            r0 = r43
        L_0x0133:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0135:
            r5 = r5 | r32
            goto L_0x013a
        L_0x0138:
            r0 = r43
        L_0x013a:
            r32 = r13 & 6
            if (r32 != 0) goto L_0x0152
            r0 = r14 & 1024(0x400, float:1.435E-42)
            r2 = r44
            if (r0 != 0) goto L_0x014d
            boolean r0 = r1.j(r2)
            if (r0 == 0) goto L_0x014d
            r22 = 4
            goto L_0x014f
        L_0x014d:
            r22 = 2
        L_0x014f:
            r0 = r13 | r22
            goto L_0x0155
        L_0x0152:
            r2 = r44
            r0 = r13
        L_0x0155:
            r22 = r13 & 48
            if (r22 != 0) goto L_0x016f
            r2 = r14 & 2048(0x800, float:2.87E-42)
            if (r2 != 0) goto L_0x0168
            r2 = r46
            boolean r22 = r1.j(r2)
            if (r22 == 0) goto L_0x016a
            r25 = 32
            goto L_0x016c
        L_0x0168:
            r2 = r46
        L_0x016a:
            r25 = 16
        L_0x016c:
            r0 = r0 | r25
            goto L_0x0171
        L_0x016f:
            r2 = r46
        L_0x0171:
            r2 = r13 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x018b
            r2 = r14 & 4096(0x1000, float:5.74E-42)
            if (r2 != 0) goto L_0x0184
            r2 = r48
            boolean r3 = r1.h(r2)
            if (r3 == 0) goto L_0x0186
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x0188
        L_0x0184:
            r2 = r48
        L_0x0186:
            r29 = 128(0x80, float:1.794E-43)
        L_0x0188:
            r0 = r0 | r29
            goto L_0x018d
        L_0x018b:
            r2 = r48
        L_0x018d:
            r3 = r13 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x01a5
            r3 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r3 != 0) goto L_0x01a0
            r2 = r49
            boolean r22 = r1.j(r2)
            if (r22 == 0) goto L_0x01a2
            r17 = r18
            goto L_0x01a2
        L_0x01a0:
            r2 = r49
        L_0x01a2:
            r0 = r0 | r17
            goto L_0x01a7
        L_0x01a5:
            r2 = r49
        L_0x01a7:
            r2 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x01bf
            r2 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r2 != 0) goto L_0x01ba
            r2 = r51
            boolean r17 = r1.j(r2)
            if (r17 == 0) goto L_0x01bc
            r20 = r21
            goto L_0x01bc
        L_0x01ba:
            r2 = r51
        L_0x01bc:
            r0 = r0 | r20
            goto L_0x01c1
        L_0x01bf:
            r2 = r51
        L_0x01c1:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r14 & r17
            if (r17 == 0) goto L_0x01cd
            r0 = r0 | r24
            r13 = r53
            goto L_0x01e0
        L_0x01cd:
            r17 = r13 & r24
            r13 = r53
            if (r17 != 0) goto L_0x01e0
            boolean r17 = r1.l(r13)
            if (r17 == 0) goto L_0x01dc
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01de
        L_0x01dc:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x01de:
            r0 = r0 | r17
        L_0x01e0:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r5 & r17
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x01f6
            r2 = 74899(0x12493, float:1.04956E-40)
            r2 = r2 & r0
            r3 = 74898(0x12492, float:1.04954E-40)
            if (r2 == r3) goto L_0x01f4
            goto L_0x01f6
        L_0x01f4:
            r2 = 0
            goto L_0x01f7
        L_0x01f6:
            r2 = 1
        L_0x01f7:
            r3 = r5 & 1
            boolean r2 = r1.E(r2, r3)
            if (r2 == 0) goto L_0x03b1
            r1.p()
            r2 = r15 & 1
            r3 = 0
            if (r2 == 0) goto L_0x025d
            boolean r2 = r1.J()
            if (r2 == 0) goto L_0x020e
            goto L_0x025d
        L_0x020e:
            r1.B()
            r2 = r14 & 4
            if (r2 == 0) goto L_0x0217
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0217:
            r2 = r14 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x021f
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r5 = r5 & r2
        L_0x021f:
            r2 = r14 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0227
            r2 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r5 = r5 & r2
        L_0x0227:
            r2 = r14 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x022d
            r0 = r0 & -15
        L_0x022d:
            r2 = r14 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0233
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0233:
            r2 = r14 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0239
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0239:
            r2 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x023f
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x023f:
            r2 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0247
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = r0 & r2
        L_0x0247:
            r6 = r38
            r11 = r42
            r2 = r43
            r19 = r44
            r17 = r46
            r3 = r48
            r21 = r51
            r13 = r0
            r14 = r5
            r0 = r37
            r4 = r49
            goto L_0x0324
        L_0x025d:
            if (r6 == 0) goto L_0x0262
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r9 = r2
        L_0x0262:
            r2 = r14 & 4
            if (r2 == 0) goto L_0x026f
            r2 = 0
            r6 = 3
            androidx.compose.material.BottomSheetScaffoldState r2 = k(r3, r3, r1, r2, r6)
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
            r10 = r2
        L_0x026f:
            if (r16 == 0) goto L_0x0273
            r2 = r3
            goto L_0x0275
        L_0x0273:
            r2 = r37
        L_0x0275:
            if (r19 == 0) goto L_0x027e
            androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt r6 = androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.f7529a
            kotlin.jvm.functions.Function3 r6 = r6.a()
            goto L_0x0280
        L_0x027e:
            r6 = r38
        L_0x0280:
            if (r23 == 0) goto L_0x0283
            r7 = r3
        L_0x0283:
            if (r26 == 0) goto L_0x028b
            androidx.compose.material.FabPosition$Companion r8 = androidx.compose.material.FabPosition.f7852b
            int r8 = r8.b()
        L_0x028b:
            if (r11 == 0) goto L_0x028e
            r12 = 1
        L_0x028e:
            r11 = r14 & 256(0x100, float:3.59E-43)
            r3 = 6
            if (r11 == 0) goto L_0x02a3
            androidx.compose.material.MaterialTheme r11 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Shapes r11 = r11.b(r1, r3)
            androidx.compose.foundation.shape.CornerBasedShape r11 = r11.a()
            r16 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r5 = r5 & r16
            goto L_0x02a5
        L_0x02a3:
            r11 = r42
        L_0x02a5:
            r4 = r14 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x02b5
            androidx.compose.material.BottomSheetScaffoldDefaults r4 = androidx.compose.material.BottomSheetScaffoldDefaults.f7353a
            float r4 = r4.b()
            r17 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r5 = r5 & r17
            goto L_0x02b7
        L_0x02b5:
            r4 = r43
        L_0x02b7:
            r3 = r14 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x02cb
            androidx.compose.material.MaterialTheme r3 = androidx.compose.material.MaterialTheme.f7937a
            r36 = r2
            r2 = 6
            androidx.compose.material.Colors r3 = r3.a(r1, r2)
            long r2 = r3.n()
            r0 = r0 & -15
            goto L_0x02cf
        L_0x02cb:
            r36 = r2
            r2 = r44
        L_0x02cf:
            r37 = r4
            r4 = r14 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x02de
            r4 = r0 & 14
            long r17 = androidx.compose.material.ColorsKt.b(r2, r1, r4)
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02e0
        L_0x02de:
            r17 = r46
        L_0x02e0:
            r4 = r14 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x02ed
            androidx.compose.material.BottomSheetScaffoldDefaults r4 = androidx.compose.material.BottomSheetScaffoldDefaults.f7353a
            float r4 = r4.c()
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x02ef
        L_0x02ed:
            r4 = r48
        L_0x02ef:
            r19 = r2
            r2 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0303
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.f7937a
            r3 = 6
            androidx.compose.material.Colors r2 = r2.a(r1, r3)
            long r2 = r2.c()
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0305
        L_0x0303:
            r2 = r49
        L_0x0305:
            r35 = r4
            r4 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0321
            int r4 = r0 >> 9
            r4 = r4 & 14
            long r21 = androidx.compose.material.ColorsKt.b(r2, r1, r4)
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = r0 & r4
        L_0x0317:
            r13 = r0
            r14 = r5
            r0 = r36
            r4 = r2
            r3 = r35
            r2 = r37
            goto L_0x0324
        L_0x0321:
            r21 = r51
            goto L_0x0317
        L_0x0324:
            r1.U()
            boolean r23 = androidx.compose.runtime.ComposerKt.P()
            if (r23 == 0) goto L_0x0338
            java.lang.String r15 = "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)"
            r51 = r4
            r4 = -423121424(0xffffffffe6c7adf0, float:-4.7147976E23)
            androidx.compose.runtime.ComposerKt.Y(r4, r14, r13, r15)
            goto L_0x033a
        L_0x0338:
            r51 = r4
        L_0x033a:
            r4 = 0
            r5 = 1
            r14 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.f(r9, r4, r5, r14)
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1 r5 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
            r35 = r5
            r36 = r10
            r37 = r0
            r38 = r7
            r39 = r3
            r40 = r8
            r41 = r53
            r42 = r12
            r43 = r11
            r44 = r2
            r45 = r19
            r47 = r17
            r49 = r34
            r50 = r6
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r47, r49, r50)
            r14 = 54
            r15 = -131096268(0xfffffffff82fa134, float:-1.4248774E34)
            r47 = r0
            r0 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r15, r0, r5, r1, r14)
            int r5 = r13 >> 3
            r13 = r5 & 896(0x380, float:1.256E-42)
            r13 = r13 | r27
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r13
            r13 = 50
            r14 = 0
            r15 = 0
            r16 = 0
            r35 = r4
            r36 = r14
            r37 = r51
            r39 = r21
            r41 = r15
            r42 = r16
            r43 = r0
            r44 = r1
            r45 = r5
            r46 = r13
            androidx.compose.material.SurfaceKt.a(r35, r36, r37, r39, r41, r42, r43, r44, r45, r46)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x039d
            androidx.compose.runtime.ComposerKt.X()
        L_0x039d:
            r4 = r47
            r15 = r3
            r5 = r6
            r6 = r7
            r7 = r8
            r3 = r10
            r8 = r12
            r13 = r17
            r16 = r51
            r10 = r2
            r2 = r9
            r9 = r11
            r11 = r19
            r18 = r21
            goto L_0x03cb
        L_0x03b1:
            r1.B()
            r4 = r37
            r5 = r38
            r13 = r46
            r15 = r48
            r16 = r49
            r18 = r51
            r6 = r7
            r7 = r8
            r2 = r9
            r3 = r10
            r8 = r12
            r9 = r42
            r10 = r43
            r11 = r44
        L_0x03cb:
            androidx.compose.runtime.ScopeUpdateScope r1 = r1.x()
            if (r1 == 0) goto L_0x03eb
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2 r0 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2
            r35 = r0
            r33 = r1
            r1 = r34
            r20 = r53
            r21 = r55
            r22 = r56
            r23 = r57
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r16, r18, r20, r21, r22, r23)
            r1 = r35
            r0 = r33
            r0.a(r1)
        L_0x03eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.b(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material.BottomSheetScaffoldState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, int, boolean, androidx.compose.ui.graphics.Shape, float, long, long, float, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void c(Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, float f2, Function0 function0, int i2, BottomSheetState bottomSheetState, Composer composer, int i3) {
        int i4;
        Function2 function26 = function2;
        Function2 function27 = function22;
        Function2 function28 = function23;
        Function2 function29 = function24;
        Function2 function210 = function25;
        float f3 = f2;
        Function0 function02 = function0;
        int i5 = i2;
        BottomSheetState bottomSheetState2 = bottomSheetState;
        int i6 = i3;
        Composer q2 = composer.q(1411837005);
        if ((i6 & 6) == 0) {
            i4 = i6 | (q2.l(function26) ? 4 : 2);
        } else {
            i4 = i6;
        }
        if ((i6 & 48) == 0) {
            i4 |= q2.l(function27) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i4 |= q2.l(function28) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i4 |= q2.l(function29) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i4 |= q2.l(function210) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i4 |= q2.h(f3) ? 131072 : 65536;
        }
        if ((1572864 & i6) == 0) {
            i4 |= q2.l(function02) ? 1048576 : 524288;
        }
        if ((12582912 & i6) == 0) {
            i4 |= q2.i(i5) ? 8388608 : 4194304;
        }
        if ((100663296 & i6) == 0) {
            i4 |= q2.W(bottomSheetState2) ? 67108864 : 33554432;
        }
        int i7 = i4;
        if (q2.E((i7 & 38347923) != 38347922, i7 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1411837005, i7, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:469)");
            }
            List p2 = CollectionsKt.p(function26 == null ? ComposableSingletons$BottomSheetScaffoldKt.f7529a.b() : function26, function27, function28, function29 == null ? ComposableSingletons$BottomSheetScaffoldKt.f7529a.c() : function29, function210);
            boolean z2 = ((3670016 & i7) == 1048576) | ((29360128 & i7) == 8388608) | ((458752 & i7) == 131072) | ((i7 & 234881024) == 67108864);
            Object g2 = q2.g();
            if (z2 || g2 == Composer.f14567a.a()) {
                g2 = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(function02, i5, f3, bottomSheetState2);
                q2.N(g2);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) g2;
            Modifier.Companion companion = Modifier.f15489d;
            Function2 b2 = LayoutKt.b(p2);
            boolean W = q2.W(multiContentMeasurePolicy);
            Object g3 = q2.g();
            if (W || g3 == Composer.f14567a.a()) {
                g3 = MultiContentMeasurePolicyKt.a(multiContentMeasurePolicy);
                q2.N(g3);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) g3;
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b3 = Updater.b(q2);
            Updater.g(b3, measurePolicy, companion2.c());
            Updater.g(b3, I, companion2.e());
            Function2 b4 = companion2.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion2.d());
            b2.m(q2, 0);
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(function2, function22, function23, function24, function25, f2, function0, i2, bottomSheetState, i3));
        }
    }

    public static final NestedScrollConnection d(AnchoredDraggableState anchoredDraggableState, Orientation orientation) {
        return new BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    public static final BottomSheetScaffoldState k(BottomSheetState bottomSheetState, SnackbarHostState snackbarHostState, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            bottomSheetState = l(BottomSheetValue.Collapsed, (AnimationSpec) null, (Function1) null, composer, 6, 6);
        }
        if ((i3 & 2) != 0) {
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new SnackbarHostState();
                composer.N(g2);
            }
            snackbarHostState = (SnackbarHostState) g2;
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(-1022285988, i2, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:266)");
        }
        boolean z2 = false;
        boolean z3 = (((i2 & 14) ^ 6) > 4 && composer.W(bottomSheetState)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) > 32 && composer.W(snackbarHostState)) || (i2 & 48) == 32) {
            z2 = true;
        }
        boolean z4 = z3 | z2;
        Object g3 = composer.g();
        if (z4 || g3 == Composer.f14567a.a()) {
            g3 = new BottomSheetScaffoldState(bottomSheetState, snackbarHostState);
            composer.N(g3);
        }
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) g3;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return bottomSheetScaffoldState;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material.BottomSheetState l(androidx.compose.material.BottomSheetValue r8, androidx.compose.animation.core.AnimationSpec r9, kotlin.jvm.functions.Function1 r10, androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            r0 = r13 & 2
            if (r0 == 0) goto L_0x000a
            androidx.compose.material.BottomSheetScaffoldDefaults r9 = androidx.compose.material.BottomSheetScaffoldDefaults.f7353a
            androidx.compose.animation.core.AnimationSpec r9 = r9.a()
        L_0x000a:
            r0 = 4
            r13 = r13 & r0
            if (r13 == 0) goto L_0x0010
            androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$1 r10 = androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$1.f7404z
        L_0x0010:
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x001f
            r13 = -1
            java.lang.String r1 = "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:224)"
            r2 = 1808153344(0x6bc63b00, float:4.7929186E26)
            androidx.compose.runtime.ComposerKt.Y(r2, r12, r13, r1)
        L_0x001f:
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r13 = r11.C(r13)
            androidx.compose.ui.unit.Density r13 = (androidx.compose.ui.unit.Density) r13
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            androidx.compose.material.BottomSheetState$Companion r2 = androidx.compose.material.BottomSheetState.f7410b
            androidx.compose.runtime.saveable.Saver r2 = r2.a(r9, r10, r13)
            r3 = r12 & 14
            r3 = r3 ^ 6
            r4 = 0
            r5 = 1
            if (r3 <= r0) goto L_0x0041
            boolean r3 = r11.W(r8)
            if (r3 != 0) goto L_0x0045
        L_0x0041:
            r3 = r12 & 6
            if (r3 != r0) goto L_0x0047
        L_0x0045:
            r0 = r5
            goto L_0x0048
        L_0x0047:
            r0 = r4
        L_0x0048:
            boolean r3 = r11.W(r13)
            r0 = r0 | r3
            boolean r3 = r11.l(r9)
            r0 = r0 | r3
            r3 = r12 & 896(0x380, float:1.256E-42)
            r3 = r3 ^ 384(0x180, float:5.38E-43)
            r6 = 256(0x100, float:3.59E-43)
            if (r3 <= r6) goto L_0x0060
            boolean r3 = r11.W(r10)
            if (r3 != 0) goto L_0x0064
        L_0x0060:
            r12 = r12 & 384(0x180, float:5.38E-43)
            if (r12 != r6) goto L_0x0065
        L_0x0064:
            r4 = r5
        L_0x0065:
            r12 = r0 | r4
            java.lang.Object r0 = r11.g()
            if (r12 != 0) goto L_0x0075
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r0 != r12) goto L_0x007d
        L_0x0075:
            androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$2$1 r0 = new androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$2$1
            r0.<init>(r8, r13, r9, r10)
            r11.N(r0)
        L_0x007d:
            r4 = r0
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r6 = 0
            r7 = 4
            r3 = 0
            r5 = r11
            java.lang.Object r8 = androidx.compose.runtime.saveable.RememberSaveableKt.h(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.material.BottomSheetState r8 = (androidx.compose.material.BottomSheetState) r8
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0093
            androidx.compose.runtime.ComposerKt.X()
        L_0x0093:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.l(androidx.compose.material.BottomSheetValue, androidx.compose.animation.core.AnimationSpec, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):androidx.compose.material.BottomSheetState");
    }
}
