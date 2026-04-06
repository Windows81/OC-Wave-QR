package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1 extends Lambda implements Function1<Configuration, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f17609z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(MutableState mutableState) {
        super(1);
        this.f17609z = mutableState;
    }

    public final void b(Configuration configuration) {
        AndroidCompositionLocals_androidKt.c(this.f17609z, new Configuration(configuration));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Configuration) obj);
        return Unit.f40552a;
    }
}
