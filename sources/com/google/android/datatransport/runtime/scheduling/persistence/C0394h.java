package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.h  reason: case insensitive filesystem */
public final /* synthetic */ class C0394h implements SQLiteEventStore.Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f24284a;

    public /* synthetic */ C0394h(SQLiteEventStore sQLiteEventStore) {
        this.f24284a = sQLiteEventStore;
    }

    public final Object apply(Object obj) {
        return this.f24284a.J0((Cursor) obj);
    }
}
