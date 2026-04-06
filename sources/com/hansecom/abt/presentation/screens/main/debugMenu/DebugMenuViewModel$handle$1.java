package com.hansecom.abt.presentation.screens.main.debugMenu;

import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel", f = "DebugMenuViewModel.kt", l = {51, 72, 73, 71}, m = "handle")
public final class DebugMenuViewModel$handle$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ DebugMenuViewModel F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebugMenuViewModel$handle$1(DebugMenuViewModel debugMenuViewModel, Continuation continuation) {
        super(continuation);
        this.F = debugMenuViewModel;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.o((DebugMenu.Action) null, this);
    }
}
