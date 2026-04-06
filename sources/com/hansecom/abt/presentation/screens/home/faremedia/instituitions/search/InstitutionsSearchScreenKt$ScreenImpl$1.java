package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.hansecom.abt.presentation.model.InstitutionState;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class InstitutionsSearchScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36874A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f36875B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InstitutionsSearch.State f36876z;

    public InstitutionsSearchScreenKt$ScreenImpl$1(InstitutionsSearch.State state, Function1 function1, Function1 function12) {
        this.f36876z = state;
        this.f36874A = function1;
        this.f36875B = function12;
    }

    public static final Unit g(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new InstitutionsSearch.Action.FilterChange(str));
        return Unit.f40552a;
    }

    public static final Unit h(InstitutionsSearch.State state, Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.i(lazyListScope, "$this$LazyColumn");
        PersistentList d2 = state.d();
        lazyListScope.d(d2.size(), new InstitutionsSearchScreenKt$ScreenImpl$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$1(new h(), d2), new InstitutionsSearchScreenKt$ScreenImpl$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$2(d2), ComposableLambdaKt.c(-1091073711, true, new InstitutionsSearchScreenKt$ScreenImpl$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$3(d2, state, function1)));
        LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableSingletons$InstitutionsSearchScreenKt.f36860a.a(), 3, (Object) null);
        return Unit.f40552a;
    }

    public static final Object i(int i2, InstitutionState institutionState) {
        Intrinsics.i(institutionState, "item");
        return Integer.valueOf(institutionState.a());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(androidx.compose.runtime.Composer r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            r15 = r29
            r1 = r30
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r29.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r29.B()
            goto L_0x020d
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.ScreenImpl.<anonymous> (InstitutionsSearchScreen.kt:66)"
            r5 = -413786591(0xffffffffe7561e21, float:-1.0111422E24)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x0026:
            r1 = -1480055144(0xffffffffa7c82698, float:-5.5552995E-15)
            r15.X(r1)
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearch$State r1 = r0.f36876z
            kotlinx.collections.immutable.PersistentList r1 = r1.d()
            r13 = 0
            if (r1 != 0) goto L_0x0045
            com.hansecom.abt.ui.components.loading.LoadingContentKt.b(r15, r13)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0041
            androidx.compose.runtime.ComposerKt.X()
        L_0x0041:
            r29.M()
            return
        L_0x0045:
            r29.M()
            androidx.compose.ui.Modifier$Companion r14 = androidx.compose.ui.Modifier.f15489d
            r12 = 0
            r11 = 1
            r10 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r14, r12, r11, r10)
            com.hansecom.abt.ui.theme.Dimensions r2 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r2.c()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r12, r3, r10)
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearch$State r9 = r0.f36876z
            kotlin.jvm.functions.Function1 r8 = r0.f36874A
            kotlin.jvm.functions.Function1 r7 = r0.f36875B
            androidx.compose.foundation.layout.Arrangement r16 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r16.g()
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r3.k()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r3, r15, r13)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r15, r13)
            androidx.compose.runtime.CompositionLocalMap r4 = r29.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r17 = r29.v()
            if (r17 != 0) goto L_0x008c
            androidx.compose.runtime.ComposablesKt.d()
        L_0x008c:
            r29.s()
            boolean r17 = r29.n()
            if (r17 == 0) goto L_0x0099
            r15.y(r6)
            goto L_0x009c
        L_0x0099:
            r29.K()
        L_0x009c:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r29)
            kotlin.jvm.functions.Function2 r10 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r2, r10)
            kotlin.jvm.functions.Function2 r2 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x00c6
            java.lang.Object r4 = r6.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r10)
            if (r4 != 0) goto L_0x00d4
        L_0x00c6:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r2)
        L_0x00d4:
            kotlin.jvm.functions.Function2 r2 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r17 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            int r1 = com.hansecom.abt.R.string.S6
            java.lang.String r10 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r13)
            r18 = 0
            r19 = 95
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r20 = 0
            r21 = 0
            r13 = r7
            r7 = r20
            r27 = r8
            r8 = r10
            r10 = r9
            r9 = r21
            r30 = r10
            r10 = r29
            r11 = r18
            r0 = r12
            r12 = r19
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r11 = 0
            r12 = 1
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r14, r0, r12, r11)
            java.lang.String r1 = r30.c()
            int r3 = com.hansecom.abt.R.string.R6
            r2 = -437520399(0xffffffffe5ebf7f1, float:-1.3929123E23)
            r15.X(r2)
            r2 = r27
            boolean r5 = r15.W(r2)
            java.lang.Object r6 = r29.g()
            if (r5 != 0) goto L_0x012c
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0134
        L_0x012c:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.f r6 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.f
            r6.<init>(r2)
            r15.N(r6)
        L_0x0134:
            r2 = r6
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r29.M()
            r10 = 3072(0xc00, float:4.305E-42)
            r18 = 240(0xf0, float:3.36E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = r29
            r23 = r13
            r13 = r11
            r11 = r18
            com.hansecom.abt.ui.components.formFields.SearchTextFieldKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            kotlinx.collections.immutable.PersistentList r1 = r30.d()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01b3
            r1 = -678105177(0xffffffffd794efa7, float:-3.2751404E14)
            r15.X(r1)
            androidx.compose.ui.Modifier r18 = androidx.compose.foundation.layout.SizeKt.h(r14, r0, r12, r13)
            r21 = 2
            r22 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.ColumnScope.c(r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.Arrangement$Vertical r5 = r16.g()
            r0 = -437509427(0xffffffffe5ec22cd, float:-1.3939006E23)
            r15.X(r0)
            r0 = r30
            boolean r2 = r15.W(r0)
            r3 = r23
            boolean r4 = r15.W(r3)
            r2 = r2 | r4
            java.lang.Object r4 = r29.g()
            if (r2 != 0) goto L_0x0191
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0199
        L_0x0191:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.g r4 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.g
            r4.<init>(r0, r3)
            r15.N(r4)
        L_0x0199:
            r10 = r4
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r29.M()
            r12 = 24576(0x6000, float:3.4438E-41)
            r13 = 494(0x1ee, float:6.92E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = r29
            androidx.compose.foundation.lazy.LazyDslKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r29.M()
            goto L_0x0201
        L_0x01b3:
            r1 = -677276857(0xffffffffd7a19347, float:-3.55307847E14)
            r15.X(r1)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r14, r0, r12, r13)
            int r0 = com.hansecom.abt.R.string.Q6
            r1 = 0
            java.lang.String r1 = androidx.compose.ui.res.StringResources_androidKt.b(r0, r15, r1)
            androidx.compose.ui.text.style.TextAlign$Companion r0 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r0 = r0.a()
            com.hansecom.abt.ui.theme.AbtTheme r3 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r4 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r3 = r3.d(r15, r4)
            androidx.compose.ui.text.TextStyle r22 = r3.c()
            androidx.compose.ui.text.style.TextAlign r14 = androidx.compose.ui.text.style.TextAlign.h(r0)
            r25 = 0
            r26 = 130044(0x1fbfc, float:1.8223E-40)
            r3 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 48
            r23 = r29
            androidx.compose.material3.TextKt.j(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r29.M()
        L_0x0201:
            r29.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x020d
            androidx.compose.runtime.ComposerKt.X()
        L_0x020d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchScreenKt$ScreenImpl$1.f(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        f((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
