package com.hansecom.abt.presentation.screens.home.faremedia.passes.add;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class AddPassesScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37033A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddPasses.State f37034z;

    public AddPassesScreenKt$ScreenImpl$1(AddPasses.State state, Function1 function1) {
        this.f37034z = state;
        this.f37033A = function1;
    }

    public static final Unit e(AddPasses.State state, Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.i(lazyListScope, "$this$LazyColumn");
        ComposableSingletons$AddPassesScreenKt composableSingletons$AddPassesScreenKt = ComposableSingletons$AddPassesScreenKt.f37054a;
        LazyListScope.f(lazyListScope, (Object) null, (Object) null, composableSingletons$AddPassesScreenKt.a(), 3, (Object) null);
        PersistentList d2 = state.d();
        lazyListScope.d(d2.size(), (Function1) null, new AddPassesScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$$inlined$items$default$3(AddPassesScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$$inlined$items$default$1.f37025z, d2), ComposableLambdaKt.c(-632812321, true, new AddPassesScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$$inlined$items$default$4(d2, function1)));
        LazyListScope.f(lazyListScope, (Object) null, (Object) null, composableSingletons$AddPassesScreenKt.b(), 3, (Object) null);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r16, int r17) {
        /*
            r15 = this;
            r0 = r15
            r14 = r16
            r1 = r17
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0016
            boolean r2 = r16.t()
            if (r2 != 0) goto L_0x0011
            goto L_0x0016
        L_0x0011:
            r16.B()
            goto L_0x00f0
        L_0x0016:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0025
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.faremedia.passes.add.ScreenImpl.<anonymous> (AddPassesScreen.kt:61)"
            r5 = -570006093(0xffffffffde0665b3, float:-2.42108585E18)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x0025:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses$State r1 = r0.f37034z
            boolean r1 = r1.c()
            r2 = 0
            if (r1 == 0) goto L_0x003c
            r1 = -1371860543(0xffffffffae3b11c1, float:-4.2534646E-11)
            r14.X(r1)
            com.hansecom.abt.ui.components.loading.LoadingContentKt.b(r14, r2)
            r16.M()
            goto L_0x00e7
        L_0x003c:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses$State r1 = r0.f37034z
            kotlinx.collections.immutable.PersistentList r1 = r1.d()
            boolean r1 = r1.isEmpty()
            r4 = 1
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L_0x008b
            r1 = -1371775231(0xffffffffae3c5f01, float:-4.283063E-11)
            r14.X(r1)
            int r1 = com.hansecom.abt.R.drawable.N
            int r7 = com.hansecom.abt.R.string.I
            java.lang.String r7 = androidx.compose.ui.res.StringResources_androidKt.b(r7, r14, r2)
            int r8 = com.hansecom.abt.R.string.H
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.b(r8, r14, r2)
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.f(r2, r6, r4, r5)
            com.hansecom.abt.ui.theme.Dimensions r4 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r4 = r4.c()
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.k(r2, r4, r6, r3, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r11 = 6
            r12 = 496(0x1f0, float:6.95E-43)
            r5 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r1 = r2
            r2 = r3
            r3 = r7
            r4 = r8
            r7 = r9
            r8 = r10
            r9 = r13
            r10 = r16
            com.hansecom.abt.ui.components.emptyView.EmptyViewKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r16.M()
            goto L_0x00e7
        L_0x008b:
            r1 = -1371308247(0xffffffffae437f29, float:-4.4450808E-11)
            r14.X(r1)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r1, r6, r4, r5)
            com.hansecom.abt.ui.theme.Dimensions r2 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r2.c()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r6, r3, r5)
            r2 = -1152608496(0xffffffffbb4c9710, float:-0.003121797)
            r14.X(r2)
            com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses$State r2 = r0.f37034z
            boolean r2 = r14.l(r2)
            kotlin.jvm.functions.Function1 r3 = r0.f37033A
            boolean r3 = r14.W(r3)
            r2 = r2 | r3
            com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses$State r3 = r0.f37034z
            kotlin.jvm.functions.Function1 r4 = r0.f37033A
            java.lang.Object r5 = r16.g()
            if (r2 != 0) goto L_0x00c6
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x00ce
        L_0x00c6:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.add.e r5 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.add.e
            r5.<init>(r3, r4)
            r14.N(r5)
        L_0x00ce:
            r10 = r5
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r16.M()
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
            r11 = r16
            androidx.compose.foundation.lazy.LazyDslKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r16.M()
        L_0x00e7:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00f0
            androidx.compose.runtime.ComposerKt.X()
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$ScreenImpl$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
