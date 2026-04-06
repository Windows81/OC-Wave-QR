package androidx.compose.material;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f7822A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ View f7823z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$1$1(View view, Function0 function0) {
        super(1);
        this.f7823z = view;
        this.f7822A = function0;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        return new ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$1$1$invoke$$inlined$onDispose$1(new OnGlobalLayoutListener(this.f7823z, this.f7822A));
    }
}
