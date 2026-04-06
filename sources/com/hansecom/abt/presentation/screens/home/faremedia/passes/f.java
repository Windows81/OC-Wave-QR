package com.hansecom.abt.presentation.screens.home.faremedia.passes;

import androidx.compose.foundation.lazy.LazyListScope;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPasses;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class f implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37163A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaPasses.State f37164z;

    public /* synthetic */ f(FareMediaPasses.State state, Function1 function1) {
        this.f37164z = state;
        this.f37163A = function1;
    }

    public final Object invoke(Object obj) {
        return FareMediaPassesScreenKt$ScreenImpl$1.g(this.f37164z, this.f37163A, (LazyListScope) obj);
    }
}
