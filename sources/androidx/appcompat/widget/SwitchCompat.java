package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class SwitchCompat extends CompoundButton implements EmojiCompatConfigurationView {
    public static final Property t0 = new Property<SwitchCompat, Float>(Float.class, "thumbPos") {
        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.b0);
        }

        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f2) {
            switchCompat.setThumbPosition(f2.floatValue());
        }
    };
    public static final int[] u0 = {16842912};

    /* renamed from: A  reason: collision with root package name */
    public ColorStateList f1299A;

    /* renamed from: B  reason: collision with root package name */
    public PorterDuff.Mode f1300B;
    public boolean C;
    public boolean D;
    public Drawable E;
    public ColorStateList F;
    public PorterDuff.Mode G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public CharSequence N;
    public CharSequence O;
    public CharSequence P;
    public CharSequence Q;
    public boolean R;
    public int S;
    public int T;
    public float U;
    public float V;
    public VelocityTracker W;
    public int a0;
    public float b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public boolean j0;
    public final TextPaint k0;
    public ColorStateList l0;
    public Layout m0;
    public Layout n0;
    public TransformationMethod o0;
    public ObjectAnimator p0;
    public AppCompatEmojiTextHelper q0;
    public EmojiCompatInitCallback r0;
    public final Rect s0;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f1301z;

    public static class Api18Impl {
        public static void a(ObjectAnimator objectAnimator, boolean z2) {
            objectAnimator.setAutoCancel(z2);
        }
    }

    public static class EmojiCompatInitCallback extends EmojiCompat.InitCallback {

        /* renamed from: z  reason: collision with root package name */
        public final Reference f1302z;

        public EmojiCompatInitCallback(SwitchCompat switchCompat) {
            this.f1302z = new WeakReference(switchCompat);
        }

        public void a(Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.f1302z.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        public void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1302z.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public static float f(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.q0 == null) {
            this.q0 = new AppCompatEmojiTextHelper(this);
        }
        return this.q0;
    }

    private boolean getTargetCheckedState() {
        return this.b0 > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((ViewUtils.b(this) ? 1.0f - this.b0 : this.b0) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.E;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.s0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1301z;
        Rect d2 = drawable2 != null ? DrawableUtils.d(drawable2) : DrawableUtils.f1192c;
        return ((((this.c0 - this.e0) - rect.left) - rect.right) - d2.left) - d2.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.P = charSequence;
        this.Q = g(charSequence);
        this.n0 = null;
        if (this.R) {
            m();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.N = charSequence;
        this.O = g(charSequence);
        this.m0 = null;
        if (this.R) {
            m();
        }
    }

    public final void a(boolean z2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, t0, new float[]{z2 ? 1.0f : 0.0f});
        this.p0 = ofFloat;
        ofFloat.setDuration(250);
        Api18Impl.a(this.p0, true);
        this.p0.start();
    }

    public final void b() {
        Drawable drawable = this.f1301z;
        if (drawable == null) {
            return;
        }
        if (this.C || this.D) {
            Drawable mutate = DrawableCompat.q(drawable).mutate();
            this.f1301z = mutate;
            if (this.C) {
                DrawableCompat.n(mutate, this.f1299A);
            }
            if (this.D) {
                DrawableCompat.o(this.f1301z, this.f1300B);
            }
            if (this.f1301z.isStateful()) {
                this.f1301z.setState(getDrawableState());
            }
        }
    }

    public final void c() {
        Drawable drawable = this.E;
        if (drawable == null) {
            return;
        }
        if (this.H || this.I) {
            Drawable mutate = DrawableCompat.q(drawable).mutate();
            this.E = mutate;
            if (this.H) {
                DrawableCompat.n(mutate, this.F);
            }
            if (this.I) {
                DrawableCompat.o(this.E, this.G);
            }
            if (this.E.isStateful()) {
                this.E.setState(getDrawableState());
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.p0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void draw(Canvas canvas) {
        int i2;
        int i3;
        Rect rect = this.s0;
        int i4 = this.f0;
        int i5 = this.g0;
        int i6 = this.h0;
        int i7 = this.i0;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f1301z;
        Rect d2 = drawable != null ? DrawableUtils.d(drawable) : DrawableUtils.f1192c;
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i8 = rect.left;
            thumbOffset += i8;
            if (d2 != null) {
                int i9 = d2.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = d2.top;
                int i11 = rect.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = d2.right;
                int i13 = rect.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = d2.bottom;
                int i15 = rect.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                    this.E.setBounds(i4, i2, i6, i3);
                }
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.E.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f1301z;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.e0 + rect.right;
            this.f1301z.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                DrawableCompat.k(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f1301z;
        if (drawable != null) {
            DrawableCompat.j(drawable, f2, f3);
        }
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            DrawableCompat.j(drawable2, f2, f3);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1301z;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.E;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final CharSequence g(CharSequence charSequence) {
        TransformationMethod f2 = getEmojiTextViewHelper().f(this.o0);
        return f2 != null ? f2.getTransformation(charSequence, this) : charSequence;
    }

    public int getCompoundPaddingLeft() {
        if (!ViewUtils.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.c0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.L : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (ViewUtils.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.c0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.L : compoundPaddingRight;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.n(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.R;
    }

    public boolean getSplitTrack() {
        return this.M;
    }

    public int getSwitchMinWidth() {
        return this.K;
    }

    public int getSwitchPadding() {
        return this.L;
    }

    public CharSequence getTextOff() {
        return this.P;
    }

    public CharSequence getTextOn() {
        return this.N;
    }

    public Drawable getThumbDrawable() {
        return this.f1301z;
    }

    public final float getThumbPosition() {
        return this.b0;
    }

    public int getThumbTextPadding() {
        return this.J;
    }

    public ColorStateList getThumbTintList() {
        return this.f1299A;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1300B;
    }

    public Drawable getTrackDrawable() {
        return this.E;
    }

    public ColorStateList getTrackTintList() {
        return this.F;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.G;
    }

    public final boolean h(float f2, float f3) {
        if (this.f1301z == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1301z.getPadding(this.s0);
        int i2 = this.g0;
        int i3 = this.T;
        int i4 = i2 - i3;
        int i5 = (this.f0 + thumbOffset) - i3;
        Rect rect = this.s0;
        return f2 > ((float) i5) && f2 < ((float) ((((this.e0 + i5) + rect.left) + rect.right) + i3)) && f3 > ((float) i4) && f3 < ((float) (this.i0 + i3));
    }

    public final Layout i(CharSequence charSequence) {
        TextPaint textPaint = this.k0;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void j() {
        setTextOnInternal(this.N);
        setTextOffInternal(this.P);
        requestLayout();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1301z;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.p0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.p0.end();
            this.p0 = null;
        }
    }

    public final void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.P;
            if (charSequence == null) {
                charSequence = getResources().getString(R.string.f426d);
            }
            ViewCompat.g0(this, charSequence);
        }
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.N;
            if (charSequence == null) {
                charSequence = getResources().getString(R.string.f427e);
            }
            ViewCompat.g0(this, charSequence);
        }
    }

    public final void m() {
        if (this.r0 == null && this.q0.b() && EmojiCompat.k()) {
            EmojiCompat c2 = EmojiCompat.c();
            int g2 = c2.g();
            if (g2 == 3 || g2 == 0) {
                EmojiCompatInitCallback emojiCompatInitCallback = new EmojiCompatInitCallback(this);
                this.r0 = emojiCompatInitCallback;
                c2.v(emojiCompatInitCallback);
            }
        }
    }

    public final void n(MotionEvent motionEvent) {
        this.S = 0;
        boolean z2 = true;
        boolean z3 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z3) {
            this.W.computeCurrentVelocity(1000);
            float xVelocity = this.W.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.a0)) {
                z2 = getTargetCheckedState();
            } else if (!ViewUtils.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z2 = false;
            }
        } else {
            z2 = isChecked;
        }
        if (z2 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z2);
        e(motionEvent);
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, u0);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        Rect rect = this.s0;
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.g0;
        int i4 = this.i0;
        int i5 = i3 + rect.top;
        int i6 = i4 - rect.bottom;
        Drawable drawable2 = this.f1301z;
        if (drawable != null) {
            if (!this.M || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d2 = DrawableUtils.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d2.left;
                rect.right -= d2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.m0 : this.n0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.l0;
            if (colorStateList != null) {
                this.k0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.k0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i2 = bounds.left + bounds.right;
            } else {
                i2 = getWidth();
            }
            canvas.translate((float) ((i2 / 2) - (layout.getWidth() / 2)), (float) (((i5 + i6) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.N : this.P;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        super.onLayout(z2, i2, i3, i4, i5);
        int i12 = 0;
        if (this.f1301z != null) {
            Rect rect = this.s0;
            Drawable drawable = this.E;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d2 = DrawableUtils.d(this.f1301z);
            i6 = Math.max(0, d2.left - rect.left);
            i12 = Math.max(0, d2.right - rect.right);
        } else {
            i6 = 0;
        }
        if (ViewUtils.b(this)) {
            i8 = getPaddingLeft() + i6;
            i7 = ((this.c0 + i8) - i6) - i12;
        } else {
            i7 = (getWidth() - getPaddingRight()) - i12;
            i8 = (i7 - this.c0) + i6 + i12;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i11 = this.d0;
            i10 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i11 / 2);
        } else if (gravity != 80) {
            i10 = getPaddingTop();
            i11 = this.d0;
        } else {
            i9 = getHeight() - getPaddingBottom();
            i10 = i9 - this.d0;
            this.f0 = i8;
            this.g0 = i10;
            this.i0 = i9;
            this.h0 = i7;
        }
        i9 = i11 + i10;
        this.f0 = i8;
        this.g0 = i10;
        this.i0 = i9;
        this.h0 = i7;
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        if (this.R) {
            if (this.m0 == null) {
                this.m0 = i(this.O);
            }
            if (this.n0 == null) {
                this.n0 = i(this.Q);
            }
        }
        Rect rect = this.s0;
        Drawable drawable = this.f1301z;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i5 = (this.f1301z.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f1301z.getIntrinsicHeight();
        } else {
            i5 = 0;
            i4 = 0;
        }
        this.e0 = Math.max(this.R ? Math.max(this.m0.getWidth(), this.n0.getWidth()) + (this.J * 2) : 0, i5);
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.E.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.f1301z;
        if (drawable3 != null) {
            Rect d2 = DrawableUtils.d(drawable3);
            i7 = Math.max(i7, d2.left);
            i8 = Math.max(i8, d2.right);
        }
        int max = this.j0 ? Math.max(this.K, (this.e0 * 2) + i7 + i8) : this.K;
        int max2 = Math.max(i6, i4);
        this.c0 = max;
        this.d0 = max2;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.N : this.P;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.W
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009d
            r2 = 2
            if (r0 == r1) goto L_0x0089
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x0089
            goto L_0x00b7
        L_0x0016:
            int r0 = r6.S
            if (r0 == r1) goto L_0x0055
            if (r0 == r2) goto L_0x001e
            goto L_0x00b7
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.U
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003b
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            r2 = r3
            goto L_0x003b
        L_0x0038:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L_0x003b:
            boolean r0 = androidx.appcompat.widget.ViewUtils.b(r6)
            if (r0 == 0) goto L_0x0042
            float r2 = -r2
        L_0x0042:
            float r0 = r6.b0
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.b0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0054
            r6.U = r7
            r6.setThumbPosition(r0)
        L_0x0054:
            return r1
        L_0x0055:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.U
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.T
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007b
            float r4 = r6.V
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.T
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b7
        L_0x007b:
            r6.S = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.U = r0
            r6.V = r3
            return r1
        L_0x0089:
            int r0 = r6.S
            if (r0 != r2) goto L_0x0094
            r6.n(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0094:
            r0 = 0
            r6.S = r0
            android.view.VelocityTracker r0 = r6.W
            r0.clear()
            goto L_0x00b7
        L_0x009d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto L_0x00b7
            r6.S = r1
            r6.U = r0
            r6.V = r2
        L_0x00b7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().d(z2);
    }

    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean isChecked = isChecked();
        if (isChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() == null || !ViewCompat.D(this)) {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.o(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().e(z2);
        setTextOnInternal(this.N);
        setTextOffInternal(this.P);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z2) {
        this.j0 = z2;
        invalidate();
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z2) {
        if (this.R != z2) {
            this.R = z2;
            requestLayout();
            if (z2) {
                m();
            }
        }
    }

    public void setSplitTrack(boolean z2) {
        this.M = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.K = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.L = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.k0.getTypeface() != null && !this.k0.getTypeface().equals(typeface)) || (this.k0.getTypeface() == null && typeface != null)) {
            this.k0.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            k();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1301z;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1301z = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.b0 = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(AppCompatResources.b(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.J = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1299A = colorStateList;
        this.C = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1300B = mode;
        this.D = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.E = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(AppCompatResources.b(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.F = colorStateList;
        this.H = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.G = mode;
        this.I = true;
        c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1301z || drawable == this.E;
    }
}
