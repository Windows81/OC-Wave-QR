package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

@Metadata
final class CanFocusChecker implements FocusProperties {

    /* renamed from: a  reason: collision with root package name */
    public static final CanFocusChecker f17219a = new CanFocusChecker();

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f17220b;

    public void B(boolean z2) {
        f17220b = Boolean.valueOf(z2);
    }

    public final boolean a() {
        return f17220b != null;
    }

    public final void b() {
        f17220b = null;
    }

    public boolean t() {
        Boolean bool = f17220b;
        if (bool != null) {
            return bool.booleanValue();
        }
        InlineClassHelperKt.d("canFocus is read before it is written");
        throw new KotlinNothingValueException();
    }
}
