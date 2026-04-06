package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.List;

public final /* synthetic */ class m implements SQLiteEventStore.Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f24290a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f24291b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TransportContext f24292c;

    public /* synthetic */ m(SQLiteEventStore sQLiteEventStore, List list, TransportContext transportContext) {
        this.f24290a = sQLiteEventStore;
        this.f24291b = list;
        this.f24292c = transportContext;
    }

    public final Object apply(Object obj) {
        return this.f24290a.K1(this.f24291b, this.f24292c, (Cursor) obj);
    }
}
