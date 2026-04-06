package com.hansecom.abt.presentation.screens.home.faremedia.passes;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPasses;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37071A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f37072B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaPasses.State f37073z;

    public /* synthetic */ b(FareMediaPasses.State state, Function1 function1, Flow flow, Function0 function0, int i2, int i3) {
        this.f37073z = state;
        this.f37071A = function1;
        this.f37072B = flow;
        this.C = function0;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaPassesScreenKt.g(this.f37073z, this.f37071A, this.f37072B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
