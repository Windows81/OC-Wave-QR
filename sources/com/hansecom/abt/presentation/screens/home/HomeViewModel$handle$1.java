package com.hansecom.abt.presentation.screens.home;

import com.hansecom.abt.presentation.screens.home.Home;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.HomeViewModel", f = "HomeViewModel.kt", l = {62, 63, 70, 71}, m = "handle")
public final class HomeViewModel$handle$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ HomeViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$handle$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(continuation);
        this.E = homeViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.o((Home.Action) null, this);
    }
}
