package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.Map;

public final /* synthetic */ class o implements SQLiteEventStore.Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f24293a;

    public /* synthetic */ o(Map map) {
        this.f24293a = map;
    }

    public final Object apply(Object obj) {
        return SQLiteEventStore.L1(this.f24293a, (Cursor) obj);
    }
}
