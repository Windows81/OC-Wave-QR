package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {

    /* renamed from: A  reason: collision with root package name */
    public final Callbacks f1036A;

    /* renamed from: B  reason: collision with root package name */
    public final View f1037B;
    public final Drawable C;
    public final FrameLayout D;
    public final ImageView E;
    public final FrameLayout F;
    public final ImageView G;
    public final int H;
    public ActionProvider I;
    public final DataSetObserver J;
    public final ViewTreeObserver.OnGlobalLayoutListener K;
    public ListPopupWindow L;
    public PopupWindow.OnDismissListener M;
    public boolean N;
    public int O;
    public boolean P;
    public int Q;

    /* renamed from: z  reason: collision with root package name */
    public final ActivityChooserViewAdapter f1038z;

    public class ActivityChooserViewAdapter extends BaseAdapter {

        /* renamed from: A  reason: collision with root package name */
        public int f1043A = 4;

        /* renamed from: B  reason: collision with root package name */
        public boolean f1044B;
        public boolean C;
        public boolean D;

        /* renamed from: z  reason: collision with root package name */
        public ActivityChooserModel f1045z;

        public ActivityChooserViewAdapter() {
        }

        public int a() {
            return this.f1045z.f();
        }

        public ActivityChooserModel b() {
            return this.f1045z;
        }

        public ResolveInfo c() {
            return this.f1045z.h();
        }

        public int d() {
            return this.f1045z.i();
        }

        public boolean e() {
            return this.f1044B;
        }

        public int f() {
            int i2 = this.f1043A;
            this.f1043A = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int i3 = 0;
            View view = null;
            for (int i4 = 0; i4 < count; i4++) {
                view = getView(i4, view, (ViewGroup) null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i3 = Math.max(i3, view.getMeasuredWidth());
            }
            this.f1043A = i2;
            return i3;
        }

        public void g(ActivityChooserModel activityChooserModel) {
            ActivityChooserModel b2 = ActivityChooserView.this.f1038z.b();
            if (b2 != null && ActivityChooserView.this.isShown()) {
                b2.unregisterObserver(ActivityChooserView.this.J);
            }
            this.f1045z = activityChooserModel;
            if (activityChooserModel != null && ActivityChooserView.this.isShown()) {
                activityChooserModel.registerObserver(ActivityChooserView.this.J);
            }
            notifyDataSetChanged();
        }

        public int getCount() {
            int f2 = this.f1045z.f();
            if (!this.f1044B && this.f1045z.h() != null) {
                f2--;
            }
            int min = Math.min(f2, this.f1043A);
            return this.D ? min + 1 : min;
        }

        public Object getItem(int i2) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType == 0) {
                if (!this.f1044B && this.f1045z.h() != null) {
                    i2++;
                }
                return this.f1045z.e(i2);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public int getItemViewType(int i2) {
            return (!this.D || i2 != getCount() - 1) ? 0 : 1;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType == 0) {
                if (view == null || view.getId() != R.id.f398x) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.f406f, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i2);
                ((ImageView) view.findViewById(R.id.f396v)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(R.id.S)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.f1044B || i2 != 0 || !this.C) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.f406f, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(R.id.S)).setText(ActivityChooserView.this.getContext().getString(R.string.f424b));
                return inflate;
            }
        }

        public int getViewTypeCount() {
            return 3;
        }

        public void h(int i2) {
            if (this.f1043A != i2) {
                this.f1043A = i2;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z2, boolean z3) {
            if (this.f1044B != z2 || this.C != z3) {
                this.f1044B = z2;
                this.C = z3;
                notifyDataSetChanged();
            }
        }

        public void j(boolean z2) {
            if (this.D != z2) {
                this.D = z2;
                notifyDataSetChanged();
            }
        }
    }

    public class Callbacks implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public Callbacks() {
        }

        public final void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.M;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.F) {
                activityChooserView.a();
                Intent b2 = ActivityChooserView.this.f1038z.b().b(ActivityChooserView.this.f1038z.b().g(ActivityChooserView.this.f1038z.c()));
                if (b2 != null) {
                    b2.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(b2);
                }
            } else if (view == activityChooserView.D) {
                activityChooserView.N = false;
                activityChooserView.d(activityChooserView.O);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            a();
            ActionProvider actionProvider = ActivityChooserView.this.I;
            if (actionProvider != null) {
                actionProvider.k(false);
            }
        }

        public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
            int itemViewType = ((ActivityChooserViewAdapter) adapterView.getAdapter()).getItemViewType(i2);
            if (itemViewType == 0) {
                ActivityChooserView.this.a();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!activityChooserView.N) {
                    if (!activityChooserView.f1038z.e()) {
                        i2++;
                    }
                    Intent b2 = ActivityChooserView.this.f1038z.b().b(i2);
                    if (b2 != null) {
                        b2.addFlags(524288);
                        ActivityChooserView.this.getContext().startActivity(b2);
                    }
                } else if (i2 > 0) {
                    activityChooserView.f1038z.b().o(i2);
                }
            } else if (itemViewType == 1) {
                ActivityChooserView.this.d(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.F) {
                if (activityChooserView.f1038z.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.N = true;
                    activityChooserView2.d(activityChooserView2.O);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public static class InnerLayout extends LinearLayout {

        /* renamed from: z  reason: collision with root package name */
        public static final int[] f1047z = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TintTypedArray t2 = TintTypedArray.t(context, attributeSet, f1047z);
            setBackgroundDrawable(t2.f(0));
            t2.v();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean a() {
        if (!b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.K);
        return true;
    }

    public boolean b() {
        return getListPopupWindow().a();
    }

    public boolean c() {
        if (b() || !this.P) {
            return false;
        }
        this.N = false;
        d(this.O);
        return true;
    }

    public void d(int i2) {
        if (this.f1038z.b() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.K);
            boolean z2 = this.F.getVisibility() == 0;
            int a2 = this.f1038z.a();
            if (i2 == Integer.MAX_VALUE || a2 <= i2 + (z2 ? 1 : 0)) {
                this.f1038z.j(false);
                this.f1038z.h(i2);
            } else {
                this.f1038z.j(true);
                this.f1038z.h(i2 - 1);
            }
            ListPopupWindow listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.a()) {
                if (this.N || !z2) {
                    this.f1038z.i(true, z2);
                } else {
                    this.f1038z.i(false, false);
                }
                listPopupWindow.B(Math.min(this.f1038z.f(), this.H));
                listPopupWindow.b();
                ActionProvider actionProvider = this.I;
                if (actionProvider != null) {
                    actionProvider.k(true);
                }
                listPopupWindow.j().setContentDescription(getContext().getString(R.string.f425c));
                listPopupWindow.j().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    public void e() {
        if (this.f1038z.getCount() > 0) {
            this.D.setEnabled(true);
        } else {
            this.D.setEnabled(false);
        }
        int a2 = this.f1038z.a();
        int d2 = this.f1038z.d();
        if (a2 == 1 || (a2 > 1 && d2 > 0)) {
            this.F.setVisibility(0);
            ResolveInfo c2 = this.f1038z.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.G.setImageDrawable(c2.loadIcon(packageManager));
            if (this.Q != 0) {
                this.F.setContentDescription(getContext().getString(this.Q, new Object[]{c2.loadLabel(packageManager)}));
            }
        } else {
            this.F.setVisibility(8);
        }
        if (this.F.getVisibility() == 0) {
            this.f1037B.setBackgroundDrawable(this.C);
        } else {
            this.f1037B.setBackgroundDrawable((Drawable) null);
        }
    }

    public ActivityChooserModel getDataModel() {
        return this.f1038z.b();
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.L == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.L = listPopupWindow;
            listPopupWindow.p(this.f1038z);
            this.L.z(this);
            this.L.F(true);
            this.L.H(this.f1036A);
            this.L.G(this.f1036A);
        }
        return this.L;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ActivityChooserModel b2 = this.f1038z.b();
        if (b2 != null) {
            b2.registerObserver(this.J);
        }
        this.P = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActivityChooserModel b2 = this.f1038z.b();
        if (b2 != null) {
            b2.unregisterObserver(this.J);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.K);
        }
        if (b()) {
            a();
        }
        this.P = false;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.f1037B.layout(0, 0, i4 - i2, i5 - i3);
        if (!b()) {
            a();
        }
    }

    public void onMeasure(int i2, int i3) {
        View view = this.f1037B;
        if (this.F.getVisibility() != 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        }
        measureChild(view, i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) {
        this.f1038z.g(activityChooserModel);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i2) {
        this.Q = i2;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i2) {
        this.E.setContentDescription(getContext().getString(i2));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.E.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i2) {
        this.O = i2;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.M = onDismissListener;
    }

    public void setProvider(ActionProvider actionProvider) {
        this.I = actionProvider;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.J = new DataSetObserver() {
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.f1038z.notifyDataSetChanged();
            }

            public void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.f1038z.notifyDataSetInvalidated();
            }
        };
        this.K = new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (!ActivityChooserView.this.b()) {
                    return;
                }
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().b();
                ActionProvider actionProvider = ActivityChooserView.this.I;
                if (actionProvider != null) {
                    actionProvider.k(true);
                }
            }
        };
        this.O = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.E, i2, 0);
        ViewCompat.S(this, context, R.styleable.E, attributeSet, obtainStyledAttributes, i2, 0);
        this.O = obtainStyledAttributes.getInt(R.styleable.G, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.F);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.f405e, this, true);
        Callbacks callbacks = new Callbacks();
        this.f1036A = callbacks;
        View findViewById = findViewById(R.id.f384j);
        this.f1037B = findViewById;
        this.C = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.f392r);
        this.F = frameLayout;
        frameLayout.setOnClickListener(callbacks);
        frameLayout.setOnLongClickListener(callbacks);
        this.G = (ImageView) frameLayout.findViewById(R.id.f397w);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.f394t);
        frameLayout2.setOnClickListener(callbacks);
        frameLayout2.setAccessibilityDelegate(new View.AccessibilityDelegate() {
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                AccessibilityNodeInfoCompat.V0(accessibilityNodeInfo).f0(true);
            }
        });
        frameLayout2.setOnTouchListener(new ForwardingListener(frameLayout2) {
            public ShowableListMenu b() {
                return ActivityChooserView.this.getListPopupWindow();
            }

            public boolean c() {
                ActivityChooserView.this.c();
                return true;
            }

            public boolean d() {
                ActivityChooserView.this.a();
                return true;
            }
        });
        this.D = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.f397w);
        this.E = imageView;
        imageView.setImageDrawable(drawable);
        ActivityChooserViewAdapter activityChooserViewAdapter = new ActivityChooserViewAdapter();
        this.f1038z = activityChooserViewAdapter;
        activityChooserViewAdapter.registerDataSetObserver(new DataSetObserver() {
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.e();
            }
        });
        Resources resources = context.getResources();
        this.H = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.f333d));
    }
}
