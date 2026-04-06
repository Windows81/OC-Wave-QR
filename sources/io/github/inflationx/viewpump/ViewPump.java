package io.github.inflationx.viewpump;

import io.github.inflationx.viewpump.internal.FallbackViewCreationInterceptor;
import io.github.inflationx.viewpump.internal.InterceptorChain;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata
public final class ViewPump {

    /* renamed from: f  reason: collision with root package name */
    public static ViewPump f39800f;

    /* renamed from: g  reason: collision with root package name */
    public static final Lazy f39801g = LazyKt.b(ViewPump$Companion$reflectiveFallbackViewCreator$2.f39813z);

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f39802h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final List f39803a;

    /* renamed from: b  reason: collision with root package name */
    public final List f39804b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f39805c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f39806d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f39807e;

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final List f39808a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public boolean f39809b = true;

        /* renamed from: c  reason: collision with root package name */
        public boolean f39810c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f39811d;

        public final Builder a(Interceptor interceptor) {
            Intrinsics.j(interceptor, "interceptor");
            this.f39808a.add(interceptor);
            return this;
        }

        public final ViewPump b() {
            return new ViewPump(CollectionsKt.M0(this.f39808a), this.f39809b, this.f39810c, this.f39811d, (DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ KProperty[] f39812a = {Reflection.i(new PropertyReference1Impl(Reflection.b(Companion.class), "reflectiveFallbackViewCreator", "getReflectiveFallbackViewCreator()Lio/github/inflationx/viewpump/FallbackViewCreator;"))};

        public Companion() {
        }

        public final Builder a() {
            return new Builder();
        }

        public final ViewPump b() {
            ViewPump a2 = ViewPump.f39800f;
            if (a2 != null) {
                return a2;
            }
            ViewPump b2 = a().b();
            ViewPump.f39800f = b2;
            return b2;
        }

        public final void c(ViewPump viewPump) {
            ViewPump.f39800f = viewPump;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ViewPump(List list, boolean z2, boolean z3, boolean z4) {
        this.f39804b = list;
        this.f39805c = z2;
        this.f39806d = z3;
        this.f39807e = z4;
        this.f39803a = CollectionsKt.P0(CollectionsKt.y0(list, new FallbackViewCreationInterceptor()));
    }

    public final InflateResult c(InflateRequest inflateRequest) {
        Intrinsics.j(inflateRequest, "originalRequest");
        return new InterceptorChain(this.f39803a, 0, inflateRequest).n(inflateRequest);
    }

    public final boolean d() {
        return this.f39806d;
    }

    public final boolean e() {
        return this.f39805c;
    }

    public final boolean f() {
        return this.f39807e;
    }

    public /* synthetic */ ViewPump(List list, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z2, z3, z4);
    }
}
