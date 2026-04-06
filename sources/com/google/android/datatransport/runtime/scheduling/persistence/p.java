package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.Map;

public final /* synthetic */ class p implements SQLiteEventStore.Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f24294a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f24295b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ClientMetrics.Builder f24296c;

    public /* synthetic */ p(SQLiteEventStore sQLiteEventStore, Map map, ClientMetrics.Builder builder) {
        this.f24294a = sQLiteEventStore;
        this.f24295b = map;
        this.f24296c = builder;
    }

    public final Object apply(Object obj) {
        return this.f24294a.I1(this.f24295b, this.f24296c, (Cursor) obj);
    }
}
