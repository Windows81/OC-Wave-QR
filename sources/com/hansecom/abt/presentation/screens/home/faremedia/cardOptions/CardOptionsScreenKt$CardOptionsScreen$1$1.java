package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class CardOptionsScreenKt$CardOptionsScreen$1$1 extends FunctionReferenceImpl implements Function1<CardOptions.Action, Unit> {
    public CardOptionsScreenKt$CardOptionsScreen$1$1(Object obj) {
        super(1, obj, CardOptionsViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((CardOptions.Action) obj);
        return Unit.f40552a;
    }

    public final void v(CardOptions.Action action) {
        Intrinsics.i(action, "p0");
        ((CardOptionsViewModel) this.f40885A).k(action);
    }
}
