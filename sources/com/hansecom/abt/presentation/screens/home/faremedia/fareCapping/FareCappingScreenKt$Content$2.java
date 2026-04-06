package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareCappingScreenKt$Content$2 implements Function3<BoxScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareCapping.State f36729z;

    public FareCappingScreenKt$Content$2(FareCapping.State state) {
        this.f36729z = state;
    }

    public static final Unit e(FareCapping.State state, LazyListScope lazyListScope) {
        Intrinsics.i(lazyListScope, "$this$LazyColumn");
        LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.c(522738702, true, new FareCappingScreenKt$Content$2$1$1$1$1(state)), 3, (Object) null);
        if (!state.d().isEmpty()) {
            LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableSingletons$FareCappingScreenKt.f36707a.a(), 3, (Object) null);
        }
        List d2 = state.d();
        lazyListScope.d(d2.size(), (Function1) null, new FareCappingScreenKt$Content$2$invoke$lambda$4$lambda$3$lambda$2$$inlined$items$default$3(FareCappingScreenKt$Content$2$invoke$lambda$4$lambda$3$lambda$2$$inlined$items$default$1.f36717z, d2), ComposableLambdaKt.c(-632812321, true, new FareCappingScreenKt$Content$2$invoke$lambda$4$lambda$3$lambda$2$$inlined$items$default$4(d2)));
        if (!state.e().isEmpty()) {
            LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableSingletons$FareCappingScreenKt.f36707a.b(), 3, (Object) null);
        }
        List e2 = state.e();
        lazyListScope.d(e2.size(), (Function1) null, new FareCappingScreenKt$Content$2$invoke$lambda$4$lambda$3$lambda$2$$inlined$items$default$7(FareCappingScreenKt$Content$2$invoke$lambda$4$lambda$3$lambda$2$$inlined$items$default$5.f36723z, e2), ComposableLambdaKt.c(-632812321, true, new FareCappingScreenKt$Content$2$invoke$lambda$4$lambda$3$lambda$2$$inlined$items$default$8(e2)));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.foundation.layout.BoxScope r17, androidx.compose.runtime.Composer r18, int r19) {
        /*
            r16 = this;
            r13 = r18
            r0 = r19
            java.lang.String r1 = "$this$PullToRefreshBox"
            r2 = r17
            kotlin.jvm.internal.Intrinsics.i(r2, r1)
            r1 = r0 & 17
            r2 = 16
            if (r1 != r2) goto L_0x001f
            boolean r1 = r18.t()
            if (r1 != 0) goto L_0x0018
            goto L_0x001f
        L_0x0018:
            r18.B()
            r14 = r16
            goto L_0x0159
        L_0x001f:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x002e
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.Content.<anonymous> (FareCappingScreen.kt:81)"
            r3 = 418117149(0x18ebf61d, float:6.0994587E-24)
            androidx.compose.runtime.ComposerKt.Y(r3, r0, r1, r2)
        L_0x002e:
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r1 = 0
            r2 = 1
            r3 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.f(r0, r1, r2, r3)
            com.hansecom.abt.ui.theme.Dimensions r5 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r5 = r5.c()
            r6 = 2
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.PaddingKt.k(r4, r5, r1, r6, r3)
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r5 = r5.b()
            r14 = r16
            com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping$State r6 = r14.f36729z
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r8 = r7.k()
            r9 = 6
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.ColumnKt.a(r5, r8, r13, r9)
            r8 = 0
            int r9 = androidx.compose.runtime.ComposablesKt.a(r13, r8)
            androidx.compose.runtime.CompositionLocalMap r10 = r18.I()
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.ComposedModifierKt.e(r13, r4)
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r12 = r11.a()
            androidx.compose.runtime.Applier r15 = r18.v()
            if (r15 != 0) goto L_0x0073
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0073:
            r18.s()
            boolean r15 = r18.n()
            if (r15 == 0) goto L_0x0080
            r13.y(r12)
            goto L_0x0083
        L_0x0080:
            r18.K()
        L_0x0083:
            androidx.compose.runtime.Composer r12 = androidx.compose.runtime.Updater.b(r18)
            kotlin.jvm.functions.Function2 r15 = r11.c()
            androidx.compose.runtime.Updater.g(r12, r5, r15)
            kotlin.jvm.functions.Function2 r5 = r11.e()
            androidx.compose.runtime.Updater.g(r12, r10, r5)
            kotlin.jvm.functions.Function2 r5 = r11.b()
            boolean r10 = r12.n()
            if (r10 != 0) goto L_0x00ad
            java.lang.Object r10 = r12.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r15)
            if (r10 != 0) goto L_0x00bb
        L_0x00ad:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12.N(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.A(r9, r5)
        L_0x00bb:
            kotlin.jvm.functions.Function2 r5 = r11.d()
            androidx.compose.runtime.Updater.g(r12, r4, r5)
            androidx.compose.foundation.layout.ColumnScopeInstance r4 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            java.util.List r4 = r6.d()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0105
            java.util.List r4 = r6.e()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0105
            r4 = -751516089(0xffffffffd334c647, float:-7.7642066E11)
            r13.X(r4)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.h(r0, r1, r2, r3)
            int r1 = com.hansecom.abt.R.drawable.V
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = com.hansecom.abt.R.string.X3
            java.lang.String r2 = androidx.compose.ui.res.StringResources_androidKt.b(r2, r13, r8)
            int r3 = com.hansecom.abt.R.string.W3
            java.lang.String r3 = androidx.compose.ui.res.StringResources_androidKt.b(r3, r13, r8)
            r10 = 6
            r11 = 496(0x1f0, float:6.95E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = r18
            com.hansecom.abt.ui.components.emptyView.EmptyViewKt.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r18.M()
            goto L_0x014d
        L_0x0105:
            r4 = -751079020(0xffffffffd33b7194, float:-8.0506441E11)
            r13.X(r4)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.f(r0, r1, r2, r3)
            androidx.compose.ui.Alignment$Horizontal r5 = r7.g()
            r1 = 1638345816(0x61a72c58, float:3.854752E20)
            r13.X(r1)
            boolean r1 = r13.W(r6)
            java.lang.Object r2 = r18.g()
            if (r1 != 0) goto L_0x012b
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0133
        L_0x012b:
            com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.f r2 = new com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.f
            r2.<init>(r6)
            r13.N(r2)
        L_0x0133:
            r9 = r2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r18.M()
            r11 = 196614(0x30006, float:2.75515E-40)
            r12 = 478(0x1de, float:6.7E-43)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = r18
            androidx.compose.foundation.lazy.LazyDslKt.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r18.M()
        L_0x014d:
            r18.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0159
            androidx.compose.runtime.ComposerKt.X()
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingScreenKt$Content$2.c(androidx.compose.foundation.layout.BoxScope, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        c((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
