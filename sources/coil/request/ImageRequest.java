package coil.request;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import coil.decode.Decoder;
import coil.memory.MemoryCache;
import coil.request.Parameters;
import coil.size.Precision;
import coil.size.Scale;
import coil.size.SizeResolver;
import coil.size.ViewSizeResolver;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.transition.Transition;
import coil.util.Contexts;
import coil.util.Requests;
import coil.util.Utils;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.Headers;

@Metadata
public final class ImageRequest {

    /* renamed from: A  reason: collision with root package name */
    public final Lifecycle f23577A;

    /* renamed from: B  reason: collision with root package name */
    public final SizeResolver f23578B;
    public final Scale C;
    public final Parameters D;
    public final MemoryCache.Key E;
    public final Integer F;
    public final Drawable G;
    public final Integer H;
    public final Drawable I;
    public final Integer J;
    public final Drawable K;
    public final DefinedRequestOptions L;
    public final DefaultRequestOptions M;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23579a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f23580b;

    /* renamed from: c  reason: collision with root package name */
    public final Target f23581c;

    /* renamed from: d  reason: collision with root package name */
    public final Listener f23582d;

    /* renamed from: e  reason: collision with root package name */
    public final MemoryCache.Key f23583e;

    /* renamed from: f  reason: collision with root package name */
    public final String f23584f;

    /* renamed from: g  reason: collision with root package name */
    public final Bitmap.Config f23585g;

    /* renamed from: h  reason: collision with root package name */
    public final ColorSpace f23586h;

    /* renamed from: i  reason: collision with root package name */
    public final Precision f23587i;

    /* renamed from: j  reason: collision with root package name */
    public final Pair f23588j;

    /* renamed from: k  reason: collision with root package name */
    public final Decoder.Factory f23589k;

    /* renamed from: l  reason: collision with root package name */
    public final List f23590l;

    /* renamed from: m  reason: collision with root package name */
    public final Transition.Factory f23591m;

    /* renamed from: n  reason: collision with root package name */
    public final Headers f23592n;

    /* renamed from: o  reason: collision with root package name */
    public final Tags f23593o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f23594p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f23595q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f23596r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f23597s;

    /* renamed from: t  reason: collision with root package name */
    public final CachePolicy f23598t;

    /* renamed from: u  reason: collision with root package name */
    public final CachePolicy f23599u;

    /* renamed from: v  reason: collision with root package name */
    public final CachePolicy f23600v;

    /* renamed from: w  reason: collision with root package name */
    public final CoroutineDispatcher f23601w;

    /* renamed from: x  reason: collision with root package name */
    public final CoroutineDispatcher f23602x;

    /* renamed from: y  reason: collision with root package name */
    public final CoroutineDispatcher f23603y;

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineDispatcher f23604z;

    @Metadata
    public interface Listener {

        @Metadata
        public static final class DefaultImpls {
        }

        void a(ImageRequest imageRequest) {
        }

        void b(ImageRequest imageRequest, SuccessResult successResult) {
        }

        void c(ImageRequest imageRequest) {
        }

        void d(ImageRequest imageRequest, ErrorResult errorResult) {
        }
    }

    public /* synthetic */ ImageRequest(Context context, Object obj, Target target, Listener listener, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair pair, Decoder.Factory factory, List list, Transition.Factory factory2, Headers headers, Tags tags, boolean z2, boolean z3, boolean z4, boolean z5, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, SizeResolver sizeResolver, Scale scale, Parameters parameters, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, DefinedRequestOptions definedRequestOptions, DefaultRequestOptions defaultRequestOptions, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, target, listener, key, str, config, colorSpace, precision, pair, factory, list, factory2, headers, tags, z2, z3, z4, z5, cachePolicy, cachePolicy2, cachePolicy3, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, lifecycle, sizeResolver, scale, parameters, key2, num, drawable, num2, drawable2, num3, drawable3, definedRequestOptions, defaultRequestOptions);
    }

    public static /* synthetic */ Builder R(ImageRequest imageRequest, Context context, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            context = imageRequest.f23579a;
        }
        return imageRequest.Q(context);
    }

    public final Listener A() {
        return this.f23582d;
    }

    public final MemoryCache.Key B() {
        return this.f23583e;
    }

    public final CachePolicy C() {
        return this.f23598t;
    }

    public final CachePolicy D() {
        return this.f23600v;
    }

    public final Parameters E() {
        return this.D;
    }

    public final Drawable F() {
        return Requests.c(this, this.G, this.F, this.M.l());
    }

    public final MemoryCache.Key G() {
        return this.E;
    }

    public final Precision H() {
        return this.f23587i;
    }

    public final boolean I() {
        return this.f23597s;
    }

    public final Scale J() {
        return this.C;
    }

    public final SizeResolver K() {
        return this.f23578B;
    }

    public final Tags L() {
        return this.f23593o;
    }

    public final Target M() {
        return this.f23581c;
    }

    public final CoroutineDispatcher N() {
        return this.f23604z;
    }

    public final List O() {
        return this.f23590l;
    }

    public final Transition.Factory P() {
        return this.f23591m;
    }

    public final Builder Q(Context context) {
        return new Builder(this, context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageRequest) {
            ImageRequest imageRequest = (ImageRequest) obj;
            return Intrinsics.d(this.f23579a, imageRequest.f23579a) && Intrinsics.d(this.f23580b, imageRequest.f23580b) && Intrinsics.d(this.f23581c, imageRequest.f23581c) && Intrinsics.d(this.f23582d, imageRequest.f23582d) && Intrinsics.d(this.f23583e, imageRequest.f23583e) && Intrinsics.d(this.f23584f, imageRequest.f23584f) && this.f23585g == imageRequest.f23585g && Intrinsics.d(this.f23586h, imageRequest.f23586h) && this.f23587i == imageRequest.f23587i && Intrinsics.d(this.f23588j, imageRequest.f23588j) && Intrinsics.d(this.f23589k, imageRequest.f23589k) && Intrinsics.d(this.f23590l, imageRequest.f23590l) && Intrinsics.d(this.f23591m, imageRequest.f23591m) && Intrinsics.d(this.f23592n, imageRequest.f23592n) && Intrinsics.d(this.f23593o, imageRequest.f23593o) && this.f23594p == imageRequest.f23594p && this.f23595q == imageRequest.f23595q && this.f23596r == imageRequest.f23596r && this.f23597s == imageRequest.f23597s && this.f23598t == imageRequest.f23598t && this.f23599u == imageRequest.f23599u && this.f23600v == imageRequest.f23600v && Intrinsics.d(this.f23601w, imageRequest.f23601w) && Intrinsics.d(this.f23602x, imageRequest.f23602x) && Intrinsics.d(this.f23603y, imageRequest.f23603y) && Intrinsics.d(this.f23604z, imageRequest.f23604z) && Intrinsics.d(this.E, imageRequest.E) && Intrinsics.d(this.F, imageRequest.F) && Intrinsics.d(this.G, imageRequest.G) && Intrinsics.d(this.H, imageRequest.H) && Intrinsics.d(this.I, imageRequest.I) && Intrinsics.d(this.J, imageRequest.J) && Intrinsics.d(this.K, imageRequest.K) && Intrinsics.d(this.f23577A, imageRequest.f23577A) && Intrinsics.d(this.f23578B, imageRequest.f23578B) && this.C == imageRequest.C && Intrinsics.d(this.D, imageRequest.D) && Intrinsics.d(this.L, imageRequest.L) && Intrinsics.d(this.M, imageRequest.M);
        }
    }

    public final boolean g() {
        return this.f23594p;
    }

    public final boolean h() {
        return this.f23595q;
    }

    public int hashCode() {
        int hashCode = ((this.f23579a.hashCode() * 31) + this.f23580b.hashCode()) * 31;
        Target target = this.f23581c;
        int i2 = 0;
        int hashCode2 = (hashCode + (target != null ? target.hashCode() : 0)) * 31;
        Listener listener = this.f23582d;
        int hashCode3 = (hashCode2 + (listener != null ? listener.hashCode() : 0)) * 31;
        MemoryCache.Key key = this.f23583e;
        int hashCode4 = (hashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f23584f;
        int hashCode5 = (((hashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.f23585g.hashCode()) * 31;
        ColorSpace colorSpace = this.f23586h;
        int hashCode6 = (((hashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.f23587i.hashCode()) * 31;
        Pair pair = this.f23588j;
        int hashCode7 = (hashCode6 + (pair != null ? pair.hashCode() : 0)) * 31;
        Decoder.Factory factory = this.f23589k;
        int hashCode8 = (((((((((((((((((((((((((((((((((((((((hashCode7 + (factory != null ? factory.hashCode() : 0)) * 31) + this.f23590l.hashCode()) * 31) + this.f23591m.hashCode()) * 31) + this.f23592n.hashCode()) * 31) + this.f23593o.hashCode()) * 31) + Boolean.hashCode(this.f23594p)) * 31) + Boolean.hashCode(this.f23595q)) * 31) + Boolean.hashCode(this.f23596r)) * 31) + Boolean.hashCode(this.f23597s)) * 31) + this.f23598t.hashCode()) * 31) + this.f23599u.hashCode()) * 31) + this.f23600v.hashCode()) * 31) + this.f23601w.hashCode()) * 31) + this.f23602x.hashCode()) * 31) + this.f23603y.hashCode()) * 31) + this.f23604z.hashCode()) * 31) + this.f23577A.hashCode()) * 31) + this.f23578B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31;
        MemoryCache.Key key2 = this.E;
        int hashCode9 = (hashCode8 + (key2 != null ? key2.hashCode() : 0)) * 31;
        Integer num = this.F;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.G;
        int hashCode11 = (hashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.H;
        int hashCode12 = (hashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.I;
        int hashCode13 = (hashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.J;
        int hashCode14 = (hashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.K;
        if (drawable3 != null) {
            i2 = drawable3.hashCode();
        }
        return ((((hashCode14 + i2) * 31) + this.L.hashCode()) * 31) + this.M.hashCode();
    }

    public final boolean i() {
        return this.f23596r;
    }

    public final Bitmap.Config j() {
        return this.f23585g;
    }

    public final ColorSpace k() {
        return this.f23586h;
    }

    public final Context l() {
        return this.f23579a;
    }

    public final Object m() {
        return this.f23580b;
    }

    public final CoroutineDispatcher n() {
        return this.f23603y;
    }

    public final Decoder.Factory o() {
        return this.f23589k;
    }

    public final DefaultRequestOptions p() {
        return this.M;
    }

    public final DefinedRequestOptions q() {
        return this.L;
    }

    public final String r() {
        return this.f23584f;
    }

    public final CachePolicy s() {
        return this.f23599u;
    }

    public final Drawable t() {
        return Requests.c(this, this.I, this.H, this.M.f());
    }

    public final Drawable u() {
        return Requests.c(this, this.K, this.J, this.M.g());
    }

    public final CoroutineDispatcher v() {
        return this.f23602x;
    }

    public final Pair w() {
        return this.f23588j;
    }

    public final Headers x() {
        return this.f23592n;
    }

    public final CoroutineDispatcher y() {
        return this.f23601w;
    }

    public final Lifecycle z() {
        return this.f23577A;
    }

    public ImageRequest(Context context, Object obj, Target target, Listener listener, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair pair, Decoder.Factory factory, List list, Transition.Factory factory2, Headers headers, Tags tags, boolean z2, boolean z3, boolean z4, boolean z5, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, SizeResolver sizeResolver, Scale scale, Parameters parameters, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, DefinedRequestOptions definedRequestOptions, DefaultRequestOptions defaultRequestOptions) {
        this.f23579a = context;
        this.f23580b = obj;
        this.f23581c = target;
        this.f23582d = listener;
        this.f23583e = key;
        this.f23584f = str;
        this.f23585g = config;
        this.f23586h = colorSpace;
        this.f23587i = precision;
        this.f23588j = pair;
        this.f23589k = factory;
        this.f23590l = list;
        this.f23591m = factory2;
        this.f23592n = headers;
        this.f23593o = tags;
        this.f23594p = z2;
        this.f23595q = z3;
        this.f23596r = z4;
        this.f23597s = z5;
        this.f23598t = cachePolicy;
        this.f23599u = cachePolicy2;
        this.f23600v = cachePolicy3;
        this.f23601w = coroutineDispatcher;
        this.f23602x = coroutineDispatcher2;
        this.f23603y = coroutineDispatcher3;
        this.f23604z = coroutineDispatcher4;
        this.f23577A = lifecycle;
        this.f23578B = sizeResolver;
        this.C = scale;
        this.D = parameters;
        this.E = key2;
        this.F = num;
        this.G = drawable;
        this.H = num2;
        this.I = drawable2;
        this.J = num3;
        this.K = drawable3;
        this.L = definedRequestOptions;
        this.M = defaultRequestOptions;
    }

    @Metadata
    public static final class Builder {

        /* renamed from: A  reason: collision with root package name */
        public CoroutineDispatcher f23605A;

        /* renamed from: B  reason: collision with root package name */
        public Parameters.Builder f23606B;
        public MemoryCache.Key C;
        public Integer D;
        public Drawable E;
        public Integer F;
        public Drawable G;
        public Integer H;
        public Drawable I;
        public Lifecycle J;
        public SizeResolver K;
        public Scale L;
        public Lifecycle M;
        public SizeResolver N;
        public Scale O;

        /* renamed from: a  reason: collision with root package name */
        public final Context f23607a;

        /* renamed from: b  reason: collision with root package name */
        public DefaultRequestOptions f23608b;

        /* renamed from: c  reason: collision with root package name */
        public Object f23609c;

        /* renamed from: d  reason: collision with root package name */
        public Target f23610d;

        /* renamed from: e  reason: collision with root package name */
        public Listener f23611e;

        /* renamed from: f  reason: collision with root package name */
        public MemoryCache.Key f23612f;

        /* renamed from: g  reason: collision with root package name */
        public String f23613g;

        /* renamed from: h  reason: collision with root package name */
        public Bitmap.Config f23614h;

        /* renamed from: i  reason: collision with root package name */
        public ColorSpace f23615i;

        /* renamed from: j  reason: collision with root package name */
        public Precision f23616j;

        /* renamed from: k  reason: collision with root package name */
        public Pair f23617k;

        /* renamed from: l  reason: collision with root package name */
        public Decoder.Factory f23618l;

        /* renamed from: m  reason: collision with root package name */
        public List f23619m;

        /* renamed from: n  reason: collision with root package name */
        public Transition.Factory f23620n;

        /* renamed from: o  reason: collision with root package name */
        public Headers.Builder f23621o;

        /* renamed from: p  reason: collision with root package name */
        public Map f23622p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f23623q;

        /* renamed from: r  reason: collision with root package name */
        public Boolean f23624r;

        /* renamed from: s  reason: collision with root package name */
        public Boolean f23625s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f23626t;

        /* renamed from: u  reason: collision with root package name */
        public CachePolicy f23627u;

        /* renamed from: v  reason: collision with root package name */
        public CachePolicy f23628v;

        /* renamed from: w  reason: collision with root package name */
        public CachePolicy f23629w;

        /* renamed from: x  reason: collision with root package name */
        public CoroutineDispatcher f23630x;

        /* renamed from: y  reason: collision with root package name */
        public CoroutineDispatcher f23631y;

        /* renamed from: z  reason: collision with root package name */
        public CoroutineDispatcher f23632z;

        public Builder(Context context) {
            this.f23607a = context;
            this.f23608b = Requests.b();
            this.f23609c = null;
            this.f23610d = null;
            this.f23611e = null;
            this.f23612f = null;
            this.f23613g = null;
            this.f23614h = null;
            this.f23615i = null;
            this.f23616j = null;
            this.f23617k = null;
            this.f23618l = null;
            this.f23619m = CollectionsKt.m();
            this.f23620n = null;
            this.f23621o = null;
            this.f23622p = null;
            this.f23623q = true;
            this.f23624r = null;
            this.f23625s = null;
            this.f23626t = true;
            this.f23627u = null;
            this.f23628v = null;
            this.f23629w = null;
            this.f23630x = null;
            this.f23631y = null;
            this.f23632z = null;
            this.f23605A = null;
            this.f23606B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
        }

        public final ImageRequest a() {
            Context context = this.f23607a;
            Object obj = this.f23609c;
            if (obj == null) {
                obj = NullRequestData.f23647a;
            }
            Object obj2 = obj;
            Target target = this.f23610d;
            Listener listener = this.f23611e;
            MemoryCache.Key key = this.f23612f;
            String str = this.f23613g;
            Bitmap.Config config = this.f23614h;
            if (config == null) {
                config = this.f23608b.c();
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.f23615i;
            Precision precision = this.f23616j;
            if (precision == null) {
                precision = this.f23608b.m();
            }
            Precision precision2 = precision;
            Pair pair = this.f23617k;
            Decoder.Factory factory = this.f23618l;
            List list = this.f23619m;
            Transition.Factory factory2 = this.f23620n;
            if (factory2 == null) {
                factory2 = this.f23608b.o();
            }
            Transition.Factory factory3 = factory2;
            Headers.Builder builder = this.f23621o;
            Headers y2 = Utils.y(builder != null ? builder.f() : null);
            Map map = this.f23622p;
            Tags x2 = Utils.x(map != null ? Tags.f23680b.a(map) : null);
            boolean z2 = this.f23623q;
            Boolean bool = this.f23624r;
            boolean booleanValue = bool != null ? bool.booleanValue() : this.f23608b.a();
            Boolean bool2 = this.f23625s;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : this.f23608b.b();
            boolean z3 = this.f23626t;
            CachePolicy cachePolicy = this.f23627u;
            if (cachePolicy == null) {
                cachePolicy = this.f23608b.j();
            }
            CachePolicy cachePolicy2 = cachePolicy;
            CachePolicy cachePolicy3 = this.f23628v;
            if (cachePolicy3 == null) {
                cachePolicy3 = this.f23608b.e();
            }
            CachePolicy cachePolicy4 = cachePolicy3;
            CachePolicy cachePolicy5 = this.f23629w;
            if (cachePolicy5 == null) {
                cachePolicy5 = this.f23608b.k();
            }
            CachePolicy cachePolicy6 = cachePolicy5;
            CoroutineDispatcher coroutineDispatcher = this.f23630x;
            if (coroutineDispatcher == null) {
                coroutineDispatcher = this.f23608b.i();
            }
            CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
            CoroutineDispatcher coroutineDispatcher3 = this.f23631y;
            if (coroutineDispatcher3 == null) {
                coroutineDispatcher3 = this.f23608b.h();
            }
            CoroutineDispatcher coroutineDispatcher4 = coroutineDispatcher3;
            CoroutineDispatcher coroutineDispatcher5 = this.f23632z;
            if (coroutineDispatcher5 == null) {
                coroutineDispatcher5 = this.f23608b.d();
            }
            CoroutineDispatcher coroutineDispatcher6 = coroutineDispatcher5;
            CoroutineDispatcher coroutineDispatcher7 = this.f23605A;
            if (coroutineDispatcher7 == null) {
                coroutineDispatcher7 = this.f23608b.n();
            }
            CoroutineDispatcher coroutineDispatcher8 = coroutineDispatcher7;
            Lifecycle lifecycle = this.J;
            if (lifecycle == null && (lifecycle = this.M) == null) {
                lifecycle = g();
            }
            Lifecycle lifecycle2 = lifecycle;
            SizeResolver sizeResolver = this.K;
            if (sizeResolver == null && (sizeResolver = this.N) == null) {
                sizeResolver = i();
            }
            SizeResolver sizeResolver2 = sizeResolver;
            Scale scale = this.L;
            if (scale == null && (scale = this.O) == null) {
                scale = h();
            }
            Scale scale2 = scale;
            Parameters.Builder builder2 = this.f23606B;
            Parameters w2 = Utils.w(builder2 != null ? builder2.a() : null);
            MemoryCache.Key key2 = this.C;
            Integer num = this.D;
            Drawable drawable = this.E;
            Integer num2 = this.F;
            Drawable drawable2 = this.G;
            Integer num3 = this.H;
            Drawable drawable3 = this.I;
            DefinedRequestOptions definedRequestOptions = r43;
            boolean z4 = z2;
            Transition.Factory factory4 = factory3;
            List list2 = list;
            Decoder.Factory factory5 = factory;
            Pair pair2 = pair;
            Precision precision3 = precision2;
            ColorSpace colorSpace2 = colorSpace;
            Bitmap.Config config3 = config2;
            String str2 = str;
            MemoryCache.Key key3 = key;
            Listener listener2 = listener;
            Target target2 = target;
            Object obj3 = obj2;
            DefinedRequestOptions definedRequestOptions2 = new DefinedRequestOptions(this.J, this.K, this.L, this.f23630x, this.f23631y, this.f23632z, this.f23605A, this.f23620n, this.f23616j, this.f23614h, this.f23624r, this.f23625s, this.f23627u, this.f23628v, this.f23629w);
            return new ImageRequest(context, obj3, target2, listener2, key3, str2, config3, colorSpace2, precision3, pair2, factory5, list2, factory4, y2, x2, z4, booleanValue, booleanValue2, z3, cachePolicy2, cachePolicy4, cachePolicy6, coroutineDispatcher2, coroutineDispatcher4, coroutineDispatcher6, coroutineDispatcher8, lifecycle2, sizeResolver2, scale2, w2, key2, num, drawable, num2, drawable2, num3, drawable3, definedRequestOptions, this.f23608b, (DefaultConstructorMarker) null);
        }

        public final Builder b(Object obj) {
            this.f23609c = obj;
            return this;
        }

        public final Builder c(DefaultRequestOptions defaultRequestOptions) {
            this.f23608b = defaultRequestOptions;
            e();
            return this;
        }

        public final Builder d(Precision precision) {
            this.f23616j = precision;
            return this;
        }

        public final void e() {
            this.O = null;
        }

        public final void f() {
            this.M = null;
            this.N = null;
            this.O = null;
        }

        public final Lifecycle g() {
            Target target = this.f23610d;
            Lifecycle c2 = Contexts.c(target instanceof ViewTarget ? ((ViewTarget) target).r().getContext() : this.f23607a);
            return c2 == null ? GlobalLifecycle.f23575b : c2;
        }

        public final Scale h() {
            View r2;
            SizeResolver sizeResolver = this.K;
            View view = null;
            ViewSizeResolver viewSizeResolver = sizeResolver instanceof ViewSizeResolver ? (ViewSizeResolver) sizeResolver : null;
            if (viewSizeResolver == null || (r2 = viewSizeResolver.r()) == null) {
                Target target = this.f23610d;
                ViewTarget viewTarget = target instanceof ViewTarget ? (ViewTarget) target : null;
                if (viewTarget != null) {
                    view = viewTarget.r();
                }
            } else {
                view = r2;
            }
            return view instanceof ImageView ? Utils.o((ImageView) view) : Scale.FIT;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            r1 = ((android.widget.ImageView) r0).getScaleType();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final coil.size.SizeResolver i() {
            /*
                r4 = this;
                coil.target.Target r0 = r4.f23610d
                boolean r1 = r0 instanceof coil.target.ViewTarget
                if (r1 == 0) goto L_0x002e
                coil.target.ViewTarget r0 = (coil.target.ViewTarget) r0
                android.view.View r0 = r0.r()
                boolean r1 = r0 instanceof android.widget.ImageView
                if (r1 == 0) goto L_0x0026
                r1 = r0
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                android.widget.ImageView$ScaleType r1 = r1.getScaleType()
                android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER
                if (r1 == r2) goto L_0x001f
                android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.MATRIX
                if (r1 != r2) goto L_0x0026
            L_0x001f:
                coil.size.Size r0 = coil.size.Size.f23704d
                coil.size.SizeResolver r0 = coil.size.SizeResolvers.a(r0)
                return r0
            L_0x0026:
                r1 = 2
                r2 = 0
                r3 = 0
                coil.size.ViewSizeResolver r0 = coil.size.ViewSizeResolvers.b(r0, r3, r1, r2)
                return r0
            L_0x002e:
                coil.size.DisplaySizeResolver r0 = new coil.size.DisplaySizeResolver
                android.content.Context r1 = r4.f23607a
                r0.<init>(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: coil.request.ImageRequest.Builder.i():coil.size.SizeResolver");
        }

        public final Builder j(Scale scale) {
            this.L = scale;
            return this;
        }

        public final Builder k(SizeResolver sizeResolver) {
            this.K = sizeResolver;
            f();
            return this;
        }

        public final Builder l(Target target) {
            this.f23610d = target;
            f();
            return this;
        }

        public Builder(ImageRequest imageRequest, Context context) {
            this.f23607a = context;
            this.f23608b = imageRequest.p();
            this.f23609c = imageRequest.m();
            this.f23610d = imageRequest.M();
            this.f23611e = imageRequest.A();
            this.f23612f = imageRequest.B();
            this.f23613g = imageRequest.r();
            this.f23614h = imageRequest.q().c();
            this.f23615i = imageRequest.k();
            this.f23616j = imageRequest.q().k();
            this.f23617k = imageRequest.w();
            this.f23618l = imageRequest.o();
            this.f23619m = imageRequest.O();
            this.f23620n = imageRequest.q().o();
            this.f23621o = imageRequest.x().i();
            this.f23622p = MapsKt.u(imageRequest.L().a());
            this.f23623q = imageRequest.g();
            this.f23624r = imageRequest.q().a();
            this.f23625s = imageRequest.q().b();
            this.f23626t = imageRequest.I();
            this.f23627u = imageRequest.q().i();
            this.f23628v = imageRequest.q().e();
            this.f23629w = imageRequest.q().j();
            this.f23630x = imageRequest.q().g();
            this.f23631y = imageRequest.q().f();
            this.f23632z = imageRequest.q().d();
            this.f23605A = imageRequest.q().n();
            this.f23606B = imageRequest.E().h();
            this.C = imageRequest.G();
            this.D = imageRequest.F;
            this.E = imageRequest.G;
            this.F = imageRequest.H;
            this.G = imageRequest.I;
            this.H = imageRequest.J;
            this.I = imageRequest.K;
            this.J = imageRequest.q().h();
            this.K = imageRequest.q().m();
            this.L = imageRequest.q().l();
            if (imageRequest.l() == context) {
                this.M = imageRequest.z();
                this.N = imageRequest.K();
                this.O = imageRequest.J();
                return;
            }
            this.M = null;
            this.N = null;
            this.O = null;
        }
    }
}
