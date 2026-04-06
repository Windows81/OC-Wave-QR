package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetails;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36847A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f36848B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InstitutionDetails.State f36849z;

    public /* synthetic */ b(InstitutionDetails.State state, Function1 function1, Flow flow, Function0 function0, int i2, int i3) {
        this.f36849z = state;
        this.f36847A = function1;
        this.f36848B = flow;
        this.C = function0;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return InstitutionDetailsScreenKt.g(this.f36849z, this.f36847A, this.f36848B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
