package com.google.firebase.sessions.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface SessionSubscriber {

    @Metadata
    public enum Name {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    @Metadata
    public static final class SessionDetails {

        /* renamed from: a  reason: collision with root package name */
        public final String f31585a;

        public SessionDetails(String str) {
            Intrinsics.i(str, "sessionId");
            this.f31585a = str;
        }

        public final String a() {
            return this.f31585a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionDetails) && Intrinsics.d(this.f31585a, ((SessionDetails) obj).f31585a);
        }

        public int hashCode() {
            return this.f31585a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f31585a + ')';
        }
    }

    boolean a();

    Name b();

    void c(SessionDetails sessionDetails);
}
