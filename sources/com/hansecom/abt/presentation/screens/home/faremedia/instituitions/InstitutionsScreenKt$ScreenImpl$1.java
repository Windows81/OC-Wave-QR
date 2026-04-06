package com.hansecom.abt.presentation.screens.home.faremedia.instituitions;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.hansecom.abt.presentation.model.InstitutionState;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.Institutions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public final class InstitutionsScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36775A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f36776B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Institutions.State f36777z;

    public InstitutionsScreenKt$ScreenImpl$1(Institutions.State state, Function1 function1, Function0 function0) {
        this.f36777z = state;
        this.f36775A = function1;
        this.f36776B = function0;
    }

    public static final Unit f(Institutions.State state, Function1 function1, Function0 function0, LazyListScope lazyListScope) {
        Intrinsics.i(lazyListScope, "$this$LazyColumn");
        ImmutableList d2 = state.d();
        lazyListScope.d(d2.size(), new InstitutionsScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$2(new g(), d2), new InstitutionsScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$3(InstitutionsScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$1.f36767z, d2), ComposableLambdaKt.c(-632812321, true, new InstitutionsScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$4(d2, function1)));
        LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.c(1455028988, true, new InstitutionsScreenKt$ScreenImpl$1$1$2$1$3(state, function0)), 3, (Object) null);
        return Unit.f40552a;
    }

    public static final Object g(InstitutionState institutionState) {
        Intrinsics.i(institutionState, "it");
        return Integer.valueOf(institutionState.a());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.runtime.Composer r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r14 = r18
            r1 = r19
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r18.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r18.B()
            goto L_0x0233
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.ScreenImpl.<anonymous> (InstitutionsScreen.kt:67)"
            r5 = -301386179(0xffffffffee09363d, float:-1.0616254E28)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x0026:
            r1 = 1800621067(0x6b534c0b, float:2.5544245E26)
            r14.X(r1)
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.Institutions$State r1 = r0.f36777z
            boolean r1 = r1.e()
            r2 = 0
            if (r1 == 0) goto L_0x0045
            com.hansecom.abt.ui.components.loading.LoadingContentKt.b(r14, r2)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0041
            androidx.compose.runtime.ComposerKt.X()
        L_0x0041:
            r18.M()
            return
        L_0x0045:
            r18.M()
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r4 = 0
            r5 = 1
            r6 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.f(r1, r4, r5, r6)
            com.hansecom.abt.ui.theme.Dimensions r15 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r9 = r15.d()
            r12 = 13
            r13 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.PaddingKt.m(r7, r8, r9, r10, r11, r12, r13)
            float r8 = r15.c()
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.k(r7, r8, r4, r3, r6)
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.Institutions$State r7 = r0.f36777z
            kotlin.jvm.functions.Function1 r8 = r0.f36775A
            kotlin.jvm.functions.Function0 r9 = r0.f36776B
            androidx.compose.ui.Alignment$Companion r10 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r11 = r10.o()
            androidx.compose.ui.layout.MeasurePolicy r11 = androidx.compose.foundation.layout.BoxKt.g(r11, r2)
            int r12 = androidx.compose.runtime.ComposablesKt.a(r14, r2)
            androidx.compose.runtime.CompositionLocalMap r13 = r18.I()
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.ComposedModifierKt.e(r14, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r15 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r2 = r15.a()
            androidx.compose.runtime.Applier r16 = r18.v()
            if (r16 != 0) goto L_0x0094
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0094:
            r18.s()
            boolean r16 = r18.n()
            if (r16 == 0) goto L_0x00a1
            r14.y(r2)
            goto L_0x00a4
        L_0x00a1:
            r18.K()
        L_0x00a4:
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.Updater.b(r18)
            kotlin.jvm.functions.Function2 r4 = r15.c()
            androidx.compose.runtime.Updater.g(r2, r11, r4)
            kotlin.jvm.functions.Function2 r4 = r15.e()
            androidx.compose.runtime.Updater.g(r2, r13, r4)
            kotlin.jvm.functions.Function2 r4 = r15.b()
            boolean r11 = r2.n()
            if (r11 != 0) goto L_0x00ce
            java.lang.Object r11 = r2.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r13)
            if (r11 != 0) goto L_0x00dc
        L_0x00ce:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r2.N(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r2.A(r11, r4)
        L_0x00dc:
            kotlin.jvm.functions.Function2 r4 = r15.d()
            androidx.compose.runtime.Updater.g(r2, r3, r4)
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            kotlinx.collections.immutable.ImmutableList r3 = r7.d()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x01c4
            r3 = -1197904026(0xffffffffb8996f66, float:-7.316358E-5)
            r14.X(r3)
            r3 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.h(r1, r3, r5, r6)
            androidx.compose.ui.Alignment r4 = r10.e()
            androidx.compose.ui.Modifier r2 = r2.g(r3, r4)
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r3 = r3.g()
            androidx.compose.ui.Alignment$Horizontal r4 = r10.k()
            r5 = 0
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.ColumnKt.a(r3, r4, r14, r5)
            int r4 = androidx.compose.runtime.ComposablesKt.a(r14, r5)
            androidx.compose.runtime.CompositionLocalMap r5 = r18.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r14, r2)
            kotlin.jvm.functions.Function0 r8 = r15.a()
            androidx.compose.runtime.Applier r10 = r18.v()
            if (r10 != 0) goto L_0x012a
            androidx.compose.runtime.ComposablesKt.d()
        L_0x012a:
            r18.s()
            boolean r10 = r18.n()
            if (r10 == 0) goto L_0x0137
            r14.y(r8)
            goto L_0x013a
        L_0x0137:
            r18.K()
        L_0x013a:
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.b(r18)
            kotlin.jvm.functions.Function2 r10 = r15.c()
            androidx.compose.runtime.Updater.g(r8, r3, r10)
            kotlin.jvm.functions.Function2 r3 = r15.e()
            androidx.compose.runtime.Updater.g(r8, r5, r3)
            kotlin.jvm.functions.Function2 r3 = r15.b()
            boolean r5 = r8.n()
            if (r5 != 0) goto L_0x0164
            java.lang.Object r5 = r8.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r10)
            if (r5 != 0) goto L_0x0172
        L_0x0164:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r8.N(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.A(r4, r3)
        L_0x0172:
            kotlin.jvm.functions.Function2 r3 = r15.d()
            androidx.compose.runtime.Updater.g(r8, r2, r3)
            androidx.compose.foundation.layout.ColumnScopeInstance r2 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            int r2 = com.hansecom.abt.R.drawable.f33009k
            int r3 = com.hansecom.abt.R.string.O6
            r4 = 0
            java.lang.String r3 = androidx.compose.ui.res.StringResources_androidKt.b(r3, r14, r4)
            int r5 = com.hansecom.abt.R.string.N6
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r5, r14, r4)
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x0192
            r8 = r9
            goto L_0x0193
        L_0x0192:
            r8 = r6
        L_0x0193:
            r9 = 923680965(0x370e40c5, float:8.47894E-6)
            r14.X(r9)
            boolean r7 = r7.c()
            if (r7 == 0) goto L_0x01a6
            int r6 = com.hansecom.abt.R.string.M6
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.b(r6, r14, r4)
            r6 = r4
        L_0x01a6:
            r18.M()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11 = 6
            r12 = 352(0x160, float:4.93E-43)
            r7 = 0
            r9 = 0
            r10 = 0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            r9 = r10
            r10 = r18
            com.hansecom.abt.ui.components.emptyView.EmptyViewKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r18.T()
            r18.M()
            goto L_0x0227
        L_0x01c4:
            r3 = -1196854769(0xffffffffb8a9720f, float:-8.079793E-5)
            r14.X(r3)
            r3 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r1, r3, r5, r6)
            androidx.compose.ui.Alignment r3 = r10.m()
            androidx.compose.ui.Modifier r1 = r2.g(r1, r3)
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            r3 = 16
            float r3 = (float) r3
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r5 = r2.n(r3)
            r2 = 1485420233(0x5889b6c9, float:1.21134519E15)
            r14.X(r2)
            boolean r2 = r14.W(r7)
            boolean r3 = r14.W(r8)
            r2 = r2 | r3
            boolean r3 = r14.W(r9)
            r2 = r2 | r3
            java.lang.Object r3 = r18.g()
            if (r2 != 0) goto L_0x0206
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x020e
        L_0x0206:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.f r3 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.f
            r3.<init>(r7, r8, r9)
            r14.N(r3)
        L_0x020e:
            r10 = r3
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r18.M()
            r12 = 24576(0x6000, float:3.4438E-41)
            r13 = 494(0x1ee, float:6.92E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = r18
            androidx.compose.foundation.lazy.LazyDslKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r18.M()
        L_0x0227:
            r18.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0233
            androidx.compose.runtime.ComposerKt.X()
        L_0x0233:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsScreenKt$ScreenImpl$1.e(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
