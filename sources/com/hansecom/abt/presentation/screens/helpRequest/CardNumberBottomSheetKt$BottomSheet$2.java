package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CardNumberBottomSheetKt$BottomSheet$2 implements Function3<Function0<? extends Unit>, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34783A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ List f34784B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f34785z;

    public CardNumberBottomSheetKt$BottomSheet$2(List list, Function1 function1, List list2) {
        this.f34785z = list;
        this.f34783A = function1;
        this.f34784B = list2;
    }

    public static final Unit g(List list, List list2, Function1 function1, Function0 function0, LazyListScope lazyListScope) {
        List list3 = list;
        List list4 = list2;
        Function1 function12 = function1;
        Function0 function02 = function0;
        LazyListScope lazyListScope2 = lazyListScope;
        Intrinsics.i(lazyListScope2, "$this$LazyColumn");
        if (!list3.isEmpty()) {
            LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableSingletons$CardNumberBottomSheetKt.f34800a.a(), 3, (Object) null);
        }
        lazyListScope2.d(list.size(), new CardNumberBottomSheetKt$BottomSheet$2$invoke$lambda$7$lambda$6$$inlined$items$default$2(new C0430g(), list), new CardNumberBottomSheetKt$BottomSheet$2$invoke$lambda$7$lambda$6$$inlined$items$default$3(CardNumberBottomSheetKt$BottomSheet$2$invoke$lambda$7$lambda$6$$inlined$items$default$1.f34767z, list), ComposableLambdaKt.c(-632812321, true, new CardNumberBottomSheetKt$BottomSheet$2$invoke$lambda$7$lambda$6$$inlined$items$default$4(list, function12, function02)));
        Collection collection = list4;
        if (!collection.isEmpty() && !list3.isEmpty()) {
            LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableSingletons$CardNumberBottomSheetKt.f34800a.b(), 3, (Object) null);
        }
        if (!collection.isEmpty()) {
            LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableSingletons$CardNumberBottomSheetKt.f34800a.c(), 3, (Object) null);
            lazyListScope2.d(list2.size(), new CardNumberBottomSheetKt$BottomSheet$2$invoke$lambda$7$lambda$6$$inlined$items$default$6(new C0431h(), list2), new CardNumberBottomSheetKt$BottomSheet$2$invoke$lambda$7$lambda$6$$inlined$items$default$7(CardNumberBottomSheetKt$BottomSheet$2$invoke$lambda$7$lambda$6$$inlined$items$default$5.f34775z, list2), ComposableLambdaKt.c(-632812321, true, new CardNumberBottomSheetKt$BottomSheet$2$invoke$lambda$7$lambda$6$$inlined$items$default$8(list2, function12, function02)));
        }
        LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.c(1078238299, true, new CardNumberBottomSheetKt$BottomSheet$2$1$1$5(function12, function02)), 3, (Object) null);
        return Unit.f40552a;
    }

    public static final Object h(CardNumberState cardNumberState) {
        Intrinsics.i(cardNumberState, "it");
        return cardNumberState.m();
    }

    public static final Object i(CardNumberState cardNumberState) {
        Intrinsics.i(cardNumberState, "it");
        return cardNumberState.m();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        f((Function0) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(kotlin.jvm.functions.Function0 r15, androidx.compose.runtime.Composer r16, int r17) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            r11 = r16
            java.lang.String r2 = "onClose"
            kotlin.jvm.internal.Intrinsics.i(r15, r2)
            r2 = r17 & 6
            r3 = 4
            if (r2 != 0) goto L_0x001a
            boolean r2 = r11.l(r15)
            if (r2 == 0) goto L_0x0016
            r2 = r3
            goto L_0x0017
        L_0x0016:
            r2 = 2
        L_0x0017:
            r2 = r17 | r2
            goto L_0x001c
        L_0x001a:
            r2 = r17
        L_0x001c:
            r4 = r2 & 19
            r5 = 18
            if (r4 != r5) goto L_0x002e
            boolean r4 = r16.t()
            if (r4 != 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            r16.B()
            goto L_0x00a6
        L_0x002e:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x003d
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.presentation.screens.helpRequest.BottomSheet.<anonymous> (CardNumberBottomSheet.kt:84)"
            r6 = -1198814586(0xffffffffb88b8a86, float:-6.6538385E-5)
            androidx.compose.runtime.ComposerKt.Y(r6, r2, r4, r5)
        L_0x003d:
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f3739a
            float r5 = (float) r3
            float r5 = androidx.compose.ui.unit.Dp.m(r5)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r5 = r4.n(r5)
            r4 = 290975989(0x1157f0f5, float:1.703476E-28)
            r11.X(r4)
            java.util.List r4 = r0.f34785z
            boolean r4 = r11.l(r4)
            kotlin.jvm.functions.Function1 r6 = r0.f34783A
            boolean r6 = r11.W(r6)
            r4 = r4 | r6
            r2 = r2 & 14
            if (r2 != r3) goto L_0x0061
            r2 = 1
            goto L_0x0062
        L_0x0061:
            r2 = 0
        L_0x0062:
            r2 = r2 | r4
            java.util.List r3 = r0.f34784B
            boolean r3 = r11.l(r3)
            r2 = r2 | r3
            java.util.List r3 = r0.f34785z
            java.util.List r4 = r0.f34784B
            kotlin.jvm.functions.Function1 r6 = r0.f34783A
            java.lang.Object r7 = r16.g()
            if (r2 != 0) goto L_0x007e
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r7 != r2) goto L_0x0086
        L_0x007e:
            com.hansecom.abt.presentation.screens.helpRequest.f r7 = new com.hansecom.abt.presentation.screens.helpRequest.f
            r7.<init>(r3, r4, r6, r15)
            r11.N(r7)
        L_0x0086:
            r10 = r7
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r16.M()
            r12 = 24576(0x6000, float:3.4438E-41)
            r13 = 495(0x1ef, float:6.94E-43)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = r16
            androidx.compose.foundation.lazy.LazyDslKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00a6
            androidx.compose.runtime.ComposerKt.X()
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.helpRequest.CardNumberBottomSheetKt$BottomSheet$2.f(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }
}
