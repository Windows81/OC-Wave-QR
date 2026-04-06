package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Supplier f29613a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f29614b;

    public /* synthetic */ b(Supplier supplier, Callable callable) {
        this.f29613a = supplier;
        this.f29614b = callable;
    }

    public final Object call() {
        return Callables.c(this.f29613a, this.f29614b);
    }
}
