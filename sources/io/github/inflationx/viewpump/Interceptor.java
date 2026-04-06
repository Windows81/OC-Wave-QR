package io.github.inflationx.viewpump;

import kotlin.Metadata;

@Metadata
public interface Interceptor {

    @Metadata
    public interface Chain {
        InflateRequest m();

        InflateResult n(InflateRequest inflateRequest);
    }

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f39797a = new Companion();
    }

    InflateResult intercept(Chain chain);
}
