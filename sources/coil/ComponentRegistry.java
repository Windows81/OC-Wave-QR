package coil;

import coil.decode.Decoder;
import coil.fetch.Fetcher;
import coil.fetch.SourceResult;
import coil.key.Keyer;
import coil.map.Mapper;
import coil.request.Options;
import coil.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ComponentRegistry {

    /* renamed from: a  reason: collision with root package name */
    public final List f23226a;

    /* renamed from: b  reason: collision with root package name */
    public final List f23227b;

    /* renamed from: c  reason: collision with root package name */
    public final List f23228c;

    /* renamed from: d  reason: collision with root package name */
    public final List f23229d;

    /* renamed from: e  reason: collision with root package name */
    public final List f23230e;

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final List f23231a;

        /* renamed from: b  reason: collision with root package name */
        public final List f23232b;

        /* renamed from: c  reason: collision with root package name */
        public final List f23233c;

        /* renamed from: d  reason: collision with root package name */
        public final List f23234d;

        /* renamed from: e  reason: collision with root package name */
        public final List f23235e;

        public Builder(ComponentRegistry componentRegistry) {
            this.f23231a = CollectionsKt.P0(componentRegistry.c());
            this.f23232b = CollectionsKt.P0(componentRegistry.e());
            this.f23233c = CollectionsKt.P0(componentRegistry.d());
            this.f23234d = CollectionsKt.P0(componentRegistry.b());
            this.f23235e = CollectionsKt.P0(componentRegistry.a());
        }

        public final Builder a(Decoder.Factory factory) {
            this.f23235e.add(factory);
            return this;
        }

        public final Builder b(Fetcher.Factory factory, Class cls) {
            this.f23234d.add(TuplesKt.a(factory, cls));
            return this;
        }

        public final Builder c(Keyer keyer, Class cls) {
            this.f23233c.add(TuplesKt.a(keyer, cls));
            return this;
        }

        public final Builder d(Mapper mapper, Class cls) {
            this.f23232b.add(TuplesKt.a(mapper, cls));
            return this;
        }

        public final ComponentRegistry e() {
            return new ComponentRegistry(Collections.a(this.f23231a), Collections.a(this.f23232b), Collections.a(this.f23233c), Collections.a(this.f23234d), Collections.a(this.f23235e), (DefaultConstructorMarker) null);
        }

        public final List f() {
            return this.f23235e;
        }

        public final List g() {
            return this.f23234d;
        }
    }

    public /* synthetic */ ComponentRegistry(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    public final List a() {
        return this.f23230e;
    }

    public final List b() {
        return this.f23229d;
    }

    public final List c() {
        return this.f23226a;
    }

    public final List d() {
        return this.f23228c;
    }

    public final List e() {
        return this.f23227b;
    }

    public final String f(Object obj, Options options) {
        List list = this.f23228c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) list.get(i2);
            Keyer keyer = (Keyer) pair.a();
            if (((Class) pair.b()).isAssignableFrom(obj.getClass())) {
                Intrinsics.g(keyer, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String a2 = keyer.a(obj, options);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    public final Object g(Object obj, Options options) {
        List list = this.f23227b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) list.get(i2);
            Mapper mapper = (Mapper) pair.a();
            if (((Class) pair.b()).isAssignableFrom(obj.getClass())) {
                Intrinsics.g(mapper, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object a2 = mapper.a(obj, options);
                if (a2 != null) {
                    obj = a2;
                }
            }
        }
        return obj;
    }

    public final Builder h() {
        return new Builder(this);
    }

    public final Pair i(SourceResult sourceResult, Options options, ImageLoader imageLoader, int i2) {
        int size = this.f23230e.size();
        while (i2 < size) {
            Decoder a2 = ((Decoder.Factory) this.f23230e.get(i2)).a(sourceResult, options, imageLoader);
            if (a2 != null) {
                return TuplesKt.a(a2, Integer.valueOf(i2));
            }
            i2++;
        }
        return null;
    }

    public final Pair j(Object obj, Options options, ImageLoader imageLoader, int i2) {
        int size = this.f23229d.size();
        while (i2 < size) {
            Pair pair = (Pair) this.f23229d.get(i2);
            Fetcher.Factory factory = (Fetcher.Factory) pair.a();
            if (((Class) pair.b()).isAssignableFrom(obj.getClass())) {
                Intrinsics.g(factory, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                Fetcher a2 = factory.a(obj, options, imageLoader);
                if (a2 != null) {
                    return TuplesKt.a(a2, Integer.valueOf(i2));
                }
            }
            i2++;
        }
        return null;
    }

    public ComponentRegistry(List list, List list2, List list3, List list4, List list5) {
        this.f23226a = list;
        this.f23227b = list2;
        this.f23228c = list3;
        this.f23229d = list4;
        this.f23230e = list5;
    }

    public ComponentRegistry() {
        this(CollectionsKt.m(), CollectionsKt.m(), CollectionsKt.m(), CollectionsKt.m(), CollectionsKt.m());
    }
}
