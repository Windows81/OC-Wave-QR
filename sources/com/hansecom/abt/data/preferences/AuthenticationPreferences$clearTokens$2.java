package com.hansecom.abt.data.preferences;

import androidx.datastore.preferences.core.Preferences;
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
@DebugMetadata(c = "com.hansecom.abt.data.preferences.AuthenticationPreferences$clearTokens$2", f = "AuthenticationPreferences.kt", l = {30, 31}, m = "invokeSuspend")
public final class AuthenticationPreferences$clearTokens$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ AuthenticationPreferences E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthenticationPreferences$clearTokens$2(AuthenticationPreferences authenticationPreferences, Continuation continuation) {
        super(2, continuation);
        this.E = authenticationPreferences;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AuthenticationPreferences$clearTokens$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AuthenticationPreferences$clearTokens$2(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            AuthenticationPreferences authenticationPreferences = this.E;
            Preferences.Key b2 = AuthenticationPreferences.f33313d;
            this.D = 1;
            if (PreferencesDataStoreKt.e(authenticationPreferences, b2, (Object) null, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else if (i2 == 2) {
            ResultKt.b(obj);
            return Unit.f40552a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AuthenticationPreferences authenticationPreferences2 = this.E;
        Preferences.Key c2 = AuthenticationPreferences.f33314e;
        this.D = 2;
        if (PreferencesDataStoreKt.e(authenticationPreferences2, c2, (Object) null, this) == f2) {
            return f2;
        }
        return Unit.f40552a;
    }
}
