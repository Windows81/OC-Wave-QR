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

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.preferences.PreferencesDataStoreKt$blockingSet$1", f = "PreferencesDataStore.kt", l = {45}, m = "invokeSuspend")
final class PreferencesDataStoreKt$blockingSet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ DataStore E;
    public final /* synthetic */ Preferences.Key F;
    public final /* synthetic */ Object G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferencesDataStoreKt$blockingSet$1(DataStore dataStore, Preferences.Key key, Object obj, Continuation continuation) {
        super(2, continuation);
        this.E = dataStore;
        this.F = key;
        this.G = obj;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PreferencesDataStoreKt$blockingSet$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PreferencesDataStoreKt$blockingSet$1(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            DataStore dataStore = this.E;
            Preferences.Key key = this.F;
            Object obj2 = this.G;
            this.D = 1;
            if (PreferencesDataStoreKt.e(dataStore, key, obj2, this) == f2) {
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
