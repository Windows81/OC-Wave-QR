package com.hansecom.abt.presentation.screens.home.faremedia.passes.add;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AddPassesScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$$inlined$items$default$4 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37030A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f37031z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPassesScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$$inlined$items$default$4(List list, Function1 function1) {
        super(4);
        this.f37031z = list;
        this.f37030A = function1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.foundation.lazy.LazyItemScope r13, int r14, androidx.compose.runtime.Composer r15, int r16) {
        /*
            r12 = this;
            r0 = r12
            r1 = r14
            r10 = r15
            r2 = r16 & 6
            if (r2 != 0) goto L_0x0014
            r2 = r13
            boolean r2 = r15.W(r13)
            if (r2 == 0) goto L_0x0010
            r2 = 4
            goto L_0x0011
        L_0x0010:
            r2 = 2
        L_0x0011:
            r2 = r16 | r2
            goto L_0x0016
        L_0x0014:
            r2 = r16
        L_0x0016:
            r3 = r16 & 48
            r11 = 16
            if (r3 != 0) goto L_0x0027
            boolean r3 = r15.i(r14)
            if (r3 == 0) goto L_0x0025
            r3 = 32
            goto L_0x0026
        L_0x0025:
            r3 = r11
        L_0x0026:
            r2 = r2 | r3
        L_0x0027:
            r3 = r2 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L_0x0031
            r3 = r6
            goto L_0x0032
        L_0x0031:
            r3 = r5
        L_0x0032:
            r4 = r2 & 1
            boolean r3 = r15.E(r3, r4)
            if (r3 == 0) goto L_0x0170
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0049
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)"
            r7 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
            androidx.compose.runtime.ComposerKt.Y(r7, r2, r3, r4)
        L_0x0049:
            java.util.List r2 = r0.f37031z
            java.lang.Object r1 = r2.get(r14)
            com.hansecom.abt.ui.components.passCard.PassOfferCardState r1 = (com.hansecom.abt.ui.components.passCard.PassOfferCardState) r1
            r2 = -638891119(0xffffffffd9eb4b91, float:-8.2787132E15)
            r15.X(r2)
            boolean r2 = r1.n()
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0109
            r2 = -638883649(0xffffffffd9eb68bf, float:-8.2827236E15)
            r15.X(r2)
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r2, r4, r6, r3)
            int r3 = com.hansecom.abt.R.string.G
            java.lang.String r3 = androidx.compose.ui.res.StringResources_androidKt.b(r3, r15, r5)
            r4 = 1087778203(0x40d62d9b, float:6.693067)
            r15.X(r4)
            kotlin.jvm.functions.Function1 r4 = r0.f37030A
            boolean r4 = r15.W(r4)
            boolean r5 = r15.l(r1)
            r4 = r4 | r5
            java.lang.Object r5 = r15.g()
            if (r4 != 0) goto L_0x0090
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x009a
        L_0x0090:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$ScreenImpl$1$1$1$1$1$1 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$ScreenImpl$1$1$1$1$1$1
            kotlin.jvm.functions.Function1 r4 = r0.f37030A
            r5.<init>(r4, r1)
            r15.N(r5)
        L_0x009a:
            r4 = r5
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.M()
            r5 = 1087780795(0x40d637bb, float:6.694303)
            r15.X(r5)
            kotlin.jvm.functions.Function1 r5 = r0.f37030A
            boolean r5 = r15.W(r5)
            boolean r6 = r15.l(r1)
            r5 = r5 | r6
            java.lang.Object r6 = r15.g()
            if (r5 != 0) goto L_0x00bf
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00c9
        L_0x00bf:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$ScreenImpl$1$1$1$1$2$1 r6 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$ScreenImpl$1$1$1$1$2$1
            kotlin.jvm.functions.Function1 r5 = r0.f37030A
            r6.<init>(r5, r1)
            r15.N(r6)
        L_0x00c9:
            r5 = r6
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r15.M()
            r6 = 1087783470(0x40d6422e, float:6.6955786)
            r15.X(r6)
            kotlin.jvm.functions.Function1 r6 = r0.f37030A
            boolean r6 = r15.W(r6)
            boolean r7 = r15.l(r1)
            r6 = r6 | r7
            java.lang.Object r7 = r15.g()
            if (r6 != 0) goto L_0x00ee
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x00f8
        L_0x00ee:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$ScreenImpl$1$1$1$1$3$1 r7 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$ScreenImpl$1$1$1$1$3$1
            kotlin.jvm.functions.Function1 r6 = r0.f37030A
            r7.<init>(r6, r1)
            r15.N(r7)
        L_0x00f8:
            r6 = r7
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r15.M()
            r8 = 48
            r9 = 0
            r7 = r15
            com.hansecom.abt.ui.components.passCard.GroupPassOfferCardKt.e(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r15.M()
            goto L_0x0154
        L_0x0109:
            r2 = -638330857(0xffffffffd9f3d817, float:-8.5795016E15)
            r15.X(r2)
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r2, r4, r6, r3)
            int r3 = com.hansecom.abt.R.string.G
            java.lang.String r3 = androidx.compose.ui.res.StringResources_androidKt.b(r3, r15, r5)
            r4 = 1087795908(0x40d672c4, float:6.7015095)
            r15.X(r4)
            kotlin.jvm.functions.Function1 r4 = r0.f37030A
            boolean r4 = r15.W(r4)
            boolean r5 = r15.l(r1)
            r4 = r4 | r5
            java.lang.Object r5 = r15.g()
            if (r4 != 0) goto L_0x013a
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x0144
        L_0x013a:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$ScreenImpl$1$1$1$1$4$1 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$ScreenImpl$1$1$1$1$4$1
            kotlin.jvm.functions.Function1 r4 = r0.f37030A
            r5.<init>(r4, r1)
            r15.N(r5)
        L_0x0144:
            r4 = r5
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.M()
            r6 = 48
            r7 = 0
            r5 = r15
            com.hansecom.abt.ui.components.passCard.PassOfferCardKt.e(r1, r2, r3, r4, r5, r6, r7)
            r15.M()
        L_0x0154:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            float r2 = (float) r11
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r1, r2)
            r2 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r2)
            r15.M()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0173
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0173
        L_0x0170:
            r15.B()
        L_0x0173:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$$inlined$items$default$4.b(androidx.compose.foundation.lazy.LazyItemScope, int, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
