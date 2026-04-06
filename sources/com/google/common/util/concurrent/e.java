package com.google.common.util.concurrent;

import com.google.common.util.concurrent.SimpleTimeLimiter;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Method f29618a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f29619b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object[] f29620c;

    public /* synthetic */ e(Method method, Object obj, Object[] objArr) {
        this.f29618a = method;
        this.f29619b = obj;
        this.f29620c = objArr;
    }

    public final Object call() {
        return SimpleTimeLimiter.AnonymousClass1.b(this.f29618a, this.f29619b, this.f29620c);
    }
}
