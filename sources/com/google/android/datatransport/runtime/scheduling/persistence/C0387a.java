package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0387a implements SQLiteEventStore.Producer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SQLiteDatabase f24273a;

    public /* synthetic */ C0387a(SQLiteDatabase sQLiteDatabase) {
        this.f24273a = sQLiteDatabase;
    }

    public final Object a() {
        return this.f24273a.beginTransaction();
    }
}
