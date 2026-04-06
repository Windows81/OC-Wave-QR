package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R;
import androidx.fragment.app.strictmode.FragmentStrictMode;

class FragmentLayoutInflaterFactory implements LayoutInflater.Factory2 {

    /* renamed from: z  reason: collision with root package name */
    public final FragmentManager f21601z;

    public FragmentLayoutInflaterFactory(FragmentManager fragmentManager) {
        this.f21601z = fragmentManager;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        final FragmentStateManager fragmentStateManager;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f21601z);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f21481a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(R.styleable.f21482b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.f21483c, -1);
        String string = obtainStyledAttributes.getString(R.styleable.f21484d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !FragmentFactory.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f21601z.k0(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f21601z.l0(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f21601z.k0(id);
        }
        if (fragment == null) {
            fragment = this.f21601z.x0().a(context.getClassLoader(), attributeValue);
            fragment.N = true;
            fragment.W = resourceId != 0 ? resourceId : id;
            fragment.X = id;
            fragment.Y = string;
            fragment.O = true;
            FragmentManager fragmentManager = this.f21601z;
            fragment.S = fragmentManager;
            fragment.T = fragmentManager.A0();
            fragment.L0(this.f21601z.A0().l(), attributeSet, fragment.f21546A);
            fragmentStateManager = this.f21601z.j(fragment);
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!fragment.O) {
            fragment.O = true;
            FragmentManager fragmentManager2 = this.f21601z;
            fragment.S = fragmentManager2;
            fragment.T = fragmentManager2.A0();
            fragment.L0(this.f21601z.A0().l(), attributeSet, fragment.f21546A);
            fragmentStateManager = this.f21601z.y(fragment);
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        FragmentStrictMode.i(fragment, viewGroup);
        fragment.g0 = viewGroup;
        fragmentStateManager.m();
        fragmentStateManager.j();
        View view2 = fragment.h0;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.h0.getTag() == null) {
                fragment.h0.setTag(string);
            }
            fragment.h0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                public void onViewAttachedToWindow(View view) {
                    Fragment k2 = fragmentStateManager.k();
                    fragmentStateManager.m();
                    SpecialEffectsController.n((ViewGroup) k2.h0.getParent(), FragmentLayoutInflaterFactory.this.f21601z).j();
                }

                public void onViewDetachedFromWindow(View view) {
                }
            });
            return fragment.h0;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
