package com.lokalise.sdk;

import io.realm.Realm;

public final /* synthetic */ class b implements Realm.Transaction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f39706a;

    public /* synthetic */ b(String str) {
        this.f39706a = str;
    }

    public final void a(Realm realm) {
        Lokalise.saveAppVersionToDB$lambda$4(this.f39706a, realm);
    }
}
