package com.hansecom.mapi.infrastructure;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Metadata
public final class ApiClient {

    /* renamed from: k  reason: collision with root package name */
    public static final Companion f39117k = new Companion((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    public static final String f39118l = "com.hansecom.mapi.baseUrl";

    /* renamed from: m  reason: collision with root package name */
    public static final Lazy f39119m = LazyKt.b(ApiClient$Companion$defaultBasePath$2.f39130z);

    /* renamed from: a  reason: collision with root package name */
    public String f39120a;

    /* renamed from: b  reason: collision with root package name */
    public final OkHttpClient.Builder f39121b;

    /* renamed from: c  reason: collision with root package name */
    public final Call.Factory f39122c;

    /* renamed from: d  reason: collision with root package name */
    public final List f39123d;

    /* renamed from: e  reason: collision with root package name */
    public final List f39124e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f39125f;

    /* renamed from: g  reason: collision with root package name */
    public Function1 f39126g;

    /* renamed from: h  reason: collision with root package name */
    public final Lazy f39127h;

    /* renamed from: i  reason: collision with root package name */
    public final Lazy f39128i;

    /* renamed from: j  reason: collision with root package name */
    public final Lazy f39129j;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return ApiClient.f39118l;
        }

        public final String b() {
            Object value = ApiClient.f39119m.getValue();
            Intrinsics.h(value, "getValue(...)");
            return (String) value;
        }

        public Companion() {
        }
    }

    public ApiClient(String str, OkHttpClient.Builder builder, Call.Factory factory, List list, List list2) {
        Intrinsics.i(str, "baseUrl");
        Intrinsics.i(list, "callAdapterFactories");
        Intrinsics.i(list2, "converterFactories");
        this.f39120a = str;
        this.f39121b = builder;
        this.f39122c = factory;
        this.f39123d = list;
        this.f39124e = list2;
        this.f39125f = new LinkedHashMap();
        this.f39127h = LazyKt.b(new ApiClient$retrofitBuilder$2(this));
        this.f39128i = LazyKt.b(new ApiClient$clientBuilder$2(this));
        this.f39129j = LazyKt.b(new ApiClient$defaultClientBuilder$2(this));
        n();
    }

    public static final String i() {
        return f39117k.a();
    }

    public final Object h(Class cls) {
        Intrinsics.i(cls, "serviceClass");
        Call.Factory factory = this.f39122c;
        if (factory == null) {
            factory = j().c();
        }
        return m().f(factory).e().b(cls);
    }

    public final OkHttpClient.Builder j() {
        return (OkHttpClient.Builder) this.f39128i.getValue();
    }

    public final OkHttpClient.Builder k() {
        return (OkHttpClient.Builder) this.f39129j.getValue();
    }

    public final Function1 l() {
        return this.f39126g;
    }

    public final Retrofit.Builder m() {
        Object value = this.f39127h.getValue();
        Intrinsics.h(value, "getValue(...)");
        return (Retrofit.Builder) value;
    }

    public final void n() {
        if (!StringsKt.A(this.f39120a, "/", false, 2, (Object) null)) {
            this.f39120a += '/';
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ApiClient(java.lang.String r8, okhttp3.OkHttpClient.Builder r9, okhttp3.Call.Factory r10, java.util.List r11, java.util.List r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r14 = 2
            r0 = 1
            r1 = r13 & 1
            if (r1 == 0) goto L_0x000c
            com.hansecom.mapi.infrastructure.ApiClient$Companion r8 = f39117k
            java.lang.String r8 = r8.b()
        L_0x000c:
            r2 = r8
            r8 = r13 & 2
            r1 = 0
            if (r8 == 0) goto L_0x0014
            r3 = r1
            goto L_0x0015
        L_0x0014:
            r3 = r9
        L_0x0015:
            r8 = r13 & 4
            if (r8 == 0) goto L_0x001b
            r4 = r1
            goto L_0x001c
        L_0x001b:
            r4 = r10
        L_0x001c:
            r8 = r13 & 8
            if (r8 == 0) goto L_0x0024
            java.util.List r11 = kotlin.collections.CollectionsKt.m()
        L_0x0024:
            r5 = r11
            r8 = r13 & 16
            if (r8 == 0) goto L_0x004d
            retrofit2.converter.scalars.ScalarsConverterFactory r8 = retrofit2.converter.scalars.ScalarsConverterFactory.f()
            java.lang.String r9 = "create(...)"
            kotlin.jvm.internal.Intrinsics.h(r8, r9)
            kotlinx.serialization.json.Json r9 = com.hansecom.mapi.infrastructure.Serializer.b()
            okhttp3.MediaType$Companion r10 = okhttp3.MediaType.f42680e
            java.lang.String r11 = "application/json"
            okhttp3.MediaType r10 = r10.a(r11)
            retrofit2.Converter$Factory r9 = retrofit2.converter.kotlinx.serialization.KotlinSerializationConverterFactory.a(r9, r10)
            retrofit2.Converter$Factory[] r10 = new retrofit2.Converter.Factory[r14]
            r11 = 0
            r10[r11] = r8
            r10[r0] = r9
            java.util.List r12 = kotlin.collections.CollectionsKt.p(r10)
        L_0x004d:
            r6 = r12
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.infrastructure.ApiClient.<init>(java.lang.String, okhttp3.OkHttpClient$Builder, okhttp3.Call$Factory, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
