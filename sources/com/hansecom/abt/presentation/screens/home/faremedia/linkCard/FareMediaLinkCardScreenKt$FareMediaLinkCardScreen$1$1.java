package com.hansecom.abt.presentation.screens.home.faremedia.linkCard;

import com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class FareMediaLinkCardScreenKt$FareMediaLinkCardScreen$1$1 extends FunctionReferenceImpl implements Function1<FareMediaLinkCard.Action, Unit> {
    public FareMediaLinkCardScreenKt$FareMediaLinkCardScreen$1$1(Object obj) {
        super(1, obj, FareMediaLinkCardViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((FareMediaLinkCard.Action) obj);
        return Unit.f40552a;
    }

    public final void v(FareMediaLinkCard.Action action) {
        Intrinsics.i(action, "p0");
        ((FareMediaLinkCardViewModel) this.f40885A).k(action);
    }
}
