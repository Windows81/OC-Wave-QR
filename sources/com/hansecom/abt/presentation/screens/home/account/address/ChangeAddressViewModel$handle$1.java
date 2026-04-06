package com.hansecom.abt.presentation.screens.home.account.address;

import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel", f = "ChangeAddressViewModel.kt", l = {98, 125}, m = "handle")
public final class ChangeAddressViewModel$handle$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ ChangeAddressViewModel F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeAddressViewModel$handle$1(ChangeAddressViewModel changeAddressViewModel, Continuation continuation) {
        super(continuation);
        this.F = changeAddressViewModel;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.o((ChangeAddress.Action) null, this);
    }
}
