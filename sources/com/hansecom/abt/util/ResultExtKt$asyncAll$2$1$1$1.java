package com.hansecom.abt.util;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.util.ResultExtKt$asyncAll$2$1$1$1", f = "ResultExt.kt", l = {15}, m = "invokeSuspend")
public final class ResultExtKt$asyncAll$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public int D;
    public final /* synthetic */ Function1 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResultExtKt$asyncAll$2$1$1$1(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.E = function1;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ResultExtKt$asyncAll$2$1$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new ResultExtKt$asyncAll$2$1$1$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Function1 function1 = this.E;
            this.D = 1;
            obj = function1.invoke(this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
