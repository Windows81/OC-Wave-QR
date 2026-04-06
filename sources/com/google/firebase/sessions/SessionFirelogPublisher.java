package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface SessionFirelogPublisher {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f31535a = Companion.f31536a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f31536a = new Companion();

        public final SessionFirelogPublisher a() {
            Object j2 = FirebaseKt.a(Firebase.f29632a).j(SessionFirelogPublisher.class);
            Intrinsics.h(j2, "Firebase.app[SessionFirelogPublisher::class.java]");
            return (SessionFirelogPublisher) j2;
        }
    }

    void a(SessionDetails sessionDetails);
}
