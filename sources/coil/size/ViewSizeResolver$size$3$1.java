package coil.size;

import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ViewSizeResolver$size$3$1 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f23707A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ViewSizeResolver$size$3$preDrawListener$1 f23708B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ViewSizeResolver f23709z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewSizeResolver$size$3$1(ViewSizeResolver viewSizeResolver, ViewTreeObserver viewTreeObserver, ViewSizeResolver$size$3$preDrawListener$1 viewSizeResolver$size$3$preDrawListener$1) {
        super(1);
        this.f23709z = viewSizeResolver;
        this.f23707A = viewTreeObserver;
        this.f23708B = viewSizeResolver$size$3$preDrawListener$1;
    }

    public final void b(Throwable th) {
        this.f23709z.g(this.f23707A, this.f23708B);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}
