package io.github.inflationx.viewpump.internal;

import android.view.View;
import io.github.inflationx.viewpump.InflateRequest;
import io.github.inflationx.viewpump.InflateResult;
import io.github.inflationx.viewpump.Interceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: io.github.inflationx.viewpump.internal.-FallbackViewCreationInterceptor  reason: invalid class name */
public final class FallbackViewCreationInterceptor implements Interceptor {
    public InflateResult intercept(Interceptor.Chain chain) {
        Intrinsics.j(chain, "chain");
        InflateRequest m2 = chain.m();
        View onCreateView = m2.c().onCreateView(m2.e(), m2.d(), m2.b(), m2.a());
        return new InflateResult(onCreateView, onCreateView != null ? onCreateView.getClass().getName() : m2.d(), m2.b(), m2.a());
    }
}
