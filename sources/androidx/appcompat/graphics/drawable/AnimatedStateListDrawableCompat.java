package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat;
import androidx.appcompat.graphics.drawable.StateListDrawableCompat;
import androidx.appcompat.resources.Compatibility;
import androidx.appcompat.resources.R;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class AnimatedStateListDrawableCompat extends StateListDrawableCompat implements TintAwareDrawable {
    public AnimatedStateListState N;
    public Transition O;
    public int P;
    public int Q;
    public boolean R;

    public static class AnimatableTransition extends Transition {

        /* renamed from: a  reason: collision with root package name */
        public final Animatable f702a;

        public AnimatableTransition(Animatable animatable) {
            super();
            this.f702a = animatable;
        }

        public void c() {
            this.f702a.start();
        }

        public void d() {
            this.f702a.stop();
        }
    }

    public static class AnimatedStateListState extends StateListDrawableCompat.StateListState {
        public LongSparseArray K;
        public SparseArrayCompat L;

        public AnimatedStateListState(AnimatedStateListState animatedStateListState, AnimatedStateListDrawableCompat animatedStateListDrawableCompat, Resources resources) {
            super(animatedStateListState, animatedStateListDrawableCompat, resources);
            if (animatedStateListState != null) {
                this.K = animatedStateListState.K;
                this.L = animatedStateListState.L;
                return;
            }
            this.K = new LongSparseArray();
            this.L = new SparseArrayCompat();
        }

        public static long E(int i2, int i3) {
            return ((long) i3) | (((long) i2) << 32);
        }

        public int C(int[] iArr, Drawable drawable, int i2) {
            int A2 = super.A(iArr, drawable);
            this.L.k(A2, Integer.valueOf(i2));
            return A2;
        }

        public int D(int i2, int i3, Drawable drawable, boolean z2) {
            int a2 = super.a(drawable);
            long E = E(i2, i3);
            long j2 = z2 ? 8589934592L : 0;
            long j3 = (long) a2;
            this.K.b(E, Long.valueOf(j3 | j2));
            if (z2) {
                this.K.b(E(i3, i2), Long.valueOf(4294967296L | j3 | j2));
            }
            return a2;
        }

        public int F(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return ((Integer) this.L.h(i2, 0)).intValue();
        }

        public int G(int[] iArr) {
            int B2 = super.B(iArr);
            return B2 >= 0 ? B2 : super.B(StateSet.WILD_CARD);
        }

        public int H(int i2, int i3) {
            return (int) ((Long) this.K.h(E(i2, i3), -1L)).longValue();
        }

        public boolean I(int i2, int i3) {
            return (((Long) this.K.h(E(i2, i3), -1L)).longValue() & 4294967296L) != 0;
        }

        public boolean J(int i2, int i3) {
            return (((Long) this.K.h(E(i2, i3), -1L)).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, (Resources) null);
        }

        public void s() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        public Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }
    }

    public static class AnimatedVectorDrawableTransition extends Transition {

        /* renamed from: a  reason: collision with root package name */
        public final AnimatedVectorDrawableCompat f703a;

        public AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            super();
            this.f703a = animatedVectorDrawableCompat;
        }

        public void c() {
            this.f703a.start();
        }

        public void d() {
            this.f703a.stop();
        }
    }

    public static class AnimationDrawableTransition extends Transition {

        /* renamed from: a  reason: collision with root package name */
        public final ObjectAnimator f704a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f705b;

        public AnimationDrawableTransition(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = 0;
            int i3 = z2 ? numberOfFrames - 1 : 0;
            i2 = !z2 ? numberOfFrames - 1 : i2;
            FrameInterpolator frameInterpolator = new FrameInterpolator(animationDrawable, z2);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i3, i2});
            Compatibility.Api18Impl.a(ofInt, true);
            ofInt.setDuration((long) frameInterpolator.a());
            ofInt.setInterpolator(frameInterpolator);
            this.f705b = z3;
            this.f704a = ofInt;
        }

        public boolean a() {
            return this.f705b;
        }

        public void b() {
            this.f704a.reverse();
        }

        public void c() {
            this.f704a.start();
        }

        public void d() {
            this.f704a.cancel();
        }
    }

    public static class FrameInterpolator implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public int[] f706a;

        /* renamed from: b  reason: collision with root package name */
        public int f707b;

        /* renamed from: c  reason: collision with root package name */
        public int f708c;

        public FrameInterpolator(AnimationDrawable animationDrawable, boolean z2) {
            b(animationDrawable, z2);
        }

        public int a() {
            return this.f708c;
        }

        public int b(AnimationDrawable animationDrawable, boolean z2) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f707b = numberOfFrames;
            int[] iArr = this.f706a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f706a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f706a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z2 ? (numberOfFrames - i3) - 1 : i3);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.f708c = i2;
            return i2;
        }

        public float getInterpolation(float f2) {
            int i2 = (int) ((f2 * ((float) this.f708c)) + 0.5f);
            int i3 = this.f707b;
            int[] iArr = this.f706a;
            int i4 = 0;
            while (i4 < i3) {
                int i5 = iArr[i4];
                if (i2 < i5) {
                    break;
                }
                i2 -= i5;
                i4++;
            }
            return (((float) i4) / ((float) i3)) + (i4 < i3 ? ((float) i2) / ((float) this.f708c) : 0.0f);
        }
    }

    public static abstract class Transition {
        public Transition() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public AnimatedStateListDrawableCompat() {
        this((AnimatedStateListState) null, (Resources) null);
    }

    public static AnimatedStateListDrawableCompat m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            AnimatedStateListDrawableCompat animatedStateListDrawableCompat = new AnimatedStateListDrawableCompat();
            animatedStateListDrawableCompat.n(context, resources, xmlPullParser, attributeSet, theme);
            return animatedStateListDrawableCompat;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    public void h(DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.h(drawableContainerState);
        if (drawableContainerState instanceof AnimatedStateListState) {
            this.N = (AnimatedStateListState) drawableContainerState;
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        Transition transition = this.O;
        if (transition != null) {
            transition.d();
            this.O = null;
            g(this.P);
            this.P = -1;
            this.Q = -1;
        }
    }

    /* renamed from: l */
    public AnimatedStateListState j() {
        return new AnimatedStateListState(this.N, this, (Resources) null);
    }

    public Drawable mutate() {
        if (!this.R && super.mutate() == this) {
            this.N.s();
            this.R = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray i2 = TypedArrayUtils.i(resources, theme, attributeSet, R.styleable.f757a);
        setVisible(i2.getBoolean(R.styleable.f759c, true), true);
        t(i2);
        i(resources);
        i2.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    public final void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    public boolean onStateChange(int[] iArr) {
        int G = this.N.G(iArr);
        boolean z2 = G != c() && (s(G) || g(G));
        Drawable current = getCurrent();
        return current != null ? z2 | current.setState(iArr) : z2;
    }

    public final void p() {
        onStateChange(getState());
    }

    public final int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray i2 = TypedArrayUtils.i(resources, theme, attributeSet, R.styleable.f764h);
        int resourceId = i2.getResourceId(R.styleable.f765i, 0);
        int resourceId2 = i2.getResourceId(R.styleable.f766j, -1);
        Drawable i3 = resourceId2 > 0 ? ResourceManagerInternal.g().i(context, resourceId2) : null;
        i2.recycle();
        int[] k2 = k(attributeSet);
        if (i3 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                i3 = xmlPullParser.getName().equals("vector") ? VectorDrawableCompat.c(resources, xmlPullParser, attributeSet, theme) : Compatibility.Api21Impl.a(resources, xmlPullParser, attributeSet, theme);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (i3 != null) {
            return this.N.C(k2, i3, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    public final int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray i2 = TypedArrayUtils.i(resources, theme, attributeSet, R.styleable.f767k);
        int resourceId = i2.getResourceId(R.styleable.f770n, -1);
        int resourceId2 = i2.getResourceId(R.styleable.f769m, -1);
        int resourceId3 = i2.getResourceId(R.styleable.f768l, -1);
        Drawable i3 = resourceId3 > 0 ? ResourceManagerInternal.g().i(context, resourceId3) : null;
        boolean z2 = i2.getBoolean(R.styleable.f771o, false);
        i2.recycle();
        if (i3 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                i3 = xmlPullParser.getName().equals("animated-vector") ? AnimatedVectorDrawableCompat.a(context, resources, xmlPullParser, attributeSet, theme) : Compatibility.Api21Impl.a(resources, xmlPullParser, attributeSet, theme);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (i3 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.N.D(resourceId, resourceId2, i3, z2);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    public final boolean s(int i2) {
        int i3;
        int H;
        Transition transition;
        Transition transition2 = this.O;
        if (transition2 == null) {
            i3 = c();
        } else if (i2 == this.P) {
            return true;
        } else {
            if (i2 != this.Q || !transition2.a()) {
                i3 = this.P;
                transition2.d();
            } else {
                transition2.b();
                this.P = this.Q;
                this.Q = i2;
                return true;
            }
        }
        this.O = null;
        this.Q = -1;
        this.P = -1;
        AnimatedStateListState animatedStateListState = this.N;
        int F = animatedStateListState.F(i3);
        int F2 = animatedStateListState.F(i2);
        if (F2 == 0 || F == 0 || (H = animatedStateListState.H(F, F2)) < 0) {
            return false;
        }
        boolean J = animatedStateListState.J(F, F2);
        g(H);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            transition = new AnimationDrawableTransition((AnimationDrawable) current, animatedStateListState.I(F, F2), J);
        } else if (current instanceof AnimatedVectorDrawableCompat) {
            transition = new AnimatedVectorDrawableTransition((AnimatedVectorDrawableCompat) current);
        } else {
            if (current instanceof Animatable) {
                transition = new AnimatableTransition((Animatable) current);
            }
            return false;
        }
        transition.c();
        this.O = transition;
        this.Q = i3;
        this.P = i2;
        return true;
    }

    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Transition transition = this.O;
        if (transition != null && (visible || z3)) {
            if (z2) {
                transition.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public final void t(TypedArray typedArray) {
        AnimatedStateListState animatedStateListState = this.N;
        animatedStateListState.f719d |= Compatibility.Api21Impl.b(typedArray);
        animatedStateListState.y(typedArray.getBoolean(R.styleable.f760d, animatedStateListState.f724i));
        animatedStateListState.u(typedArray.getBoolean(R.styleable.f761e, animatedStateListState.f727l));
        animatedStateListState.v(typedArray.getInt(R.styleable.f762f, animatedStateListState.f714A));
        animatedStateListState.w(typedArray.getInt(R.styleable.f763g, animatedStateListState.f715B));
        setDither(typedArray.getBoolean(R.styleable.f758b, animatedStateListState.f739x));
    }

    public AnimatedStateListDrawableCompat(AnimatedStateListState animatedStateListState, Resources resources) {
        super((StateListDrawableCompat.StateListState) null);
        this.P = -1;
        this.Q = -1;
        h(new AnimatedStateListState(animatedStateListState, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
