package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public interface FocusOwner extends FocusManager {
    static /* synthetic */ boolean q(FocusOwner focusOwner, KeyEvent keyEvent, Function0 function0, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                function0 = FocusOwner$dispatchKeyEvent$1.f15758z;
            }
            return focusOwner.e(keyEvent, function0);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
    }

    void a(FocusEventModifierNode focusEventModifierNode);

    void b(FocusTargetNode focusTargetNode);

    void c();

    Modifier d();

    boolean e(KeyEvent keyEvent, Function0 function0);

    boolean f(RotaryScrollEvent rotaryScrollEvent, Function0 function0);

    boolean h();

    boolean i(boolean z2, boolean z3, boolean z4, int i2);

    FocusState j();

    void k(boolean z2);

    FocusTransactionManager l();

    void m(FocusPropertiesModifierNode focusPropertiesModifierNode);

    Rect n();

    void o(FocusTargetNode focusTargetNode);

    boolean r(KeyEvent keyEvent);

    void s();

    FocusTargetNode t();

    MutableObjectList u();

    boolean v(FocusDirection focusDirection, Rect rect);

    Boolean x(int i2, Rect rect, Function1 function1);
}
