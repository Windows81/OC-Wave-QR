package androidx.compose.ui.text.input;

import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class InputMethodManagerImpl$imm$2 extends Lambda implements Function0<InputMethodManager> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InputMethodManagerImpl f18844z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InputMethodManagerImpl$imm$2(InputMethodManagerImpl inputMethodManagerImpl) {
        super(0);
        this.f18844z = inputMethodManagerImpl;
    }

    /* renamed from: b */
    public final InputMethodManager invoke() {
        Object systemService = this.f18844z.f18841a.getContext().getSystemService("input_method");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }
}
