package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LayerManager {

    /* renamed from: g  reason: collision with root package name */
    public static final Companion f16428g = new Companion((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f16429h;

    /* renamed from: a  reason: collision with root package name */
    public final CanvasHolder f16430a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableScatterSet f16431b;

    /* renamed from: c  reason: collision with root package name */
    public ImageReader f16432c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f16433d;

    /* renamed from: e  reason: collision with root package name */
    public MutableObjectList f16434e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16435f;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return LayerManager.f16429h;
        }

        public Companion() {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        f16429h = Intrinsics.d(lowerCase, "robolectric");
    }

    public static final void e(ImageReader imageReader) {
        Image acquireLatestImage;
        if (imageReader != null && (acquireLatestImage = imageReader.acquireLatestImage()) != null) {
            acquireLatestImage.close();
        }
    }

    public final void c() {
        ImageReader imageReader = this.f16432c;
        if (imageReader != null) {
            imageReader.close();
        }
        this.f16432c = null;
    }

    public final void d(ScatterSet scatterSet) {
        ScatterSet scatterSet2 = scatterSet;
        if (scatterSet.e() && !f16429h) {
            ImageReader imageReader = this.f16432c;
            if (imageReader == null) {
                imageReader = ImageReader.newInstance(1, 1, 1, 3);
                imageReader.setOnImageAvailableListener(new x(), this.f16433d);
                this.f16432c = imageReader;
            }
            Surface surface = imageReader.getSurface();
            Canvas a2 = LockHardwareCanvasHelper.f16441a.a(surface);
            this.f16435f = true;
            CanvasHolder canvasHolder = this.f16430a;
            Canvas A2 = canvasHolder.a().A();
            canvasHolder.a().B(a2);
            AndroidCanvas a3 = canvasHolder.a();
            a2.save();
            int i2 = 0;
            a2.clipRect(0, 0, 1, 1);
            Object[] objArr = scatterSet2.f1967b;
            long[] jArr = scatterSet2.f1966a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j2 = jArr[i3];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i2; i5 < i4; i5++) {
                            if ((j2 & 255) < 128) {
                                ((GraphicsLayer) objArr[(i3 << 3) + i5]).i(a3);
                            }
                            j2 >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                    i2 = 0;
                }
            }
            a2.restore();
            canvasHolder.a().B(A2);
            this.f16435f = false;
            MutableObjectList mutableObjectList = this.f16434e;
            if (mutableObjectList != null && mutableObjectList.h()) {
                Object[] objArr2 = mutableObjectList.f1937a;
                int i6 = mutableObjectList.f1938b;
                for (int i7 = 0; i7 < i6; i7++) {
                    f((GraphicsLayer) objArr2[i7]);
                }
                mutableObjectList.t();
            }
            surface.unlockCanvasAndPost(a2);
        }
    }

    public final void f(GraphicsLayer graphicsLayer) {
        if (this.f16435f) {
            MutableObjectList mutableObjectList = this.f16434e;
            if (mutableObjectList == null) {
                mutableObjectList = new MutableObjectList(0, 1, (DefaultConstructorMarker) null);
                this.f16434e = mutableObjectList;
            }
            mutableObjectList.n(graphicsLayer);
        } else if (this.f16431b.y(graphicsLayer)) {
            graphicsLayer.g();
        }
    }

    public final void g() {
        c();
        d(this.f16431b);
    }
}
