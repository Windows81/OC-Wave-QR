package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions;
import com.hansecom.abt.ui.components.listItem.MenuItemState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CardOptionsScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36565A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CardOptions.State f36566z;

    public CardOptionsScreenKt$ScreenImpl$1(CardOptions.State state, Function1 function1) {
        this.f36566z = state;
        this.f36565A = function1;
    }

    public static final Unit e(Function1 function1, MenuItemState menuItemState) {
        Intrinsics.i(menuItemState, "it");
        function1.invoke(new CardOptions.Action.MenuItemClick(menuItemState));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r9, int r10) {
        /*
            r8 = this;
            r0 = r10 & 3
            r1 = 2
            if (r0 != r1) goto L_0x0011
            boolean r0 = r9.t()
            if (r0 != 0) goto L_0x000c
            goto L_0x0011
        L_0x000c:
            r9.B()
            goto L_0x0091
        L_0x0011:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0020
            r0 = -1
            java.lang.String r1 = "com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.ScreenImpl.<anonymous> (CardOptionsScreen.kt:84)"
            r2 = 810580251(0x3050791b, float:7.584206E-10)
            androidx.compose.runtime.ComposerKt.Y(r2, r10, r0, r1)
        L_0x0020:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions$State r10 = r8.f36566z
            com.hansecom.abt.ui.components.listItem.MenuItemListState r10 = r10.b()
            if (r10 == 0) goto L_0x0088
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions$State r10 = r8.f36566z
            com.hansecom.abt.ui.components.listItem.MenuItemListState r0 = r10.b()
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r10 = 1
            r2 = 0
            androidx.compose.foundation.ScrollState r2 = androidx.compose.foundation.ScrollKt.c(r2, r9, r2, r10)
            r6 = 14
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.ScrollKt.g(r1, r2, r3, r4, r5, r6, r7)
            com.hansecom.abt.ui.theme.Dimensions r1 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r1.c()
            float r3 = r1.c()
            float r4 = r1.d()
            float r1 = r1.e()
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.l(r10, r2, r4, r3, r1)
            r10 = -479488387(0xffffffffe36b967d, float:-4.3458287E21)
            r9.X(r10)
            kotlin.jvm.functions.Function1 r10 = r8.f36565A
            boolean r10 = r9.W(r10)
            kotlin.jvm.functions.Function1 r1 = r8.f36565A
            java.lang.Object r3 = r9.g()
            if (r10 != 0) goto L_0x0072
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r3 != r10) goto L_0x007a
        L_0x0072:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.L r3 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.L
            r3.<init>(r1)
            r9.N(r3)
        L_0x007a:
            r1 = r3
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r9.M()
            r5 = 0
            r6 = 8
            r3 = 0
            r4 = r9
            com.hansecom.abt.ui.components.listItem.MenuItemListKt.j(r0, r1, r2, r3, r4, r5, r6)
        L_0x0088:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0091
            androidx.compose.runtime.ComposerKt.X()
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsScreenKt$ScreenImpl$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
