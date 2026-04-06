package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostKt;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HelpRequestScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f34850A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AbtSnackbarHostState f34851B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ FocusManager D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.State f34852z;

    public HelpRequestScreenKt$ScreenImpl$1(HelpRequest.State state, Function0 function0, AbtSnackbarHostState abtSnackbarHostState, Function1 function1, FocusManager focusManager) {
        this.f34852z = state;
        this.f34850A = function0;
        this.f34851B = abtSnackbarHostState;
        this.C = function1;
        this.D = focusManager;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(471025756, i3, -1, "com.hansecom.abt.presentation.screens.helpRequest.ScreenImpl.<anonymous> (HelpRequestScreen.kt:81)");
            }
            final HelpRequest.State state = this.f34852z;
            final Function0 function0 = this.f34850A;
            ComposableLambda e2 = ComposableLambdaKt.e(723485984, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if ((i2 & 3) != 2 || !composer.t()) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(723485984, i2, -1, "com.hansecom.abt.presentation.screens.helpRequest.ScreenImpl.<anonymous>.<anonymous> (HelpRequestScreen.kt:83)");
                        }
                        if (state.J()) {
                            AbtTopBarKt.b(StringResourceKt.a(R.string.t6, new Object[0], composer, 0), (Modifier) null, function0, (Function3) null, false, composer, 0, 26);
                        }
                        if (ComposerKt.P()) {
                            ComposerKt.X();
                            return;
                        }
                        return;
                    }
                    composer.B();
                }

                public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                    b((Composer) obj, ((Number) obj2).intValue());
                    return Unit.f40552a;
                }
            }, composer2, 54);
            final HelpRequest.State state2 = this.f34852z;
            final AbtSnackbarHostState abtSnackbarHostState = this.f34851B;
            ComposableLambda e3 = ComposableLambdaKt.e(-1357097694, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if ((i2 & 3) != 2 || !composer.t()) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-1357097694, i2, -1, "com.hansecom.abt.presentation.screens.helpRequest.ScreenImpl.<anonymous>.<anonymous> (HelpRequestScreen.kt:91)");
                        }
                        if (state2.J()) {
                            AbtSnackbarHostKt.b(abtSnackbarHostState, (Modifier) null, composer, 0, 2);
                        }
                        if (ComposerKt.P()) {
                            ComposerKt.X();
                            return;
                        }
                        return;
                    }
                    composer.B();
                }

                public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                    b((Composer) obj, ((Number) obj2).intValue());
                    return Unit.f40552a;
                }
            }, composer2, 54);
            final HelpRequest.State state3 = this.f34852z;
            final Function1 function1 = this.C;
            final FocusManager focusManager = this.D;
            ScaffoldKt.f((Modifier) null, e2, (Function2) null, e3, (Function2) null, 0, 0, 0, (WindowInsets) null, ComposableLambdaKt.e(693338603, true, new Function3<PaddingValues, Composer, Integer, Unit>() {
                /* access modifiers changed from: private */
                public static final Unit k(Function1 function1, String str) {
                    Intrinsics.i(str, "it");
                    function1.invoke(new HelpRequest.Action.ContactNameChange(str));
                    return Unit.f40552a;
                }

                public static final Unit p(FocusManager focusManager, Function1 function1) {
                    FocusManager.g(focusManager, false, 1, (Object) null);
                    function1.invoke(HelpRequest.Action.Send.f34836a);
                    return Unit.f40552a;
                }

                /* access modifiers changed from: private */
                public static final Unit q(Function1 function1, String str) {
                    Intrinsics.i(str, "it");
                    function1.invoke(new HelpRequest.Action.EmailChange(str));
                    return Unit.f40552a;
                }

                public static final Unit s(Function1 function1, String str) {
                    Intrinsics.i(str, "it");
                    function1.invoke(new HelpRequest.Action.PhoneChange(str));
                    return Unit.f40552a;
                }

                public static final Unit t(Function1 function1, String str) {
                    Intrinsics.i(str, "it");
                    function1.invoke(new HelpRequest.Action.SubjectChange(str));
                    return Unit.f40552a;
                }

                public static final Unit u(Function1 function1, String str) {
                    Intrinsics.i(str, "it");
                    function1.invoke(new HelpRequest.Action.DescriptionChange(str));
                    return Unit.f40552a;
                }

                public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
                    i((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.f40552a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: kotlin.jvm.functions.Function0} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: kotlin.jvm.functions.Function1} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: kotlin.jvm.functions.Function1} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: kotlin.jvm.functions.Function1} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: kotlin.jvm.functions.Function1} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v64, resolved type: kotlin.jvm.functions.Function1} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void i(androidx.compose.foundation.layout.PaddingValues r38, androidx.compose.runtime.Composer r39, int r40) {
                    /*
                        r37 = this;
                        r0 = r37
                        r1 = r38
                        r15 = r39
                        java.lang.String r2 = "innerPadding"
                        kotlin.jvm.internal.Intrinsics.i(r1, r2)
                        r2 = 6
                        r3 = r40 & 6
                        r4 = 2
                        if (r3 != 0) goto L_0x001d
                        boolean r3 = r15.W(r1)
                        if (r3 == 0) goto L_0x0019
                        r3 = 4
                        goto L_0x001a
                    L_0x0019:
                        r3 = r4
                    L_0x001a:
                        r3 = r40 | r3
                        goto L_0x001f
                    L_0x001d:
                        r3 = r40
                    L_0x001f:
                        r5 = r3 & 19
                        r6 = 18
                        if (r5 != r6) goto L_0x0031
                        boolean r5 = r39.t()
                        if (r5 != 0) goto L_0x002c
                        goto L_0x0031
                    L_0x002c:
                        r39.B()
                        goto L_0x051f
                    L_0x0031:
                        boolean r5 = androidx.compose.runtime.ComposerKt.P()
                        if (r5 == 0) goto L_0x0040
                        r5 = -1
                        java.lang.String r6 = "com.hansecom.abt.presentation.screens.helpRequest.ScreenImpl.<anonymous>.<anonymous> (HelpRequestScreen.kt:96)"
                        r7 = 693338603(0x295381eb, float:4.6964098E-14)
                        androidx.compose.runtime.ComposerKt.Y(r7, r3, r5, r6)
                    L_0x0040:
                        androidx.compose.ui.Modifier$Companion r14 = androidx.compose.ui.Modifier.f15489d
                        androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.h(r14, r1)
                        r13 = 0
                        r12 = 1
                        r11 = 0
                        androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.SizeKt.f(r1, r13, r12, r11)
                        r10 = 0
                        androidx.compose.foundation.ScrollState r17 = androidx.compose.foundation.ScrollKt.c(r10, r15, r10, r12)
                        r21 = 14
                        r22 = 0
                        r18 = 0
                        r19 = 0
                        r20 = 0
                        androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ScrollKt.g(r16, r17, r18, r19, r20, r21, r22)
                        com.hansecom.abt.ui.theme.Dimensions r3 = com.hansecom.abt.ui.theme.Dimensions.f38856a
                        float r5 = r3.c()
                        androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.PaddingKt.k(r1, r5, r13, r4, r11)
                        float r20 = r3.e()
                        r21 = 7
                        r17 = 0
                        r18 = 0
                        r19 = 0
                        androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.m(r16, r17, r18, r19, r20, r21, r22)
                        androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
                        r4 = 8
                        float r4 = (float) r4
                        float r4 = androidx.compose.ui.unit.Dp.m(r4)
                        androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r3 = r3.n(r4)
                        com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r9 = r6
                        kotlin.jvm.functions.Function1 r8 = r7
                        androidx.compose.ui.focus.FocusManager r7 = r8
                        androidx.compose.ui.Alignment$Companion r4 = androidx.compose.ui.Alignment.f15444a
                        androidx.compose.ui.Alignment$Horizontal r4 = r4.k()
                        androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r3, r4, r15, r2)
                        int r3 = androidx.compose.runtime.ComposablesKt.a(r15, r10)
                        androidx.compose.runtime.CompositionLocalMap r4 = r39.I()
                        androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
                        androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
                        kotlin.jvm.functions.Function0 r6 = r5.a()
                        androidx.compose.runtime.Applier r16 = r39.v()
                        if (r16 != 0) goto L_0x00b2
                        androidx.compose.runtime.ComposablesKt.d()
                    L_0x00b2:
                        r39.s()
                        boolean r16 = r39.n()
                        if (r16 == 0) goto L_0x00bf
                        r15.y(r6)
                        goto L_0x00c2
                    L_0x00bf:
                        r39.K()
                    L_0x00c2:
                        androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r39)
                        kotlin.jvm.functions.Function2 r11 = r5.c()
                        androidx.compose.runtime.Updater.g(r6, r2, r11)
                        kotlin.jvm.functions.Function2 r2 = r5.e()
                        androidx.compose.runtime.Updater.g(r6, r4, r2)
                        kotlin.jvm.functions.Function2 r2 = r5.b()
                        boolean r4 = r6.n()
                        if (r4 != 0) goto L_0x00ec
                        java.lang.Object r4 = r6.g()
                        java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
                        boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r11)
                        if (r4 != 0) goto L_0x00fa
                    L_0x00ec:
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                        r6.N(r4)
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                        r6.A(r3, r2)
                    L_0x00fa:
                        kotlin.jvm.functions.Function2 r2 = r5.d()
                        androidx.compose.runtime.Updater.g(r6, r1, r2)
                        androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
                        int r1 = com.hansecom.abt.R.string.f6
                        java.lang.Object[] r2 = new java.lang.Object[r10]
                        java.lang.String r11 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r15, r10)
                        int r1 = com.hansecom.abt.R.string.m6
                        java.lang.Object[] r2 = new java.lang.Object[r10]
                        java.lang.String r16 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r15, r10)
                        r17 = 0
                        r18 = 79
                        r1 = 0
                        r2 = 0
                        r3 = 0
                        r5 = 0
                        r19 = 0
                        r23 = r7
                        r7 = r11
                        r11 = r8
                        r8 = r16
                        r40 = r9
                        r9 = r19
                        r13 = r10
                        r10 = r39
                        r25 = r11
                        r11 = r17
                        r12 = r18
                        com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
                        r1 = -1409871520(0xffffffffabf71160, float:-1.7555228E-12)
                        r15.X(r1)
                        com.hansecom.abt.data.config.help.HelpScreenConfig r1 = r40.v()
                        java.lang.Boolean r1 = r1.e()
                        if (r1 == 0) goto L_0x01c4
                        java.lang.String r1 = r40.w()
                        int r2 = com.hansecom.abt.R.string.X5
                        com.hansecom.abt.data.config.help.HelpScreenConfig r3 = r40.v()
                        java.lang.Boolean r3 = r3.e()
                        java.lang.String r3 = com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt.x0(r2, r3, r15, r13)
                        int r2 = com.hansecom.abt.R.string.Y5
                        java.lang.Object[] r4 = new java.lang.Object[r13]
                        java.lang.String r6 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r4, r15, r13)
                        com.hansecom.abt.util.resourcesResolvers.StringValue r2 = r40.x()
                        java.lang.Object[] r4 = new java.lang.Object[r13]
                        java.lang.String r4 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r2, r4, r15, r13)
                        r5 = 0
                        r11 = 0
                        r12 = 1
                        androidx.compose.ui.Modifier r17 = androidx.compose.foundation.layout.SizeKt.h(r14, r5, r12, r11)
                        androidx.compose.ui.text.input.ImeAction$Companion r2 = androidx.compose.ui.text.input.ImeAction.f18821b
                        int r21 = r2.d()
                        r2 = -1409866070(0xffffffffabf726aa, float:-1.7561137E-12)
                        r15.X(r2)
                        r10 = r25
                        boolean r2 = r15.W(r10)
                        java.lang.Object r7 = r39.g()
                        if (r2 != 0) goto L_0x0190
                        androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
                        java.lang.Object r2 = r2.a()
                        if (r7 != r2) goto L_0x0198
                    L_0x0190:
                        com.hansecom.abt.presentation.screens.helpRequest.U r7 = new com.hansecom.abt.presentation.screens.helpRequest.U
                        r7.<init>(r10)
                        r15.N(r7)
                    L_0x0198:
                        r2 = r7
                        kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
                        r39.M()
                        r19 = 48
                        r20 = 63424(0xf7c0, float:8.8876E-41)
                        r7 = 0
                        r8 = 0
                        r9 = 0
                        r16 = 0
                        r26 = r10
                        r10 = r16
                        r11 = r16
                        r16 = 0
                        r13 = r16
                        r27 = r14
                        r14 = r16
                        r15 = r16
                        r18 = 24576(0x6000, float:3.4438E-41)
                        r5 = r17
                        r12 = r21
                        r17 = r39
                        com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                        goto L_0x01c8
                    L_0x01c4:
                        r27 = r14
                        r26 = r25
                    L_0x01c8:
                        r39.M()
                        r1 = -1409848396(0xffffffffabf76bb4, float:-1.7580299E-12)
                        r12 = r39
                        r12.X(r1)
                        com.hansecom.abt.data.config.help.HelpScreenConfig r1 = r40.v()
                        java.lang.Boolean r1 = r1.g()
                        if (r1 == 0) goto L_0x0260
                        java.lang.String r1 = r40.A()
                        int r2 = com.hansecom.abt.R.string.d6
                        com.hansecom.abt.data.config.help.HelpScreenConfig r3 = r40.v()
                        java.lang.Boolean r3 = r3.g()
                        r6 = 0
                        java.lang.String r3 = com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt.x0(r2, r3, r12, r6)
                        int r2 = com.hansecom.abt.R.string.e6
                        java.lang.Object[] r4 = new java.lang.Object[r6]
                        java.lang.String r17 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r4, r12, r6)
                        com.hansecom.abt.util.resourcesResolvers.StringValue r2 = r40.B()
                        java.lang.Object[] r4 = new java.lang.Object[r6]
                        java.lang.String r4 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r2, r4, r12, r6)
                        r5 = r27
                        r13 = 0
                        r14 = 1
                        r15 = 0
                        androidx.compose.ui.Modifier r21 = androidx.compose.foundation.layout.SizeKt.h(r5, r15, r14, r13)
                        androidx.compose.ui.text.input.ImeAction$Companion r2 = androidx.compose.ui.text.input.ImeAction.f18821b
                        int r22 = r2.d()
                        r2 = -1409843292(0xffffffffabf77fa4, float:-1.7585833E-12)
                        r12.X(r2)
                        r11 = r26
                        boolean r2 = r12.W(r11)
                        java.lang.Object r7 = r39.g()
                        if (r2 != 0) goto L_0x022b
                        androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
                        java.lang.Object r2 = r2.a()
                        if (r7 != r2) goto L_0x0233
                    L_0x022b:
                        com.hansecom.abt.presentation.screens.helpRequest.V r7 = new com.hansecom.abt.presentation.screens.helpRequest.V
                        r7.<init>(r11)
                        r12.N(r7)
                    L_0x0233:
                        r2 = r7
                        kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
                        r39.M()
                        r19 = 48
                        r20 = 63424(0xf7c0, float:8.8876E-41)
                        r7 = 0
                        r8 = 0
                        r9 = 0
                        r10 = 0
                        r16 = 0
                        r28 = r11
                        r11 = r16
                        r16 = 0
                        r13 = r16
                        r14 = r16
                        r15 = r16
                        r18 = 24576(0x6000, float:3.4438E-41)
                        r29 = r5
                        r5 = r21
                        r6 = r17
                        r12 = r22
                        r17 = r39
                        com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                        goto L_0x0264
                    L_0x0260:
                        r28 = r26
                        r29 = r27
                    L_0x0264:
                        r39.M()
                        r1 = -1409826618(0xffffffffabf7c0c6, float:-1.7603911E-12)
                        r12 = r39
                        r12.X(r1)
                        com.hansecom.abt.data.config.help.HelpScreenConfig r1 = r40.v()
                        java.lang.Boolean r1 = r1.h()
                        if (r1 == 0) goto L_0x02fc
                        java.lang.String r1 = r40.F()
                        int r2 = com.hansecom.abt.R.string.j6
                        com.hansecom.abt.data.config.help.HelpScreenConfig r3 = r40.v()
                        java.lang.Boolean r3 = r3.h()
                        r6 = 0
                        java.lang.String r3 = com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt.x0(r2, r3, r12, r6)
                        int r2 = com.hansecom.abt.R.string.k6
                        java.lang.Object[] r4 = new java.lang.Object[r6]
                        java.lang.String r17 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r4, r12, r6)
                        com.hansecom.abt.util.resourcesResolvers.StringValue r2 = r40.D()
                        java.lang.Object[] r4 = new java.lang.Object[r6]
                        java.lang.String r4 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r2, r4, r12, r6)
                        r5 = r29
                        r13 = 0
                        r14 = 1
                        r15 = 0
                        androidx.compose.ui.Modifier r21 = androidx.compose.foundation.layout.SizeKt.h(r5, r15, r14, r13)
                        androidx.compose.ui.text.input.ImeAction$Companion r2 = androidx.compose.ui.text.input.ImeAction.f18821b
                        int r22 = r2.d()
                        r2 = -1409821148(0xffffffffabf7d624, float:-1.7609842E-12)
                        r12.X(r2)
                        r11 = r28
                        boolean r2 = r12.W(r11)
                        java.lang.Object r7 = r39.g()
                        if (r2 != 0) goto L_0x02c7
                        androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
                        java.lang.Object r2 = r2.a()
                        if (r7 != r2) goto L_0x02cf
                    L_0x02c7:
                        com.hansecom.abt.presentation.screens.helpRequest.W r7 = new com.hansecom.abt.presentation.screens.helpRequest.W
                        r7.<init>(r11)
                        r12.N(r7)
                    L_0x02cf:
                        r2 = r7
                        kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
                        r39.M()
                        r19 = 48
                        r20 = 63424(0xf7c0, float:8.8876E-41)
                        r7 = 0
                        r8 = 0
                        r9 = 0
                        r10 = 0
                        r16 = 0
                        r30 = r11
                        r11 = r16
                        r16 = 0
                        r13 = r16
                        r14 = r16
                        r15 = r16
                        r18 = 24576(0x6000, float:3.4438E-41)
                        r31 = r5
                        r5 = r21
                        r6 = r17
                        r12 = r22
                        r17 = r39
                        com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                        goto L_0x0300
                    L_0x02fc:
                        r30 = r28
                        r31 = r29
                    L_0x0300:
                        r39.M()
                        r1 = -1409804286(0xffffffffabf81802, float:-1.7628123E-12)
                        r12 = r39
                        r12.X(r1)
                        com.hansecom.abt.data.config.help.HelpScreenConfig r1 = r40.v()
                        java.lang.Boolean r1 = r1.i()
                        if (r1 == 0) goto L_0x0398
                        java.lang.String r1 = r40.K()
                        int r2 = com.hansecom.abt.R.string.o6
                        com.hansecom.abt.data.config.help.HelpScreenConfig r3 = r40.v()
                        java.lang.Boolean r3 = r3.i()
                        r6 = 0
                        java.lang.String r3 = com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt.x0(r2, r3, r12, r6)
                        int r2 = com.hansecom.abt.R.string.p6
                        java.lang.Object[] r4 = new java.lang.Object[r6]
                        java.lang.String r17 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r4, r12, r6)
                        com.hansecom.abt.util.resourcesResolvers.StringValue r2 = r40.L()
                        java.lang.Object[] r4 = new java.lang.Object[r6]
                        java.lang.String r4 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r2, r4, r12, r6)
                        r5 = r31
                        r13 = 0
                        r14 = 1
                        r15 = 0
                        androidx.compose.ui.Modifier r21 = androidx.compose.foundation.layout.SizeKt.h(r5, r15, r14, r13)
                        androidx.compose.ui.text.input.ImeAction$Companion r2 = androidx.compose.ui.text.input.ImeAction.f18821b
                        int r22 = r2.d()
                        r2 = -1409799066(0xffffffffabf82c66, float:-1.7633783E-12)
                        r12.X(r2)
                        r11 = r30
                        boolean r2 = r12.W(r11)
                        java.lang.Object r7 = r39.g()
                        if (r2 != 0) goto L_0x0363
                        androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
                        java.lang.Object r2 = r2.a()
                        if (r7 != r2) goto L_0x036b
                    L_0x0363:
                        com.hansecom.abt.presentation.screens.helpRequest.X r7 = new com.hansecom.abt.presentation.screens.helpRequest.X
                        r7.<init>(r11)
                        r12.N(r7)
                    L_0x036b:
                        r2 = r7
                        kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
                        r39.M()
                        r19 = 48
                        r20 = 63424(0xf7c0, float:8.8876E-41)
                        r7 = 0
                        r8 = 0
                        r9 = 0
                        r10 = 0
                        r16 = 0
                        r32 = r11
                        r11 = r16
                        r16 = 0
                        r13 = r16
                        r14 = r16
                        r15 = r16
                        r18 = 24576(0x6000, float:3.4438E-41)
                        r33 = r5
                        r5 = r21
                        r6 = r17
                        r12 = r22
                        r17 = r39
                        com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                        goto L_0x039c
                    L_0x0398:
                        r32 = r30
                        r33 = r31
                    L_0x039c:
                        r39.M()
                        r1 = -1409782620(0xffffffffabf86ca4, float:-1.7651614E-12)
                        r6 = r39
                        r6.X(r1)
                        com.hansecom.abt.data.config.help.HelpScreenConfig r1 = r40.v()
                        java.lang.Boolean r1 = r1.a()
                        r4 = r40
                        if (r1 == 0) goto L_0x03bc
                        r1 = r23
                        r3 = r32
                        r5 = 0
                        com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt.F(r4, r3, r1, r6, r5)
                        goto L_0x03c1
                    L_0x03bc:
                        r1 = r23
                        r3 = r32
                        r5 = 0
                    L_0x03c1:
                        r39.M()
                        r2 = -1409777113(0xffffffffabf88227, float:-1.7657584E-12)
                        r6.X(r2)
                        com.hansecom.abt.data.config.help.HelpScreenConfig r2 = r4.v()
                        java.lang.Boolean r2 = r2.f()
                        if (r2 == 0) goto L_0x0463
                        java.lang.String r17 = r4.y()
                        int r2 = com.hansecom.abt.R.string.a6
                        com.hansecom.abt.data.config.help.HelpScreenConfig r7 = r4.v()
                        java.lang.Boolean r7 = r7.f()
                        java.lang.String r21 = com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt.x0(r2, r7, r6, r5)
                        int r2 = com.hansecom.abt.R.string.b6
                        java.lang.Object[] r7 = new java.lang.Object[r5]
                        java.lang.String r22 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r7, r6, r5)
                        com.hansecom.abt.util.resourcesResolvers.StringValue r2 = r4.z()
                        java.lang.Object[] r7 = new java.lang.Object[r5]
                        java.lang.String r23 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r2, r7, r6, r5)
                        r15 = r33
                        r12 = 0
                        r13 = 1
                        r14 = 0
                        androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r15, r14, r13, r12)
                        r7 = 168(0xa8, float:2.35E-43)
                        float r7 = (float) r7
                        float r7 = androidx.compose.ui.unit.Dp.m(r7)
                        androidx.compose.ui.Modifier r24 = androidx.compose.foundation.layout.SizeKt.i(r2, r7)
                        r2 = -1409771734(0xffffffffabf8972a, float:-1.7663416E-12)
                        r6.X(r2)
                        boolean r2 = r6.W(r3)
                        java.lang.Object r7 = r39.g()
                        if (r2 != 0) goto L_0x0424
                        androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
                        java.lang.Object r2 = r2.a()
                        if (r7 != r2) goto L_0x042c
                    L_0x0424:
                        com.hansecom.abt.presentation.screens.helpRequest.Y r7 = new com.hansecom.abt.presentation.screens.helpRequest.Y
                        r7.<init>(r3)
                        r6.N(r7)
                    L_0x042c:
                        r2 = r7
                        kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
                        r39.M()
                        r19 = 0
                        r20 = 65344(0xff40, float:9.1566E-41)
                        r7 = 0
                        r8 = 0
                        r9 = 0
                        r10 = 0
                        r11 = 0
                        r16 = 0
                        r12 = r16
                        r16 = 0
                        r13 = r16
                        r14 = r16
                        r34 = r15
                        r15 = r16
                        r18 = 12607488(0xc06000, float:1.7666854E-38)
                        r35 = r1
                        r1 = r17
                        r36 = r3
                        r3 = r21
                        r40 = r4
                        r4 = r23
                        r5 = r24
                        r6 = r22
                        r17 = r39
                        com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                        goto L_0x046b
                    L_0x0463:
                        r35 = r1
                        r36 = r3
                        r40 = r4
                        r34 = r33
                    L_0x046b:
                        r39.M()
                        r1 = -1409752317(0xffffffffabf8e303, float:-1.7684468E-12)
                        r11 = r39
                        r11.X(r1)
                        com.hansecom.abt.data.config.help.HelpScreenConfig r1 = r40.v()
                        java.lang.Boolean r1 = r1.c()
                        r2 = r40
                        r4 = r35
                        r3 = r36
                        if (r1 == 0) goto L_0x048b
                        r1 = 0
                        com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt.V(r2, r3, r4, r11, r1)
                        goto L_0x048c
                    L_0x048b:
                        r1 = 0
                    L_0x048c:
                        r39.M()
                        r5 = -1409747481(0xffffffffabf8f5e7, float:-1.7689711E-12)
                        r11.X(r5)
                        com.hansecom.abt.data.config.help.HelpScreenConfig r5 = r2.v()
                        java.lang.Boolean r5 = r5.b()
                        if (r5 == 0) goto L_0x04a2
                        com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt.N(r2, r3, r4, r11, r1)
                    L_0x04a2:
                        r39.M()
                        r5 = -1409742517(0xffffffffabf9094b, float:-1.7695093E-12)
                        r11.X(r5)
                        com.hansecom.abt.data.config.help.HelpScreenConfig r5 = r2.v()
                        java.lang.Boolean r5 = r5.d()
                        if (r5 == 0) goto L_0x04b8
                        com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt.d0(r2, r3, r4, r11, r1)
                    L_0x04b8:
                        r39.M()
                        int r5 = com.hansecom.abt.R.string.l6
                        java.lang.Object[] r6 = new java.lang.Object[r1]
                        java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r5, r6, r11, r1)
                        r1 = r34
                        r6 = 0
                        r7 = 1
                        r8 = 0
                        androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.h(r1, r6, r7, r8)
                        boolean r1 = r2.H()
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                        com.hansecom.abt.ui.components.abtButton.AbtButtonState r7 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r8, r1, r7, r8)
                        r1 = -1409728765(0xffffffffabf93f03, float:-1.7710003E-12)
                        r11.X(r1)
                        boolean r1 = r11.l(r4)
                        boolean r2 = r11.W(r3)
                        r1 = r1 | r2
                        java.lang.Object r2 = r39.g()
                        if (r1 != 0) goto L_0x04f5
                        androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
                        java.lang.Object r1 = r1.a()
                        if (r2 != r1) goto L_0x04fd
                    L_0x04f5:
                        com.hansecom.abt.presentation.screens.helpRequest.Z r2 = new com.hansecom.abt.presentation.screens.helpRequest.Z
                        r2.<init>(r4, r3)
                        r11.N(r2)
                    L_0x04fd:
                        r1 = r2
                        kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                        r39.M()
                        r9 = 48
                        r10 = 100
                        r3 = 0
                        r8 = 0
                        r12 = 0
                        r2 = r6
                        r4 = r7
                        r6 = r8
                        r7 = r12
                        r8 = r39
                        com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                        r39.T()
                        boolean r1 = androidx.compose.runtime.ComposerKt.P()
                        if (r1 == 0) goto L_0x051f
                        androidx.compose.runtime.ComposerKt.X()
                    L_0x051f:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt$ScreenImpl$1.AnonymousClass3.i(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
                }
            }, composer2, 54), composer, 805309488, 501);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
