package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.EventListener;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.memory.MemoryCacheService;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.request.RequestService;
import coil.util.Bitmaps;
import coil.util.DrawableUtils;
import coil.util.Logger;
import coil.util.SystemCallbacks;
import coil.util.Utils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;

@Metadata
public final class EngineInterceptor implements Interceptor {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f23462f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final ImageLoader f23463a;

    /* renamed from: b  reason: collision with root package name */
    public final SystemCallbacks f23464b;

    /* renamed from: c  reason: collision with root package name */
    public final RequestService f23465c;

    /* renamed from: d  reason: collision with root package name */
    public final Logger f23466d;

    /* renamed from: e  reason: collision with root package name */
    public final MemoryCacheService f23467e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class ExecuteResult {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable f23468a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f23469b;

        /* renamed from: c  reason: collision with root package name */
        public final DataSource f23470c;

        /* renamed from: d  reason: collision with root package name */
        public final String f23471d;

        public ExecuteResult(Drawable drawable, boolean z2, DataSource dataSource, String str) {
            this.f23468a = drawable;
            this.f23469b = z2;
            this.f23470c = dataSource;
            this.f23471d = str;
        }

        public static /* synthetic */ ExecuteResult b(ExecuteResult executeResult, Drawable drawable, boolean z2, DataSource dataSource, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                drawable = executeResult.f23468a;
            }
            if ((i2 & 2) != 0) {
                z2 = executeResult.f23469b;
            }
            if ((i2 & 4) != 0) {
                dataSource = executeResult.f23470c;
            }
            if ((i2 & 8) != 0) {
                str = executeResult.f23471d;
            }
            return executeResult.a(drawable, z2, dataSource, str);
        }

        public final ExecuteResult a(Drawable drawable, boolean z2, DataSource dataSource, String str) {
            return new ExecuteResult(drawable, z2, dataSource, str);
        }

        public final DataSource c() {
            return this.f23470c;
        }

        public final String d() {
            return this.f23471d;
        }

        public final Drawable e() {
            return this.f23468a;
        }

        public final boolean f() {
            return this.f23469b;
        }
    }

    public EngineInterceptor(ImageLoader imageLoader, SystemCallbacks systemCallbacks, RequestService requestService, Logger logger) {
        this.f23463a = imageLoader;
        this.f23464b = systemCallbacks;
        this.f23465c = requestService;
        this.f23466d = logger;
        this.f23467e = new MemoryCacheService(imageLoader, requestService, logger);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(coil.intercept.Interceptor.Chain r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof coil.intercept.EngineInterceptor$intercept$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            coil.intercept.EngineInterceptor$intercept$1 r0 = (coil.intercept.EngineInterceptor$intercept$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            coil.intercept.EngineInterceptor$intercept$1 r0 = new coil.intercept.EngineInterceptor$intercept$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r14 = r0.D
            coil.intercept.Interceptor$Chain r14 = (coil.intercept.Interceptor.Chain) r14
            java.lang.Object r0 = r0.C
            coil.intercept.EngineInterceptor r0 = (coil.intercept.EngineInterceptor) r0
            kotlin.ResultKt.b(r15)     // Catch:{ all -> 0x0032 }
            goto L_0x009f
        L_0x0032:
            r15 = move-exception
            goto L_0x00a0
        L_0x0034:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x003c:
            kotlin.ResultKt.b(r15)
            coil.request.ImageRequest r6 = r14.a()     // Catch:{ all -> 0x0078 }
            java.lang.Object r15 = r6.m()     // Catch:{ all -> 0x0078 }
            coil.size.Size r2 = r14.e()     // Catch:{ all -> 0x0078 }
            coil.EventListener r9 = coil.util.Utils.h(r14)     // Catch:{ all -> 0x0078 }
            coil.request.RequestService r4 = r13.f23465c     // Catch:{ all -> 0x0078 }
            coil.request.Options r8 = r4.f(r6, r2)     // Catch:{ all -> 0x0078 }
            coil.size.Scale r4 = r8.m()     // Catch:{ all -> 0x0078 }
            r9.m(r6, r15)     // Catch:{ all -> 0x0078 }
            coil.ImageLoader r5 = r13.f23463a     // Catch:{ all -> 0x0078 }
            coil.ComponentRegistry r5 = r5.getComponents()     // Catch:{ all -> 0x0078 }
            java.lang.Object r7 = r5.g(r15, r8)     // Catch:{ all -> 0x0078 }
            r9.i(r6, r7)     // Catch:{ all -> 0x0078 }
            coil.memory.MemoryCacheService r15 = r13.f23467e     // Catch:{ all -> 0x0078 }
            coil.memory.MemoryCache$Key r10 = r15.f(r6, r7, r8, r9)     // Catch:{ all -> 0x0078 }
            if (r10 == 0) goto L_0x007b
            coil.memory.MemoryCacheService r15 = r13.f23467e     // Catch:{ all -> 0x0078 }
            coil.memory.MemoryCache$Value r15 = r15.a(r6, r10, r2, r4)     // Catch:{ all -> 0x0078 }
            goto L_0x007c
        L_0x0078:
            r15 = move-exception
            r0 = r13
            goto L_0x00a0
        L_0x007b:
            r15 = 0
        L_0x007c:
            if (r15 == 0) goto L_0x0085
            coil.memory.MemoryCacheService r0 = r13.f23467e     // Catch:{ all -> 0x0078 }
            coil.request.SuccessResult r14 = r0.g(r14, r6, r10, r15)     // Catch:{ all -> 0x0078 }
            return r14
        L_0x0085:
            kotlinx.coroutines.CoroutineDispatcher r15 = r6.v()     // Catch:{ all -> 0x0078 }
            coil.intercept.EngineInterceptor$intercept$2 r2 = new coil.intercept.EngineInterceptor$intercept$2     // Catch:{ all -> 0x0078 }
            r12 = 0
            r4 = r2
            r5 = r13
            r11 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0078 }
            r0.C = r13     // Catch:{ all -> 0x0078 }
            r0.D = r14     // Catch:{ all -> 0x0078 }
            r0.G = r3     // Catch:{ all -> 0x0078 }
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.g(r15, r2, r0)     // Catch:{ all -> 0x0078 }
            if (r15 != r1) goto L_0x009f
            return r1
        L_0x009f:
            return r15
        L_0x00a0:
            boolean r1 = r15 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L_0x00af
            coil.request.RequestService r0 = r0.f23465c
            coil.request.ImageRequest r14 = r14.a()
            coil.request.ErrorResult r14 = r0.a(r14, r15)
            return r14
        L_0x00af:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.a(coil.intercept.Interceptor$Chain, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Bitmap h(Drawable drawable, Options options, List list) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config c2 = Bitmaps.c(bitmap);
            if (ArraysKt.Y(Utils.p(), c2)) {
                return bitmap;
            }
            Logger logger = this.f23466d;
            if (logger != null && logger.a() <= 4) {
                logger.b("EngineInterceptor", 4, "Converting bitmap with config " + c2 + " to apply transformations: " + list + '.', (Throwable) null);
            }
        } else {
            Logger logger2 = this.f23466d;
            if (logger2 != null && logger2.a() <= 4) {
                logger2.b("EngineInterceptor", 4, "Converting drawable of type " + drawable.getClass().getCanonicalName() + " to apply transformations: " + list + '.', (Throwable) null);
            }
        }
        return DrawableUtils.f23746a.a(drawable, options.f(), options.n(), options.m(), options.c());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(coil.fetch.SourceResult r18, coil.ComponentRegistry r19, coil.request.ImageRequest r20, java.lang.Object r21, coil.request.Options r22, coil.EventListener r23, kotlin.coroutines.Continuation r24) {
        /*
            r17 = this;
            r0 = r24
            boolean r1 = r0 instanceof coil.intercept.EngineInterceptor$decode$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            coil.intercept.EngineInterceptor$decode$1 r1 = (coil.intercept.EngineInterceptor$decode$1) r1
            int r2 = r1.N
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.N = r2
            r2 = r17
            goto L_0x001e
        L_0x0017:
            coil.intercept.EngineInterceptor$decode$1 r1 = new coil.intercept.EngineInterceptor$decode$1
            r2 = r17
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.L
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r1.N
            r5 = 1
            if (r4 == 0) goto L_0x0062
            if (r4 != r5) goto L_0x005a
            int r4 = r1.K
            java.lang.Object r6 = r1.J
            coil.decode.Decoder r6 = (coil.decode.Decoder) r6
            java.lang.Object r7 = r1.I
            coil.EventListener r7 = (coil.EventListener) r7
            java.lang.Object r8 = r1.H
            coil.request.Options r8 = (coil.request.Options) r8
            java.lang.Object r9 = r1.G
            java.lang.Object r10 = r1.F
            coil.request.ImageRequest r10 = (coil.request.ImageRequest) r10
            java.lang.Object r11 = r1.E
            coil.ComponentRegistry r11 = (coil.ComponentRegistry) r11
            java.lang.Object r12 = r1.D
            coil.fetch.SourceResult r12 = (coil.fetch.SourceResult) r12
            java.lang.Object r13 = r1.C
            coil.intercept.EngineInterceptor r13 = (coil.intercept.EngineInterceptor) r13
            kotlin.ResultKt.b(r0)
            r14 = r11
            r11 = r1
            r1 = r14
            r15 = r10
            r10 = r4
            r4 = r15
            r16 = r8
            r8 = r7
            r7 = r16
            goto L_0x00b4
        L_0x005a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0062:
            kotlin.ResultKt.b(r0)
            r0 = 0
            r4 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r0
            r10 = r1
            r13 = r2
            r0 = r18
            r1 = r19
        L_0x0075:
            coil.ImageLoader r11 = r13.f23463a
            kotlin.Pair r9 = r1.i(r0, r7, r11, r9)
            if (r9 == 0) goto L_0x00e5
            java.lang.Object r11 = r9.e()
            coil.decode.Decoder r11 = (coil.decode.Decoder) r11
            java.lang.Object r9 = r9.f()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r9 = r9 + r5
            r8.j(r4, r11, r7)
            r10.C = r13
            r10.D = r0
            r10.E = r1
            r10.F = r4
            r10.G = r6
            r10.H = r7
            r10.I = r8
            r10.J = r11
            r10.K = r9
            r10.N = r5
            java.lang.Object r12 = r11.a(r10)
            if (r12 != r3) goto L_0x00ac
            return r3
        L_0x00ac:
            r14 = r12
            r12 = r0
            r0 = r14
            r15 = r9
            r9 = r6
            r6 = r11
            r11 = r10
            r10 = r15
        L_0x00b4:
            coil.decode.DecodeResult r0 = (coil.decode.DecodeResult) r0
            r8.o(r4, r6, r7, r0)
            if (r0 == 0) goto L_0x00e0
            coil.intercept.EngineInterceptor$ExecuteResult r1 = new coil.intercept.EngineInterceptor$ExecuteResult
            android.graphics.drawable.Drawable r3 = r0.a()
            boolean r0 = r0.b()
            coil.decode.DataSource r4 = r12.a()
            coil.decode.ImageSource r5 = r12.b()
            boolean r6 = r5 instanceof coil.decode.FileImageSource
            r7 = 0
            if (r6 == 0) goto L_0x00d5
            coil.decode.FileImageSource r5 = (coil.decode.FileImageSource) r5
            goto L_0x00d6
        L_0x00d5:
            r5 = r7
        L_0x00d6:
            if (r5 == 0) goto L_0x00dc
            java.lang.String r7 = r5.d()
        L_0x00dc:
            r1.<init>(r3, r0, r4, r7)
            return r1
        L_0x00e0:
            r6 = r9
            r9 = r10
            r10 = r11
            r0 = r12
            goto L_0x0075
        L_0x00e5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to create a decoder that supports: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.i(coil.fetch.SourceResult, coil.ComponentRegistry, coil.request.ImageRequest, java.lang.Object, coil.request.Options, coil.EventListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: coil.fetch.SourceResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: android.graphics.drawable.BitmapDrawable} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011d A[Catch:{ all -> 0x00bf }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011e A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0134 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0174 A[SYNTHETIC, Splitter:B:54:0x0174] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(coil.request.ImageRequest r27, java.lang.Object r28, coil.request.Options r29, coil.EventListener r30, kotlin.coroutines.Continuation r31) {
        /*
            r26 = this;
            r8 = r26
            r0 = r31
            boolean r1 = r0 instanceof coil.intercept.EngineInterceptor$execute$1
            if (r1 == 0) goto L_0x0018
            r1 = r0
            coil.intercept.EngineInterceptor$execute$1 r1 = (coil.intercept.EngineInterceptor$execute$1) r1
            int r2 = r1.M
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.M = r2
        L_0x0016:
            r0 = r1
            goto L_0x001e
        L_0x0018:
            coil.intercept.EngineInterceptor$execute$1 r1 = new coil.intercept.EngineInterceptor$execute$1
            r1.<init>(r8, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r1 = r0.K
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.M
            r10 = 3
            r11 = 2
            r3 = 1
            r12 = 0
            if (r2 == 0) goto L_0x0088
            if (r2 == r3) goto L_0x005b
            if (r2 == r11) goto L_0x003f
            if (r2 != r10) goto L_0x0037
            kotlin.ResultKt.b(r1)
            goto L_0x01cb
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            java.lang.Object r2 = r0.G
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r3 = r0.F
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            java.lang.Object r4 = r0.E
            coil.EventListener r4 = (coil.EventListener) r4
            java.lang.Object r5 = r0.D
            coil.request.ImageRequest r5 = (coil.request.ImageRequest) r5
            java.lang.Object r6 = r0.C
            coil.intercept.EngineInterceptor r6 = (coil.intercept.EngineInterceptor) r6
            kotlin.ResultKt.b(r1)     // Catch:{ all -> 0x0058 }
            goto L_0x0168
        L_0x0058:
            r0 = move-exception
            goto L_0x01ea
        L_0x005b:
            java.lang.Object r2 = r0.J
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r3 = r0.I
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            java.lang.Object r4 = r0.H
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            java.lang.Object r5 = r0.G
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r0.F
            coil.EventListener r6 = (coil.EventListener) r6
            java.lang.Object r7 = r0.E
            java.lang.Object r13 = r0.D
            coil.request.ImageRequest r13 = (coil.request.ImageRequest) r13
            java.lang.Object r14 = r0.C
            coil.intercept.EngineInterceptor r14 = (coil.intercept.EngineInterceptor) r14
            kotlin.ResultKt.b(r1)     // Catch:{ all -> 0x0084 }
            r15 = r3
            r19 = r4
            r3 = r5
            r21 = r7
            goto L_0x0129
        L_0x0084:
            r0 = move-exception
            r2 = r3
            goto L_0x01ea
        L_0x0088:
            kotlin.ResultKt.b(r1)
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            r1 = r29
            r13.f40908z = r1
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
            r14.<init>()
            coil.ImageLoader r1 = r8.f23463a
            coil.ComponentRegistry r1 = r1.getComponents()
            r14.f40908z = r1
            kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef
            r15.<init>()
            coil.request.RequestService r1 = r8.f23465c     // Catch:{ all -> 0x00bf }
            java.lang.Object r2 = r13.f40908z     // Catch:{ all -> 0x00bf }
            coil.request.Options r2 = (coil.request.Options) r2     // Catch:{ all -> 0x00bf }
            coil.request.Options r1 = r1.h(r2)     // Catch:{ all -> 0x00bf }
            r13.f40908z = r1     // Catch:{ all -> 0x00bf }
            kotlin.Pair r1 = r27.w()     // Catch:{ all -> 0x00bf }
            if (r1 != 0) goto L_0x00c3
            coil.decode.Decoder$Factory r1 = r27.o()     // Catch:{ all -> 0x00bf }
            if (r1 == 0) goto L_0x00ec
            goto L_0x00c3
        L_0x00bf:
            r0 = move-exception
            r2 = r15
            goto L_0x01ea
        L_0x00c3:
            java.lang.Object r1 = r14.f40908z     // Catch:{ all -> 0x00bf }
            coil.ComponentRegistry r1 = (coil.ComponentRegistry) r1     // Catch:{ all -> 0x00bf }
            coil.ComponentRegistry$Builder r1 = r1.h()     // Catch:{ all -> 0x00bf }
            kotlin.Pair r2 = r27.w()     // Catch:{ all -> 0x00bf }
            r4 = 0
            if (r2 == 0) goto L_0x00d9
            java.util.List r5 = r1.g()     // Catch:{ all -> 0x00bf }
            r5.add(r4, r2)     // Catch:{ all -> 0x00bf }
        L_0x00d9:
            coil.decode.Decoder$Factory r2 = r27.o()     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x00e6
            java.util.List r5 = r1.f()     // Catch:{ all -> 0x00bf }
            r5.add(r4, r2)     // Catch:{ all -> 0x00bf }
        L_0x00e6:
            coil.ComponentRegistry r1 = r1.e()     // Catch:{ all -> 0x00bf }
            r14.f40908z = r1     // Catch:{ all -> 0x00bf }
        L_0x00ec:
            java.lang.Object r1 = r14.f40908z     // Catch:{ all -> 0x00bf }
            r2 = r1
            coil.ComponentRegistry r2 = (coil.ComponentRegistry) r2     // Catch:{ all -> 0x00bf }
            java.lang.Object r1 = r13.f40908z     // Catch:{ all -> 0x00bf }
            r5 = r1
            coil.request.Options r5 = (coil.request.Options) r5     // Catch:{ all -> 0x00bf }
            r0.C = r8     // Catch:{ all -> 0x00bf }
            r7 = r27
            r0.D = r7     // Catch:{ all -> 0x00bf }
            r6 = r28
            r0.E = r6     // Catch:{ all -> 0x00bf }
            r4 = r30
            r0.F = r4     // Catch:{ all -> 0x00bf }
            r0.G = r13     // Catch:{ all -> 0x00bf }
            r0.H = r14     // Catch:{ all -> 0x00bf }
            r0.I = r15     // Catch:{ all -> 0x00bf }
            r0.J = r15     // Catch:{ all -> 0x00bf }
            r0.M = r3     // Catch:{ all -> 0x00bf }
            r1 = r26
            r3 = r27
            r4 = r28
            r6 = r30
            r7 = r0
            java.lang.Object r1 = r1.k(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00bf }
            if (r1 != r9) goto L_0x011e
            return r9
        L_0x011e:
            r21 = r28
            r6 = r30
            r3 = r13
            r19 = r14
            r2 = r15
            r13 = r27
            r14 = r8
        L_0x0129:
            r2.f40908z = r1     // Catch:{ all -> 0x00bf }
            java.lang.Object r1 = r15.f40908z     // Catch:{ all -> 0x00bf }
            r2 = r1
            coil.fetch.FetchResult r2 = (coil.fetch.FetchResult) r2     // Catch:{ all -> 0x00bf }
            boolean r4 = r2 instanceof coil.fetch.SourceResult     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0174
            kotlinx.coroutines.CoroutineDispatcher r1 = r13.n()     // Catch:{ all -> 0x00bf }
            coil.intercept.EngineInterceptor$execute$executeResult$1 r2 = new coil.intercept.EngineInterceptor$execute$executeResult$1     // Catch:{ all -> 0x00bf }
            r24 = 0
            r16 = r2
            r17 = r14
            r18 = r15
            r20 = r13
            r22 = r3
            r23 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x00bf }
            r0.C = r14     // Catch:{ all -> 0x00bf }
            r0.D = r13     // Catch:{ all -> 0x00bf }
            r0.E = r6     // Catch:{ all -> 0x00bf }
            r0.F = r3     // Catch:{ all -> 0x00bf }
            r0.G = r15     // Catch:{ all -> 0x00bf }
            r0.H = r12     // Catch:{ all -> 0x00bf }
            r0.I = r12     // Catch:{ all -> 0x00bf }
            r0.J = r12     // Catch:{ all -> 0x00bf }
            r0.M = r11     // Catch:{ all -> 0x00bf }
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.g(r1, r2, r0)     // Catch:{ all -> 0x00bf }
            if (r1 != r9) goto L_0x0164
            return r9
        L_0x0164:
            r4 = r6
            r5 = r13
            r6 = r14
            r2 = r15
        L_0x0168:
            coil.intercept.EngineInterceptor$ExecuteResult r1 = (coil.intercept.EngineInterceptor.ExecuteResult) r1     // Catch:{ all -> 0x0058 }
            r15 = r2
            r2 = r6
            r6 = r4
            r4 = r5
            r25 = r3
            r3 = r1
            r1 = r25
            goto L_0x0197
        L_0x0174:
            boolean r2 = r2 instanceof coil.fetch.DrawableResult     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x01e4
            coil.intercept.EngineInterceptor$ExecuteResult r2 = new coil.intercept.EngineInterceptor$ExecuteResult     // Catch:{ all -> 0x00bf }
            coil.fetch.DrawableResult r1 = (coil.fetch.DrawableResult) r1     // Catch:{ all -> 0x00bf }
            android.graphics.drawable.Drawable r1 = r1.b()     // Catch:{ all -> 0x00bf }
            java.lang.Object r4 = r15.f40908z     // Catch:{ all -> 0x00bf }
            coil.fetch.DrawableResult r4 = (coil.fetch.DrawableResult) r4     // Catch:{ all -> 0x00bf }
            boolean r4 = r4.c()     // Catch:{ all -> 0x00bf }
            java.lang.Object r5 = r15.f40908z     // Catch:{ all -> 0x00bf }
            coil.fetch.DrawableResult r5 = (coil.fetch.DrawableResult) r5     // Catch:{ all -> 0x00bf }
            coil.decode.DataSource r5 = r5.a()     // Catch:{ all -> 0x00bf }
            r2.<init>(r1, r4, r5, r12)     // Catch:{ all -> 0x00bf }
            r1 = r3
            r4 = r13
            r3 = r2
            r2 = r14
        L_0x0197:
            java.lang.Object r5 = r15.f40908z
            boolean r7 = r5 instanceof coil.fetch.SourceResult
            if (r7 == 0) goto L_0x01a0
            coil.fetch.SourceResult r5 = (coil.fetch.SourceResult) r5
            goto L_0x01a1
        L_0x01a0:
            r5 = r12
        L_0x01a1:
            if (r5 == 0) goto L_0x01ac
            coil.decode.ImageSource r5 = r5.b()
            if (r5 == 0) goto L_0x01ac
            coil.util.Utils.d(r5)
        L_0x01ac:
            java.lang.Object r1 = r1.f40908z
            r5 = r1
            coil.request.Options r5 = (coil.request.Options) r5
            r0.C = r12
            r0.D = r12
            r0.E = r12
            r0.F = r12
            r0.G = r12
            r0.H = r12
            r0.I = r12
            r0.J = r12
            r0.M = r10
            r7 = r0
            java.lang.Object r1 = r2.l(r3, r4, r5, r6, r7)
            if (r1 != r9) goto L_0x01cb
            return r9
        L_0x01cb:
            coil.intercept.EngineInterceptor$ExecuteResult r1 = (coil.intercept.EngineInterceptor.ExecuteResult) r1
            android.graphics.drawable.Drawable r0 = r1.e()
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 == 0) goto L_0x01d8
            r12 = r0
            android.graphics.drawable.BitmapDrawable r12 = (android.graphics.drawable.BitmapDrawable) r12
        L_0x01d8:
            if (r12 == 0) goto L_0x01e3
            android.graphics.Bitmap r0 = r12.getBitmap()
            if (r0 == 0) goto L_0x01e3
            r0.prepareToDraw()
        L_0x01e3:
            return r1
        L_0x01e4:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00bf }
            r0.<init>()     // Catch:{ all -> 0x00bf }
            throw r0     // Catch:{ all -> 0x00bf }
        L_0x01ea:
            java.lang.Object r1 = r2.f40908z
            boolean r2 = r1 instanceof coil.fetch.SourceResult
            if (r2 == 0) goto L_0x01f3
            r12 = r1
            coil.fetch.SourceResult r12 = (coil.fetch.SourceResult) r12
        L_0x01f3:
            if (r12 == 0) goto L_0x01fe
            coil.decode.ImageSource r1 = r12.b()
            if (r1 == 0) goto L_0x01fe
            coil.util.Utils.d(r1)
        L_0x01fe:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.j(coil.request.ImageRequest, java.lang.Object, coil.request.Options, coil.EventListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(coil.ComponentRegistry r10, coil.request.ImageRequest r11, java.lang.Object r12, coil.request.Options r13, coil.EventListener r14, kotlin.coroutines.Continuation r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof coil.intercept.EngineInterceptor$fetch$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            coil.intercept.EngineInterceptor$fetch$1 r0 = (coil.intercept.EngineInterceptor$fetch$1) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.M = r1
            goto L_0x0018
        L_0x0013:
            coil.intercept.EngineInterceptor$fetch$1 r0 = new coil.intercept.EngineInterceptor$fetch$1
            r0.<init>(r9, r15)
        L_0x0018:
            java.lang.Object r15 = r0.K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.M
            r3 = 1
            if (r2 == 0) goto L_0x0057
            if (r2 != r3) goto L_0x004f
            int r10 = r0.J
            java.lang.Object r11 = r0.I
            coil.fetch.Fetcher r11 = (coil.fetch.Fetcher) r11
            java.lang.Object r12 = r0.H
            coil.EventListener r12 = (coil.EventListener) r12
            java.lang.Object r13 = r0.G
            coil.request.Options r13 = (coil.request.Options) r13
            java.lang.Object r14 = r0.F
            java.lang.Object r2 = r0.E
            coil.request.ImageRequest r2 = (coil.request.ImageRequest) r2
            java.lang.Object r4 = r0.D
            coil.ComponentRegistry r4 = (coil.ComponentRegistry) r4
            java.lang.Object r5 = r0.C
            coil.intercept.EngineInterceptor r5 = (coil.intercept.EngineInterceptor) r5
            kotlin.ResultKt.b(r15)
            r6 = r0
            r0 = r10
            r10 = r4
            r4 = r6
            r7 = r2
            r2 = r11
            r11 = r7
            r8 = r14
            r14 = r12
            r12 = r8
            goto L_0x0095
        L_0x004f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0057:
            kotlin.ResultKt.b(r15)
            r15 = 0
            r5 = r9
        L_0x005c:
            coil.ImageLoader r2 = r5.f23463a
            kotlin.Pair r15 = r10.j(r12, r13, r2, r15)
            if (r15 == 0) goto L_0x00b5
            java.lang.Object r2 = r15.e()
            coil.fetch.Fetcher r2 = (coil.fetch.Fetcher) r2
            java.lang.Object r15 = r15.f()
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            int r15 = r15 + r3
            r14.k(r11, r2, r13)
            r0.C = r5
            r0.D = r10
            r0.E = r11
            r0.F = r12
            r0.G = r13
            r0.H = r14
            r0.I = r2
            r0.J = r15
            r0.M = r3
            java.lang.Object r4 = r2.a(r0)
            if (r4 != r1) goto L_0x0091
            return r1
        L_0x0091:
            r6 = r0
            r0 = r15
            r15 = r4
            r4 = r6
        L_0x0095:
            coil.fetch.FetchResult r15 = (coil.fetch.FetchResult) r15
            r14.h(r11, r2, r13, r15)     // Catch:{ all -> 0x00a0 }
            if (r15 == 0) goto L_0x009d
            return r15
        L_0x009d:
            r15 = r0
            r0 = r4
            goto L_0x005c
        L_0x00a0:
            r10 = move-exception
            boolean r11 = r15 instanceof coil.fetch.SourceResult
            if (r11 == 0) goto L_0x00a8
            coil.fetch.SourceResult r15 = (coil.fetch.SourceResult) r15
            goto L_0x00a9
        L_0x00a8:
            r15 = 0
        L_0x00a9:
            if (r15 == 0) goto L_0x00b4
            coil.decode.ImageSource r11 = r15.b()
            if (r11 == 0) goto L_0x00b4
            coil.util.Utils.d(r11)
        L_0x00b4:
            throw r10
        L_0x00b5:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Unable to create a fetcher that supports: "
            r10.append(r11)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.k(coil.ComponentRegistry, coil.request.ImageRequest, java.lang.Object, coil.request.Options, coil.EventListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object l(ExecuteResult executeResult, ImageRequest imageRequest, Options options, EventListener eventListener, Continuation continuation) {
        List O = imageRequest.O();
        if (O.isEmpty()) {
            return executeResult;
        }
        if ((executeResult.e() instanceof BitmapDrawable) || imageRequest.g()) {
            return BuildersKt.g(imageRequest.N(), new EngineInterceptor$transform$3(this, executeResult, options, O, eventListener, imageRequest, (Continuation) null), continuation);
        }
        Logger logger = this.f23466d;
        if (logger != null && logger.a() <= 4) {
            String canonicalName = executeResult.e().getClass().getCanonicalName();
            logger.b("EngineInterceptor", 4, "allowConversionToBitmap=false, skipping transformations for type " + canonicalName + '.', (Throwable) null);
        }
        return executeResult;
    }
}
