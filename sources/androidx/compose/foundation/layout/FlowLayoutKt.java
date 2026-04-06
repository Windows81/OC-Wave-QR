package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
public final class FlowLayoutKt {

    /* renamed from: a  reason: collision with root package name */
    public static final CrossAxisAlignment f3937a;

    /* renamed from: b  reason: collision with root package name */
    public static final CrossAxisAlignment f3938b;

    static {
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.f3867a;
        Alignment.Companion companion2 = Alignment.f15444a;
        f3937a = companion.c(companion2.l());
        f3938b = companion.b(companion2.k());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: androidx.compose.foundation.layout.FlowLayoutOverflowState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01ba, code lost:
        if (r6 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x01bc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.Modifier r22, androidx.compose.foundation.layout.Arrangement.Vertical r23, androidx.compose.foundation.layout.Arrangement.Horizontal r24, androidx.compose.ui.Alignment.Horizontal r25, int r26, int r27, androidx.compose.foundation.layout.FlowColumnOverflow r28, kotlin.jvm.functions.Function3 r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r8 = r29
            r9 = r31
            r10 = r32
            r0 = -1385862766(0xffffffffad656992, float:-1.3040584E-11)
            r1 = r30
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r10 & 1
            if (r2 == 0) goto L_0x0019
            r3 = r9 | 6
            r4 = r3
            r3 = r22
            goto L_0x002d
        L_0x0019:
            r3 = r9 & 6
            if (r3 != 0) goto L_0x002a
            r3 = r22
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r9
            goto L_0x002d
        L_0x002a:
            r3 = r22
            r4 = r9
        L_0x002d:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r6 = r23
            goto L_0x0048
        L_0x0036:
            r6 = r9 & 48
            if (r6 != 0) goto L_0x0033
            r6 = r23
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0045:
            r7 = 16
        L_0x0047:
            r4 = r4 | r7
        L_0x0048:
            r7 = r10 & 4
            if (r7 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r11 = r24
            goto L_0x0063
        L_0x0051:
            r11 = r9 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x004e
            r11 = r24
            boolean r12 = r1.W(r11)
            if (r12 == 0) goto L_0x0060
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r12
        L_0x0063:
            r12 = r10 & 8
            if (r12 == 0) goto L_0x006c
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r13 = r25
            goto L_0x007e
        L_0x006c:
            r13 = r9 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0069
            r13 = r25
            boolean r14 = r1.W(r13)
            if (r14 == 0) goto L_0x007b
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r4 = r4 | r14
        L_0x007e:
            r14 = r10 & 16
            if (r14 == 0) goto L_0x0087
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r15 = r26
            goto L_0x009a
        L_0x0087:
            r15 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L_0x0084
            r15 = r26
            boolean r16 = r1.i(r15)
            if (r16 == 0) goto L_0x0096
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r4 = r4 | r16
        L_0x009a:
            r16 = r10 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00a5
            r4 = r4 | r18
            r0 = r27
            goto L_0x00b8
        L_0x00a5:
            r18 = r9 & r18
            r0 = r27
            if (r18 != 0) goto L_0x00b8
            boolean r18 = r1.i(r0)
            if (r18 == 0) goto L_0x00b4
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r4 = r4 | r18
        L_0x00b8:
            r18 = r10 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r18 == 0) goto L_0x00c3
            r4 = r4 | r19
            r0 = r28
            goto L_0x00d6
        L_0x00c3:
            r19 = r9 & r19
            r0 = r28
            if (r19 != 0) goto L_0x00d6
            boolean r20 = r1.W(r0)
            if (r20 == 0) goto L_0x00d2
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d2:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r4 = r4 | r20
        L_0x00d6:
            r0 = r10 & 128(0x80, float:1.794E-43)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00df
            r4 = r4 | r20
            goto L_0x00ef
        L_0x00df:
            r0 = r9 & r20
            if (r0 != 0) goto L_0x00ef
            boolean r0 = r1.l(r8)
            if (r0 == 0) goto L_0x00ec
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ee
        L_0x00ec:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ee:
            r4 = r4 | r0
        L_0x00ef:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r0 = r0 & r4
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 == r3) goto L_0x00fa
            r0 = 1
            goto L_0x00fb
        L_0x00fa:
            r0 = 0
        L_0x00fb:
            r3 = r4 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x0283
            if (r2 == 0) goto L_0x0108
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x010a
        L_0x0108:
            r0 = r22
        L_0x010a:
            if (r5 == 0) goto L_0x0113
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            goto L_0x0115
        L_0x0113:
            r2 = r23
        L_0x0115:
            if (r7 == 0) goto L_0x011e
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Horizontal r3 = r3.f()
            goto L_0x011f
        L_0x011e:
            r3 = r11
        L_0x011f:
            if (r12 == 0) goto L_0x0128
            androidx.compose.ui.Alignment$Companion r5 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r5 = r5.k()
            goto L_0x0129
        L_0x0128:
            r5 = r13
        L_0x0129:
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == 0) goto L_0x0131
            r21 = r7
            goto L_0x0133
        L_0x0131:
            r21 = r15
        L_0x0133:
            if (r16 == 0) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            r7 = r27
        L_0x0138:
            if (r18 == 0) goto L_0x0142
            androidx.compose.foundation.layout.FlowColumnOverflow$Companion r11 = androidx.compose.foundation.layout.FlowColumnOverflow.f3904f
            androidx.compose.foundation.layout.FlowColumnOverflow r11 = r11.a()
            r15 = r11
            goto L_0x0144
        L_0x0142:
            r15 = r28
        L_0x0144:
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x0153
            r11 = -1
            java.lang.String r12 = "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:212)"
            r13 = -1385862766(0xffffffffad656992, float:-1.3040584E-11)
            androidx.compose.runtime.ComposerKt.Y(r13, r4, r11, r12)
        L_0x0153:
            r11 = 3670016(0x380000, float:5.142788E-39)
            r14 = r4 & r11
            r11 = 1048576(0x100000, float:1.469368E-39)
            if (r14 != r11) goto L_0x015d
            r11 = 1
            goto L_0x015e
        L_0x015d:
            r11 = 0
        L_0x015e:
            java.lang.Object r12 = r1.g()
            if (r11 != 0) goto L_0x016c
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r12 != r11) goto L_0x0173
        L_0x016c:
            androidx.compose.foundation.layout.FlowLayoutOverflowState r12 = r15.b()
            r1.N(r12)
        L_0x0173:
            r13 = r12
            androidx.compose.foundation.layout.FlowLayoutOverflowState r13 = (androidx.compose.foundation.layout.FlowLayoutOverflowState) r13
            int r11 = r4 >> 3
            r12 = 65534(0xfffe, float:9.1833E-41)
            r18 = r11 & r12
            r11 = r2
            r12 = r3
            r22 = r13
            r13 = r5
            r6 = r14
            r14 = r21
            r23 = r2
            r2 = r15
            r15 = r7
            r16 = r22
            r17 = r1
            androidx.compose.ui.layout.MultiContentMeasurePolicy r11 = g(r11, r12, r13, r14, r15, r16, r17, r18)
            r12 = 1048576(0x100000, float:1.469368E-39)
            if (r6 != r12) goto L_0x0197
            r6 = 1
            goto L_0x0198
        L_0x0197:
            r6 = 0
        L_0x0198:
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            r12 = r12 & r4
            r13 = 8388608(0x800000, float:1.17549435E-38)
            if (r12 != r13) goto L_0x01a1
            r12 = 1
            goto L_0x01a2
        L_0x01a1:
            r12 = 0
        L_0x01a2:
            r6 = r6 | r12
            r12 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r12
            r12 = 131072(0x20000, float:1.83671E-40)
            if (r4 != r12) goto L_0x01ac
            r4 = 1
            goto L_0x01ad
        L_0x01ac:
            r4 = 0
        L_0x01ad:
            r4 = r4 | r6
            java.lang.Object r6 = r1.g()
            if (r4 != 0) goto L_0x01bc
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x01d9
        L_0x01bc:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$list$1$1 r4 = new androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$list$1$1
            r4.<init>(r8)
            r12 = -763839774(0xffffffffd278bae2, float:-2.67071816E11)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r12, r13, r4)
            r6.add(r4)
            r12 = r22
            r2.a(r12, r6)
            r1.N(r6)
        L_0x01d9:
            java.util.List r6 = (java.util.List) r6
            kotlin.jvm.functions.Function2 r4 = androidx.compose.ui.layout.LayoutKt.b(r6)
            boolean r6 = r1.W(r11)
            java.lang.Object r12 = r1.g()
            if (r6 != 0) goto L_0x01f1
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r12 != r6) goto L_0x01f8
        L_0x01f1:
            androidx.compose.ui.layout.MeasurePolicy r12 = androidx.compose.ui.layout.MultiContentMeasurePolicyKt.a(r11)
            r1.N(r12)
        L_0x01f8:
            androidx.compose.ui.layout.MeasurePolicy r12 = (androidx.compose.ui.layout.MeasurePolicy) r12
            r6 = 0
            int r11 = androidx.compose.runtime.ComposablesKt.a(r1, r6)
            androidx.compose.runtime.CompositionLocalMap r6 = r1.I()
            androidx.compose.ui.Modifier r13 = androidx.compose.ui.ComposedModifierKt.e(r1, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r15 = r14.a()
            androidx.compose.runtime.Applier r16 = r1.v()
            if (r16 != 0) goto L_0x0216
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0216:
            r1.s()
            boolean r16 = r1.n()
            if (r16 == 0) goto L_0x0223
            r1.y(r15)
            goto L_0x0226
        L_0x0223:
            r1.K()
        L_0x0226:
            androidx.compose.runtime.Composer r15 = androidx.compose.runtime.Updater.b(r1)
            r16 = r0
            kotlin.jvm.functions.Function2 r0 = r14.c()
            androidx.compose.runtime.Updater.g(r15, r12, r0)
            kotlin.jvm.functions.Function2 r0 = r14.e()
            androidx.compose.runtime.Updater.g(r15, r6, r0)
            kotlin.jvm.functions.Function2 r0 = r14.b()
            boolean r6 = r15.n()
            if (r6 != 0) goto L_0x0252
            java.lang.Object r6 = r15.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r12)
            if (r6 != 0) goto L_0x0260
        L_0x0252:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r15.N(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r15.A(r6, r0)
        L_0x0260:
            kotlin.jvm.functions.Function2 r0 = r14.d()
            androidx.compose.runtime.Updater.g(r15, r13, r0)
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.m(r1, r0)
            r1.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x027b
            androidx.compose.runtime.ComposerKt.X()
        L_0x027b:
            r4 = r5
            r6 = r7
            r5 = r21
            r7 = r2
            r2 = r23
            goto L_0x0291
        L_0x0283:
            r1.B()
            r16 = r22
            r2 = r23
            r6 = r27
            r7 = r28
            r3 = r11
            r4 = r13
            r5 = r15
        L_0x0291:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x02a8
            androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$1 r12 = new androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$1
            r0 = r12
            r1 = r16
            r8 = r29
            r9 = r31
            r10 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x02a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.a(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, androidx.compose.foundation.layout.FlowColumnOverflow, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.Modifier r20, androidx.compose.foundation.layout.Arrangement.Vertical r21, androidx.compose.foundation.layout.Arrangement.Horizontal r22, androidx.compose.ui.Alignment.Horizontal r23, int r24, int r25, kotlin.jvm.functions.Function3 r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            r8 = r28
            r0 = -208106226(0xfffffffff3988d0e, float:-2.417267E31)
            r1 = r27
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r29 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r8 | 6
            r4 = r3
            r3 = r20
            goto L_0x0029
        L_0x0015:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r20
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r8
            goto L_0x0029
        L_0x0026:
            r3 = r20
            r4 = r8
        L_0x0029:
            r5 = r29 & 2
            if (r5 == 0) goto L_0x0032
            r4 = r4 | 48
        L_0x002f:
            r6 = r21
            goto L_0x0044
        L_0x0032:
            r6 = r8 & 48
            if (r6 != 0) goto L_0x002f
            r6 = r21
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r4 = r4 | r7
        L_0x0044:
            r7 = r29 & 4
            if (r7 == 0) goto L_0x004d
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r9 = r22
            goto L_0x005f
        L_0x004d:
            r9 = r8 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004a
            r9 = r22
            boolean r10 = r1.W(r9)
            if (r10 == 0) goto L_0x005c
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r4 = r4 | r10
        L_0x005f:
            r10 = r29 & 8
            if (r10 == 0) goto L_0x0068
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r11 = r23
            goto L_0x007a
        L_0x0068:
            r11 = r8 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0065
            r11 = r23
            boolean r12 = r1.W(r11)
            if (r12 == 0) goto L_0x0077
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r12
        L_0x007a:
            r12 = r29 & 16
            if (r12 == 0) goto L_0x0083
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r13 = r24
            goto L_0x0095
        L_0x0083:
            r13 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0080
            r13 = r24
            boolean r14 = r1.i(r13)
            if (r14 == 0) goto L_0x0092
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r4 = r4 | r14
        L_0x0095:
            r14 = r29 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x009f
            r4 = r4 | r15
        L_0x009c:
            r15 = r25
            goto L_0x00b1
        L_0x009f:
            r15 = r15 & r8
            if (r15 != 0) goto L_0x009c
            r15 = r25
            boolean r16 = r1.i(r15)
            if (r16 == 0) goto L_0x00ad
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r4 = r4 | r16
        L_0x00b1:
            r16 = r29 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00bc
            r4 = r4 | r17
            r0 = r26
            goto L_0x00cf
        L_0x00bc:
            r16 = r8 & r17
            r0 = r26
            if (r16 != 0) goto L_0x00cf
            boolean r18 = r1.l(r0)
            if (r18 == 0) goto L_0x00cb
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cd
        L_0x00cb:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00cd:
            r4 = r4 | r18
        L_0x00cf:
            r18 = 599187(0x92493, float:8.3964E-40)
            r0 = r4 & r18
            r3 = 599186(0x92492, float:8.39638E-40)
            if (r0 == r3) goto L_0x00db
            r0 = 1
            goto L_0x00dc
        L_0x00db:
            r0 = 0
        L_0x00dc:
            r3 = r4 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x0164
            if (r2 == 0) goto L_0x00e9
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00eb
        L_0x00e9:
            r0 = r20
        L_0x00eb:
            if (r5 == 0) goto L_0x00f4
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            r6 = r2
        L_0x00f4:
            if (r7 == 0) goto L_0x00fd
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Horizontal r2 = r2.f()
            goto L_0x00fe
        L_0x00fd:
            r2 = r9
        L_0x00fe:
            if (r10 == 0) goto L_0x0107
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r3.k()
            goto L_0x0108
        L_0x0107:
            r3 = r11
        L_0x0108:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r12 == 0) goto L_0x010f
            r7 = r5
            goto L_0x0110
        L_0x010f:
            r7 = r13
        L_0x0110:
            if (r14 == 0) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            r5 = r15
        L_0x0114:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0123
            r9 = -1
            java.lang.String r10 = "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:270)"
            r11 = -208106226(0xfffffffff3988d0e, float:-2.417267E31)
            androidx.compose.runtime.ComposerKt.Y(r11, r4, r9, r10)
        L_0x0123:
            androidx.compose.foundation.layout.FlowColumnOverflow$Companion r9 = androidx.compose.foundation.layout.FlowColumnOverflow.f3904f
            androidx.compose.foundation.layout.FlowColumnOverflow r15 = r9.a()
            r9 = r4 & 14
            r9 = r9 | r17
            r10 = r4 & 112(0x70, float:1.57E-43)
            r9 = r9 | r10
            r10 = r4 & 896(0x380, float:1.256E-42)
            r9 = r9 | r10
            r10 = r4 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r10
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r4
            r9 = r9 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r4
            r9 = r9 | r10
            int r4 = r4 << 3
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r10
            r18 = r9 | r4
            r19 = 0
            r9 = r0
            r10 = r6
            r11 = r2
            r12 = r3
            r13 = r7
            r14 = r5
            r16 = r26
            r17 = r1
            a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x015e
            androidx.compose.runtime.ComposerKt.X()
        L_0x015e:
            r4 = r3
            r15 = r5
            r5 = r7
            r3 = r2
            r2 = r0
            goto L_0x016c
        L_0x0164:
            r1.B()
            r2 = r20
            r3 = r9
            r4 = r11
            r5 = r13
        L_0x016c:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x0184
            androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$2 r11 = new androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$2
            r0 = r11
            r1 = r2
            r2 = r6
            r6 = r15
            r7 = r26
            r8 = r28
            r9 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.b(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: androidx.compose.foundation.layout.FlowLayoutOverflowState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01ba, code lost:
        if (r6 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x01bc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.ui.Modifier r22, androidx.compose.foundation.layout.Arrangement.Horizontal r23, androidx.compose.foundation.layout.Arrangement.Vertical r24, androidx.compose.ui.Alignment.Vertical r25, int r26, int r27, androidx.compose.foundation.layout.FlowRowOverflow r28, kotlin.jvm.functions.Function3 r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r8 = r29
            r9 = r31
            r10 = r32
            r0 = -218661582(0xfffffffff2f77d32, float:-9.804051E30)
            r1 = r30
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r10 & 1
            if (r2 == 0) goto L_0x0019
            r3 = r9 | 6
            r4 = r3
            r3 = r22
            goto L_0x002d
        L_0x0019:
            r3 = r9 & 6
            if (r3 != 0) goto L_0x002a
            r3 = r22
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r9
            goto L_0x002d
        L_0x002a:
            r3 = r22
            r4 = r9
        L_0x002d:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r6 = r23
            goto L_0x0048
        L_0x0036:
            r6 = r9 & 48
            if (r6 != 0) goto L_0x0033
            r6 = r23
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0045:
            r7 = 16
        L_0x0047:
            r4 = r4 | r7
        L_0x0048:
            r7 = r10 & 4
            if (r7 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r11 = r24
            goto L_0x0063
        L_0x0051:
            r11 = r9 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x004e
            r11 = r24
            boolean r12 = r1.W(r11)
            if (r12 == 0) goto L_0x0060
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r12
        L_0x0063:
            r12 = r10 & 8
            if (r12 == 0) goto L_0x006c
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r13 = r25
            goto L_0x007e
        L_0x006c:
            r13 = r9 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0069
            r13 = r25
            boolean r14 = r1.W(r13)
            if (r14 == 0) goto L_0x007b
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r4 = r4 | r14
        L_0x007e:
            r14 = r10 & 16
            if (r14 == 0) goto L_0x0087
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r15 = r26
            goto L_0x009a
        L_0x0087:
            r15 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L_0x0084
            r15 = r26
            boolean r16 = r1.i(r15)
            if (r16 == 0) goto L_0x0096
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r4 = r4 | r16
        L_0x009a:
            r16 = r10 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00a5
            r4 = r4 | r18
            r0 = r27
            goto L_0x00b8
        L_0x00a5:
            r18 = r9 & r18
            r0 = r27
            if (r18 != 0) goto L_0x00b8
            boolean r18 = r1.i(r0)
            if (r18 == 0) goto L_0x00b4
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r4 = r4 | r18
        L_0x00b8:
            r18 = r10 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r18 == 0) goto L_0x00c3
            r4 = r4 | r19
            r0 = r28
            goto L_0x00d6
        L_0x00c3:
            r19 = r9 & r19
            r0 = r28
            if (r19 != 0) goto L_0x00d6
            boolean r20 = r1.W(r0)
            if (r20 == 0) goto L_0x00d2
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d2:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r4 = r4 | r20
        L_0x00d6:
            r0 = r10 & 128(0x80, float:1.794E-43)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00df
            r4 = r4 | r20
            goto L_0x00ef
        L_0x00df:
            r0 = r9 & r20
            if (r0 != 0) goto L_0x00ef
            boolean r0 = r1.l(r8)
            if (r0 == 0) goto L_0x00ec
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ee
        L_0x00ec:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ee:
            r4 = r4 | r0
        L_0x00ef:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r0 = r0 & r4
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 == r3) goto L_0x00fa
            r0 = 1
            goto L_0x00fb
        L_0x00fa:
            r0 = 0
        L_0x00fb:
            r3 = r4 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x0283
            if (r2 == 0) goto L_0x0108
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x010a
        L_0x0108:
            r0 = r22
        L_0x010a:
            if (r5 == 0) goto L_0x0113
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Horizontal r2 = r2.f()
            goto L_0x0115
        L_0x0113:
            r2 = r23
        L_0x0115:
            if (r7 == 0) goto L_0x011e
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r3 = r3.g()
            goto L_0x011f
        L_0x011e:
            r3 = r11
        L_0x011f:
            if (r12 == 0) goto L_0x0128
            androidx.compose.ui.Alignment$Companion r5 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r5 = r5.l()
            goto L_0x0129
        L_0x0128:
            r5 = r13
        L_0x0129:
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == 0) goto L_0x0131
            r21 = r7
            goto L_0x0133
        L_0x0131:
            r21 = r15
        L_0x0133:
            if (r16 == 0) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            r7 = r27
        L_0x0138:
            if (r18 == 0) goto L_0x0142
            androidx.compose.foundation.layout.FlowRowOverflow$Companion r11 = androidx.compose.foundation.layout.FlowRowOverflow.f4024f
            androidx.compose.foundation.layout.FlowRowOverflow r11 = r11.a()
            r15 = r11
            goto L_0x0144
        L_0x0142:
            r15 = r28
        L_0x0144:
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x0153
            r11 = -1
            java.lang.String r12 = "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:98)"
            r13 = -218661582(0xfffffffff2f77d32, float:-9.804051E30)
            androidx.compose.runtime.ComposerKt.Y(r13, r4, r11, r12)
        L_0x0153:
            r11 = 3670016(0x380000, float:5.142788E-39)
            r14 = r4 & r11
            r11 = 1048576(0x100000, float:1.469368E-39)
            if (r14 != r11) goto L_0x015d
            r11 = 1
            goto L_0x015e
        L_0x015d:
            r11 = 0
        L_0x015e:
            java.lang.Object r12 = r1.g()
            if (r11 != 0) goto L_0x016c
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r12 != r11) goto L_0x0173
        L_0x016c:
            androidx.compose.foundation.layout.FlowLayoutOverflowState r12 = r15.b()
            r1.N(r12)
        L_0x0173:
            r13 = r12
            androidx.compose.foundation.layout.FlowLayoutOverflowState r13 = (androidx.compose.foundation.layout.FlowLayoutOverflowState) r13
            int r11 = r4 >> 3
            r12 = 65534(0xfffe, float:9.1833E-41)
            r18 = r11 & r12
            r11 = r2
            r12 = r3
            r22 = r13
            r13 = r5
            r6 = r14
            r14 = r21
            r23 = r2
            r2 = r15
            r15 = r7
            r16 = r22
            r17 = r1
            androidx.compose.ui.layout.MultiContentMeasurePolicy r11 = m(r11, r12, r13, r14, r15, r16, r17, r18)
            r12 = 1048576(0x100000, float:1.469368E-39)
            if (r6 != r12) goto L_0x0197
            r6 = 1
            goto L_0x0198
        L_0x0197:
            r6 = 0
        L_0x0198:
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            r12 = r12 & r4
            r13 = 8388608(0x800000, float:1.17549435E-38)
            if (r12 != r13) goto L_0x01a1
            r12 = 1
            goto L_0x01a2
        L_0x01a1:
            r12 = 0
        L_0x01a2:
            r6 = r6 | r12
            r12 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r12
            r12 = 131072(0x20000, float:1.83671E-40)
            if (r4 != r12) goto L_0x01ac
            r4 = 1
            goto L_0x01ad
        L_0x01ac:
            r4 = 0
        L_0x01ad:
            r4 = r4 | r6
            java.lang.Object r6 = r1.g()
            if (r4 != 0) goto L_0x01bc
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x01d9
        L_0x01bc:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1 r4 = new androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
            r4.<init>(r8)
            r12 = 702094978(0x29d91e82, float:9.642028E-14)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r12, r13, r4)
            r6.add(r4)
            r12 = r22
            r2.a(r12, r6)
            r1.N(r6)
        L_0x01d9:
            java.util.List r6 = (java.util.List) r6
            kotlin.jvm.functions.Function2 r4 = androidx.compose.ui.layout.LayoutKt.b(r6)
            boolean r6 = r1.W(r11)
            java.lang.Object r12 = r1.g()
            if (r6 != 0) goto L_0x01f1
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r12 != r6) goto L_0x01f8
        L_0x01f1:
            androidx.compose.ui.layout.MeasurePolicy r12 = androidx.compose.ui.layout.MultiContentMeasurePolicyKt.a(r11)
            r1.N(r12)
        L_0x01f8:
            androidx.compose.ui.layout.MeasurePolicy r12 = (androidx.compose.ui.layout.MeasurePolicy) r12
            r6 = 0
            int r11 = androidx.compose.runtime.ComposablesKt.a(r1, r6)
            androidx.compose.runtime.CompositionLocalMap r6 = r1.I()
            androidx.compose.ui.Modifier r13 = androidx.compose.ui.ComposedModifierKt.e(r1, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r15 = r14.a()
            androidx.compose.runtime.Applier r16 = r1.v()
            if (r16 != 0) goto L_0x0216
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0216:
            r1.s()
            boolean r16 = r1.n()
            if (r16 == 0) goto L_0x0223
            r1.y(r15)
            goto L_0x0226
        L_0x0223:
            r1.K()
        L_0x0226:
            androidx.compose.runtime.Composer r15 = androidx.compose.runtime.Updater.b(r1)
            r16 = r0
            kotlin.jvm.functions.Function2 r0 = r14.c()
            androidx.compose.runtime.Updater.g(r15, r12, r0)
            kotlin.jvm.functions.Function2 r0 = r14.e()
            androidx.compose.runtime.Updater.g(r15, r6, r0)
            kotlin.jvm.functions.Function2 r0 = r14.b()
            boolean r6 = r15.n()
            if (r6 != 0) goto L_0x0252
            java.lang.Object r6 = r15.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r12)
            if (r6 != 0) goto L_0x0260
        L_0x0252:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r15.N(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r15.A(r6, r0)
        L_0x0260:
            kotlin.jvm.functions.Function2 r0 = r14.d()
            androidx.compose.runtime.Updater.g(r15, r13, r0)
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.m(r1, r0)
            r1.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x027b
            androidx.compose.runtime.ComposerKt.X()
        L_0x027b:
            r4 = r5
            r6 = r7
            r5 = r21
            r7 = r2
            r2 = r23
            goto L_0x0291
        L_0x0283:
            r1.B()
            r16 = r22
            r2 = r23
            r6 = r27
            r7 = r28
            r3 = r11
            r4 = r13
            r5 = r15
        L_0x0291:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x02a8
            androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1 r12 = new androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
            r0 = r12
            r1 = r16
            r8 = r29
            r9 = r31
            r10 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x02a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.c(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, androidx.compose.foundation.layout.FlowRowOverflow, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(androidx.compose.ui.Modifier r20, androidx.compose.foundation.layout.Arrangement.Horizontal r21, androidx.compose.foundation.layout.Arrangement.Vertical r22, androidx.compose.ui.Alignment.Vertical r23, int r24, int r25, kotlin.jvm.functions.Function3 r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            r8 = r28
            r0 = -2070229740(0xffffffff849acd14, float:-3.639356E-36)
            r1 = r27
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r29 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r8 | 6
            r4 = r3
            r3 = r20
            goto L_0x0029
        L_0x0015:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r20
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r8
            goto L_0x0029
        L_0x0026:
            r3 = r20
            r4 = r8
        L_0x0029:
            r5 = r29 & 2
            if (r5 == 0) goto L_0x0032
            r4 = r4 | 48
        L_0x002f:
            r6 = r21
            goto L_0x0044
        L_0x0032:
            r6 = r8 & 48
            if (r6 != 0) goto L_0x002f
            r6 = r21
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r4 = r4 | r7
        L_0x0044:
            r7 = r29 & 4
            if (r7 == 0) goto L_0x004d
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r9 = r22
            goto L_0x005f
        L_0x004d:
            r9 = r8 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004a
            r9 = r22
            boolean r10 = r1.W(r9)
            if (r10 == 0) goto L_0x005c
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r4 = r4 | r10
        L_0x005f:
            r10 = r29 & 8
            if (r10 == 0) goto L_0x0068
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r11 = r23
            goto L_0x007a
        L_0x0068:
            r11 = r8 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0065
            r11 = r23
            boolean r12 = r1.W(r11)
            if (r12 == 0) goto L_0x0077
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r12
        L_0x007a:
            r12 = r29 & 16
            if (r12 == 0) goto L_0x0083
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r13 = r24
            goto L_0x0095
        L_0x0083:
            r13 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0080
            r13 = r24
            boolean r14 = r1.i(r13)
            if (r14 == 0) goto L_0x0092
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r4 = r4 | r14
        L_0x0095:
            r14 = r29 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x009f
            r4 = r4 | r15
        L_0x009c:
            r15 = r25
            goto L_0x00b1
        L_0x009f:
            r15 = r15 & r8
            if (r15 != 0) goto L_0x009c
            r15 = r25
            boolean r16 = r1.i(r15)
            if (r16 == 0) goto L_0x00ad
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r4 = r4 | r16
        L_0x00b1:
            r16 = r29 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00bc
            r4 = r4 | r17
            r0 = r26
            goto L_0x00cf
        L_0x00bc:
            r16 = r8 & r17
            r0 = r26
            if (r16 != 0) goto L_0x00cf
            boolean r18 = r1.l(r0)
            if (r18 == 0) goto L_0x00cb
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cd
        L_0x00cb:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00cd:
            r4 = r4 | r18
        L_0x00cf:
            r18 = 599187(0x92493, float:8.3964E-40)
            r0 = r4 & r18
            r3 = 599186(0x92492, float:8.39638E-40)
            if (r0 == r3) goto L_0x00db
            r0 = 1
            goto L_0x00dc
        L_0x00db:
            r0 = 0
        L_0x00dc:
            r3 = r4 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x0164
            if (r2 == 0) goto L_0x00e9
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00eb
        L_0x00e9:
            r0 = r20
        L_0x00eb:
            if (r5 == 0) goto L_0x00f4
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Horizontal r2 = r2.f()
            r6 = r2
        L_0x00f4:
            if (r7 == 0) goto L_0x00fd
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            goto L_0x00fe
        L_0x00fd:
            r2 = r9
        L_0x00fe:
            if (r10 == 0) goto L_0x0107
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r3 = r3.l()
            goto L_0x0108
        L_0x0107:
            r3 = r11
        L_0x0108:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r12 == 0) goto L_0x010f
            r7 = r5
            goto L_0x0110
        L_0x010f:
            r7 = r13
        L_0x0110:
            if (r14 == 0) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            r5 = r15
        L_0x0114:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0123
            r9 = -1
            java.lang.String r10 = "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:161)"
            r11 = -2070229740(0xffffffff849acd14, float:-3.639356E-36)
            androidx.compose.runtime.ComposerKt.Y(r11, r4, r9, r10)
        L_0x0123:
            androidx.compose.foundation.layout.FlowRowOverflow$Companion r9 = androidx.compose.foundation.layout.FlowRowOverflow.f4024f
            androidx.compose.foundation.layout.FlowRowOverflow r15 = r9.a()
            r9 = r4 & 14
            r9 = r9 | r17
            r10 = r4 & 112(0x70, float:1.57E-43)
            r9 = r9 | r10
            r10 = r4 & 896(0x380, float:1.256E-42)
            r9 = r9 | r10
            r10 = r4 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r10
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r4
            r9 = r9 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r4
            r9 = r9 | r10
            int r4 = r4 << 3
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r10
            r18 = r9 | r4
            r19 = 0
            r9 = r0
            r10 = r6
            r11 = r2
            r12 = r3
            r13 = r7
            r14 = r5
            r16 = r26
            r17 = r1
            c(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x015e
            androidx.compose.runtime.ComposerKt.X()
        L_0x015e:
            r4 = r3
            r15 = r5
            r5 = r7
            r3 = r2
            r2 = r0
            goto L_0x016c
        L_0x0164:
            r1.B()
            r2 = r20
            r3 = r9
            r4 = r11
            r5 = r13
        L_0x016c:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x0184
            androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2 r11 = new androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
            r0 = r11
            r1 = r2
            r2 = r6
            r6 = r15
            r7 = r26
            r8 = r28
            r9 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.d(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final MeasureResult f(MeasureScope measureScope, FlowLineMeasurePolicy flowLineMeasurePolicy, Iterator it, float f2, float f3, long j2, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState) {
        Measurable measurable;
        Integer num;
        long j3;
        Ref.ObjectRef objectRef;
        MutableIntList mutableIntList;
        int i4;
        MutableVector mutableVector;
        int i5;
        boolean z2;
        Measurable measurable2;
        MutableIntList mutableIntList2;
        ArrayList arrayList;
        FlowLineInfo flowLineInfo;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo;
        ArrayList arrayList2;
        MutableIntObjectMap mutableIntObjectMap;
        int i6;
        boolean z3;
        int i7;
        int i8;
        ArrayList arrayList3;
        MutableIntObjectMap mutableIntObjectMap2;
        int i9;
        int i10;
        IntIntPair intIntPair;
        long j4;
        Measurable measurable3;
        IntIntPair intIntPair2;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo;
        MutableIntList mutableIntList3;
        int i11;
        MutableIntList mutableIntList4;
        Integer num2;
        boolean z4;
        boolean z5;
        MeasureScope measureScope2 = measureScope;
        FlowLineMeasurePolicy flowLineMeasurePolicy2 = flowLineMeasurePolicy;
        Iterator it2 = it;
        MutableVector mutableVector2 = new MutableVector(new MeasureResult[16], 0);
        int l2 = Constraints.l(j2);
        int n2 = Constraints.n(j2);
        int k2 = Constraints.k(j2);
        MutableIntObjectMap c2 = IntObjectMapKt.c();
        ArrayList arrayList4 = new ArrayList();
        int ceil = (int) ((float) Math.ceil((double) measureScope2.B1(f2)));
        int ceil2 = (int) ((float) Math.ceil((double) measureScope2.B1(f3)));
        long a2 = OrientationIndependentConstraints.a(0, l2, 0, k2);
        long h2 = OrientationIndependentConstraints.h(OrientationIndependentConstraints.e(a2, 0, 0, 0, 0, 14, (Object) null), flowLineMeasurePolicy.o() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        ArrayList arrayList5 = arrayList4;
        FlowLineInfo flowLineInfo2 = it2 instanceof ContextualFlowItemIterator ? new FlowLineInfo(0, 0, measureScope2.D(l2), measureScope2.D(k2), (DefaultConstructorMarker) null) : null;
        Measurable n3 = !it.hasNext() ? null : n(it2, flowLineInfo2);
        IntIntPair a3 = n3 != null ? IntIntPair.a(k(n3, flowLineMeasurePolicy2, h2, new FlowLayoutKt$breakDownItems$nextSize$1$1(objectRef2))) : null;
        Integer valueOf = a3 != null ? Integer.valueOf(IntIntPair.e(a3.i())) : null;
        if (a3 != null) {
            measurable = n3;
            num = Integer.valueOf(IntIntPair.f(a3.i()));
        } else {
            measurable = n3;
            num = null;
        }
        long j5 = h2;
        int i12 = n2;
        MutableIntList mutableIntList5 = new MutableIntList(0, 1, (DefaultConstructorMarker) null);
        MutableIntList mutableIntList6 = new MutableIntList(0, 1, (DefaultConstructorMarker) null);
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i2, flowLayoutOverflowState, j2, i3, ceil, ceil2, (DefaultConstructorMarker) null);
        FlowLayoutBuildingBlocks.WrapInfo b2 = flowLayoutBuildingBlocks.b(it.hasNext(), 0, IntIntPair.b(l2, k2), a3, 0, 0, 0, false, false);
        if (b2.a()) {
            boolean z6 = a3 != null;
            flowLineInfo = flowLineInfo2;
            objectRef = objectRef2;
            z2 = false;
            j3 = j5;
            i5 = ceil2;
            i4 = ceil;
            mutableIntList = mutableIntList5;
            measurable2 = measurable;
            arrayList = arrayList5;
            mutableVector = mutableVector2;
            mutableIntList2 = mutableIntList6;
            wrapEllipsisInfo = flowLayoutBuildingBlocks.a(b2, z6, -1, 0, l2, 0);
        } else {
            measurable2 = measurable;
            flowLineInfo = flowLineInfo2;
            objectRef = objectRef2;
            z2 = false;
            i5 = ceil2;
            arrayList = arrayList5;
            j3 = j5;
            mutableIntList = mutableIntList5;
            i4 = ceil;
            mutableVector = mutableVector2;
            mutableIntList2 = mutableIntList6;
            wrapEllipsisInfo = null;
        }
        int i13 = l2;
        int i14 = k2;
        boolean z7 = z2;
        int i15 = z7;
        int i16 = i15;
        int i17 = i16;
        int i18 = i17;
        int i19 = i12;
        int i20 = 0;
        int i21 = i14;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo2 = b2;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo2 = wrapEllipsisInfo;
        Measurable measurable4 = measurable2;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo3 = wrapInfo2;
        while (!wrapInfo3.a() && measurable4 != null) {
            Intrinsics.f(valueOf);
            int intValue = valueOf.intValue();
            Intrinsics.f(num);
            MutableIntList mutableIntList7 = mutableIntList2;
            z7 = Math.max((int) z7, num.intValue());
            int i22 = i13 - intValue;
            int i23 = l2;
            int i24 = i15 + 1;
            int i25 = i16 + intValue;
            flowLayoutOverflowState.n(i24);
            arrayList.add(measurable4);
            Ref.ObjectRef objectRef3 = objectRef;
            c2.r(i15, objectRef3.f40908z);
            int i26 = i24 - i17;
            boolean z8 = i26 < i2 ? true : z2;
            if (flowLineInfo != null) {
                int i27 = z8 ? i20 : i20 + 1;
                i9 = i17;
                boolean z9 = z8 ? i26 : z2;
                if (z8) {
                    int i28 = i22 - i4;
                    mutableIntObjectMap2 = c2;
                    z4 = i28 < 0 ? z2 : i28;
                } else {
                    mutableIntObjectMap2 = c2;
                    z4 = i23;
                }
                float D = measureScope2.D((int) z4);
                if (z8) {
                    arrayList3 = arrayList;
                    z5 = i14;
                } else {
                    int i29 = (i14 - z7) - i5;
                    arrayList3 = arrayList;
                    z5 = i29 < 0 ? z2 : i29;
                }
                flowLineInfo.e(i27, (int) z9, D, measureScope2.D((int) z5));
            } else {
                i9 = i17;
                mutableIntObjectMap2 = c2;
                arrayList3 = arrayList;
            }
            Measurable n4 = !it.hasNext() ? null : n(it2, flowLineInfo);
            objectRef3.f40908z = null;
            if (n4 != null) {
                i10 = i14;
                j4 = j3;
                intIntPair = IntIntPair.a(k(n4, flowLineMeasurePolicy2, j4, new FlowLayoutKt$breakDownItems$1$1(objectRef3)));
            } else {
                i10 = i14;
                j4 = j3;
                intIntPair = null;
            }
            Integer valueOf2 = intIntPair != null ? Integer.valueOf(IntIntPair.e(intIntPair.i()) + i4) : null;
            Integer valueOf3 = intIntPair != null ? Integer.valueOf(IntIntPair.f(intIntPair.i())) : null;
            boolean hasNext = it.hasNext();
            int i30 = i10;
            long b3 = IntIntPair.b(i22, i30);
            if (intIntPair == null) {
                measurable3 = n4;
                intIntPair2 = null;
            } else {
                Intrinsics.f(valueOf2);
                int intValue2 = valueOf2.intValue();
                Intrinsics.f(valueOf3);
                measurable3 = n4;
                intIntPair2 = IntIntPair.a(IntIntPair.b(intValue2, valueOf3.intValue()));
            }
            FlowLayoutBuildingBlocks.WrapInfo b4 = flowLayoutBuildingBlocks.b(hasNext, i26, b3, intIntPair2, i20, i18, z7, false, false);
            if (b4.b()) {
                int max = Math.max(i19, i25);
                int i31 = i23;
                int min = Math.min(max, i31);
                int i32 = i18 + z7;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo a4 = flowLayoutBuildingBlocks.a(b4, intIntPair != null ? true : z2, i20, i32, i22, i26);
                mutableIntList3 = mutableIntList7;
                mutableIntList3.k(z7);
                int i33 = (i21 - i32) - i5;
                MutableIntList mutableIntList8 = mutableIntList;
                mutableIntList8.k(i24);
                i20++;
                i18 = i32 + i5;
                wrapInfo = b4;
                i9 = i24;
                wrapEllipsisInfo2 = a4;
                i11 = i31;
                mutableIntList4 = mutableIntList8;
                num2 = valueOf2 != null ? Integer.valueOf(valueOf2.intValue() - i4) : null;
                i30 = i33;
                i22 = i11;
                z7 = z2;
                i19 = min;
                i16 = z7;
            } else {
                i16 = i25;
                wrapInfo = b4;
                mutableIntList3 = mutableIntList7;
                i11 = i23;
                mutableIntList4 = mutableIntList;
                num2 = valueOf2;
            }
            wrapInfo3 = wrapInfo;
            mutableIntList = mutableIntList4;
            num = valueOf3;
            it2 = it;
            j3 = j4;
            i14 = i30;
            i17 = i9;
            arrayList = arrayList3;
            i13 = i22;
            mutableIntList2 = mutableIntList3;
            c2 = mutableIntObjectMap2;
            objectRef = objectRef3;
            measurable4 = measurable3;
            int i34 = i11;
            i15 = i24;
            l2 = i34;
        }
        MutableIntObjectMap mutableIntObjectMap3 = c2;
        ArrayList arrayList6 = arrayList;
        MutableIntList mutableIntList9 = mutableIntList2;
        MutableIntList mutableIntList10 = mutableIntList;
        if (wrapEllipsisInfo2 != null) {
            arrayList2 = arrayList6;
            arrayList2.add(wrapEllipsisInfo2.a());
            mutableIntObjectMap = mutableIntObjectMap3;
            mutableIntObjectMap.r(arrayList2.size() - 1, wrapEllipsisInfo2.d());
            int i35 = mutableIntList10.f1784b - 1;
            if (wrapEllipsisInfo2.c()) {
                mutableIntList9.q(i35, Math.max(mutableIntList9.e(i35), IntIntPair.f(wrapEllipsisInfo2.b())));
                mutableIntList10.q(mutableIntList10.f1784b - 1, mutableIntList10.i() + 1);
            } else {
                mutableIntList9.k(IntIntPair.f(wrapEllipsisInfo2.b()));
                mutableIntList10.k(mutableIntList10.i() + 1);
            }
        } else {
            mutableIntObjectMap = mutableIntObjectMap3;
            arrayList2 = arrayList6;
        }
        int size = arrayList2.size();
        Placeable[] placeableArr = new Placeable[size];
        for (int i36 = z2; i36 < size; i36++) {
            placeableArr[i36] = mutableIntObjectMap.b(i36);
        }
        int i37 = mutableIntList10.f1784b;
        int[] iArr = new int[i37];
        int[] iArr2 = new int[i37];
        int[] iArr3 = mutableIntList10.f1783a;
        int i38 = i19;
        int i39 = z2;
        int i40 = i39;
        int i41 = i40;
        while (i39 < i37) {
            int i42 = iArr3[i39];
            int i43 = i38;
            int[] iArr4 = iArr3;
            int[] iArr5 = iArr2;
            int[] iArr6 = iArr;
            int i44 = i37;
            int i45 = i41;
            int i46 = i39;
            MutableIntList mutableIntList11 = mutableIntList9;
            ArrayList arrayList7 = arrayList2;
            MeasureResult a5 = RowColumnMeasurePolicyKt.a(flowLineMeasurePolicy, i38, Constraints.m(a2), Constraints.l(a2), mutableIntList9.e(i39), i4, measureScope, arrayList2, placeableArr, i45, i42, iArr6, i46);
            if (flowLineMeasurePolicy.o()) {
                i8 = a5.b();
                i7 = a5.a();
            } else {
                i8 = a5.a();
                i7 = a5.b();
            }
            iArr5[i46] = i7;
            i40 += i7;
            i38 = Math.max(i43, i8);
            mutableVector.d(a5);
            i39 = i46 + 1;
            MeasureScope measureScope3 = measureScope;
            i41 = i42;
            iArr3 = iArr4;
            iArr2 = iArr5;
            iArr = iArr6;
            i37 = i44;
            mutableIntList9 = mutableIntList11;
            arrayList2 = arrayList7;
        }
        int i47 = i38;
        int[] iArr7 = iArr2;
        int[] iArr8 = iArr;
        MutableVector mutableVector3 = mutableVector;
        if (mutableVector3.p() == 0) {
            z3 = z2;
            i6 = z3;
        } else {
            z3 = i47;
            i6 = i40;
        }
        return l(measureScope, j2, (int) z3, i6, iArr7, mutableVector3, flowLineMeasurePolicy, iArr8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: androidx.compose.foundation.layout.FlowMeasurePolicy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: androidx.compose.foundation.layout.FlowMeasurePolicy} */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a2, code lost:
        if (r5 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r1.W(r18) == false) goto L_0x0029;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.layout.MultiContentMeasurePolicy g(androidx.compose.foundation.layout.Arrangement.Vertical r18, androidx.compose.foundation.layout.Arrangement.Horizontal r19, androidx.compose.ui.Alignment.Horizontal r20, int r21, int r22, androidx.compose.foundation.layout.FlowLayoutOverflowState r23, androidx.compose.runtime.Composer r24, int r25) {
        /*
            r0 = r20
            r1 = r24
            r2 = r25
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0015
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:546)"
            r5 = -308635847(0xffffffffed9a9739, float:-5.9804386E27)
            androidx.compose.runtime.ComposerKt.Y(r5, r2, r3, r4)
        L_0x0015:
            r3 = r2 & 14
            r3 = r3 ^ 6
            r4 = 4
            r5 = 0
            r6 = 1
            if (r3 <= r4) goto L_0x0027
            r3 = r18
            boolean r7 = r1.W(r3)
            if (r7 != 0) goto L_0x002d
            goto L_0x0029
        L_0x0027:
            r3 = r18
        L_0x0029:
            r7 = r2 & 6
            if (r7 != r4) goto L_0x002f
        L_0x002d:
            r4 = r6
            goto L_0x0030
        L_0x002f:
            r4 = r5
        L_0x0030:
            r7 = r2 & 112(0x70, float:1.57E-43)
            r7 = r7 ^ 48
            r8 = 32
            r9 = r19
            if (r7 <= r8) goto L_0x0040
            boolean r7 = r1.W(r9)
            if (r7 != 0) goto L_0x0044
        L_0x0040:
            r7 = r2 & 48
            if (r7 != r8) goto L_0x0046
        L_0x0044:
            r7 = r6
            goto L_0x0047
        L_0x0046:
            r7 = r5
        L_0x0047:
            r4 = r4 | r7
            r7 = r2 & 896(0x380, float:1.256E-42)
            r7 = r7 ^ 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 <= r8) goto L_0x0056
            boolean r7 = r1.W(r0)
            if (r7 != 0) goto L_0x005a
        L_0x0056:
            r7 = r2 & 384(0x180, float:5.38E-43)
            if (r7 != r8) goto L_0x005c
        L_0x005a:
            r7 = r6
            goto L_0x005d
        L_0x005c:
            r7 = r5
        L_0x005d:
            r4 = r4 | r7
            r7 = r2 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 ^ 3072(0xc00, float:4.305E-42)
            r8 = 2048(0x800, float:2.87E-42)
            r14 = r21
            if (r7 <= r8) goto L_0x006e
            boolean r7 = r1.i(r14)
            if (r7 != 0) goto L_0x0072
        L_0x006e:
            r7 = r2 & 3072(0xc00, float:4.305E-42)
            if (r7 != r8) goto L_0x0074
        L_0x0072:
            r7 = r6
            goto L_0x0075
        L_0x0074:
            r7 = r5
        L_0x0075:
            r4 = r4 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r2
            r7 = r7 ^ 24576(0x6000, float:3.4438E-41)
            r8 = 16384(0x4000, float:2.2959E-41)
            r15 = r22
            if (r7 <= r8) goto L_0x0088
            boolean r7 = r1.i(r15)
            if (r7 != 0) goto L_0x008c
        L_0x0088:
            r2 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r2 != r8) goto L_0x008d
        L_0x008c:
            r5 = r6
        L_0x008d:
            r2 = r4 | r5
            r4 = r23
            boolean r5 = r1.W(r4)
            r2 = r2 | r5
            java.lang.Object r5 = r24.g()
            if (r2 != 0) goto L_0x00a4
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x00c8
        L_0x00a4:
            float r11 = r18.a()
            androidx.compose.foundation.layout.CrossAxisAlignment$Companion r2 = androidx.compose.foundation.layout.CrossAxisAlignment.f3867a
            androidx.compose.foundation.layout.CrossAxisAlignment r12 = r2.b(r0)
            float r13 = r19.a()
            androidx.compose.foundation.layout.FlowMeasurePolicy r5 = new androidx.compose.foundation.layout.FlowMeasurePolicy
            r8 = 0
            r17 = 0
            r7 = r5
            r9 = r19
            r10 = r18
            r14 = r21
            r15 = r22
            r16 = r23
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.N(r5)
        L_0x00c8:
            androidx.compose.foundation.layout.FlowMeasurePolicy r5 = (androidx.compose.foundation.layout.FlowMeasurePolicy) r5
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00d3
            androidx.compose.runtime.ComposerKt.X()
        L_0x00d3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.g(androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, androidx.compose.foundation.layout.FlowLayoutOverflowState, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MultiContentMeasurePolicy");
    }

    public static final int h(IntrinsicMeasurable intrinsicMeasurable, boolean z2, int i2) {
        return z2 ? intrinsicMeasurable.q0(i2) : intrinsicMeasurable.Z(i2);
    }

    public static final long i(List list, int[] iArr, int[] iArr2, int i2, int i3, int i4, int i5, int i6, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i7;
        List list2 = list;
        int i8 = i2;
        if (list.isEmpty()) {
            return IntIntPair.b(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i5, flowLayoutOverflowState, OrientationIndependentConstraints.a(0, i8, 0, Integer.MAX_VALUE), i6, i3, i4, (DefaultConstructorMarker) null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.h0(list2, 0);
        int i9 = intrinsicMeasurable != null ? iArr2[0] : 0;
        int i10 = intrinsicMeasurable != null ? iArr[0] : 0;
        boolean z2 = true;
        int i11 = 0;
        int i12 = 0;
        if (flowLayoutBuildingBlocks.b(list.size() > 1, 0, IntIntPair.b(i8, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.a(IntIntPair.b(i10, i9)), 0, 0, 0, false, false).a()) {
            FlowLayoutOverflowState flowLayoutOverflowState2 = flowLayoutOverflowState;
            if (intrinsicMeasurable == null) {
                z2 = false;
            }
            IntIntPair f2 = flowLayoutOverflowState2.f(z2, 0, 0);
            return IntIntPair.b(f2 != null ? IntIntPair.f(f2.i()) : 0, 0);
        }
        int size = list2.size();
        int i13 = i8;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            if (i14 >= size) {
                break;
            }
            int i18 = i13 - i10;
            int i19 = i14 + 1;
            int max = Math.max(i16, i9);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.h0(list2, i19);
            int i20 = intrinsicMeasurable2 != null ? iArr2[i19] : 0;
            int i21 = intrinsicMeasurable2 != null ? iArr[i19] + i3 : 0;
            int i22 = i19 - i17;
            int i23 = i21;
            int i24 = i20;
            int i25 = i19;
            FlowLayoutBuildingBlocks.WrapInfo b2 = flowLayoutBuildingBlocks.b(i14 + 2 < list.size(), i22, IntIntPair.b(i18, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.a(IntIntPair.b(i21, i20)), i11, i12, max, false, false);
            if (b2.b()) {
                i12 += max + i4;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo a2 = flowLayoutBuildingBlocks.a(b2, intrinsicMeasurable2 != null, i11, i12, i18, i22);
                int i26 = i23 - i3;
                i11++;
                if (b2.a()) {
                    if (a2 != null) {
                        long b3 = a2.b();
                        if (!a2.c()) {
                            i12 += IntIntPair.f(b3) + i4;
                        }
                    }
                    i15 = i25;
                } else {
                    i13 = i8;
                    i16 = 0;
                    i7 = i26;
                    i17 = i25;
                }
            } else {
                i16 = max;
                i13 = i18;
                i7 = i23;
            }
            i9 = i24;
            i14 = i25;
            i15 = i14;
        }
        return IntIntPair.b(i12 - i4, i15);
    }

    public static final int j(IntrinsicMeasurable intrinsicMeasurable, boolean z2, int i2) {
        return z2 ? intrinsicMeasurable.Z(i2) : intrinsicMeasurable.q0(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r0 = r0.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long k(androidx.compose.ui.layout.Measurable r2, androidx.compose.foundation.layout.FlowLineMeasurePolicy r3, long r4, kotlin.jvm.functions.Function1 r6) {
        /*
            androidx.compose.foundation.layout.RowColumnParentData r0 = androidx.compose.foundation.layout.RowColumnImplKt.c(r2)
            float r0 = androidx.compose.foundation.layout.RowColumnImplKt.e(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0039
            androidx.compose.foundation.layout.RowColumnParentData r0 = androidx.compose.foundation.layout.RowColumnImplKt.c(r2)
            if (r0 == 0) goto L_0x0022
            androidx.compose.foundation.layout.FlowLayoutData r0 = r0.c()
            if (r0 == 0) goto L_0x0022
            float r0 = r0.a()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r0 != 0) goto L_0x0039
            androidx.compose.ui.layout.Placeable r2 = r2.c0(r4)
            r6.invoke(r2)
            int r4 = r3.g(r2)
            int r2 = r3.j(r2)
            long r2 = androidx.collection.IntIntPair.b(r4, r2)
            goto L_0x0050
        L_0x0039:
            boolean r4 = r3.o()
            r5 = 2147483647(0x7fffffff, float:NaN)
            int r4 = j(r2, r4, r5)
            boolean r3 = r3.o()
            int r2 = h(r2, r3, r4)
            long r2 = androidx.collection.IntIntPair.b(r4, r2)
        L_0x0050:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.k(androidx.compose.ui.layout.Measurable, androidx.compose.foundation.layout.FlowLineMeasurePolicy, long, kotlin.jvm.functions.Function1):long");
    }

    public static final MeasureResult l(MeasureScope measureScope, long j2, int i2, int i3, int[] iArr, MutableVector mutableVector, FlowLineMeasurePolicy flowLineMeasurePolicy, int[] iArr2) {
        int i4;
        MeasureScope measureScope2 = measureScope;
        boolean o2 = flowLineMeasurePolicy.o();
        Arrangement.Vertical n2 = flowLineMeasurePolicy.n();
        Arrangement.Horizontal m2 = flowLineMeasurePolicy.m();
        if (o2) {
            int P1 = (measureScope.P1(n2.a()) * (mutableVector.p() - 1)) + i3;
            int m3 = Constraints.m(j2);
            i4 = Constraints.k(j2);
            if (P1 < m3) {
                P1 = m3;
            }
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            if (P1 <= i4) {
                i4 = P1;
            }
            n2.b(measureScope, i4, iArr3, iArr4);
        } else {
            int[] iArr5 = iArr;
            int[] iArr6 = iArr2;
            int P12 = (measureScope.P1(m2.a()) * (mutableVector.p() - 1)) + i3;
            int m4 = Constraints.m(j2);
            int k2 = Constraints.k(j2);
            if (P12 < m4) {
                P12 = m4;
            }
            int i5 = P12 > k2 ? k2 : P12;
            m2.c(measureScope, i5, iArr, measureScope.getLayoutDirection(), iArr2);
            i4 = i5;
        }
        int n3 = Constraints.n(j2);
        int l2 = Constraints.l(j2);
        int i6 = i2;
        if (i6 >= n3) {
            n3 = i6;
        }
        if (n3 <= l2) {
            l2 = n3;
        }
        if (!o2) {
            int i7 = i4;
            i4 = l2;
            l2 = i7;
        }
        return MeasureScope.R1(measureScope, l2, i4, (Map) null, new FlowLayoutKt$placeHelper$3(mutableVector), 4, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: androidx.compose.foundation.layout.FlowMeasurePolicy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: androidx.compose.foundation.layout.FlowMeasurePolicy} */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a2, code lost:
        if (r5 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r1.W(r18) == false) goto L_0x0029;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.layout.MultiContentMeasurePolicy m(androidx.compose.foundation.layout.Arrangement.Horizontal r18, androidx.compose.foundation.layout.Arrangement.Vertical r19, androidx.compose.ui.Alignment.Vertical r20, int r21, int r22, androidx.compose.foundation.layout.FlowLayoutOverflowState r23, androidx.compose.runtime.Composer r24, int r25) {
        /*
            r0 = r20
            r1 = r24
            r2 = r25
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0015
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:484)"
            r5 = -2010142641(0xffffffff882fa84f, float:-5.2859993E-34)
            androidx.compose.runtime.ComposerKt.Y(r5, r2, r3, r4)
        L_0x0015:
            r3 = r2 & 14
            r3 = r3 ^ 6
            r4 = 4
            r5 = 0
            r6 = 1
            if (r3 <= r4) goto L_0x0027
            r3 = r18
            boolean r7 = r1.W(r3)
            if (r7 != 0) goto L_0x002d
            goto L_0x0029
        L_0x0027:
            r3 = r18
        L_0x0029:
            r7 = r2 & 6
            if (r7 != r4) goto L_0x002f
        L_0x002d:
            r4 = r6
            goto L_0x0030
        L_0x002f:
            r4 = r5
        L_0x0030:
            r7 = r2 & 112(0x70, float:1.57E-43)
            r7 = r7 ^ 48
            r8 = 32
            r10 = r19
            if (r7 <= r8) goto L_0x0040
            boolean r7 = r1.W(r10)
            if (r7 != 0) goto L_0x0044
        L_0x0040:
            r7 = r2 & 48
            if (r7 != r8) goto L_0x0046
        L_0x0044:
            r7 = r6
            goto L_0x0047
        L_0x0046:
            r7 = r5
        L_0x0047:
            r4 = r4 | r7
            r7 = r2 & 896(0x380, float:1.256E-42)
            r7 = r7 ^ 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 <= r8) goto L_0x0056
            boolean r7 = r1.W(r0)
            if (r7 != 0) goto L_0x005a
        L_0x0056:
            r7 = r2 & 384(0x180, float:5.38E-43)
            if (r7 != r8) goto L_0x005c
        L_0x005a:
            r7 = r6
            goto L_0x005d
        L_0x005c:
            r7 = r5
        L_0x005d:
            r4 = r4 | r7
            r7 = r2 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 ^ 3072(0xc00, float:4.305E-42)
            r8 = 2048(0x800, float:2.87E-42)
            r14 = r21
            if (r7 <= r8) goto L_0x006e
            boolean r7 = r1.i(r14)
            if (r7 != 0) goto L_0x0072
        L_0x006e:
            r7 = r2 & 3072(0xc00, float:4.305E-42)
            if (r7 != r8) goto L_0x0074
        L_0x0072:
            r7 = r6
            goto L_0x0075
        L_0x0074:
            r7 = r5
        L_0x0075:
            r4 = r4 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r2
            r7 = r7 ^ 24576(0x6000, float:3.4438E-41)
            r8 = 16384(0x4000, float:2.2959E-41)
            r15 = r22
            if (r7 <= r8) goto L_0x0088
            boolean r7 = r1.i(r15)
            if (r7 != 0) goto L_0x008c
        L_0x0088:
            r2 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r2 != r8) goto L_0x008d
        L_0x008c:
            r5 = r6
        L_0x008d:
            r2 = r4 | r5
            r4 = r23
            boolean r5 = r1.W(r4)
            r2 = r2 | r5
            java.lang.Object r5 = r24.g()
            if (r2 != 0) goto L_0x00a4
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x00c8
        L_0x00a4:
            float r11 = r18.a()
            androidx.compose.foundation.layout.CrossAxisAlignment$Companion r2 = androidx.compose.foundation.layout.CrossAxisAlignment.f3867a
            androidx.compose.foundation.layout.CrossAxisAlignment r12 = r2.c(r0)
            float r13 = r19.a()
            androidx.compose.foundation.layout.FlowMeasurePolicy r5 = new androidx.compose.foundation.layout.FlowMeasurePolicy
            r8 = 1
            r17 = 0
            r7 = r5
            r9 = r18
            r10 = r19
            r14 = r21
            r15 = r22
            r16 = r23
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.N(r5)
        L_0x00c8:
            androidx.compose.foundation.layout.FlowMeasurePolicy r5 = (androidx.compose.foundation.layout.FlowMeasurePolicy) r5
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00d3
            androidx.compose.runtime.ComposerKt.X()
        L_0x00d3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.m(androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, androidx.compose.foundation.layout.FlowLayoutOverflowState, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MultiContentMeasurePolicy");
    }

    public static final Measurable n(Iterator it, FlowLineInfo flowLineInfo) {
        try {
            if (!(it instanceof ContextualFlowItemIterator)) {
                return (Measurable) it.next();
            }
            Intrinsics.f(flowLineInfo);
            return ((ContextualFlowItemIterator) it).c(flowLineInfo);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }
}
