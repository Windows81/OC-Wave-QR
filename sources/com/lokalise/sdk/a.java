package com.lokalise.sdk;

import io.realm.Realm;

public final /* synthetic */ class a implements Realm.Transaction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f39705a;

    public /* synthetic */ a(String str) {
        this.f39705a = str;
    }

    public final void a(Realm realm) {
        Lokalise.saveUserUUIDToDB$lambda$3(this.f39705a, realm);
    }
}
