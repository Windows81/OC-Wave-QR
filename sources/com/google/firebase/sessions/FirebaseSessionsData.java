package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FirebaseSessionsData {

    /* renamed from: a  reason: collision with root package name */
    public final String f31493a;

    public FirebaseSessionsData(String str) {
        this.f31493a = str;
    }

    public final String a() {
        return this.f31493a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FirebaseSessionsData) && Intrinsics.d(this.f31493a, ((FirebaseSessionsData) obj).f31493a);
    }

    public int hashCode() {
        String str = this.f31493a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f31493a + ')';
    }
}
