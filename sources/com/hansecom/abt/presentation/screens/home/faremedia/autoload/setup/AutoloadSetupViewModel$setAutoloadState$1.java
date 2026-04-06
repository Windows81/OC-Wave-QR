package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import com.hansecom.mapi.models.FareMediaAutoload;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel", f = "AutoloadSetupViewModel.kt", l = {149, 152}, m = "setAutoloadState")
public final class AutoloadSetupViewModel$setAutoloadState$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ AutoloadSetupViewModel G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoloadSetupViewModel$setAutoloadState$1(AutoloadSetupViewModel autoloadSetupViewModel, Continuation continuation) {
        super(continuation);
        this.G = autoloadSetupViewModel;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.U((FareMediaAutoload) null, this);
    }
}
