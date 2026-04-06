package androidx.compose.ui.text.input;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
@Deprecated
public interface PlatformTextInputService {
    void a() {
    }

    void b();

    void c();

    void d();

    void e(TextFieldValue textFieldValue, TextFieldValue textFieldValue2);

    void f(TextFieldValue textFieldValue, ImeOptions imeOptions, Function1 function1, Function1 function12);

    void g(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1 function1, Rect rect, Rect rect2) {
    }

    void h(Rect rect) {
    }
}
