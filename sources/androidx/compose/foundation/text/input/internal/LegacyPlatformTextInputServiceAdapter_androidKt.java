package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.EmojiCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class LegacyPlatformTextInputServiceAdapter_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static Function1 f6239a = LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1.I;

    public static final LegacyPlatformTextInputServiceAdapter b() {
        return new AndroidLegacyPlatformTextInputServiceAdapter();
    }

    public static final Function1 c() {
        return f6239a;
    }

    public static final void d(EditorInfo editorInfo) {
        if (EmojiCompat.k()) {
            EmojiCompat.c().x(editorInfo);
        }
    }
}
