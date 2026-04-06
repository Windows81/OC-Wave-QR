package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {103}, m = "removeConfigs$com_google_firebase_firebase_sessions")
public final class SettingsCache$removeConfigs$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ SettingsCache D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsCache$removeConfigs$1(SettingsCache settingsCache, Continuation continuation) {
        super(continuation);
        this.D = settingsCache;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.e(this);
    }
}
