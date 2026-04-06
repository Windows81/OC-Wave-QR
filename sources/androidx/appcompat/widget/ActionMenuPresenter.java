package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ActionProvider;
import java.util.ArrayList;

class ActionMenuPresenter extends BaseMenuPresenter implements ActionProvider.SubUiVisibilityListener {
    public OverflowMenuButton J;
    public Drawable K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public final SparseBooleanArray W = new SparseBooleanArray();
    public OverflowPopup X;
    public ActionButtonSubmenu Y;
    public OpenOverflowRunnable Z;
    public ActionMenuPopupCallback a0;
    public final PopupPresenterCallback b0 = new PopupPresenterCallback();
    public int c0;

    public class ActionButtonSubmenu extends MenuPopupHelper {
        public ActionButtonSubmenu(Context context, SubMenuBuilder subMenuBuilder, View view) {
            super(context, subMenuBuilder, view, false, R.attr.f307m);
            if (!((MenuItemImpl) subMenuBuilder.getItem()).l()) {
                View view2 = ActionMenuPresenter.this.J;
                f(view2 == null ? (View) ActionMenuPresenter.this.H : view2);
            }
            j(ActionMenuPresenter.this.b0);
        }

        public void e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.Y = null;
            actionMenuPresenter.c0 = 0;
            super.e();
        }
    }

    public class ActionMenuPopupCallback extends ActionMenuItemView.PopupCallback {
        public ActionMenuPopupCallback() {
        }

        public ShowableListMenu a() {
            ActionButtonSubmenu actionButtonSubmenu = ActionMenuPresenter.this.Y;
            if (actionButtonSubmenu != null) {
                return actionButtonSubmenu.c();
            }
            return null;
        }
    }

    public class OpenOverflowRunnable implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public OverflowPopup f1002z;

        public OpenOverflowRunnable(OverflowPopup overflowPopup) {
            this.f1002z = overflowPopup;
        }

        public void run() {
            if (ActionMenuPresenter.this.f859B != null) {
                ActionMenuPresenter.this.f859B.d();
            }
            View view = (View) ActionMenuPresenter.this.H;
            if (!(view == null || view.getWindowToken() == null || !this.f1002z.m())) {
                ActionMenuPresenter.this.X = this.f1002z;
            }
            ActionMenuPresenter.this.Z = null;
        }
    }

    public class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {
        public OverflowMenuButton(Context context) {
            super(context, (AttributeSet) null, R.attr.f306l);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.a(this, getContentDescription());
            setOnTouchListener(new ForwardingListener(this, ActionMenuPresenter.this) {
                public ShowableListMenu b() {
                    OverflowPopup overflowPopup = ActionMenuPresenter.this.X;
                    if (overflowPopup == null) {
                        return null;
                    }
                    return overflowPopup.c();
                }

                public boolean c() {
                    ActionMenuPresenter.this.L();
                    return true;
                }

                public boolean d() {
                    ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                    if (actionMenuPresenter.Z != null) {
                        return false;
                    }
                    actionMenuPresenter.C();
                    return true;
                }
            });
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.L();
            return true;
        }

        public boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                DrawableCompat.k(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class OverflowPopup extends MenuPopupHelper {
        public OverflowPopup(Context context, MenuBuilder menuBuilder, View view, boolean z2) {
            super(context, menuBuilder, view, z2, R.attr.f307m);
            h(8388613);
            j(ActionMenuPresenter.this.b0);
        }

        public void e() {
            if (ActionMenuPresenter.this.f859B != null) {
                ActionMenuPresenter.this.f859B.close();
            }
            ActionMenuPresenter.this.X = null;
            super.e();
        }
    }

    public class PopupPresenterCallback implements MenuPresenter.Callback {
        public PopupPresenterCallback() {
        }

        public void c(MenuBuilder menuBuilder, boolean z2) {
            if (menuBuilder instanceof SubMenuBuilder) {
                menuBuilder.D().e(false);
            }
            MenuPresenter.Callback n2 = ActionMenuPresenter.this.n();
            if (n2 != null) {
                n2.c(menuBuilder, z2);
            }
        }

        public boolean d(MenuBuilder menuBuilder) {
            if (menuBuilder == ActionMenuPresenter.this.f859B) {
                return false;
            }
            ActionMenuPresenter.this.c0 = ((SubMenuBuilder) menuBuilder).getItem().getItemId();
            MenuPresenter.Callback n2 = ActionMenuPresenter.this.n();
            if (n2 != null) {
                return n2.d(menuBuilder);
            }
            return false;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* renamed from: z  reason: collision with root package name */
        public int f1005z;

        public SavedState(Parcel parcel) {
            this.f1005z = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f1005z);
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.f403c, R.layout.f402b);
    }

    public final View A(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.H;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof MenuView.ItemView) && ((MenuView.ItemView) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable B() {
        OverflowMenuButton overflowMenuButton = this.J;
        if (overflowMenuButton != null) {
            return overflowMenuButton.getDrawable();
        }
        if (this.L) {
            return this.K;
        }
        return null;
    }

    public boolean C() {
        MenuView menuView;
        OpenOverflowRunnable openOverflowRunnable = this.Z;
        if (openOverflowRunnable == null || (menuView = this.H) == null) {
            OverflowPopup overflowPopup = this.X;
            if (overflowPopup == null) {
                return false;
            }
            overflowPopup.b();
            return true;
        }
        ((View) menuView).removeCallbacks(openOverflowRunnable);
        this.Z = null;
        return true;
    }

    public boolean D() {
        ActionButtonSubmenu actionButtonSubmenu = this.Y;
        if (actionButtonSubmenu == null) {
            return false;
        }
        actionButtonSubmenu.b();
        return true;
    }

    public boolean E() {
        return this.Z != null || F();
    }

    public boolean F() {
        OverflowPopup overflowPopup = this.X;
        return overflowPopup != null && overflowPopup.d();
    }

    public void G(Configuration configuration) {
        if (!this.R) {
            this.Q = ActionBarPolicy.b(this.f858A).d();
        }
        MenuBuilder menuBuilder = this.f859B;
        if (menuBuilder != null) {
            menuBuilder.K(true);
        }
    }

    public void H(boolean z2) {
        this.U = z2;
    }

    public void I(ActionMenuView actionMenuView) {
        this.H = actionMenuView;
        actionMenuView.b(this.f859B);
    }

    public void J(Drawable drawable) {
        OverflowMenuButton overflowMenuButton = this.J;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
            return;
        }
        this.L = true;
        this.K = drawable;
    }

    public void K(boolean z2) {
        this.M = z2;
        this.N = true;
    }

    public boolean L() {
        MenuBuilder menuBuilder;
        if (!this.M || F() || (menuBuilder = this.f859B) == null || this.H == null || this.Z != null || menuBuilder.z().isEmpty()) {
            return false;
        }
        OpenOverflowRunnable openOverflowRunnable = new OpenOverflowRunnable(new OverflowPopup(this.f858A, this.f859B, this.J, true));
        this.Z = openOverflowRunnable;
        ((View) this.H).post(openOverflowRunnable);
        return true;
    }

    public void a(boolean z2) {
        if (z2) {
            super.k((SubMenuBuilder) null);
            return;
        }
        MenuBuilder menuBuilder = this.f859B;
        if (menuBuilder != null) {
            menuBuilder.e(false);
        }
    }

    public void c(MenuBuilder menuBuilder, boolean z2) {
        z();
        super.c(menuBuilder, z2);
    }

    public void d(boolean z2) {
        MenuView menuView;
        super.d(z2);
        ((View) this.H).requestLayout();
        MenuBuilder menuBuilder = this.f859B;
        boolean z3 = false;
        if (menuBuilder != null) {
            ArrayList s2 = menuBuilder.s();
            int size = s2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ActionProvider b2 = ((MenuItemImpl) s2.get(i2)).b();
                if (b2 != null) {
                    b2.i(this);
                }
            }
        }
        MenuBuilder menuBuilder2 = this.f859B;
        ArrayList z4 = menuBuilder2 != null ? menuBuilder2.z() : null;
        if (this.M && z4 != null) {
            int size2 = z4.size();
            if (size2 == 1) {
                z3 = !((MenuItemImpl) z4.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.J == null) {
                this.J = new OverflowMenuButton(this.f860z);
            }
            ViewGroup viewGroup = (ViewGroup) this.J.getParent();
            if (viewGroup != this.H) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.J);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.H;
                actionMenuView.addView(this.J, actionMenuView.D());
            }
        } else {
            OverflowMenuButton overflowMenuButton = this.J;
            if (overflowMenuButton != null && overflowMenuButton.getParent() == (menuView = this.H)) {
                ((ViewGroup) menuView).removeView(this.J);
            }
        }
        ((ActionMenuView) this.H).setOverflowReserved(this.M);
    }

    public boolean e() {
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        boolean z2;
        ActionMenuPresenter actionMenuPresenter = this;
        MenuBuilder menuBuilder = actionMenuPresenter.f859B;
        View view = null;
        boolean z3 = false;
        if (menuBuilder != null) {
            arrayList = menuBuilder.E();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i6 = actionMenuPresenter.Q;
        int i7 = actionMenuPresenter.P;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.H;
        boolean z4 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i2; i10++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i10);
            if (menuItemImpl.o()) {
                i8++;
            } else if (menuItemImpl.n()) {
                i9++;
            } else {
                z4 = true;
            }
            if (actionMenuPresenter.U && menuItemImpl.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (actionMenuPresenter.M && (z4 || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.W;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.S) {
            int i12 = actionMenuPresenter.V;
            i3 = i7 / i12;
            i4 = i12 + ((i7 % i12) / i3);
        } else {
            i4 = 0;
            i3 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i2) {
            MenuItemImpl menuItemImpl2 = (MenuItemImpl) arrayList.get(i13);
            if (menuItemImpl2.o()) {
                View o2 = actionMenuPresenter.o(menuItemImpl2, view, viewGroup);
                if (actionMenuPresenter.S) {
                    i3 -= ActionMenuView.J(o2, i4, i3, makeMeasureSpec, z3 ? 1 : 0);
                } else {
                    o2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = o2.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = menuItemImpl2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                menuItemImpl2.u(true);
                z2 = z3;
                i5 = i2;
            } else if (menuItemImpl2.n()) {
                int groupId2 = menuItemImpl2.getGroupId();
                boolean z5 = sparseBooleanArray.get(groupId2);
                boolean z6 = (i11 > 0 || z5) && i7 > 0 && (!actionMenuPresenter.S || i3 > 0);
                boolean z7 = z6;
                i5 = i2;
                if (z6) {
                    View o3 = actionMenuPresenter.o(menuItemImpl2, (View) null, viewGroup);
                    if (actionMenuPresenter.S) {
                        int J2 = ActionMenuView.J(o3, i4, i3, makeMeasureSpec, 0);
                        i3 -= J2;
                        if (J2 == 0) {
                            z7 = false;
                        }
                    } else {
                        o3.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z8 = z7;
                    int measuredWidth2 = o3.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z6 = z8 & (!actionMenuPresenter.S ? i7 + i14 > 0 : i7 >= 0);
                }
                if (z6 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z5) {
                    sparseBooleanArray.put(groupId2, false);
                    int i15 = 0;
                    while (i15 < i13) {
                        MenuItemImpl menuItemImpl3 = (MenuItemImpl) arrayList.get(i15);
                        if (menuItemImpl3.getGroupId() == groupId2) {
                            if (menuItemImpl3.l()) {
                                i11++;
                            }
                            menuItemImpl3.u(false);
                        }
                        i15++;
                    }
                }
                if (z6) {
                    i11--;
                }
                menuItemImpl2.u(z6);
                z2 = false;
            } else {
                z2 = z3;
                i5 = i2;
                menuItemImpl2.u(z2);
            }
            i13++;
            z3 = z2;
            i2 = i5;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    public void i(Context context, MenuBuilder menuBuilder) {
        super.i(context, menuBuilder);
        Resources resources = context.getResources();
        ActionBarPolicy b2 = ActionBarPolicy.b(context);
        if (!this.N) {
            this.M = b2.h();
        }
        if (!this.T) {
            this.O = b2.c();
        }
        if (!this.R) {
            this.Q = b2.d();
        }
        int i2 = this.O;
        if (this.M) {
            if (this.J == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.f860z);
                this.J = overflowMenuButton;
                if (this.L) {
                    overflowMenuButton.setImageDrawable(this.K);
                    this.K = null;
                    this.L = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.J.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.J.getMeasuredWidth();
        } else {
            this.J = null;
        }
        this.P = i2;
        this.V = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void j(MenuItemImpl menuItemImpl, MenuView.ItemView itemView) {
        itemView.d(menuItemImpl, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) itemView;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.H);
        if (this.a0 == null) {
            this.a0 = new ActionMenuPopupCallback();
        }
        actionMenuItemView.setPopupCallback(this.a0);
    }

    public boolean k(SubMenuBuilder subMenuBuilder) {
        boolean z2 = false;
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
        while (subMenuBuilder2.e0() != this.f859B) {
            subMenuBuilder2 = (SubMenuBuilder) subMenuBuilder2.e0();
        }
        View A2 = A(subMenuBuilder2.getItem());
        if (A2 == null) {
            return false;
        }
        this.c0 = subMenuBuilder.getItem().getItemId();
        int size = subMenuBuilder.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = subMenuBuilder.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        ActionButtonSubmenu actionButtonSubmenu = new ActionButtonSubmenu(this.f858A, subMenuBuilder, A2);
        this.Y = actionButtonSubmenu;
        actionButtonSubmenu.g(z2);
        this.Y.k();
        super.k(subMenuBuilder);
        return true;
    }

    public boolean m(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.J) {
            return false;
        }
        return super.m(viewGroup, i2);
    }

    public View o(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.j()) {
            actionView = super.o(menuItemImpl, view, viewGroup);
        }
        actionView.setVisibility(menuItemImpl.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.m(layoutParams));
        }
        return actionView;
    }

    public MenuView p(ViewGroup viewGroup) {
        MenuView menuView = this.H;
        MenuView p2 = super.p(viewGroup);
        if (menuView != p2) {
            ((ActionMenuView) p2).setPresenter(this);
        }
        return p2;
    }

    public boolean r(int i2, MenuItemImpl menuItemImpl) {
        return menuItemImpl.l();
    }

    public boolean z() {
        return C() | D();
    }
}
