package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata
public final class AndroidClipboard implements Clipboard {

    /* renamed from: a  reason: collision with root package name */
    public final AndroidClipboardManager f17492a;

    public AndroidClipboard(AndroidClipboardManager androidClipboardManager) {
        this.f17492a = androidClipboardManager;
    }

    public Object a(Continuation continuation) {
        return this.f17492a.a();
    }

    public Object b(ClipEntry clipEntry, Continuation continuation) {
        this.f17492a.c(clipEntry);
        return Unit.f40552a;
    }
}
