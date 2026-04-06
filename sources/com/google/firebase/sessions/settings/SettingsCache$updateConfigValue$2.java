package com.google.firebase.sessions.settings;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
public final class SettingsCache$updateConfigValue$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Preferences.Key G;
    public final /* synthetic */ SettingsCache H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsCache$updateConfigValue$2(Object obj, Preferences.Key key, SettingsCache settingsCache, Continuation continuation) {
        super(2, continuation);
        this.F = obj;
        this.G = key;
        this.H = settingsCache;
    }

    /* renamed from: A */
    public final Object m(MutablePreferences mutablePreferences, Continuation continuation) {
        return ((SettingsCache$updateConfigValue$2) s(mutablePreferences, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SettingsCache$updateConfigValue$2 settingsCache$updateConfigValue$2 = new SettingsCache$updateConfigValue$2(this.F, this.G, this.H, continuation);
        settingsCache$updateConfigValue$2.E = obj;
        return settingsCache$updateConfigValue$2;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.E;
            Object obj2 = this.F;
            if (obj2 != null) {
                mutablePreferences.j(this.G, obj2);
            } else {
                mutablePreferences.i(this.G);
            }
            this.H.m(mutablePreferences);
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
