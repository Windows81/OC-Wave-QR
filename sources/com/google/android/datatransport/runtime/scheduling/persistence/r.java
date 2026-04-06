package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final /* synthetic */ class r implements SQLiteEventStore.Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f24297a;

    public /* synthetic */ r(long j2) {
        this.f24297a = j2;
    }

    public final Object apply(Object obj) {
        return SQLiteEventStore.q1(this.f24297a, (SQLiteDatabase) obj);
    }
}
