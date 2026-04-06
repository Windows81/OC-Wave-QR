package com.hansecom.abt.presentation.screens.home.faremedia.cardInformation;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel", f = "CardInformationViewModel.kt", l = {88}, m = "saveChanges")
public final class CardInformationViewModel$saveChanges$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ CardInformationViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardInformationViewModel$saveChanges$1(CardInformationViewModel cardInformationViewModel, Continuation continuation) {
        super(continuation);
        this.E = cardInformationViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.H(this);
    }
}
