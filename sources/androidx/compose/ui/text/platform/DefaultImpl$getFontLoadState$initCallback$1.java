package androidx.compose.ui.text.platform;

import androidx.compose.runtime.MutableState;
import androidx.emoji2.text.EmojiCompat;
import kotlin.Metadata;

@Metadata
public final class DefaultImpl$getFontLoadState$initCallback$1 extends EmojiCompat.InitCallback {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DefaultImpl f18984A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f18985z;

    public DefaultImpl$getFontLoadState$initCallback$1(MutableState mutableState, DefaultImpl defaultImpl) {
        this.f18985z = mutableState;
        this.f18984A = defaultImpl;
    }

    public void a(Throwable th) {
        this.f18984A.f18983a = EmojiCompatStatus_androidKt.f18990a;
    }

    public void b() {
        this.f18985z.setValue(Boolean.TRUE);
        this.f18984A.f18983a = new ImmutableBool(true);
    }
}
