package com.hansecom.abt.util;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.util.ResultExtKt", f = "ResultExt.kt", l = {12}, m = "asyncAll")
public final class ResultExtKt$asyncAll$1<T> extends ContinuationImpl {
    public /* synthetic */ Object C;
    public int D;

    public ResultExtKt$asyncAll$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.D |= Integer.MIN_VALUE;
        Object a2 = ResultExtKt.a((Function1[]) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
