package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;

@Metadata
public interface SettingsProvider {

    @Metadata
    public static final class DefaultImpls {
        public static Object a(SettingsProvider settingsProvider, Continuation continuation) {
            return Unit.f40552a;
        }
    }

    Boolean a();

    Duration b();

    Double c();

    Object d(Continuation continuation);
}
