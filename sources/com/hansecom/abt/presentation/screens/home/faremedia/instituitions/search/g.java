package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search;

import androidx.compose.foundation.lazy.LazyListScope;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearch;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class g implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36897A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InstitutionsSearch.State f36898z;

    public /* synthetic */ g(InstitutionsSearch.State state, Function1 function1) {
        this.f36898z = state;
        this.f36897A = function1;
    }

    public final Object invoke(Object obj) {
        return InstitutionsSearchScreenKt$ScreenImpl$1.h(this.f36898z, this.f36897A, (LazyListScope) obj);
    }
}
