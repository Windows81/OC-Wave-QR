package com.lokalise.sdk;

import io.realm.Realm;

public final /* synthetic */ class e implements Realm.Transaction.OnError {
    public final void onError(Throwable th) {
        Lokalise.saveData$lambda$13(th);
    }
}
