package coil.compose;

import coil.compose.AsyncImagePainter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class UtilsKt$onStateOf$1 extends Lambda implements Function1<AsyncImagePainter.State, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f23342A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f23343B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f23344z;

    public final void b(AsyncImagePainter.State state) {
        if (state instanceof AsyncImagePainter.State.Loading) {
            Function1 function1 = this.f23344z;
            if (function1 != null) {
                function1.invoke(state);
            }
        } else if (state instanceof AsyncImagePainter.State.Success) {
            Function1 function12 = this.f23342A;
            if (function12 != null) {
                function12.invoke(state);
            }
        } else if (state instanceof AsyncImagePainter.State.Error) {
            Function1 function13 = this.f23343B;
            if (function13 != null) {
                function13.invoke(state);
            }
        } else {
            boolean z2 = state instanceof AsyncImagePainter.State.Empty;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((AsyncImagePainter.State) obj);
        return Unit.f40552a;
    }
}
