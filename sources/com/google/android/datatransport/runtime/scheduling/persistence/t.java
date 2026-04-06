package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final /* synthetic */ class t implements SQLiteEventStore.Producer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SchemaManager f24299a;

    public /* synthetic */ t(SchemaManager schemaManager) {
        this.f24299a = schemaManager;
    }

    public final Object a() {
        return this.f24299a.getWritableDatabase();
    }
}
