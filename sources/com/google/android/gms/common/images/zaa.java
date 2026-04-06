package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

final class zaa implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final ParcelFileDescriptor f24819A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ImageManager f24820B;

    /* renamed from: z  reason: collision with root package name */
    public final Uri f24821z;

    public zaa(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f24820B = imageManager;
        this.f24821z = uri;
        this.f24819A = parcelFileDescriptor;
    }

    public final void run() {
        Asserts.b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.f24819A;
        Bitmap bitmap = null;
        boolean z2 = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError e2) {
                Log.e("ImageManager", "OOM while loading bitmap for uri: ".concat(String.valueOf(this.f24821z)), e2);
                z2 = true;
            }
            try {
                this.f24819A.close();
            } catch (IOException e3) {
                Log.e("ImageManager", "closed failed", e3);
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.f24820B;
        imageManager.f24805b.post(new zac(imageManager, this.f24821z, bitmap, z2, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Log.w("ImageManager", "Latch interrupted while posting ".concat(String.valueOf(this.f24821z)));
        }
    }
}
