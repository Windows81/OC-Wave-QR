package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0390d implements SQLiteEventStore.Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f24276a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TransportContext f24277b;

    public /* synthetic */ C0390d(SQLiteEventStore sQLiteEventStore, TransportContext transportContext) {
        this.f24276a = sQLiteEventStore;
        this.f24277b = transportContext;
    }

    public final Object apply(Object obj) {
        return this.f24276a.E1(this.f24277b, (SQLiteDatabase) obj);
    }
}
