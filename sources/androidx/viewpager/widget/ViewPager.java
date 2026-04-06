package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    public static final int[] G0 = {16842931};
    public static final Comparator H0 = new Comparator<ItemInfo>() {
        /* renamed from: a */
        public int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            return itemInfo.f23086b - itemInfo2.f23086b;
        }
    };
    public static final Interpolator I0 = new Interpolator() {
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    public static final ViewPositionComparator J0 = new ViewPositionComparator();

    /* renamed from: A  reason: collision with root package name */
    public final ArrayList f23079A;
    public PageTransformer A0;

    /* renamed from: B  reason: collision with root package name */
    public final ItemInfo f23080B;
    public int B0;
    public final Rect C;
    public int C0;
    public PagerAdapter D;
    public ArrayList D0;
    public int E;
    public final Runnable E0;
    public int F;
    public int F0;
    public Parcelable G;
    public ClassLoader H;
    public Scroller I;
    public boolean J;
    public PagerObserver K;
    public int L;
    public Drawable M;
    public int N;
    public int O;
    public float P;
    public float Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean a0;
    public boolean b0;
    public int c0;
    public int d0;
    public int e0;
    public float f0;
    public float g0;
    public float h0;
    public float i0;
    public int j0;
    public VelocityTracker k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public boolean p0;
    public EdgeEffect q0;
    public EdgeEffect r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public int v0;
    public List w0;
    public OnPageChangeListener x0;
    public OnPageChangeListener y0;

    /* renamed from: z  reason: collision with root package name */
    public int f23081z;
    public List z0;

    /* renamed from: androidx.viewpager.widget.ViewPager$3  reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ViewPager f23082z;

        public void run() {
            this.f23082z.setScrollState(0);
            this.f23082z.C();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$4  reason: invalid class name */
    class AnonymousClass4 implements OnApplyWindowInsetsListener {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ ViewPager f23083A;

        /* renamed from: z  reason: collision with root package name */
        public final Rect f23084z;

        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            WindowInsetsCompat J = ViewCompat.J(view, windowInsetsCompat);
            if (J.p()) {
                return J;
            }
            Rect rect = this.f23084z;
            rect.left = J.j();
            rect.top = J.l();
            rect.right = J.k();
            rect.bottom = J.i();
            int childCount = this.f23083A.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                WindowInsetsCompat e2 = ViewCompat.e(this.f23083A.getChildAt(i2), J);
                rect.left = Math.min(e2.j(), rect.left);
                rect.top = Math.min(e2.l(), rect.top);
                rect.right = Math.min(e2.k(), rect.right);
                rect.bottom = Math.min(e2.i(), rect.bottom);
            }
            return J.r(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    public static class ItemInfo {

        /* renamed from: a  reason: collision with root package name */
        public Object f23085a;

        /* renamed from: b  reason: collision with root package name */
        public int f23086b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f23087c;

        /* renamed from: d  reason: collision with root package name */
        public float f23088d;

        /* renamed from: e  reason: collision with root package name */
        public float f23089e;
    }

    public class MyAccessibilityDelegate extends AccessibilityDelegateCompat {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ViewPager f23096d;

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            PagerAdapter pagerAdapter;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() == 4096 && (pagerAdapter = this.f23096d.D) != null) {
                accessibilityEvent.setItemCount(pagerAdapter.e());
                accessibilityEvent.setFromIndex(this.f23096d.E);
                accessibilityEvent.setToIndex(this.f23096d.E);
            }
        }

        public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.i0(ViewPager.class.getName());
            accessibilityNodeInfoCompat.H0(n());
            if (this.f23096d.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.a(4096);
            }
            if (this.f23096d.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.a(8192);
            }
        }

        public boolean j(View view, int i2, Bundle bundle) {
            if (super.j(view, i2, bundle)) {
                return true;
            }
            if (i2 != 4096) {
                if (i2 != 8192 || !this.f23096d.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = this.f23096d;
                viewPager.setCurrentItem(viewPager.E - 1);
                return true;
            } else if (!this.f23096d.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = this.f23096d;
                viewPager2.setCurrentItem(viewPager2.E + 1);
                return true;
            }
        }

        public final boolean n() {
            PagerAdapter pagerAdapter = this.f23096d.D;
            return pagerAdapter != null && pagerAdapter.e() > 1;
        }
    }

    public interface OnAdapterChangeListener {
        void b(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    public interface OnPageChangeListener {
        void a(int i2, float f2, int i3);

        void c(int i2);

        void d(int i2);
    }

    public interface PageTransformer {
        void a(View view, float f2);
    }

    public class PagerObserver extends DataSetObserver {
        public PagerObserver() {
        }

        public void onChanged() {
            ViewPager.this.g();
        }

        public void onInvalidated() {
            ViewPager.this.g();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* renamed from: B  reason: collision with root package name */
        public int f23098B;
        public Parcelable C;
        public ClassLoader D;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f23098B + "}";
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f23098B);
            parcel.writeParcelable(this.C, i2);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f23098B = parcel.readInt();
            this.C = parcel.readParcelable(classLoader);
            this.D = classLoader;
        }
    }

    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        public void a(int i2, float f2, int i3) {
        }

        public void c(int i2) {
        }

        public void d(int i2) {
        }
    }

    public static class ViewPositionComparator implements Comparator<View> {
        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z2 = layoutParams.f23090a;
            return z2 != layoutParams2.f23090a ? z2 ? 1 : -1 : layoutParams.f23094e - layoutParams2.f23094e;
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.U != z2) {
            this.U = z2;
        }
    }

    public static boolean u(View view) {
        return view.getClass().getAnnotation(DecorView.class) != null;
    }

    public final boolean A(int i2) {
        if (this.f23079A.size() != 0) {
            ItemInfo s2 = s();
            int clientWidth = getClientWidth();
            int i3 = this.L;
            int i4 = clientWidth + i3;
            float f2 = (float) clientWidth;
            int i5 = s2.f23086b;
            float f3 = ((((float) i2) / f2) - s2.f23089e) / (s2.f23088d + (((float) i3) / f2));
            this.u0 = false;
            w(i5, f3, (int) (((float) i4) * f3));
            if (this.u0) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.s0) {
            return false;
        } else {
            this.u0 = false;
            w(0, 0.0f, 0);
            if (this.u0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public final boolean B(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.f0 - f2;
        this.f0 = f2;
        float scrollX = ((float) getScrollX()) + f3;
        float clientWidth = (float) getClientWidth();
        float f4 = this.P * clientWidth;
        float f5 = this.Q * clientWidth;
        boolean z4 = false;
        ItemInfo itemInfo = (ItemInfo) this.f23079A.get(0);
        ArrayList arrayList = this.f23079A;
        ItemInfo itemInfo2 = (ItemInfo) arrayList.get(arrayList.size() - 1);
        if (itemInfo.f23086b != 0) {
            f4 = itemInfo.f23089e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (itemInfo2.f23086b != this.D.e() - 1) {
            f5 = itemInfo2.f23089e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f4) {
            if (z2) {
                this.q0.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z3) {
                this.r0.onPull(Math.abs(scrollX - f5) / clientWidth);
                z4 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.f0 += scrollX - ((float) i2);
        scrollTo(i2, getScrollY());
        A(i2);
        return z4;
    }

    public void C() {
        D(this.E);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.E
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$ItemInfo r2 = r0.t(r2)
            r0.E = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            androidx.viewpager.widget.PagerAdapter r1 = r0.D
            if (r1 != 0) goto L_0x0018
            r17.P()
            return
        L_0x0018:
            boolean r1 = r0.V
            if (r1 == 0) goto L_0x0020
            r17.P()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            androidx.viewpager.widget.PagerAdapter r1 = r0.D
            r1.s(r0)
            int r1 = r0.W
            int r4 = r0.E
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            androidx.viewpager.widget.PagerAdapter r6 = r0.D
            int r6 = r6.e()
            int r7 = r6 + -1
            int r8 = r0.E
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f23081z
            if (r6 != r7) goto L_0x020f
            r7 = r5
        L_0x004a:
            java.util.ArrayList r8 = r0.f23079A
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList r8 = r0.f23079A
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$ItemInfo r8 = (androidx.viewpager.widget.ViewPager.ItemInfo) r8
            int r9 = r8.f23086b
            int r10 = r0.E
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.E
            androidx.viewpager.widget.ViewPager$ItemInfo r8 = r0.a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x019c
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList r11 = r0.f23079A
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$ItemInfo r11 = (androidx.viewpager.widget.ViewPager.ItemInfo) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r14 = r9
            goto L_0x0098
        L_0x008c:
            float r14 = r8.f23088d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x0098:
            int r3 = r0.E
            int r3 = r3 + -1
            r15 = r9
        L_0x009d:
            if (r3 < 0) goto L_0x00fe
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00ce
            if (r3 >= r4) goto L_0x00ce
            if (r11 != 0) goto L_0x00a8
            goto L_0x00fe
        L_0x00a8:
            int r5 = r11.f23086b
            if (r3 != r5) goto L_0x00fa
            boolean r5 = r11.f23087c
            if (r5 != 0) goto L_0x00fa
            java.util.ArrayList r5 = r0.f23079A
            r5.remove(r10)
            androidx.viewpager.widget.PagerAdapter r5 = r0.D
            java.lang.Object r11 = r11.f23085a
            r5.b(r0, r3, r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00cb
            java.util.ArrayList r5 = r0.f23079A
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto L_0x00cc
        L_0x00cb:
            r5 = 0
        L_0x00cc:
            r11 = r5
            goto L_0x00fa
        L_0x00ce:
            if (r11 == 0) goto L_0x00e4
            int r5 = r11.f23086b
            if (r3 != r5) goto L_0x00e4
            float r5 = r11.f23088d
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00cb
            java.util.ArrayList r5 = r0.f23079A
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto L_0x00cc
        L_0x00e4:
            int r5 = r10 + 1
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = r0.a(r3, r5)
            float r5 = r5.f23088d
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00cb
            java.util.ArrayList r5 = r0.f23079A
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto L_0x00cc
        L_0x00fa:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x009d
        L_0x00fe:
            float r3 = r8.f23088d
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0190
            java.util.ArrayList r5 = r0.f23079A
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0117
            java.util.ArrayList r5 = r0.f23079A
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto L_0x0118
        L_0x0117:
            r5 = 0
        L_0x0118:
            if (r12 > 0) goto L_0x011c
            r10 = r9
            goto L_0x0124
        L_0x011c:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0124:
            int r11 = r0.E
        L_0x0126:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0190
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x015a
            if (r11 <= r1) goto L_0x015a
            if (r5 != 0) goto L_0x0133
            goto L_0x0190
        L_0x0133:
            int r12 = r5.f23086b
            if (r11 != r12) goto L_0x018f
            boolean r12 = r5.f23087c
            if (r12 != 0) goto L_0x018f
            java.util.ArrayList r12 = r0.f23079A
            r12.remove(r4)
            androidx.viewpager.widget.PagerAdapter r12 = r0.D
            java.lang.Object r5 = r5.f23085a
            r12.b(r0, r11, r5)
            java.util.ArrayList r5 = r0.f23079A
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0158
            java.util.ArrayList r5 = r0.f23079A
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto L_0x018f
        L_0x0158:
            r5 = 0
            goto L_0x018f
        L_0x015a:
            if (r5 == 0) goto L_0x0176
            int r12 = r5.f23086b
            if (r11 != r12) goto L_0x0176
            float r5 = r5.f23088d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList r5 = r0.f23079A
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0158
            java.util.ArrayList r5 = r0.f23079A
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto L_0x018f
        L_0x0176:
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = r0.a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f23088d
            float r3 = r3 + r5
            java.util.ArrayList r5 = r0.f23079A
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0158
            java.util.ArrayList r5 = r0.f23079A
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
        L_0x018f:
            goto L_0x0126
        L_0x0190:
            r0.d(r8, r7, r2)
            androidx.viewpager.widget.PagerAdapter r1 = r0.D
            int r2 = r0.E
            java.lang.Object r3 = r8.f23085a
            r1.p(r0, r2, r3)
        L_0x019c:
            androidx.viewpager.widget.PagerAdapter r1 = r0.D
            r1.d(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01a6:
            if (r2 >= r1) goto L_0x01cf
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r4 = (androidx.viewpager.widget.ViewPager.LayoutParams) r4
            r4.f23095f = r2
            boolean r5 = r4.f23090a
            if (r5 != 0) goto L_0x01cc
            float r5 = r4.f23092c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01cc
            androidx.viewpager.widget.ViewPager$ItemInfo r3 = r0.r(r3)
            if (r3 == 0) goto L_0x01cc
            float r5 = r3.f23088d
            r4.f23092c = r5
            int r3 = r3.f23086b
            r4.f23094e = r3
        L_0x01cc:
            int r2 = r2 + 1
            goto L_0x01a6
        L_0x01cf:
            r17.P()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x020e
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01e3
            androidx.viewpager.widget.ViewPager$ItemInfo r3 = r0.q(r1)
            goto L_0x01e4
        L_0x01e3:
            r3 = 0
        L_0x01e4:
            if (r3 == 0) goto L_0x01ec
            int r1 = r3.f23086b
            int r2 = r0.E
            if (r1 == r2) goto L_0x020e
        L_0x01ec:
            r5 = 0
        L_0x01ed:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x020e
            android.view.View r1 = r0.getChildAt(r5)
            androidx.viewpager.widget.ViewPager$ItemInfo r2 = r0.r(r1)
            if (r2 == 0) goto L_0x020b
            int r2 = r2.f23086b
            int r3 = r0.E
            if (r2 != r3) goto L_0x020b
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x020b
            goto L_0x020e
        L_0x020b:
            int r5 = r5 + 1
            goto L_0x01ed
        L_0x020e:
            return
        L_0x020f:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x021c }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x021c }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x021c }
            goto L_0x0224
        L_0x021c:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0224:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f23081z
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            androidx.viewpager.widget.PagerAdapter r1 = r0.D
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.D(int):void");
    }

    public final void E(int i2, int i3, int i4, int i5) {
        if (i3 <= 0 || this.f23079A.isEmpty()) {
            ItemInfo t2 = t(this.E);
            int min = (int) ((t2 != null ? Math.min(t2.f23089e, this.Q) : 0.0f) * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                f(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.I.isFinished()) {
            this.I.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))) * ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))), getScrollY());
        }
    }

    public final void F() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f23090a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    public void G(OnAdapterChangeListener onAdapterChangeListener) {
        List list = this.z0;
        if (list != null) {
            list.remove(onAdapterChangeListener);
        }
    }

    public final void H(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    public final boolean I() {
        this.j0 = -1;
        n();
        this.q0.onRelease();
        this.r0.onRelease();
        return this.q0.isFinished() || this.r0.isFinished();
    }

    public final void J(int i2, boolean z2, int i3, boolean z3) {
        ItemInfo t2 = t(i2);
        int clientWidth = t2 != null ? (int) (((float) getClientWidth()) * Math.max(this.P, Math.min(t2.f23089e, this.Q))) : 0;
        if (z2) {
            O(clientWidth, 0, i3);
            if (z3) {
                j(i2);
                return;
            }
            return;
        }
        if (z3) {
            j(i2);
        }
        f(false);
        scrollTo(clientWidth, 0);
        A(clientWidth);
    }

    public void K(int i2, boolean z2) {
        this.V = false;
        L(i2, z2, false);
    }

    public void L(int i2, boolean z2, boolean z3) {
        M(i2, z2, z3, 0);
    }

    public void M(int i2, boolean z2, boolean z3, int i3) {
        PagerAdapter pagerAdapter = this.D;
        boolean z4 = false;
        if (pagerAdapter == null || pagerAdapter.e() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.E != i2 || this.f23079A.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.D.e()) {
                i2 = this.D.e() - 1;
            }
            int i4 = this.W;
            int i5 = this.E;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.f23079A.size(); i6++) {
                    ((ItemInfo) this.f23079A.get(i6)).f23087c = true;
                }
            }
            if (this.E != i2) {
                z4 = true;
            }
            if (this.s0) {
                this.E = i2;
                if (z4) {
                    j(i2);
                }
                requestLayout();
                return;
            }
            D(i2);
            J(i2, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public OnPageChangeListener N(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.y0;
        this.y0 = onPageChangeListener;
        return onPageChangeListener2;
    }

    public void O(int i2, int i3, int i4) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.I;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.J ? this.I.getCurrX() : this.I.getStartX();
            this.I.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            f(false);
            C();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = (float) clientWidth;
        float f3 = (float) i8;
        float l2 = f3 + (l(Math.min(1.0f, (((float) Math.abs(i6)) * 1.0f) / f2)) * f3);
        int abs = Math.abs(i4);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(l2 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i6)) / ((f2 * this.D.h(this.E)) + ((float) this.L))) + 1.0f) * 100.0f), 600);
        this.J = false;
        this.I.startScroll(i5, scrollY, i6, i7, min);
        ViewCompat.O(this);
    }

    public final void P() {
        if (this.C0 != 0) {
            ArrayList arrayList = this.D0;
            if (arrayList == null) {
                this.D0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.D0.add(getChildAt(i2));
            }
            Collections.sort(this.D0, J0);
        }
    }

    public ItemInfo a(int i2, int i3) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.f23086b = i2;
        itemInfo.f23085a = this.D.j(this, i2);
        itemInfo.f23088d = this.D.h(i2);
        if (i3 < 0 || i3 >= this.f23079A.size()) {
            this.f23079A.add(itemInfo);
        } else {
            this.f23079A.add(i3, itemInfo);
        }
        return itemInfo;
    }

    public void addFocusables(ArrayList arrayList, int i2, int i3) {
        ItemInfo r2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (r2 = r(childAt)) != null && r2.f23086b == this.E) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList arrayList) {
        ItemInfo r2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (r2 = r(childAt)) != null && r2.f23086b == this.E) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean u2 = layoutParams2.f23090a | u(view);
        layoutParams2.f23090a = u2;
        if (!this.T) {
            super.addView(view, i2, layoutParams);
        } else if (!u2) {
            layoutParams2.f23093d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void b(OnAdapterChangeListener onAdapterChangeListener) {
        if (this.z0 == null) {
            this.z0 = new ArrayList();
        }
        this.z0.add(onAdapterChangeListener);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x0063
        L_0x0009:
            if (r0 == 0) goto L_0x0063
            android.view.ViewParent r2 = r0.getParent()
        L_0x000f:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x001b
            if (r2 != r4) goto L_0x0016
            goto L_0x0063
        L_0x0016:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x000f
        L_0x001b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L_0x002f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0048
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x002f
        L_0x0048:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L_0x0007
        L_0x0063:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto L_0x00b3
            if (r1 == r0) goto L_0x00b3
            if (r5 != r3) goto L_0x0093
            android.graphics.Rect r2 = r4.C
            android.graphics.Rect r2 = r4.p(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.C
            android.graphics.Rect r3 = r4.p(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L_0x008e
            if (r2 < r3) goto L_0x008e
            boolean r0 = r4.y()
            goto L_0x00ca
        L_0x008e:
            boolean r0 = r1.requestFocus()
            goto L_0x00ca
        L_0x0093:
            if (r5 != r2) goto L_0x00bf
            android.graphics.Rect r2 = r4.C
            android.graphics.Rect r2 = r4.p(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.C
            android.graphics.Rect r3 = r4.p(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L_0x00ae
            if (r2 > r3) goto L_0x00ae
            boolean r0 = r4.z()
            goto L_0x00ca
        L_0x00ae:
            boolean r0 = r1.requestFocus()
            goto L_0x00ca
        L_0x00b3:
            if (r5 == r3) goto L_0x00c6
            r0 = 1
            if (r5 != r0) goto L_0x00b9
            goto L_0x00c6
        L_0x00b9:
            if (r5 == r2) goto L_0x00c1
            r0 = 2
            if (r5 != r0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            r0 = 0
            goto L_0x00ca
        L_0x00c1:
            boolean r0 = r4.z()
            goto L_0x00ca
        L_0x00c6:
            boolean r0 = r4.y()
        L_0x00ca:
            if (r0 == 0) goto L_0x00d3
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        L_0x00d3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.D == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.P)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.Q));
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.J = true;
        if (this.I.isFinished() || !this.I.computeScrollOffset()) {
            f(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.I.getCurrX();
        int currY = this.I.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!A(currX)) {
                this.I.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.O(this);
    }

    public final void d(ItemInfo itemInfo, int i2, ItemInfo itemInfo2) {
        int i3;
        int i4;
        ItemInfo itemInfo3;
        ItemInfo itemInfo4;
        int e2 = this.D.e();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.L) / ((float) clientWidth) : 0.0f;
        if (itemInfo2 != null) {
            int i5 = itemInfo2.f23086b;
            int i6 = itemInfo.f23086b;
            if (i5 < i6) {
                float f3 = itemInfo2.f23089e + itemInfo2.f23088d + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= itemInfo.f23086b && i8 < this.f23079A.size()) {
                    Object obj = this.f23079A.get(i8);
                    while (true) {
                        itemInfo4 = (ItemInfo) obj;
                        if (i7 > itemInfo4.f23086b && i8 < this.f23079A.size() - 1) {
                            i8++;
                            obj = this.f23079A.get(i8);
                        }
                    }
                    while (i7 < itemInfo4.f23086b) {
                        f3 += this.D.h(i7) + f2;
                        i7++;
                    }
                    itemInfo4.f23089e = f3;
                    f3 += itemInfo4.f23088d + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.f23079A.size() - 1;
                float f4 = itemInfo2.f23089e;
                while (true) {
                    i5--;
                    if (i5 < itemInfo.f23086b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f23079A.get(size);
                    while (true) {
                        itemInfo3 = (ItemInfo) obj2;
                        if (i5 < itemInfo3.f23086b && size > 0) {
                            size--;
                            obj2 = this.f23079A.get(size);
                        }
                    }
                    while (i5 > itemInfo3.f23086b) {
                        f4 -= this.D.h(i5) + f2;
                        i5--;
                    }
                    f4 -= itemInfo3.f23088d + f2;
                    itemInfo3.f23089e = f4;
                }
            }
        }
        int size2 = this.f23079A.size();
        float f5 = itemInfo.f23089e;
        int i9 = itemInfo.f23086b;
        int i10 = i9 - 1;
        this.P = i9 == 0 ? f5 : -3.4028235E38f;
        int i11 = e2 - 1;
        this.Q = i9 == i11 ? (itemInfo.f23088d + f5) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            ItemInfo itemInfo5 = (ItemInfo) this.f23079A.get(i12);
            while (true) {
                i4 = itemInfo5.f23086b;
                if (i10 <= i4) {
                    break;
                }
                f5 -= this.D.h(i10) + f2;
                i10--;
            }
            f5 -= itemInfo5.f23088d + f2;
            itemInfo5.f23089e = f5;
            if (i4 == 0) {
                this.P = f5;
            }
            i12--;
            i10--;
        }
        float f6 = itemInfo.f23089e + itemInfo.f23088d + f2;
        int i13 = itemInfo.f23086b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            ItemInfo itemInfo6 = (ItemInfo) this.f23079A.get(i14);
            while (true) {
                i3 = itemInfo6.f23086b;
                if (i13 >= i3) {
                    break;
                }
                f6 += this.D.h(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.Q = (itemInfo6.f23088d + f6) - 1.0f;
            }
            itemInfo6.f23089e = f6;
            f6 += itemInfo6.f23088d + f2;
            i14++;
            i13++;
        }
        this.t0 = false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || o(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ItemInfo r2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (r2 = r(childAt)) != null && r2.f23086b == this.E && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.D) != null && pagerAdapter.e() > 1)) {
            if (!this.q0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.P * ((float) width));
                this.q0.setSize(height, width);
                z2 = this.q0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.r0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.Q + 1.0f)) * ((float) width2));
                this.r0.setSize(height2, width2);
                z2 |= this.r0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.q0.finish();
            this.r0.finish();
        }
        if (z2) {
            ViewCompat.O(this);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.M;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public boolean e(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom()) {
                    if (e(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z2 && view.canScrollHorizontally(-i2);
    }

    public final void f(boolean z2) {
        boolean z3 = this.F0 == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.I.isFinished()) {
                this.I.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.I.getCurrX();
                int currY = this.I.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A(currX);
                    }
                }
            }
        }
        this.V = false;
        for (int i2 = 0; i2 < this.f23079A.size(); i2++) {
            ItemInfo itemInfo = (ItemInfo) this.f23079A.get(i2);
            if (itemInfo.f23087c) {
                itemInfo.f23087c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z2) {
            ViewCompat.P(this, this.E0);
        } else {
            this.E0.run();
        }
    }

    public void g() {
        int e2 = this.D.e();
        this.f23081z = e2;
        boolean z2 = this.f23079A.size() < (this.W * 2) + 1 && this.f23079A.size() < e2;
        int i2 = this.E;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.f23079A.size()) {
            ItemInfo itemInfo = (ItemInfo) this.f23079A.get(i3);
            int f2 = this.D.f(itemInfo.f23085a);
            if (f2 != -1) {
                if (f2 == -2) {
                    this.f23079A.remove(i3);
                    i3--;
                    if (!z3) {
                        this.D.s(this);
                        z3 = true;
                    }
                    this.D.b(this, itemInfo.f23086b, itemInfo.f23085a);
                    int i4 = this.E;
                    if (i4 == itemInfo.f23086b) {
                        i2 = Math.max(0, Math.min(i4, e2 - 1));
                    }
                } else {
                    int i5 = itemInfo.f23086b;
                    if (i5 != f2) {
                        if (i5 == this.E) {
                            i2 = f2;
                        }
                        itemInfo.f23086b = f2;
                    }
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.D.d(this);
        }
        Collections.sort(this.f23079A, H0);
        if (z2) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i6).getLayoutParams();
                if (!layoutParams.f23090a) {
                    layoutParams.f23092c = 0.0f;
                }
            }
            L(i2, false, true);
            requestLayout();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public PagerAdapter getAdapter() {
        return this.D;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        if (this.C0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((LayoutParams) ((View) this.D0.get(i3)).getLayoutParams()).f23095f;
    }

    public int getCurrentItem() {
        return this.E;
    }

    public int getOffscreenPageLimit() {
        return this.W;
    }

    public int getPageMargin() {
        return this.L;
    }

    public final int h(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.n0 || Math.abs(i3) <= this.l0) {
            i2 += (int) (f2 + (i2 >= this.E ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f23079A.size() <= 0) {
            return i2;
        }
        ArrayList arrayList = this.f23079A;
        return Math.max(((ItemInfo) this.f23079A.get(0)).f23086b, Math.min(i2, ((ItemInfo) arrayList.get(arrayList.size() - 1)).f23086b));
    }

    public final void i(int i2, float f2, int i3) {
        OnPageChangeListener onPageChangeListener = this.x0;
        if (onPageChangeListener != null) {
            onPageChangeListener.a(i2, f2, i3);
        }
        List list = this.w0;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.w0.get(i4);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.a(i2, f2, i3);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.y0;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.a(i2, f2, i3);
        }
    }

    public final void j(int i2) {
        OnPageChangeListener onPageChangeListener = this.x0;
        if (onPageChangeListener != null) {
            onPageChangeListener.d(i2);
        }
        List list = this.w0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.w0.get(i3);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.d(i2);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.y0;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.d(i2);
        }
    }

    public final void k(int i2) {
        OnPageChangeListener onPageChangeListener = this.x0;
        if (onPageChangeListener != null) {
            onPageChangeListener.c(i2);
        }
        List list = this.w0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.w0.get(i3);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.c(i2);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.y0;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.c(i2);
        }
    }

    public float l(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    public final void m(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z2 ? this.B0 : 0, (Paint) null);
        }
    }

    public final void n() {
        this.a0 = false;
        this.b0 = false;
        VelocityTracker velocityTracker = this.k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.k0 = null;
        }
    }

    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? y() : c(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? z() : c(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return c(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return c(1);
                }
            }
        }
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s0 = true;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.E0);
        Scroller scroller = this.I;
        if (scroller != null && !scroller.isFinished()) {
            this.I.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.L
            if (r1 <= 0) goto L_0x00a8
            android.graphics.drawable.Drawable r1 = r0.M
            if (r1 == 0) goto L_0x00a8
            java.util.ArrayList r1 = r0.f23079A
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00a8
            androidx.viewpager.widget.PagerAdapter r1 = r0.D
            if (r1 == 0) goto L_0x00a8
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.L
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList r5 = r0.f23079A
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            float r7 = r5.f23089e
            java.util.ArrayList r8 = r0.f23079A
            int r8 = r8.size()
            int r9 = r5.f23086b
            java.util.ArrayList r10 = r0.f23079A
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.ViewPager$ItemInfo r10 = (androidx.viewpager.widget.ViewPager.ItemInfo) r10
            int r10 = r10.f23086b
        L_0x0045:
            if (r9 >= r10) goto L_0x00a8
        L_0x0047:
            int r11 = r5.f23086b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList r5 = r0.f23079A
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0064
            float r7 = r5.f23089e
            float r11 = r5.f23088d
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L_0x006f
        L_0x0064:
            androidx.viewpager.widget.PagerAdapter r11 = r0.D
            float r11 = r11.h(r9)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r7 = r7 + r11
        L_0x006f:
            int r11 = r0.L
            float r11 = (float) r11
            float r11 = r11 + r12
            float r13 = (float) r1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0097
            android.graphics.drawable.Drawable r11 = r0.M
            int r13 = java.lang.Math.round(r12)
            int r14 = r0.N
            int r15 = r0.L
            float r15 = (float) r15
            float r15 = r15 + r12
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.O
            r11.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.M
            r11 = r18
            r3.draw(r11)
            goto L_0x009b
        L_0x0097:
            r11 = r18
            r16 = r3
        L_0x009b:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a3
            goto L_0x00a8
        L_0x00a3:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            I();
            return false;
        }
        if (action != 0) {
            if (this.a0) {
                return true;
            }
            if (this.b0) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.h0 = x2;
            this.f0 = x2;
            float y2 = motionEvent.getY();
            this.i0 = y2;
            this.g0 = y2;
            this.j0 = motionEvent2.getPointerId(0);
            this.b0 = false;
            this.J = true;
            this.I.computeScrollOffset();
            if (this.F0 != 2 || Math.abs(this.I.getFinalX() - this.I.getCurrX()) <= this.o0) {
                f(false);
                this.a0 = false;
            } else {
                this.I.abortAnimation();
                this.V = false;
                C();
                this.a0 = true;
                H(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.j0;
            if (i2 != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i2);
                float x3 = motionEvent2.getX(findPointerIndex);
                float f2 = x3 - this.f0;
                float abs = Math.abs(f2);
                float y3 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.i0);
                int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i3 != 0 && !v(this.f0, f2)) {
                    if (e(this, false, (int) f2, (int) x3, (int) y3)) {
                        this.f0 = x3;
                        this.g0 = y3;
                        this.b0 = true;
                        return false;
                    }
                }
                int i4 = this.e0;
                if (abs > ((float) i4) && abs * 0.5f > abs2) {
                    this.a0 = true;
                    H(true);
                    setScrollState(1);
                    float f3 = this.h0;
                    float f4 = (float) this.e0;
                    this.f0 = i3 > 0 ? f3 + f4 : f3 - f4;
                    this.g0 = y3;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i4)) {
                    this.b0 = true;
                }
                if (this.a0 && B(x3)) {
                    ViewCompat.O(this);
                }
            }
        } else if (action == 6) {
            x(motionEvent);
        }
        if (this.k0 == null) {
            this.k0 = VelocityTracker.obtain();
        }
        this.k0.addMovement(motionEvent2);
        return this.a0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b8
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b4
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r12 = (androidx.viewpager.widget.ViewPager.LayoutParams) r12
            boolean r14 = r12.f23090a
            if (r14 == 0) goto L_0x00b4
            int r12 = r12.f23091b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x0061
            r15 = 3
            if (r14 == r15) goto L_0x005b
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006e
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
        L_0x0055:
            r17 = r14
            r14 = r4
            r4 = r17
            goto L_0x006e
        L_0x005b:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006e
        L_0x0061:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
            goto L_0x0055
        L_0x006e:
            r15 = 16
            if (r12 == r15) goto L_0x0094
            r15 = 48
            if (r12 == r15) goto L_0x008e
            r15 = 80
            if (r12 == r15) goto L_0x007c
            r12 = r5
            goto L_0x00a1
        L_0x007c:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
        L_0x0088:
            r17 = r12
            r12 = r5
            r5 = r17
            goto L_0x00a1
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x00a1
        L_0x0094:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
            goto L_0x0088
        L_0x00a1:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b4:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b8:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00bb:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f23090a
            if (r10 != 0) goto L_0x0105
            androidx.viewpager.widget.ViewPager$ItemInfo r10 = r0.r(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f23089e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f23093d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f23093d = r14
            float r9 = r9.f23092c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00bb
        L_0x0108:
            r0.N = r5
            int r3 = r3 - r7
            r0.O = r3
            r0.v0 = r11
            boolean r1 = r0.s0
            if (r1 == 0) goto L_0x011a
            int r1 = r0.E
            r2 = 0
            r0.J(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.s0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i4;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.d0 = Math.min(measuredWidth / 10, this.c0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            boolean z2 = true;
            int i6 = 1073741824;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (!(childAt.getVisibility() == 8 || (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) == null || !layoutParams2.f23090a)) {
                int i7 = layoutParams2.f23091b;
                int i8 = i7 & 7;
                int i9 = i7 & 112;
                boolean z3 = i9 == 48 || i9 == 80;
                if (!(i8 == 3 || i8 == 5)) {
                    z2 = false;
                }
                int i10 = Integer.MIN_VALUE;
                if (z3) {
                    i4 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i4 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i11 = layoutParams2.width;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingLeft;
                    }
                    i10 = 1073741824;
                } else {
                    i11 = paddingLeft;
                }
                int i12 = layoutParams2.height;
                if (i12 == -2) {
                    i12 = measuredHeight;
                    i6 = i4;
                } else if (i12 == -1) {
                    i12 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i12, i6));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        this.R = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.S = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.T = true;
        C();
        this.T = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f23090a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * layoutParams.f23092c), 1073741824), this.S);
            }
        }
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        ItemInfo r2;
        int childCount = getChildCount();
        if ((i2 & 2) != 0) {
            i4 = childCount;
            i5 = 0;
            i3 = 1;
        } else {
            i5 = childCount - 1;
            i4 = -1;
            i3 = -1;
        }
        while (i5 != i4) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && (r2 = r(childAt)) != null && r2.f23086b == this.E && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i5 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        PagerAdapter pagerAdapter = this.D;
        if (pagerAdapter != null) {
            pagerAdapter.m(savedState.C, savedState.D);
            L(savedState.f23098B, false, true);
            return;
        }
        this.F = savedState.f23098B;
        this.G = savedState.C;
        this.H = savedState.D;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23098B = this.E;
        PagerAdapter pagerAdapter = this.D;
        if (pagerAdapter != null) {
            savedState.C = pagerAdapter.n();
        }
        return savedState;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.L;
            E(i2, i4, i6, i6);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        if (this.p0) {
            return true;
        }
        boolean z2 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.D) == null || pagerAdapter.e() == 0) {
            return false;
        }
        if (this.k0 == null) {
            this.k0 = VelocityTracker.obtain();
        }
        this.k0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.I.abortAnimation();
            this.V = false;
            C();
            float x2 = motionEvent.getX();
            this.h0 = x2;
            this.f0 = x2;
            float y2 = motionEvent.getY();
            this.i0 = y2;
            this.g0 = y2;
            this.j0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.a0) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.j0);
                    if (findPointerIndex == -1) {
                        z2 = I();
                    } else {
                        float x3 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x3 - this.f0);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y3 - this.g0);
                        if (abs > ((float) this.e0) && abs > abs2) {
                            this.a0 = true;
                            H(true);
                            float f2 = this.h0;
                            this.f0 = x3 - f2 > 0.0f ? f2 + ((float) this.e0) : f2 - ((float) this.e0);
                            this.g0 = y3;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.a0) {
                    z2 = B(motionEvent.getX(motionEvent.findPointerIndex(this.j0)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f0 = motionEvent.getX(actionIndex);
                    this.j0 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    x(motionEvent);
                    this.f0 = motionEvent.getX(motionEvent.findPointerIndex(this.j0));
                }
            } else if (this.a0) {
                J(this.E, true, 0, false);
                z2 = I();
            }
        } else if (this.a0) {
            VelocityTracker velocityTracker = this.k0;
            velocityTracker.computeCurrentVelocity(1000, (float) this.m0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.j0);
            this.V = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ItemInfo s2 = s();
            float f3 = (float) clientWidth;
            M(h(s2.f23086b, ((((float) scrollX) / f3) - s2.f23089e) / (s2.f23088d + (((float) this.L) / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.j0)) - this.h0)), true, true, xVelocity);
            z2 = I();
        }
        if (z2) {
            ViewCompat.O(this);
        }
        return true;
    }

    public final Rect p(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public ItemInfo q(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return r(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public ItemInfo r(View view) {
        for (int i2 = 0; i2 < this.f23079A.size(); i2++) {
            ItemInfo itemInfo = (ItemInfo) this.f23079A.get(i2);
            if (this.D.k(view, itemInfo.f23085a)) {
                return itemInfo;
            }
        }
        return null;
    }

    public void removeView(View view) {
        if (this.T) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final ItemInfo s() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f3 = clientWidth > 0 ? ((float) this.L) / ((float) clientWidth) : 0.0f;
        int i3 = 0;
        boolean z2 = true;
        ItemInfo itemInfo = null;
        int i4 = -1;
        float f4 = 0.0f;
        while (i3 < this.f23079A.size()) {
            ItemInfo itemInfo2 = (ItemInfo) this.f23079A.get(i3);
            if (!z2 && itemInfo2.f23086b != (i2 = i4 + 1)) {
                itemInfo2 = this.f23080B;
                itemInfo2.f23089e = f2 + f4 + f3;
                itemInfo2.f23086b = i2;
                itemInfo2.f23088d = this.D.h(i2);
                i3--;
            }
            ItemInfo itemInfo3 = itemInfo2;
            f2 = itemInfo3.f23089e;
            float f5 = itemInfo3.f23088d + f2 + f3;
            if (!z2 && scrollX < f2) {
                return itemInfo;
            }
            if (scrollX < f5 || i3 == this.f23079A.size() - 1) {
                return itemInfo3;
            }
            int i5 = itemInfo3.f23086b;
            float f6 = itemInfo3.f23088d;
            i3++;
            z2 = false;
            ItemInfo itemInfo4 = itemInfo3;
            i4 = i5;
            f4 = f6;
            itemInfo = itemInfo4;
        }
        return itemInfo;
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.D;
        if (pagerAdapter2 != null) {
            pagerAdapter2.q((DataSetObserver) null);
            this.D.s(this);
            for (int i2 = 0; i2 < this.f23079A.size(); i2++) {
                ItemInfo itemInfo = (ItemInfo) this.f23079A.get(i2);
                this.D.b(this, itemInfo.f23086b, itemInfo.f23085a);
            }
            this.D.d(this);
            this.f23079A.clear();
            F();
            this.E = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.D;
        this.D = pagerAdapter;
        this.f23081z = 0;
        if (pagerAdapter != null) {
            if (this.K == null) {
                this.K = new PagerObserver();
            }
            this.D.q(this.K);
            this.V = false;
            boolean z2 = this.s0;
            this.s0 = true;
            this.f23081z = this.D.e();
            if (this.F >= 0) {
                this.D.m(this.G, this.H);
                L(this.F, false, true);
                this.F = -1;
                this.G = null;
                this.H = null;
            } else if (!z2) {
                C();
            } else {
                requestLayout();
            }
        }
        List list = this.z0;
        if (list != null && !list.isEmpty()) {
            int size = this.z0.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((OnAdapterChangeListener) this.z0.get(i3)).b(this, pagerAdapter3, pagerAdapter);
            }
        }
    }

    public void setCurrentItem(int i2) {
        this.V = false;
        L(i2, !this.s0, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to " + 1);
            i2 = 1;
        }
        if (i2 != this.W) {
            this.W = i2;
            C();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.x0 = onPageChangeListener;
    }

    public void setPageMargin(int i2) {
        int i3 = this.L;
        this.L = i2;
        int width = getWidth();
        E(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.M = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.F0 != i2) {
            this.F0 = i2;
            if (this.A0 != null) {
                m(i2 != 0);
            }
            k(i2);
        }
    }

    public ItemInfo t(int i2) {
        for (int i3 = 0; i3 < this.f23079A.size(); i3++) {
            ItemInfo itemInfo = (ItemInfo) this.f23079A.get(i3);
            if (itemInfo.f23086b == i2) {
                return itemInfo;
            }
        }
        return null;
    }

    public final boolean v(float f2, float f3) {
        return (f2 < ((float) this.d0) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.d0)) && f3 < 0.0f);
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.M;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.v0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006c
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L_0x001b:
            if (r7 >= r6) goto L_0x006c
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f23090a
            if (r10 != 0) goto L_0x002c
            goto L_0x0069
        L_0x002c:
            int r9 = r9.f23091b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x0050
            r10 = 3
            if (r9 == r10) goto L_0x004a
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005d
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L_0x0046:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L_0x005d
        L_0x004a:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005d
        L_0x0050:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L_0x0046
        L_0x005d:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0068
            r8.offsetLeftAndRight(r3)
        L_0x0068:
            r3 = r9
        L_0x0069:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006c:
            r12.i(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$PageTransformer r13 = r12.A0
            if (r13 == 0) goto L_0x00a0
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007b:
            if (r1 >= r14) goto L_0x00a0
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.f23090a
            if (r0 == 0) goto L_0x008c
            goto L_0x009d
        L_0x008c:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$PageTransformer r3 = r12.A0
            r3.a(r15, r0)
        L_0x009d:
            int r1 = r1 + 1
            goto L_0x007b
        L_0x00a0:
            r12.u0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.w(int, float, int):void");
    }

    public final void x(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.j0) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f0 = motionEvent.getX(i2);
            this.j0 = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.k0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean y() {
        int i2 = this.E;
        if (i2 <= 0) {
            return false;
        }
        K(i2 - 1, true);
        return true;
    }

    public boolean z() {
        PagerAdapter pagerAdapter = this.D;
        if (pagerAdapter == null || this.E >= pagerAdapter.e() - 1) {
            return false;
        }
        K(this.E + 1, true);
        return true;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f23090a;

        /* renamed from: b  reason: collision with root package name */
        public int f23091b;

        /* renamed from: c  reason: collision with root package name */
        public float f23092c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public boolean f23093d;

        /* renamed from: e  reason: collision with root package name */
        public int f23094e;

        /* renamed from: f  reason: collision with root package name */
        public int f23095f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.G0);
            this.f23091b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(ContextCompat.e(getContext(), i2));
    }
}
