package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextActionModeCallback {

    /* renamed from: a  reason: collision with root package name */
    public final Function0 f17964a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f17965b;

    /* renamed from: c  reason: collision with root package name */
    public Function0 f17966c;

    /* renamed from: d  reason: collision with root package name */
    public Function0 f17967d;

    /* renamed from: e  reason: collision with root package name */
    public Function0 f17968e;

    /* renamed from: f  reason: collision with root package name */
    public Function0 f17969f;

    /* renamed from: g  reason: collision with root package name */
    public Function0 f17970g;

    public TextActionModeCallback(Function0 function0, Rect rect, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06) {
        this.f17964a = function0;
        this.f17965b = rect;
        this.f17966c = function02;
        this.f17967d = function03;
        this.f17968e = function04;
        this.f17969f = function05;
        this.f17970g = function06;
    }

    public final void a(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.f(), menuItemOption.h(), menuItemOption.j()).setShowAsAction(1);
    }

    public final void b(Menu menu, MenuItemOption menuItemOption, Function0 function0) {
        if (function0 != null && menu.findItem(menuItemOption.f()) == null) {
            a(menu, menuItemOption);
        } else if (function0 == null && menu.findItem(menuItemOption.f()) != null) {
            menu.removeItem(menuItemOption.f());
        }
    }

    public final Rect c() {
        return this.f17965b;
    }

    public final boolean d(ActionMode actionMode, MenuItem menuItem) {
        Intrinsics.f(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.f()) {
            Function0 function0 = this.f17966c;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.f()) {
            Function0 function02 = this.f17967d;
            if (function02 != null) {
                function02.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.f()) {
            Function0 function03 = this.f17968e;
            if (function03 != null) {
                function03.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.f()) {
            Function0 function04 = this.f17969f;
            if (function04 != null) {
                function04.invoke();
            }
        } else if (itemId != MenuItemOption.Autofill.f()) {
            return false;
        } else {
            Function0 function05 = this.f17970g;
            if (function05 != null) {
                function05.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        } else if (actionMode != null) {
            if (this.f17966c != null) {
                a(menu, MenuItemOption.Copy);
            }
            if (this.f17967d != null) {
                a(menu, MenuItemOption.Paste);
            }
            if (this.f17968e != null) {
                a(menu, MenuItemOption.Cut);
            }
            if (this.f17969f != null) {
                a(menu, MenuItemOption.SelectAll);
            }
            if (this.f17970g == null) {
                return true;
            }
            a(menu, MenuItemOption.Autofill);
            return true;
        } else {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
    }

    public final void f() {
        Function0 function0 = this.f17964a;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean g(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        n(menu);
        return true;
    }

    public final void h(Function0 function0) {
        this.f17970g = function0;
    }

    public final void i(Function0 function0) {
        this.f17966c = function0;
    }

    public final void j(Function0 function0) {
        this.f17968e = function0;
    }

    public final void k(Function0 function0) {
        this.f17967d = function0;
    }

    public final void l(Function0 function0) {
        this.f17969f = function0;
    }

    public final void m(Rect rect) {
        this.f17965b = rect;
    }

    public final void n(Menu menu) {
        b(menu, MenuItemOption.Copy, this.f17966c);
        b(menu, MenuItemOption.Paste, this.f17967d);
        b(menu, MenuItemOption.Cut, this.f17968e);
        b(menu, MenuItemOption.SelectAll, this.f17969f);
        b(menu, MenuItemOption.Autofill, this.f17970g);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextActionModeCallback(kotlin.jvm.functions.Function0 r7, androidx.compose.ui.geometry.Rect r8, kotlin.jvm.functions.Function0 r9, kotlin.jvm.functions.Function0 r10, kotlin.jvm.functions.Function0 r11, kotlin.jvm.functions.Function0 r12, kotlin.jvm.functions.Function0 r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x0012
            androidx.compose.ui.geometry.Rect$Companion r7 = androidx.compose.ui.geometry.Rect.f15860e
            androidx.compose.ui.geometry.Rect r8 = r7.a()
        L_0x0012:
            r1 = r8
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0019
            r2 = r0
            goto L_0x001a
        L_0x0019:
            r2 = r9
        L_0x001a:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x0020
            r3 = r0
            goto L_0x0021
        L_0x0020:
            r3 = r10
        L_0x0021:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0027
            r4 = r0
            goto L_0x0028
        L_0x0027:
            r4 = r11
        L_0x0028:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002e
            r5 = r0
            goto L_0x002f
        L_0x002e:
            r5 = r12
        L_0x002f:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0035
            r14 = r0
            goto L_0x0036
        L_0x0035:
            r14 = r13
        L_0x0036:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback.<init>(kotlin.jvm.functions.Function0, androidx.compose.ui.geometry.Rect, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
