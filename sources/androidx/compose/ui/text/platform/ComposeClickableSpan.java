package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import kotlin.Metadata;

@Metadata
final class ComposeClickableSpan extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final LinkAnnotation f18982a;

    public ComposeClickableSpan(LinkAnnotation linkAnnotation) {
        this.f18982a = linkAnnotation;
    }

    public void onClick(View view) {
        LinkInteractionListener a2 = this.f18982a.a();
        if (a2 != null) {
            a2.a(this.f18982a);
        }
    }
}
