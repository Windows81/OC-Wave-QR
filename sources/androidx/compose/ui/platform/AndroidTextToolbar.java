package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AndroidTextToolbar implements TextToolbar {

    /* renamed from: a  reason: collision with root package name */
    public final View f17634a;

    /* renamed from: b  reason: collision with root package name */
    public ActionMode f17635b;

    /* renamed from: c  reason: collision with root package name */
    public final TextActionModeCallback f17636c = new TextActionModeCallback(new AndroidTextToolbar$textActionModeCallback$1(this), (Rect) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, 126, (DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public TextToolbarStatus f17637d = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(View view) {
        this.f17634a = view;
    }

    public TextToolbarStatus A() {
        return this.f17637d;
    }

    public void B(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05) {
        this.f17636c.m(rect);
        this.f17636c.i(function0);
        this.f17636c.j(function03);
        this.f17636c.k(function02);
        this.f17636c.l(function04);
        this.f17636c.h(function05);
        ActionMode actionMode = this.f17635b;
        if (actionMode == null) {
            this.f17637d = TextToolbarStatus.Shown;
            this.f17635b = TextToolbarHelperMethods.f17881a.a(this.f17634a, new FloatingTextActionModeCallback(this.f17636c), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    public void C(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04) {
        B(rect, function0, function02, function03, function04, (Function0) null);
    }

    public void a() {
        this.f17637d = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.f17635b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f17635b = null;
    }
}
