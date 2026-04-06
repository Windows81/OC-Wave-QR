package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0388b implements SQLiteEventStore.Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f24274a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TransportContext f24275b;

    public /* synthetic */ C0388b(SQLiteEventStore sQLiteEventStore, TransportContext transportContext) {
        this.f24274a = sQLiteEventStore;
        this.f24275b = transportContext;
    }

    public final Object apply(Object obj) {
        return this.f24274a.H1(this.f24275b, (SQLiteDatabase) obj);
    }
}
