package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.sessions.api.SessionSubscriber;

public class CrashlyticsAppQualitySessionsSubscriber implements SessionSubscriber {

    /* renamed from: a  reason: collision with root package name */
    public final DataCollectionArbiter f29967a;

    /* renamed from: b  reason: collision with root package name */
    public final CrashlyticsAppQualitySessionsStore f29968b;

    public CrashlyticsAppQualitySessionsSubscriber(DataCollectionArbiter dataCollectionArbiter, FileStore fileStore) {
        this.f29967a = dataCollectionArbiter;
        this.f29968b = new CrashlyticsAppQualitySessionsStore(fileStore);
    }

    public boolean a() {
        return this.f29967a.d();
    }

    public SessionSubscriber.Name b() {
        return SessionSubscriber.Name.CRASHLYTICS;
    }

    public void c(SessionSubscriber.SessionDetails sessionDetails) {
        Logger f2 = Logger.f();
        f2.b("App Quality Sessions session changed: " + sessionDetails);
        this.f29968b.h(sessionDetails.a());
    }

    public String d(String str) {
        return this.f29968b.c(str);
    }

    public void e(String str) {
        this.f29968b.i(str);
    }
}
