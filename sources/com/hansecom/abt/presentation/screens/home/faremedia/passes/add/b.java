package com.hansecom.abt.presentation.screens.home.faremedia.passes.add;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37062A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f37063B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddPasses.State f37064z;

    public /* synthetic */ b(AddPasses.State state, Function1 function1, Flow flow, Function2 function2, int i2, int i3) {
        this.f37064z = state;
        this.f37062A = function1;
        this.f37063B = flow;
        this.C = function2;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AddPassesScreenKt.g(this.f37064z, this.f37062A, this.f37063B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
