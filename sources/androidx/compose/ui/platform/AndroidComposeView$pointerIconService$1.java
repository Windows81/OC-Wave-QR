package androidx.compose.ui.platform;

import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import kotlin.Metadata;

@Metadata
public final class AndroidComposeView$pointerIconService$1 implements PointerIconService {

    /* renamed from: a  reason: collision with root package name */
    public PointerIcon f17515a = PointerIcon.f16863a.a();

    /* renamed from: b  reason: collision with root package name */
    public PointerIcon f17516b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17517c;

    public AndroidComposeView$pointerIconService$1(AndroidComposeView androidComposeView) {
        this.f17517c = androidComposeView;
    }

    public PointerIcon a() {
        return this.f17516b;
    }

    public void b(PointerIcon pointerIcon) {
        this.f17516b = pointerIcon;
    }

    public void c(PointerIcon pointerIcon) {
        if (pointerIcon == null) {
            pointerIcon = PointerIcon.f16863a.a();
        }
        this.f17515a = pointerIcon;
        AndroidComposeViewVerificationHelperMethodsN.f17588a.a(this.f17517c, pointerIcon);
    }
}
