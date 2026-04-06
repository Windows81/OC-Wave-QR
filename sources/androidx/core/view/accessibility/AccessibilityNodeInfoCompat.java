package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import java.util.ArrayList;
import java.util.List;

public class AccessibilityNodeInfoCompat {

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f20379a;

    /* renamed from: b  reason: collision with root package name */
    public int f20380b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f20381c = -1;

    public static class AccessibilityActionCompat {

        /* renamed from: A  reason: collision with root package name */
        public static final AccessibilityActionCompat f20382A = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);

        /* renamed from: B  reason: collision with root package name */
        public static final AccessibilityActionCompat f20383B = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (AccessibilityViewCommand) null, AccessibilityViewCommand.ScrollToPositionArguments.class);
        public static final AccessibilityActionCompat C = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
        public static final AccessibilityActionCompat D = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
        public static final AccessibilityActionCompat E = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
        public static final AccessibilityActionCompat F = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
        public static final AccessibilityActionCompat G;
        public static final AccessibilityActionCompat H;
        public static final AccessibilityActionCompat I;
        public static final AccessibilityActionCompat J;
        public static final AccessibilityActionCompat K = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
        public static final AccessibilityActionCompat L = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (CharSequence) null, (AccessibilityViewCommand) null, AccessibilityViewCommand.SetProgressArguments.class);
        public static final AccessibilityActionCompat M = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, (CharSequence) null, (AccessibilityViewCommand) null, AccessibilityViewCommand.MoveWindowArguments.class);
        public static final AccessibilityActionCompat N;
        public static final AccessibilityActionCompat O;
        public static final AccessibilityActionCompat P;
        public static final AccessibilityActionCompat Q;
        public static final AccessibilityActionCompat R;
        public static final AccessibilityActionCompat S;
        public static final AccessibilityActionCompat T;
        public static final AccessibilityActionCompat U;
        public static final AccessibilityActionCompat V;

        /* renamed from: e  reason: collision with root package name */
        public static final AccessibilityActionCompat f20384e = new AccessibilityActionCompat(1, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final AccessibilityActionCompat f20385f = new AccessibilityActionCompat(2, (CharSequence) null);

        /* renamed from: g  reason: collision with root package name */
        public static final AccessibilityActionCompat f20386g = new AccessibilityActionCompat(4, (CharSequence) null);

        /* renamed from: h  reason: collision with root package name */
        public static final AccessibilityActionCompat f20387h = new AccessibilityActionCompat(8, (CharSequence) null);

        /* renamed from: i  reason: collision with root package name */
        public static final AccessibilityActionCompat f20388i = new AccessibilityActionCompat(16, (CharSequence) null);

        /* renamed from: j  reason: collision with root package name */
        public static final AccessibilityActionCompat f20389j = new AccessibilityActionCompat(32, (CharSequence) null);

        /* renamed from: k  reason: collision with root package name */
        public static final AccessibilityActionCompat f20390k = new AccessibilityActionCompat(64, (CharSequence) null);

        /* renamed from: l  reason: collision with root package name */
        public static final AccessibilityActionCompat f20391l = new AccessibilityActionCompat(128, (CharSequence) null);

        /* renamed from: m  reason: collision with root package name */
        public static final AccessibilityActionCompat f20392m;

        /* renamed from: n  reason: collision with root package name */
        public static final AccessibilityActionCompat f20393n;

        /* renamed from: o  reason: collision with root package name */
        public static final AccessibilityActionCompat f20394o;

        /* renamed from: p  reason: collision with root package name */
        public static final AccessibilityActionCompat f20395p;

        /* renamed from: q  reason: collision with root package name */
        public static final AccessibilityActionCompat f20396q = new AccessibilityActionCompat(4096, (CharSequence) null);

        /* renamed from: r  reason: collision with root package name */
        public static final AccessibilityActionCompat f20397r = new AccessibilityActionCompat(8192, (CharSequence) null);

        /* renamed from: s  reason: collision with root package name */
        public static final AccessibilityActionCompat f20398s = new AccessibilityActionCompat(16384, (CharSequence) null);

        /* renamed from: t  reason: collision with root package name */
        public static final AccessibilityActionCompat f20399t = new AccessibilityActionCompat(32768, (CharSequence) null);

        /* renamed from: u  reason: collision with root package name */
        public static final AccessibilityActionCompat f20400u = new AccessibilityActionCompat(65536, (CharSequence) null);

        /* renamed from: v  reason: collision with root package name */
        public static final AccessibilityActionCompat f20401v = new AccessibilityActionCompat(131072, (CharSequence) null, AccessibilityViewCommand.SetSelectionArguments.class);

        /* renamed from: w  reason: collision with root package name */
        public static final AccessibilityActionCompat f20402w = new AccessibilityActionCompat(262144, (CharSequence) null);

        /* renamed from: x  reason: collision with root package name */
        public static final AccessibilityActionCompat f20403x = new AccessibilityActionCompat(524288, (CharSequence) null);

        /* renamed from: y  reason: collision with root package name */
        public static final AccessibilityActionCompat f20404y = new AccessibilityActionCompat(1048576, (CharSequence) null);

        /* renamed from: z  reason: collision with root package name */
        public static final AccessibilityActionCompat f20405z = new AccessibilityActionCompat(2097152, (CharSequence) null, AccessibilityViewCommand.SetTextArguments.class);

        /* renamed from: a  reason: collision with root package name */
        public final Object f20406a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20407b;

        /* renamed from: c  reason: collision with root package name */
        public final Class f20408c;

        /* renamed from: d  reason: collision with root package name */
        public final AccessibilityViewCommand f20409d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            Class<AccessibilityViewCommand.MoveAtGranularityArguments> cls = AccessibilityViewCommand.MoveAtGranularityArguments.class;
            f20392m = new AccessibilityActionCompat(256, (CharSequence) null, cls);
            f20393n = new AccessibilityActionCompat(512, (CharSequence) null, cls);
            Class<AccessibilityViewCommand.MoveHtmlArguments> cls2 = AccessibilityViewCommand.MoveHtmlArguments.class;
            f20394o = new AccessibilityActionCompat(1024, (CharSequence) null, cls2);
            f20395p = new AccessibilityActionCompat(2048, (CharSequence) null, cls2);
            int i2 = Build.VERSION.SDK_INT;
            G = new AccessibilityActionCompat(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            H = new AccessibilityActionCompat(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            I = new AccessibilityActionCompat(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            J = new AccessibilityActionCompat(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            N = new AccessibilityActionCompat(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            O = new AccessibilityActionCompat(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            P = new AccessibilityActionCompat(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            Q = new AccessibilityActionCompat(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            R = new AccessibilityActionCompat(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            S = new AccessibilityActionCompat(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            T = new AccessibilityActionCompat(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            U = new AccessibilityActionCompat(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            if (i2 >= 34) {
                accessibilityAction = Api34Impl.a();
            }
            V = new AccessibilityActionCompat(accessibilityAction, 16908382, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
        }

        public AccessibilityActionCompat(int i2, CharSequence charSequence) {
            this((Object) null, i2, charSequence, (AccessibilityViewCommand) null, (Class) null);
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f20406a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f20406a).getLabel();
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0020  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                androidx.core.view.accessibility.AccessibilityViewCommand r0 = r4.f20409d
                if (r0 == 0) goto L_0x0044
                java.lang.Class r0 = r4.f20408c
                r1 = 0
                if (r0 == 0) goto L_0x003d
                java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch:{ Exception -> 0x001b }
                java.lang.Object r0 = r0.newInstance(r1)     // Catch:{ Exception -> 0x001b }
                androidx.core.view.accessibility.AccessibilityViewCommand$CommandArguments r0 = (androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments) r0     // Catch:{ Exception -> 0x001b }
                r0.a(r6)     // Catch:{ Exception -> 0x0018 }
                r1 = r0
                goto L_0x003d
            L_0x0018:
                r6 = move-exception
                r1 = r0
                goto L_0x001c
            L_0x001b:
                r6 = move-exception
            L_0x001c:
                java.lang.Class r0 = r4.f20408c
                if (r0 != 0) goto L_0x0023
                java.lang.String r0 = "null"
                goto L_0x0027
            L_0x0023:
                java.lang.String r0 = r0.getName()
            L_0x0027:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r0, r6)
            L_0x003d:
                androidx.core.view.accessibility.AccessibilityViewCommand r6 = r4.f20409d
                boolean r5 = r6.a(r5, r1)
                return r5
            L_0x0044:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.c(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof AccessibilityActionCompat)) {
                return false;
            }
            AccessibilityActionCompat accessibilityActionCompat = (AccessibilityActionCompat) obj;
            Object obj2 = this.f20406a;
            return obj2 == null ? accessibilityActionCompat.f20406a == null : obj2.equals(accessibilityActionCompat.f20406a);
        }

        public int hashCode() {
            Object obj = this.f20406a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String h2 = AccessibilityNodeInfoCompat.h(this.f20407b);
            if (h2.equals("ACTION_UNKNOWN") && b() != null) {
                h2 = b().toString();
            }
            sb.append(h2);
            return sb.toString();
        }

        public AccessibilityActionCompat(Object obj) {
            this(obj, 0, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
        }

        public AccessibilityActionCompat(int i2, CharSequence charSequence, Class cls) {
            this((Object) null, i2, charSequence, (AccessibilityViewCommand) null, cls);
        }

        public AccessibilityActionCompat(Object obj, int i2, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand, Class cls) {
            this.f20407b = i2;
            this.f20409d = accessibilityViewCommand;
            if (obj == null) {
                this.f20406a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.f20406a = obj;
            }
            this.f20408c = cls;
        }
    }

    public static class Api30Impl {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    public static class Api33Impl {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    public static class Api34Impl {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    public static class Api35Impl {
    }

    public static class CollectionInfoCompat {

        /* renamed from: a  reason: collision with root package name */
        public final Object f20410a;

        public static final class Builder {
        }

        public CollectionInfoCompat(Object obj) {
            this.f20410a = obj;
        }

        public static CollectionInfoCompat a(int i2, int i3, boolean z2, int i4) {
            return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z2, i4));
        }
    }

    public static class CollectionItemInfoCompat {

        /* renamed from: a  reason: collision with root package name */
        public final Object f20411a;

        public static final class Builder {
        }

        public CollectionItemInfoCompat(Object obj) {
            this.f20411a = obj;
        }

        public static CollectionItemInfoCompat a(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z2, z3));
        }
    }

    public static class RangeInfoCompat {

        /* renamed from: a  reason: collision with root package name */
        public final Object f20412a;

        public RangeInfoCompat(Object obj) {
            this.f20412a = obj;
        }

        public static RangeInfoCompat a(int i2, float f2, float f3, float f4) {
            return new RangeInfoCompat(AccessibilityNodeInfo.RangeInfo.obtain(i2, f2, f3, f4));
        }
    }

    public static final class TouchDelegateInfoCompat {
    }

    public AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f20379a = accessibilityNodeInfo;
    }

    public static AccessibilityNodeInfoCompat U() {
        return V0(AccessibilityNodeInfo.obtain());
    }

    public static AccessibilityNodeInfoCompat V(View view) {
        return V0(AccessibilityNodeInfo.obtain(view));
    }

    public static AccessibilityNodeInfoCompat V0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
    }

    public static AccessibilityNodeInfoCompat W(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return V0(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.f20379a));
    }

    public static String h(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908382:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i2) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i2) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public String A() {
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.a(this.f20379a) : this.f20379a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void A0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f20379a.setPaneTitle(charSequence);
        } else {
            this.f20379a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public String B() {
        return this.f20379a.getViewIdResourceName();
    }

    public void B0(View view) {
        this.f20380b = -1;
        this.f20379a.setParent(view);
    }

    public final boolean C() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void C0(View view, int i2) {
        this.f20380b = i2;
        this.f20379a.setParent(view, i2);
    }

    public boolean D() {
        return Build.VERSION.SDK_INT >= 34 ? Api34Impl.d(this.f20379a) : j(64);
    }

    public void D0(boolean z2) {
        this.f20379a.setPassword(z2);
    }

    public boolean E() {
        return this.f20379a.isAccessibilityFocused();
    }

    public void E0(RangeInfoCompat rangeInfoCompat) {
        this.f20379a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) rangeInfoCompat.f20412a);
    }

    public boolean F() {
        return this.f20379a.isCheckable();
    }

    public void F0(CharSequence charSequence) {
        this.f20379a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean G() {
        return this.f20379a.isChecked();
    }

    public void G0(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f20379a.setScreenReaderFocusable(z2);
        } else {
            c0(1, z2);
        }
    }

    public boolean H() {
        return this.f20379a.isClickable();
    }

    public void H0(boolean z2) {
        this.f20379a.setScrollable(z2);
    }

    public boolean I() {
        return this.f20379a.isContextClickable();
    }

    public void I0(boolean z2) {
        this.f20379a.setSelected(z2);
    }

    public boolean J() {
        return this.f20379a.isEnabled();
    }

    public void J0(View view) {
        this.f20381c = -1;
        this.f20379a.setSource(view);
    }

    public boolean K() {
        return this.f20379a.isFocusable();
    }

    public void K0(View view, int i2) {
        this.f20381c = i2;
        this.f20379a.setSource(view, i2);
    }

    public boolean L() {
        return this.f20379a.isFocused();
    }

    public void L0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.b(this.f20379a, charSequence);
        } else {
            this.f20379a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean M() {
        return j(67108864);
    }

    public void M0(CharSequence charSequence) {
        this.f20379a.setText(charSequence);
    }

    public boolean N() {
        return this.f20379a.isImportantForAccessibility();
    }

    public void N0(int i2, int i3) {
        this.f20379a.setTextSelection(i2, i3);
    }

    public boolean O() {
        return this.f20379a.isLongClickable();
    }

    public void O0(View view) {
        this.f20379a.setTraversalAfter(view);
    }

    public boolean P() {
        return this.f20379a.isPassword();
    }

    public void P0(View view, int i2) {
        this.f20379a.setTraversalAfter(view, i2);
    }

    public boolean Q() {
        return this.f20379a.isScrollable();
    }

    public void Q0(View view) {
        this.f20379a.setTraversalBefore(view);
    }

    public boolean R() {
        return this.f20379a.isSelected();
    }

    public void R0(View view, int i2) {
        this.f20379a.setTraversalBefore(view, i2);
    }

    public boolean S() {
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.b(this.f20379a) : j(8388608);
    }

    public void S0(String str) {
        this.f20379a.setViewIdResourceName(str);
    }

    public boolean T() {
        return this.f20379a.isVisibleToUser();
    }

    public void T0(boolean z2) {
        this.f20379a.setVisibleToUser(z2);
    }

    public AccessibilityNodeInfo U0() {
        return this.f20379a;
    }

    public boolean X(int i2, Bundle bundle) {
        return this.f20379a.performAction(i2, bundle);
    }

    public void Y() {
    }

    public boolean Z(AccessibilityActionCompat accessibilityActionCompat) {
        return this.f20379a.removeAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f20406a);
    }

    public void a(int i2) {
        this.f20379a.addAction(i2);
    }

    public void a0(boolean z2) {
        this.f20379a.setAccessibilityFocused(z2);
    }

    public void b(AccessibilityActionCompat accessibilityActionCompat) {
        this.f20379a.addAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f20406a);
    }

    public void b0(List list) {
        this.f20379a.setAvailableExtraData(list);
    }

    public void c(View view) {
        this.f20379a.addChild(view);
    }

    public final void c0(int i2, boolean z2) {
        Bundle t2 = t();
        if (t2 != null) {
            int i3 = t2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i2);
            if (!z2) {
                i2 = 0;
            }
            t2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }

    public void d(View view, int i2) {
        this.f20379a.addChild(view, i2);
    }

    public void d0(Rect rect) {
        this.f20379a.setBoundsInParent(rect);
    }

    public void e(CharSequence charSequence, View view) {
    }

    public void e0(Rect rect) {
        this.f20379a.setBoundsInScreen(rect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f20379a;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfoCompat.f20379a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfoCompat.f20379a)) {
            return false;
        }
        return this.f20381c == accessibilityNodeInfoCompat.f20381c && this.f20380b == accessibilityNodeInfoCompat.f20380b;
    }

    public final List f(String str) {
        ArrayList<Integer> integerArrayList = this.f20379a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f20379a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void f0(boolean z2) {
        this.f20379a.setCanOpenPopup(z2);
    }

    public List g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f20379a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new AccessibilityActionCompat(actionList.get(i2)));
        }
        return arrayList;
    }

    public void g0(boolean z2) {
        this.f20379a.setCheckable(z2);
    }

    public void h0(boolean z2) {
        this.f20379a.setChecked(z2);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f20379a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public int i() {
        return this.f20379a.getActions();
    }

    public void i0(CharSequence charSequence) {
        this.f20379a.setClassName(charSequence);
    }

    public final boolean j(int i2) {
        Bundle t2 = t();
        return t2 != null && (t2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i2) == i2;
    }

    public void j0(boolean z2) {
        this.f20379a.setClickable(z2);
    }

    public void k(Rect rect) {
        this.f20379a.getBoundsInParent(rect);
    }

    public void k0(Object obj) {
        this.f20379a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((CollectionInfoCompat) obj).f20410a);
    }

    public void l(Rect rect) {
        this.f20379a.getBoundsInScreen(rect);
    }

    public void l0(Object obj) {
        this.f20379a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((CollectionItemInfoCompat) obj).f20411a);
    }

    public void m(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.b(this.f20379a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f20379a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void m0(CharSequence charSequence) {
        this.f20379a.setContentDescription(charSequence);
    }

    public int n() {
        return this.f20379a.getChildCount();
    }

    public void n0(boolean z2) {
        this.f20379a.setContentInvalid(z2);
    }

    public CharSequence o() {
        return this.f20379a.getClassName();
    }

    public void o0(boolean z2) {
        this.f20379a.setEditable(z2);
    }

    public void p0(boolean z2) {
        this.f20379a.setEnabled(z2);
    }

    public CharSequence q() {
        return Build.VERSION.SDK_INT >= 34 ? Api34Impl.c(this.f20379a) : this.f20379a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void q0(CharSequence charSequence) {
        this.f20379a.setError(charSequence);
    }

    public CharSequence r() {
        return this.f20379a.getContentDescription();
    }

    public void r0(boolean z2) {
        this.f20379a.setFocusable(z2);
    }

    public CharSequence s() {
        return this.f20379a.getError();
    }

    public void s0(boolean z2) {
        this.f20379a.setFocused(z2);
    }

    public Bundle t() {
        return this.f20379a.getExtras();
    }

    public void t0(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f20379a.setHeading(z2);
        } else {
            c0(2, z2);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        k(rect);
        sb.append("; boundsInParent: " + rect);
        l(rect);
        sb.append("; boundsInScreen: " + rect);
        m(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(w());
        sb.append("; className: ");
        sb.append(o());
        sb.append("; text: ");
        sb.append(y());
        sb.append("; error: ");
        sb.append(s());
        sb.append("; maxTextLength: ");
        sb.append(u());
        sb.append("; stateDescription: ");
        sb.append(x());
        sb.append("; contentDescription: ");
        sb.append(r());
        sb.append("; tooltipText: ");
        sb.append(z());
        sb.append("; viewIdResName: ");
        sb.append(B());
        sb.append("; uniqueId: ");
        sb.append(A());
        sb.append("; checkable: ");
        sb.append(F());
        sb.append("; checked: ");
        sb.append(G());
        sb.append("; focusable: ");
        sb.append(K());
        sb.append("; focused: ");
        sb.append(L());
        sb.append("; selected: ");
        sb.append(R());
        sb.append("; clickable: ");
        sb.append(H());
        sb.append("; longClickable: ");
        sb.append(O());
        sb.append("; contextClickable: ");
        sb.append(I());
        sb.append("; enabled: ");
        sb.append(J());
        sb.append("; password: ");
        sb.append(P());
        sb.append("; scrollable: " + Q());
        sb.append("; containerTitle: ");
        sb.append(q());
        sb.append("; granularScrollingSupported: ");
        sb.append(M());
        sb.append("; importantForAccessibility: ");
        sb.append(N());
        sb.append("; visible: ");
        sb.append(T());
        sb.append("; isTextSelectable: ");
        sb.append(S());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(D());
        sb.append("; [");
        List g2 = g();
        for (int i2 = 0; i2 < g2.size(); i2++) {
            AccessibilityActionCompat accessibilityActionCompat = (AccessibilityActionCompat) g2.get(i2);
            String h2 = h(accessibilityActionCompat.a());
            if (h2.equals("ACTION_UNKNOWN") && accessibilityActionCompat.b() != null) {
                h2 = accessibilityActionCompat.b().toString();
            }
            sb.append(h2);
            if (i2 != g2.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int u() {
        return this.f20379a.getMaxTextLength();
    }

    public void u0(boolean z2) {
        this.f20379a.setImportantForAccessibility(z2);
    }

    public int v() {
        return this.f20379a.getMovementGranularities();
    }

    public void v0(int i2) {
        this.f20379a.setLiveRegion(i2);
    }

    public CharSequence w() {
        return this.f20379a.getPackageName();
    }

    public void w0(boolean z2) {
        this.f20379a.setLongClickable(z2);
    }

    public CharSequence x() {
        return Build.VERSION.SDK_INT >= 30 ? Api30Impl.a(this.f20379a) : this.f20379a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void x0(int i2) {
        this.f20379a.setMaxTextLength(i2);
    }

    public CharSequence y() {
        if (!C()) {
            return this.f20379a.getText();
        }
        List f2 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List f3 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List f4 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List f5 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f20379a.getText(), 0, this.f20379a.getText().length()));
        for (int i2 = 0; i2 < f2.size(); i2++) {
            spannableString.setSpan(new AccessibilityClickableSpanCompat(((Integer) f5.get(i2)).intValue(), this, t().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) f2.get(i2)).intValue(), ((Integer) f3.get(i2)).intValue(), ((Integer) f4.get(i2)).intValue());
        }
        return spannableString;
    }

    public void y0(int i2) {
        this.f20379a.setMovementGranularities(i2);
    }

    public CharSequence z() {
        return Build.VERSION.SDK_INT >= 28 ? this.f20379a.getTooltipText() : this.f20379a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void z0(CharSequence charSequence) {
        this.f20379a.setPackageName(charSequence);
    }
}
