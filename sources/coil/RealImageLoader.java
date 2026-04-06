package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import coil.EventListener;
import coil.decode.BitmapFactoryDecoder;
import coil.fetch.AssetUriFetcher;
import coil.fetch.BitmapFetcher;
import coil.fetch.ByteBufferFetcher;
import coil.fetch.ContentUriFetcher;
import coil.fetch.DrawableFetcher;
import coil.fetch.FileFetcher;
import coil.fetch.HttpUriFetcher;
import coil.fetch.ResourceUriFetcher;
import coil.intercept.EngineInterceptor;
import coil.key.FileKeyer;
import coil.key.UriKeyer;
import coil.map.ByteArrayMapper;
import coil.map.FileUriMapper;
import coil.map.HttpUrlMapper;
import coil.map.ResourceIntMapper;
import coil.map.ResourceUriMapper;
import coil.map.StringMapper;
import coil.memory.MemoryCache;
import coil.request.DefaultRequestOptions;
import coil.request.Disposable;
import coil.request.ImageRequest;
import coil.request.OneShotDisposable;
import coil.request.RequestService;
import coil.target.ViewTarget;
import coil.util.ImageLoaderOptions;
import coil.util.Logger;
import coil.util.SystemCallbacks;
import coil.util.Utils;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.HttpUrl;

@Metadata
public final class RealImageLoader implements ImageLoader {

    /* renamed from: p  reason: collision with root package name */
    public static final Companion f23254p = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f23255a;

    /* renamed from: b  reason: collision with root package name */
    public final DefaultRequestOptions f23256b;

    /* renamed from: c  reason: collision with root package name */
    public final Lazy f23257c;

    /* renamed from: d  reason: collision with root package name */
    public final Lazy f23258d;

    /* renamed from: e  reason: collision with root package name */
    public final Lazy f23259e;

    /* renamed from: f  reason: collision with root package name */
    public final EventListener.Factory f23260f;

    /* renamed from: g  reason: collision with root package name */
    public final ComponentRegistry f23261g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageLoaderOptions f23262h;

    /* renamed from: i  reason: collision with root package name */
    public final Logger f23263i;

    /* renamed from: j  reason: collision with root package name */
    public final CoroutineScope f23264j = CoroutineScopeKt.a(SupervisorKt.b((Job) null, 1, (Object) null).y(Dispatchers.c().H0()).y(new RealImageLoader$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.f41378w, this)));

    /* renamed from: k  reason: collision with root package name */
    public final SystemCallbacks f23265k;

    /* renamed from: l  reason: collision with root package name */
    public final RequestService f23266l;

    /* renamed from: m  reason: collision with root package name */
    public final ComponentRegistry f23267m;

    /* renamed from: n  reason: collision with root package name */
    public final List f23268n;

    /* renamed from: o  reason: collision with root package name */
    public final AtomicBoolean f23269o;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public RealImageLoader(Context context, DefaultRequestOptions defaultRequestOptions, Lazy lazy, Lazy lazy2, Lazy lazy3, EventListener.Factory factory, ComponentRegistry componentRegistry, ImageLoaderOptions imageLoaderOptions, Logger logger) {
        this.f23255a = context;
        this.f23256b = defaultRequestOptions;
        this.f23257c = lazy;
        this.f23258d = lazy2;
        this.f23259e = lazy3;
        this.f23260f = factory;
        this.f23261g = componentRegistry;
        this.f23262h = imageLoaderOptions;
        this.f23263i = logger;
        SystemCallbacks systemCallbacks = new SystemCallbacks(this);
        this.f23265k = systemCallbacks;
        RequestService requestService = new RequestService(this, systemCallbacks, logger);
        this.f23266l = requestService;
        Class<Uri> cls = Uri.class;
        Class<File> cls2 = File.class;
        this.f23267m = componentRegistry.h().d(new HttpUrlMapper(), HttpUrl.class).d(new StringMapper(), String.class).d(new FileUriMapper(), cls).d(new ResourceUriMapper(), cls).d(new ResourceIntMapper(), Integer.class).d(new ByteArrayMapper(), byte[].class).c(new UriKeyer(), cls).c(new FileKeyer(imageLoaderOptions.a()), cls2).b(new HttpUriFetcher.Factory(lazy3, lazy2, imageLoaderOptions.e()), cls).b(new FileFetcher.Factory(), cls2).b(new AssetUriFetcher.Factory(), cls).b(new ContentUriFetcher.Factory(), cls).b(new ResourceUriFetcher.Factory(), cls).b(new DrawableFetcher.Factory(), Drawable.class).b(new BitmapFetcher.Factory(), Bitmap.class).b(new ByteBufferFetcher.Factory(), ByteBuffer.class).a(new BitmapFactoryDecoder.Factory(imageLoaderOptions.c(), imageLoaderOptions.b())).e();
        this.f23268n = CollectionsKt.y0(getComponents().c(), new EngineInterceptor(this, systemCallbacks, requestService, logger));
        this.f23269o = new AtomicBoolean(false);
    }

    public DefaultRequestOptions a() {
        return this.f23256b;
    }

    public Disposable b(ImageRequest imageRequest) {
        Deferred b2 = BuildersKt__Builders_commonKt.b(this.f23264j, (CoroutineContext) null, (CoroutineStart) null, new RealImageLoader$enqueue$job$1(this, imageRequest, (Continuation) null), 3, (Object) null);
        return imageRequest.M() instanceof ViewTarget ? Utils.m(((ViewTarget) imageRequest.M()).r()).b(b2) : new OneShotDisposable(b2);
    }

    public Object c(ImageRequest imageRequest, Continuation continuation) {
        return CoroutineScopeKt.f(new RealImageLoader$execute$2(imageRequest, this, (Continuation) null), continuation);
    }

    public MemoryCache d() {
        return (MemoryCache) this.f23257c.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: coil.EventListener} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: coil.request.ImageRequest} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: coil.request.RequestDelegate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: coil.RealImageLoader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: coil.EventListener} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: coil.request.ImageRequest} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: coil.request.RequestDelegate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: coil.RealImageLoader} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8 A[Catch:{ all -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0113 A[Catch:{ all -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0121 A[Catch:{ all -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012b A[Catch:{ all -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0137 A[Catch:{ all -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0153 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0185 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0190 A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019b A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b7 A[Catch:{ all -> 0x01c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ca A[SYNTHETIC, Splitter:B:93:0x01ca] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(coil.request.ImageRequest r21, int r22, kotlin.coroutines.Continuation r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r23
            boolean r3 = r2 instanceof coil.RealImageLoader$executeMain$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            coil.RealImageLoader$executeMain$1 r3 = (coil.RealImageLoader$executeMain$1) r3
            int r4 = r3.J
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.J = r4
            goto L_0x001e
        L_0x0019:
            coil.RealImageLoader$executeMain$1 r3 = new coil.RealImageLoader$executeMain$1
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.H
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.J
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0097
            if (r5 == r8) goto L_0x0078
            if (r5 == r7) goto L_0x0056
            if (r5 != r6) goto L_0x004e
            java.lang.Object r0 = r3.F
            r4 = r0
            coil.EventListener r4 = (coil.EventListener) r4
            java.lang.Object r0 = r3.E
            r5 = r0
            coil.request.ImageRequest r5 = (coil.request.ImageRequest) r5
            java.lang.Object r0 = r3.D
            r6 = r0
            coil.request.RequestDelegate r6 = (coil.request.RequestDelegate) r6
            java.lang.Object r0 = r3.C
            r3 = r0
            coil.RealImageLoader r3 = (coil.RealImageLoader) r3
            kotlin.ResultKt.b(r2)     // Catch:{ all -> 0x004b }
            goto L_0x018a
        L_0x004b:
            r0 = move-exception
            goto L_0x01b3
        L_0x004e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0056:
            java.lang.Object r0 = r3.G
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            java.lang.Object r5 = r3.F
            coil.EventListener r5 = (coil.EventListener) r5
            java.lang.Object r7 = r3.E
            coil.request.ImageRequest r7 = (coil.request.ImageRequest) r7
            java.lang.Object r8 = r3.D
            coil.request.RequestDelegate r8 = (coil.request.RequestDelegate) r8
            java.lang.Object r10 = r3.C
            coil.RealImageLoader r10 = (coil.RealImageLoader) r10
            kotlin.ResultKt.b(r2)     // Catch:{ all -> 0x0071 }
            r17 = r0
            goto L_0x015d
        L_0x0071:
            r0 = move-exception
            r4 = r5
            r5 = r7
            r6 = r8
            r3 = r10
            goto L_0x01b3
        L_0x0078:
            java.lang.Object r0 = r3.F
            r5 = r0
            coil.EventListener r5 = (coil.EventListener) r5
            java.lang.Object r0 = r3.E
            r8 = r0
            coil.request.ImageRequest r8 = (coil.request.ImageRequest) r8
            java.lang.Object r0 = r3.D
            r10 = r0
            coil.request.RequestDelegate r10 = (coil.request.RequestDelegate) r10
            java.lang.Object r0 = r3.C
            r11 = r0
            coil.RealImageLoader r11 = (coil.RealImageLoader) r11
            kotlin.ResultKt.b(r2)     // Catch:{ all -> 0x0090 }
            goto L_0x00e7
        L_0x0090:
            r0 = move-exception
            r4 = r5
            r5 = r8
            r6 = r10
        L_0x0094:
            r3 = r11
            goto L_0x01b3
        L_0x0097:
            kotlin.ResultKt.b(r2)
            coil.request.RequestService r2 = r1.f23266l
            kotlin.coroutines.CoroutineContext r5 = r3.f()
            kotlinx.coroutines.Job r5 = kotlinx.coroutines.JobKt.k(r5)
            coil.request.RequestDelegate r2 = r2.g(r0, r5)
            r2.l()
            coil.request.ImageRequest$Builder r0 = coil.request.ImageRequest.R(r0, r9, r8, r9)
            coil.request.DefaultRequestOptions r5 = r20.a()
            coil.request.ImageRequest$Builder r0 = r0.c(r5)
            coil.request.ImageRequest r5 = r0.a()
            coil.EventListener$Factory r0 = r1.f23260f
            coil.EventListener r10 = r0.a(r5)
            java.lang.Object r0 = r5.m()     // Catch:{ all -> 0x00e9 }
            coil.request.NullRequestData r11 = coil.request.NullRequestData.f23647a     // Catch:{ all -> 0x00e9 }
            if (r0 == r11) goto L_0x01ad
            r2.start()     // Catch:{ all -> 0x00e9 }
            if (r22 != 0) goto L_0x00ef
            androidx.lifecycle.Lifecycle r0 = r5.z()     // Catch:{ all -> 0x00e9 }
            r3.C = r1     // Catch:{ all -> 0x00e9 }
            r3.D = r2     // Catch:{ all -> 0x00e9 }
            r3.E = r5     // Catch:{ all -> 0x00e9 }
            r3.F = r10     // Catch:{ all -> 0x00e9 }
            r3.J = r8     // Catch:{ all -> 0x00e9 }
            java.lang.Object r0 = coil.util.Lifecycles.a(r0, r3)     // Catch:{ all -> 0x00e9 }
            if (r0 != r4) goto L_0x00e3
            return r4
        L_0x00e3:
            r11 = r1
            r8 = r5
            r5 = r10
            r10 = r2
        L_0x00e7:
            r2 = r10
            goto L_0x00f2
        L_0x00e9:
            r0 = move-exception
            r3 = r1
            r6 = r2
            r4 = r10
            goto L_0x01b3
        L_0x00ef:
            r11 = r1
            r8 = r5
            r5 = r10
        L_0x00f2:
            coil.memory.MemoryCache r0 = r11.d()     // Catch:{ all -> 0x0103 }
            if (r0 == 0) goto L_0x0110
            coil.memory.MemoryCache$Key r10 = r8.G()     // Catch:{ all -> 0x0103 }
            if (r10 == 0) goto L_0x0108
            coil.memory.MemoryCache$Value r0 = r0.a(r10)     // Catch:{ all -> 0x0103 }
            goto L_0x0109
        L_0x0103:
            r0 = move-exception
            r6 = r2
            r4 = r5
            r5 = r8
            goto L_0x0094
        L_0x0108:
            r0 = r9
        L_0x0109:
            if (r0 == 0) goto L_0x0110
            android.graphics.Bitmap r0 = r0.a()     // Catch:{ all -> 0x0103 }
            goto L_0x0111
        L_0x0110:
            r0 = r9
        L_0x0111:
            if (r0 == 0) goto L_0x0121
            android.content.Context r10 = r8.l()     // Catch:{ all -> 0x0103 }
            android.content.res.Resources r10 = r10.getResources()     // Catch:{ all -> 0x0103 }
            android.graphics.drawable.BitmapDrawable r12 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x0103 }
            r12.<init>(r10, r0)     // Catch:{ all -> 0x0103 }
            goto L_0x0125
        L_0x0121:
            android.graphics.drawable.Drawable r12 = r8.F()     // Catch:{ all -> 0x0103 }
        L_0x0125:
            coil.target.Target r10 = r8.M()     // Catch:{ all -> 0x0103 }
            if (r10 == 0) goto L_0x012e
            r10.e(r12)     // Catch:{ all -> 0x0103 }
        L_0x012e:
            r5.c(r8)     // Catch:{ all -> 0x0103 }
            coil.request.ImageRequest$Listener r10 = r8.A()     // Catch:{ all -> 0x0103 }
            if (r10 == 0) goto L_0x013a
            r10.c(r8)     // Catch:{ all -> 0x0103 }
        L_0x013a:
            r5.n(r8)     // Catch:{ all -> 0x0103 }
            coil.size.SizeResolver r10 = r8.K()     // Catch:{ all -> 0x0103 }
            r3.C = r11     // Catch:{ all -> 0x0103 }
            r3.D = r2     // Catch:{ all -> 0x0103 }
            r3.E = r8     // Catch:{ all -> 0x0103 }
            r3.F = r5     // Catch:{ all -> 0x0103 }
            r3.G = r0     // Catch:{ all -> 0x0103 }
            r3.J = r7     // Catch:{ all -> 0x0103 }
            java.lang.Object r7 = r10.c(r3)     // Catch:{ all -> 0x0103 }
            if (r7 != r4) goto L_0x0154
            return r4
        L_0x0154:
            r17 = r0
            r10 = r11
            r19 = r8
            r8 = r2
            r2 = r7
            r7 = r19
        L_0x015d:
            r15 = r2
            coil.size.Size r15 = (coil.size.Size) r15     // Catch:{ all -> 0x0071 }
            r5.q(r7, r15)     // Catch:{ all -> 0x0071 }
            kotlinx.coroutines.CoroutineDispatcher r0 = r7.y()     // Catch:{ all -> 0x0071 }
            coil.RealImageLoader$executeMain$result$1 r2 = new coil.RealImageLoader$executeMain$result$1     // Catch:{ all -> 0x0071 }
            r18 = 0
            r12 = r2
            r13 = r7
            r14 = r10
            r16 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0071 }
            r3.C = r10     // Catch:{ all -> 0x0071 }
            r3.D = r8     // Catch:{ all -> 0x0071 }
            r3.E = r7     // Catch:{ all -> 0x0071 }
            r3.F = r5     // Catch:{ all -> 0x0071 }
            r3.G = r9     // Catch:{ all -> 0x0071 }
            r3.J = r6     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = kotlinx.coroutines.BuildersKt.g(r0, r2, r3)     // Catch:{ all -> 0x0071 }
            if (r2 != r4) goto L_0x0186
            return r4
        L_0x0186:
            r4 = r5
            r5 = r7
            r6 = r8
            r3 = r10
        L_0x018a:
            coil.request.ImageResult r2 = (coil.request.ImageResult) r2     // Catch:{ all -> 0x004b }
            boolean r0 = r2 instanceof coil.request.SuccessResult     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x019b
            r0 = r2
            coil.request.SuccessResult r0 = (coil.request.SuccessResult) r0     // Catch:{ all -> 0x004b }
            coil.target.Target r7 = r5.M()     // Catch:{ all -> 0x004b }
            r3.m(r0, r7, r4)     // Catch:{ all -> 0x004b }
            goto L_0x01a9
        L_0x019b:
            boolean r0 = r2 instanceof coil.request.ErrorResult     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x01a9
            r0 = r2
            coil.request.ErrorResult r0 = (coil.request.ErrorResult) r0     // Catch:{ all -> 0x004b }
            coil.target.Target r7 = r5.M()     // Catch:{ all -> 0x004b }
            r3.l(r0, r7, r4)     // Catch:{ all -> 0x004b }
        L_0x01a9:
            r6.a()
            return r2
        L_0x01ad:
            coil.request.NullRequestDataException r0 = new coil.request.NullRequestDataException     // Catch:{ all -> 0x00e9 }
            r0.<init>()     // Catch:{ all -> 0x00e9 }
            throw r0     // Catch:{ all -> 0x00e9 }
        L_0x01b3:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x01c8 }
            if (r2 != 0) goto L_0x01ca
            coil.request.RequestService r2 = r3.f23266l     // Catch:{ all -> 0x01c8 }
            coil.request.ErrorResult r0 = r2.a(r5, r0)     // Catch:{ all -> 0x01c8 }
            coil.target.Target r2 = r5.M()     // Catch:{ all -> 0x01c8 }
            r3.l(r0, r2, r4)     // Catch:{ all -> 0x01c8 }
            r6.a()
            return r0
        L_0x01c8:
            r0 = move-exception
            goto L_0x01ce
        L_0x01ca:
            r3.k(r5, r4)     // Catch:{ all -> 0x01c8 }
            throw r0     // Catch:{ all -> 0x01c8 }
        L_0x01ce:
            r6.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.g(coil.request.ImageRequest, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public ComponentRegistry getComponents() {
        return this.f23267m;
    }

    public final Context h() {
        return this.f23255a;
    }

    public final Logger i() {
        return this.f23263i;
    }

    public final ImageLoaderOptions j() {
        return this.f23262h;
    }

    public final void k(ImageRequest imageRequest, EventListener eventListener) {
        Logger logger = this.f23263i;
        if (logger != null && logger.a() <= 4) {
            logger.b("RealImageLoader", 4, "🏗  Cancelled - " + imageRequest.m(), (Throwable) null);
        }
        eventListener.a(imageRequest);
        ImageRequest.Listener A2 = imageRequest.A();
        if (A2 != null) {
            A2.a(imageRequest);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003a, code lost:
        if (r8 != null) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(coil.request.ErrorResult r7, coil.target.Target r8, coil.EventListener r9) {
        /*
            r6 = this;
            coil.request.ImageRequest r0 = r7.b()
            coil.util.Logger r1 = r6.f23263i
            if (r1 == 0) goto L_0x0036
            int r2 = r1.a()
            r3 = 4
            if (r2 > r3) goto L_0x0036
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "🚨 Failed - "
            r2.append(r4)
            java.lang.Object r4 = r0.m()
            r2.append(r4)
            java.lang.String r4 = " - "
            r2.append(r4)
            java.lang.Throwable r4 = r7.c()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r1.b(r5, r3, r2, r4)
        L_0x0036:
            boolean r1 = r8 instanceof coil.transition.TransitionTarget
            if (r1 != 0) goto L_0x003d
            if (r8 == 0) goto L_0x0069
            goto L_0x0050
        L_0x003d:
            coil.request.ImageRequest r1 = r7.b()
            coil.transition.Transition$Factory r1 = r1.P()
            r2 = r8
            coil.transition.TransitionTarget r2 = (coil.transition.TransitionTarget) r2
            coil.transition.Transition r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof coil.transition.NoneTransition
            if (r2 == 0) goto L_0x0058
        L_0x0050:
            android.graphics.drawable.Drawable r1 = r7.a()
            r8.d(r1)
            goto L_0x0069
        L_0x0058:
            coil.request.ImageRequest r8 = r7.b()
            r9.f(r8, r1)
            r1.a()
            coil.request.ImageRequest r8 = r7.b()
            r9.l(r8, r1)
        L_0x0069:
            r9.d(r0, r7)
            coil.request.ImageRequest$Listener r8 = r0.A()
            if (r8 == 0) goto L_0x0075
            r8.d(r0, r7)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.l(coil.request.ErrorResult, coil.target.Target, coil.EventListener):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0045, code lost:
        if (r8 != null) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(coil.request.SuccessResult r7, coil.target.Target r8, coil.EventListener r9) {
        /*
            r6 = this;
            coil.request.ImageRequest r0 = r7.b()
            coil.decode.DataSource r1 = r7.c()
            coil.util.Logger r2 = r6.f23263i
            if (r2 == 0) goto L_0x0041
            int r3 = r2.a()
            r4 = 4
            if (r3 > r4) goto L_0x0041
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = coil.util.Utils.g(r1)
            r3.append(r5)
            java.lang.String r5 = " Successful ("
            r3.append(r5)
            java.lang.String r1 = r1.name()
            r3.append(r1)
            java.lang.String r1 = ") - "
            r3.append(r1)
            java.lang.Object r1 = r0.m()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r3 = 0
            java.lang.String r5 = "RealImageLoader"
            r2.b(r5, r4, r1, r3)
        L_0x0041:
            boolean r1 = r8 instanceof coil.transition.TransitionTarget
            if (r1 != 0) goto L_0x0048
            if (r8 == 0) goto L_0x0074
            goto L_0x005b
        L_0x0048:
            coil.request.ImageRequest r1 = r7.b()
            coil.transition.Transition$Factory r1 = r1.P()
            r2 = r8
            coil.transition.TransitionTarget r2 = (coil.transition.TransitionTarget) r2
            coil.transition.Transition r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof coil.transition.NoneTransition
            if (r2 == 0) goto L_0x0063
        L_0x005b:
            android.graphics.drawable.Drawable r1 = r7.a()
            r8.b(r1)
            goto L_0x0074
        L_0x0063:
            coil.request.ImageRequest r8 = r7.b()
            r9.f(r8, r1)
            r1.a()
            coil.request.ImageRequest r8 = r7.b()
            r9.l(r8, r1)
        L_0x0074:
            r9.b(r0, r7)
            coil.request.ImageRequest$Listener r8 = r0.A()
            if (r8 == 0) goto L_0x0080
            r8.b(r0, r7)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.m(coil.request.SuccessResult, coil.target.Target, coil.EventListener):void");
    }

    public final void n(int i2) {
        MemoryCache memoryCache;
        Lazy lazy = this.f23257c;
        if (lazy != null && (memoryCache = (MemoryCache) lazy.getValue()) != null) {
            memoryCache.b(i2);
        }
    }
}
