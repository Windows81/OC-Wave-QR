package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.BuildCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.widget.ListViewAutoScrollHelper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class DropDownListView extends ListView {

    /* renamed from: A  reason: collision with root package name */
    public int f1199A = 0;

    /* renamed from: B  reason: collision with root package name */
    public int f1200B = 0;
    public int C = 0;
    public int D = 0;
    public int E;
    public GateKeeperDrawable F;
    public boolean G;
    public boolean H;
    public boolean I;
    public ViewPropertyAnimatorCompat J;
    public ListViewAutoScrollHelper K;
    public ResolveHoverRunnable L;

    /* renamed from: z  reason: collision with root package name */
    public final Rect f1201z = new Rect();

    public static class Api21Impl {
        public static void a(View view, float f2, float f3) {
            view.drawableHotspotChanged(f2, f3);
        }
    }

    public static class Api30Impl {

        /* renamed from: a  reason: collision with root package name */
        public static Method f1202a;

        /* renamed from: b  reason: collision with root package name */
        public static Method f1203b;

        /* renamed from: c  reason: collision with root package name */
        public static Method f1204c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f1205d = true;

        static {
            Class<AdapterView> cls = AdapterView.class;
            Class<AbsListView> cls2 = AbsListView.class;
            try {
                Class cls3 = Integer.TYPE;
                Class cls4 = Boolean.TYPE;
                Class cls5 = Float.TYPE;
                Method declaredMethod = cls2.getDeclaredMethod("positionSelector", new Class[]{cls3, View.class, cls4, cls5, cls5});
                f1202a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = cls.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls3});
                f1203b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls3});
                f1204c = declaredMethod3;
                declaredMethod3.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            }
        }

        public static boolean a() {
            return f1205d;
        }

        public static void b(DropDownListView dropDownListView, int i2, View view) {
            try {
                f1202a.invoke(dropDownListView, new Object[]{Integer.valueOf(i2), view, Boolean.FALSE, -1, -1});
                f1203b.invoke(dropDownListView, new Object[]{Integer.valueOf(i2)});
                f1204c.invoke(dropDownListView, new Object[]{Integer.valueOf(i2)});
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
    }

    public static class Api33Impl {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z2) {
            absListView.setSelectedChildViewEnabled(z2);
        }
    }

    public static class GateKeeperDrawable extends DrawableWrapperCompat {

        /* renamed from: A  reason: collision with root package name */
        public boolean f1206A = true;

        public GateKeeperDrawable(Drawable drawable) {
            super(drawable);
        }

        public void b(boolean z2) {
            this.f1206A = z2;
        }

        public void draw(Canvas canvas) {
            if (this.f1206A) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f2, float f3) {
            if (this.f1206A) {
                super.setHotspot(f2, f3);
            }
        }

        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f1206A) {
                super.setHotspotBounds(i2, i3, i4, i5);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f1206A) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z2, boolean z3) {
            if (this.f1206A) {
                return super.setVisible(z2, z3);
            }
            return false;
        }
    }

    public static class PreApi33Impl {

        /* renamed from: a  reason: collision with root package name */
        public static final Field f1207a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                e2.printStackTrace();
            }
            f1207a = field;
        }

        public static boolean a(AbsListView absListView) {
            Field field = f1207a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return false;
            }
        }

        public static void b(AbsListView absListView, boolean z2) {
            Field field = f1207a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z2));
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public class ResolveHoverRunnable implements Runnable {
        public ResolveHoverRunnable() {
        }

        public void a() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.L = null;
            dropDownListView.removeCallbacks(this);
        }

        public void b() {
            DropDownListView.this.post(this);
        }

        public void run() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.L = null;
            dropDownListView.drawableStateChanged();
        }
    }

    public DropDownListView(Context context, boolean z2) {
        super(context, (AttributeSet) null, R.attr.C);
        this.H = z2;
        setCacheColorHint(0);
    }

    public final void a() {
        this.I = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.E - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.J;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.c();
            this.J = null;
        }
    }

    public final void b(View view, int i2) {
        performItemClick(view, i2, getItemIdAtPosition(i2));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (!this.f1201z.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1201z);
            selector.draw(canvas);
        }
    }

    public int d(int i2, int i3, int i4, int i5, int i6) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        View view = null;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            view.measure(i2, i11 > 0 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i5) {
                return (i6 < 0 || i8 <= i6 || i10 <= 0 || i7 == i5) ? i5 : i10;
            }
            if (i6 >= 0 && i8 >= i6) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.L == null) {
            super.drawableStateChanged();
            j(true);
            n();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r3 = r1
            r9 = r2
            goto L_0x0046
        L_0x0011:
            r9 = r2
            r3 = r9
            goto L_0x0046
        L_0x0014:
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = r1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto L_0x000e
            r7.b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.K
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.ListViewAutoScrollHelper r9 = new androidx.core.widget.ListViewAutoScrollHelper
            r9.<init>(r7)
            r7.K = r9
        L_0x005a:
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.K
            r9.m(r1)
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.K
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.ListViewAutoScrollHelper r8 = r7.K
            if (r8 == 0) goto L_0x006c
            r8.m(r2)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DropDownListView.e(android.view.MotionEvent, int):boolean");
    }

    public final void f(int i2, View view) {
        Rect rect = this.f1201z;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1199A;
        rect.top -= this.f1200B;
        rect.right += this.C;
        rect.bottom += this.D;
        boolean k2 = k();
        if (view.isEnabled() != k2) {
            l(!k2);
            if (i2 != -1) {
                refreshDrawableState();
            }
        }
    }

    public final void g(int i2, View view) {
        Drawable selector = getSelector();
        boolean z2 = true;
        boolean z3 = (selector == null || i2 == -1) ? false : true;
        if (z3) {
            selector.setVisible(false, false);
        }
        f(i2, view);
        if (z3) {
            Rect rect = this.f1201z;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z2 = false;
            }
            selector.setVisible(z2, false);
            DrawableCompat.j(selector, exactCenterX, exactCenterY);
        }
    }

    public final void h(int i2, View view, float f2, float f3) {
        g(i2, view);
        Drawable selector = getSelector();
        if (selector != null && i2 != -1) {
            DrawableCompat.j(selector, f2, f3);
        }
    }

    public boolean hasFocus() {
        return this.H || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.H || super.hasWindowFocus();
    }

    public final void i(View view, int i2, float f2, float f3) {
        View childAt;
        this.I = true;
        Api21Impl.a(this, f2, f3);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.E;
        if (!(i3 == -1 || (childAt = getChildAt(i3 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.E = i2;
        Api21Impl.a(view, f2 - ((float) view.getLeft()), f3 - ((float) view.getTop()));
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i2, view, f2, f3);
        j(false);
        refreshDrawableState();
    }

    public boolean isFocused() {
        return this.H || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.H && this.G) || super.isInTouchMode();
    }

    public final void j(boolean z2) {
        GateKeeperDrawable gateKeeperDrawable = this.F;
        if (gateKeeperDrawable != null) {
            gateKeeperDrawable.b(z2);
        }
    }

    public final boolean k() {
        return BuildCompat.c() ? Api33Impl.a(this) : PreApi33Impl.a(this);
    }

    public final void l(boolean z2) {
        if (BuildCompat.c()) {
            Api33Impl.b(this, z2);
        } else {
            PreApi33Impl.b(this, z2);
        }
    }

    public final boolean m() {
        return this.I;
    }

    public final void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public void onDetachedFromWindow() {
        this.L = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i2 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.L == null) {
            ResolveHoverRunnable resolveHoverRunnable = new ResolveHoverRunnable();
            this.L = resolveHoverRunnable;
            resolveHoverRunnable.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i2 < 30 || !Api30Impl.a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        Api30Impl.b(this, pointToPosition, childAt);
                    }
                }
                n();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.E = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        ResolveHoverRunnable resolveHoverRunnable = this.L;
        if (resolveHoverRunnable != null) {
            resolveHoverRunnable.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.G = z2;
    }

    public void setSelector(Drawable drawable) {
        GateKeeperDrawable gateKeeperDrawable = drawable != null ? new GateKeeperDrawable(drawable) : null;
        this.F = gateKeeperDrawable;
        super.setSelector(gateKeeperDrawable);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1199A = rect.left;
        this.f1200B = rect.top;
        this.C = rect.right;
        this.D = rect.bottom;
    }
}
