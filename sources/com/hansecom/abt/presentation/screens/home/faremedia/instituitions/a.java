package com.hansecom.abt.presentation.screens.home.faremedia.instituitions;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.Institutions;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36790A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f36791B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Institutions.State f36792z;

    public /* synthetic */ a(Institutions.State state, Function1 function1, Flow flow, Function0 function0, Function1 function12, int i2, int i3) {
        this.f36792z = state;
        this.f36790A = function1;
        this.f36791B = flow;
        this.C = function0;
        this.D = function12;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return InstitutionsScreenKt.g(this.f36792z, this.f36790A, this.f36791B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
