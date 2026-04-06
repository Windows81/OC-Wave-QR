package com.hansecom.abt.data.preferences;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKt;
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
@DebugMetadata(c = "com.hansecom.abt.data.preferences.PreferencesDataStoreKt$set$2", f = "PreferencesDataStore.kt", l = {33}, m = "invokeSuspend")
public final class PreferencesDataStoreKt$set$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ DataStore E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Preferences.Key G;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.data.preferences.PreferencesDataStoreKt$set$2$1", f = "PreferencesDataStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.data.preferences.PreferencesDataStoreKt$set$2$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((AnonymousClass1) s(mutablePreferences, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(obj2, key, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.E;
                Object obj2 = obj2;
                if (obj2 == null) {
                    mutablePreferences.i(key);
                } else {
                    mutablePreferences.j(key, obj2);
                }
                return Unit.f40552a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferencesDataStoreKt$set$2(DataStore dataStore, Object obj, Preferences.Key key, Continuation continuation) {
        super(2, continuation);
        this.E = dataStore;
        this.F = obj;
        this.G = key;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PreferencesDataStoreKt$set$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PreferencesDataStoreKt$set$2(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            DataStore dataStore = this.E;
            final Object obj2 = this.F;
            final Preferences.Key key = this.G;
            AnonymousClass1 r1 = new AnonymousClass1((Continuation) null);
            this.D = 1;
            if (PreferencesKt.a(dataStore, r1, this) == f2) {
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
