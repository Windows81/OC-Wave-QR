package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final /* synthetic */ class A implements SQLiteEventStore.Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f24236a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f24237b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f24238c;

    public /* synthetic */ A(SQLiteEventStore sQLiteEventStore, String str, String str2) {
        this.f24236a = sQLiteEventStore;
        this.f24237b = str;
        this.f24238c = str2;
    }

    public final Object apply(Object obj) {
        return this.f24236a.P1(this.f24237b, this.f24238c, (SQLiteDatabase) obj);
    }
}
