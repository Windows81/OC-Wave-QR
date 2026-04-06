package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusManager;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AutoloadSetupScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36308A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FocusManager f36309B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AutoloadSetup.State f36310z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f36313a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f36314b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        static {
            /*
                com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State$BalanceValidationError[] r0 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup.State.BalanceValidationError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State$BalanceValidationError r2 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup.State.BalanceValidationError.MIN_VALUE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State$BalanceValidationError r3 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup.State.BalanceValidationError.MAX_VALUE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f36313a = r0
                com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State$TopUpValidationError[] r0 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup.State.TopUpValidationError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State$TopUpValidationError r3 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup.State.TopUpValidationError.MIN_VALUE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State$TopUpValidationError r1 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup.State.TopUpValidationError.MAX_BALANCE     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State$TopUpValidationError r1 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup.State.TopUpValidationError.MAX_VALUE     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f36314b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt$ScreenImpl$1.WhenMappings.<clinit>():void");
        }
    }

    public AutoloadSetupScreenKt$ScreenImpl$1(AutoloadSetup.State state, Function1 function1, FocusManager focusManager) {
        this.f36310z = state;
        this.f36308A = function1;
        this.f36309B = focusManager;
    }

    public static final Unit k(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new AutoloadSetup.Action.BalanceThresholdChange(str));
        return Unit.f40552a;
    }

    public static final Unit p(Function1 function1) {
        function1.invoke(AutoloadSetup.Action.Confirm.f36292a);
        return Unit.f40552a;
    }

    public static final Unit q(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new AutoloadSetup.Action.TopUpValueChange(str));
        return Unit.f40552a;
    }

    public static final Unit s(FocusManager focusManager, Function1 function1, String str) {
        Intrinsics.i(str, "it");
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(new AutoloadSetup.Action.TopUpValueChange(str));
        return Unit.f40552a;
    }

    public static final Unit t(Function1 function1, PaymentMethodState paymentMethodState) {
        Intrinsics.i(paymentMethodState, "it");
        function1.invoke(new AutoloadSetup.Action.PaymentMethodChange(paymentMethodState));
        return Unit.f40552a;
    }

    public static final Unit u(Function1 function1, PaymentMethodState paymentMethodState) {
        Intrinsics.i(paymentMethodState, "it");
        function1.invoke(new AutoloadSetup.Action.BackupPaymentMethodChange(paymentMethodState));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v66, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(androidx.compose.runtime.Composer r41, int r42) {
        /*
            r40 = this;
            r0 = r40
            r14 = r41
            r1 = r42
            r15 = 3
            r2 = r1 & 3
            r13 = 2
            if (r2 != r13) goto L_0x0018
            boolean r2 = r41.t()
            if (r2 != 0) goto L_0x0013
            goto L_0x0018
        L_0x0013:
            r41.B()
            goto L_0x06f0
        L_0x0018:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            r12 = -1
            if (r2 == 0) goto L_0x0027
            r2 = -1381541057(0xffffffffada75b3f, float:-1.9026223E-11)
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.ScreenImpl.<anonymous> (AutoloadSetupScreen.kt:88)"
            androidx.compose.runtime.ComposerKt.Y(r2, r1, r12, r3)
        L_0x0027:
            r1 = 335277285(0x13fbece5, float:6.3594904E-27)
            r14.X(r1)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State r1 = r0.f36310z
            boolean r1 = r1.u()
            r11 = 0
            if (r1 == 0) goto L_0x0046
            com.hansecom.abt.ui.components.loading.LoadingContentKt.b(r14, r11)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0042
            androidx.compose.runtime.ComposerKt.X()
        L_0x0042:
            r41.M()
            return
        L_0x0046:
            r41.M()
            androidx.compose.ui.Modifier$Companion r10 = androidx.compose.ui.Modifier.f15489d
            r9 = 0
            r8 = 1
            r7 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r10, r9, r8, r7)
            com.hansecom.abt.ui.theme.Dimensions r27 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r27.c()
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r9, r13, r7)
            androidx.compose.foundation.ScrollState r17 = androidx.compose.foundation.ScrollKt.c(r11, r14, r11, r8)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ScrollKt.g(r16, r17, r18, r19, r20, r21, r22)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State r5 = r0.f36310z
            kotlin.jvm.functions.Function1 r6 = r0.f36308A
            androidx.compose.ui.focus.FocusManager r3 = r0.f36309B
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            androidx.compose.ui.Alignment$Companion r4 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r4 = r4.k()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r4, r14, r11)
            int r4 = androidx.compose.runtime.ComposablesKt.a(r14, r11)
            androidx.compose.runtime.CompositionLocalMap r8 = r41.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r14, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r9 = r16.a()
            androidx.compose.runtime.Applier r18 = r41.v()
            if (r18 != 0) goto L_0x009f
            androidx.compose.runtime.ComposablesKt.d()
        L_0x009f:
            r41.s()
            boolean r18 = r41.n()
            if (r18 == 0) goto L_0x00ac
            r14.y(r9)
            goto L_0x00af
        L_0x00ac:
            r41.K()
        L_0x00af:
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.b(r41)
            kotlin.jvm.functions.Function2 r12 = r16.c()
            androidx.compose.runtime.Updater.g(r9, r2, r12)
            kotlin.jvm.functions.Function2 r2 = r16.e()
            androidx.compose.runtime.Updater.g(r9, r8, r2)
            kotlin.jvm.functions.Function2 r2 = r16.b()
            boolean r8 = r9.n()
            if (r8 != 0) goto L_0x00d9
            java.lang.Object r8 = r9.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r12)
            if (r8 != 0) goto L_0x00e7
        L_0x00d9:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r9.N(r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9.A(r4, r2)
        L_0x00e7:
            kotlin.jvm.functions.Function2 r2 = r16.d()
            androidx.compose.runtime.Updater.g(r9, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            java.lang.String r8 = r5.q()
            r1 = -2057948788(0xffffffff8556318c, float:-1.0071332E-35)
            r14.X(r1)
            boolean r1 = r5.f()
            java.lang.String r26 = ""
            if (r1 != 0) goto L_0x011c
            int r1 = com.hansecom.abt.R.string.m1
            com.hansecom.abt.util.formatters.CurrencyValueFormater r2 = com.hansecom.abt.util.formatters.CurrencyValueFormater.f39045a
            java.math.BigDecimal r4 = r5.j()
            java.lang.String r4 = r4.toString()
            java.lang.String r2 = com.hansecom.abt.util.formatters.CurrencyValueFormater.d(r2, r4, r11, r13, r7)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            androidx.compose.ui.text.AnnotatedString r1 = com.hansecom.abt.util.resourcesResolvers.StyledStringResourceKt.c(r1, r2, r14, r11)
            r9 = r1
            goto L_0x011e
        L_0x011c:
            r9 = r26
        L_0x011e:
            r41.M()
            float r20 = r27.d()
            r1 = 32
            float r1 = (float) r1
            float r22 = androidx.compose.ui.unit.Dp.m(r1)
            r23 = 5
            r24 = 0
            r19 = 0
            r21 = 0
            androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.PaddingKt.e(r19, r20, r21, r22, r23, r24)
            r12 = 48
            r16 = 77
            r1 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r28 = r3
            r3 = r19
            r29 = r5
            r30 = r6
            r5 = r21
            r7 = r8
            r8 = r9
            r9 = r23
            r31 = r10
            r10 = r41
            r15 = r11
            r11 = r12
            r12 = r16
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r1 = -2057933297(0xffffffff85566e0f, float:-1.0082446E-35)
            r14.X(r1)
            boolean r1 = r29.f()
            r12 = 16
            r10 = 6
            if (r1 == 0) goto L_0x02a6
            int r1 = com.hansecom.abt.R.string.c1
            java.lang.String r1 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r14, r15)
            com.hansecom.abt.ui.theme.AbtTheme r2 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = r2.d(r14, r10)
            androidx.compose.ui.text.TextStyle r21 = r2.b()
            androidx.compose.ui.text.style.TextAlign$Companion r2 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r2 = r2.a()
            androidx.compose.ui.text.style.TextAlign r2 = androidx.compose.ui.text.style.TextAlign.h(r2)
            r11 = r13
            r13 = r2
            r24 = 0
            r25 = 65022(0xfdfe, float:9.1115E-41)
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r18 = 0
            r10 = r18
            r16 = 0
            r12 = r16
            r14 = r18
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r22 = r41
            com.hansecom.abt.ui.components.AbtTextKt.c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r14 = 16
            float r15 = (float) r14
            float r1 = androidx.compose.ui.unit.Dp.m(r15)
            r13 = r31
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r13, r1)
            r12 = r41
            r11 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r12, r11)
            java.lang.String r1 = r29.d()
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State$BalanceValidationError r2 = r29.e()
            if (r2 != 0) goto L_0x01cf
            r2 = -1
        L_0x01cd:
            r10 = -1
            goto L_0x01d8
        L_0x01cf:
            int[] r3 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt$ScreenImpl$1.WhenMappings.f36313a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            goto L_0x01cd
        L_0x01d8:
            if (r2 == r10) goto L_0x022f
            r9 = 1
            if (r2 == r9) goto L_0x020f
            r8 = 2
            if (r2 != r8) goto L_0x0200
            r2 = -2057903889(0xffffffff8556e0ef, float:-1.01035454E-35)
            r12.X(r2)
            int r2 = com.hansecom.abt.R.string.a1
            com.hansecom.abt.util.formatters.CurrencyValueFormater r3 = com.hansecom.abt.util.formatters.CurrencyValueFormater.f39045a
            java.math.BigDecimal r4 = r29.h()
            r7 = 0
            java.lang.String r3 = r3.a(r4, r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = androidx.compose.ui.res.StringResources_androidKt.c(r2, r3, r12, r7)
            r41.M()
        L_0x01fe:
            r5 = r2
            goto L_0x023d
        L_0x0200:
            r1 = -2057916510(0xffffffff8556afa2, float:-1.009449E-35)
            r12.X(r1)
            r41.M()
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x020f:
            r7 = 0
            r8 = 2
            r2 = -2057913521(0xffffffff8556bb4f, float:-1.0096635E-35)
            r12.X(r2)
            int r2 = com.hansecom.abt.R.string.b1
            com.hansecom.abt.util.formatters.CurrencyValueFormater r3 = com.hansecom.abt.util.formatters.CurrencyValueFormater.f39045a
            java.math.BigDecimal r4 = r29.j()
            java.lang.String r3 = r3.a(r4, r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = androidx.compose.ui.res.StringResources_androidKt.c(r2, r3, r12, r7)
            r41.M()
            goto L_0x01fe
        L_0x022f:
            r7 = 0
            r8 = 2
            r9 = 1
            r2 = 629746584(0x25892b98, float:2.3795252E-16)
            r12.X(r2)
            r41.M()
            r5 = r26
        L_0x023d:
            androidx.compose.ui.text.input.ImeAction$Companion r2 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r16 = r2.d()
            java.lang.String r2 = "balance_field"
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.platform.TestTagKt.a(r13, r2)
            r2 = -2057919693(0xffffffff8556a333, float:-1.00922066E-35)
            r12.X(r2)
            r6 = r30
            boolean r2 = r12.W(r6)
            java.lang.Object r4 = r41.g()
            if (r2 != 0) goto L_0x0263
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x026b
        L_0x0263:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.f r4 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.f
            r4.<init>(r6)
            r12.N(r4)
        L_0x026b:
            r2 = r4
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r41.M()
            r17 = 100663680(0x6000180, float:2.4075226E-35)
            r18 = 744(0x2e8, float:1.043E-42)
            r4 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r32 = r6
            r6 = r19
            r14 = r7
            r7 = r20
            r8 = r21
            r9 = r16
            r10 = r22
            r14 = r11
            r11 = r41
            r12 = r17
            r14 = r13
            r13 = r18
            com.hansecom.abt.ui.components.formFields.ValueFieldKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            float r1 = androidx.compose.ui.unit.Dp.m(r15)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            r15 = r41
            r12 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r12)
            goto L_0x02ac
        L_0x02a6:
            r12 = r10
            r15 = r14
            r32 = r30
            r14 = r31
        L_0x02ac:
            r41.M()
            int r1 = com.hansecom.abt.R.string.f1
            r10 = 0
            java.lang.String r1 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r10)
            com.hansecom.abt.ui.theme.AbtTheme r11 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = r11.d(r15, r12)
            androidx.compose.ui.text.TextStyle r21 = r2.b()
            androidx.compose.ui.text.style.TextAlign$Companion r30 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r2 = r30.a()
            androidx.compose.ui.text.style.TextAlign r13 = androidx.compose.ui.text.style.TextAlign.h(r2)
            r24 = 0
            r25 = 65022(0xfdfe, float:9.1115E-41)
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r16 = 0
            r18 = r10
            r33 = r11
            r10 = r16
            r16 = 0
            r17 = r12
            r12 = r16
            r19 = 0
            r34 = r14
            r14 = r19
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r22 = r41
            com.hansecom.abt.ui.components.AbtTextKt.c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = 16
            float r15 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r15)
            r14 = r34
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            r13 = r41
            r12 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r12)
            java.lang.String r1 = r29.r()
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State$TopUpValidationError r2 = r29.s()
            if (r2 != 0) goto L_0x031c
            r2 = -1
        L_0x031a:
            r3 = -1
            goto L_0x0325
        L_0x031c:
            int[] r3 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt$ScreenImpl$1.WhenMappings.f36314b
            int r2 = r2.ordinal()
            r2 = r3[r2]
            goto L_0x031a
        L_0x0325:
            if (r2 == r3) goto L_0x039f
            r11 = 1
            if (r2 == r11) goto L_0x037f
            r3 = 2
            if (r2 == r3) goto L_0x035f
            r10 = 3
            if (r2 != r10) goto L_0x0350
            r2 = -2057853717(0xffffffff8557a4eb, float:-1.0139542E-35)
            r13.X(r2)
            int r2 = com.hansecom.abt.R.string.d1
            com.hansecom.abt.util.formatters.CurrencyValueFormater r3 = com.hansecom.abt.util.formatters.CurrencyValueFormater.f39045a
            java.math.BigDecimal r4 = r29.i()
            r9 = 0
            java.lang.String r3 = r3.a(r4, r9)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = androidx.compose.ui.res.StringResources_androidKt.c(r2, r3, r13, r9)
            r41.M()
        L_0x034e:
            r5 = r2
            goto L_0x03ad
        L_0x0350:
            r1 = -2057872515(0xffffffff85575b7d, float:-1.0126055E-35)
            r13.X(r1)
            r41.M()
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x035f:
            r9 = 0
            r10 = 3
            r2 = -2057861912(0xffffffff855784e8, float:-1.01336624E-35)
            r13.X(r2)
            int r2 = com.hansecom.abt.R.string.p1
            com.hansecom.abt.util.formatters.CurrencyValueFormater r3 = com.hansecom.abt.util.formatters.CurrencyValueFormater.f39045a
            java.math.BigDecimal r4 = r29.g()
            java.lang.String r3 = r3.a(r4, r9)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = androidx.compose.ui.res.StringResources_androidKt.c(r2, r3, r13, r9)
            r41.M()
            goto L_0x034e
        L_0x037f:
            r9 = 0
            r10 = 3
            r2 = -2057870261(0xffffffff8557644b, float:-1.0127672E-35)
            r13.X(r2)
            int r2 = com.hansecom.abt.R.string.e1
            com.hansecom.abt.util.formatters.CurrencyValueFormater r3 = com.hansecom.abt.util.formatters.CurrencyValueFormater.f39045a
            java.math.BigDecimal r4 = r29.k()
            java.lang.String r3 = r3.a(r4, r9)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = androidx.compose.ui.res.StringResources_androidKt.c(r2, r3, r13, r9)
            r41.M()
            goto L_0x034e
        L_0x039f:
            r9 = 0
            r10 = 3
            r11 = 1
            r2 = 631263352(0x25a05078, float:2.7810103E-16)
            r13.X(r2)
            r41.M()
            r5 = r26
        L_0x03ad:
            int r2 = com.hansecom.abt.R.string.p1
            com.hansecom.abt.util.formatters.CurrencyValueFormater r3 = com.hansecom.abt.util.formatters.CurrencyValueFormater.f39045a
            java.math.BigDecimal r4 = r29.g()
            java.lang.String r3 = r3.a(r4, r9)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.c(r2, r3, r13, r9)
            androidx.compose.ui.text.input.ImeAction$Companion r2 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r16 = r2.b()
            java.lang.String r2 = "value_field"
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.platform.TestTagKt.a(r14, r2)
            r2 = -2057875539(0xffffffff85574fad, float:-1.01238855E-35)
            r13.X(r2)
            r8 = r32
            boolean r2 = r13.W(r8)
            java.lang.Object r6 = r41.g()
            if (r2 != 0) goto L_0x03e7
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x03ef
        L_0x03e7:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.g r6 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.g
            r6.<init>(r8)
            r13.N(r6)
        L_0x03ef:
            r2 = r6
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r41.M()
            r17 = 100663680(0x6000180, float:2.4075226E-35)
            r18 = 736(0x2e0, float:1.031E-42)
            r6 = 0
            r7 = 0
            r19 = 0
            r20 = 0
            r35 = r8
            r8 = r19
            r9 = r16
            r10 = r20
            r11 = r41
            r12 = r17
            r0 = r13
            r13 = r18
            com.hansecom.abt.ui.components.formFields.ValueFieldKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = -2057832856(0xffffffff8557f668, float:-1.0154509E-35)
            r0.X(r1)
            kotlinx.collections.immutable.PersistentList r1 = r29.o()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x04f9
            float r1 = androidx.compose.ui.unit.Dp.m(r15)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            r13 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r13)
            r10 = 0
            r11 = 0
            r12 = 1
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r14, r11, r12, r10)
            r9 = r33
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r2 = r9.b(r0, r13)
            long r2 = r2.z()
            r5 = 2
            r6 = 0
            r4 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.BackgroundKt.b(r1, r2, r4, r5, r6)
            int r1 = com.hansecom.abt.R.string.k1
            r8 = 0
            java.lang.String r1 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r0, r8)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r3 = r9.b(r0, r13)
            long r3 = r3.q()
            com.hansecom.abt.ui.theme.typography.AbtTypography r5 = r9.d(r0, r13)
            androidx.compose.ui.text.TextStyle r22 = r5.b()
            int r5 = r30.a()
            androidx.compose.ui.text.style.TextAlign r5 = androidx.compose.ui.text.style.TextAlign.h(r5)
            r6 = r14
            r14 = r5
            r25 = 0
            r26 = 130040(0x1fbf8, float:1.82225E-40)
            r5 = 0
            r16 = 0
            r36 = r6
            r6 = r16
            r16 = 0
            r8 = r16
            r37 = r9
            r9 = r16
            r10 = r16
            r16 = 0
            r11 = r16
            r16 = 0
            r13 = r16
            r16 = 0
            r30 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r23 = r41
            androidx.compose.material3.TextKt.j(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            float r1 = androidx.compose.ui.unit.Dp.m(r30)
            r15 = r36
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r15, r1)
            r14 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r14)
            r11 = 1
            r12 = 0
            r13 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r15, r13, r11, r12)
            r2 = 3
            r10 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.C(r1, r12, r10, r2, r12)
            kotlinx.collections.immutable.PersistentList r2 = r29.o()
            java.lang.String r1 = r29.r()
            r3 = -2057804245(0xffffffff8558662b, float:-1.01750365E-35)
            r0.X(r3)
            r3 = r28
            boolean r5 = r0.l(r3)
            r9 = r35
            boolean r6 = r0.W(r9)
            r5 = r5 | r6
            java.lang.Object r6 = r41.g()
            if (r5 != 0) goto L_0x04e0
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x04e8
        L_0x04e0:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.h r6 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.h
            r6.<init>(r3, r9)
            r0.N(r6)
        L_0x04e8:
            r3 = r6
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r41.M()
            r7 = 3072(0xc00, float:4.305E-42)
            r8 = 16
            r5 = 0
            r6 = r41
            com.hansecom.abt.ui.components.quickSelectionButton.QuickSelectionGridKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0505
        L_0x04f9:
            r30 = r15
            r37 = r33
            r9 = r35
            r10 = 0
            r11 = 1
            r12 = 0
            r13 = 0
            r15 = r14
            r14 = 6
        L_0x0505:
            r41.M()
            r1 = 24
            float r8 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r8)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r15, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r14)
            r7 = r37
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r1 = r7.b(r0, r14)
            long r3 = r1.u()
            r6 = 0
            r16 = 3
            r1 = 0
            r2 = 0
            r5 = r41
            r11 = r7
            r7 = r16
            androidx.compose.material3.DividerKt.e(r1, r2, r3, r5, r6, r7)
            float r1 = androidx.compose.ui.unit.Dp.m(r8)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r15, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r14)
            int r1 = com.hansecom.abt.R.string.i1
            java.lang.String r1 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r0, r10)
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = r11.d(r0, r14)
            androidx.compose.ui.text.TextStyle r22 = r2.f()
            r11 = 1
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r15, r13, r11, r12)
            r25 = 0
            r26 = 131068(0x1fffc, float:1.83665E-40)
            r3 = 0
            r5 = 0
            r6 = 0
            r16 = 0
            r28 = r8
            r8 = r16
            r38 = r9
            r9 = r16
            r10 = r16
            r16 = 0
            r11 = r16
            r16 = 0
            r13 = r16
            r14 = r16
            r16 = 0
            r39 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 48
            r23 = r41
            androidx.compose.material3.TextKt.j(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            float r1 = androidx.compose.ui.unit.Dp.m(r30)
            r12 = r39
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            r13 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r13)
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r1 = r29.l()
            kotlinx.collections.immutable.PersistentList r2 = r29.n()
            r3 = -2057778060(0xffffffff8558cc74, float:-1.0193823E-35)
            r0.X(r3)
            r14 = r38
            boolean r3 = r0.W(r14)
            java.lang.Object r4 = r41.g()
            if (r3 != 0) goto L_0x05b2
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x05ba
        L_0x05b2:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.i r4 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.i
            r4.<init>(r14)
            r0.N(r4)
        L_0x05ba:
            r3 = r4
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r41.M()
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r4 = r29.c()
            if (r4 == 0) goto L_0x05cf
            long r4 = r4.c()
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            goto L_0x05d0
        L_0x05cf:
            r7 = 0
        L_0x05d0:
            java.util.List r4 = kotlin.collections.CollectionsKt.q(r7)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt$ScreenImpl$1$1$5 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt$ScreenImpl$1$1$5
            r15 = r29
            r5.<init>(r15)
            r6 = -2123887950(0xffffffff81680ab2, float:-4.2619344E-38)
            r11 = 54
            r10 = 1
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r10, r5, r0, r11)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r17 = 112(0x70, float:1.57E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = r41
            r10 = r16
            r11 = r17
            com.hansecom.abt.presentation.screens.payment.PaymentMethodSelectorKt.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = -2057753982(0xffffffff85592a82, float:-1.02110984E-35)
            r0.X(r1)
            boolean r1 = r15.w()
            if (r1 == 0) goto L_0x06d6
            r1 = -2057752915(0xffffffff85592ead, float:-1.0211864E-35)
            r0.X(r1)
            boolean r1 = r15.t()
            if (r1 == 0) goto L_0x0681
            r1 = 8
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r13)
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r1 = r15.c()
            kotlinx.collections.immutable.PersistentList r2 = r15.n()
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r3 = r15.l()
            if (r3 == 0) goto L_0x0632
            long r3 = r3.c()
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            goto L_0x0633
        L_0x0632:
            r7 = 0
        L_0x0633:
            java.util.List r4 = kotlin.collections.CollectionsKt.q(r7)
            r3 = -2057740982(0xffffffff85595d4a, float:-1.02204255E-35)
            r0.X(r3)
            boolean r3 = r0.W(r14)
            java.lang.Object r5 = r41.g()
            if (r3 != 0) goto L_0x064f
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x0657
        L_0x064f:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.j r5 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.j
            r5.<init>(r14)
            r0.N(r5)
        L_0x0657:
            r3 = r5
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r41.M()
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.ComposableSingletons$AutoloadSetupScreenKt r5 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.ComposableSingletons$AutoloadSetupScreenKt.f36331a
            kotlin.jvm.functions.Function3 r6 = r5.a()
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt$ScreenImpl$1$1$7 r7 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt$ScreenImpl$1$1$7
            r7.<init>(r14)
            r8 = 535947618(0x1ff1e962, float:1.0245357E-19)
            r9 = 54
            r15 = 1
            androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r15, r7, r0, r9)
            kotlin.jvm.functions.Function3 r8 = r5.b()
            r10 = 14352384(0xdb0000, float:2.0111974E-38)
            r11 = 16
            r5 = 0
            r9 = r41
            com.hansecom.abt.presentation.screens.payment.PaymentMethodSelectorKt.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0682
        L_0x0681:
            r15 = 1
        L_0x0682:
            r41.M()
            float r1 = androidx.compose.ui.unit.Dp.m(r28)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r13)
            int r1 = com.hansecom.abt.R.string.l1
            r2 = 0
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r0, r2)
            r1 = 0
            r2 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r12, r1, r15, r2)
            java.lang.String r2 = "set_autoload"
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.platform.TestTagKt.a(r1, r2)
            r1 = -2057698304(0xffffffff855a0400, float:-1.02510454E-35)
            r0.X(r1)
            boolean r1 = r0.W(r14)
            java.lang.Object r3 = r41.g()
            if (r1 != 0) goto L_0x06bb
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x06c3
        L_0x06bb:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.k r3 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.k
            r3.<init>(r14)
            r0.N(r3)
        L_0x06c3:
            r1 = r3
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r41.M()
            r9 = 48
            r10 = 108(0x6c, float:1.51E-43)
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = r41
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x06d6:
            r41.M()
            float r1 = r27.e()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r13)
            r41.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x06f0
            androidx.compose.runtime.ComposerKt.X()
        L_0x06f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt$ScreenImpl$1.i(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        i((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
