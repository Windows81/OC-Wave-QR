package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public abstract class AndroidFont implements Font {

    /* renamed from: b  reason: collision with root package name */
    public final int f18661b;

    /* renamed from: c  reason: collision with root package name */
    public final TypefaceLoader f18662c;

    /* renamed from: d  reason: collision with root package name */
    public final FontVariation.Settings f18663d;

    @Metadata
    public interface TypefaceLoader {
        Typeface a(Context context, AndroidFont androidFont);

        Object b(Context context, AndroidFont androidFont, Continuation continuation);
    }

    public final int b() {
        return this.f18661b;
    }

    public final TypefaceLoader d() {
        return this.f18662c;
    }

    public final FontVariation.Settings e() {
        return this.f18663d;
    }
}
