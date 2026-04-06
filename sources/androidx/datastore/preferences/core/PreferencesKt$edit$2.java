package androidx.datastore.preferences.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {358}, m = "invokeSuspend")
public final class PreferencesKt$edit$2 extends SuspendLambda implements Function2<Preferences, Continuation<? super Preferences>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function2 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferencesKt$edit$2(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.F = function2;
    }

    /* renamed from: A */
    public final Object m(Preferences preferences, Continuation continuation) {
        return ((PreferencesKt$edit$2) s(preferences, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.F, continuation);
        preferencesKt$edit$2.E = obj;
        return preferencesKt$edit$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            MutablePreferences c2 = ((Preferences) this.E).c();
            Function2 function2 = this.F;
            this.E = c2;
            this.D = 1;
            return function2.m(c2, this) == f2 ? f2 : c2;
        } else if (i2 == 1) {
            MutablePreferences mutablePreferences = (MutablePreferences) this.E;
            ResultKt.b(obj);
            return mutablePreferences;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
