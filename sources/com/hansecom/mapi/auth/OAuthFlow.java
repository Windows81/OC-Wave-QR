package com.hansecom.mapi.auth;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum OAuthFlow {
    accessCode,
    implicit,
    password,
    application;

    static {
        OAuthFlow[] d2;
        E = EnumEntriesKt.a(d2);
    }
}
