package androidx.compose.ui.text.input;

import androidx.compose.animation.core.h;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
@Deprecated
public class TextInputService {

    /* renamed from: a  reason: collision with root package name */
    public final PlatformTextInputService f18899a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference f18900b = new AtomicReference((Object) null);

    public TextInputService(PlatformTextInputService platformTextInputService) {
        this.f18899a = platformTextInputService;
    }

    public final TextInputSession a() {
        return (TextInputSession) this.f18900b.get();
    }

    public final void b() {
        this.f18899a.d();
    }

    public final void c() {
        if (a() != null) {
            this.f18899a.b();
        }
    }

    public TextInputSession d(TextFieldValue textFieldValue, ImeOptions imeOptions, Function1 function1, Function1 function12) {
        this.f18899a.f(textFieldValue, imeOptions, function1, function12);
        TextInputSession textInputSession = new TextInputSession(this, this.f18899a);
        this.f18900b.set(textInputSession);
        return textInputSession;
    }

    public final void e() {
        this.f18899a.a();
        this.f18900b.set(new TextInputSession(this, this.f18899a));
    }

    public final void f() {
        this.f18900b.set((Object) null);
        this.f18899a.c();
    }

    public void g(TextInputSession textInputSession) {
        if (h.a(this.f18900b, textInputSession, (Object) null)) {
            this.f18899a.c();
        }
    }
}
