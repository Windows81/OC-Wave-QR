package com.hansecom.abt.data.preferences;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.preferences.AuthenticationPreferences", f = "AuthenticationPreferences.kt", l = {25, 26}, m = "setTokens")
public final class AuthenticationPreferences$setTokens$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AuthenticationPreferences F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthenticationPreferences$setTokens$1(AuthenticationPreferences authenticationPreferences, Continuation continuation) {
        super(continuation);
        this.F = authenticationPreferences;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.h((String) null, (String) null, this);
    }
}
