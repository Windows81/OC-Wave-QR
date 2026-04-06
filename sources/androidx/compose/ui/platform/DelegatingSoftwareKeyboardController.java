package androidx.compose.ui.platform;

import androidx.compose.ui.text.input.TextInputService;
import kotlin.Metadata;

@Metadata
public final class DelegatingSoftwareKeyboardController implements SoftwareKeyboardController {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputService f17731a;

    public DelegatingSoftwareKeyboardController(TextInputService textInputService) {
        this.f17731a = textInputService;
    }

    public void a() {
        this.f17731a.b();
    }

    public void b() {
        this.f17731a.c();
    }
}
