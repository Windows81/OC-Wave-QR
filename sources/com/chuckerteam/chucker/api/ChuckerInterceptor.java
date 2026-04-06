package com.chuckerteam.chucker.api;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;

@Metadata
public final class ChuckerInterceptor implements Interceptor {

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final Context f23770a;

        public Builder(Context context) {
            Intrinsics.i(context, "context");
            this.f23770a = context;
        }

        public final ChuckerInterceptor a() {
            return new ChuckerInterceptor(this, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ ChuckerInterceptor(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.i(chain, "chain");
        return chain.b(chain.m());
    }

    public ChuckerInterceptor(Builder builder) {
    }
}
