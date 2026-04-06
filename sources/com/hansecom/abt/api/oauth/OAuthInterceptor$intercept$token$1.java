package com.hansecom.abt.api.oauth;

import com.hansecom.abt.data.preferences.AuthenticationPreferences;
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
@DebugMetadata(c = "com.hansecom.abt.api.oauth.OAuthInterceptor$intercept$token$1", f = "OAuthInterceptor.kt", l = {23}, m = "invokeSuspend")
public final class OAuthInterceptor$intercept$token$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    public int D;
    public final /* synthetic */ OAuthInterceptor E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OAuthInterceptor$intercept$token$1(OAuthInterceptor oAuthInterceptor, Continuation continuation) {
        super(2, continuation);
        this.E = oAuthInterceptor;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((OAuthInterceptor$intercept$token$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new OAuthInterceptor$intercept$token$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            AuthenticationPreferences a2 = this.E.f33161a;
            this.D = 1;
            obj = a2.e(this);
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
