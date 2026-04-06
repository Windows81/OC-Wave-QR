package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;

final class zab implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ImageManager f24822A;

    /* renamed from: z  reason: collision with root package name */
    public final zag f24823z;

    public final void run() {
        Asserts.a("LoadImageRunnable must be executed on the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f24822A.f24808e.get(this.f24823z);
        if (imageReceiver != null) {
            ImageManager imageManager = this.f24822A;
            imageManager.f24808e.remove(this.f24823z);
            imageReceiver.c(this.f24823z);
        }
        zag zag = this.f24823z;
        zad zad = zag.f24830a;
        Uri uri = zad.f24827a;
        if (uri != null) {
            Long l2 = (Long) this.f24822A.f24810g.get(uri);
            if (l2 != null) {
                if (SystemClock.elapsedRealtime() - l2.longValue() < 3600000) {
                    zag zag2 = this.f24823z;
                    ImageManager imageManager2 = this.f24822A;
                    zag2.b(imageManager2.f24804a, imageManager2.f24807d, true);
                    return;
                }
                ImageManager imageManager3 = this.f24822A;
                imageManager3.f24810g.remove(zad.f24827a);
            }
            this.f24823z.a((Drawable) null, false, true, false);
            ImageManager imageManager4 = this.f24822A;
            ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) imageManager4.f24809f.get(zad.f24827a);
            if (imageReceiver2 == null) {
                ImageManager.ImageReceiver imageReceiver3 = new ImageManager.ImageReceiver(zad.f24827a);
                ImageManager imageManager5 = this.f24822A;
                imageManager5.f24809f.put(zad.f24827a, imageReceiver3);
                imageReceiver2 = imageReceiver3;
            }
            imageReceiver2.b(this.f24823z);
            zag zag3 = this.f24823z;
            if (!(zag3 instanceof zaf)) {
                this.f24822A.f24808e.put(zag3, imageReceiver2);
            }
            synchronized (ImageManager.f24802h) {
                try {
                    if (!ImageManager.f24803i.contains(zad.f24827a)) {
                        ImageManager.f24803i.add(zad.f24827a);
                        imageReceiver2.d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ImageManager imageManager6 = this.f24822A;
        zag.b(imageManager6.f24804a, imageManager6.f24807d, true);
    }
}
