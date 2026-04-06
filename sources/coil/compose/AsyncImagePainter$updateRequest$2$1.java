package coil.compose;

import coil.size.SizeResolver;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class AsyncImagePainter$updateRequest$2$1 implements SizeResolver {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AsyncImagePainter f23293z;

    public AsyncImagePainter$updateRequest$2$1(AsyncImagePainter asyncImagePainter) {
        this.f23293z = asyncImagePainter;
    }

    public final Object c(Continuation continuation) {
        return FlowKt.D(new AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1(this.f23293z.G), continuation);
    }
}
