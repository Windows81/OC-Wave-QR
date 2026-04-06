package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidPlatformTextInputSession$startInputMethod$3$1$1 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AndroidPlatformTextInputSession f17632A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InputMethodSession f17633z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3$1$1(InputMethodSession inputMethodSession, AndroidPlatformTextInputSession androidPlatformTextInputSession) {
        super(1);
        this.f17633z = inputMethodSession;
        this.f17632A = androidPlatformTextInputSession;
    }

    public final void b(Throwable th) {
        this.f17633z.d();
        this.f17632A.f17626A.f();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}
