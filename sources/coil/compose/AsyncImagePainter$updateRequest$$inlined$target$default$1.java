package coil.compose;

import android.graphics.drawable.Drawable;
import coil.compose.AsyncImagePainter;
import coil.target.Target;
import kotlin.Metadata;

@Metadata
public final class AsyncImagePainter$updateRequest$$inlined$target$default$1 implements Target {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AsyncImagePainter f23281z;

    public AsyncImagePainter$updateRequest$$inlined$target$default$1(AsyncImagePainter asyncImagePainter) {
        this.f23281z = asyncImagePainter;
    }

    public void b(Drawable drawable) {
    }

    public void d(Drawable drawable) {
    }

    public void e(Drawable drawable) {
        this.f23281z.R(new AsyncImagePainter.State.Loading(drawable != null ? this.f23281z.O(drawable) : null));
    }
}
