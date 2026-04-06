package com.lokalise.sdk;

import io.realm.Realm;

public final /* synthetic */ class d implements Realm.Transaction.OnSuccess {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f39709a;

    public /* synthetic */ d(long j2) {
        this.f39709a = j2;
    }

    public final void a() {
        Lokalise.saveData$lambda$12(this.f39709a);
    }
}
