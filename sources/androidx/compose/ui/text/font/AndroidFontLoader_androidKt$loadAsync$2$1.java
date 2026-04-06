package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Metadata;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
public final class AndroidFontLoader_androidKt$loadAsync$2$1 extends ResourcesCompat.FontCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f18666a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ResourceFont f18667b;

    public AndroidFontLoader_androidKt$loadAsync$2$1(CancellableContinuation cancellableContinuation, ResourceFont resourceFont) {
        this.f18666a = cancellableContinuation;
        this.f18667b = resourceFont;
    }

    public void h(int i2) {
        CancellableContinuation cancellableContinuation = this.f18666a;
        cancellableContinuation.W(new IllegalStateException("Unable to load font " + this.f18667b + " (reason=" + i2 + ')'));
    }

    public void i(Typeface typeface) {
        this.f18666a.q(Result.b(typeface));
    }
}
