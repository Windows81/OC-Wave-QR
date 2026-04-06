package com.hansecom.abt.data.preferences;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.preferences.PreferencesDataStoreKt$flowOf$2", f = "PreferencesDataStore.kt", l = {21}, m = "invokeSuspend")
public final class PreferencesDataStoreKt$flowOf$2 extends SuspendLambda implements Function3<FlowCollector<Object>, Throwable, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Object F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferencesDataStoreKt$flowOf$2(Object obj, Continuation continuation) {
        super(3, continuation);
        this.F = obj;
    }

    /* renamed from: A */
    public final Object d(FlowCollector flowCollector, Throwable th, Continuation continuation) {
        PreferencesDataStoreKt$flowOf$2 preferencesDataStoreKt$flowOf$2 = new PreferencesDataStoreKt$flowOf$2(this.F, continuation);
        preferencesDataStoreKt$flowOf$2.E = flowCollector;
        return preferencesDataStoreKt$flowOf$2.x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Object obj2 = this.F;
            this.D = 1;
            if (((FlowCollector) this.E).c(obj2, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
