package com.hansecom.abt.util;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.util.ResultExtKt$asyncAll$2", f = "ResultExt.kt", l = {16}, m = "invokeSuspend")
public final class ResultExtKt$asyncAll$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<Object>>>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function1[] F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResultExtKt$asyncAll$2(Function1[] function1Arr, Continuation continuation) {
        super(2, continuation);
        this.F = function1Arr;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ResultExtKt$asyncAll$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ResultExtKt$asyncAll$2 resultExtKt$asyncAll$2 = new ResultExtKt$asyncAll$2(this.F, continuation);
        resultExtKt$asyncAll$2.E = obj;
        return resultExtKt$asyncAll$2;
    }

    public final Object x(Object obj) {
        Object obj2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.E;
            Function1[] function1Arr = this.F;
            Result.Companion companion = Result.f40519A;
            ArrayList arrayList = new ArrayList(function1Arr.length);
            for (Function1 resultExtKt$asyncAll$2$1$1$1 : function1Arr) {
                arrayList.add(BuildersKt__Builders_commonKt.b(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ResultExtKt$asyncAll$2$1$1$1(resultExtKt$asyncAll$2$1$1$1, (Continuation) null), 3, (Object) null));
            }
            this.D = 1;
            obj = AwaitKt.a(arrayList, this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            try {
                ResultKt.b(obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.f40519A;
                obj2 = Result.b(ResultKt.a(th));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = Result.b((List) obj);
        return Result.a(obj2);
    }
}
