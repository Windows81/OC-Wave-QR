package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AnimatedContentKt {

    /* renamed from: a  reason: collision with root package name */
    public static final long f2019a;

    static {
        long j2 = (long) Integer.MIN_VALUE;
        f2019a = IntSize.c((j2 & 4294967295L) | (j2 << 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: androidx.compose.animation.AnimatedContentTransitionScopeImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: androidx.compose.runtime.snapshots.SnapshotStateList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: androidx.collection.MutableScatterMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.animation.core.Transition r20, androidx.compose.ui.Modifier r21, kotlin.jvm.functions.Function1 r22, androidx.compose.ui.Alignment r23, kotlin.jvm.functions.Function1 r24, kotlin.jvm.functions.Function4 r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r7 = r20
            r8 = r27
            r0 = -114689412(0xfffffffff929fa7c, float:-5.516116E34)
            r1 = r26
            androidx.compose.runtime.Composer r9 = r1.q(r0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r28 & r1
            if (r1 == 0) goto L_0x0016
            r1 = r8 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r8 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r9.W(r7)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r8
            goto L_0x0026
        L_0x0025:
            r1 = r8
        L_0x0026:
            r3 = r28 & 1
            if (r3 == 0) goto L_0x002f
            r1 = r1 | 48
        L_0x002c:
            r4 = r21
            goto L_0x0041
        L_0x002f:
            r4 = r8 & 48
            if (r4 != 0) goto L_0x002c
            r4 = r21
            boolean r5 = r9.W(r4)
            if (r5 == 0) goto L_0x003e
            r5 = 32
            goto L_0x0040
        L_0x003e:
            r5 = 16
        L_0x0040:
            r1 = r1 | r5
        L_0x0041:
            r5 = r28 & 2
            if (r5 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r6 = r22
            goto L_0x005c
        L_0x004a:
            r6 = r8 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0047
            r6 = r22
            boolean r10 = r9.l(r6)
            if (r10 == 0) goto L_0x0059
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r1 = r1 | r10
        L_0x005c:
            r10 = r28 & 4
            if (r10 == 0) goto L_0x0065
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r11 = r23
            goto L_0x0077
        L_0x0065:
            r11 = r8 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0062
            r11 = r23
            boolean r12 = r9.W(r11)
            if (r12 == 0) goto L_0x0074
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r1 = r1 | r12
        L_0x0077:
            r12 = r28 & 8
            if (r12 == 0) goto L_0x0080
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r13 = r24
            goto L_0x0092
        L_0x0080:
            r13 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x007d
            r13 = r24
            boolean r14 = r9.l(r13)
            if (r14 == 0) goto L_0x008f
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r1 = r1 | r14
        L_0x0092:
            r14 = r28 & 16
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x009c
            r1 = r1 | r15
        L_0x0099:
            r14 = r25
            goto L_0x00ae
        L_0x009c:
            r14 = r8 & r15
            if (r14 != 0) goto L_0x0099
            r14 = r25
            boolean r15 = r9.l(r14)
            if (r15 == 0) goto L_0x00ab
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00ab:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r1 = r1 | r15
        L_0x00ae:
            r15 = 74899(0x12493, float:1.04956E-40)
            r15 = r15 & r1
            r2 = 74898(0x12492, float:1.04954E-40)
            r0 = 1
            if (r15 == r2) goto L_0x00ba
            r2 = r0
            goto L_0x00bb
        L_0x00ba:
            r2 = 0
        L_0x00bb:
            r15 = r1 & 1
            boolean r2 = r9.E(r2, r15)
            if (r2 == 0) goto L_0x0386
            if (r3 == 0) goto L_0x00c9
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r15 = r2
            goto L_0x00ca
        L_0x00c9:
            r15 = r4
        L_0x00ca:
            if (r5 == 0) goto L_0x00cf
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$4 r2 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$4.f2028z
            r6 = r2
        L_0x00cf:
            if (r10 == 0) goto L_0x00d8
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r2 = r2.o()
            r11 = r2
        L_0x00d8:
            if (r12 == 0) goto L_0x00dd
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$5 r2 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$5.f2029z
            r13 = r2
        L_0x00dd:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            r3 = -1
            if (r2 == 0) goto L_0x00ec
            java.lang.String r2 = "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:772)"
            r4 = -114689412(0xfffffffff929fa7c, float:-5.516116E34)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r3, r2)
        L_0x00ec:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r2 = r9.C(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = (androidx.compose.ui.unit.LayoutDirection) r2
            r1 = r1 & 14
            r4 = 4
            if (r1 != r4) goto L_0x00fd
            r4 = r0
            goto L_0x00fe
        L_0x00fd:
            r4 = 0
        L_0x00fe:
            java.lang.Object r5 = r9.g()
            if (r4 != 0) goto L_0x010c
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x0114
        L_0x010c:
            androidx.compose.animation.AnimatedContentTransitionScopeImpl r5 = new androidx.compose.animation.AnimatedContentTransitionScopeImpl
            r5.<init>(r7, r11, r2)
            r9.N(r5)
        L_0x0114:
            r10 = r5
            androidx.compose.animation.AnimatedContentTransitionScopeImpl r10 = (androidx.compose.animation.AnimatedContentTransitionScopeImpl) r10
            r4 = 4
            if (r1 != r4) goto L_0x011c
            r4 = r0
            goto L_0x011d
        L_0x011c:
            r4 = 0
        L_0x011d:
            java.lang.Object r5 = r9.g()
            if (r4 != 0) goto L_0x012b
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x013a
        L_0x012b:
            java.lang.Object r4 = r20.i()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            androidx.compose.runtime.snapshots.SnapshotStateList r5 = androidx.compose.runtime.SnapshotStateKt.g(r4)
            r9.N(r5)
        L_0x013a:
            r12 = r5
            androidx.compose.runtime.snapshots.SnapshotStateList r12 = (androidx.compose.runtime.snapshots.SnapshotStateList) r12
            r4 = 4
            if (r1 != r4) goto L_0x0142
            r1 = r0
            goto L_0x0143
        L_0x0142:
            r1 = 0
        L_0x0143:
            java.lang.Object r4 = r9.g()
            if (r1 != 0) goto L_0x0151
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto L_0x0158
        L_0x0151:
            androidx.collection.MutableScatterMap r4 = androidx.collection.ScatterMapKt.c()
            r9.N(r4)
        L_0x0158:
            r5 = r4
            androidx.collection.MutableScatterMap r5 = (androidx.collection.MutableScatterMap) r5
            java.lang.Object r1 = r20.i()
            boolean r1 = r12.contains(r1)
            if (r1 != 0) goto L_0x016f
            r12.clear()
            java.lang.Object r1 = r20.i()
            r12.add(r1)
        L_0x016f:
            java.lang.Object r1 = r20.i()
            java.lang.Object r4 = r20.q()
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r4)
            if (r1 == 0) goto L_0x01b5
            int r1 = r12.size()
            if (r1 != r0) goto L_0x0192
            r1 = 0
            java.lang.Object r4 = r12.get(r1)
            java.lang.Object r1 = r20.i()
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r4, r1)
            if (r1 != 0) goto L_0x019c
        L_0x0192:
            r12.clear()
            java.lang.Object r1 = r20.i()
            r12.add(r1)
        L_0x019c:
            int r1 = r5.g()
            if (r1 != r0) goto L_0x01ac
            java.lang.Object r1 = r20.i()
            boolean r1 = r5.c(r1)
            if (r1 == 0) goto L_0x01af
        L_0x01ac:
            r5.k()
        L_0x01af:
            r10.q(r11)
            r10.r(r2)
        L_0x01b5:
            java.lang.Object r1 = r20.i()
            java.lang.Object r2 = r20.q()
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r1 != 0) goto L_0x0205
            java.lang.Object r1 = r20.q()
            boolean r1 = r12.contains(r1)
            if (r1 != 0) goto L_0x0205
            java.util.Iterator r1 = r12.iterator()
            r2 = 0
        L_0x01d2:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01f3
            java.lang.Object r4 = r1.next()
            java.lang.Object r4 = r13.invoke(r4)
            java.lang.Object r0 = r20.q()
            java.lang.Object r0 = r13.invoke(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r4, r0)
            if (r0 == 0) goto L_0x01ef
            goto L_0x01f4
        L_0x01ef:
            int r2 = r2 + 1
            r0 = 1
            goto L_0x01d2
        L_0x01f3:
            r2 = r3
        L_0x01f4:
            if (r2 != r3) goto L_0x01fe
            java.lang.Object r0 = r20.q()
            r12.add(r0)
            goto L_0x0205
        L_0x01fe:
            java.lang.Object r0 = r20.q()
            r12.set(r2, r0)
        L_0x0205:
            java.lang.Object r0 = r20.q()
            boolean r0 = r5.c(r0)
            if (r0 == 0) goto L_0x0227
            java.lang.Object r0 = r20.i()
            boolean r0 = r5.c(r0)
            if (r0 != 0) goto L_0x021a
            goto L_0x0227
        L_0x021a:
            r0 = 919489879(0x36ce4d57, float:6.148282E-6)
            r9.X(r0)
            r9.M()
            r4 = r5
            r19 = r6
            goto L_0x0276
        L_0x0227:
            r0 = 916905750(0x36a6df16, float:4.973156E-6)
            r9.X(r0)
            r5.k()
            int r4 = r12.size()
            r3 = 0
        L_0x0235:
            if (r3 >= r4) goto L_0x0270
            java.lang.Object r2 = r12.get(r3)
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1 r1 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
            r7 = 1
            r0 = r1
            r8 = r1
            r1 = r20
            r21 = r2
            r16 = r3
            r3 = r6
            r17 = r4
            r4 = r10
            r18 = r5
            r5 = r12
            r19 = r6
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 54
            r1 = 885640742(0x34c9ce26, float:3.758916E-7)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r7, r8, r9, r0)
            r1 = r21
            r4 = r18
            r4.x(r1, r0)
            int r3 = r16 + 1
            r7 = r20
            r8 = r27
            r5 = r4
            r4 = r17
            r6 = r19
            goto L_0x0235
        L_0x0270:
            r4 = r5
            r19 = r6
            r9.M()
        L_0x0276:
            androidx.compose.animation.core.Transition$Segment r0 = r20.o()
            boolean r1 = r9.W(r10)
            boolean r0 = r9.W(r0)
            r0 = r0 | r1
            java.lang.Object r1 = r9.g()
            if (r0 != 0) goto L_0x0291
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0294
        L_0x0291:
            r2 = r19
            goto L_0x0297
        L_0x0294:
            r2 = r19
            goto L_0x02a1
        L_0x0297:
            java.lang.Object r0 = r2.invoke(r10)
            r1 = r0
            androidx.compose.animation.ContentTransform r1 = (androidx.compose.animation.ContentTransform) r1
            r9.N(r1)
        L_0x02a1:
            androidx.compose.animation.ContentTransform r1 = (androidx.compose.animation.ContentTransform) r1
            r0 = 0
            androidx.compose.ui.Modifier r1 = r10.h(r1, r9, r0)
            androidx.compose.ui.Modifier r0 = r15.o0(r1)
            java.lang.Object r1 = r9.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r1 != r3) goto L_0x02c0
            androidx.compose.animation.AnimatedContentMeasurePolicy r1 = new androidx.compose.animation.AnimatedContentMeasurePolicy
            r1.<init>(r10)
            r9.N(r1)
        L_0x02c0:
            androidx.compose.animation.AnimatedContentMeasurePolicy r1 = (androidx.compose.animation.AnimatedContentMeasurePolicy) r1
            r3 = 0
            int r5 = androidx.compose.runtime.ComposablesKt.a(r9, r3)
            androidx.compose.runtime.CompositionLocalMap r3 = r9.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r9, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r7 = r6.a()
            androidx.compose.runtime.Applier r8 = r9.v()
            if (r8 != 0) goto L_0x02de
            androidx.compose.runtime.ComposablesKt.d()
        L_0x02de:
            r9.s()
            boolean r8 = r9.n()
            if (r8 == 0) goto L_0x02eb
            r9.y(r7)
            goto L_0x02ee
        L_0x02eb:
            r9.K()
        L_0x02ee:
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.b(r9)
            kotlin.jvm.functions.Function2 r8 = r6.c()
            androidx.compose.runtime.Updater.g(r7, r1, r8)
            kotlin.jvm.functions.Function2 r1 = r6.e()
            androidx.compose.runtime.Updater.g(r7, r3, r1)
            kotlin.jvm.functions.Function2 r1 = r6.b()
            boolean r3 = r7.n()
            if (r3 != 0) goto L_0x0318
            java.lang.Object r3 = r7.g()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r8)
            if (r3 != 0) goto L_0x0326
        L_0x0318:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r7.N(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r7.A(r3, r1)
        L_0x0326:
            kotlin.jvm.functions.Function2 r1 = r6.d()
            androidx.compose.runtime.Updater.g(r7, r0, r1)
            r0 = -1490874326(0xffffffffa723102a, float:-2.2629557E-15)
            r9.X(r0)
            int r0 = r12.size()
            r1 = 0
        L_0x0338:
            if (r1 >= r0) goto L_0x0372
            java.lang.Object r3 = r12.get(r1)
            r5 = 1908442329(0x71c084d9, float:1.9066152E30)
            java.lang.Object r6 = r13.invoke(r3)
            r9.r(r5, r6)
            java.lang.Object r3 = r4.e(r3)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            if (r3 != 0) goto L_0x035b
            r3 = -967793488(0xffffffffc650a4b0, float:-13353.172)
            r9.X(r3)
            r9.M()
            r5 = 0
            goto L_0x036c
        L_0x035b:
            r5 = 1908443505(0x71c08971, float:1.9067929E30)
            r9.X(r5)
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.m(r9, r6)
            r9.M()
        L_0x036c:
            r9.Q()
            int r1 = r1 + 1
            goto L_0x0338
        L_0x0372:
            r9.M()
            r9.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0381
            androidx.compose.runtime.ComposerKt.X()
        L_0x0381:
            r3 = r2
            r4 = r11
            r5 = r13
            r2 = r15
            goto L_0x038d
        L_0x0386:
            r9.B()
            r2 = r4
            r3 = r6
            r4 = r11
            r5 = r13
        L_0x038d:
            androidx.compose.runtime.ScopeUpdateScope r9 = r9.x()
            if (r9 == 0) goto L_0x03a4
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$9 r10 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
            r0 = r10
            r1 = r20
            r6 = r25
            r7 = r27
            r8 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x03a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.a(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.Object r19, androidx.compose.ui.Modifier r20, kotlin.jvm.functions.Function1 r21, androidx.compose.ui.Alignment r22, java.lang.String r23, kotlin.jvm.functions.Function1 r24, kotlin.jvm.functions.Function4 r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r1 = r19
            r8 = r27
            r0 = 2132720749(0x7f1ebc6d, float:2.1099639E38)
            r2 = r26
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r28 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r8 | 6
            goto L_0x002d
        L_0x0014:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x002c
            r3 = r8 & 8
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
            r3 = r3 | r8
            goto L_0x002d
        L_0x002c:
            r3 = r8
        L_0x002d:
            r4 = r28 & 2
            if (r4 == 0) goto L_0x0036
            r3 = r3 | 48
        L_0x0033:
            r5 = r20
            goto L_0x0048
        L_0x0036:
            r5 = r8 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r20
            boolean r6 = r2.W(r5)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r3 = r3 | r6
        L_0x0048:
            r6 = r28 & 4
            if (r6 == 0) goto L_0x0051
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r7 = r21
            goto L_0x0063
        L_0x0051:
            r7 = r8 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004e
            r7 = r21
            boolean r9 = r2.l(r7)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r9
        L_0x0063:
            r9 = r28 & 8
            if (r9 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r10 = r22
            goto L_0x007e
        L_0x006c:
            r10 = r8 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0069
            r10 = r22
            boolean r11 = r2.W(r10)
            if (r11 == 0) goto L_0x007b
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r11
        L_0x007e:
            r11 = r28 & 16
            if (r11 == 0) goto L_0x0087
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r12 = r23
            goto L_0x0099
        L_0x0087:
            r12 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0084
            r12 = r23
            boolean r13 = r2.W(r12)
            if (r13 == 0) goto L_0x0096
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r3 = r3 | r13
        L_0x0099:
            r13 = r28 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a3
            r3 = r3 | r14
        L_0x00a0:
            r14 = r24
            goto L_0x00b4
        L_0x00a3:
            r14 = r14 & r8
            if (r14 != 0) goto L_0x00a0
            r14 = r24
            boolean r15 = r2.l(r14)
            if (r15 == 0) goto L_0x00b1
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r3 = r3 | r15
        L_0x00b4:
            r15 = r28 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00bf
            r3 = r3 | r16
        L_0x00bc:
            r15 = r25
            goto L_0x00d2
        L_0x00bf:
            r15 = r8 & r16
            if (r15 != 0) goto L_0x00bc
            r15 = r25
            boolean r16 = r2.l(r15)
            if (r16 == 0) goto L_0x00ce
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00ce:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d0:
            r3 = r3 | r16
        L_0x00d2:
            r16 = 599187(0x92493, float:8.3964E-40)
            r0 = r3 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            r7 = 0
            if (r0 == r5) goto L_0x00df
            r0 = 1
            goto L_0x00e0
        L_0x00df:
            r0 = r7
        L_0x00e0:
            r5 = r3 & 1
            boolean r0 = r2.E(r0, r5)
            if (r0 == 0) goto L_0x0153
            if (r4 == 0) goto L_0x00ed
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00ef
        L_0x00ed:
            r0 = r20
        L_0x00ef:
            if (r6 == 0) goto L_0x00f4
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$1 r4 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$1.f2023z
            goto L_0x00f6
        L_0x00f4:
            r4 = r21
        L_0x00f6:
            if (r9 == 0) goto L_0x00ff
            androidx.compose.ui.Alignment$Companion r5 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r5 = r5.o()
            goto L_0x0100
        L_0x00ff:
            r5 = r10
        L_0x0100:
            if (r11 == 0) goto L_0x0105
            java.lang.String r6 = "AnimatedContent"
            goto L_0x0106
        L_0x0105:
            r6 = r12
        L_0x0106:
            if (r13 == 0) goto L_0x010d
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$2 r9 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$2.f2024z
            r18 = r9
            goto L_0x010f
        L_0x010d:
            r18 = r14
        L_0x010f:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x011e
            r9 = -1
            java.lang.String r10 = "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)"
            r11 = 2132720749(0x7f1ebc6d, float:2.1099639E38)
            androidx.compose.runtime.ComposerKt.Y(r11, r3, r9, r10)
        L_0x011e:
            r9 = r3 & 14
            int r10 = r3 >> 9
            r10 = r10 & 112(0x70, float:1.57E-43)
            r9 = r9 | r10
            androidx.compose.animation.core.Transition r9 = androidx.compose.animation.core.TransitionKt.j(r1, r6, r2, r9, r7)
            r7 = r3 & 8176(0x1ff0, float:1.1457E-41)
            int r3 = r3 >> 3
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r3
            r7 = r7 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r10
            r16 = r7 | r3
            r17 = 0
            r10 = r0
            r11 = r4
            r12 = r5
            r13 = r18
            r14 = r25
            r15 = r2
            a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x014d
            androidx.compose.runtime.ComposerKt.X()
        L_0x014d:
            r3 = r0
            r10 = r5
            r5 = r6
            r6 = r18
            goto L_0x015c
        L_0x0153:
            r2.B()
            r3 = r20
            r4 = r21
            r5 = r12
            r6 = r14
        L_0x015c:
            androidx.compose.runtime.ScopeUpdateScope r11 = r2.x()
            if (r11 == 0) goto L_0x0176
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$3 r12 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
            r0 = r12
            r1 = r19
            r2 = r3
            r3 = r4
            r4 = r10
            r7 = r25
            r8 = r27
            r9 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.a(r12)
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.b(java.lang.Object, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final SizeTransform c(boolean z2, Function2 function2) {
        return new SizeTransformImpl(z2, function2);
    }

    public static /* synthetic */ SizeTransform d(boolean z2, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            function2 = AnimatedContentKt$SizeTransform$1.f2047z;
        }
        return c(z2, function2);
    }

    public static final ContentTransform f(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, (SizeTransform) null, 12, (DefaultConstructorMarker) null);
    }
}
