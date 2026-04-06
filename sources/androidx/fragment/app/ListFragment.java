package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ListFragment extends Fragment {
    public final Handler B0 = new Handler();
    public final Runnable C0 = new Runnable() {
        public void run() {
            ListView listView = ListFragment.this.F0;
            listView.focusableViewAvailable(listView);
        }
    };
    public final AdapterView.OnItemClickListener D0 = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
            ListFragment.this.Y1((ListView) adapterView, view, i2, j2);
        }
    };
    public ListAdapter E0;
    public ListView F0;
    public View G0;
    public TextView H0;
    public View I0;
    public View J0;
    public CharSequence K0;
    public boolean L0;

    public View D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context B1 = B1();
        FrameLayout frameLayout = new FrameLayout(B1);
        LinearLayout linearLayout = new LinearLayout(B1);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(B1, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(B1);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(B1);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(B1);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void G0() {
        this.B0.removeCallbacks(this.C0);
        this.F0 = null;
        this.L0 = false;
        this.J0 = null;
        this.I0 = null;
        this.G0 = null;
        this.H0 = null;
        super.G0();
    }

    public final void X1() {
        if (this.F0 == null) {
            View c0 = c0();
            if (c0 != null) {
                if (c0 instanceof ListView) {
                    this.F0 = (ListView) c0;
                } else {
                    TextView textView = (TextView) c0.findViewById(16711681);
                    this.H0 = textView;
                    if (textView == null) {
                        this.G0 = c0.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.I0 = c0.findViewById(16711682);
                    this.J0 = c0.findViewById(16711683);
                    View findViewById = c0.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.F0 = listView;
                        View view = this.G0;
                        if (view != null) {
                            listView.setEmptyView(view);
                        } else {
                            CharSequence charSequence = this.K0;
                            if (charSequence != null) {
                                this.H0.setText(charSequence);
                                this.F0.setEmptyView(this.H0);
                            }
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.L0 = true;
                this.F0.setOnItemClickListener(this.D0);
                ListAdapter listAdapter = this.E0;
                if (listAdapter != null) {
                    this.E0 = null;
                    Z1(listAdapter);
                } else if (this.I0 != null) {
                    a2(false, false);
                }
                this.B0.post(this.C0);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    public void Y0(View view, Bundle bundle) {
        super.Y0(view, bundle);
        X1();
    }

    public void Y1(ListView listView, View view, int i2, long j2) {
    }

    public void Z1(ListAdapter listAdapter) {
        boolean z2 = false;
        boolean z3 = this.E0 != null;
        this.E0 = listAdapter;
        ListView listView = this.F0;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.L0 && !z3) {
                if (C1().getWindowToken() != null) {
                    z2 = true;
                }
                a2(true, z2);
            }
        }
    }

    public final void a2(boolean z2, boolean z3) {
        X1();
        View view = this.I0;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.L0 != z2) {
            this.L0 = z2;
            if (z2) {
                if (z3) {
                    view.startAnimation(AnimationUtils.loadAnimation(u(), 17432577));
                    this.J0.startAnimation(AnimationUtils.loadAnimation(u(), 17432576));
                } else {
                    view.clearAnimation();
                    this.J0.clearAnimation();
                }
                this.I0.setVisibility(8);
                this.J0.setVisibility(0);
                return;
            }
            if (z3) {
                view.startAnimation(AnimationUtils.loadAnimation(u(), 17432576));
                this.J0.startAnimation(AnimationUtils.loadAnimation(u(), 17432577));
            } else {
                view.clearAnimation();
                this.J0.clearAnimation();
            }
            this.I0.setVisibility(0);
            this.J0.setVisibility(8);
        }
    }
}
