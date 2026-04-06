package com.google.gson.internal.sql;

import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import java.sql.Date;
import java.sql.Timestamp;

public final class SqlTypesSupport {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f31885a;

    /* renamed from: b  reason: collision with root package name */
    public static final DefaultDateTypeAdapter.DateType f31886b;

    /* renamed from: c  reason: collision with root package name */
    public static final DefaultDateTypeAdapter.DateType f31887c;

    /* renamed from: d  reason: collision with root package name */
    public static final TypeAdapterFactory f31888d;

    /* renamed from: e  reason: collision with root package name */
    public static final TypeAdapterFactory f31889e;

    /* renamed from: f  reason: collision with root package name */
    public static final TypeAdapterFactory f31890f;

    static {
        boolean z2;
        try {
            Class.forName("java.sql.Date");
            z2 = true;
        } catch (ClassNotFoundException unused) {
            z2 = false;
        }
        f31885a = z2;
        if (z2) {
            f31886b = new DefaultDateTypeAdapter.DateType<Date>(Date.class) {
                /* renamed from: e */
                public Date d(java.util.Date date) {
                    return new Date(date.getTime());
                }
            };
            f31887c = new DefaultDateTypeAdapter.DateType<Timestamp>(Timestamp.class) {
                /* renamed from: e */
                public Timestamp d(java.util.Date date) {
                    return new Timestamp(date.getTime());
                }
            };
            f31888d = SqlDateTypeAdapter.f31879b;
            f31889e = SqlTimeTypeAdapter.f31881b;
            f31890f = SqlTimestampTypeAdapter.f31883b;
            return;
        }
        f31886b = null;
        f31887c = null;
        f31888d = null;
        f31889e = null;
        f31890f = null;
    }
}
