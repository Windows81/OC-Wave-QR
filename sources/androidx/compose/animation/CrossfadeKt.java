package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata
public final class CrossfadeKt {
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.animation.core.Transition r17, androidx.compose.ui.Modifier r18, androidx.compose.animation.core.FiniteAnimationSpec r19, kotlin.jvm.functions.Function1 r20, kotlin.jvm.functions.Function3 r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r1 = r17
            r5 = r21
            r6 = r23
            r0 = 2
            r2 = 1
            r3 = 679005231(0x2878cc2f, float:1.3811041E-14)
            r4 = r22
            androidx.compose.runtime.Composer r4 = r4.q(r3)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r24 & r7
            r8 = 4
            if (r7 == 0) goto L_0x001b
            r7 = r6 | 6
            goto L_0x002b
        L_0x001b:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x002a
            boolean r7 = r4.W(r1)
            if (r7 == 0) goto L_0x0027
            r7 = r8
            goto L_0x0028
        L_0x0027:
            r7 = r0
        L_0x0028:
            r7 = r7 | r6
            goto L_0x002b
        L_0x002a:
            r7 = r6
        L_0x002b:
            r9 = r24 & 1
            if (r9 == 0) goto L_0x0034
            r7 = r7 | 48
        L_0x0031:
            r10 = r18
            goto L_0x0046
        L_0x0034:
            r10 = r6 & 48
            if (r10 != 0) goto L_0x0031
            r10 = r18
            boolean r11 = r4.W(r10)
            if (r11 == 0) goto L_0x0043
            r11 = 32
            goto L_0x0045
        L_0x0043:
            r11 = 16
        L_0x0045:
            r7 = r7 | r11
        L_0x0046:
            r0 = r24 & 2
            if (r0 == 0) goto L_0x004f
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r11 = r19
            goto L_0x0061
        L_0x004f:
            r11 = r6 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x004c
            r11 = r19
            boolean r12 = r4.l(r11)
            if (r12 == 0) goto L_0x005e
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r7 = r7 | r12
        L_0x0061:
            r12 = r24 & 4
            if (r12 == 0) goto L_0x006a
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r13 = r20
            goto L_0x007c
        L_0x006a:
            r13 = r6 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0067
            r13 = r20
            boolean r14 = r4.l(r13)
            if (r14 == 0) goto L_0x0079
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r7 = r7 | r14
        L_0x007c:
            r14 = r24 & 8
            if (r14 == 0) goto L_0x0083
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0093
        L_0x0083:
            r14 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0093
            boolean r14 = r4.l(r5)
            if (r14 == 0) goto L_0x0090
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r7 = r7 | r14
        L_0x0093:
            r14 = r7 & 9363(0x2493, float:1.312E-41)
            r15 = 9362(0x2492, float:1.3119E-41)
            r8 = 0
            if (r14 == r15) goto L_0x009c
            r14 = r2
            goto L_0x009d
        L_0x009c:
            r14 = r8
        L_0x009d:
            r15 = r7 & 1
            boolean r14 = r4.E(r14, r15)
            if (r14 == 0) goto L_0x02a4
            if (r9 == 0) goto L_0x00aa
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00ab
        L_0x00aa:
            r9 = r10
        L_0x00ab:
            if (r0 == 0) goto L_0x00b4
            r0 = 7
            r10 = 0
            androidx.compose.animation.core.TweenSpec r0 = androidx.compose.animation.core.AnimationSpecKt.n(r8, r8, r10, r0, r10)
            r11 = r0
        L_0x00b4:
            if (r12 == 0) goto L_0x00b9
            androidx.compose.animation.CrossfadeKt$Crossfade$3 r0 = androidx.compose.animation.CrossfadeKt$Crossfade$3.f2198z
            r13 = r0
        L_0x00b9:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            r10 = -1
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = "androidx.compose.animation.Crossfade (Crossfade.kt:102)"
            androidx.compose.runtime.ComposerKt.Y(r3, r7, r10, r0)
        L_0x00c5:
            java.lang.Object r0 = r4.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r3.a()
            if (r0 != r12) goto L_0x00df
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = androidx.compose.runtime.SnapshotStateKt.f()
            java.lang.Object r12 = r17.i()
            r0.add(r12)
            r4.N(r0)
        L_0x00df:
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = (androidx.compose.runtime.snapshots.SnapshotStateList) r0
            java.lang.Object r12 = r4.g()
            java.lang.Object r14 = r3.a()
            if (r12 != r14) goto L_0x00f2
            androidx.collection.MutableScatterMap r12 = androidx.collection.ScatterMapKt.c()
            r4.N(r12)
        L_0x00f2:
            androidx.collection.MutableScatterMap r12 = (androidx.collection.MutableScatterMap) r12
            java.lang.Object r14 = r17.i()
            java.lang.Object r15 = r17.q()
            boolean r14 = kotlin.jvm.internal.Intrinsics.d(r14, r15)
            if (r14 == 0) goto L_0x0158
            r14 = 860925177(0x3350acf9, float:4.858609E-8)
            r4.X(r14)
            int r14 = r0.size()
            if (r14 != r2) goto L_0x0127
            java.lang.Object r14 = r0.get(r8)
            java.lang.Object r15 = r17.q()
            boolean r14 = kotlin.jvm.internal.Intrinsics.d(r14, r15)
            if (r14 != 0) goto L_0x011d
            goto L_0x0127
        L_0x011d:
            r3 = 861249809(0x3355a111, float:4.9739416E-8)
            r4.X(r3)
            r4.M()
            goto L_0x0154
        L_0x0127:
            r14 = 861059531(0x3352b9cb, float:4.9063413E-8)
            r4.X(r14)
            r7 = r7 & 14
            r14 = 4
            if (r7 != r14) goto L_0x0134
            r7 = r2
            goto L_0x0135
        L_0x0134:
            r7 = r8
        L_0x0135:
            java.lang.Object r14 = r4.g()
            if (r7 != 0) goto L_0x0141
            java.lang.Object r3 = r3.a()
            if (r14 != r3) goto L_0x0149
        L_0x0141:
            androidx.compose.animation.CrossfadeKt$Crossfade$4$1 r14 = new androidx.compose.animation.CrossfadeKt$Crossfade$4$1
            r14.<init>(r1)
            r4.N(r14)
        L_0x0149:
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            kotlin.collections.CollectionsKt.H(r0, r14)
            r12.k()
            r4.M()
        L_0x0154:
            r4.M()
            goto L_0x0161
        L_0x0158:
            r3 = 861255761(0x3355b851, float:4.9760562E-8)
            r4.X(r3)
            r4.M()
        L_0x0161:
            java.lang.Object r3 = r17.q()
            boolean r3 = r12.b(r3)
            if (r3 != 0) goto L_0x01cd
            r3 = 861316428(0x3356a54c, float:4.9976094E-8)
            r4.X(r3)
            java.util.Iterator r3 = r0.iterator()
            r7 = r8
        L_0x0176:
            boolean r14 = r3.hasNext()
            if (r14 == 0) goto L_0x0195
            java.lang.Object r14 = r3.next()
            java.lang.Object r14 = r13.invoke(r14)
            java.lang.Object r15 = r17.q()
            java.lang.Object r15 = r13.invoke(r15)
            boolean r14 = kotlin.jvm.internal.Intrinsics.d(r14, r15)
            if (r14 == 0) goto L_0x0193
            goto L_0x0196
        L_0x0193:
            int r7 = r7 + r2
            goto L_0x0176
        L_0x0195:
            r7 = r10
        L_0x0196:
            if (r7 != r10) goto L_0x01a0
            java.lang.Object r3 = r17.q()
            r0.add(r3)
            goto L_0x01a7
        L_0x01a0:
            java.lang.Object r3 = r17.q()
            r0.set(r7, r3)
        L_0x01a7:
            r12.k()
            int r3 = r0.size()
            r7 = r8
        L_0x01af:
            if (r7 >= r3) goto L_0x01c9
            java.lang.Object r10 = r0.get(r7)
            androidx.compose.animation.CrossfadeKt$Crossfade$5$1 r14 = new androidx.compose.animation.CrossfadeKt$Crossfade$5$1
            r14.<init>(r1, r11, r10, r5)
            r15 = 54
            r8 = -1426421288(0xffffffffaafa89d8, float:-4.450457E-13)
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r2, r14, r4, r15)
            r12.x(r10, r8)
            int r7 = r7 + r2
            r8 = 0
            goto L_0x01af
        L_0x01c9:
            r4.M()
            goto L_0x01d6
        L_0x01cd:
            r3 = 862059281(0x3361fb11, float:5.261524E-8)
            r4.X(r3)
            r4.M()
        L_0x01d6:
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r3 = r3.o()
            r7 = 0
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.BoxKt.g(r3, r7)
            int r8 = androidx.compose.runtime.ComposablesKt.a(r4, r7)
            androidx.compose.runtime.CompositionLocalMap r7 = r4.I()
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.ComposedModifierKt.e(r4, r9)
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r15 = r14.a()
            androidx.compose.runtime.Applier r16 = r4.v()
            if (r16 != 0) goto L_0x01fc
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01fc:
            r4.s()
            boolean r16 = r4.n()
            if (r16 == 0) goto L_0x0209
            r4.y(r15)
            goto L_0x020c
        L_0x0209:
            r4.K()
        L_0x020c:
            androidx.compose.runtime.Composer r15 = androidx.compose.runtime.Updater.b(r4)
            kotlin.jvm.functions.Function2 r2 = r14.c()
            androidx.compose.runtime.Updater.g(r15, r3, r2)
            kotlin.jvm.functions.Function2 r2 = r14.e()
            androidx.compose.runtime.Updater.g(r15, r7, r2)
            kotlin.jvm.functions.Function2 r2 = r14.b()
            boolean r3 = r15.n()
            if (r3 != 0) goto L_0x0236
            java.lang.Object r3 = r15.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r7)
            if (r3 != 0) goto L_0x0244
        L_0x0236:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r15.N(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r15.A(r3, r2)
        L_0x0244:
            kotlin.jvm.functions.Function2 r2 = r14.d()
            androidx.compose.runtime.Updater.g(r15, r10, r2)
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            r2 = -187474512(0xfffffffff4d35db0, float:-1.339691E32)
            r4.X(r2)
            int r2 = r0.size()
            r7 = 0
        L_0x0258:
            if (r7 >= r2) goto L_0x0292
            java.lang.Object r3 = r0.get(r7)
            r8 = -1081865889(0xffffffffbf84095f, float:-1.031536)
            java.lang.Object r10 = r13.invoke(r3)
            r4.r(r8, r10)
            java.lang.Object r3 = r12.e(r3)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            if (r3 != 0) goto L_0x027b
            r3 = 821932266(0x30fdb0ea, float:1.8458455E-9)
            r4.X(r3)
            r4.M()
            r8 = 0
            goto L_0x028c
        L_0x027b:
            r8 = -1081864713(0xffffffffbf840df7, float:-1.0316762)
            r4.X(r8)
            r8 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r3.m(r4, r10)
            r4.M()
        L_0x028c:
            r4.Q()
            r3 = 1
            int r7 = r7 + r3
            goto L_0x0258
        L_0x0292:
            r4.M()
            r4.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02a1
            androidx.compose.runtime.ComposerKt.X()
        L_0x02a1:
            r2 = r9
        L_0x02a2:
            r3 = r11
            goto L_0x02a9
        L_0x02a4:
            r4.B()
            r2 = r10
            goto L_0x02a2
        L_0x02a9:
            androidx.compose.runtime.ScopeUpdateScope r8 = r4.x()
            if (r8 == 0) goto L_0x02c1
            androidx.compose.animation.CrossfadeKt$Crossfade$7 r9 = new androidx.compose.animation.CrossfadeKt$Crossfade$7
            r0 = r9
            r1 = r17
            r4 = r13
            r5 = r21
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x02c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.a(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.Object r16, androidx.compose.ui.Modifier r17, androidx.compose.animation.core.FiniteAnimationSpec r18, java.lang.String r19, kotlin.jvm.functions.Function3 r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r1 = r16
            r6 = r22
            r0 = -310686752(0xffffffffed7b4be0, float:-4.860779E27)
            r2 = r21
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r23 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r6 | 6
            goto L_0x002d
        L_0x0014:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x002c
            r3 = r6 & 8
            if (r3 != 0) goto L_0x0021
            boolean r3 = r2.W(r1)
            goto L_0x0025
        L_0x0021:
            boolean r3 = r2.l(r1)
        L_0x0025:
            if (r3 == 0) goto L_0x0029
            r3 = 4
            goto L_0x002a
        L_0x0029:
            r3 = 2
        L_0x002a:
            r3 = r3 | r6
            goto L_0x002d
        L_0x002c:
            r3 = r6
        L_0x002d:
            r4 = r23 & 2
            if (r4 == 0) goto L_0x0036
            r3 = r3 | 48
        L_0x0033:
            r5 = r17
            goto L_0x0048
        L_0x0036:
            r5 = r6 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r17
            boolean r7 = r2.W(r5)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0045:
            r7 = 16
        L_0x0047:
            r3 = r3 | r7
        L_0x0048:
            r7 = r23 & 4
            if (r7 == 0) goto L_0x0051
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r8 = r18
            goto L_0x0063
        L_0x0051:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004e
            r8 = r18
            boolean r9 = r2.l(r8)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r9
        L_0x0063:
            r9 = r23 & 8
            if (r9 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r10 = r19
            goto L_0x007e
        L_0x006c:
            r10 = r6 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0069
            r10 = r19
            boolean r11 = r2.W(r10)
            if (r11 == 0) goto L_0x007b
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r11
        L_0x007e:
            r11 = r23 & 16
            if (r11 == 0) goto L_0x0087
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r15 = r20
            goto L_0x0099
        L_0x0087:
            r11 = r6 & 24576(0x6000, float:3.4438E-41)
            r15 = r20
            if (r11 != 0) goto L_0x0099
            boolean r11 = r2.l(r15)
            if (r11 == 0) goto L_0x0096
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r3 = r3 | r11
        L_0x0099:
            r11 = r3 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            r13 = 0
            if (r11 == r12) goto L_0x00a2
            r11 = 1
            goto L_0x00a3
        L_0x00a2:
            r11 = r13
        L_0x00a3:
            r12 = r3 & 1
            boolean r11 = r2.E(r11, r12)
            if (r11 == 0) goto L_0x00f6
            if (r4 == 0) goto L_0x00b0
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00b1
        L_0x00b0:
            r4 = r5
        L_0x00b1:
            if (r7 == 0) goto L_0x00ba
            r5 = 7
            r7 = 0
            androidx.compose.animation.core.TweenSpec r5 = androidx.compose.animation.core.AnimationSpecKt.n(r13, r13, r7, r5, r7)
            goto L_0x00bb
        L_0x00ba:
            r5 = r8
        L_0x00bb:
            if (r9 == 0) goto L_0x00c1
            java.lang.String r7 = "Crossfade"
            r14 = r7
            goto L_0x00c2
        L_0x00c1:
            r14 = r10
        L_0x00c2:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00ce
            r7 = -1
            java.lang.String r8 = "androidx.compose.animation.Crossfade (Crossfade.kt:55)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r7, r8)
        L_0x00ce:
            r0 = r3 & 14
            int r7 = r3 >> 6
            r7 = r7 & 112(0x70, float:1.57E-43)
            r0 = r0 | r7
            androidx.compose.animation.core.Transition r7 = androidx.compose.animation.core.TransitionKt.j(r1, r14, r2, r0, r13)
            r0 = 58352(0xe3f0, float:8.1769E-41)
            r13 = r3 & r0
            r0 = 4
            r10 = 0
            r8 = r4
            r9 = r5
            r11 = r20
            r12 = r2
            r3 = r14
            r14 = r0
            a(r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00f3
            androidx.compose.runtime.ComposerKt.X()
        L_0x00f3:
            r10 = r3
            r3 = r5
            goto L_0x00fb
        L_0x00f6:
            r2.B()
            r4 = r5
            r3 = r8
        L_0x00fb:
            androidx.compose.runtime.ScopeUpdateScope r8 = r2.x()
            if (r8 == 0) goto L_0x0114
            androidx.compose.animation.CrossfadeKt$Crossfade$1 r9 = new androidx.compose.animation.CrossfadeKt$Crossfade$1
            r0 = r9
            r1 = r16
            r2 = r4
            r4 = r10
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.b(java.lang.Object, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final /* synthetic */ void c(Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function3 function3, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(523603005);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? q2.W(obj) : q2.l(obj) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.W(modifier) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= q2.l(finiteAnimationSpec) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= q2.l(function3) ? 2048 : 1024;
        }
        if (q2.E((i4 & 1171) != 1170, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (i6 != 0) {
                finiteAnimationSpec = AnimationSpecKt.n(0, 0, (Easing) null, 7, (Object) null);
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(523603005, i4, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:68)");
            }
            a(TransitionKt.j(obj, (String) null, q2, i4 & 14, 2), modifier, finiteAnimationSpec, (Function1) null, function3, q2, (i4 & 1008) | ((i4 << 3) & 57344), 4);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Modifier modifier2 = modifier;
        FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new CrossfadeKt$Crossfade$2(obj, modifier2, finiteAnimationSpec2, function3, i2, i3));
        }
    }
}
