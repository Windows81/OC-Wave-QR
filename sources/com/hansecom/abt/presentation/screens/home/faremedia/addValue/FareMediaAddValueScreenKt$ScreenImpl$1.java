package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusManager;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareMediaAddValueScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36078A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FocusManager f36079B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaAddValue.State f36080z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f36081a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State$ValidationError[] r0 = com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue.State.ValidationError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State$ValidationError r1 = com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue.State.ValidationError.MIN_VALUE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State$ValidationError r1 = com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue.State.ValidationError.MAX_VALUE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State$ValidationError r1 = com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue.State.ValidationError.MAX_BALANCE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f36081a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueScreenKt$ScreenImpl$1.WhenMappings.<clinit>():void");
        }
    }

    public FareMediaAddValueScreenKt$ScreenImpl$1(FareMediaAddValue.State state, Function1 function1, FocusManager focusManager, Function0 function0, Function0 function02) {
        this.f36080z = state;
        this.f36078A = function1;
        this.f36079B = focusManager;
        this.C = function0;
        this.D = function02;
    }

    public static final Unit k(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new FareMediaAddValue.Action.ValueChange(str));
        return Unit.f40552a;
    }

    public static final Unit p(Function1 function1) {
        function1.invoke(FareMediaAddValue.Action.Confirm.f36057a);
        return Unit.f40552a;
    }

    public static final Unit q(Function1 function1) {
        function1.invoke(FareMediaAddValue.Action.Confirm.f36057a);
        return Unit.f40552a;
    }

    public static final Unit s(FocusManager focusManager, Function1 function1, String str) {
        Intrinsics.i(str, "it");
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(new FareMediaAddValue.Action.ValueChange(str));
        return Unit.f40552a;
    }

    public static final Unit t(Function1 function1, PaymentMethodState paymentMethodState) {
        Intrinsics.i(paymentMethodState, "it");
        function1.invoke(new FareMediaAddValue.Action.PaymentMethodChange(paymentMethodState));
        return Unit.f40552a;
    }

    public static final Unit u(FareMediaAddValue.State state, Function0 function0, Function0 function02) {
        if (state.d()) {
            function0.invoke();
        } else {
            function02.invoke();
        }
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x05b4  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(androidx.compose.runtime.Composer r42, int r43) {
        /*
            r41 = this;
            r0 = r41
            r15 = r42
            r1 = r43
            r13 = 3
            r2 = r1 & 3
            r14 = 2
            if (r2 != r14) goto L_0x0018
            boolean r2 = r42.t()
            if (r2 != 0) goto L_0x0013
            goto L_0x0018
        L_0x0013:
            r42.B()
            goto L_0x05b7
        L_0x0018:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            r12 = -1
            if (r2 == 0) goto L_0x0027
            r2 = 500912297(0x1ddb50a9, float:5.8052218E-21)
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.faremedia.addValue.ScreenImpl.<anonymous> (FareMediaAddValueScreen.kt:103)"
            androidx.compose.runtime.ComposerKt.Y(r2, r1, r12, r3)
        L_0x0027:
            r1 = -1454946305(0xffffffffa94747ff, float:-4.4249323E-14)
            r15.X(r1)
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State r1 = r0.f36080z
            boolean r1 = r1.c()
            r11 = 0
            if (r1 == 0) goto L_0x0046
            com.hansecom.abt.ui.components.loading.LoadingContentKt.b(r15, r11)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0042
            androidx.compose.runtime.ComposerKt.X()
        L_0x0042:
            r42.M()
            return
        L_0x0046:
            r42.M()
            androidx.compose.ui.Modifier$Companion r10 = androidx.compose.ui.Modifier.f15489d
            r9 = 0
            r8 = 1
            r7 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r10, r9, r8, r7)
            com.hansecom.abt.ui.theme.Dimensions r27 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r27.c()
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r9, r14, r7)
            androidx.compose.foundation.ScrollState r17 = androidx.compose.foundation.ScrollKt.c(r11, r15, r11, r8)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ScrollKt.g(r16, r17, r18, r19, r20, r21, r22)
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State r5 = r0.f36080z
            kotlin.jvm.functions.Function1 r6 = r0.f36078A
            androidx.compose.ui.focus.FocusManager r3 = r0.f36079B
            kotlin.jvm.functions.Function0 r4 = r0.C
            kotlin.jvm.functions.Function0 r2 = r0.D
            androidx.compose.foundation.layout.Arrangement r16 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r7 = r16.g()
            androidx.compose.ui.Alignment$Companion r16 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r8 = r16.k()
            androidx.compose.ui.layout.MeasurePolicy r7 = androidx.compose.foundation.layout.ColumnKt.a(r7, r8, r15, r11)
            int r8 = androidx.compose.runtime.ComposablesKt.a(r15, r11)
            androidx.compose.runtime.CompositionLocalMap r9 = r42.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r19 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r12 = r19.a()
            androidx.compose.runtime.Applier r21 = r42.v()
            if (r21 != 0) goto L_0x00a3
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00a3:
            r42.s()
            boolean r21 = r42.n()
            if (r21 == 0) goto L_0x00b0
            r15.y(r12)
            goto L_0x00b3
        L_0x00b0:
            r42.K()
        L_0x00b3:
            androidx.compose.runtime.Composer r12 = androidx.compose.runtime.Updater.b(r42)
            kotlin.jvm.functions.Function2 r13 = r19.c()
            androidx.compose.runtime.Updater.g(r12, r7, r13)
            kotlin.jvm.functions.Function2 r7 = r19.e()
            androidx.compose.runtime.Updater.g(r12, r9, r7)
            kotlin.jvm.functions.Function2 r7 = r19.b()
            boolean r9 = r12.n()
            if (r9 != 0) goto L_0x00dd
            java.lang.Object r9 = r12.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r13)
            if (r9 != 0) goto L_0x00eb
        L_0x00dd:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r12.N(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12.A(r8, r7)
        L_0x00eb:
            kotlin.jvm.functions.Function2 r7 = r19.d()
            androidx.compose.runtime.Updater.g(r12, r1, r7)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            java.lang.String r7 = r5.s()
            int r1 = com.hansecom.abt.R.string.r0
            java.lang.Object[] r8 = new java.lang.Object[r11]
            java.lang.String r8 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r8, r15, r11)
            float r29 = r27.d()
            r1 = 24
            float r13 = (float) r1
            float r31 = androidx.compose.ui.unit.Dp.m(r13)
            r32 = 5
            r33 = 0
            r28 = 0
            r30 = 0
            androidx.compose.foundation.layout.PaddingValues r9 = androidx.compose.foundation.layout.PaddingKt.e(r28, r29, r30, r31, r32, r33)
            r12 = 48
            r22 = 77
            r1 = 0
            r23 = 0
            r25 = 0
            r28 = 0
            r34 = r2
            r2 = r9
            r9 = r3
            r35 = r4
            r3 = r23
            r29 = r5
            r23 = r13
            r13 = r6
            r5 = r25
            r14 = 1
            r36 = r9
            r9 = r28
            r37 = r10
            r10 = r42
            r11 = r12
            r17 = -1
            r12 = r22
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            java.lang.String r1 = r29.u()
            boolean r2 = r29.v()
            r10 = r2 ^ 1
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State$ValidationError r2 = r29.i()
            if (r2 != 0) goto L_0x0155
            r12 = r17
            goto L_0x015d
        L_0x0155:
            int[] r3 = com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueScreenKt$ScreenImpl$1.WhenMappings.f36081a
            int r2 = r2.ordinal()
            r12 = r3[r2]
        L_0x015d:
            if (r12 == r14) goto L_0x01a6
            r2 = 2
            if (r12 == r2) goto L_0x0187
            r2 = 3
            if (r12 == r2) goto L_0x0173
            r2 = 1735629348(0x67739a24, float:1.15037845E24)
            r15.X(r2)
            r42.M()
            java.lang.String r2 = ""
            r5 = r2
            r12 = 0
            goto L_0x01c5
        L_0x0173:
            r2 = 610173310(0x245e817e, float:4.824826E-17)
            r15.X(r2)
            int r2 = com.hansecom.abt.R.string.m0
            r12 = 0
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.String r2 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r3, r15, r12)
            r42.M()
        L_0x0185:
            r5 = r2
            goto L_0x01c5
        L_0x0187:
            r12 = 0
            r2 = 610165897(0x245e6489, float:4.8223733E-17)
            r15.X(r2)
            int r2 = com.hansecom.abt.R.string.n0
            com.hansecom.abt.util.formatters.CurrencyValueFormater r3 = com.hansecom.abt.util.formatters.CurrencyValueFormater.f39045a
            java.math.BigDecimal r4 = r29.k()
            java.lang.String r3 = r3.a(r4, r12)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r3, r15, r12)
            r42.M()
            goto L_0x0185
        L_0x01a6:
            r12 = 0
            r2 = 610158473(0x245e4789, float:4.819917E-17)
            r15.X(r2)
            int r2 = com.hansecom.abt.R.string.o0
            com.hansecom.abt.util.formatters.CurrencyValueFormater r3 = com.hansecom.abt.util.formatters.CurrencyValueFormater.f39045a
            java.math.BigDecimal r4 = r29.l()
            java.lang.String r3 = r3.a(r4, r12)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r3, r15, r12)
            r42.M()
            goto L_0x0185
        L_0x01c5:
            int r2 = com.hansecom.abt.R.string.t0
            com.hansecom.abt.util.formatters.CurrencyValueFormater r3 = com.hansecom.abt.util.formatters.CurrencyValueFormater.f39045a
            java.math.BigDecimal r4 = r29.j()
            java.lang.String r3 = r3.a(r4, r12)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r3, r15, r12)
            androidx.compose.ui.text.input.ImeAction$Companion r2 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r9 = r2.b()
            java.lang.String r2 = "value_field"
            r11 = r37
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.platform.TestTagKt.a(r11, r2)
            r2 = 610153852(0x245e357c, float:4.818388E-17)
            r15.X(r2)
            boolean r2 = r15.W(r13)
            java.lang.Object r6 = r42.g()
            if (r2 != 0) goto L_0x01ff
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x0207
        L_0x01ff:
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.r r6 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.r
            r6.<init>(r13)
            r15.N(r6)
        L_0x0207:
            r2 = r6
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r42.M()
            r17 = 100663680(0x6000180, float:2.4075226E-35)
            r18 = 224(0xe0, float:3.14E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r14 = r11
            r11 = r42
            r12 = r17
            r0 = r13
            r28 = r23
            r13 = r18
            com.hansecom.abt.ui.components.formFields.ValueFieldKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            float r1 = androidx.compose.ui.unit.Dp.m(r28)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            r13 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r13)
            r1 = 1
            r11 = 0
            r12 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r14, r11, r1, r12)
            androidx.compose.ui.Alignment r1 = r16.e()
            r10 = 0
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.g(r1, r10)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r15, r10)
            androidx.compose.runtime.CompositionLocalMap r4 = r42.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r15, r2)
            kotlin.jvm.functions.Function0 r5 = r19.a()
            androidx.compose.runtime.Applier r6 = r42.v()
            if (r6 != 0) goto L_0x0257
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0257:
            r42.s()
            boolean r6 = r42.n()
            if (r6 == 0) goto L_0x0264
            r15.y(r5)
            goto L_0x0267
        L_0x0264:
            r42.K()
        L_0x0267:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r42)
            kotlin.jvm.functions.Function2 r6 = r19.c()
            androidx.compose.runtime.Updater.g(r5, r1, r6)
            kotlin.jvm.functions.Function2 r1 = r19.e()
            androidx.compose.runtime.Updater.g(r5, r4, r1)
            kotlin.jvm.functions.Function2 r1 = r19.b()
            boolean r4 = r5.n()
            if (r4 != 0) goto L_0x0291
            java.lang.Object r4 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r6)
            if (r4 != 0) goto L_0x029f
        L_0x0291:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.A(r3, r1)
        L_0x029f:
            kotlin.jvm.functions.Function2 r1 = r19.d()
            androidx.compose.runtime.Updater.g(r5, r2, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            r9 = 1
            float r1 = (float) r9
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.OffsetKt.c(r14, r11, r1, r9, r12)
            com.hansecom.abt.ui.theme.AbtTheme r8 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r2 = r8.b(r15, r13)
            long r3 = r2.u()
            r6 = 6
            r7 = 2
            r2 = 0
            r5 = r42
            androidx.compose.material3.DividerKt.e(r1, r2, r3, r5, r6, r7)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r1 = r8.b(r15, r13)
            long r3 = r1.z()
            r6 = 2
            r7 = 0
            r5 = 0
            r2 = r14
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.BackgroundKt.b(r2, r3, r5, r6, r7)
            r2 = 8
            float r2 = (float) r2
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            r6 = 2
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r11, r6, r12)
            int r1 = com.hansecom.abt.R.string.q0
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.String r1 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r3, r15, r10)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r3 = r8.b(r15, r13)
            long r3 = r3.q()
            com.hansecom.abt.ui.theme.typography.AbtTypography r5 = r8.d(r15, r13)
            androidx.compose.ui.text.TextStyle r22 = r5.b()
            r25 = 0
            r26 = 131064(0x1fff8, float:1.8366E-40)
            r5 = 0
            r16 = 0
            r18 = r6
            r6 = r16
            r16 = 0
            r38 = r8
            r8 = r16
            r17 = r9
            r9 = r16
            r10 = r16
            r19 = 0
            r11 = r19
            r13 = r16
            r39 = r14
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r23 = r42
            androidx.compose.material3.TextKt.j(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r42.T()
            float r1 = androidx.compose.ui.unit.Dp.m(r28)
            r15 = r39
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r15, r1)
            r14 = r42
            r13 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r14, r13)
            r10 = 0
            r11 = 0
            r12 = 1
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r15, r11, r12, r10)
            kotlinx.collections.immutable.PersistentList r2 = r29.p()
            java.lang.String r1 = r29.u()
            boolean r3 = r29.v()
            r5 = r3 ^ 1
            r3 = 610226286(0x245f506e, float:4.8423543E-17)
            r14.X(r3)
            r3 = r36
            boolean r6 = r14.l(r3)
            boolean r7 = r14.W(r0)
            r6 = r6 | r7
            java.lang.Object r7 = r42.g()
            if (r6 != 0) goto L_0x0376
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x037e
        L_0x0376:
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.s r7 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.s
            r7.<init>(r3, r0)
            r14.N(r7)
        L_0x037e:
            r3 = r7
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r42.M()
            r7 = 3072(0xc00, float:4.305E-42)
            r8 = 0
            r6 = r42
            com.hansecom.abt.ui.components.quickSelectionButton.QuickSelectionGridKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            float r1 = androidx.compose.ui.unit.Dp.m(r28)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r15, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r14, r13)
            r8 = r38
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r1 = r8.b(r14, r13)
            long r3 = r1.u()
            r6 = 0
            r7 = 3
            r1 = 0
            r2 = 0
            r5 = r42
            androidx.compose.material3.DividerKt.e(r1, r2, r3, r5, r6, r7)
            float r1 = androidx.compose.ui.unit.Dp.m(r28)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r15, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r14, r13)
            int r1 = com.hansecom.abt.R.string.p0
            r9 = 0
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r1 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r14, r9)
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = r8.d(r14, r13)
            androidx.compose.ui.text.TextStyle r22 = r2.f()
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r15, r11, r12, r10)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r3 = r8.b(r14, r13)
            long r3 = r3.q()
            r25 = 0
            r26 = 131064(0x1fff8, float:1.8366E-40)
            r5 = 0
            r6 = 0
            r8 = 0
            r16 = 0
            r9 = r16
            r10 = r16
            r16 = 0
            r11 = r16
            r16 = 0
            r13 = r16
            r14 = r16
            r16 = 0
            r40 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 48
            r23 = r42
            androidx.compose.material3.TextKt.j(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            float r1 = androidx.compose.ui.unit.Dp.m(r28)
            r12 = r40
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            r13 = r42
            r14 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r14)
            com.hansecom.abt.presentation.model.PaymentMethodState r1 = r29.n()
            kotlinx.collections.immutable.PersistentList r2 = r29.o()
            r3 = 610252900(0x245fb864, float:4.8511602E-17)
            r13.X(r3)
            boolean r3 = r13.W(r0)
            java.lang.Object r4 = r42.g()
            if (r3 != 0) goto L_0x0432
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x043a
        L_0x0432:
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.t r4 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.t
            r4.<init>(r0)
            r13.N(r4)
        L_0x043a:
            r3 = r4
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r42.M()
            r10 = 0
            r11 = 248(0xf8, float:3.48E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = r42
            com.hansecom.abt.presentation.screens.payment.PaymentMethodSelectorKt.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            float r1 = androidx.compose.ui.unit.Dp.m(r28)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r14)
            com.hansecom.abt.presentation.model.PaymentMethodState r1 = r29.n()
            boolean r1 = r1 instanceof com.hansecom.abt.presentation.model.PaymentMethodState.Cash
            if (r1 == 0) goto L_0x04c3
            r0 = 1738161306(0x679a3c9a, float:1.4567247E24)
            r13.X(r0)
            int r0 = com.hansecom.abt.R.string.j0
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r0, r2, r13, r1)
            int r0 = com.hansecom.abt.R.drawable.f33008j
            r2 = 0
            r3 = 1
            r4 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r12, r2, r3, r4)
            r1 = 610260655(0x245fd6af, float:4.853726E-17)
            r13.X(r1)
            r6 = r29
            boolean r1 = r13.l(r6)
            r3 = r35
            boolean r4 = r13.W(r3)
            r1 = r1 | r4
            r4 = r34
            boolean r7 = r13.W(r4)
            r1 = r1 | r7
            java.lang.Object r7 = r42.g()
            if (r1 != 0) goto L_0x04a0
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r7 != r1) goto L_0x04a8
        L_0x04a0:
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.u r7 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.u
            r7.<init>(r6, r3, r4)
            r13.N(r7)
        L_0x04a8:
            r1 = r7
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r42.M()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r9 = 48
            r10 = 76
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = r42
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r42.M()
            goto L_0x05a0
        L_0x04c3:
            r6 = r29
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 1738711432(0x67a2a188, float:1.5360062E24)
            r13.X(r5)
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueScreenKt.m(r6, r0, r13, r1)
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueScreenKt.D(r6, r13, r1)
            float r5 = androidx.compose.ui.unit.Dp.m(r28)
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.i(r12, r5)
            androidx.compose.foundation.layout.SpacerKt.a(r5, r13, r14)
            boolean r5 = r6.y()
            if (r5 == 0) goto L_0x059d
            com.hansecom.abt.presentation.model.PaymentMethodState r5 = r6.n()
            boolean r5 = r5 instanceof com.hansecom.abt.presentation.model.PaymentMethodState.GooglePay
            if (r5 == 0) goto L_0x0538
            r1 = 1738952333(0x67a64e8d, float:1.5707237E24)
            r13.X(r1)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.h(r12, r2, r3, r4)
            com.hansecom.abt.presentation.model.PaymentMethodState r1 = r6.n()
            com.hansecom.abt.presentation.model.PaymentMethodState$GooglePay r1 = (com.hansecom.abt.presentation.model.PaymentMethodState.GooglePay) r1
            java.lang.String r1 = r1.a()
            boolean r4 = r6.x()
            r2 = 610288852(0x246044d4, float:4.8630557E-17)
            r13.X(r2)
            boolean r2 = r13.W(r0)
            java.lang.Object r5 = r42.g()
            if (r2 != 0) goto L_0x051e
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x0526
        L_0x051e:
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.v r5 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.v
            r5.<init>(r0)
            r13.N(r5)
        L_0x0526:
            r2 = r5
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r42.M()
            r6 = 384(0x180, float:5.38E-43)
            r7 = 0
            r5 = r42
            com.hansecom.abt.ui.components.googlePay.GooglePayButtonKt.b(r1, r2, r3, r4, r5, r6, r7)
            r42.M()
            goto L_0x059d
        L_0x0538:
            r5 = 1739339895(0x67ac3877, float:1.6265773E24)
            r13.X(r5)
            boolean r5 = r6.x()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6 = 2
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r5 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r5, r4, r6, r4)
            int r6 = com.hansecom.abt.R.string.i0
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r6 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r6, r7, r13, r1)
            int r1 = com.hansecom.abt.R.drawable.U
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r12, r2, r3, r4)
            java.lang.String r3 = "pay_now"
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.platform.TestTagKt.a(r2, r3)
            r3 = 610298932(0x24606c34, float:4.866391E-17)
            r13.X(r3)
            boolean r3 = r13.W(r0)
            java.lang.Object r4 = r42.g()
            if (r3 != 0) goto L_0x0578
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0580
        L_0x0578:
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.w r4 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.w
            r4.<init>(r0)
            r13.N(r4)
        L_0x0580:
            r0 = r4
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r42.M()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r9 = 48
            r10 = 68
            r3 = 0
            r8 = 0
            r1 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r42
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r42.M()
        L_0x059d:
            r42.M()
        L_0x05a0:
            float r0 = r27.e()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.i(r12, r0)
            androidx.compose.foundation.layout.SpacerKt.a(r0, r13, r14)
            r42.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x05b7
            androidx.compose.runtime.ComposerKt.X()
        L_0x05b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueScreenKt$ScreenImpl$1.i(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        i((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
