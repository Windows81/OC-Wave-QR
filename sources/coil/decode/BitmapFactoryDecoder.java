package coil.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import coil.ImageLoader;
import coil.decode.Decoder;
import coil.decode.ImageSource;
import coil.fetch.SourceResult;
import coil.request.Options;
import coil.size.Size;
import coil.size.Sizes;
import coil.util.Bitmaps;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;

@Metadata
public final class BitmapFactoryDecoder implements Decoder {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f23349e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final ImageSource f23350a;

    /* renamed from: b  reason: collision with root package name */
    public final Options f23351b;

    /* renamed from: c  reason: collision with root package name */
    public final Semaphore f23352c;

    /* renamed from: d  reason: collision with root package name */
    public final ExifOrientationPolicy f23353d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class ExceptionCatchingSource extends ForwardingSource {

        /* renamed from: A  reason: collision with root package name */
        public Exception f23354A;

        public ExceptionCatchingSource(Source source) {
            super(source);
        }

        public final Exception b() {
            return this.f23354A;
        }

        public long o1(Buffer buffer, long j2) {
            try {
                return super.o1(buffer, j2);
            } catch (Exception e2) {
                this.f23354A = e2;
                throw e2;
            }
        }
    }

    @Metadata
    public static final class Factory implements Decoder.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final ExifOrientationPolicy f23355a;

        /* renamed from: b  reason: collision with root package name */
        public final Semaphore f23356b;

        public Factory(int i2, ExifOrientationPolicy exifOrientationPolicy) {
            this.f23355a = exifOrientationPolicy;
            this.f23356b = SemaphoreKt.b(i2, 0, 2, (Object) null);
        }

        public Decoder a(SourceResult sourceResult, Options options, ImageLoader imageLoader) {
            return new BitmapFactoryDecoder(sourceResult.b(), options, this.f23356b, this.f23355a);
        }

        public boolean equals(Object obj) {
            return obj instanceof Factory;
        }

        public int hashCode() {
            return Factory.class.hashCode();
        }
    }

    public BitmapFactoryDecoder(ImageSource imageSource, Options options, Semaphore semaphore, ExifOrientationPolicy exifOrientationPolicy) {
        this.f23350a = imageSource;
        this.f23351b = options;
        this.f23352c = semaphore;
        this.f23353d = exifOrientationPolicy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof coil.decode.BitmapFactoryDecoder$decode$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            coil.decode.BitmapFactoryDecoder$decode$1 r0 = (coil.decode.BitmapFactoryDecoder$decode$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            coil.decode.BitmapFactoryDecoder$decode$1 r0 = new coil.decode.BitmapFactoryDecoder$decode$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r0 = r0.C
            kotlinx.coroutines.sync.Semaphore r0 = (kotlinx.coroutines.sync.Semaphore) r0
            kotlin.ResultKt.b(r8)     // Catch:{ all -> 0x0030 }
            goto L_0x0070
        L_0x0030:
            r8 = move-exception
            goto L_0x007a
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003a:
            java.lang.Object r2 = r0.D
            kotlinx.coroutines.sync.Semaphore r2 = (kotlinx.coroutines.sync.Semaphore) r2
            java.lang.Object r5 = r0.C
            coil.decode.BitmapFactoryDecoder r5 = (coil.decode.BitmapFactoryDecoder) r5
            kotlin.ResultKt.b(r8)
            r8 = r2
            goto L_0x005a
        L_0x0047:
            kotlin.ResultKt.b(r8)
            kotlinx.coroutines.sync.Semaphore r8 = r7.f23352c
            r0.C = r7
            r0.D = r8
            r0.G = r4
            java.lang.Object r2 = r8.c(r0)
            if (r2 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r5 = r7
        L_0x005a:
            coil.decode.BitmapFactoryDecoder$decode$2$1 r2 = new coil.decode.BitmapFactoryDecoder$decode$2$1     // Catch:{ all -> 0x0076 }
            r2.<init>(r5)     // Catch:{ all -> 0x0076 }
            r0.C = r8     // Catch:{ all -> 0x0076 }
            r5 = 0
            r0.D = r5     // Catch:{ all -> 0x0076 }
            r0.G = r3     // Catch:{ all -> 0x0076 }
            java.lang.Object r0 = kotlinx.coroutines.InterruptibleKt.c(r5, r2, r0, r4, r5)     // Catch:{ all -> 0x0076 }
            if (r0 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x0070:
            coil.decode.DecodeResult r8 = (coil.decode.DecodeResult) r8     // Catch:{ all -> 0x0030 }
            r0.g()
            return r8
        L_0x0076:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x007a:
            r0.g()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.decode.BitmapFactoryDecoder.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(BitmapFactory.Options options, ExifData exifData) {
        Bitmap.Config f2 = this.f23351b.f();
        if (exifData.b() || ExifUtilsKt.a(exifData)) {
            f2 = Bitmaps.e(f2);
        }
        if (this.f23351b.d() && f2 == Bitmap.Config.ARGB_8888 && Intrinsics.d(options.outMimeType, "image/jpeg")) {
            f2 = Bitmap.Config.RGB_565;
        }
        Bitmap.Config config = options.outConfig;
        Bitmap.Config config2 = Bitmap.Config.RGBA_F16;
        if (config == config2 && f2 != Bitmap.Config.HARDWARE) {
            f2 = config2;
        }
        options.inPreferredConfig = f2;
    }

    public final void d(BitmapFactory.Options options, ExifData exifData) {
        BitmapFactory.Options options2 = options;
        ImageSource.Metadata a2 = this.f23350a.a();
        boolean z2 = true;
        if ((a2 instanceof ResourceMetadata) && Sizes.a(this.f23351b.n())) {
            options2.inSampleSize = 1;
            options2.inScaled = true;
            options2.inDensity = ((ResourceMetadata) a2).a();
            options2.inTargetDensity = this.f23351b.g().getResources().getDisplayMetrics().densityDpi;
        } else if (options2.outWidth <= 0 || options2.outHeight <= 0) {
            options2.inSampleSize = 1;
            options2.inScaled = false;
        } else {
            int i2 = ExifUtilsKt.b(exifData) ? options2.outHeight : options2.outWidth;
            int i3 = ExifUtilsKt.b(exifData) ? options2.outWidth : options2.outHeight;
            Size n2 = this.f23351b.n();
            int B2 = Sizes.a(n2) ? i2 : Utils.B(n2.d(), this.f23351b.m());
            Size n3 = this.f23351b.n();
            int B3 = Sizes.a(n3) ? i3 : Utils.B(n3.c(), this.f23351b.m());
            int a3 = DecodeUtils.a(i2, i3, B2, B3, this.f23351b.m());
            options2.inSampleSize = a3;
            double b2 = DecodeUtils.b(((double) i2) / ((double) a3), ((double) i3) / ((double) a3), (double) B2, (double) B3, this.f23351b.m());
            if (this.f23351b.c()) {
                b2 = RangesKt.h(b2, 1.0d);
            }
            if (b2 != 1.0d) {
                z2 = false;
            }
            options2.inScaled = !z2;
            if (z2) {
                return;
            }
            if (b2 > 1.0d) {
                options2.inDensity = MathKt.c(((double) Integer.MAX_VALUE) / b2);
                options2.inTargetDensity = Integer.MAX_VALUE;
                return;
            }
            options2.inDensity = Integer.MAX_VALUE;
            options2.inTargetDensity = MathKt.c(((double) Integer.MAX_VALUE) * b2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ac, code lost:
        kotlin.io.CloseableKt.a(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00af, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final coil.decode.DecodeResult e(android.graphics.BitmapFactory.Options r9) {
        /*
            r8 = this;
            coil.decode.BitmapFactoryDecoder$ExceptionCatchingSource r0 = new coil.decode.BitmapFactoryDecoder$ExceptionCatchingSource
            coil.decode.ImageSource r1 = r8.f23350a
            okio.BufferedSource r1 = r1.b()
            r0.<init>(r1)
            okio.BufferedSource r1 = okio.Okio.d(r0)
            r2 = 1
            r9.inJustDecodeBounds = r2
            okio.BufferedSource r3 = r1.peek()
            java.io.InputStream r3 = r3.B1()
            r4 = 0
            android.graphics.BitmapFactory.decodeStream(r3, r4, r9)
            java.lang.Exception r3 = r0.b()
            if (r3 != 0) goto L_0x00b1
            r3 = 0
            r9.inJustDecodeBounds = r3
            coil.decode.ExifUtils r5 = coil.decode.ExifUtils.f23375a
            java.lang.String r6 = r9.outMimeType
            coil.decode.ExifOrientationPolicy r7 = r8.f23353d
            coil.decode.ExifData r6 = r5.a(r6, r1, r7)
            java.lang.Exception r7 = r0.b()
            if (r7 != 0) goto L_0x00b0
            r9.inMutable = r3
            coil.request.Options r7 = r8.f23351b
            android.graphics.ColorSpace r7 = r7.e()
            if (r7 == 0) goto L_0x0049
            coil.request.Options r7 = r8.f23351b
            android.graphics.ColorSpace r7 = r7.e()
            r9.inPreferredColorSpace = r7
        L_0x0049:
            coil.request.Options r7 = r8.f23351b
            boolean r7 = r7.l()
            r9.inPremultiplied = r7
            r8.c(r9, r6)
            r8.d(r9, r6)
            java.io.InputStream r7 = r1.B1()     // Catch:{ all -> 0x00a9 }
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r7, r4, r9)     // Catch:{ all -> 0x00a9 }
            kotlin.io.CloseableKt.a(r1, r4)
            java.lang.Exception r0 = r0.b()
            if (r0 != 0) goto L_0x00a8
            if (r7 == 0) goto L_0x00a0
            coil.request.Options r0 = r8.f23351b
            android.content.Context r0 = r0.g()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            r7.setDensity(r0)
            android.graphics.Bitmap r0 = r5.b(r7, r6)
            coil.decode.DecodeResult r1 = new coil.decode.DecodeResult
            coil.request.Options r4 = r8.f23351b
            android.content.Context r4 = r4.g()
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable
            r5.<init>(r4, r0)
            int r0 = r9.inSampleSize
            if (r0 > r2) goto L_0x009c
            boolean r9 = r9.inScaled
            if (r9 == 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r2 = r3
        L_0x009c:
            r1.<init>(r5, r2)
            return r1
        L_0x00a0:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format."
            r9.<init>(r0)
            throw r9
        L_0x00a8:
            throw r0
        L_0x00a9:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            kotlin.io.CloseableKt.a(r1, r9)
            throw r0
        L_0x00b0:
            throw r7
        L_0x00b1:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.decode.BitmapFactoryDecoder.e(android.graphics.BitmapFactory$Options):coil.decode.DecodeResult");
    }
}
