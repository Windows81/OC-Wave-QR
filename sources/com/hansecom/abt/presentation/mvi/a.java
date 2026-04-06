package com.hansecom.abt.presentation.mvi;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f34204A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Object f34205B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f34206z;

    public /* synthetic */ a(Flow flow, Lifecycle.State state, Object obj, Function2 function2, int i2, int i3) {
        this.f34206z = flow;
        this.f34204A = state;
        this.f34205B = obj;
        this.C = function2;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return MviEffectKt.c(this.f34206z, this.f34204A, this.f34205B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
