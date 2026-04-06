package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.Map;

public final /* synthetic */ class i implements SQLiteEventStore.Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f24285a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f24286b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f24287c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClientMetrics.Builder f24288d;

    public /* synthetic */ i(SQLiteEventStore sQLiteEventStore, String str, Map map, ClientMetrics.Builder builder) {
        this.f24285a = sQLiteEventStore;
        this.f24286b = str;
        this.f24287c = map;
        this.f24288d = builder;
    }

    public final Object apply(Object obj) {
        return this.f24285a.J1(this.f24286b, this.f24287c, this.f24288d, (SQLiteDatabase) obj);
    }
}
