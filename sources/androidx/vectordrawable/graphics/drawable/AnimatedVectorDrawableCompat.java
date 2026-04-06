package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.collection.ArrayMap;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class AnimatedVectorDrawableCompat extends VectorDrawableCommon implements Animatable2Compat {

    /* renamed from: A  reason: collision with root package name */
    public AnimatedVectorDrawableCompatState f22961A;

    /* renamed from: B  reason: collision with root package name */
    public Context f22962B;
    public ArgbEvaluator C;
    public Animator.AnimatorListener D;
    public ArrayList E;
    public final Drawable.Callback F;

    /* renamed from: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$2  reason: invalid class name */
    class AnonymousClass2 extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AnimatedVectorDrawableCompat f22964a;

        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(this.f22964a.E);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Animatable2Compat.AnimationCallback) arrayList.get(i2)).a(this.f22964a);
            }
        }

        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(this.f22964a.E);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Animatable2Compat.AnimationCallback) arrayList.get(i2)).b(this.f22964a);
            }
        }
    }

    public static class AnimatedVectorDrawableCompatState extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f22965a;

        /* renamed from: b  reason: collision with root package name */
        public VectorDrawableCompat f22966b;

        /* renamed from: c  reason: collision with root package name */
        public AnimatorSet f22967c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList f22968d;

        /* renamed from: e  reason: collision with root package name */
        public ArrayMap f22969e;

        public AnimatedVectorDrawableCompatState(Context context, AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState, Drawable.Callback callback, Resources resources) {
            if (animatedVectorDrawableCompatState != null) {
                this.f22965a = animatedVectorDrawableCompatState.f22965a;
                VectorDrawableCompat vectorDrawableCompat = animatedVectorDrawableCompatState.f22966b;
                if (vectorDrawableCompat != null) {
                    Drawable.ConstantState constantState = vectorDrawableCompat.getConstantState();
                    if (resources != null) {
                        this.f22966b = (VectorDrawableCompat) constantState.newDrawable(resources);
                    } else {
                        this.f22966b = (VectorDrawableCompat) constantState.newDrawable();
                    }
                    VectorDrawableCompat vectorDrawableCompat2 = (VectorDrawableCompat) this.f22966b.mutate();
                    this.f22966b = vectorDrawableCompat2;
                    vectorDrawableCompat2.setCallback(callback);
                    this.f22966b.setBounds(animatedVectorDrawableCompatState.f22966b.getBounds());
                    this.f22966b.h(false);
                }
                ArrayList arrayList = animatedVectorDrawableCompatState.f22968d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f22968d = new ArrayList(size);
                    this.f22969e = new ArrayMap(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = (Animator) animatedVectorDrawableCompatState.f22968d.get(i2);
                        Animator clone = animator.clone();
                        String str = (String) animatedVectorDrawableCompatState.f22969e.get(animator);
                        clone.setTarget(this.f22966b.d(str));
                        this.f22968d.add(clone);
                        this.f22969e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f22967c == null) {
                this.f22967c = new AnimatorSet();
            }
            this.f22967c.playTogether(this.f22968d);
        }

        public int getChangingConfigurations() {
            return this.f22965a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public AnimatedVectorDrawableCompat() {
        this((Context) null, (AnimatedVectorDrawableCompatState) null, (Resources) null);
    }

    public static AnimatedVectorDrawableCompat a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
        animatedVectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return animatedVectorDrawableCompat;
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            DrawableCompat.a(drawable, theme);
        }
    }

    public final void b(String str, Animator animator) {
        animator.setTarget(this.f22961A.f22966b.d(str));
        AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState = this.f22961A;
        if (animatedVectorDrawableCompatState.f22968d == null) {
            animatedVectorDrawableCompatState.f22968d = new ArrayList();
            this.f22961A.f22969e = new ArrayMap();
        }
        this.f22961A.f22968d.add(animator);
        this.f22961A.f22969e.put(animator, str);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            return DrawableCompat.b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f22961A.f22966b.draw(canvas);
        if (this.f22961A.f22967c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f22975z;
        return drawable != null ? DrawableCompat.c(drawable) : this.f22961A.f22966b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f22975z;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f22961A.f22965a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f22975z;
        return drawable != null ? DrawableCompat.d(drawable) : this.f22961A.f22966b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f22975z != null) {
            return new AnimatedVectorDrawableDelegateState(this.f22975z.getConstantState());
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f22975z;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f22961A.f22966b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f22975z;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f22961A.f22966b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f22975z;
        return drawable != null ? drawable.getOpacity() : this.f22961A.f22966b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            DrawableCompat.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray i2 = TypedArrayUtils.i(resources, theme, attributeSet, AndroidResources.f22952e);
                    int resourceId = i2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        VectorDrawableCompat b2 = VectorDrawableCompat.b(resources, resourceId, theme);
                        b2.h(false);
                        b2.setCallback(this.F);
                        VectorDrawableCompat vectorDrawableCompat = this.f22961A.f22966b;
                        if (vectorDrawableCompat != null) {
                            vectorDrawableCompat.setCallback((Drawable.Callback) null);
                        }
                        this.f22961A.f22966b = b2;
                    }
                    i2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AndroidResources.f22953f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f22962B;
                        if (context != null) {
                            b(string, AnimatorInflaterCompat.a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f22961A.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f22975z;
        return drawable != null ? DrawableCompat.g(drawable) : this.f22961A.f22966b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f22975z;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f22961A.f22967c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f22975z;
        return drawable != null ? drawable.isStateful() : this.f22961A.f22966b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f22961A.f22966b.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f22975z;
        return drawable != null ? drawable.setLevel(i2) : this.f22961A.f22966b.setLevel(i2);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f22975z;
        return drawable != null ? drawable.setState(iArr) : this.f22961A.f22966b.setState(iArr);
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f22961A.f22966b.setAlpha(i2);
        }
    }

    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            DrawableCompat.i(drawable, z2);
        } else {
            this.f22961A.f22966b.setAutoMirrored(z2);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z2) {
        super.setFilterBitmap(z2);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i2) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            DrawableCompat.m(drawable, i2);
        } else {
            this.f22961A.f22966b.setTint(i2);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            DrawableCompat.n(drawable, colorStateList);
        } else {
            this.f22961A.f22966b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            DrawableCompat.o(drawable, mode);
        } else {
            this.f22961A.f22966b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f22961A.f22966b.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    public void start() {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f22961A.f22967c.isStarted()) {
            this.f22961A.f22967c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f22961A.f22967c.end();
        }
    }

    public AnimatedVectorDrawableCompat(Context context) {
        this(context, (AnimatedVectorDrawableCompatState) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f22961A.f22966b.setColorFilter(colorFilter);
        }
    }

    public static class AnimatedVectorDrawableDelegateState extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f22970a;

        public AnimatedVectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.f22970a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f22970a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f22970a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f22970a.newDrawable();
            animatedVectorDrawableCompat.f22975z = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.F);
            return animatedVectorDrawableCompat;
        }

        public Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f22970a.newDrawable(resources);
            animatedVectorDrawableCompat.f22975z = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.F);
            return animatedVectorDrawableCompat;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f22970a.newDrawable(resources, theme);
            animatedVectorDrawableCompat.f22975z = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.F);
            return animatedVectorDrawableCompat;
        }
    }

    public AnimatedVectorDrawableCompat(Context context, AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState, Resources resources) {
        this.C = null;
        this.D = null;
        this.E = null;
        AnonymousClass1 r0 = new Drawable.Callback() {
            public void invalidateDrawable(Drawable drawable) {
                AnimatedVectorDrawableCompat.this.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
                AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j2);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
            }
        };
        this.F = r0;
        this.f22962B = context;
        if (animatedVectorDrawableCompatState != null) {
            this.f22961A = animatedVectorDrawableCompatState;
        } else {
            this.f22961A = new AnimatedVectorDrawableCompatState(context, animatedVectorDrawableCompatState, r0, resources);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
