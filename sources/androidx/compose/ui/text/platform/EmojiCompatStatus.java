package androidx.compose.ui.text.platform;

import androidx.compose.runtime.State;
import kotlin.Metadata;

@Metadata
public final class EmojiCompatStatus implements EmojiCompatStatusDelegate {

    /* renamed from: a  reason: collision with root package name */
    public static final EmojiCompatStatus f18987a = new EmojiCompatStatus();

    /* renamed from: b  reason: collision with root package name */
    public static EmojiCompatStatusDelegate f18988b = new DefaultImpl();

    /* renamed from: c  reason: collision with root package name */
    public static final int f18989c = 8;

    public State a() {
        return f18988b.a();
    }
}
