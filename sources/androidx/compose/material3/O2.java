package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class O2 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f10519A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ View f10520z;

    public /* synthetic */ O2(View view, Function0 function0) {
        this.f10520z = view;
        this.f10519A = function0;
    }

    public final Object invoke(Object obj) {
        return ExposedDropdownMenu_androidKt.g(this.f10520z, this.f10519A, (DisposableEffectScope) obj);
    }
}
