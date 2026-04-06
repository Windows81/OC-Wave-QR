package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.browser.R;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: A  reason: collision with root package name */
    public final int f1582A = getResources().getDimensionPixelOffset(R.dimen.f1553a);

    /* renamed from: z  reason: collision with root package name */
    public final int f1583z = getResources().getDimensionPixelOffset(R.dimen.f1554b);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1583z * 2), this.f1582A), 1073741824), i3);
    }
}
