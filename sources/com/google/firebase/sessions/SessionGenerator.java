package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class SessionGenerator {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f31544f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final TimeProvider f31545a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f31546b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31547c;

    /* renamed from: d  reason: collision with root package name */
    public int f31548d;

    /* renamed from: e  reason: collision with root package name */
    public SessionDetails f31549e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SessionGenerator a() {
            Object j2 = FirebaseKt.a(Firebase.f29632a).j(SessionGenerator.class);
            Intrinsics.h(j2, "Firebase.app[SessionGenerator::class.java]");
            return (SessionGenerator) j2;
        }

        public Companion() {
        }
    }

    public SessionGenerator(TimeProvider timeProvider, Function0 function0) {
        Intrinsics.i(timeProvider, "timeProvider");
        Intrinsics.i(function0, "uuidGenerator");
        this.f31545a = timeProvider;
        this.f31546b = function0;
        this.f31547c = b();
        this.f31548d = -1;
    }

    public final SessionDetails a() {
        int i2 = this.f31548d + 1;
        this.f31548d = i2;
        this.f31549e = new SessionDetails(i2 == 0 ? this.f31547c : b(), this.f31547c, this.f31548d, this.f31545a.a());
        return c();
    }

    public final String b() {
        String uuid = ((UUID) this.f31546b.invoke()).toString();
        Intrinsics.h(uuid, "uuidGenerator().toString()");
        String lowerCase = StringsKt.K(uuid, "-", "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final SessionDetails c() {
        SessionDetails sessionDetails = this.f31549e;
        if (sessionDetails != null) {
            return sessionDetails;
        }
        Intrinsics.y("currentSession");
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionGenerator(TimeProvider timeProvider, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeProvider, (i2 & 2) != 0 ? AnonymousClass1.I : function0);
    }
}
