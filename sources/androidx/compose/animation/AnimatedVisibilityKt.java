package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class AnimatedVisibilityKt {
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.animation.core.Transition r24, kotlin.jvm.functions.Function1 r25, androidx.compose.ui.Modifier r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, kotlin.jvm.functions.Function2 r29, androidx.compose.animation.OnLookaheadMeasured r30, kotlin.jvm.functions.Function3 r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r29
            r0 = r30
            r10 = r31
            r11 = r33
            r12 = r34
            r1 = -891967166(0xffffffffcad5a942, float:-7001249.0)
            r2 = r32
            androidx.compose.runtime.Composer r15 = r2.q(r1)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0020
            r2 = r11 | 6
            goto L_0x0030
        L_0x0020:
            r2 = r11 & 6
            if (r2 != 0) goto L_0x002f
            boolean r2 = r15.W(r6)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r11
            goto L_0x0030
        L_0x002f:
            r2 = r11
        L_0x0030:
            r3 = r12 & 2
            if (r3 == 0) goto L_0x0037
            r2 = r2 | 48
            goto L_0x0047
        L_0x0037:
            r3 = r11 & 48
            if (r3 != 0) goto L_0x0047
            boolean r3 = r15.l(r7)
            if (r3 == 0) goto L_0x0044
            r3 = 32
            goto L_0x0046
        L_0x0044:
            r3 = 16
        L_0x0046:
            r2 = r2 | r3
        L_0x0047:
            r3 = r12 & 4
            if (r3 == 0) goto L_0x004e
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x005e
        L_0x004e:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x005e
            boolean r3 = r15.W(r8)
            if (r3 == 0) goto L_0x005b
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r3 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r2 = r2 | r3
        L_0x005e:
            r3 = r12 & 8
            if (r3 == 0) goto L_0x0067
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r14 = r27
            goto L_0x0079
        L_0x0067:
            r3 = r11 & 3072(0xc00, float:4.305E-42)
            r14 = r27
            if (r3 != 0) goto L_0x0079
            boolean r3 = r15.W(r14)
            if (r3 == 0) goto L_0x0076
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r2 = r2 | r3
        L_0x0079:
            r3 = r12 & 16
            if (r3 == 0) goto L_0x0082
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r5 = r28
            goto L_0x0094
        L_0x0082:
            r3 = r11 & 24576(0x6000, float:3.4438E-41)
            r5 = r28
            if (r3 != 0) goto L_0x0094
            boolean r3 = r15.W(r5)
            if (r3 == 0) goto L_0x0091
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r2 = r2 | r3
        L_0x0094:
            r3 = r12 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x009c
            r2 = r2 | r4
            goto L_0x00ac
        L_0x009c:
            r3 = r11 & r4
            if (r3 != 0) goto L_0x00ac
            boolean r3 = r15.l(r9)
            if (r3 == 0) goto L_0x00a9
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ab
        L_0x00a9:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x00ab:
            r2 = r2 | r3
        L_0x00ac:
            r3 = r12 & 64
            r21 = 2097152(0x200000, float:2.938736E-39)
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r3 == 0) goto L_0x00b7
        L_0x00b4:
            r2 = r2 | r16
            goto L_0x00d0
        L_0x00b7:
            r16 = r11 & r16
            if (r16 != 0) goto L_0x00d0
            r16 = r11 & r21
            if (r16 != 0) goto L_0x00c4
            boolean r16 = r15.W(r0)
            goto L_0x00c8
        L_0x00c4:
            boolean r16 = r15.l(r0)
        L_0x00c8:
            if (r16 == 0) goto L_0x00cd
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b4
        L_0x00cd:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00b4
        L_0x00d0:
            r4 = r12 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r4 == 0) goto L_0x00da
            r2 = r2 | r16
        L_0x00d8:
            r4 = r2
            goto L_0x00eb
        L_0x00da:
            r4 = r11 & r16
            if (r4 != 0) goto L_0x00d8
            boolean r4 = r15.l(r10)
            if (r4 == 0) goto L_0x00e7
            r4 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00e7:
            r4 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e9:
            r2 = r2 | r4
            goto L_0x00d8
        L_0x00eb:
            r2 = 4793491(0x492493, float:6.717112E-39)
            r2 = r2 & r4
            r13 = 4793490(0x492492, float:6.71711E-39)
            r22 = 1
            if (r2 == r13) goto L_0x00f9
            r2 = r22
            goto L_0x00fa
        L_0x00f9:
            r2 = 0
        L_0x00fa:
            r13 = r4 & 1
            boolean r2 = r15.E(r2, r13)
            if (r2 == 0) goto L_0x0377
            if (r3 == 0) goto L_0x0106
            r3 = 0
            goto L_0x0107
        L_0x0106:
            r3 = r0
        L_0x0107:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            r2 = -1
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:718)"
            r13 = -891967166(0xffffffffcad5a942, float:-7001249.0)
            androidx.compose.runtime.ComposerKt.Y(r13, r4, r2, r0)
        L_0x0116:
            java.lang.Object r0 = r24.q()
            java.lang.Object r0 = r7.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0150
            java.lang.Object r0 = r24.i()
            java.lang.Object r0 = r7.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0150
            boolean r0 = r24.v()
            if (r0 != 0) goto L_0x0150
            boolean r0 = r24.j()
            if (r0 == 0) goto L_0x0143
            goto L_0x0150
        L_0x0143:
            r0 = 1790694746(0x6abbd55a, float:1.1353833E26)
            r15.X(r0)
            r15.M()
            r11 = r3
            r1 = r15
            goto L_0x036d
        L_0x0150:
            r0 = 1788522886(0x6a9ab186, float:9.350645E25)
            r15.X(r0)
            r13 = r4 & 14
            r0 = r13 | 48
            r1 = r0 & 14
            r2 = r1 ^ 6
            r19 = r3
            r3 = 4
            if (r2 <= r3) goto L_0x0169
            boolean r2 = r15.W(r6)
            if (r2 != 0) goto L_0x016d
        L_0x0169:
            r0 = r0 & 6
            if (r0 != r3) goto L_0x0170
        L_0x016d:
            r0 = r22
            goto L_0x0171
        L_0x0170:
            r0 = 0
        L_0x0171:
            java.lang.Object r2 = r15.g()
            if (r0 != 0) goto L_0x017f
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0186
        L_0x017f:
            java.lang.Object r2 = r24.i()
            r15.N(r2)
        L_0x0186:
            boolean r0 = r24.v()
            if (r0 == 0) goto L_0x0190
            java.lang.Object r2 = r24.i()
        L_0x0190:
            r0 = -466616829(0xffffffffe42ffe03, float:-1.2985935E22)
            r15.X(r0)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x01a3
            java.lang.String r3 = "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:727)"
            r5 = 0
            r11 = -1
            androidx.compose.runtime.ComposerKt.Y(r0, r5, r11, r3)
        L_0x01a3:
            r3 = r4 & 126(0x7e, float:1.77E-43)
            androidx.compose.animation.EnterExitState r2 = o(r6, r7, r2, r15, r3)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x01b2
            androidx.compose.runtime.ComposerKt.X()
        L_0x01b2:
            r15.M()
            java.lang.Object r5 = r24.q()
            r15.X(r0)
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x01cc
            java.lang.String r11 = "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:727)"
            r20 = r4
            r4 = 0
            r12 = -1
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r12, r11)
            goto L_0x01cf
        L_0x01cc:
            r20 = r4
            r4 = 0
        L_0x01cf:
            androidx.compose.animation.EnterExitState r3 = o(r6, r7, r5, r15, r3)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01dc
            androidx.compose.runtime.ComposerKt.X()
        L_0x01dc:
            r15.M()
            r5 = r1 | 3072(0xc00, float:4.305E-42)
            java.lang.String r11 = "EnterExitTransition"
            r0 = r24
            r12 = r4
            r1 = r2
            r2 = r3
            r4 = r19
            r3 = r11
            r11 = r4
            r23 = r20
            r4 = r15
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.d(r0, r1, r2, r3, r4, r5)
            int r1 = r23 >> 15
            r1 = r1 & 14
            androidx.compose.runtime.State r1 = androidx.compose.runtime.SnapshotStateKt.p(r9, r15, r1)
            java.lang.Object r2 = r0.i()
            java.lang.Object r3 = r0.q()
            java.lang.Object r2 = r9.m(r2, r3)
            boolean r3 = r15.W(r0)
            boolean r4 = r15.W(r1)
            r3 = r3 | r4
            java.lang.Object r4 = r15.g()
            if (r3 != 0) goto L_0x021e
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0227
        L_0x021e:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 r4 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1
            r3 = 0
            r4.<init>(r0, r1, r3)
            r15.N(r4)
        L_0x0227:
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            androidx.compose.runtime.State r1 = androidx.compose.runtime.SnapshotStateKt.n(r2, r4, r15, r12)
            boolean r2 = n(r0)
            if (r2 == 0) goto L_0x0246
            boolean r1 = c(r1)
            if (r1 != 0) goto L_0x023a
            goto L_0x0246
        L_0x023a:
            r0 = 1790688794(0x6abbbe1a, float:1.1348343E26)
            r15.X(r0)
            r15.M()
            r1 = r15
            goto L_0x036a
        L_0x0246:
            r1 = 1789551931(0x6aaa653b, float:1.0299772E26)
            r15.X(r1)
            r1 = 4
            if (r13 != r1) goto L_0x0252
            r1 = r22
            goto L_0x0253
        L_0x0252:
            r1 = r12
        L_0x0253:
            java.lang.Object r2 = r15.g()
            if (r1 != 0) goto L_0x0261
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0269
        L_0x0261:
            androidx.compose.animation.AnimatedVisibilityScopeImpl r2 = new androidx.compose.animation.AnimatedVisibilityScopeImpl
            r2.<init>(r0)
            r15.N(r2)
        L_0x0269:
            androidx.compose.animation.AnimatedVisibilityScopeImpl r2 = (androidx.compose.animation.AnimatedVisibilityScopeImpl) r2
            int r1 = r23 >> 6
            r3 = r1 & 112(0x70, float:1.57E-43)
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r1 = r1 & 896(0x380, float:1.256E-42)
            r19 = r3 | r1
            r20 = 4
            r16 = 0
            java.lang.String r17 = "Built-in"
            r13 = r0
            r14 = r27
            r1 = r15
            r15 = r28
            r18 = r1
            androidx.compose.ui.Modifier r0 = androidx.compose.animation.EnterExitTransitionKt.g(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r11 == 0) goto L_0x02c6
            r3 = 1789971299(0x6ab0cb63, float:1.0686571E26)
            r1.X(r3)
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r23 & r4
            r5 = 1048576(0x100000, float:1.469368E-39)
            if (r4 == r5) goto L_0x02a6
            r4 = r23 & r21
            if (r4 == 0) goto L_0x02a4
            boolean r4 = r1.l(r11)
            if (r4 == 0) goto L_0x02a4
            goto L_0x02a6
        L_0x02a4:
            r22 = r12
        L_0x02a6:
            java.lang.Object r4 = r1.g()
            if (r22 != 0) goto L_0x02b4
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x02bc
        L_0x02b4:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1 r4 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1
            r4.<init>(r11)
            r1.N(r4)
        L_0x02bc:
            kotlin.jvm.functions.Function3 r4 = (kotlin.jvm.functions.Function3) r4
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.layout.LayoutModifierKt.a(r3, r4)
            r1.M()
            goto L_0x02d1
        L_0x02c6:
            r3 = 1581779440(0x5e4809f0, float:3.60357899E18)
            r1.X(r3)
            r1.M()
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
        L_0x02d1:
            androidx.compose.ui.Modifier r0 = r0.o0(r3)
            androidx.compose.ui.Modifier r0 = r8.o0(r0)
            java.lang.Object r3 = r1.g()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r3 != r4) goto L_0x02ed
            androidx.compose.animation.AnimatedEnterExitMeasurePolicy r3 = new androidx.compose.animation.AnimatedEnterExitMeasurePolicy
            r3.<init>(r2)
            r1.N(r3)
        L_0x02ed:
            androidx.compose.animation.AnimatedEnterExitMeasurePolicy r3 = (androidx.compose.animation.AnimatedEnterExitMeasurePolicy) r3
            int r4 = androidx.compose.runtime.ComposablesKt.a(r1, r12)
            androidx.compose.runtime.CompositionLocalMap r5 = r1.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r1, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r13 = r12.a()
            androidx.compose.runtime.Applier r14 = r1.v()
            if (r14 != 0) goto L_0x030a
            androidx.compose.runtime.ComposablesKt.d()
        L_0x030a:
            r1.s()
            boolean r14 = r1.n()
            if (r14 == 0) goto L_0x0317
            r1.y(r13)
            goto L_0x031a
        L_0x0317:
            r1.K()
        L_0x031a:
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.b(r1)
            kotlin.jvm.functions.Function2 r14 = r12.c()
            androidx.compose.runtime.Updater.g(r13, r3, r14)
            kotlin.jvm.functions.Function2 r3 = r12.e()
            androidx.compose.runtime.Updater.g(r13, r5, r3)
            kotlin.jvm.functions.Function2 r3 = r12.b()
            boolean r5 = r13.n()
            if (r5 != 0) goto L_0x0344
            java.lang.Object r5 = r13.g()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r14)
            if (r5 != 0) goto L_0x0352
        L_0x0344:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r13.N(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13.A(r4, r3)
        L_0x0352:
            kotlin.jvm.functions.Function2 r3 = r12.d()
            androidx.compose.runtime.Updater.g(r13, r0, r3)
            int r0 = r23 >> 18
            r0 = r0 & 112(0x70, float:1.57E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.d(r2, r1, r0)
            r1.T()
            r1.M()
        L_0x036a:
            r1.M()
        L_0x036d:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x037c
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x037c
        L_0x0377:
            r1 = r15
            r1.B()
            r11 = r0
        L_0x037c:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x039e
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4
            r0 = r13
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r11
            r8 = r31
            r9 = r33
            r10 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.a(r13)
        L_0x039e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.a(androidx.compose.animation.core.Transition, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, kotlin.jvm.functions.Function2, androidx.compose.animation.OnLookaheadMeasured, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Function2 b(State state) {
        return (Function2) state.getValue();
    }

    public static final boolean c(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(androidx.compose.animation.core.MutableTransitionState r22, androidx.compose.ui.Modifier r23, androidx.compose.animation.EnterTransition r24, androidx.compose.animation.ExitTransition r25, java.lang.String r26, kotlin.jvm.functions.Function3 r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            r1 = r22
            r7 = r29
            r0 = -222898426(0xfffffffff2b6d706, float:-7.243036E30)
            r2 = r28
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r30 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r7 | 6
            goto L_0x002d
        L_0x0014:
            r3 = r7 & 6
            if (r3 != 0) goto L_0x002c
            r3 = r7 & 8
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
            r3 = r3 | r7
            goto L_0x002d
        L_0x002c:
            r3 = r7
        L_0x002d:
            r4 = r30 & 2
            if (r4 == 0) goto L_0x0036
            r3 = r3 | 48
        L_0x0033:
            r5 = r23
            goto L_0x0048
        L_0x0036:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r23
            boolean r6 = r2.W(r5)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r3 = r3 | r6
        L_0x0048:
            r6 = r30 & 4
            if (r6 == 0) goto L_0x0051
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r8 = r24
            goto L_0x0063
        L_0x0051:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004e
            r8 = r24
            boolean r9 = r2.W(r8)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r9
        L_0x0063:
            r9 = r30 & 8
            if (r9 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r10 = r25
            goto L_0x007e
        L_0x006c:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0069
            r10 = r25
            boolean r11 = r2.W(r10)
            if (r11 == 0) goto L_0x007b
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r11
        L_0x007e:
            r11 = r30 & 16
            if (r11 == 0) goto L_0x0087
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r12 = r26
            goto L_0x0099
        L_0x0087:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0084
            r12 = r26
            boolean r13 = r2.W(r12)
            if (r13 == 0) goto L_0x0096
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r3 = r3 | r13
        L_0x0099:
            r13 = r30 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a3
            r3 = r3 | r14
            r15 = r27
            goto L_0x00b5
        L_0x00a3:
            r13 = r7 & r14
            r15 = r27
            if (r13 != 0) goto L_0x00b5
            boolean r13 = r2.l(r15)
            if (r13 == 0) goto L_0x00b2
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r3 = r3 | r13
        L_0x00b5:
            r13 = 74899(0x12493, float:1.04956E-40)
            r13 = r13 & r3
            r14 = 74898(0x12492, float:1.04954E-40)
            r0 = 0
            if (r13 == r14) goto L_0x00c1
            r13 = 1
            goto L_0x00c2
        L_0x00c1:
            r13 = r0
        L_0x00c2:
            r14 = r3 & 1
            boolean r13 = r2.E(r13, r14)
            if (r13 == 0) goto L_0x015b
            if (r4 == 0) goto L_0x00cf
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00d0
        L_0x00cf:
            r4 = r5
        L_0x00d0:
            r5 = 0
            r13 = 3
            r14 = 0
            if (r6 == 0) goto L_0x00ee
            androidx.compose.animation.EnterTransition r6 = androidx.compose.animation.EnterExitTransitionKt.o(r14, r5, r13, r14)
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.EnterTransition r8 = androidx.compose.animation.EnterExitTransitionKt.k(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.EnterTransition r6 = r6.c(r8)
            goto L_0x00ef
        L_0x00ee:
            r6 = r8
        L_0x00ef:
            if (r9 == 0) goto L_0x010a
            androidx.compose.animation.ExitTransition r5 = androidx.compose.animation.EnterExitTransitionKt.q(r14, r5, r13, r14)
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.ExitTransition r8 = androidx.compose.animation.EnterExitTransitionKt.w(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.ExitTransition r5 = r5.c(r8)
            goto L_0x010b
        L_0x010a:
            r5 = r10
        L_0x010b:
            if (r11 == 0) goto L_0x0111
            java.lang.String r8 = "AnimatedVisibility"
            r14 = r8
            goto L_0x0112
        L_0x0111:
            r14 = r12
        L_0x0112:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x0121
            r8 = -1
            java.lang.String r9 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)"
            r10 = -222898426(0xfffffffff2b6d706, float:-7.243036E30)
            androidx.compose.runtime.ComposerKt.Y(r10, r3, r8, r9)
        L_0x0121:
            int r8 = androidx.compose.animation.core.MutableTransitionState.f2620d
            r9 = r3 & 14
            r8 = r8 | r9
            int r9 = r3 >> 9
            r9 = r9 & 112(0x70, float:1.57E-43)
            r8 = r8 | r9
            androidx.compose.animation.core.Transition r8 = androidx.compose.animation.core.TransitionKt.h(r1, r14, r2, r8, r0)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7 r9 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7.f2130z
            int r0 = r3 << 3
            r10 = r0 & 896(0x380, float:1.256E-42)
            r10 = r10 | 48
            r11 = r0 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r11
            r0 = r0 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r10
            r0 = r0 | r3
            r10 = r4
            r11 = r6
            r12 = r5
            r13 = r27
            r3 = r14
            r14 = r2
            r15 = r0
            k(r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0157
            androidx.compose.runtime.ComposerKt.X()
        L_0x0157:
            r10 = r5
            r5 = r3
            r3 = r6
            goto L_0x0161
        L_0x015b:
            r2.B()
            r4 = r5
            r3 = r8
            r5 = r12
        L_0x0161:
            androidx.compose.runtime.ScopeUpdateScope r9 = r2.x()
            if (r9 == 0) goto L_0x017a
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8 r11 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
            r0 = r11
            r1 = r22
            r2 = r4
            r4 = r10
            r6 = r27
            r7 = r29
            r8 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r11)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.d(androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(androidx.compose.animation.core.Transition r23, kotlin.jvm.functions.Function1 r24, androidx.compose.ui.Modifier r25, androidx.compose.animation.EnterTransition r26, androidx.compose.animation.ExitTransition r27, kotlin.jvm.functions.Function3 r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r7 = r30
            r0 = 1031950689(0x3d825161, float:0.06363178)
            r1 = r29
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r31 & r2
            if (r2 == 0) goto L_0x0017
            r2 = r7 | 6
            r3 = r2
            r2 = r23
            goto L_0x002b
        L_0x0017:
            r2 = r7 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r23
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r7
            goto L_0x002b
        L_0x0028:
            r2 = r23
            r3 = r7
        L_0x002b:
            r4 = r31 & 1
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r4 = r24
            goto L_0x0046
        L_0x0034:
            r4 = r7 & 48
            if (r4 != 0) goto L_0x0031
            r4 = r24
            boolean r5 = r1.l(r4)
            if (r5 == 0) goto L_0x0043
            r5 = 32
            goto L_0x0045
        L_0x0043:
            r5 = 16
        L_0x0045:
            r3 = r3 | r5
        L_0x0046:
            r5 = r31 & 2
            if (r5 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r6 = r25
            goto L_0x0061
        L_0x004f:
            r6 = r7 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004c
            r6 = r25
            boolean r8 = r1.W(r6)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r8
        L_0x0061:
            r8 = r31 & 4
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r26
            goto L_0x007c
        L_0x006a:
            r9 = r7 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r26
            boolean r10 = r1.W(r9)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r10
        L_0x007c:
            r10 = r31 & 8
            if (r10 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r11 = r27
            goto L_0x0097
        L_0x0085:
            r11 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0082
            r11 = r27
            boolean r12 = r1.W(r11)
            if (r12 == 0) goto L_0x0094
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r12
        L_0x0097:
            r12 = r31 & 16
            r13 = 196608(0x30000, float:2.75506E-40)
            if (r12 == 0) goto L_0x00a1
            r3 = r3 | r13
            r15 = r28
            goto L_0x00b3
        L_0x00a1:
            r12 = r7 & r13
            r15 = r28
            if (r12 != 0) goto L_0x00b3
            boolean r12 = r1.l(r15)
            if (r12 == 0) goto L_0x00b0
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00b0:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r3 = r3 | r12
        L_0x00b3:
            r12 = 74899(0x12493, float:1.04956E-40)
            r12 = r12 & r3
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r12 == r13) goto L_0x00be
            r12 = 1
            goto L_0x00bf
        L_0x00be:
            r12 = 0
        L_0x00bf:
            r13 = r3 & 1
            boolean r12 = r1.E(r12, r13)
            if (r12 == 0) goto L_0x0138
            if (r5 == 0) goto L_0x00cc
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00cd
        L_0x00cc:
            r5 = r6
        L_0x00cd:
            r6 = 3
            r12 = 0
            r13 = 0
            if (r8 == 0) goto L_0x00ed
            androidx.compose.animation.EnterTransition r8 = androidx.compose.animation.EnterExitTransitionKt.o(r13, r12, r6, r13)
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.EnterTransition r9 = androidx.compose.animation.EnterExitTransitionKt.k(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.EnterTransition r8 = r8.c(r9)
            r16 = r8
            goto L_0x00ef
        L_0x00ed:
            r16 = r9
        L_0x00ef:
            if (r10 == 0) goto L_0x010a
            r21 = 15
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.animation.ExitTransition r8 = androidx.compose.animation.EnterExitTransitionKt.w(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.ExitTransition r6 = androidx.compose.animation.EnterExitTransitionKt.q(r13, r12, r6, r13)
            androidx.compose.animation.ExitTransition r6 = r8.c(r6)
            goto L_0x010b
        L_0x010a:
            r6 = r11
        L_0x010b:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x0117
            r8 = -1
            java.lang.String r9 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:593)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r8, r9)
        L_0x0117:
            r0 = 524286(0x7fffe, float:7.34681E-40)
            r0 = r0 & r3
            r8 = r23
            r9 = r24
            r10 = r5
            r11 = r16
            r12 = r6
            r13 = r28
            r14 = r1
            r15 = r0
            k(r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0133
            androidx.compose.runtime.ComposerKt.X()
        L_0x0133:
            r3 = r5
            r5 = r6
            r9 = r16
            goto L_0x013d
        L_0x0138:
            r1.B()
            r3 = r6
            r5 = r11
        L_0x013d:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x0157
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13 r11 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
            r0 = r11
            r1 = r23
            r2 = r24
            r4 = r9
            r6 = r28
            r7 = r30
            r8 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.a(r11)
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.e(androidx.compose.animation.core.Transition, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(androidx.compose.foundation.layout.ColumnScope r23, androidx.compose.animation.core.MutableTransitionState r24, androidx.compose.ui.Modifier r25, androidx.compose.animation.EnterTransition r26, androidx.compose.animation.ExitTransition r27, java.lang.String r28, kotlin.jvm.functions.Function3 r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r2 = r24
            r8 = r31
            r0 = -850656618(0xffffffffcd4c0296, float:-2.13920096E8)
            r1 = r30
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r32 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r8 | 48
            goto L_0x002f
        L_0x0014:
            r3 = r8 & 48
            if (r3 != 0) goto L_0x002e
            r3 = r8 & 64
            if (r3 != 0) goto L_0x0021
            boolean r3 = r1.W(r2)
            goto L_0x0025
        L_0x0021:
            boolean r3 = r1.l(r2)
        L_0x0025:
            if (r3 == 0) goto L_0x002a
            r3 = 32
            goto L_0x002c
        L_0x002a:
            r3 = 16
        L_0x002c:
            r3 = r3 | r8
            goto L_0x002f
        L_0x002e:
            r3 = r8
        L_0x002f:
            r4 = r32 & 2
            if (r4 == 0) goto L_0x0038
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0035:
            r5 = r25
            goto L_0x004a
        L_0x0038:
            r5 = r8 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0035
            r5 = r25
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0047
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0049
        L_0x0047:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0049:
            r3 = r3 | r6
        L_0x004a:
            r6 = r32 & 4
            if (r6 == 0) goto L_0x0053
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0050:
            r7 = r26
            goto L_0x0065
        L_0x0053:
            r7 = r8 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0050
            r7 = r26
            boolean r9 = r1.W(r7)
            if (r9 == 0) goto L_0x0062
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0064
        L_0x0062:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0064:
            r3 = r3 | r9
        L_0x0065:
            r9 = r32 & 8
            if (r9 == 0) goto L_0x006e
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x006b:
            r10 = r27
            goto L_0x0080
        L_0x006e:
            r10 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x006b
            r10 = r27
            boolean r11 = r1.W(r10)
            if (r11 == 0) goto L_0x007d
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x007f
        L_0x007d:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x007f:
            r3 = r3 | r11
        L_0x0080:
            r11 = r32 & 16
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x008a
            r3 = r3 | r12
        L_0x0087:
            r12 = r28
            goto L_0x009b
        L_0x008a:
            r12 = r12 & r8
            if (r12 != 0) goto L_0x0087
            r12 = r28
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0098
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x009a
        L_0x0098:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x009a:
            r3 = r3 | r13
        L_0x009b:
            r13 = r32 & 32
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r13 == 0) goto L_0x00a5
            r3 = r3 | r14
            r15 = r29
            goto L_0x00b7
        L_0x00a5:
            r13 = r8 & r14
            r15 = r29
            if (r13 != 0) goto L_0x00b7
            boolean r13 = r1.l(r15)
            if (r13 == 0) goto L_0x00b4
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b6
        L_0x00b4:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00b6:
            r3 = r3 | r13
        L_0x00b7:
            r13 = 599185(0x92491, float:8.39637E-40)
            r13 = r13 & r3
            r14 = 599184(0x92490, float:8.39636E-40)
            r0 = 0
            if (r13 == r14) goto L_0x00c3
            r13 = 1
            goto L_0x00c4
        L_0x00c3:
            r13 = r0
        L_0x00c4:
            r14 = r3 & 1
            boolean r13 = r1.E(r13, r14)
            if (r13 == 0) goto L_0x015c
            if (r4 == 0) goto L_0x00d1
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00d2
        L_0x00d1:
            r4 = r5
        L_0x00d2:
            r5 = 0
            r13 = 3
            r14 = 0
            if (r6 == 0) goto L_0x00f0
            r21 = 15
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.animation.EnterTransition r6 = androidx.compose.animation.EnterExitTransitionKt.m(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.EnterTransition r7 = androidx.compose.animation.EnterExitTransitionKt.o(r14, r5, r13, r14)
            androidx.compose.animation.EnterTransition r6 = r6.c(r7)
            goto L_0x00f1
        L_0x00f0:
            r6 = r7
        L_0x00f1:
            if (r9 == 0) goto L_0x010c
            r21 = 15
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.animation.ExitTransition r7 = androidx.compose.animation.EnterExitTransitionKt.y(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.ExitTransition r5 = androidx.compose.animation.EnterExitTransitionKt.q(r14, r5, r13, r14)
            androidx.compose.animation.ExitTransition r5 = r7.c(r5)
            goto L_0x010d
        L_0x010c:
            r5 = r10
        L_0x010d:
            if (r11 == 0) goto L_0x0112
            java.lang.String r7 = "AnimatedVisibility"
            goto L_0x0113
        L_0x0112:
            r7 = r12
        L_0x0113:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0122
            r9 = -1
            java.lang.String r10 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)"
            r11 = -850656618(0xffffffffcd4c0296, float:-2.13920096E8)
            androidx.compose.runtime.ComposerKt.Y(r11, r3, r9, r10)
        L_0x0122:
            int r9 = androidx.compose.animation.core.MutableTransitionState.f2620d
            int r10 = r3 >> 3
            r11 = r10 & 14
            r9 = r9 | r11
            int r11 = r3 >> 12
            r11 = r11 & 112(0x70, float:1.57E-43)
            r9 = r9 | r11
            androidx.compose.animation.core.Transition r9 = androidx.compose.animation.core.TransitionKt.h(r2, r7, r1, r9, r0)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11 r0 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11.f2112z
            r11 = r3 & 896(0x380, float:1.256E-42)
            r11 = r11 | 48
            r12 = r3 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r12
            r3 = r3 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r11
            r16 = r3 | r10
            r10 = r0
            r11 = r4
            r12 = r6
            r13 = r5
            r14 = r29
            r15 = r1
            k(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0158
            androidx.compose.runtime.ComposerKt.X()
        L_0x0158:
            r3 = r4
            r4 = r6
            r6 = r7
            goto L_0x0163
        L_0x015c:
            r1.B()
            r3 = r5
            r4 = r7
            r5 = r10
            r6 = r12
        L_0x0163:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x017c
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12 r11 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
            r0 = r11
            r1 = r23
            r2 = r24
            r7 = r29
            r8 = r31
            r9 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.f(androidx.compose.foundation.layout.ColumnScope, androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(androidx.compose.foundation.layout.ColumnScope r23, boolean r24, androidx.compose.ui.Modifier r25, androidx.compose.animation.EnterTransition r26, androidx.compose.animation.ExitTransition r27, java.lang.String r28, kotlin.jvm.functions.Function3 r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r8 = r31
            r0 = 1766503102(0x694ab2be, float:1.5315444E25)
            r1 = r30
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r32 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r8 | 48
            r3 = r2
            r2 = r24
            goto L_0x002b
        L_0x0015:
            r2 = r8 & 48
            if (r2 != 0) goto L_0x0028
            r2 = r24
            boolean r3 = r1.d(r2)
            if (r3 == 0) goto L_0x0024
            r3 = 32
            goto L_0x0026
        L_0x0024:
            r3 = 16
        L_0x0026:
            r3 = r3 | r8
            goto L_0x002b
        L_0x0028:
            r2 = r24
            r3 = r8
        L_0x002b:
            r4 = r32 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0031:
            r5 = r25
            goto L_0x0046
        L_0x0034:
            r5 = r8 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0031
            r5 = r25
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r32 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x004c:
            r7 = r26
            goto L_0x0061
        L_0x004f:
            r7 = r8 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x004c
            r7 = r26
            boolean r9 = r1.W(r7)
            if (r9 == 0) goto L_0x005e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0060
        L_0x005e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0060:
            r3 = r3 | r9
        L_0x0061:
            r9 = r32 & 8
            if (r9 == 0) goto L_0x006a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0067:
            r10 = r27
            goto L_0x007c
        L_0x006a:
            r10 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0067
            r10 = r27
            boolean r11 = r1.W(r10)
            if (r11 == 0) goto L_0x0079
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x007b
        L_0x0079:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x007b:
            r3 = r3 | r11
        L_0x007c:
            r11 = r32 & 16
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x0086
            r3 = r3 | r12
        L_0x0083:
            r12 = r28
            goto L_0x0097
        L_0x0086:
            r12 = r12 & r8
            if (r12 != 0) goto L_0x0083
            r12 = r28
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0094
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0096
        L_0x0094:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x0096:
            r3 = r3 | r13
        L_0x0097:
            r13 = r32 & 32
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r13 == 0) goto L_0x00a1
            r3 = r3 | r14
            r15 = r29
            goto L_0x00b3
        L_0x00a1:
            r13 = r8 & r14
            r15 = r29
            if (r13 != 0) goto L_0x00b3
            boolean r13 = r1.l(r15)
            if (r13 == 0) goto L_0x00b0
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b2
        L_0x00b0:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00b2:
            r3 = r3 | r13
        L_0x00b3:
            r13 = 599185(0x92491, float:8.39637E-40)
            r13 = r13 & r3
            r14 = 599184(0x92490, float:8.39636E-40)
            r0 = 0
            if (r13 == r14) goto L_0x00bf
            r13 = 1
            goto L_0x00c0
        L_0x00bf:
            r13 = r0
        L_0x00c0:
            r14 = r3 & 1
            boolean r13 = r1.E(r13, r14)
            if (r13 == 0) goto L_0x0159
            if (r4 == 0) goto L_0x00cd
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00ce
        L_0x00cd:
            r4 = r5
        L_0x00ce:
            r5 = 0
            r13 = 3
            r14 = 0
            if (r6 == 0) goto L_0x00ec
            androidx.compose.animation.EnterTransition r6 = androidx.compose.animation.EnterExitTransitionKt.o(r14, r5, r13, r14)
            r21 = 15
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.animation.EnterTransition r7 = androidx.compose.animation.EnterExitTransitionKt.m(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.EnterTransition r6 = r6.c(r7)
            goto L_0x00ed
        L_0x00ec:
            r6 = r7
        L_0x00ed:
            if (r9 == 0) goto L_0x0108
            androidx.compose.animation.ExitTransition r5 = androidx.compose.animation.EnterExitTransitionKt.q(r14, r5, r13, r14)
            r21 = 15
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.animation.ExitTransition r7 = androidx.compose.animation.EnterExitTransitionKt.y(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.ExitTransition r5 = r5.c(r7)
            goto L_0x0109
        L_0x0108:
            r5 = r10
        L_0x0109:
            if (r11 == 0) goto L_0x010e
            java.lang.String r7 = "AnimatedVisibility"
            goto L_0x010f
        L_0x010e:
            r7 = r12
        L_0x010f:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x011e
            r9 = -1
            java.lang.String r10 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)"
            r11 = 1766503102(0x694ab2be, float:1.5315444E25)
            androidx.compose.runtime.ComposerKt.Y(r11, r3, r9, r10)
        L_0x011e:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r24)
            int r10 = r3 >> 3
            r11 = r10 & 14
            int r12 = r3 >> 12
            r12 = r12 & 112(0x70, float:1.57E-43)
            r11 = r11 | r12
            androidx.compose.animation.core.Transition r9 = androidx.compose.animation.core.TransitionKt.j(r9, r7, r1, r11, r0)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5 r0 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5.f2126z
            r11 = r3 & 896(0x380, float:1.256E-42)
            r11 = r11 | 48
            r12 = r3 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r12
            r3 = r3 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r11
            r16 = r3 | r10
            r10 = r0
            r11 = r4
            r12 = r6
            r13 = r5
            r14 = r29
            r15 = r1
            k(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0155
            androidx.compose.runtime.ComposerKt.X()
        L_0x0155:
            r3 = r4
            r4 = r6
            r6 = r7
            goto L_0x0160
        L_0x0159:
            r1.B()
            r3 = r5
            r4 = r7
            r5 = r10
            r6 = r12
        L_0x0160:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x0179
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6 r11 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
            r0 = r11
            r1 = r23
            r2 = r24
            r7 = r29
            r8 = r31
            r9 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.g(androidx.compose.foundation.layout.ColumnScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(androidx.compose.foundation.layout.RowScope r23, androidx.compose.animation.core.MutableTransitionState r24, androidx.compose.ui.Modifier r25, androidx.compose.animation.EnterTransition r26, androidx.compose.animation.ExitTransition r27, java.lang.String r28, kotlin.jvm.functions.Function3 r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r2 = r24
            r8 = r31
            r0 = 836509870(0x31dc20ae, float:6.406558E-9)
            r1 = r30
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r32 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r8 | 48
            goto L_0x002f
        L_0x0014:
            r3 = r8 & 48
            if (r3 != 0) goto L_0x002e
            r3 = r8 & 64
            if (r3 != 0) goto L_0x0021
            boolean r3 = r1.W(r2)
            goto L_0x0025
        L_0x0021:
            boolean r3 = r1.l(r2)
        L_0x0025:
            if (r3 == 0) goto L_0x002a
            r3 = 32
            goto L_0x002c
        L_0x002a:
            r3 = 16
        L_0x002c:
            r3 = r3 | r8
            goto L_0x002f
        L_0x002e:
            r3 = r8
        L_0x002f:
            r4 = r32 & 2
            if (r4 == 0) goto L_0x0038
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0035:
            r5 = r25
            goto L_0x004a
        L_0x0038:
            r5 = r8 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0035
            r5 = r25
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0047
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0049
        L_0x0047:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0049:
            r3 = r3 | r6
        L_0x004a:
            r6 = r32 & 4
            if (r6 == 0) goto L_0x0053
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0050:
            r7 = r26
            goto L_0x0065
        L_0x0053:
            r7 = r8 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0050
            r7 = r26
            boolean r9 = r1.W(r7)
            if (r9 == 0) goto L_0x0062
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0064
        L_0x0062:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0064:
            r3 = r3 | r9
        L_0x0065:
            r9 = r32 & 8
            if (r9 == 0) goto L_0x006e
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x006b:
            r10 = r27
            goto L_0x0080
        L_0x006e:
            r10 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x006b
            r10 = r27
            boolean r11 = r1.W(r10)
            if (r11 == 0) goto L_0x007d
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x007f
        L_0x007d:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x007f:
            r3 = r3 | r11
        L_0x0080:
            r11 = r32 & 16
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x008a
            r3 = r3 | r12
        L_0x0087:
            r12 = r28
            goto L_0x009b
        L_0x008a:
            r12 = r12 & r8
            if (r12 != 0) goto L_0x0087
            r12 = r28
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0098
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x009a
        L_0x0098:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x009a:
            r3 = r3 | r13
        L_0x009b:
            r13 = r32 & 32
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r13 == 0) goto L_0x00a5
            r3 = r3 | r14
            r15 = r29
            goto L_0x00b7
        L_0x00a5:
            r13 = r8 & r14
            r15 = r29
            if (r13 != 0) goto L_0x00b7
            boolean r13 = r1.l(r15)
            if (r13 == 0) goto L_0x00b4
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b6
        L_0x00b4:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00b6:
            r3 = r3 | r13
        L_0x00b7:
            r13 = 599185(0x92491, float:8.39637E-40)
            r13 = r13 & r3
            r14 = 599184(0x92490, float:8.39636E-40)
            r0 = 0
            if (r13 == r14) goto L_0x00c3
            r13 = 1
            goto L_0x00c4
        L_0x00c3:
            r13 = r0
        L_0x00c4:
            r14 = r3 & 1
            boolean r13 = r1.E(r13, r14)
            if (r13 == 0) goto L_0x015c
            if (r4 == 0) goto L_0x00d1
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00d2
        L_0x00d1:
            r4 = r5
        L_0x00d2:
            r5 = 0
            r13 = 3
            r14 = 0
            if (r6 == 0) goto L_0x00f0
            r21 = 15
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.animation.EnterTransition r6 = androidx.compose.animation.EnterExitTransitionKt.i(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.EnterTransition r7 = androidx.compose.animation.EnterExitTransitionKt.o(r14, r5, r13, r14)
            androidx.compose.animation.EnterTransition r6 = r6.c(r7)
            goto L_0x00f1
        L_0x00f0:
            r6 = r7
        L_0x00f1:
            if (r9 == 0) goto L_0x010c
            r21 = 15
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.animation.ExitTransition r7 = androidx.compose.animation.EnterExitTransitionKt.u(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.ExitTransition r5 = androidx.compose.animation.EnterExitTransitionKt.q(r14, r5, r13, r14)
            androidx.compose.animation.ExitTransition r5 = r7.c(r5)
            goto L_0x010d
        L_0x010c:
            r5 = r10
        L_0x010d:
            if (r11 == 0) goto L_0x0112
            java.lang.String r7 = "AnimatedVisibility"
            goto L_0x0113
        L_0x0112:
            r7 = r12
        L_0x0113:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0122
            r9 = -1
            java.lang.String r10 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)"
            r11 = 836509870(0x31dc20ae, float:6.406558E-9)
            androidx.compose.runtime.ComposerKt.Y(r11, r3, r9, r10)
        L_0x0122:
            int r9 = androidx.compose.animation.core.MutableTransitionState.f2620d
            int r10 = r3 >> 3
            r11 = r10 & 14
            r9 = r9 | r11
            int r11 = r3 >> 12
            r11 = r11 & 112(0x70, float:1.57E-43)
            r9 = r9 | r11
            androidx.compose.animation.core.Transition r9 = androidx.compose.animation.core.TransitionKt.h(r2, r7, r1, r9, r0)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9 r0 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9.f2134z
            r11 = r3 & 896(0x380, float:1.256E-42)
            r11 = r11 | 48
            r12 = r3 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r12
            r3 = r3 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r11
            r16 = r3 | r10
            r10 = r0
            r11 = r4
            r12 = r6
            r13 = r5
            r14 = r29
            r15 = r1
            k(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0158
            androidx.compose.runtime.ComposerKt.X()
        L_0x0158:
            r3 = r4
            r4 = r6
            r6 = r7
            goto L_0x0163
        L_0x015c:
            r1.B()
            r3 = r5
            r4 = r7
            r5 = r10
            r6 = r12
        L_0x0163:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x017c
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10 r11 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
            r0 = r11
            r1 = r23
            r2 = r24
            r7 = r29
            r8 = r31
            r9 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.h(androidx.compose.foundation.layout.RowScope, androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(androidx.compose.foundation.layout.RowScope r23, boolean r24, androidx.compose.ui.Modifier r25, androidx.compose.animation.EnterTransition r26, androidx.compose.animation.ExitTransition r27, java.lang.String r28, kotlin.jvm.functions.Function3 r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r8 = r31
            r0 = -1741346906(0xffffffff983527a6, float:-2.341372E-24)
            r1 = r30
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r32 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r8 | 48
            r3 = r2
            r2 = r24
            goto L_0x002b
        L_0x0015:
            r2 = r8 & 48
            if (r2 != 0) goto L_0x0028
            r2 = r24
            boolean r3 = r1.d(r2)
            if (r3 == 0) goto L_0x0024
            r3 = 32
            goto L_0x0026
        L_0x0024:
            r3 = 16
        L_0x0026:
            r3 = r3 | r8
            goto L_0x002b
        L_0x0028:
            r2 = r24
            r3 = r8
        L_0x002b:
            r4 = r32 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0031:
            r5 = r25
            goto L_0x0046
        L_0x0034:
            r5 = r8 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0031
            r5 = r25
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r32 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x004c:
            r7 = r26
            goto L_0x0061
        L_0x004f:
            r7 = r8 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x004c
            r7 = r26
            boolean r9 = r1.W(r7)
            if (r9 == 0) goto L_0x005e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0060
        L_0x005e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0060:
            r3 = r3 | r9
        L_0x0061:
            r9 = r32 & 8
            if (r9 == 0) goto L_0x006a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0067:
            r10 = r27
            goto L_0x007c
        L_0x006a:
            r10 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0067
            r10 = r27
            boolean r11 = r1.W(r10)
            if (r11 == 0) goto L_0x0079
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x007b
        L_0x0079:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x007b:
            r3 = r3 | r11
        L_0x007c:
            r11 = r32 & 16
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x0086
            r3 = r3 | r12
        L_0x0083:
            r12 = r28
            goto L_0x0097
        L_0x0086:
            r12 = r12 & r8
            if (r12 != 0) goto L_0x0083
            r12 = r28
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0094
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0096
        L_0x0094:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x0096:
            r3 = r3 | r13
        L_0x0097:
            r13 = r32 & 32
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r13 == 0) goto L_0x00a1
            r3 = r3 | r14
            r15 = r29
            goto L_0x00b3
        L_0x00a1:
            r13 = r8 & r14
            r15 = r29
            if (r13 != 0) goto L_0x00b3
            boolean r13 = r1.l(r15)
            if (r13 == 0) goto L_0x00b0
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b2
        L_0x00b0:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00b2:
            r3 = r3 | r13
        L_0x00b3:
            r13 = 599185(0x92491, float:8.39637E-40)
            r13 = r13 & r3
            r14 = 599184(0x92490, float:8.39636E-40)
            r0 = 0
            if (r13 == r14) goto L_0x00bf
            r13 = 1
            goto L_0x00c0
        L_0x00bf:
            r13 = r0
        L_0x00c0:
            r14 = r3 & 1
            boolean r13 = r1.E(r13, r14)
            if (r13 == 0) goto L_0x0159
            if (r4 == 0) goto L_0x00cd
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00ce
        L_0x00cd:
            r4 = r5
        L_0x00ce:
            r5 = 0
            r13 = 3
            r14 = 0
            if (r6 == 0) goto L_0x00ec
            androidx.compose.animation.EnterTransition r6 = androidx.compose.animation.EnterExitTransitionKt.o(r14, r5, r13, r14)
            r21 = 15
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.animation.EnterTransition r7 = androidx.compose.animation.EnterExitTransitionKt.i(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.EnterTransition r6 = r6.c(r7)
            goto L_0x00ed
        L_0x00ec:
            r6 = r7
        L_0x00ed:
            if (r9 == 0) goto L_0x0108
            androidx.compose.animation.ExitTransition r5 = androidx.compose.animation.EnterExitTransitionKt.q(r14, r5, r13, r14)
            r21 = 15
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.animation.ExitTransition r7 = androidx.compose.animation.EnterExitTransitionKt.u(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.ExitTransition r5 = r5.c(r7)
            goto L_0x0109
        L_0x0108:
            r5 = r10
        L_0x0109:
            if (r11 == 0) goto L_0x010e
            java.lang.String r7 = "AnimatedVisibility"
            goto L_0x010f
        L_0x010e:
            r7 = r12
        L_0x010f:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x011e
            r9 = -1
            java.lang.String r10 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)"
            r11 = -1741346906(0xffffffff983527a6, float:-2.341372E-24)
            androidx.compose.runtime.ComposerKt.Y(r11, r3, r9, r10)
        L_0x011e:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r24)
            int r10 = r3 >> 3
            r11 = r10 & 14
            int r12 = r3 >> 12
            r12 = r12 & 112(0x70, float:1.57E-43)
            r11 = r11 | r12
            androidx.compose.animation.core.Transition r9 = androidx.compose.animation.core.TransitionKt.j(r9, r7, r1, r11, r0)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3 r0 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3.f2122z
            r11 = r3 & 896(0x380, float:1.256E-42)
            r11 = r11 | 48
            r12 = r3 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r12
            r3 = r3 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r11
            r16 = r3 | r10
            r10 = r0
            r11 = r4
            r12 = r6
            r13 = r5
            r14 = r29
            r15 = r1
            k(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0155
            androidx.compose.runtime.ComposerKt.X()
        L_0x0155:
            r3 = r4
            r4 = r6
            r6 = r7
            goto L_0x0160
        L_0x0159:
            r1.B()
            r3 = r5
            r4 = r7
            r5 = r10
            r6 = r12
        L_0x0160:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x0179
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4 r11 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
            r0 = r11
            r1 = r23
            r2 = r24
            r7 = r29
            r8 = r31
            r9 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.i(androidx.compose.foundation.layout.RowScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(boolean r22, androidx.compose.ui.Modifier r23, androidx.compose.animation.EnterTransition r24, androidx.compose.animation.ExitTransition r25, java.lang.String r26, kotlin.jvm.functions.Function3 r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            r7 = r29
            r0 = 2088733774(0x7c7f8c4e, float:5.3075257E36)
            r1 = r28
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r30 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r7 | 6
            r3 = r2
            r2 = r22
            goto L_0x0029
        L_0x0015:
            r2 = r7 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r22
            boolean r3 = r1.d(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r7
            goto L_0x0029
        L_0x0026:
            r2 = r22
            r3 = r7
        L_0x0029:
            r4 = r30 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r23
            goto L_0x0044
        L_0x0032:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r23
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r30 & 4
            if (r6 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r8 = r24
            goto L_0x005f
        L_0x004d:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r24
            boolean r9 = r1.W(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
        L_0x005f:
            r9 = r30 & 8
            if (r9 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r10 = r25
            goto L_0x007a
        L_0x0068:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0065
            r10 = r25
            boolean r11 = r1.W(r10)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
        L_0x007a:
            r11 = r30 & 16
            if (r11 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r12 = r26
            goto L_0x0095
        L_0x0083:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r26
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r13
        L_0x0095:
            r13 = r30 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009f
            r3 = r3 | r14
            r15 = r27
            goto L_0x00b1
        L_0x009f:
            r13 = r7 & r14
            r15 = r27
            if (r13 != 0) goto L_0x00b1
            boolean r13 = r1.l(r15)
            if (r13 == 0) goto L_0x00ae
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r3 = r3 | r13
        L_0x00b1:
            r13 = 74899(0x12493, float:1.04956E-40)
            r13 = r13 & r3
            r14 = 74898(0x12492, float:1.04954E-40)
            r0 = 0
            if (r13 == r14) goto L_0x00bd
            r13 = 1
            goto L_0x00be
        L_0x00bd:
            r13 = r0
        L_0x00be:
            r14 = r3 & 1
            boolean r13 = r1.E(r13, r14)
            if (r13 == 0) goto L_0x0158
            if (r4 == 0) goto L_0x00cb
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00cc
        L_0x00cb:
            r4 = r5
        L_0x00cc:
            r5 = 0
            r13 = 3
            r14 = 0
            if (r6 == 0) goto L_0x00ea
            androidx.compose.animation.EnterTransition r6 = androidx.compose.animation.EnterExitTransitionKt.o(r14, r5, r13, r14)
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.EnterTransition r8 = androidx.compose.animation.EnterExitTransitionKt.k(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.EnterTransition r6 = r6.c(r8)
            goto L_0x00eb
        L_0x00ea:
            r6 = r8
        L_0x00eb:
            if (r9 == 0) goto L_0x0106
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.ExitTransition r8 = androidx.compose.animation.EnterExitTransitionKt.w(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.ExitTransition r5 = androidx.compose.animation.EnterExitTransitionKt.q(r14, r5, r13, r14)
            androidx.compose.animation.ExitTransition r5 = r8.c(r5)
            goto L_0x0107
        L_0x0106:
            r5 = r10
        L_0x0107:
            if (r11 == 0) goto L_0x010d
            java.lang.String r8 = "AnimatedVisibility"
            r14 = r8
            goto L_0x010e
        L_0x010d:
            r14 = r12
        L_0x010e:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x011d
            r8 = -1
            java.lang.String r9 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)"
            r10 = 2088733774(0x7c7f8c4e, float:5.3075257E36)
            androidx.compose.runtime.ComposerKt.Y(r10, r3, r8, r9)
        L_0x011d:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r22)
            r9 = r3 & 14
            int r10 = r3 >> 9
            r10 = r10 & 112(0x70, float:1.57E-43)
            r9 = r9 | r10
            androidx.compose.animation.core.Transition r8 = androidx.compose.animation.core.TransitionKt.j(r8, r14, r1, r9, r0)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1 r9 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1.f2108z
            int r0 = r3 << 3
            r10 = r0 & 896(0x380, float:1.256E-42)
            r10 = r10 | 48
            r11 = r0 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r11
            r0 = r0 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r10
            r0 = r0 | r3
            r10 = r4
            r11 = r6
            r12 = r5
            r13 = r27
            r3 = r14
            r14 = r1
            r15 = r0
            k(r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0154
            androidx.compose.runtime.ComposerKt.X()
        L_0x0154:
            r10 = r5
            r5 = r3
            r3 = r6
            goto L_0x015e
        L_0x0158:
            r1.B()
            r4 = r5
            r3 = r8
            r5 = r12
        L_0x015e:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.x()
            if (r9 == 0) goto L_0x0177
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2 r11 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
            r0 = r11
            r1 = r22
            r2 = r4
            r4 = r10
            r6 = r27
            r7 = r29
            r8 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r11)
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.j(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void k(Transition transition, Function1 function1, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Function3 function3, Composer composer, int i2) {
        int i3;
        Transition transition2 = transition;
        Function1 function12 = function1;
        Modifier modifier2 = modifier;
        int i4 = i2;
        Composer q2 = composer.q(429978603);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(transition2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function12) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.W(modifier2) ? 256 : 128;
        }
        EnterTransition enterTransition2 = enterTransition;
        if ((i4 & 3072) == 0) {
            i3 |= q2.W(enterTransition2) ? 2048 : 1024;
        }
        ExitTransition exitTransition2 = exitTransition;
        if ((i4 & 24576) == 0) {
            i3 |= q2.W(exitTransition2) ? 16384 : 8192;
        }
        Function3 function32 = function3;
        if ((i4 & 196608) == 0) {
            i3 |= q2.l(function32) ? 131072 : 65536;
        }
        boolean z2 = false;
        if (q2.E((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(429978603, i3, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:677)");
            }
            int i5 = i3 & 112;
            boolean z3 = i5 == 32;
            int i6 = i3 & 14;
            if (i6 == 4) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object g2 = q2.g();
            if (z4 || g2 == Composer.f14567a.a()) {
                g2 = new AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1(function12, transition2);
                q2.N(g2);
            }
            a(transition, function1, LayoutModifierKt.a(modifier2, (Function3) g2), enterTransition, exitTransition, AnimatedVisibilityKt$AnimatedVisibilityImpl$2.f2138z, (OnLookaheadMeasured) null, function3, q2, i5 | 196608 | i6 | (i3 & 7168) | (57344 & i3) | ((i3 << 6) & 29360128), 64);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new AnimatedVisibilityKt$AnimatedVisibilityImpl$3(transition, function1, modifier, enterTransition, exitTransition, function3, i2));
        }
    }

    public static final boolean n(Transition transition) {
        Object i2 = transition.i();
        EnterExitState enterExitState = EnterExitState.PostExit;
        return i2 == enterExitState && transition.q() == enterExitState;
    }

    public static final EnterExitState o(Transition transition, Function1 function1, Object obj, Composer composer, int i2) {
        EnterExitState enterExitState;
        if (ComposerKt.P()) {
            ComposerKt.Y(361571134, i2, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:836)");
        }
        composer.r(-902032957, transition);
        if (transition.v()) {
            composer.X(2101770115);
            composer.M();
            enterExitState = ((Boolean) function1.invoke(obj)).booleanValue() ? EnterExitState.Visible : ((Boolean) function1.invoke(transition.i())).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        } else {
            composer.X(2102044248);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
                composer.N(g2);
            }
            MutableState mutableState = (MutableState) g2;
            if (((Boolean) function1.invoke(transition.i())).booleanValue()) {
                mutableState.setValue(Boolean.TRUE);
            }
            enterExitState = ((Boolean) function1.invoke(obj)).booleanValue() ? EnterExitState.Visible : ((Boolean) mutableState.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            composer.M();
        }
        composer.Q();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return enterExitState;
    }
}
