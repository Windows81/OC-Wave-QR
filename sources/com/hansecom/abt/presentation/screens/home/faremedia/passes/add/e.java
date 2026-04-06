package com.hansecom.abt.presentation.screens.home.faremedia.passes.add;

import androidx.compose.foundation.lazy.LazyListScope;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class e implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37065A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddPasses.State f37066z;

    public /* synthetic */ e(AddPasses.State state, Function1 function1) {
        this.f37066z = state;
        this.f37065A = function1;
    }

    public final Object invoke(Object obj) {
        return AddPassesScreenKt$ScreenImpl$1.e(this.f37066z, this.f37065A, (LazyListScope) obj);
    }
}
