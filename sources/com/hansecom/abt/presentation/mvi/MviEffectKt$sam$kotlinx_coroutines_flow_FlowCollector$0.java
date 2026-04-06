package com.hansecom.abt.presentation.mvi;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class MviEffectKt$sam$kotlinx_coroutines_flow_FlowCollector$0 implements FlowCollector, FunctionAdapter {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f34191z;

    public MviEffectKt$sam$kotlinx_coroutines_flow_FlowCollector$0(Function2 function2) {
        Intrinsics.i(function2, "function");
        this.f34191z = function2;
    }

    public final /* synthetic */ Object c(Object obj, Continuation continuation) {
        return this.f34191z.m(obj, continuation);
    }

    public final Function d() {
        return this.f34191z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FlowCollector) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.d(d(), ((FunctionAdapter) obj).d());
    }

    public final int hashCode() {
        return d().hashCode();
    }
}
