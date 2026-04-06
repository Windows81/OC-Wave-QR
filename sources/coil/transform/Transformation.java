package coil.transform;

import android.graphics.Bitmap;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface Transformation {
    String a();

    Object b(Bitmap bitmap, Size size, Continuation continuation);
}
