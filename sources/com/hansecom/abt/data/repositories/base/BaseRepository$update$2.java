package com.hansecom.abt.data.repositories.base;

import com.hansecom.abt.data.preferences.base.BaseLocalDataProvider;
import com.hansecom.abt.data.preferences.base.Seconds;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.base.BaseRepository$update$2", f = "BaseRepository.kt", l = {153}, m = "invokeSuspend")
public final class BaseRepository$update$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ BaseRepository E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Seconds G;
    public final /* synthetic */ Seconds H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseRepository$update$2(BaseRepository baseRepository, Object obj, Seconds seconds, Seconds seconds2, Continuation continuation) {
        super(2, continuation);
        this.E = baseRepository;
        this.F = obj;
        this.G = seconds;
        this.H = seconds2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseRepository$update$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new BaseRepository$update$2(this.E, this.F, this.G, this.H, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            BaseLocalDataProvider t2 = this.E.t();
            Object obj2 = this.F;
            Seconds seconds = this.G;
            Seconds seconds2 = this.H;
            this.D = 1;
            if (t2.k(obj2, seconds, seconds2, this) == f2) {
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
