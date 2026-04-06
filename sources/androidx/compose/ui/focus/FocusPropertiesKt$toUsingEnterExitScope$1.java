package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class FocusPropertiesKt$toUsingEnterExitScope$1 extends Lambda implements Function1<FocusEnterExitScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f15801z;

    public final void b(FocusEnterExitScope focusEnterExitScope) {
        FocusRequester focusRequester = (FocusRequester) this.f15801z.invoke(FocusDirection.i(focusEnterExitScope.a()));
        FocusRequester.Companion companion = FocusRequester.f15802b;
        if (focusRequester == companion.a()) {
            focusEnterExitScope.b();
        } else if (focusRequester != companion.b()) {
            FocusRequester.i(focusRequester, 0, 1, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((FocusEnterExitScope) obj);
        return Unit.f40552a;
    }
}
