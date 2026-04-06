package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class J implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34885A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f34886B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.State f34887z;

    public /* synthetic */ J(HelpRequest.State state, Function1 function1, Flow flow, Function0 function0, int i2) {
        this.f34887z = state;
        this.f34885A = function1;
        this.f34886B = flow;
        this.C = function0;
        this.D = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return HelpRequestScreenKt.q0(this.f34887z, this.f34885A, this.f34886B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
