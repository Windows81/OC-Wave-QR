package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.api.JsonParser;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.Json;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.generalData.StatesRepository$getFreshData$1", f = "StatesRepository.kt", l = {29}, m = "invokeSuspend")
public final class StatesRepository$getFreshData$1 extends SuspendLambda implements Function2<Integer, Continuation<? super Result<? extends List<? extends String>>>, Object> {
    public int D;
    public /* synthetic */ int E;
    public final /* synthetic */ StatesRepository F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatesRepository$getFreshData$1(StatesRepository statesRepository, Continuation continuation) {
        super(2, continuation);
        this.F = statesRepository;
    }

    public final Object A(int i2, Continuation continuation) {
        return ((StatesRepository$getFreshData$1) s(Integer.valueOf(i2), continuation)).x(Unit.f40552a);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return A(((Number) obj).intValue(), (Continuation) obj2);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        StatesRepository$getFreshData$1 statesRepository$getFreshData$1 = new StatesRepository$getFreshData$1(this.F, continuation);
        statesRepository$getFreshData$1.E = ((Number) obj).intValue();
        return statesRepository$getFreshData$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            int i3 = this.E;
            StatesRepository statesRepository = this.F;
            Json c2 = JsonParser.f33114a.c();
            CoroutineDispatcher b2 = Dispatchers.b();
            StatesRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1 statesRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1 = new StatesRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1(c2, (Continuation) null, statesRepository, i3);
            this.D = 1;
            obj = BuildersKt.g(b2, statesRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1, this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Result.a(((Result) obj).j());
    }
}
