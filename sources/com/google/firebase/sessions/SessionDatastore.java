package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface SessionDatastore {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f31509a = Companion.f31510a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f31510a = new Companion();

        public final SessionDatastore a() {
            Object j2 = FirebaseKt.a(Firebase.f29632a).j(SessionDatastore.class);
            Intrinsics.h(j2, "Firebase.app[SessionDatastore::class.java]");
            return (SessionDatastore) j2;
        }
    }

    String a();

    void b(String str);
}
