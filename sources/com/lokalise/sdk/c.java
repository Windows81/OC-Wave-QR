package com.lokalise.sdk;

import io.realm.Realm;
import java.util.List;

public final /* synthetic */ class c implements Realm.Transaction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f39707a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f39708b;

    public /* synthetic */ c(long j2, List list) {
        this.f39707a = j2;
        this.f39708b = list;
    }

    public final void a(Realm realm) {
        Lokalise.saveData$lambda$11(this.f39707a, this.f39708b, realm);
    }
}
