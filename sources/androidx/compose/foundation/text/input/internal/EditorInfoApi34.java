package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;

@Metadata
final class EditorInfoApi34 {

    /* renamed from: a  reason: collision with root package name */
    public static final EditorInfoApi34 f6185a = new EditorInfoApi34();

    public final void a(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(CollectionsKt.p(C0026o.a(), C0029s.a(), C0027p.a(), C0028q.a(), C0030t.a(), C0031u.a(), C0032v.a()));
        editorInfo.setSupportedHandwritingGesturePreviews(SetsKt.f(C0026o.a(), C0029s.a(), C0027p.a(), C0028q.a()));
    }
}
