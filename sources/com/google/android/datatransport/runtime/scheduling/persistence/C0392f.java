package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.f  reason: case insensitive filesystem */
public final /* synthetic */ class C0392f implements SQLiteEventStore.Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f24280a;

    public /* synthetic */ C0392f(SQLiteEventStore sQLiteEventStore) {
        this.f24280a = sQLiteEventStore;
    }

    public final Object apply(Object obj) {
        return this.f24280a.T1((SQLiteDatabase) obj);
    }
}
