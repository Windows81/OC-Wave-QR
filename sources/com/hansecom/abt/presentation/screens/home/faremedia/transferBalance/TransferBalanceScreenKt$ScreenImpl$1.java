package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TransferBalanceScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37318A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TransferBalance.State f37319z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f37320a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance$State$ValidationError[] r0 = com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance.State.ValidationError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance$State$ValidationError r1 = com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance.State.ValidationError.LOW_BALANCE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance$State$ValidationError r1 = com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance.State.ValidationError.MAX_BALANCE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f37320a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceScreenKt$ScreenImpl$1.WhenMappings.<clinit>():void");
        }
    }

    public TransferBalanceScreenKt$ScreenImpl$1(TransferBalance.State state, Function1 function1) {
        this.f37319z = state;
        this.f37318A = function1;
    }

    public static final Unit g(Function1 function1, PaymentMethodState.FareMedia fareMedia) {
        Intrinsics.i(fareMedia, "it");
        function1.invoke(new TransferBalance.Action.TargetFareMediaChange(fareMedia));
        return Unit.f40552a;
    }

    public static final Unit h(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new TransferBalance.Action.ValueChange(str));
        return Unit.f40552a;
    }

    public static final Unit i(Function1 function1) {
        function1.invoke(TransferBalance.Action.Confirm.f37306a);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(androidx.compose.runtime.Composer r44, int r45) {
        /*
            r43 = this;
            r0 = r43
            r15 = r44
            r1 = r45
            r2 = r1 & 3
            r14 = 2
            if (r2 != r14) goto L_0x0017
            boolean r2 = r44.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r44.B()
            goto L_0x04b4
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            r13 = -1
            if (r2 == 0) goto L_0x0026
            r2 = 1457016055(0x56d84cf7, float:1.18912537E14)
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.ScreenImpl.<anonymous> (TransferBalanceScreen.kt:82)"
            androidx.compose.runtime.ComposerKt.Y(r2, r1, r13, r3)
        L_0x0026:
            r1 = -1008167270(0xffffffffc3e8969a, float:-465.17657)
            r15.X(r1)
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance$State r1 = r0.f37319z
            boolean r1 = r1.d()
            r12 = 0
            if (r1 == 0) goto L_0x0045
            com.hansecom.abt.ui.components.loading.LoadingContentKt.b(r15, r12)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0041
            androidx.compose.runtime.ComposerKt.X()
        L_0x0041:
            r44.M()
            return
        L_0x0045:
            r44.M()
            androidx.compose.ui.Modifier$Companion r11 = androidx.compose.ui.Modifier.f15489d
            r10 = 0
            r9 = 1
            r8 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r11, r10, r9, r8)
            com.hansecom.abt.ui.theme.Dimensions r27 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r27.c()
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r10, r14, r8)
            androidx.compose.foundation.ScrollState r17 = androidx.compose.foundation.ScrollKt.c(r12, r15, r12, r9)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ScrollKt.g(r16, r17, r18, r19, r20, r21, r22)
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance$State r7 = r0.f37319z
            kotlin.jvm.functions.Function1 r5 = r0.f37318A
            androidx.compose.foundation.layout.Arrangement r28 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r28.g()
            androidx.compose.ui.Alignment$Companion r29 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r29.k()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r3, r15, r12)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r15, r12)
            androidx.compose.runtime.CompositionLocalMap r4 = r44.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r30 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r30.a()
            androidx.compose.runtime.Applier r16 = r44.v()
            if (r16 != 0) goto L_0x009c
            androidx.compose.runtime.ComposablesKt.d()
        L_0x009c:
            r44.s()
            boolean r16 = r44.n()
            if (r16 == 0) goto L_0x00a9
            r15.y(r6)
            goto L_0x00ac
        L_0x00a9:
            r44.K()
        L_0x00ac:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r44)
            kotlin.jvm.functions.Function2 r9 = r30.c()
            androidx.compose.runtime.Updater.g(r6, r2, r9)
            kotlin.jvm.functions.Function2 r2 = r30.e()
            androidx.compose.runtime.Updater.g(r6, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r30.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x00d6
            java.lang.Object r4 = r6.g()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r9)
            if (r4 != 0) goto L_0x00e4
        L_0x00d6:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r2)
        L_0x00e4:
            kotlin.jvm.functions.Function2 r2 = r30.d()
            androidx.compose.runtime.Updater.g(r6, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r9 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            java.lang.String r16 = r7.j()
            int r1 = com.hansecom.abt.R.string.Z9
            com.hansecom.abt.util.formatters.CurrencyValueFormater r6 = com.hansecom.abt.util.formatters.CurrencyValueFormater.f39045a
            java.math.BigDecimal r2 = r7.c()
            java.lang.String r2 = com.hansecom.abt.util.formatters.CurrencyValueFormater.c(r6, r2, r12, r14, r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            androidx.compose.ui.text.AnnotatedString r17 = com.hansecom.abt.util.resourcesResolvers.StyledStringResourceKt.c(r1, r2, r15, r12)
            float r19 = r27.d()
            r1 = 50
            float r1 = (float) r1
            float r21 = androidx.compose.ui.unit.Dp.m(r1)
            r22 = 5
            r23 = 0
            r18 = 0
            r20 = 0
            androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.PaddingKt.e(r18, r19, r20, r21, r22, r23)
            r18 = 48
            r19 = 77
            r1 = 0
            r3 = 0
            r20 = 0
            r22 = 0
            r31 = r5
            r32 = r6
            r5 = r20
            r33 = r7
            r7 = r16
            r14 = r8
            r8 = r17
            r34 = r9
            r13 = 1
            r9 = r22
            r10 = r44
            r36 = r11
            r11 = r18
            r13 = r12
            r12 = r19
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r1 = -1822764528(0xffffffff935ad210, float:-2.7619037E-27)
            r15.X(r1)
            boolean r1 = r33.q()
            r11 = 6
            if (r1 != 0) goto L_0x0187
            com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType r1 = com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType.WARNING
            int r2 = com.hansecom.abt.R.drawable.f33007i
            androidx.compose.ui.graphics.painter.Painter r2 = androidx.compose.ui.res.PainterResources_androidKt.c(r2, r15, r13)
            int r3 = com.hansecom.abt.R.string.S9
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r3 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r4, r15, r13)
            r12 = r36
            r4 = 1
            r10 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.h(r12, r10, r4, r14)
            r8 = 3078(0xc06, float:4.313E-42)
            r9 = 48
            r6 = 0
            r7 = 0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r44
            com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 40
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r11)
            goto L_0x018a
        L_0x0187:
            r12 = r36
            r10 = 0
        L_0x018a:
            r44.M()
            int r1 = com.hansecom.abt.R.string.ba
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.String r1 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r15, r13)
            com.hansecom.abt.ui.theme.AbtTheme r3 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = r3.d(r15, r11)
            androidx.compose.ui.text.TextStyle r22 = r2.f()
            r2 = 1
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r12, r10, r2, r14)
            boolean r5 = r33.q()
            if (r5 == 0) goto L_0x01be
            r5 = -670423833(0xffffffffd80a24e7, float:-6.075644E14)
            r15.X(r5)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r5 = r3.b(r15, r11)
            long r5 = r5.q()
            r44.M()
        L_0x01bb:
            r35 = r5
            goto L_0x01d0
        L_0x01be:
            r5 = -670348472(0xffffffffd80b4b48, float:-6.1262179E14)
            r15.X(r5)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r5 = r3.b(r15, r11)
            long r5 = r5.a()
            r44.M()
            goto L_0x01bb
        L_0x01d0:
            r25 = 0
            r26 = 131064(0x1fff8, float:1.8366E-40)
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r18 = 0
            r10 = r18
            r18 = 0
            r37 = r12
            r11 = r18
            r18 = 0
            r2 = r13
            r38 = -1
            r13 = r18
            r17 = 0
            r14 = r17
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 48
            r2 = r4
            r39 = r3
            r3 = r35
            r23 = r44
            androidx.compose.material3.TextKt.j(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = 24
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r14 = r37
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            r15 = r44
            r12 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r12)
            com.hansecom.abt.presentation.model.PaymentMethodState$FareMedia r1 = r33.i()
            kotlinx.collections.immutable.ImmutableList r2 = r33.n()
            kotlinx.collections.immutable.ImmutableList r3 = r33.g()
            boolean r5 = r33.q()
            r4 = -1822724767(0xffffffff935b6d61, float:-2.7695614E-27)
            r15.X(r4)
            r10 = r31
            boolean r4 = r15.W(r10)
            java.lang.Object r6 = r44.g()
            if (r4 != 0) goto L_0x0246
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x024e
        L_0x0246:
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.v r6 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.v
            r6.<init>(r10)
            r15.N(r6)
        L_0x024e:
            r4 = r6
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r44.M()
            r7 = 0
            r8 = 0
            r6 = r44
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.FareMediaSelectorKt.k(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 32
            float r8 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r8)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r12)
            r9 = r39
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r1 = r9.b(r15, r12)
            long r3 = r1.u()
            r6 = 0
            r7 = 3
            r1 = 0
            r2 = 0
            r5 = r44
            androidx.compose.material3.DividerKt.e(r1, r2, r3, r5, r6, r7)
            float r1 = androidx.compose.ui.unit.Dp.m(r8)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r12)
            boolean r1 = r33.r()
            if (r1 == 0) goto L_0x0290
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0292
        L_0x0290:
            r1 = 1056964608(0x3f000000, float:0.5)
        L_0x0292:
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.draw.AlphaKt.a(r14, r1)
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r28.g()
            androidx.compose.ui.Alignment$Horizontal r3 = r29.k()
            r11 = 0
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r3, r15, r11)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r15, r11)
            androidx.compose.runtime.CompositionLocalMap r4 = r44.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            kotlin.jvm.functions.Function0 r5 = r30.a()
            androidx.compose.runtime.Applier r6 = r44.v()
            if (r6 != 0) goto L_0x02bc
            androidx.compose.runtime.ComposablesKt.d()
        L_0x02bc:
            r44.s()
            boolean r6 = r44.n()
            if (r6 == 0) goto L_0x02c9
            r15.y(r5)
            goto L_0x02cc
        L_0x02c9:
            r44.K()
        L_0x02cc:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r44)
            kotlin.jvm.functions.Function2 r6 = r30.c()
            androidx.compose.runtime.Updater.g(r5, r2, r6)
            kotlin.jvm.functions.Function2 r2 = r30.e()
            androidx.compose.runtime.Updater.g(r5, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r30.b()
            boolean r4 = r5.n()
            if (r4 != 0) goto L_0x02f6
            java.lang.Object r4 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r6)
            if (r4 != 0) goto L_0x0304
        L_0x02f6:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.A(r3, r2)
        L_0x0304:
            kotlin.jvm.functions.Function2 r2 = r30.d()
            androidx.compose.runtime.Updater.g(r5, r1, r2)
            int r1 = com.hansecom.abt.R.string.da
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.String r1 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r15, r11)
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = r9.d(r15, r12)
            androidx.compose.ui.text.TextStyle r21 = r2.b()
            androidx.compose.ui.text.style.TextAlign$Companion r2 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r3 = r2.a()
            androidx.compose.ui.Alignment$Horizontal r2 = r29.g()
            r4 = r34
            androidx.compose.ui.Modifier r2 = r4.b(r14, r2)
            androidx.compose.ui.text.style.TextAlign r13 = androidx.compose.ui.text.style.TextAlign.h(r3)
            r24 = 0
            r25 = 65020(0xfdfc, float:9.1112E-41)
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r16 = 0
            r40 = r10
            r10 = r16
            r16 = 0
            r12 = r16
            r16 = 0
            r41 = r14
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r22 = r44
            com.hansecom.abt.ui.components.AbtTextKt.c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = 16
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r14 = r41
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            r15 = r44
            r13 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r13)
            java.lang.String r1 = r33.l()
            boolean r10 = r33.r()
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance$State$ValidationError r2 = r33.e()
            if (r2 != 0) goto L_0x0381
            r2 = r38
        L_0x037f:
            r12 = 1
            goto L_0x038a
        L_0x0381:
            int[] r3 = com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceScreenKt$ScreenImpl$1.WhenMappings.f37320a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            goto L_0x037f
        L_0x038a:
            if (r2 == r12) goto L_0x03b1
            r11 = 2
            if (r2 == r11) goto L_0x039d
            r2 = 1957493578(0x74acfb4a, float:1.0964011E32)
            r15.X(r2)
            r44.M()
            java.lang.String r2 = ""
            r5 = r2
            r9 = 0
            goto L_0x03c5
        L_0x039d:
            r2 = -75407033(0xfffffffffb816147, float:-1.3435586E36)
            r15.X(r2)
            int r2 = com.hansecom.abt.R.string.Y9
            r9 = 0
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.String r2 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r3, r15, r9)
            r44.M()
        L_0x03af:
            r5 = r2
            goto L_0x03c5
        L_0x03b1:
            r9 = 0
            r11 = 2
            r2 = -75412729(0xfffffffffb814b07, float:-1.342656E36)
            r15.X(r2)
            int r2 = com.hansecom.abt.R.string.X9
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.String r2 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r3, r15, r9)
            r44.M()
            goto L_0x03af
        L_0x03c5:
            int r2 = com.hansecom.abt.R.string.ea
            java.math.BigDecimal r3 = r33.f()
            r4 = r32
            java.lang.String r3 = r4.a(r3, r9)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r3, r15, r9)
            androidx.compose.ui.text.input.ImeAction$Companion r2 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r16 = r2.b()
            r2 = -75417610(0xfffffffffb8137f6, float:-1.3418826E36)
            r15.X(r2)
            r8 = r40
            boolean r2 = r15.W(r8)
            java.lang.Object r3 = r44.g()
            if (r2 != 0) goto L_0x03f9
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0401
        L_0x03f9:
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.w r3 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.w
            r3.<init>(r8)
            r15.N(r3)
        L_0x0401:
            r2 = r3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r44.M()
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r18 = 228(0xe4, float:3.2E-43)
            r3 = 0
            r6 = 0
            r7 = 0
            r19 = 0
            r42 = r8
            r8 = r19
            r9 = r16
            r11 = r44
            r12 = r17
            r0 = r13
            r13 = r18
            com.hansecom.abt.ui.components.formFields.ValueFieldKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 48
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r0)
            r44.T()
            r1 = -1822667237(0xffffffff935c4e1b, float:-2.7806413E-27)
            r15.X(r1)
            boolean r1 = r33.p()
            if (r1 == 0) goto L_0x049a
            boolean r1 = r33.o()
            r2 = 1
            r1 = r1 ^ r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3 = 2
            r4 = 0
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r5 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r1, r4, r3, r4)
            int r1 = com.hansecom.abt.R.string.T9
            r3 = 0
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r6 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r6, r15, r3)
            int r1 = com.hansecom.abt.R.drawable.X
            r3 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r14, r3, r2, r4)
            r3 = -1822664785(0xffffffff935c57af, float:-2.7811135E-27)
            r15.X(r3)
            r3 = r42
            boolean r4 = r15.W(r3)
            java.lang.Object r7 = r44.g()
            if (r4 != 0) goto L_0x0477
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r7 != r4) goto L_0x047f
        L_0x0477:
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.x r7 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.x
            r7.<init>(r3)
            r15.N(r7)
        L_0x047f:
            r3 = r7
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r44.M()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r9 = 48
            r10 = 68
            r4 = 0
            r8 = 0
            r1 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r44
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x049a:
            r44.M()
            float r1 = r27.e()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r0)
            r44.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x04b4
            androidx.compose.runtime.ComposerKt.X()
        L_0x04b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceScreenKt$ScreenImpl$1.f(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        f((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
