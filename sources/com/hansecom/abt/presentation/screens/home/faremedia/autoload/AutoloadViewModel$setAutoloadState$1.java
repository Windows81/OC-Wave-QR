package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import com.hansecom.mapi.models.FareMediaAutoload;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel", f = "AutoloadViewModel.kt", l = {104, 107}, m = "setAutoloadState")
public final class AutoloadViewModel$setAutoloadState$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ AutoloadViewModel G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoloadViewModel$setAutoloadState$1(AutoloadViewModel autoloadViewModel, Continuation continuation) {
        super(continuation);
        this.G = autoloadViewModel;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.I((FareMediaAutoload) null, this);
    }
}
