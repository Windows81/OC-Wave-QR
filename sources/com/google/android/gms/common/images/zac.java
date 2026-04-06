package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

final class zac implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final Bitmap f24824A;

    /* renamed from: B  reason: collision with root package name */
    public final CountDownLatch f24825B;
    public final /* synthetic */ ImageManager C;

    /* renamed from: z  reason: collision with root package name */
    public final Uri f24826z;

    public zac(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z2, CountDownLatch countDownLatch) {
        this.C = imageManager;
        this.f24826z = uri;
        this.f24824A = bitmap;
        this.f24825B = countDownLatch;
    }

    public final void run() {
        Asserts.a("OnBitmapLoadedRunnable must be executed in the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.C.f24809f.remove(this.f24826z);
        if (imageReceiver != null) {
            ArrayList a2 = imageReceiver.f24811A;
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                zag zag = (zag) a2.get(i2);
                Bitmap bitmap = this.f24824A;
                if (bitmap != null) {
                    zag.c(this.C.f24804a, bitmap, false);
                } else {
                    this.C.f24810g.put(this.f24826z, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.C;
                    zag.b(imageManager.f24804a, imageManager.f24807d, false);
                }
                if (!(zag instanceof zaf)) {
                    this.C.f24808e.remove(zag);
                }
            }
        }
        this.f24825B.countDown();
        synchronized (ImageManager.f24802h) {
            ImageManager.f24803i.remove(this.f24826z);
        }
    }
}
