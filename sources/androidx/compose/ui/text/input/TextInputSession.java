package androidx.compose.ui.text.input;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@Deprecated
public final class TextInputSession {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputService f18925a;

    /* renamed from: b  reason: collision with root package name */
    public final PlatformTextInputService f18926b;

    public TextInputSession(TextInputService textInputService, PlatformTextInputService platformTextInputService) {
        this.f18925a = textInputService;
        this.f18926b = platformTextInputService;
    }

    public final void a() {
        this.f18925a.g(this);
    }

    public final boolean b() {
        return Intrinsics.d(this.f18925a.a(), this);
    }

    public final boolean c(Rect rect) {
        boolean b2 = b();
        if (b2) {
            this.f18926b.h(rect);
        }
        return b2;
    }

    public final boolean d(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean b2 = b();
        if (b2) {
            this.f18926b.e(textFieldValue, textFieldValue2);
        }
        return b2;
    }

    public final boolean e(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1 function1, Rect rect, Rect rect2) {
        boolean b2 = b();
        if (b2) {
            this.f18926b.g(textFieldValue, offsetMapping, textLayoutResult, function1, rect, rect2);
        }
        return b2;
    }
}
