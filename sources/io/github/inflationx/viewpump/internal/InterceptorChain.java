package io.github.inflationx.viewpump.internal;

import io.github.inflationx.viewpump.InflateRequest;
import io.github.inflationx.viewpump.InflateResult;
import io.github.inflationx.viewpump.Interceptor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: io.github.inflationx.viewpump.internal.-InterceptorChain  reason: invalid class name */
public final class InterceptorChain implements Interceptor.Chain {

    /* renamed from: a  reason: collision with root package name */
    public final List f39818a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39819b;

    /* renamed from: c  reason: collision with root package name */
    public final InflateRequest f39820c;

    public InterceptorChain(List list, int i2, InflateRequest inflateRequest) {
        Intrinsics.j(list, "interceptors");
        Intrinsics.j(inflateRequest, "request");
        this.f39818a = list;
        this.f39819b = i2;
        this.f39820c = inflateRequest;
    }

    public InflateRequest m() {
        return this.f39820c;
    }

    public InflateResult n(InflateRequest inflateRequest) {
        Intrinsics.j(inflateRequest, "request");
        if (this.f39819b < this.f39818a.size()) {
            return ((Interceptor) this.f39818a.get(this.f39819b)).intercept(new InterceptorChain(this.f39818a, this.f39819b + 1, inflateRequest));
        }
        throw new AssertionError("no interceptors added to the chain");
    }
}
