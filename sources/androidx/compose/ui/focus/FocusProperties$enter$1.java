package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class FocusProperties$enter$1 extends Lambda implements Function1<FocusDirection, FocusRequester> {

    /* renamed from: z  reason: collision with root package name */
    public static final FocusProperties$enter$1 f15782z = new FocusProperties$enter$1();

    public FocusProperties$enter$1() {
        super(1);
    }

    public final FocusRequester b(int i2) {
        return FocusRequester.f15802b.b();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((FocusDirection) obj).o());
    }
}
