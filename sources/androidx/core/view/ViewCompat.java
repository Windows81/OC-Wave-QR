package androidx.core.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.R;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

public class ViewCompat {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap f20260a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Field f20261b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f20262c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f20263d = {R.id.f19387b, R.id.f19388c, R.id.f19399n, R.id.f19410y, R.id.f19385B, R.id.C, R.id.D, R.id.E, R.id.F, R.id.G, R.id.f19389d, R.id.f19390e, R.id.f19391f, R.id.f19392g, R.id.f19393h, R.id.f19394i, R.id.f19395j, R.id.f19396k, R.id.f19397l, R.id.f19398m, R.id.f19400o, R.id.f19401p, R.id.f19402q, R.id.f19403r, R.id.f19404s, R.id.f19405t, R.id.f19406u, R.id.f19407v, R.id.f19408w, R.id.f19409x, R.id.f19411z, R.id.f19384A};

    /* renamed from: e  reason: collision with root package name */
    public static final OnReceiveContentViewBehavior f20264e = new C0370t();

    /* renamed from: f  reason: collision with root package name */
    public static final AccessibilityPaneVisibilityManager f20265f = new AccessibilityPaneVisibilityManager();

    public static class AccessibilityPaneVisibilityManager implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: z  reason: collision with root package name */
        public final WeakHashMap f20266z = new WeakHashMap();

        public void a(View view) {
            this.f20266z.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        public final void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
            if (booleanValue != z2) {
                ViewCompat.G(view, z2 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z2));
            }
        }

        public final void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void d(View view) {
            this.f20266z.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public final void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry b2 : this.f20266z.entrySet()) {
                    b(b2);
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class AccessibilityViewProperty<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f20267a;

        /* renamed from: b  reason: collision with root package name */
        public final Class f20268b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20269c;

        /* renamed from: d  reason: collision with root package name */
        public final int f20270d;

        public AccessibilityViewProperty(int i2, Class cls, int i3) {
            this(i2, cls, 0, i3);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= this.f20269c;
        }

        public abstract Object c(View view);

        public abstract void d(View view, Object obj);

        public Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f20267a);
            if (this.f20268b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                ViewCompat.h(view);
                view.setTag(this.f20267a, obj);
                ViewCompat.G(view, this.f20270d);
            }
        }

        public boolean g(Object obj, Object obj2) {
            return !obj2.equals(obj);
        }

        public AccessibilityViewProperty(int i2, Class cls, int i3, int i4) {
            this.f20267a = i2;
            this.f20268b = cls;
            this.f20270d = i3;
            this.f20269c = i4;
        }
    }

    public static class Api20Impl {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class Api21Impl {
        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets w2 = windowInsetsCompat.w();
            if (w2 != null) {
                return WindowInsetsCompat.y(view.computeSystemWindowInsets(w2, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        public static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        public static float e(View view) {
            return view.getElevation();
        }

        public static String f(View view) {
            return view.getTransitionName();
        }

        public static void g(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void h(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void i(View view, float f2) {
            view.setElevation(f2);
        }

        public static void j(final View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.L, onApplyWindowInsetsListener);
            }
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.S));
            } else {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public WindowInsetsCompat f20271a = null;

                    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        WindowInsetsCompat y2 = WindowInsetsCompat.y(windowInsets, view);
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 < 30) {
                            Api21Impl.a(windowInsets, view);
                            if (y2.equals(this.f20271a)) {
                                return onApplyWindowInsetsListener.a(view, y2).w();
                            }
                        }
                        this.f20271a = y2;
                        WindowInsetsCompat a2 = onApplyWindowInsetsListener.a(view, y2);
                        if (i2 >= 30) {
                            return a2.w();
                        }
                        ViewCompat.R(view);
                        return a2.w();
                    }
                });
            }
        }

        public static void k(View view, String str) {
            view.setTransitionName(str);
        }

        public static void l(View view) {
            view.stopNestedScroll();
        }
    }

    public static class Api23Impl {
        public static WindowInsetsCompat a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat x2 = WindowInsetsCompat.x(rootWindowInsets);
            x2.u(x2);
            x2.d(view.getRootView());
            return x2;
        }

        public static void b(View view, int i2, int i3) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static class Api24Impl {
    }

    public static class Api26Impl {
    }

    public static class Api28Impl {
        public static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void d(View view, boolean z2) {
            view.setAccessibilityHeading(z2);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void f(View view, boolean z2) {
            view.setScreenReaderFocusable(z2);
        }
    }

    public static class Api29Impl {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static class Api30Impl {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class Api31Impl {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static ContentInfoCompat b(View view, ContentInfoCompat contentInfoCompat) {
            ContentInfo f2 = contentInfoCompat.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f2);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f2 ? contentInfoCompat : ContentInfoCompat.g(performReceiveContent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRealDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRelativeDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NestedScrollType {
    }

    public static final class OnReceiveContentListenerAdapter implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        public final OnReceiveContentListener f20274a;

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            ContentInfoCompat g2 = ContentInfoCompat.g(contentInfo);
            ContentInfoCompat a2 = this.f20274a.a(view, g2);
            if (a2 == null) {
                return null;
            }
            return a2 == g2 ? contentInfo : a2.f();
        }
    }

    public interface OnUnhandledKeyEventListenerCompat {
        boolean a(View view, KeyEvent keyEvent);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollAxis {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollIndicators {
    }

    public static class UnhandledKeyEventManager {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList f20275d = new ArrayList();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap f20276a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray f20277b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference f20278c = null;

        public static UnhandledKeyEventManager a(View view) {
            UnhandledKeyEventManager unhandledKeyEventManager = (UnhandledKeyEventManager) view.getTag(R.id.Q);
            if (unhandledKeyEventManager != null) {
                return unhandledKeyEventManager;
            }
            UnhandledKeyEventManager unhandledKeyEventManager2 = new UnhandledKeyEventManager();
            view.setTag(R.id.Q, unhandledKeyEventManager2);
            return unhandledKeyEventManager2;
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c2 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c2));
                }
            }
            return c2 != null;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f20276a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c2 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c2 != null) {
                            return c2;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray d() {
            if (this.f20277b == null) {
                this.f20277b = new SparseArray();
            }
            return this.f20277b;
        }

        public final boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.R);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((OnUnhandledKeyEventListenerCompat) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.ref.WeakReference} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean f(android.view.KeyEvent r6) {
            /*
                r5 = this;
                java.lang.ref.WeakReference r0 = r5.f20278c
                r1 = 0
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.get()
                if (r0 != r6) goto L_0x000c
                return r1
            L_0x000c:
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r6)
                r5.f20278c = r0
                android.util.SparseArray r0 = r5.d()
                int r2 = r6.getAction()
                r3 = 1
                if (r2 != r3) goto L_0x0032
                int r2 = r6.getKeyCode()
                int r2 = r0.indexOfKey(r2)
                if (r2 < 0) goto L_0x0032
                java.lang.Object r4 = r0.valueAt(r2)
                java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
                r0.removeAt(r2)
                goto L_0x0033
            L_0x0032:
                r4 = 0
            L_0x0033:
                if (r4 != 0) goto L_0x0040
                int r2 = r6.getKeyCode()
                java.lang.Object r0 = r0.get(r2)
                r4 = r0
                java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            L_0x0040:
                if (r4 == 0) goto L_0x0054
                java.lang.Object r0 = r4.get()
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L_0x0053
                boolean r1 = r0.isAttachedToWindow()
                if (r1 == 0) goto L_0x0053
                r5.e(r0, r6)
            L_0x0053:
                return r3
            L_0x0054:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewCompat.UnhandledKeyEventManager.f(android.view.KeyEvent):boolean");
        }

        public final void g() {
            WeakHashMap weakHashMap = this.f20276a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f20275d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    try {
                        if (this.f20276a == null) {
                            this.f20276a = new WeakHashMap();
                        }
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = f20275d;
                            View view = (View) ((WeakReference) arrayList2.get(size)).get();
                            if (view == null) {
                                arrayList2.remove(size);
                            } else {
                                this.f20276a.put(view, Boolean.TRUE);
                                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    this.f20276a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public static boolean A(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean B(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean C(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean D(View view) {
        return view.isLaidOut();
    }

    public static boolean E(View view) {
        Boolean bool = (Boolean) T().e(view);
        return bool != null && bool.booleanValue();
    }

    public static /* synthetic */ ContentInfoCompat F(ContentInfoCompat contentInfoCompat) {
        return contentInfoCompat;
    }

    public static void G(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = l(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i3 = 32;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z2) {
                    i3 = 2048;
                }
                obtain.setEventType(i3);
                obtain.setContentChangeTypes(i2);
                if (z2) {
                    obtain.getText().add(l(view));
                    c0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(l(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void H(View view, int i2) {
        view.offsetLeftAndRight(i2);
    }

    public static void I(View view, int i2) {
        view.offsetTopAndBottom(i2);
    }

    public static WindowInsetsCompat J(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets w2 = windowInsetsCompat.w();
        if (w2 != null) {
            WindowInsets b2 = Api20Impl.b(view, w2);
            if (!b2.equals(w2)) {
                return WindowInsetsCompat.y(b2, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void K(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.U0());
    }

    public static AccessibilityViewProperty L() {
        return new AccessibilityViewProperty<CharSequence>(R.id.K, CharSequence.class, 8, 28) {
            /* renamed from: h */
            public CharSequence c(View view) {
                return Api28Impl.a(view);
            }

            /* renamed from: i */
            public void d(View view, CharSequence charSequence) {
                Api28Impl.e(view, charSequence);
            }

            /* renamed from: j */
            public boolean g(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    public static boolean M(View view, int i2, Bundle bundle) {
        return view.performAccessibilityAction(i2, bundle);
    }

    public static ContentInfoCompat N(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.b(view, contentInfoCompat);
        }
        OnReceiveContentListener onReceiveContentListener = (OnReceiveContentListener) view.getTag(R.id.M);
        if (onReceiveContentListener == null) {
            return p(view).a(contentInfoCompat);
        }
        ContentInfoCompat a2 = onReceiveContentListener.a(view, contentInfoCompat);
        if (a2 == null) {
            return null;
        }
        return p(view).a(a2);
    }

    public static void O(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void P(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void Q(View view, Runnable runnable, long j2) {
        view.postOnAnimationDelayed(runnable, j2);
    }

    public static void R(View view) {
        Api20Impl.c(view);
    }

    public static void S(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.b(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static AccessibilityViewProperty T() {
        return new AccessibilityViewProperty<Boolean>(R.id.O, Boolean.class, 28) {
            /* renamed from: h */
            public Boolean c(View view) {
                return Boolean.valueOf(Api28Impl.c(view));
            }

            /* renamed from: i */
            public void d(View view, Boolean bool) {
                Api28Impl.f(view, bool.booleanValue());
            }

            /* renamed from: j */
            public boolean g(Boolean bool, Boolean bool2) {
                return !a(bool, bool2);
            }
        };
    }

    public static void U(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (j(view) instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat();
        }
        c0(view);
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.d());
    }

    public static void V(View view, boolean z2) {
        b().f(view, Boolean.valueOf(z2));
    }

    public static void W(View view, CharSequence charSequence) {
        L().f(view, charSequence);
        if (charSequence != null) {
            f20265f.a(view);
        } else {
            f20265f.d(view);
        }
    }

    public static void X(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void Y(View view, ColorStateList colorStateList) {
        Api21Impl.g(view, colorStateList);
    }

    public static void Z(View view, PorterDuff.Mode mode) {
        Api21Impl.h(view, mode);
    }

    public static void a0(View view, float f2) {
        Api21Impl.i(view, f2);
    }

    public static AccessibilityViewProperty b() {
        return new AccessibilityViewProperty<Boolean>(R.id.J, Boolean.class, 28) {
            /* renamed from: h */
            public Boolean c(View view) {
                return Boolean.valueOf(Api28Impl.b(view));
            }

            /* renamed from: i */
            public void d(View view, Boolean bool) {
                Api28Impl.d(view, bool.booleanValue());
            }

            /* renamed from: j */
            public boolean g(Boolean bool, Boolean bool2) {
                return !a(bool, bool2);
            }
        };
    }

    public static void b0(View view, int i2) {
        view.setImportantForAccessibility(i2);
    }

    public static ViewPropertyAnimatorCompat c(View view) {
        if (f20260a == null) {
            f20260a = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) f20260a.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        f20260a.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    public static void c0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        return Api21Impl.b(view, windowInsetsCompat, rect);
    }

    public static void d0(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        Api21Impl.j(view, onApplyWindowInsetsListener);
    }

    public static WindowInsetsCompat e(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets w2 = windowInsetsCompat.w();
        if (w2 != null) {
            WindowInsets a2 = Api20Impl.a(view, w2);
            if (!a2.equals(w2)) {
                return WindowInsetsCompat.y(a2, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void e0(View view, boolean z2) {
        T().f(view, Boolean.valueOf(z2));
    }

    public static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return UnhandledKeyEventManager.a(view).b(view, keyEvent);
    }

    public static void f0(View view, int i2, int i3) {
        Api23Impl.b(view, i2, i3);
    }

    public static boolean g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return UnhandledKeyEventManager.a(view).f(keyEvent);
    }

    public static void g0(View view, CharSequence charSequence) {
        j0().f(view, charSequence);
    }

    public static void h(View view) {
        AccessibilityDelegateCompat i2 = i(view);
        if (i2 == null) {
            i2 = new AccessibilityDelegateCompat();
        }
        U(view, i2);
    }

    public static void h0(View view, String str) {
        Api21Impl.k(view, str);
    }

    public static AccessibilityDelegateCompat i(View view) {
        View.AccessibilityDelegate j2 = j(view);
        if (j2 == null) {
            return null;
        }
        return j2 instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter ? ((AccessibilityDelegateCompat.AccessibilityDelegateAdapter) j2).f20193a : new AccessibilityDelegateCompat(j2);
    }

    public static void i0(View view, WindowInsetsAnimationCompat.Callback callback) {
        WindowInsetsAnimationCompat.c(view, callback);
    }

    public static View.AccessibilityDelegate j(View view) {
        return Build.VERSION.SDK_INT >= 29 ? Api29Impl.a(view) : k(view);
    }

    public static AccessibilityViewProperty j0() {
        return new AccessibilityViewProperty<CharSequence>(R.id.P, CharSequence.class, 64, 30) {
            /* renamed from: h */
            public CharSequence c(View view) {
                return Api30Impl.a(view);
            }

            /* renamed from: i */
            public void d(View view, CharSequence charSequence) {
                Api30Impl.b(view, charSequence);
            }

            /* renamed from: j */
            public boolean g(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    public static View.AccessibilityDelegate k(View view) {
        if (f20262c) {
            return null;
        }
        if (f20261b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f20261b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f20262c = true;
                return null;
            }
        }
        try {
            Object obj = f20261b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f20262c = true;
            return null;
        }
    }

    public static void k0(View view) {
        Api21Impl.l(view);
    }

    public static CharSequence l(View view) {
        return (CharSequence) L().e(view);
    }

    public static ColorStateList m(View view) {
        return Api21Impl.c(view);
    }

    public static PorterDuff.Mode n(View view) {
        return Api21Impl.d(view);
    }

    public static float o(View view) {
        return Api21Impl.e(view);
    }

    public static OnReceiveContentViewBehavior p(View view) {
        return view instanceof OnReceiveContentViewBehavior ? (OnReceiveContentViewBehavior) view : f20264e;
    }

    public static boolean q(View view) {
        return view.getFitsSystemWindows();
    }

    public static int r(View view) {
        return view.getImportantForAccessibility();
    }

    public static int s(View view) {
        return view.getLayoutDirection();
    }

    public static int t(View view) {
        return view.getMinimumHeight();
    }

    public static String[] u(View view) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.a(view) : (String[]) view.getTag(R.id.N);
    }

    public static ViewParent v(View view) {
        return view.getParentForAccessibility();
    }

    public static WindowInsetsCompat w(View view) {
        return Api23Impl.a(view);
    }

    public static CharSequence x(View view) {
        return (CharSequence) j0().e(view);
    }

    public static String y(View view) {
        return Api21Impl.f(view);
    }

    public static int z(View view) {
        return view.getWindowSystemUiVisibility();
    }
}
