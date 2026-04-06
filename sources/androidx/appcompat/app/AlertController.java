package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

class AlertController {

    /* renamed from: A  reason: collision with root package name */
    public NestedScrollView f487A;

    /* renamed from: B  reason: collision with root package name */
    public int f488B = 0;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int I = -1;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public int Q = 0;
    public Handler R;
    public final View.OnClickListener S = new View.OnClickListener() {
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r3 = r0.f513y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f503o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f505q
                if (r1 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x000f:
                android.widget.Button r1 = r0.f507s
                if (r3 != r1) goto L_0x001c
                android.os.Message r1 = r0.f509u
                if (r1 == 0) goto L_0x001c
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x001c:
                android.widget.Button r1 = r0.f511w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f513y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.R
                r1 = 1
                androidx.appcompat.app.AppCompatDialog r3 = r3.f490b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.AnonymousClass1.onClick(android.view.View):void");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final Context f489a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatDialog f490b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f491c;

    /* renamed from: d  reason: collision with root package name */
    public final int f492d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f493e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f494f;

    /* renamed from: g  reason: collision with root package name */
    public ListView f495g;

    /* renamed from: h  reason: collision with root package name */
    public View f496h;

    /* renamed from: i  reason: collision with root package name */
    public int f497i;

    /* renamed from: j  reason: collision with root package name */
    public int f498j;

    /* renamed from: k  reason: collision with root package name */
    public int f499k;

    /* renamed from: l  reason: collision with root package name */
    public int f500l;

    /* renamed from: m  reason: collision with root package name */
    public int f501m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f502n = false;

    /* renamed from: o  reason: collision with root package name */
    public Button f503o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f504p;

    /* renamed from: q  reason: collision with root package name */
    public Message f505q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f506r;

    /* renamed from: s  reason: collision with root package name */
    public Button f507s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f508t;

    /* renamed from: u  reason: collision with root package name */
    public Message f509u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f510v;

    /* renamed from: w  reason: collision with root package name */
    public Button f511w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f512x;

    /* renamed from: y  reason: collision with root package name */
    public Message f513y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f514z;

    /* renamed from: androidx.appcompat.app.AlertController$2  reason: invalid class name */
    public class AnonymousClass2 implements NestedScrollView.OnScrollChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f516a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f517b;

        public void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
            AlertController.f(nestedScrollView, this.f516a, this.f517b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$3  reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ View f518A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ AlertController f519B;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ View f520z;

        public void run() {
            AlertController.f(this.f519B.f487A, this.f520z, this.f518A);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$4  reason: invalid class name */
    public class AnonymousClass4 implements AbsListView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f521a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f522b;

        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
            AlertController.f(absListView, this.f521a, this.f522b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$5  reason: invalid class name */
    public class AnonymousClass5 implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ View f523A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ AlertController f524B;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ View f525z;

        public void run() {
            AlertController.f(this.f524B.f495g, this.f525z, this.f523A);
        }
    }

    public static class AlertParams {

        /* renamed from: A  reason: collision with root package name */
        public int f526A;

        /* renamed from: B  reason: collision with root package name */
        public int f527B;
        public int C;
        public int D;
        public boolean E = false;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I = -1;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public OnPrepareListViewListener O;
        public boolean P = true;

        /* renamed from: a  reason: collision with root package name */
        public final Context f528a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f529b;

        /* renamed from: c  reason: collision with root package name */
        public int f530c = 0;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f531d;

        /* renamed from: e  reason: collision with root package name */
        public int f532e = 0;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f533f;

        /* renamed from: g  reason: collision with root package name */
        public View f534g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f535h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f536i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f537j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f538k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f539l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f540m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f541n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f542o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f543p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f544q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f545r;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f546s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f547t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f548u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f549v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f550w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f551x;

        /* renamed from: y  reason: collision with root package name */
        public int f552y;

        /* renamed from: z  reason: collision with root package name */
        public View f553z;

        public interface OnPrepareListViewListener {
            void a(ListView listView);
        }

        public AlertParams(Context context) {
            this.f528a = context;
            this.f545r = true;
            this.f529b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController) {
            View view = this.f534g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f533f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f531d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i2 = this.f530c;
                if (i2 != 0) {
                    alertController.m(i2);
                }
                int i3 = this.f532e;
                if (i3 != 0) {
                    alertController.m(alertController.c(i3));
                }
            }
            CharSequence charSequence2 = this.f535h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f536i;
            if (!(charSequence3 == null && this.f537j == null)) {
                alertController.k(-1, charSequence3, this.f538k, (Message) null, this.f537j);
            }
            CharSequence charSequence4 = this.f539l;
            if (!(charSequence4 == null && this.f540m == null)) {
                alertController.k(-2, charSequence4, this.f541n, (Message) null, this.f540m);
            }
            CharSequence charSequence5 = this.f542o;
            if (!(charSequence5 == null && this.f543p == null)) {
                alertController.k(-3, charSequence5, this.f544q, (Message) null, this.f543p);
            }
            if (!(this.f549v == null && this.K == null && this.f550w == null)) {
                b(alertController);
            }
            View view2 = this.f553z;
            if (view2 == null) {
                int i4 = this.f552y;
                if (i4 != 0) {
                    alertController.r(i4);
                }
            } else if (this.E) {
                alertController.t(view2, this.f526A, this.f527B, this.C, this.D);
            } else {
                alertController.s(view2);
            }
        }

        /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r8v3 */
        /* JADX WARNING: type inference failed for: r8v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$AlertParams$2] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$AlertParams$1] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(final androidx.appcompat.app.AlertController r10) {
            /*
                r9 = this;
                android.view.LayoutInflater r0 = r9.f529b
                int r1 = r10.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r9.G
                if (r1 == 0) goto L_0x0034
                android.database.Cursor r1 = r9.K
                if (r1 != 0) goto L_0x0025
                androidx.appcompat.app.AlertController$AlertParams$1 r8 = new androidx.appcompat.app.AlertController$AlertParams$1
                android.content.Context r3 = r9.f528a
                int r4 = r10.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r9.f549v
                r1 = r8
                r2 = r9
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x0025:
                androidx.appcompat.app.AlertController$AlertParams$2 r8 = new androidx.appcompat.app.AlertController$AlertParams$2
                android.content.Context r3 = r9.f528a
                android.database.Cursor r4 = r9.K
                r5 = 0
                r1 = r8
                r2 = r9
                r6 = r0
                r7 = r10
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x0034:
                boolean r1 = r9.H
                if (r1 == 0) goto L_0x003c
                int r1 = r10.N
            L_0x003a:
                r4 = r1
                goto L_0x003f
            L_0x003c:
                int r1 = r10.O
                goto L_0x003a
            L_0x003f:
                android.database.Cursor r1 = r9.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005b
                android.widget.SimpleCursorAdapter r8 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r9.f528a
                android.database.Cursor r5 = r9.K
                java.lang.String r1 = r9.L
                java.lang.String[] r6 = new java.lang.String[]{r1}
                int[] r7 = new int[]{r2}
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x005b:
                android.widget.ListAdapter r8 = r9.f550w
                if (r8 == 0) goto L_0x0060
                goto L_0x0069
            L_0x0060:
                androidx.appcompat.app.AlertController$CheckedItemAdapter r8 = new androidx.appcompat.app.AlertController$CheckedItemAdapter
                android.content.Context r1 = r9.f528a
                java.lang.CharSequence[] r3 = r9.f549v
                r8.<init>(r1, r4, r2, r3)
            L_0x0069:
                androidx.appcompat.app.AlertController$AlertParams$OnPrepareListViewListener r1 = r9.O
                if (r1 == 0) goto L_0x0070
                r1.a(r0)
            L_0x0070:
                r10.H = r8
                int r1 = r9.I
                r10.I = r1
                android.content.DialogInterface$OnClickListener r1 = r9.f551x
                if (r1 == 0) goto L_0x0083
                androidx.appcompat.app.AlertController$AlertParams$3 r1 = new androidx.appcompat.app.AlertController$AlertParams$3
                r1.<init>(r10)
                r0.setOnItemClickListener(r1)
                goto L_0x008f
            L_0x0083:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r9.J
                if (r1 == 0) goto L_0x008f
                androidx.appcompat.app.AlertController$AlertParams$4 r1 = new androidx.appcompat.app.AlertController$AlertParams$4
                r1.<init>(r0, r10)
                r0.setOnItemClickListener(r1)
            L_0x008f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r9.N
                if (r1 == 0) goto L_0x0096
                r0.setOnItemSelectedListener(r1)
            L_0x0096:
                boolean r1 = r9.H
                if (r1 == 0) goto L_0x009f
                r1 = 1
                r0.setChoiceMode(r1)
                goto L_0x00a7
            L_0x009f:
                boolean r1 = r9.G
                if (r1 == 0) goto L_0x00a7
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a7:
                r10.f495g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.AlertParams.b(androidx.appcompat.app.AlertController):void");
        }
    }

    public static final class ButtonHandler extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference f564a;

        public ButtonHandler(DialogInterface dialogInterface) {
            this.f564a = new WeakReference(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f564a.get(), message.what);
            } else if (i2 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class CheckedItemAdapter extends ArrayAdapter<CharSequence> {
        public CheckedItemAdapter(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, charSequenceArr);
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public static class RecycleListView extends ListView {

        /* renamed from: A  reason: collision with root package name */
        public final int f565A;

        /* renamed from: z  reason: collision with root package name */
        public final int f566z;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.e2);
            this.f565A = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.f2, -1);
            this.f566z = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.g2, -1);
        }

        public void a(boolean z2, boolean z3) {
            if (!z3 || !z2) {
                setPadding(getPaddingLeft(), z2 ? getPaddingTop() : this.f566z, getPaddingRight(), z3 ? getPaddingBottom() : this.f565A);
            }
        }
    }

    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window) {
        this.f489a = context;
        this.f490b = appCompatDialog;
        this.f491c = window;
        this.R = new ButtonHandler(appCompatDialog);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, R.styleable.H, R.attr.f309o, 0);
        this.J = obtainStyledAttributes.getResourceId(R.styleable.I, 0);
        this.K = obtainStyledAttributes.getResourceId(R.styleable.K, 0);
        this.L = obtainStyledAttributes.getResourceId(R.styleable.M, 0);
        this.M = obtainStyledAttributes.getResourceId(R.styleable.N, 0);
        this.N = obtainStyledAttributes.getResourceId(R.styleable.P, 0);
        this.O = obtainStyledAttributes.getResourceId(R.styleable.L, 0);
        this.P = obtainStyledAttributes.getBoolean(R.styleable.O, true);
        this.f492d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.J, 0);
        obtainStyledAttributes.recycle();
        appCompatDialog.l(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void f(View view, View view2, View view3) {
        int i2 = 4;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i2 = 0;
            }
            view3.setVisibility(i2);
        }
    }

    public static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.f308n, typedValue, true);
        return typedValue.data != 0;
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public int c(int i2) {
        TypedValue typedValue = new TypedValue();
        this.f489a.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f495g;
    }

    public void e() {
        this.f490b.setContentView(j());
        y();
    }

    public boolean g(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f487A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean h(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f487A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public final ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final int j() {
        int i2 = this.K;
        return i2 == 0 ? this.J : this.Q == 1 ? i2 : this.J;
    }

    public void k(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.f512x = charSequence;
            this.f513y = message;
            this.f514z = drawable;
        } else if (i2 == -2) {
            this.f508t = charSequence;
            this.f509u = message;
            this.f510v = drawable;
        } else if (i2 == -1) {
            this.f504p = charSequence;
            this.f505q = message;
            this.f506r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i2) {
        this.C = null;
        this.f488B = i2;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (i2 != 0) {
            imageView.setVisibility(0);
            this.D.setImageResource(this.f488B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.f488B = 0;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void o(CharSequence charSequence) {
        this.f494f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void p(ViewGroup viewGroup, View view, int i2, int i3) {
        View findViewById = this.f491c.findViewById(R.id.f374B);
        View findViewById2 = this.f491c.findViewById(R.id.f373A);
        ViewCompat.f0(view, i2, i3);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    public void q(CharSequence charSequence) {
        this.f493e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i2) {
        this.f496h = null;
        this.f497i = i2;
        this.f502n = false;
    }

    public void s(View view) {
        this.f496h = view;
        this.f497i = 0;
        this.f502n = false;
    }

    public void t(View view, int i2, int i3, int i4, int i5) {
        this.f496h = view;
        this.f497i = 0;
        this.f502n = true;
        this.f498j = i2;
        this.f499k = i3;
        this.f500l = i4;
        this.f501m = i5;
    }

    public final void u(ViewGroup viewGroup) {
        boolean z2;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f503o = button;
        button.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f504p) || this.f506r != null) {
            this.f503o.setText(this.f504p);
            Drawable drawable = this.f506r;
            if (drawable != null) {
                int i2 = this.f492d;
                drawable.setBounds(0, 0, i2, i2);
                this.f503o.setCompoundDrawables(this.f506r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f503o.setVisibility(0);
            z2 = true;
        } else {
            this.f503o.setVisibility(8);
            z2 = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f507s = button2;
        button2.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f508t) || this.f510v != null) {
            this.f507s.setText(this.f508t);
            Drawable drawable2 = this.f510v;
            if (drawable2 != null) {
                int i3 = this.f492d;
                drawable2.setBounds(0, 0, i3, i3);
                this.f507s.setCompoundDrawables(this.f510v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f507s.setVisibility(0);
            z2 |= true;
        } else {
            this.f507s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f511w = button3;
        button3.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f512x) || this.f514z != null) {
            this.f511w.setText(this.f512x);
            Drawable drawable3 = this.f514z;
            if (drawable3 != null) {
                int i4 = this.f492d;
                drawable3.setBounds(0, 0, i4, i4);
                this.f511w.setCompoundDrawables(this.f514z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f511w.setVisibility(0);
            z2 |= true;
        } else {
            this.f511w.setVisibility(8);
        }
        if (z(this.f489a)) {
            if (z2) {
                b(this.f503o);
            } else if (z2) {
                b(this.f507s);
            } else if (z2) {
                b(this.f511w);
            }
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    public final void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f491c.findViewById(R.id.C);
        this.f487A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f487A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f494f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f487A.removeView(this.F);
            if (this.f495g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f487A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f487A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f495g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    public final void w(ViewGroup viewGroup) {
        View view = this.f496h;
        boolean z2 = false;
        if (view == null) {
            view = this.f497i != 0 ? LayoutInflater.from(this.f489a).inflate(this.f497i, viewGroup, false) : null;
        }
        if (view != null) {
            z2 = true;
        }
        if (!z2 || !a(view)) {
            this.f491c.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) this.f491c.findViewById(R.id.f389o);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f502n) {
                frameLayout.setPadding(this.f498j, this.f499k, this.f500l, this.f501m);
            }
            if (this.f495g != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f491c.findViewById(R.id.U).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f491c.findViewById(16908294);
        if (TextUtils.isEmpty(this.f493e) || !this.P) {
            this.f491c.findViewById(R.id.U).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f491c.findViewById(R.id.f385k);
        this.E = textView;
        textView.setText(this.f493e);
        int i2 = this.f488B;
        if (i2 != 0) {
            this.D.setImageResource(i2);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }

    public final void y() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f491c.findViewById(R.id.f400z);
        View findViewById4 = findViewById3.findViewById(R.id.V);
        View findViewById5 = findViewById3.findViewById(R.id.f388n);
        View findViewById6 = findViewById3.findViewById(R.id.f386l);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.f390p);
        w(viewGroup);
        View findViewById7 = viewGroup.findViewById(R.id.V);
        View findViewById8 = viewGroup.findViewById(R.id.f388n);
        View findViewById9 = viewGroup.findViewById(R.id.f386l);
        ViewGroup i2 = i(findViewById7, findViewById4);
        ViewGroup i3 = i(findViewById8, findViewById5);
        ViewGroup i4 = i(findViewById9, findViewById6);
        v(i3);
        u(i4);
        x(i2);
        char c2 = 0;
        boolean z2 = viewGroup.getVisibility() != 8;
        boolean z3 = (i2 == null || i2.getVisibility() == 8) ? false : true;
        boolean z4 = (i4 == null || i4.getVisibility() == 8) ? false : true;
        if (!(z4 || i3 == null || (findViewById2 = i3.findViewById(R.id.Q)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z3) {
            NestedScrollView nestedScrollView = this.f487A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f494f == null && this.f495g == null) ? null : i2.findViewById(R.id.T);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (!(i3 == null || (findViewById = i3.findViewById(R.id.R)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f495g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z3, z4);
        }
        if (!z2) {
            View view = this.f495g;
            if (view == null) {
                view = this.f487A;
            }
            if (view != null) {
                if (z4) {
                    c2 = 2;
                }
                p(i3, view, z3 | c2 ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f495g;
        if (listView2 != null && (listAdapter = this.H) != null) {
            listView2.setAdapter(listAdapter);
            int i5 = this.I;
            if (i5 > -1) {
                listView2.setItemChecked(i5, true);
                listView2.setSelection(i5);
            }
        }
    }
}
