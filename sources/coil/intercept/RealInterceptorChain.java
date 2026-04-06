package coil.intercept;

import coil.EventListener;
import coil.intercept.Interceptor;
import coil.request.ImageRequest;
import coil.request.NullRequestData;
import coil.size.Size;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a  reason: collision with root package name */
    public final ImageRequest f23472a;

    /* renamed from: b  reason: collision with root package name */
    public final List f23473b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23474c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageRequest f23475d;

    /* renamed from: e  reason: collision with root package name */
    public final Size f23476e;

    /* renamed from: f  reason: collision with root package name */
    public final EventListener f23477f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f23478g;

    public RealInterceptorChain(ImageRequest imageRequest, List list, int i2, ImageRequest imageRequest2, Size size, EventListener eventListener, boolean z2) {
        this.f23472a = imageRequest;
        this.f23473b = list;
        this.f23474c = i2;
        this.f23475d = imageRequest2;
        this.f23476e = size;
        this.f23477f = eventListener;
        this.f23478g = z2;
    }

    public static /* synthetic */ RealInterceptorChain d(RealInterceptorChain realInterceptorChain, int i2, ImageRequest imageRequest, Size size, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = realInterceptorChain.f23474c;
        }
        if ((i3 & 2) != 0) {
            imageRequest = realInterceptorChain.a();
        }
        if ((i3 & 4) != 0) {
            size = realInterceptorChain.e();
        }
        return realInterceptorChain.c(i2, imageRequest, size);
    }

    public ImageRequest a() {
        return this.f23475d;
    }

    public final void b(ImageRequest imageRequest, Interceptor interceptor) {
        if (imageRequest.l() != this.f23472a.l()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's context.").toString());
        } else if (imageRequest.m() == NullRequestData.f23647a) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot set the request's data to null.").toString());
        } else if (imageRequest.M() != this.f23472a.M()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's target.").toString());
        } else if (imageRequest.z() != this.f23472a.z()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's lifecycle.").toString());
        } else if (imageRequest.K() != this.f23472a.K()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
        }
    }

    public final RealInterceptorChain c(int i2, ImageRequest imageRequest, Size size) {
        return new RealInterceptorChain(this.f23472a, this.f23473b, i2, imageRequest, size, this.f23477f, this.f23478g);
    }

    public Size e() {
        return this.f23476e;
    }

    public final EventListener f() {
        return this.f23477f;
    }

    public final boolean g() {
        return this.f23478g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(coil.request.ImageRequest r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof coil.intercept.RealInterceptorChain$proceed$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            coil.intercept.RealInterceptorChain$proceed$1 r0 = (coil.intercept.RealInterceptorChain$proceed$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            coil.intercept.RealInterceptorChain$proceed$1 r0 = new coil.intercept.RealInterceptorChain$proceed$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r12 = r0.D
            coil.intercept.Interceptor r12 = (coil.intercept.Interceptor) r12
            java.lang.Object r0 = r0.C
            coil.intercept.RealInterceptorChain r0 = (coil.intercept.RealInterceptorChain) r0
            kotlin.ResultKt.b(r13)
            goto L_0x0074
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0039:
            kotlin.ResultKt.b(r13)
            int r13 = r11.f23474c
            if (r13 <= 0) goto L_0x004c
            java.util.List r2 = r11.f23473b
            int r13 = r13 - r3
            java.lang.Object r13 = r2.get(r13)
            coil.intercept.Interceptor r13 = (coil.intercept.Interceptor) r13
            r11.b(r12, r13)
        L_0x004c:
            java.util.List r13 = r11.f23473b
            int r2 = r11.f23474c
            java.lang.Object r13 = r13.get(r2)
            coil.intercept.Interceptor r13 = (coil.intercept.Interceptor) r13
            int r2 = r11.f23474c
            int r5 = r2 + 1
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r11
            r6 = r12
            coil.intercept.RealInterceptorChain r12 = d(r4, r5, r6, r7, r8, r9)
            r0.C = r11
            r0.D = r13
            r0.G = r3
            java.lang.Object r12 = r13.a(r12, r0)
            if (r12 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r0 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x0074:
            coil.request.ImageResult r13 = (coil.request.ImageResult) r13
            coil.request.ImageRequest r1 = r13.b()
            r0.b(r1, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.RealInterceptorChain.h(coil.request.ImageRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
