package coil.compose;

import androidx.compose.ui.graphics.painter.Painter;
import coil.compose.AsyncImagePainter;
import coil.request.ErrorResult;
import coil.request.NullRequestDataException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class UtilsKt$transformOf$1 extends Lambda implements Function1<AsyncImagePainter.State, AsyncImagePainter.State> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Painter f23345A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Painter f23346B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Painter f23347z;

    /* renamed from: b */
    public final AsyncImagePainter.State invoke(AsyncImagePainter.State state) {
        if (state instanceof AsyncImagePainter.State.Loading) {
            Painter painter = this.f23347z;
            AsyncImagePainter.State.Loading loading = (AsyncImagePainter.State.Loading) state;
            return painter != null ? loading.b(painter) : loading;
        } else if (!(state instanceof AsyncImagePainter.State.Error)) {
            return state;
        } else {
            AsyncImagePainter.State.Error error = (AsyncImagePainter.State.Error) state;
            if (error.d().c() instanceof NullRequestDataException) {
                Painter painter2 = this.f23345A;
                return painter2 != null ? AsyncImagePainter.State.Error.c(error, painter2, (ErrorResult) null, 2, (Object) null) : error;
            }
            Painter painter3 = this.f23346B;
            return painter3 != null ? AsyncImagePainter.State.Error.c(error, painter3, (ErrorResult) null, 2, (Object) null) : error;
        }
    }
}
