package com.hansecom.abt.presentation.screens.home.faremedia.passes;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPasses;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class FareMediaPassesScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37002A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaPasses.State f37003z;

    public FareMediaPassesScreenKt$ScreenImpl$1(FareMediaPasses.State state, Function1 function1) {
        this.f37003z = state;
        this.f37002A = function1;
    }

    /* access modifiers changed from: private */
    public static final Unit f(Function1 function1) {
        function1.invoke(FareMediaPasses.Action.AddMorePassClick.f36986a);
        return Unit.f40552a;
    }

    public static final Unit g(FareMediaPasses.State state, Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.i(lazyListScope, "$this$LazyColumn");
        LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableSingletons$FareMediaPassesScreenKt.f36983a.a(), 3, (Object) null);
        PersistentList d2 = state.d();
        lazyListScope.d(d2.size(), (Function1) null, new FareMediaPassesScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$3(FareMediaPassesScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$1.f36994z, d2), ComposableLambdaKt.c(-632812321, true, new FareMediaPassesScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$4(d2, function1)));
        if (state.c()) {
            LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.c(-21458569, true, new FareMediaPassesScreenKt$ScreenImpl$1$1$2$1$2(function1)), 3, (Object) null);
        }
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.runtime.Composer r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r14 = r17
            r1 = r18
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r17.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r17.B()
            goto L_0x01a3
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.faremedia.passes.ScreenImpl.<anonymous> (FareMediaPassesScreen.kt:66)"
            r5 = 1076426157(0x4028f5ad, float:2.6399949)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x0026:
            r1 = -732497494(0xffffffffd456f9aa, float:-3.69324668E12)
            r14.X(r1)
            com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPasses$State r1 = r0.f37003z
            boolean r1 = r1.e()
            r2 = 0
            if (r1 == 0) goto L_0x0045
            com.hansecom.abt.ui.components.loading.LoadingContentKt.b(r14, r2)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0041
            androidx.compose.runtime.ComposerKt.X()
        L_0x0041:
            r17.M()
            return
        L_0x0045:
            r17.M()
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r4 = 0
            r5 = 1
            r6 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.f(r1, r4, r5, r6)
            com.hansecom.abt.ui.theme.Dimensions r8 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r8 = r8.c()
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.k(r7, r8, r4, r3, r6)
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r7 = r7.b()
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r8 = r8.g()
            com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPasses$State r9 = r0.f37003z
            kotlin.jvm.functions.Function1 r10 = r0.f37002A
            r11 = 54
            androidx.compose.ui.layout.MeasurePolicy r7 = androidx.compose.foundation.layout.ColumnKt.a(r7, r8, r14, r11)
            int r8 = androidx.compose.runtime.ComposablesKt.a(r14, r2)
            androidx.compose.runtime.CompositionLocalMap r11 = r17.I()
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.ComposedModifierKt.e(r14, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r13 = r12.a()
            androidx.compose.runtime.Applier r15 = r17.v()
            if (r15 != 0) goto L_0x008c
            androidx.compose.runtime.ComposablesKt.d()
        L_0x008c:
            r17.s()
            boolean r15 = r17.n()
            if (r15 == 0) goto L_0x0099
            r14.y(r13)
            goto L_0x009c
        L_0x0099:
            r17.K()
        L_0x009c:
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.b(r17)
            kotlin.jvm.functions.Function2 r15 = r12.c()
            androidx.compose.runtime.Updater.g(r13, r7, r15)
            kotlin.jvm.functions.Function2 r7 = r12.e()
            androidx.compose.runtime.Updater.g(r13, r11, r7)
            kotlin.jvm.functions.Function2 r7 = r12.b()
            boolean r11 = r13.n()
            if (r11 != 0) goto L_0x00c6
            java.lang.Object r11 = r13.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r15)
            if (r11 != 0) goto L_0x00d4
        L_0x00c6:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r13.N(r11)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13.A(r8, r7)
        L_0x00d4:
            kotlin.jvm.functions.Function2 r7 = r12.d()
            androidx.compose.runtime.Updater.g(r13, r3, r7)
            androidx.compose.foundation.layout.ColumnScopeInstance r3 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            kotlinx.collections.immutable.PersistentList r3 = r9.d()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0149
            r3 = 411570236(0x1888103c, float:3.517157E-24)
            r14.X(r3)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r1, r4, r5, r6)
            int r3 = com.hansecom.abt.R.drawable.f33022x
            int r4 = com.hansecom.abt.R.string.n7
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.b(r4, r14, r2)
            int r5 = com.hansecom.abt.R.string.m7
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r5, r14, r2)
            boolean r9 = r9.c()
            int r6 = com.hansecom.abt.R.string.l7
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.b(r6, r14, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = -1233638482(0xffffffffb6782bae, float:-3.6980305E-6)
            r14.X(r3)
            boolean r3 = r14.W(r10)
            java.lang.Object r7 = r17.g()
            if (r3 != 0) goto L_0x0125
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r7 != r3) goto L_0x012d
        L_0x0125:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.e r7 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.e
            r7.<init>(r10)
            r14.N(r7)
        L_0x012d:
            r8 = r7
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r17.M()
            r11 = 196614(0x30006, float:2.75515E-40)
            r12 = 64
            java.lang.String r7 = "add_pass"
            r10 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            r10 = r17
            com.hansecom.abt.ui.components.emptyView.EmptyViewKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r17.M()
            goto L_0x0197
        L_0x0149:
            r2 = 412280446(0x1892e67e, float:3.7972853E-24)
            r14.X(r2)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r1, r4, r5, r6)
            java.lang.String r2 = "pass_list"
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.platform.TestTagKt.a(r1, r2)
            r2 = -1233620341(0xffffffffb678728b, float:-3.7021553E-6)
            r14.X(r2)
            boolean r2 = r14.W(r9)
            boolean r3 = r14.W(r10)
            r2 = r2 | r3
            java.lang.Object r3 = r17.g()
            if (r2 != 0) goto L_0x0176
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x017e
        L_0x0176:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.f r3 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.f
            r3.<init>(r9, r10)
            r14.N(r3)
        L_0x017e:
            r10 = r3
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r17.M()
            r12 = 6
            r13 = 510(0x1fe, float:7.15E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = r17
            androidx.compose.foundation.lazy.LazyDslKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r17.M()
        L_0x0197:
            r17.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01a3
            androidx.compose.runtime.ComposerKt.X()
        L_0x01a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPassesScreenKt$ScreenImpl$1.e(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
