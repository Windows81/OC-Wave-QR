package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidImageBitmap implements ImageBitmap {

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap f15898b;

    public AndroidImageBitmap(Bitmap bitmap) {
        this.f15898b = bitmap;
    }

    public int a() {
        return this.f15898b.getHeight();
    }

    public int b() {
        return this.f15898b.getWidth();
    }

    public void c() {
        this.f15898b.prepareToDraw();
    }

    public int d() {
        Bitmap.Config config = this.f15898b.getConfig();
        Intrinsics.f(config);
        return AndroidImageBitmap_androidKt.e(config);
    }

    public final Bitmap e() {
        return this.f15898b;
    }
}
