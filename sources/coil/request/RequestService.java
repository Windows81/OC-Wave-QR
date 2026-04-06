package coil.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import coil.ImageLoader;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.util.Bitmaps;
import coil.util.HardwareBitmapService;
import coil.util.HardwareBitmaps;
import coil.util.Logger;
import coil.util.Requests;
import coil.util.SystemCallbacks;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

@Metadata
public final class RequestService {

    /* renamed from: a  reason: collision with root package name */
    public final ImageLoader f23670a;

    /* renamed from: b  reason: collision with root package name */
    public final SystemCallbacks f23671b;

    /* renamed from: c  reason: collision with root package name */
    public final HardwareBitmapService f23672c;

    public RequestService(ImageLoader imageLoader, SystemCallbacks systemCallbacks, Logger logger) {
        this.f23670a = imageLoader;
        this.f23671b = systemCallbacks;
        this.f23672c = HardwareBitmaps.a(logger);
    }

    public final ErrorResult a(ImageRequest imageRequest, Throwable th) {
        Drawable drawable;
        if (th instanceof NullRequestDataException) {
            drawable = imageRequest.u();
            if (drawable == null) {
                drawable = imageRequest.t();
            }
        } else {
            drawable = imageRequest.t();
        }
        return new ErrorResult(drawable, imageRequest, th);
    }

    public final boolean b(Options options) {
        return !Bitmaps.d(options.f()) || this.f23672c.b();
    }

    public final boolean c(ImageRequest imageRequest, Bitmap.Config config) {
        if (!Bitmaps.d(config)) {
            return true;
        }
        if (!imageRequest.h()) {
            return false;
        }
        Target M = imageRequest.M();
        if (M instanceof ViewTarget) {
            View r2 = ((ViewTarget) M).r();
            return !r2.isAttachedToWindow() || r2.isHardwareAccelerated();
        }
    }

    public final boolean d(ImageRequest imageRequest, Size size) {
        if (!Bitmaps.d(imageRequest.j())) {
            return true;
        }
        return c(imageRequest, imageRequest.j()) && this.f23672c.a(size);
    }

    public final boolean e(ImageRequest imageRequest) {
        return imageRequest.O().isEmpty() || ArraysKt.Y(Utils.p(), imageRequest.j());
    }

    public final Options f(ImageRequest imageRequest, Size size) {
        Bitmap.Config j2 = (!e(imageRequest) || !d(imageRequest, size)) ? Bitmap.Config.ARGB_8888 : imageRequest.j();
        Dimension d2 = size.d();
        Dimension.Undefined undefined = Dimension.Undefined.f23692a;
        return new Options(imageRequest.l(), j2, imageRequest.k(), size, (Intrinsics.d(d2, undefined) || Intrinsics.d(size.c(), undefined)) ? Scale.FIT : imageRequest.J(), Requests.a(imageRequest), imageRequest.i() && imageRequest.O().isEmpty() && j2 != Bitmap.Config.ALPHA_8, imageRequest.I(), imageRequest.r(), imageRequest.x(), imageRequest.L(), imageRequest.E(), imageRequest.C(), imageRequest.s(), imageRequest.D());
    }

    public final RequestDelegate g(ImageRequest imageRequest, Job job) {
        Lifecycle z2 = imageRequest.z();
        Target M = imageRequest.M();
        if (!(M instanceof ViewTarget)) {
            return new BaseRequestDelegate(z2, job);
        }
        return new ViewTargetRequestDelegate(this.f23670a, imageRequest, (ViewTarget) M, z2, job);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final coil.request.Options h(coil.request.Options r23) {
        /*
            r22 = this;
            android.graphics.Bitmap$Config r0 = r23.f()
            coil.request.CachePolicy r1 = r23.k()
            boolean r2 = r22.b(r23)
            r3 = 1
            if (r2 != 0) goto L_0x0014
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r6 = r0
            r2 = r3
            goto L_0x0016
        L_0x0014:
            r2 = 0
            r6 = r0
        L_0x0016:
            coil.request.CachePolicy r0 = r23.k()
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x002f
            r0 = r22
            coil.util.SystemCallbacks r4 = r0.f23671b
            boolean r4 = r4.b()
            if (r4 != 0) goto L_0x0031
            coil.request.CachePolicy r1 = coil.request.CachePolicy.DISABLED
            r19 = r1
            goto L_0x0034
        L_0x002f:
            r0 = r22
        L_0x0031:
            r19 = r1
            r3 = r2
        L_0x0034:
            if (r3 == 0) goto L_0x0051
            r20 = 16381(0x3ffd, float:2.2955E-41)
            r21 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r4 = r23
            coil.request.Options r1 = coil.request.Options.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
        L_0x0051:
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.request.RequestService.h(coil.request.Options):coil.request.Options");
    }
}
