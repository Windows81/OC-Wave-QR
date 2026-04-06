package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.R;

class TooltipPopup {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1362a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1363b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f1364c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f1365d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f1366e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1367f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1368g = new int[2];

    public TooltipPopup(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1365d = layoutParams;
        this.f1362a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f421u, (ViewGroup) null);
        this.f1363b = inflate;
        this.f1364c = (TextView) inflate.findViewById(R.id.f399y);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.f441a;
        layoutParams.flags = 24;
    }

    public static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    public final void a(View view, int i2, int i3, boolean z2, WindowManager.LayoutParams layoutParams) {
        int i4;
        int i5;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1362a.getResources().getDimensionPixelOffset(R.dimen.f342m);
        if (view.getWidth() < dimensionPixelOffset) {
            i2 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1362a.getResources().getDimensionPixelOffset(R.dimen.f341l);
            i5 = i3 + dimensionPixelOffset2;
            i4 = i3 - dimensionPixelOffset2;
        } else {
            i5 = view.getHeight();
            i4 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1362a.getResources().getDimensionPixelOffset(z2 ? R.dimen.f344o : R.dimen.f343n);
        View b2 = b(view);
        if (b2 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b2.getWindowVisibleDisplayFrame(this.f1366e);
        Rect rect = this.f1366e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1362a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1366e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b2.getLocationOnScreen(this.f1368g);
        view.getLocationOnScreen(this.f1367f);
        int[] iArr = this.f1367f;
        int i6 = iArr[0];
        int[] iArr2 = this.f1368g;
        int i7 = i6 - iArr2[0];
        iArr[0] = i7;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i7 + i2) - (b2.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1363b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1363b.getMeasuredHeight();
        int i8 = this.f1367f[1];
        int i9 = ((i4 + i8) - dimensionPixelOffset3) - measuredHeight;
        int i10 = i8 + i5 + dimensionPixelOffset3;
        if (z2) {
            if (i9 >= 0) {
                layoutParams.y = i9;
            } else {
                layoutParams.y = i10;
            }
        } else if (measuredHeight + i10 <= this.f1366e.height()) {
            layoutParams.y = i10;
        } else {
            layoutParams.y = i9;
        }
    }

    public void c() {
        if (d()) {
            ((WindowManager) this.f1362a.getSystemService("window")).removeView(this.f1363b);
        }
    }

    public boolean d() {
        return this.f1363b.getParent() != null;
    }

    public void e(View view, int i2, int i3, boolean z2, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1364c.setText(charSequence);
        a(view, i2, i3, z2, this.f1365d);
        ((WindowManager) this.f1362a.getSystemService("window")).addView(this.f1363b, this.f1365d);
    }
}
