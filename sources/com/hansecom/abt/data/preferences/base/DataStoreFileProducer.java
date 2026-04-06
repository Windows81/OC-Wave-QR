package com.hansecom.abt.data.preferences.base;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DataStoreFileProducer {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f33345a;

    public DataStoreFileProducer(Function1 function1) {
        Intrinsics.i(function1, "function");
        this.f33345a = function1;
    }

    public final Function1 a() {
        return this.f33345a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataStoreFileProducer) && Intrinsics.d(this.f33345a, ((DataStoreFileProducer) obj).f33345a);
    }

    public int hashCode() {
        return this.f33345a.hashCode();
    }

    public String toString() {
        Function1 function1 = this.f33345a;
        return "DataStoreFileProducer(function=" + function1 + ")";
    }
}
