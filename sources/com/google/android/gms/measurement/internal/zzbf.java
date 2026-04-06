package com.google.android.gms.measurement.internal;

import java.util.Iterator;

final class zzbf implements Iterator<String> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzbc f26252A;

    /* renamed from: z  reason: collision with root package name */
    public Iterator f26253z;

    public zzbf(zzbc zzbc) {
        this.f26252A = zzbc;
        this.f26253z = zzbc.f26240z.keySet().iterator();
    }

    public final boolean hasNext() {
        return this.f26253z.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f26253z.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
