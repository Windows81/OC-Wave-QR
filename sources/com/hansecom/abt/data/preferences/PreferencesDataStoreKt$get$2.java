package com.hansecom.abt.data.preferences;

import androidx.datastore.core.DataStore;
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
import kotlinx.coroutines.flow.FlowKt;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.preferences.PreferencesDataStoreKt$get$2", f = "PreferencesDataStore.kt", l = {24}, m = "invokeSuspend")
public final class PreferencesDataStoreKt$get$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public int D;
    public final /* synthetic */ DataStore E;
    public final /* synthetic */ Preferences.Key F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferencesDataStoreKt$get$2(DataStore dataStore, Preferences.Key key, Continuation continuation) {
        super(2, continuation);
        this.E = dataStore;
        this.F = key;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PreferencesDataStoreKt$get$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PreferencesDataStoreKt$get$2(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            PreferencesDataStoreKt$get$2$invokeSuspend$$inlined$map$1 preferencesDataStoreKt$get$2$invokeSuspend$$inlined$map$1 = new PreferencesDataStoreKt$get$2$invokeSuspend$$inlined$map$1(this.E.getData(), this.F);
            this.D = 1;
            obj = FlowKt.D(preferencesDataStoreKt$get$2$invokeSuspend$$inlined$map$1, this);
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
