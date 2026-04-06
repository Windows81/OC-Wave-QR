package com.hansecom.abt.presentation.screens.helpRequest;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class CardNumberBottomSheetKt$BottomSheet$2$1$1$4$1$1 implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CardNumberState f34789A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f34790B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f34791z;

    public CardNumberBottomSheetKt$BottomSheet$2$1$1$4$1$1(Function1 function1, CardNumberState cardNumberState, Function0 function0) {
        this.f34791z = function1;
        this.f34789A = cardNumberState;
        this.f34790B = function0;
    }

    public final void b() {
        this.f34791z.invoke(this.f34789A);
        this.f34790B.invoke();
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        b();
        return Unit.f40552a;
    }
}
