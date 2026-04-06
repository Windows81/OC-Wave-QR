package com.hansecom.abt.presentation.screens.home.faremedia.instituitions;

import androidx.compose.foundation.lazy.LazyListScope;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.Institutions;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class f implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36855A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f36856B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Institutions.State f36857z;

    public /* synthetic */ f(Institutions.State state, Function1 function1, Function0 function0) {
        this.f36857z = state;
        this.f36855A = function1;
        this.f36856B = function0;
    }

    public final Object invoke(Object obj) {
        return InstitutionsScreenKt$ScreenImpl$1.f(this.f36857z, this.f36855A, this.f36856B, (LazyListScope) obj);
    }
}
