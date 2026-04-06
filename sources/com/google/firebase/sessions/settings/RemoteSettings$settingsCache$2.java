package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class RemoteSettings$settingsCache$2 extends Lambda implements Function0<SettingsCache> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DataStore f31595z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoteSettings$settingsCache$2(DataStore dataStore) {
        super(0);
        this.f31595z = dataStore;
    }

    /* renamed from: b */
    public final SettingsCache invoke() {
        return new SettingsCache(this.f31595z);
    }
}
