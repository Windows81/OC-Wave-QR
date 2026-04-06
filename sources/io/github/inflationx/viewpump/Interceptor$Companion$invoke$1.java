package io.github.inflationx.viewpump;

import io.github.inflationx.viewpump.Interceptor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Interceptor$Companion$invoke$1 implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f39798a;

    public InflateResult intercept(Interceptor.Chain chain) {
        Intrinsics.j(chain, "chain");
        return (InflateResult) this.f39798a.invoke(chain);
    }
}
