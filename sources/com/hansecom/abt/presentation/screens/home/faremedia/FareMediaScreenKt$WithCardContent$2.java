package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class FareMediaScreenKt$WithCardContent$2 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PagerState f35968A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f35969B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function1 H;
    public final /* synthetic */ Function0 I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMedia.State f35970z;

    public FareMediaScreenKt$WithCardContent$2(FareMedia.State state, PagerState pagerState, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function0 function0, Function1 function16, Function0 function02) {
        this.f35970z = state;
        this.f35968A = pagerState;
        this.f35969B = function1;
        this.C = function12;
        this.D = function13;
        this.E = function14;
        this.F = function15;
        this.G = function0;
        this.H = function16;
        this.I = function02;
    }

    public static final Unit f(CoroutineScope coroutineScope, PagerState pagerState) {
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new FareMediaScreenKt$WithCardContent$2$1$2$1$1(pagerState, (Continuation) null), 3, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit g(CoroutineScope coroutineScope, PagerState pagerState) {
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new FareMediaScreenKt$WithCardContent$2$1$3$1$1(pagerState, (Continuation) null), 3, (Object) null);
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        e((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.foundation.layout.PaddingValues r38, androidx.compose.runtime.Composer r39, int r40) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            r15 = r39
            java.lang.String r2 = "it"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            r13 = 6
            r2 = r40 & 6
            r9 = 2
            if (r2 != 0) goto L_0x001d
            boolean r2 = r15.W(r1)
            if (r2 == 0) goto L_0x0019
            r2 = 4
            goto L_0x001a
        L_0x0019:
            r2 = r9
        L_0x001a:
            r2 = r40 | r2
            goto L_0x001f
        L_0x001d:
            r2 = r40
        L_0x001f:
            r3 = r2 & 19
            r4 = 18
            if (r3 != r4) goto L_0x0031
            boolean r3 = r39.t()
            if (r3 != 0) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            r39.B()
            goto L_0x039b
        L_0x0031:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0040
            r3 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.faremedia.WithCardContent.<anonymous> (FareMediaScreen.kt:327)"
            r5 = 464583705(0x1bb0fc19, float:2.9279672E-22)
            androidx.compose.runtime.ComposerKt.Y(r5, r2, r3, r4)
        L_0x0040:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = com.hansecom.abt.ui.theme.AbtBaseThemeKt.m()
            java.lang.Object r2 = r15.C(r2)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r2 = (com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme) r2
            boolean r2 = r2.D()
            r11 = 1
            r2 = r2 ^ r11
            r12 = 0
            com.hansecom.abt.ui.effects.StatusBarColorEffectKt.e(r2, r15, r12)
            androidx.compose.ui.Modifier$Companion r10 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.h(r10, r1)
            com.hansecom.abt.ui.theme.Dimensions r27 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r27.c()
            r14 = 0
            r8 = 0
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r14, r9, r8)
            androidx.compose.foundation.ScrollState r17 = androidx.compose.foundation.ScrollKt.c(r12, r15, r12, r11)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ScrollKt.g(r16, r17, r18, r19, r20, r21, r22)
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State r7 = r0.f35970z
            androidx.compose.foundation.pager.PagerState r6 = r0.f35968A
            kotlin.jvm.functions.Function1 r2 = r0.f35969B
            kotlin.jvm.functions.Function1 r5 = r0.C
            kotlin.jvm.functions.Function1 r4 = r0.D
            kotlin.jvm.functions.Function1 r3 = r0.E
            kotlin.jvm.functions.Function1 r9 = r0.F
            r17 = r9
            kotlin.jvm.functions.Function0 r9 = r0.G
            r18 = r9
            kotlin.jvm.functions.Function1 r9 = r0.H
            r19 = r9
            kotlin.jvm.functions.Function0 r9 = r0.I
            androidx.compose.foundation.layout.Arrangement r20 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r14 = r20.g()
            androidx.compose.ui.Alignment$Companion r20 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r11 = r20.k()
            androidx.compose.ui.layout.MeasurePolicy r11 = androidx.compose.foundation.layout.ColumnKt.a(r14, r11, r15, r12)
            int r14 = androidx.compose.runtime.ComposablesKt.a(r15, r12)
            androidx.compose.runtime.CompositionLocalMap r12 = r39.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r21 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r8 = r21.a()
            androidx.compose.runtime.Applier r23 = r39.v()
            if (r23 != 0) goto L_0x00bd
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00bd:
            r39.s()
            boolean r23 = r39.n()
            if (r23 == 0) goto L_0x00ca
            r15.y(r8)
            goto L_0x00cd
        L_0x00ca:
            r39.K()
        L_0x00cd:
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.b(r39)
            kotlin.jvm.functions.Function2 r13 = r21.c()
            androidx.compose.runtime.Updater.g(r8, r11, r13)
            kotlin.jvm.functions.Function2 r11 = r21.e()
            androidx.compose.runtime.Updater.g(r8, r12, r11)
            kotlin.jvm.functions.Function2 r11 = r21.b()
            boolean r12 = r8.n()
            if (r12 != 0) goto L_0x00f7
            java.lang.Object r12 = r8.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r13)
            if (r12 != 0) goto L_0x0105
        L_0x00f7:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            r8.N(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            r8.A(r12, r11)
        L_0x0105:
            kotlin.jvm.functions.Function2 r11 = r21.d()
            androidx.compose.runtime.Updater.g(r8, r1, r11)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            r1 = 16
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r10, r1)
            r8 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r8)
            kotlinx.collections.immutable.PersistentList r1 = r7.f()
            int r8 = r6.v()
            r11 = 1563030957(0x5d29f5ad, float:7.6543031E17)
            r15.X(r11)
            boolean r1 = r15.W(r1)
            boolean r8 = r15.i(r8)
            r1 = r1 | r8
            java.lang.Object r8 = r39.g()
            if (r1 != 0) goto L_0x0142
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r8 != r1) goto L_0x0160
        L_0x0142:
            kotlinx.collections.immutable.PersistentList r1 = r7.f()
            int r8 = r6.v()
            java.lang.Object r1 = kotlin.collections.CollectionsKt.h0(r1, r8)
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$CardItem r1 = (com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.CardItem) r1
            if (r1 != 0) goto L_0x015c
            kotlinx.collections.immutable.PersistentList r1 = r7.f()
            java.lang.Object r1 = kotlin.collections.CollectionsKt.e0(r1)
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$CardItem r1 = (com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.CardItem) r1
        L_0x015c:
            r8 = r1
            r15.N(r8)
        L_0x0160:
            r13 = r8
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$CardItem r13 = (com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.CardItem) r13
            r39.M()
            java.lang.String r1 = r13.m()
            r8 = 1563037639(0x5d2a0fc7, float:7.6588949E17)
            r15.X(r8)
            boolean r8 = r15.W(r2)
            boolean r11 = r15.l(r13)
            r8 = r8 | r11
            java.lang.Object r11 = r39.g()
            if (r8 != 0) goto L_0x018a
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r11 != r8) goto L_0x0188
            goto L_0x018a
        L_0x0188:
            r8 = 0
            goto L_0x0193
        L_0x018a:
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$WithCardContent$2$1$1$1 r11 = new com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$WithCardContent$2$1$1$1
            r8 = 0
            r11.<init>(r2, r13, r8)
            r15.N(r11)
        L_0x0193:
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r39.M()
            r2 = 0
            androidx.compose.runtime.EffectsKt.g(r1, r11, r15, r2)
            java.lang.Object r1 = r39.g()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r2.a()
            if (r1 != r11) goto L_0x01b1
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r1 = androidx.compose.runtime.EffectsKt.j(r1, r15)
            r15.N(r1)
        L_0x01b1:
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            int r11 = r6.H()
            r12 = 1
            if (r11 <= r12) goto L_0x01bc
            r11 = r12
            goto L_0x01bd
        L_0x01bc:
            r11 = 0
        L_0x01bd:
            int r14 = r6.v()
            if (r14 <= 0) goto L_0x01c5
            r14 = r12
            goto L_0x01c6
        L_0x01c5:
            r14 = 0
        L_0x01c6:
            int r8 = r6.v()
            kotlinx.collections.immutable.PersistentList r21 = r7.f()
            int r21 = r21.size()
            int r0 = r21 + -1
            if (r8 >= r0) goto L_0x01d8
            r0 = 1
            goto L_0x01d9
        L_0x01d8:
            r0 = 0
        L_0x01d9:
            r8 = 1563044482(0x5d2a2a82, float:7.6635974E17)
            r15.X(r8)
            boolean r8 = r15.l(r1)
            boolean r12 = r15.W(r6)
            r8 = r8 | r12
            java.lang.Object r12 = r39.g()
            if (r8 != 0) goto L_0x01f4
            java.lang.Object r8 = r2.a()
            if (r12 != r8) goto L_0x01fc
        L_0x01f4:
            com.hansecom.abt.presentation.screens.home.faremedia.q0 r12 = new com.hansecom.abt.presentation.screens.home.faremedia.q0
            r12.<init>(r1, r6)
            r15.N(r12)
        L_0x01fc:
            r8 = r12
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r39.M()
            r12 = 1563048354(0x5d2a39a2, float:7.6662582E17)
            r15.X(r12)
            boolean r12 = r15.l(r1)
            boolean r21 = r15.W(r6)
            r12 = r12 | r21
            r21 = r3
            java.lang.Object r3 = r39.g()
            if (r12 != 0) goto L_0x0220
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0228
        L_0x0220:
            com.hansecom.abt.presentation.screens.home.faremedia.r0 r3 = new com.hansecom.abt.presentation.screens.home.faremedia.r0
            r3.<init>(r1, r6)
            r15.N(r3)
        L_0x0228:
            r2 = r3
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r39.M()
            r12 = 0
            r1 = r8
            r8 = r21
            r3 = r13
            r28 = r4
            r4 = r11
            r29 = r5
            r5 = r14
            r11 = r6
            r6 = r0
            r0 = r7
            r7 = r39
            r30 = r8
            r14 = 0
            r8 = r12
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt.I(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 8
            float r12 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r12)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r10, r1)
            r2 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r2)
            r1 = 1
            r3 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r10, r3, r1, r14)
            androidx.compose.ui.Modifier r1 = com.hansecom.abt.util.ModifierExtKt.c(r4, r15, r2)
            r5 = 0
            r6 = 0
            r2 = r11
            r3 = r0
            r4 = r39
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt.G(r1, r2, r3, r4, r5, r6)
            float r1 = androidx.compose.ui.unit.Dp.m(r12)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r10, r1)
            r11 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r11)
            r3 = 0
            r8 = 1
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r10, r3, r8, r14)
            r2 = 2
            float r2 = (float) r2
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.i(r1, r2)
            long r4 = r0.n()
            r6 = 0
            java.lang.String r1 = com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt.J0(r4, r15, r6)
            com.hansecom.abt.ui.theme.AbtTheme r4 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.typography.AbtTypography r4 = r4.d(r15, r11)
            androidx.compose.ui.text.TextStyle r22 = r4.e()
            androidx.compose.ui.text.style.TextAlign$Companion r4 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r4 = r4.b()
            androidx.compose.ui.text.style.TextAlign r4 = androidx.compose.ui.text.style.TextAlign.h(r4)
            r7 = r3
            r5 = r14
            r14 = r4
            r25 = 0
            r26 = 130044(0x1fbfc, float:1.8223E-40)
            r3 = 0
            r16 = 0
            r5 = r16
            r20 = 0
            r16 = r6
            r6 = r20
            r20 = 0
            r21 = r8
            r8 = r20
            r34 = r9
            r31 = r17
            r32 = r18
            r33 = r19
            r9 = r20
            r17 = 0
            r38 = r10
            r10 = r17
            r17 = 0
            r16 = r11
            r35 = r12
            r11 = r17
            r17 = 0
            r36 = r13
            r13 = r17
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 48
            r23 = r39
            androidx.compose.material3.TextKt.j(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r8 = r36
            boolean r1 = r8 instanceof com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.CardItem.Card
            if (r1 == 0) goto L_0x0319
            r3 = r8
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$CardItem$Card r3 = (com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.CardItem.Card) r3
            boolean r2 = r3.n()
            if (r2 != 0) goto L_0x0319
            r1 = 1563087048(0x5d2ad0c8, float:7.6928486E17)
            r11 = r39
            r11.X(r1)
            r9 = 0
            r1 = r0
            r2 = r29
            r4 = r28
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r39
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt.K(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r39.M()
            goto L_0x0381
        L_0x0319:
            r11 = r39
            if (r1 == 0) goto L_0x0338
            r13 = r8
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$CardItem$Card r13 = (com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.CardItem.Card) r13
            boolean r0 = r13.n()
            if (r0 == 0) goto L_0x0338
            r0 = 1563105088(0x5d2b1740, float:7.7052455E17)
            r11.X(r0)
            r1 = r30
            r2 = r33
            r0 = 0
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt.h0(r13, r2, r1, r11, r0)
            r39.M()
            goto L_0x0381
        L_0x0338:
            r0 = 0
            boolean r1 = r8 instanceof com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.CardItem.CardPlaceholder
            if (r1 == 0) goto L_0x0378
            r1 = 1211936805(0x483cb025, float:193216.58)
            r11.X(r1)
            float r16 = androidx.compose.ui.unit.Dp.m(r35)
            r19 = 13
            r20 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r14 = r38
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.m(r14, r15, r16, r17, r18, r19, r20)
            r2 = 1
            r3 = 0
            r4 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r1, r3, r2, r4)
            int r1 = com.hansecom.abt.R.string.n5
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r3, r11, r0)
            r9 = 48
            r10 = 108(0x6c, float:1.51E-43)
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r1 = r34
            r8 = r39
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r39.M()
            goto L_0x0381
        L_0x0378:
            r0 = 1212333295(0x4842bcef, float:199411.73)
            r11.X(r0)
            r39.M()
        L_0x0381:
            float r0 = r27.e()
            r1 = r38
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.i(r1, r0)
            r1 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r0, r11, r1)
            r39.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x039b
            androidx.compose.runtime.ComposerKt.X()
        L_0x039b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$WithCardContent$2.e(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
    }
}
