package androidx.compose.ui.platform;

import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeView$configurationChangeObserver$1 extends Lambda implements Function1<Configuration, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final AndroidComposeView$configurationChangeObserver$1 f17504z = new AndroidComposeView$configurationChangeObserver$1();

    public AndroidComposeView$configurationChangeObserver$1() {
        super(1);
    }

    public final void b(Configuration configuration) {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Configuration) obj);
        return Unit.f40552a;
    }
}
