package androidx.compose.material;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FocusRequester f7832A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f7833z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1(boolean z2, FocusRequester focusRequester) {
        super(0);
        this.f7833z = z2;
        this.f7832A = focusRequester;
    }

    public final void invoke() {
        if (this.f7833z) {
            this.f7832A.g();
        }
    }
}
