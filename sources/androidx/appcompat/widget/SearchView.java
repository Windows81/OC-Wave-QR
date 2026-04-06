package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.view.ViewCompat;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements CollapsibleActionView {
    public static final PreQAutoCompleteTextViewReflector P0 = (Build.VERSION.SDK_INT < 29 ? new PreQAutoCompleteTextViewReflector() : null);
    public CharSequence A0;
    public CharSequence B0;
    public boolean C0;
    public int D0;
    public SearchableInfo E0;
    public Bundle F0;
    public final Runnable G0;
    public Runnable H0;
    public final WeakHashMap I0;
    public final View.OnClickListener J0;
    public View.OnKeyListener K0;
    public final TextView.OnEditorActionListener L0;
    public final AdapterView.OnItemClickListener M0;
    public final AdapterView.OnItemSelectedListener N0;
    public final SearchAutoComplete O;
    public TextWatcher O0;
    public final View P;
    public final View Q;
    public final View R;
    public final ImageView S;
    public final ImageView T;
    public final ImageView U;
    public final ImageView V;
    public final View W;
    public UpdatableTouchDelegate a0;
    public Rect b0;
    public Rect c0;
    public int[] d0;
    public int[] e0;
    public final ImageView f0;
    public final Drawable g0;
    public final int h0;
    public final int i0;
    public final Intent j0;
    public final Intent k0;
    public final CharSequence l0;
    public OnQueryTextListener m0;
    public OnCloseListener n0;
    public View.OnFocusChangeListener o0;
    public OnSuggestionListener p0;
    public View.OnClickListener q0;
    public boolean r0;
    public boolean s0;
    public CursorAdapter t0;
    public boolean u0;
    public CharSequence v0;
    public boolean w0;
    public boolean x0;
    public int y0;
    public boolean z0;

    public static class Api29Impl {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i2) {
            searchAutoComplete.setInputMethodMode(i2);
        }
    }

    public interface OnCloseListener {
        boolean a();
    }

    public interface OnQueryTextListener {
        boolean a(String str);

        boolean b(String str);
    }

    public interface OnSuggestionListener {
        boolean a(int i2);

        boolean b(int i2);
    }

    public static class PreQAutoCompleteTextViewReflector {

        /* renamed from: a  reason: collision with root package name */
        public Method f1276a = null;

        /* renamed from: b  reason: collision with root package name */
        public Method f1277b = null;

        /* renamed from: c  reason: collision with root package name */
        public Method f1278c = null;

        public PreQAutoCompleteTextViewReflector() {
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            d();
            try {
                Method declaredMethod = cls.getDeclaredMethod("doBeforeTextChanged", (Class[]) null);
                this.f1276a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = cls.getDeclaredMethod("doAfterTextChanged", (Class[]) null);
                this.f1277b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1278c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1277b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, (Object[]) null);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1276a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, (Object[]) null);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1278c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
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
        public boolean f1279B;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1279B + "}";
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.f1279B));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1279B = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        public int D;
        public SearchView E;
        public boolean F;
        public final Runnable G;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.f311q);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void b() {
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.P0.c(this);
        }

        public boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void d() {
            if (this.F) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.F = false;
            }
        }

        public boolean enoughToFilter() {
            return this.D <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.F) {
                removeCallbacks(this.G);
                post(this.G);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            this.E.X();
        }

        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.E.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        public void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.E.hasFocus() && getVisibility() == 0) {
                this.F = true;
                if (SearchView.K(getContext())) {
                    b();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z2) {
                this.F = false;
                removeCallbacks(this.G);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.F = false;
                removeCallbacks(this.G);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.F = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.E = searchView;
        }

        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.D = i2;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.G = new Runnable() {
                public void run() {
                    SearchAutoComplete.this.d();
                }
            };
            this.D = getThreshold();
        }
    }

    public static class UpdatableTouchDelegate extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f1281a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f1282b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public final Rect f1283c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        public final Rect f1284d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        public final int f1285e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1286f;

        public UpdatableTouchDelegate(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1285e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f1281a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1282b.set(rect);
            this.f1284d.set(rect);
            Rect rect3 = this.f1284d;
            int i2 = this.f1285e;
            rect3.inset(-i2, -i2);
            this.f1283c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0032
                if (r2 == r5) goto L_0x0023
                if (r2 == r3) goto L_0x0023
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003e
            L_0x001b:
                boolean r2 = r8.f1286f
                r8.f1286f = r4
            L_0x001f:
                r7 = r5
                r5 = r2
                r2 = r7
                goto L_0x0040
            L_0x0023:
                boolean r2 = r8.f1286f
                if (r2 == 0) goto L_0x001f
                android.graphics.Rect r6 = r8.f1284d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x001f
                r5 = r2
                r2 = r4
                goto L_0x0040
            L_0x0032:
                android.graphics.Rect r2 = r8.f1282b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003e
                r8.f1286f = r5
                r2 = r5
                goto L_0x0040
            L_0x003e:
                r2 = r5
                r5 = r4
            L_0x0040:
                if (r5 == 0) goto L_0x0073
                if (r2 == 0) goto L_0x0060
                android.graphics.Rect r2 = r8.f1283c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0060
                android.view.View r0 = r8.f1281a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f1281a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                goto L_0x006d
            L_0x0060:
                android.graphics.Rect r2 = r8.f1283c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r9.setLocation(r0, r1)
            L_0x006d:
                android.view.View r0 = r8.f1281a
                boolean r4 = r0.dispatchTouchEvent(r9)
            L_0x0073:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.UpdatableTouchDelegate.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.f336g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.f337h);
    }

    private void setQuery(CharSequence charSequence) {
        this.O.setText(charSequence);
        this.O.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent A(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.B0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.F0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.E0.getSearchActivity());
        return intent;
    }

    public final Intent B(Cursor cursor, int i2, String str) {
        int i3;
        String o2;
        try {
            String o3 = SuggestionsAdapter.o(cursor, "suggest_intent_action");
            if (o3 == null) {
                o3 = this.E0.getSuggestIntentAction();
            }
            if (o3 == null) {
                o3 = "android.intent.action.SEARCH";
            }
            String str2 = o3;
            String o4 = SuggestionsAdapter.o(cursor, "suggest_intent_data");
            if (o4 == null) {
                o4 = this.E0.getSuggestIntentData();
            }
            if (!(o4 == null || (o2 = SuggestionsAdapter.o(cursor, "suggest_intent_data_id")) == null)) {
                o4 = o4 + "/" + Uri.encode(o2);
            }
            return A(str2, o4 == null ? null : Uri.parse(o4), SuggestionsAdapter.o(cursor, "suggest_intent_extra_data"), SuggestionsAdapter.o(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                i3 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i3 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            return null;
        }
    }

    public final Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.F0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void E() {
        this.O.dismissDropDown();
    }

    public void F() {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.a(this.O);
            return;
        }
        PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = P0;
        preQAutoCompleteTextViewReflector.b(this.O);
        preQAutoCompleteTextViewReflector.a(this.O);
    }

    public final void G(View view, Rect rect) {
        view.getLocationInWindow(this.d0);
        getLocationInWindow(this.e0);
        int[] iArr = this.d0;
        int i2 = iArr[1];
        int[] iArr2 = this.e0;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    public final CharSequence H(CharSequence charSequence) {
        if (!this.r0 || this.g0 == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.O.getTextSize()) * 1.25d);
        this.g0.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.g0), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean I() {
        SearchableInfo searchableInfo = this.E0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.E0.getVoiceSearchLaunchWebSearch() ? this.j0 : this.E0.getVoiceSearchLaunchRecognizer() ? this.k0 : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    public boolean J() {
        return this.s0;
    }

    public final boolean L() {
        return (this.u0 || this.z0) && !J();
    }

    public final void M(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e2) {
                Log.e("SearchView", "Failed launch activity: " + intent, e2);
            }
        }
    }

    public void N(int i2, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i2, str));
    }

    public final boolean O(int i2, int i3, String str) {
        Cursor c2 = this.t0.c();
        if (c2 == null || !c2.moveToPosition(i2)) {
            return false;
        }
        M(B(c2, i3, str));
        return true;
    }

    public void P() {
        if (!TextUtils.isEmpty(this.O.getText())) {
            this.O.setText("");
            this.O.requestFocus();
            this.O.setImeVisibility(true);
        } else if (this.r0) {
            OnCloseListener onCloseListener = this.n0;
            if (onCloseListener == null || !onCloseListener.a()) {
                clearFocus();
                i0(true);
            }
        }
    }

    public boolean Q(int i2, int i3, String str) {
        OnSuggestionListener onSuggestionListener = this.p0;
        if (onSuggestionListener != null && onSuggestionListener.b(i2)) {
            return false;
        }
        O(i2, 0, (String) null);
        this.O.setImeVisibility(false);
        E();
        return true;
    }

    public boolean R(int i2) {
        OnSuggestionListener onSuggestionListener = this.p0;
        if (onSuggestionListener != null && onSuggestionListener.a(i2)) {
            return false;
        }
        a0(i2);
        return true;
    }

    public void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void T() {
        i0(false);
        this.O.requestFocus();
        this.O.setImeVisibility(true);
        View.OnClickListener onClickListener = this.q0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void U() {
        Editable text = this.O.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            OnQueryTextListener onQueryTextListener = this.m0;
            if (onQueryTextListener == null || !onQueryTextListener.b(text.toString())) {
                if (this.E0 != null) {
                    N(0, (String) null, text.toString());
                }
                this.O.setImeVisibility(false);
                E();
            }
        }
    }

    public boolean V(View view, int i2, KeyEvent keyEvent) {
        if (this.E0 != null && this.t0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return Q(this.O.getListSelection(), 0, (String) null);
            }
            if (i2 == 21 || i2 == 22) {
                this.O.setSelection(i2 == 21 ? 0 : this.O.length());
                this.O.setListSelection(0);
                this.O.clearListSelection();
                this.O.b();
                return true;
            } else if (i2 == 19) {
                this.O.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void W(CharSequence charSequence) {
        Editable text = this.O.getText();
        this.B0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        h0(!isEmpty);
        j0(isEmpty);
        c0();
        g0();
        if (this.m0 != null && !TextUtils.equals(charSequence, this.A0)) {
            this.m0.a(charSequence.toString());
        }
        this.A0 = charSequence.toString();
    }

    public void X() {
        i0(J());
        Z();
        if (this.O.hasFocus()) {
            F();
        }
    }

    public void Y() {
        SearchableInfo searchableInfo = this.E0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(D(this.j0, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(C(this.k0, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public final void Z() {
        post(this.G0);
    }

    public final void a0(int i2) {
        Editable text = this.O.getText();
        Cursor c2 = this.t0.c();
        if (c2 != null) {
            if (c2.moveToPosition(i2)) {
                CharSequence a2 = this.t0.a(c2);
                if (a2 != null) {
                    setQuery(a2);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    public void b0(CharSequence charSequence, boolean z2) {
        this.O.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.O;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.B0 = charSequence;
        }
        if (z2 && !TextUtils.isEmpty(charSequence)) {
            U();
        }
    }

    public void c() {
        if (!this.C0) {
            this.C0 = true;
            int imeOptions = this.O.getImeOptions();
            this.D0 = imeOptions;
            this.O.setImeOptions(imeOptions | 33554432);
            this.O.setText("");
            setIconified(false);
        }
    }

    public final void c0() {
        boolean isEmpty = TextUtils.isEmpty(this.O.getText());
        int i2 = 0;
        boolean z2 = !isEmpty || (this.r0 && !this.C0);
        ImageView imageView = this.U;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.U.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void clearFocus() {
        this.x0 = true;
        super.clearFocus();
        this.O.clearFocus();
        this.O.setImeVisibility(false);
        this.x0 = false;
    }

    public void d() {
        b0("", false);
        clearFocus();
        i0(true);
        this.O.setImeOptions(this.D0);
        this.C0 = false;
    }

    public void d0() {
        int[] iArr = this.O.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.Q.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.R.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.O;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    public final void f0() {
        this.O.setThreshold(this.E0.getSuggestThreshold());
        this.O.setImeOptions(this.E0.getImeOptions());
        int inputType = this.E0.getInputType();
        int i2 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.E0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.O.setInputType(inputType);
        CursorAdapter cursorAdapter = this.t0;
        if (cursorAdapter != null) {
            cursorAdapter.b((Cursor) null);
        }
        if (this.E0.getSuggestAuthority() != null) {
            SuggestionsAdapter suggestionsAdapter = new SuggestionsAdapter(getContext(), this, this.E0, this.I0);
            this.t0 = suggestionsAdapter;
            this.O.setAdapter(suggestionsAdapter);
            SuggestionsAdapter suggestionsAdapter2 = (SuggestionsAdapter) this.t0;
            if (this.w0) {
                i2 = 2;
            }
            suggestionsAdapter2.x(i2);
        }
    }

    public final void g0() {
        this.R.setVisibility((!L() || !(this.T.getVisibility() == 0 || this.V.getVisibility() == 0)) ? 8 : 0);
    }

    public int getImeOptions() {
        return this.O.getImeOptions();
    }

    public int getInputType() {
        return this.O.getInputType();
    }

    public int getMaxWidth() {
        return this.y0;
    }

    public CharSequence getQuery() {
        return this.O.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.v0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.E0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.l0 : getContext().getText(this.E0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.i0;
    }

    public int getSuggestionRowLayout() {
        return this.h0;
    }

    public CursorAdapter getSuggestionsAdapter() {
        return this.t0;
    }

    public final void h0(boolean z2) {
        this.T.setVisibility((!this.u0 || !L() || !hasFocus() || (!z2 && this.z0)) ? 8 : 0);
    }

    public final void i0(boolean z2) {
        this.s0 = z2;
        int i2 = 8;
        int i3 = z2 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.O.getText());
        this.S.setVisibility(i3);
        h0(!isEmpty);
        this.P.setVisibility(z2 ? 8 : 0);
        if (this.f0.getDrawable() != null && !this.r0) {
            i2 = 0;
        }
        this.f0.setVisibility(i2);
        c0();
        j0(isEmpty);
        g0();
    }

    public final void j0(boolean z2) {
        int i2 = 8;
        if (this.z0 && !J() && z2) {
            this.T.setVisibility(8);
            i2 = 0;
        }
        this.V.setVisibility(i2);
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.G0);
        post(this.H0);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            G(this.O, this.b0);
            Rect rect = this.c0;
            Rect rect2 = this.b0;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            UpdatableTouchDelegate updatableTouchDelegate = this.a0;
            if (updatableTouchDelegate == null) {
                UpdatableTouchDelegate updatableTouchDelegate2 = new UpdatableTouchDelegate(this.c0, this.b0, this.O);
                this.a0 = updatableTouchDelegate2;
                setTouchDelegate(updatableTouchDelegate2);
                return;
            }
            updatableTouchDelegate.a(this.c0, this.b0);
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        if (J()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.y0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.y0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.y0) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        i0(savedState.f1279B);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1279B = J();
        return savedState;
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        Z();
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (this.x0 || !isFocusable()) {
            return false;
        }
        if (J()) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.O.requestFocus(i2, rect);
        if (requestFocus) {
            i0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.F0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.r0 != z2) {
            this.r0 = z2;
            i0(z2);
            e0();
        }
    }

    public void setImeOptions(int i2) {
        this.O.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.O.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.y0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.n0 = onCloseListener;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.o0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(OnQueryTextListener onQueryTextListener) {
        this.m0 = onQueryTextListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.q0 = onClickListener;
    }

    public void setOnSuggestionListener(OnSuggestionListener onSuggestionListener) {
        this.p0 = onSuggestionListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.v0 = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.w0 = z2;
        CursorAdapter cursorAdapter = this.t0;
        if (cursorAdapter instanceof SuggestionsAdapter) {
            ((SuggestionsAdapter) cursorAdapter).x(z2 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.E0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean I = I();
        this.z0 = I;
        if (I) {
            this.O.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.u0 = z2;
        i0(J());
    }

    public void setSuggestionsAdapter(CursorAdapter cursorAdapter) {
        this.t0 = cursorAdapter;
        this.O.setAdapter(cursorAdapter);
    }

    public void z() {
        if (this.W.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.Q.getPaddingLeft();
            Rect rect = new Rect();
            boolean b2 = ViewUtils.b(this);
            int dimensionPixelSize = this.r0 ? resources.getDimensionPixelSize(R.dimen.f334e) + resources.getDimensionPixelSize(R.dimen.f335f) : 0;
            this.O.getDropDownBackground().getPadding(rect);
            this.O.setDropDownHorizontalOffset(b2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.O.setDropDownWidth((((this.W.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.K);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.b0 = new Rect();
        this.c0 = new Rect();
        this.d0 = new int[2];
        this.e0 = new int[2];
        this.G0 = new Runnable() {
            public void run() {
                SearchView.this.d0();
            }
        };
        this.H0 = new Runnable() {
            public void run() {
                CursorAdapter cursorAdapter = SearchView.this.t0;
                if (cursorAdapter instanceof SuggestionsAdapter) {
                    cursorAdapter.b((Cursor) null);
                }
            }
        };
        this.I0 = new WeakHashMap();
        AnonymousClass5 r8 = new View.OnClickListener() {
            public void onClick(View view) {
                SearchView searchView = SearchView.this;
                if (view == searchView.S) {
                    searchView.T();
                } else if (view == searchView.U) {
                    searchView.P();
                } else if (view == searchView.T) {
                    searchView.U();
                } else if (view == searchView.V) {
                    searchView.Y();
                } else if (view == searchView.O) {
                    searchView.F();
                }
            }
        };
        this.J0 = r8;
        this.K0 = new View.OnKeyListener() {
            public boolean onKey(View view, int i2, KeyEvent keyEvent) {
                SearchView searchView = SearchView.this;
                if (searchView.E0 == null) {
                    return false;
                }
                if (searchView.O.isPopupShowing() && SearchView.this.O.getListSelection() != -1) {
                    return SearchView.this.V(view, i2, keyEvent);
                }
                if (SearchView.this.O.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.N(0, (String) null, searchView2.O.getText().toString());
                return true;
            }
        };
        AnonymousClass7 r9 = new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                SearchView.this.U();
                return true;
            }
        };
        this.L0 = r9;
        AnonymousClass8 r10 = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
                SearchView.this.Q(i2, 0, (String) null);
            }
        };
        this.M0 = r10;
        AnonymousClass9 r11 = new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
                SearchView.this.R(i2);
            }

            public void onNothingSelected(AdapterView adapterView) {
            }
        };
        this.N0 = r11;
        this.O0 = new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                SearchView.this.W(charSequence);
            }
        };
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i2;
        TintTypedArray u2 = TintTypedArray.u(context, attributeSet2, R.styleable.h2, i3, 0);
        ViewCompat.S(this, context, R.styleable.h2, attributeSet2, u2.q(), i3, 0);
        LayoutInflater.from(context).inflate(u2.m(R.styleable.r2, R.layout.f420t), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.J);
        this.O = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.P = findViewById(R.id.F);
        View findViewById = findViewById(R.id.I);
        this.Q = findViewById;
        View findViewById2 = findViewById(R.id.P);
        this.R = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.D);
        this.S = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.G);
        this.T = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.E);
        this.U = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.K);
        this.V = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.H);
        this.f0 = imageView5;
        ViewCompat.X(findViewById, u2.f(R.styleable.s2));
        ViewCompat.X(findViewById2, u2.f(R.styleable.w2));
        imageView.setImageDrawable(u2.f(R.styleable.v2));
        imageView2.setImageDrawable(u2.f(R.styleable.p2));
        imageView3.setImageDrawable(u2.f(R.styleable.m2));
        imageView4.setImageDrawable(u2.f(R.styleable.y2));
        imageView5.setImageDrawable(u2.f(R.styleable.v2));
        this.g0 = u2.f(R.styleable.u2);
        TooltipCompat.a(imageView, getResources().getString(R.string.f438p));
        this.h0 = u2.m(R.styleable.x2, R.layout.f419s);
        this.i0 = u2.m(R.styleable.n2, 0);
        imageView.setOnClickListener(r8);
        imageView3.setOnClickListener(r8);
        imageView2.setOnClickListener(r8);
        imageView4.setOnClickListener(r8);
        searchAutoComplete.setOnClickListener(r8);
        searchAutoComplete.addTextChangedListener(this.O0);
        searchAutoComplete.setOnEditorActionListener(r9);
        searchAutoComplete.setOnItemClickListener(r10);
        searchAutoComplete.setOnItemSelectedListener(r11);
        searchAutoComplete.setOnKeyListener(this.K0);
        searchAutoComplete.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z2) {
                SearchView searchView = SearchView.this;
                View.OnFocusChangeListener onFocusChangeListener = searchView.o0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z2);
                }
            }
        });
        setIconifiedByDefault(u2.a(R.styleable.q2, true));
        int e2 = u2.e(R.styleable.j2, -1);
        if (e2 != -1) {
            setMaxWidth(e2);
        }
        this.l0 = u2.o(R.styleable.o2);
        this.v0 = u2.o(R.styleable.t2);
        int j2 = u2.j(R.styleable.l2, -1);
        if (j2 != -1) {
            setImeOptions(j2);
        }
        int j3 = u2.j(R.styleable.k2, -1);
        if (j3 != -1) {
            setInputType(j3);
        }
        setFocusable(u2.a(R.styleable.i2, true));
        u2.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.j0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.k0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.W = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    SearchView.this.z();
                }
            });
        }
        i0(this.r0);
        e0();
    }
}
