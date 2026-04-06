package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ExposedDropdownMenuKt$expandable$2 implements Function1<KeyEvent, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f9962A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f9963B;
    public final /* synthetic */ MutableState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f9964z;

    public ExposedDropdownMenuKt$expandable$2(String str, Function0 function0, boolean z2, MutableState mutableState) {
        this.f9964z = str;
        this.f9962A = function0;
        this.f9963B = z2;
        this.C = mutableState;
    }

    public final Boolean b(android.view.KeyEvent keyEvent) {
        if (ExposedDropdownMenuKt.G(keyEvent)) {
            if (!ExposedDropdownMenuAnchorType.g(this.f9964z, ExposedDropdownMenuAnchorType.f9935b.a())) {
                this.f9962A.invoke();
            } else if (ExposedDropdownMenuKt.H(keyEvent)) {
                this.f9962A.invoke();
                return Boolean.TRUE;
            }
        }
        if (ExposedDropdownMenuAnchorType.g(this.f9964z, ExposedDropdownMenuAnchorType.f9935b.a()) && this.f9963B) {
            long a2 = KeyEvent_androidKt.a(keyEvent);
            Key.Companion companion = Key.f16750b;
            if (Key.r(a2, companion.o()) || Key.r(KeyEvent_androidKt.a(keyEvent), companion.c()) || Key.r(KeyEvent_androidKt.a(keyEvent), companion.f())) {
                MutableState mutableState = this.C;
                Boolean bool = Boolean.TRUE;
                mutableState.setValue(bool);
                return bool;
            }
        }
        MutableState mutableState2 = this.C;
        Boolean bool2 = Boolean.FALSE;
        mutableState2.setValue(bool2);
        return bool2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((KeyEvent) obj).f());
    }
}
