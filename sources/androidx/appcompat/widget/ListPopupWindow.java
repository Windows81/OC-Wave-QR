package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.ViewCompat;
import androidx.core.widget.PopupWindowCompat;
import java.lang.reflect.Method;

public class ListPopupWindow implements ShowableListMenu {
    public static Method f0;
    public static Method g0;

    /* renamed from: A  reason: collision with root package name */
    public ListAdapter f1219A;

    /* renamed from: B  reason: collision with root package name */
    public DropDownListView f1220B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public int N;
    public View O;
    public int P;
    public DataSetObserver Q;
    public View R;
    public Drawable S;
    public AdapterView.OnItemClickListener T;
    public AdapterView.OnItemSelectedListener U;
    public final ResizePopupRunnable V;
    public final PopupTouchInterceptor W;
    public final PopupScrollListener X;
    public final ListSelectorHider Y;
    public Runnable Z;
    public final Handler a0;
    public final Rect b0;
    public Rect c0;
    public boolean d0;
    public PopupWindow e0;

    /* renamed from: z  reason: collision with root package name */
    public Context f1221z;

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$1  reason: invalid class name */
    class AnonymousClass1 extends ForwardingListener {
        public final /* synthetic */ ListPopupWindow I;

        /* renamed from: k */
        public ListPopupWindow b() {
            return this.I;
        }
    }

    public static class Api24Impl {
        public static int a(PopupWindow popupWindow, View view, int i2, boolean z2) {
            return popupWindow.getMaxAvailableHeight(view, i2, z2);
        }
    }

    public static class Api29Impl {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z2) {
            popupWindow.setIsClippedToScreen(z2);
        }
    }

    public class ListSelectorHider implements Runnable {
        public ListSelectorHider() {
        }

        public void run() {
            ListPopupWindow.this.r();
        }
    }

    public class PopupDataSetObserver extends DataSetObserver {
        public PopupDataSetObserver() {
        }

        public void onChanged() {
            if (ListPopupWindow.this.a()) {
                ListPopupWindow.this.b();
            }
        }

        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    public class PopupScrollListener implements AbsListView.OnScrollListener {
        public PopupScrollListener() {
        }

        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 == 1 && !ListPopupWindow.this.w() && ListPopupWindow.this.e0.getContentView() != null) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.a0.removeCallbacks(listPopupWindow.V);
                ListPopupWindow.this.V.run();
            }
        }
    }

    public class PopupTouchInterceptor implements View.OnTouchListener {
        public PopupTouchInterceptor() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.e0) != null && popupWindow.isShowing() && x2 >= 0 && x2 < ListPopupWindow.this.e0.getWidth() && y2 >= 0 && y2 < ListPopupWindow.this.e0.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.a0.postDelayed(listPopupWindow.V, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.a0.removeCallbacks(listPopupWindow2.V);
                return false;
            }
        }
    }

    public class ResizePopupRunnable implements Runnable {
        public ResizePopupRunnable() {
        }

        public void run() {
            DropDownListView dropDownListView = ListPopupWindow.this.f1220B;
            if (dropDownListView != null && ViewCompat.C(dropDownListView) && ListPopupWindow.this.f1220B.getCount() > ListPopupWindow.this.f1220B.getChildCount()) {
                int childCount = ListPopupWindow.this.f1220B.getChildCount();
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (childCount <= listPopupWindow.N) {
                    listPopupWindow.e0.setInputMethodMode(2);
                    ListPopupWindow.this.b();
                }
            }
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f0 = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                g0 = cls.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, (AttributeSet) null, R.attr.G);
    }

    public void A(int i2) {
        this.e0.setAnimationStyle(i2);
    }

    public void B(int i2) {
        Drawable background = this.e0.getBackground();
        if (background != null) {
            background.getPadding(this.b0);
            Rect rect = this.b0;
            this.D = rect.left + rect.right + i2;
            return;
        }
        M(i2);
    }

    public void C(int i2) {
        this.K = i2;
    }

    public void D(Rect rect) {
        this.c0 = rect != null ? new Rect(rect) : null;
    }

    public void E(int i2) {
        this.e0.setInputMethodMode(i2);
    }

    public void F(boolean z2) {
        this.d0 = z2;
        this.e0.setFocusable(z2);
    }

    public void G(PopupWindow.OnDismissListener onDismissListener) {
        this.e0.setOnDismissListener(onDismissListener);
    }

    public void H(AdapterView.OnItemClickListener onItemClickListener) {
        this.T = onItemClickListener;
    }

    public void I(boolean z2) {
        this.J = true;
        this.I = z2;
    }

    public final void J(boolean z2) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f0;
            if (method != null) {
                try {
                    method.invoke(this.e0, new Object[]{Boolean.valueOf(z2)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            Api29Impl.b(this.e0, z2);
        }
    }

    public void K(int i2) {
        this.P = i2;
    }

    public void L(int i2) {
        DropDownListView dropDownListView = this.f1220B;
        if (a() && dropDownListView != null) {
            dropDownListView.setListSelectionHidden(false);
            dropDownListView.setSelection(i2);
            if (dropDownListView.getChoiceMode() != 0) {
                dropDownListView.setItemChecked(i2, true);
            }
        }
    }

    public void M(int i2) {
        this.D = i2;
    }

    public boolean a() {
        return this.e0.isShowing();
    }

    public void b() {
        int q2 = q();
        boolean w2 = w();
        PopupWindowCompat.b(this.e0, this.G);
        boolean z2 = true;
        if (!this.e0.isShowing()) {
            int i2 = this.D;
            if (i2 == -1) {
                i2 = -1;
            } else if (i2 == -2) {
                i2 = t().getWidth();
            }
            int i3 = this.C;
            if (i3 == -1) {
                q2 = -1;
            } else if (i3 != -2) {
                q2 = i3;
            }
            this.e0.setWidth(i2);
            this.e0.setHeight(q2);
            J(true);
            PopupWindow popupWindow = this.e0;
            if (this.M || this.L) {
                z2 = false;
            }
            popupWindow.setOutsideTouchable(z2);
            this.e0.setTouchInterceptor(this.W);
            if (this.J) {
                PopupWindowCompat.a(this.e0, this.I);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = g0;
                if (method != null) {
                    try {
                        method.invoke(this.e0, new Object[]{this.c0});
                    } catch (Exception e2) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                    }
                }
            } else {
                Api29Impl.a(this.e0, this.c0);
            }
            PopupWindowCompat.c(this.e0, t(), this.E, this.F, this.K);
            this.f1220B.setSelection(-1);
            if (!this.d0 || this.f1220B.isInTouchMode()) {
                r();
            }
            if (!this.d0) {
                this.a0.post(this.Y);
            }
        } else if (ViewCompat.C(t())) {
            int i4 = this.D;
            if (i4 == -1) {
                i4 = -1;
            } else if (i4 == -2) {
                i4 = t().getWidth();
            }
            int i5 = this.C;
            if (i5 == -1) {
                if (!w2) {
                    q2 = -1;
                }
                if (w2) {
                    this.e0.setWidth(this.D == -1 ? -1 : 0);
                    this.e0.setHeight(0);
                } else {
                    this.e0.setWidth(this.D == -1 ? -1 : 0);
                    this.e0.setHeight(-1);
                }
            } else if (i5 != -2) {
                q2 = i5;
            }
            PopupWindow popupWindow2 = this.e0;
            if (this.M || this.L) {
                z2 = false;
            }
            popupWindow2.setOutsideTouchable(z2);
            this.e0.update(t(), this.E, this.F, i4 < 0 ? -1 : i4, q2 < 0 ? -1 : q2);
        }
    }

    public int c() {
        return this.E;
    }

    public void dismiss() {
        this.e0.dismiss();
        y();
        this.e0.setContentView((View) null);
        this.f1220B = null;
        this.a0.removeCallbacks(this.V);
    }

    public void e(int i2) {
        this.E = i2;
    }

    public Drawable h() {
        return this.e0.getBackground();
    }

    public ListView j() {
        return this.f1220B;
    }

    public void k(Drawable drawable) {
        this.e0.setBackgroundDrawable(drawable);
    }

    public void l(int i2) {
        this.F = i2;
        this.H = true;
    }

    public int o() {
        if (!this.H) {
            return 0;
        }
        return this.F;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.Q;
        if (dataSetObserver == null) {
            this.Q = new PopupDataSetObserver();
        } else {
            ListAdapter listAdapter2 = this.f1219A;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1219A = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.Q);
        }
        DropDownListView dropDownListView = this.f1220B;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.f1219A);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.DropDownListView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.DropDownListView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.DropDownListView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int q() {
        /*
            r12 = this;
            androidx.appcompat.widget.DropDownListView r0 = r12.f1220B
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00be
            android.content.Context r0 = r12.f1221z
            androidx.appcompat.widget.ListPopupWindow$2 r5 = new androidx.appcompat.widget.ListPopupWindow$2
            r5.<init>()
            r12.Z = r5
            boolean r5 = r12.d0
            r5 = r5 ^ r3
            androidx.appcompat.widget.DropDownListView r5 = r12.s(r0, r5)
            r12.f1220B = r5
            android.graphics.drawable.Drawable r6 = r12.S
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.DropDownListView r5 = r12.f1220B
            android.widget.ListAdapter r6 = r12.f1219A
            r5.setAdapter(r6)
            androidx.appcompat.widget.DropDownListView r5 = r12.f1220B
            android.widget.AdapterView$OnItemClickListener r6 = r12.T
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.DropDownListView r5 = r12.f1220B
            r5.setFocusable(r3)
            androidx.appcompat.widget.DropDownListView r5 = r12.f1220B
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.DropDownListView r5 = r12.f1220B
            androidx.appcompat.widget.ListPopupWindow$3 r6 = new androidx.appcompat.widget.ListPopupWindow$3
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.DropDownListView r5 = r12.f1220B
            androidx.appcompat.widget.ListPopupWindow$PopupScrollListener r6 = r12.X
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.U
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.DropDownListView r6 = r12.f1220B
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.DropDownListView r5 = r12.f1220B
            android.view.View r6 = r12.O
            if (r6 == 0) goto L_0x00b7
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.P
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.P
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.D
            if (r0 < 0) goto L_0x009b
            r5 = r1
            goto L_0x009d
        L_0x009b:
            r0 = r4
            r5 = r0
        L_0x009d:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b8
        L_0x00b7:
            r0 = r4
        L_0x00b8:
            android.widget.PopupWindow r6 = r12.e0
            r6.setContentView(r5)
            goto L_0x00dc
        L_0x00be:
            android.widget.PopupWindow r0 = r12.e0
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.O
            if (r0 == 0) goto L_0x00db
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dc
        L_0x00db:
            r0 = r4
        L_0x00dc:
            android.widget.PopupWindow r5 = r12.e0
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f8
            android.graphics.Rect r6 = r12.b0
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.b0
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.H
            if (r7 != 0) goto L_0x00fe
            int r6 = -r6
            r12.F = r6
            goto L_0x00fe
        L_0x00f8:
            android.graphics.Rect r5 = r12.b0
            r5.setEmpty()
            r5 = r4
        L_0x00fe:
            android.widget.PopupWindow r6 = r12.e0
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r3 = r4
        L_0x0109:
            android.view.View r4 = r12.t()
            int r6 = r12.F
            int r3 = r12.u(r4, r6, r3)
            boolean r4 = r12.L
            if (r4 != 0) goto L_0x017b
            int r4 = r12.C
            if (r4 != r2) goto L_0x011c
            goto L_0x017b
        L_0x011c:
            int r4 = r12.D
            r6 = -2
            if (r4 == r6) goto L_0x0144
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012b
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
        L_0x0129:
            r7 = r1
            goto L_0x015d
        L_0x012b:
            android.content.Context r2 = r12.f1221z
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.b0
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0129
        L_0x0144:
            android.content.Context r2 = r12.f1221z
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.b0
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0129
        L_0x015d:
            androidx.appcompat.widget.DropDownListView r6 = r12.f1220B
            int r10 = r3 - r0
            r11 = -1
            r8 = 0
            r9 = -1
            int r1 = r6.d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0179
            androidx.appcompat.widget.DropDownListView r2 = r12.f1220B
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.DropDownListView r3 = r12.f1220B
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0179:
            int r1 = r1 + r0
            return r1
        L_0x017b:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ListPopupWindow.q():int");
    }

    public void r() {
        DropDownListView dropDownListView = this.f1220B;
        if (dropDownListView != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
    }

    public DropDownListView s(Context context, boolean z2) {
        return new DropDownListView(context, z2);
    }

    public View t() {
        return this.R;
    }

    public final int u(View view, int i2, boolean z2) {
        return Api24Impl.a(this.e0, view, i2, z2);
    }

    public int v() {
        return this.D;
    }

    public boolean w() {
        return this.e0.getInputMethodMode() == 2;
    }

    public boolean x() {
        return this.d0;
    }

    public final void y() {
        View view = this.O;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.O);
            }
        }
    }

    public void z(View view) {
        this.R = view;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.C = -2;
        this.D = -2;
        this.G = 1002;
        this.K = 0;
        this.L = false;
        this.M = false;
        this.N = Integer.MAX_VALUE;
        this.P = 0;
        this.V = new ResizePopupRunnable();
        this.W = new PopupTouchInterceptor();
        this.X = new PopupScrollListener();
        this.Y = new ListSelectorHider();
        this.b0 = new Rect();
        this.f1221z = context;
        this.a0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.n1, i2, i3);
        this.E = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.o1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.p1, 0);
        this.F = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.H = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i2, i3);
        this.e0 = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
