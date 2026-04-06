package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;
import com.google.android.gms.internal.base.zau;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class ImageManager {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f24802h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static final HashSet f24803i = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final Context f24804a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f24805b;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f24806c;

    /* renamed from: d  reason: collision with root package name */
    public final zam f24807d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f24808e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f24809f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f24810g;

    public final class ImageReceiver extends ResultReceiver {

        /* renamed from: A  reason: collision with root package name */
        public final ArrayList f24811A = new ArrayList();

        /* renamed from: z  reason: collision with root package name */
        public final Uri f24813z;

        public ImageReceiver(Uri uri) {
            super(new zau(Looper.getMainLooper()));
            this.f24813z = uri;
        }

        public final void b(zag zag) {
            Asserts.a("ImageReceiver.addImageRequest() must be called in the main thread");
            this.f24811A.add(zag);
        }

        public final void c(zag zag) {
            Asserts.a("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.f24811A.remove(zag);
        }

        public final void d() {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.setPackage("com.google.android.gms");
            intent.putExtra("com.google.android.gms.extras.uri", this.f24813z);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.this.f24804a.sendBroadcast(intent);
        }

        public final void onReceiveResult(int i2, Bundle bundle) {
            ImageManager imageManager = ImageManager.this;
            imageManager.f24806c.execute(new zaa(imageManager, this.f24813z, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    public interface OnImageLoadedListener {
        void a(Uri uri, Drawable drawable, boolean z2);
    }
}
