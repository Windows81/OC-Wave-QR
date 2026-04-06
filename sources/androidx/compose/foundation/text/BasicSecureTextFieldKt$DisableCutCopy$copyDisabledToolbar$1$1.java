package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1 implements TextToolbar {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextToolbar f5500a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextToolbar f5501b;

    public BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1(TextToolbar textToolbar) {
        this.f5501b = textToolbar;
        this.f5500a = textToolbar;
    }

    public TextToolbarStatus A() {
        return this.f5500a.A();
    }

    public void B(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05) {
        this.f5501b.B(rect, (Function0) null, function02, (Function0) null, function04, function05);
    }

    public void C(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04) {
        this.f5500a.C(rect, function0, function02, function03, function04);
    }

    public void a() {
        this.f5500a.a();
    }
}
