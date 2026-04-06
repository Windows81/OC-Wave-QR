package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearch;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36890A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f36891B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InstitutionsSearch.State f36892z;

    public /* synthetic */ a(InstitutionsSearch.State state, Function1 function1, Flow flow, Function1 function12, Function0 function0, int i2, int i3) {
        this.f36892z = state;
        this.f36890A = function1;
        this.f36891B = flow;
        this.C = function12;
        this.D = function0;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return InstitutionsSearchScreenKt.g(this.f36892z, this.f36890A, this.f36891B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
