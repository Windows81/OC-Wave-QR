package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final /* synthetic */ class k implements SQLiteEventStore.Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f24289a;

    public /* synthetic */ k(SQLiteEventStore sQLiteEventStore) {
        this.f24289a = sQLiteEventStore;
    }

    public final Object apply(Object obj) {
        return this.f24289a.O1((Cursor) obj);
    }
}
