package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory;
import com.hansecom.abt.ui.components.historyItem.HistorySectionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class CardHistoryScreenKt$Content$3 implements Function3<BoxScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CardHistory.State f36385A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyListState f36386z;

    public CardHistoryScreenKt$Content$3(LazyListState lazyListState, CardHistory.State state) {
        this.f36386z = lazyListState;
        this.f36385A = state;
    }

    public static final Unit f(CardHistory.State state, LazyListScope lazyListScope) {
        Intrinsics.i(lazyListScope, "$this$LazyColumn");
        LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.c(967582632, true, new CardHistoryScreenKt$Content$3$1$1$1(state)), 3, (Object) null);
        PersistentList e2 = state.e();
        lazyListScope.d(e2.size(), new CardHistoryScreenKt$Content$3$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$1(new g(), e2), new CardHistoryScreenKt$Content$3$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$2(e2), ComposableLambdaKt.c(-1091073711, true, new CardHistoryScreenKt$Content$3$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3(e2)));
        return Unit.f40552a;
    }

    public static final Object g(int i2, HistorySectionState historySectionState) {
        Intrinsics.i(historySectionState, "<unused var>");
        return Integer.valueOf(i2);
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        e((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.foundation.layout.BoxScope r15, androidx.compose.runtime.Composer r16, int r17) {
        /*
            r14 = this;
            r0 = r14
            r11 = r16
            r1 = r17
            java.lang.String r2 = "$this$PullToRefreshBox"
            r3 = r15
            kotlin.jvm.internal.Intrinsics.i(r15, r2)
            r2 = r1 & 17
            r3 = 16
            if (r2 != r3) goto L_0x001c
            boolean r2 = r16.t()
            if (r2 != 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            r16.B()
            goto L_0x008a
        L_0x001c:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x002b
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.Content.<anonymous> (CardHistoryScreen.kt:88)"
            r4 = -1719505827(0xffffffff99826c5d, float:-1.3485453E-23)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x002b:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r2 = 1
            r3 = 0
            r4 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r1, r3, r2, r4)
            com.hansecom.abt.ui.theme.Dimensions r2 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r2.c()
            r5 = 2
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r3, r5, r4)
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r6 = r2.g()
            androidx.compose.foundation.lazy.LazyListState r2 = r0.f36386z
            r3 = -1400365600(0xffffffffac881de0, float:-3.8686693E-12)
            r11.X(r3)
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory$State r3 = r0.f36385A
            boolean r3 = r11.W(r3)
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory$State r4 = r0.f36385A
            java.lang.Object r5 = r16.g()
            if (r3 != 0) goto L_0x0063
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x006b
        L_0x0063:
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.f r5 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.f
            r5.<init>(r4)
            r11.N(r5)
        L_0x006b:
            r10 = r5
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r16.M()
            r12 = 196614(0x30006, float:2.75515E-40)
            r13 = 476(0x1dc, float:6.67E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = r16
            androidx.compose.foundation.lazy.LazyDslKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x008a
            androidx.compose.runtime.ComposerKt.X()
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreenKt$Content$3.e(androidx.compose.foundation.layout.BoxScope, androidx.compose.runtime.Composer, int):void");
    }
}
