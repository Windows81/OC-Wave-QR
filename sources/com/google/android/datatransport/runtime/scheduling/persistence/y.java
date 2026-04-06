package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final /* synthetic */ class y implements SQLiteEventStore.Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f24303a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f24304b;

    public /* synthetic */ y(SQLiteEventStore sQLiteEventStore, long j2) {
        this.f24303a = sQLiteEventStore;
        this.f24304b = j2;
    }

    public final Object apply(Object obj) {
        return this.f24303a.L0(this.f24304b, (SQLiteDatabase) obj);
    }
}
