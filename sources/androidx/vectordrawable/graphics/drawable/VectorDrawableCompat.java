package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.drawable.DrawableCompat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class VectorDrawableCompat extends VectorDrawableCommon {
    public static final PorterDuff.Mode J = PorterDuff.Mode.SRC_IN;

    /* renamed from: A  reason: collision with root package name */
    public VectorDrawableCompatState f22976A;

    /* renamed from: B  reason: collision with root package name */
    public PorterDuffColorFilter f22977B;
    public ColorFilter C;
    public boolean D;
    public boolean E;
    public Drawable.ConstantState F;
    public final float[] G;
    public final Matrix H;
    public final Rect I;

    public static class VClipPath extends VPath {
        public VClipPath() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f23004b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f23003a = PathParser.d(string2);
            }
            this.f23005c = TypedArrayUtils.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (TypedArrayUtils.h(xmlPullParser, "pathData")) {
                TypedArray i2 = TypedArrayUtils.i(resources, theme, attributeSet, AndroidResources.f22951d);
                f(i2, xmlPullParser);
                i2.recycle();
            }
        }

        public VClipPath(VClipPath vClipPath) {
            super(vClipPath);
        }
    }

    public static abstract class VObject {
        public VObject() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static class VectorDrawableCompatState extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f23024a;

        /* renamed from: b  reason: collision with root package name */
        public VPathRenderer f23025b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f23026c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f23027d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f23028e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f23029f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f23030g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f23031h;

        /* renamed from: i  reason: collision with root package name */
        public int f23032i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f23033j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f23034k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f23035l;

        public VectorDrawableCompatState(VectorDrawableCompatState vectorDrawableCompatState) {
            this.f23026c = null;
            this.f23027d = VectorDrawableCompat.J;
            if (vectorDrawableCompatState != null) {
                this.f23024a = vectorDrawableCompatState.f23024a;
                VPathRenderer vPathRenderer = new VPathRenderer(vectorDrawableCompatState.f23025b);
                this.f23025b = vPathRenderer;
                if (vectorDrawableCompatState.f23025b.f23012e != null) {
                    vPathRenderer.f23012e = new Paint(vectorDrawableCompatState.f23025b.f23012e);
                }
                if (vectorDrawableCompatState.f23025b.f23011d != null) {
                    this.f23025b.f23011d = new Paint(vectorDrawableCompatState.f23025b.f23011d);
                }
                this.f23026c = vectorDrawableCompatState.f23026c;
                this.f23027d = vectorDrawableCompatState.f23027d;
                this.f23028e = vectorDrawableCompatState.f23028e;
            }
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f23029f.getWidth() && i3 == this.f23029f.getHeight();
        }

        public boolean b() {
            return !this.f23034k && this.f23030g == this.f23026c && this.f23031h == this.f23027d && this.f23033j == this.f23028e && this.f23032i == this.f23025b.getRootAlpha();
        }

        public void c(int i2, int i3) {
            if (this.f23029f == null || !a(i2, i3)) {
                this.f23029f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.f23034k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f23029f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f23035l == null) {
                Paint paint = new Paint();
                this.f23035l = paint;
                paint.setFilterBitmap(true);
            }
            this.f23035l.setAlpha(this.f23025b.getRootAlpha());
            this.f23035l.setColorFilter(colorFilter);
            return this.f23035l;
        }

        public boolean f() {
            return this.f23025b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f23025b.f();
        }

        public int getChangingConfigurations() {
            return this.f23024a;
        }

        public boolean h(int[] iArr) {
            boolean g2 = this.f23025b.g(iArr);
            this.f23034k |= g2;
            return g2;
        }

        public void i() {
            this.f23030g = this.f23026c;
            this.f23031h = this.f23027d;
            this.f23032i = this.f23025b.getRootAlpha();
            this.f23033j = this.f23028e;
            this.f23034k = false;
        }

        public void j(int i2, int i3) {
            this.f23029f.eraseColor(0);
            this.f23025b.b(new Canvas(this.f23029f), i2, i3, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }

        public VectorDrawableCompatState() {
            this.f23026c = null;
            this.f23027d = VectorDrawableCompat.J;
            this.f23025b = new VPathRenderer();
        }
    }

    public VectorDrawableCompat() {
        this.E = true;
        this.G = new float[9];
        this.H = new Matrix();
        this.I = new Rect();
        this.f22976A = new VectorDrawableCompatState();
    }

    public static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (((float) Color.alpha(i2)) * f2)) << 24);
    }

    public static VectorDrawableCompat b(Resources resources, int i2, Resources.Theme theme) {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.f22975z = ResourcesCompat.d(resources, i2, theme);
        vectorDrawableCompat.F = new VectorDrawableDelegateState(vectorDrawableCompat.f22975z.getConstantState());
        return vectorDrawableCompat;
    }

    public static VectorDrawableCompat c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    public static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f22975z;
        if (drawable == null) {
            return false;
        }
        DrawableCompat.b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public Object d(String str) {
        return this.f22976A.f23025b.f23023p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.I);
        if (this.I.width() > 0 && this.I.height() > 0) {
            ColorFilter colorFilter = this.C;
            if (colorFilter == null) {
                colorFilter = this.f22977B;
            }
            canvas.getMatrix(this.H);
            this.H.getValues(this.G);
            float abs = Math.abs(this.G[0]);
            float abs2 = Math.abs(this.G[4]);
            float abs3 = Math.abs(this.G[1]);
            float abs4 = Math.abs(this.G[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.I.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.I.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.I;
                canvas.translate((float) rect.left, (float) rect.top);
                if (f()) {
                    canvas.translate((float) this.I.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.I.offsetTo(0, 0);
                this.f22976A.c(min, min2);
                if (!this.E) {
                    this.f22976A.j(min, min2);
                } else if (!this.f22976A.b()) {
                    this.f22976A.j(min, min2);
                    this.f22976A.i();
                }
                this.f22976A.d(canvas, colorFilter, this.I);
                canvas.restoreToCount(save);
            }
        }
    }

    public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        VectorDrawableCompatState vectorDrawableCompatState = this.f22976A;
        VPathRenderer vPathRenderer = vectorDrawableCompatState.f23025b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(vPathRenderer.f23015h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                VGroup vGroup = (VGroup) arrayDeque.peek();
                if ("path".equals(name)) {
                    VFullPath vFullPath = new VFullPath();
                    vFullPath.g(resources, attributeSet, theme, xmlPullParser);
                    vGroup.f22991b.add(vFullPath);
                    if (vFullPath.getPathName() != null) {
                        vPathRenderer.f23023p.put(vFullPath.getPathName(), vFullPath);
                    }
                    vectorDrawableCompatState.f23024a = vFullPath.f23006d | vectorDrawableCompatState.f23024a;
                    z2 = false;
                } else if ("clip-path".equals(name)) {
                    VClipPath vClipPath = new VClipPath();
                    vClipPath.e(resources, attributeSet, theme, xmlPullParser);
                    vGroup.f22991b.add(vClipPath);
                    if (vClipPath.getPathName() != null) {
                        vPathRenderer.f23023p.put(vClipPath.getPathName(), vClipPath);
                    }
                    vectorDrawableCompatState.f23024a = vClipPath.f23006d | vectorDrawableCompatState.f23024a;
                } else if ("group".equals(name)) {
                    VGroup vGroup2 = new VGroup();
                    vGroup2.c(resources, attributeSet, theme, xmlPullParser);
                    vGroup.f22991b.add(vGroup2);
                    arrayDeque.push(vGroup2);
                    if (vGroup2.getGroupName() != null) {
                        vPathRenderer.f23023p.put(vGroup2.getGroupName(), vGroup2);
                    }
                    vectorDrawableCompatState.f23024a = vGroup2.f23000k | vectorDrawableCompatState.f23024a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public final boolean f() {
        return isAutoMirrored() && DrawableCompat.e(this) == 1;
    }

    public int getAlpha() {
        Drawable drawable = this.f22975z;
        return drawable != null ? DrawableCompat.c(drawable) : this.f22976A.f23025b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f22975z;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f22976A.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f22975z;
        return drawable != null ? DrawableCompat.d(drawable) : this.C;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f22975z != null) {
            return new VectorDrawableDelegateState(this.f22975z.getConstantState());
        }
        this.f22976A.f23024a = getChangingConfigurations();
        return this.f22976A;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f22975z;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f22976A.f23025b.f23017j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f22975z;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f22976A.f23025b.f23016i;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
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

    public void h(boolean z2) {
        this.E = z2;
    }

    public final void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        VectorDrawableCompatState vectorDrawableCompatState = this.f22976A;
        VPathRenderer vPathRenderer = vectorDrawableCompatState.f23025b;
        vectorDrawableCompatState.f23027d = g(TypedArrayUtils.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c2 = TypedArrayUtils.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c2 != null) {
            vectorDrawableCompatState.f23026c = c2;
        }
        vectorDrawableCompatState.f23028e = TypedArrayUtils.a(typedArray, xmlPullParser, "autoMirrored", 5, vectorDrawableCompatState.f23028e);
        vPathRenderer.f23018k = TypedArrayUtils.f(typedArray, xmlPullParser, "viewportWidth", 7, vPathRenderer.f23018k);
        float f2 = TypedArrayUtils.f(typedArray, xmlPullParser, "viewportHeight", 8, vPathRenderer.f23019l);
        vPathRenderer.f23019l = f2;
        if (vPathRenderer.f23018k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f2 > 0.0f) {
            vPathRenderer.f23016i = typedArray.getDimension(3, vPathRenderer.f23016i);
            float dimension = typedArray.getDimension(2, vPathRenderer.f23017j);
            vPathRenderer.f23017j = dimension;
            if (vPathRenderer.f23016i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                vPathRenderer.setAlpha(TypedArrayUtils.f(typedArray, xmlPullParser, "alpha", 4, vPathRenderer.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    vPathRenderer.f23021n = string;
                    vPathRenderer.f23023p.put(string, vPathRenderer);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f22975z;
        return drawable != null ? DrawableCompat.g(drawable) : this.f22976A.f23028e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f22976A.f23026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f22976A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f22975z
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.f22976A
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.f22976A
            android.content.res.ColorStateList r0 = r0.f23026c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.isStateful():boolean");
    }

    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.D && super.mutate() == this) {
            this.f22976A = new VectorDrawableCompatState(this.f22976A);
            this.D = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f22976A;
        ColorStateList colorStateList = vectorDrawableCompatState.f23026c;
        if (colorStateList == null || (mode = vectorDrawableCompatState.f23027d) == null) {
            z2 = false;
        } else {
            this.f22977B = j(this.f22977B, colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        if (!vectorDrawableCompatState.g() || !vectorDrawableCompatState.h(iArr)) {
            return z2;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f22976A.f23025b.getRootAlpha() != i2) {
            this.f22976A.f23025b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            DrawableCompat.i(drawable, z2);
        } else {
            this.f22976A.f23028e = z2;
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
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            DrawableCompat.n(drawable, colorStateList);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f22976A;
        if (vectorDrawableCompatState.f23026c != colorStateList) {
            vectorDrawableCompatState.f23026c = colorStateList;
            this.f22977B = j(this.f22977B, colorStateList, vectorDrawableCompatState.f23027d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            DrawableCompat.o(drawable, mode);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f22976A;
        if (vectorDrawableCompatState.f23027d != mode) {
            vectorDrawableCompatState.f23027d = mode;
            this.f22977B = j(this.f22977B, vectorDrawableCompatState.f23026c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f22975z;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class VectorDrawableDelegateState extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f23036a;

        public VectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.f23036a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f23036a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f23036a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f22975z = (VectorDrawable) this.f23036a.newDrawable();
            return vectorDrawableCompat;
        }

        public Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f22975z = (VectorDrawable) this.f23036a.newDrawable(resources);
            return vectorDrawableCompat;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f22975z = (VectorDrawable) this.f23036a.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.C = colorFilter;
        invalidateSelf();
    }

    public static abstract class VPath extends VObject {

        /* renamed from: a  reason: collision with root package name */
        public PathParser.PathDataNode[] f23003a = null;

        /* renamed from: b  reason: collision with root package name */
        public String f23004b;

        /* renamed from: c  reason: collision with root package name */
        public int f23005c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f23006d;

        public VPath() {
            super();
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            PathParser.PathDataNode[] pathDataNodeArr = this.f23003a;
            if (pathDataNodeArr != null) {
                PathParser.PathDataNode.i(pathDataNodeArr, path);
            }
        }

        public PathParser.PathDataNode[] getPathData() {
            return this.f23003a;
        }

        public String getPathName() {
            return this.f23004b;
        }

        public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            if (!PathParser.b(this.f23003a, pathDataNodeArr)) {
                this.f23003a = PathParser.e(pathDataNodeArr);
            } else {
                PathParser.j(this.f23003a, pathDataNodeArr);
            }
        }

        public VPath(VPath vPath) {
            super();
            this.f23004b = vPath.f23004b;
            this.f23006d = vPath.f23006d;
            this.f23003a = PathParser.e(vPath.f23003a);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f22975z;
        if (drawable != null) {
            DrawableCompat.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f22976A;
        vectorDrawableCompatState.f23025b = new VPathRenderer();
        TypedArray i2 = TypedArrayUtils.i(resources, theme, attributeSet, AndroidResources.f22948a);
        i(i2, xmlPullParser, theme);
        i2.recycle();
        vectorDrawableCompatState.f23024a = getChangingConfigurations();
        vectorDrawableCompatState.f23034k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f22977B = j(this.f22977B, vectorDrawableCompatState.f23026c, vectorDrawableCompatState.f23027d);
    }

    public VectorDrawableCompat(VectorDrawableCompatState vectorDrawableCompatState) {
        this.E = true;
        this.G = new float[9];
        this.H = new Matrix();
        this.I = new Rect();
        this.f22976A = vectorDrawableCompatState;
        this.f22977B = j(this.f22977B, vectorDrawableCompatState.f23026c, vectorDrawableCompatState.f23027d);
    }

    public static class VFullPath extends VPath {

        /* renamed from: e  reason: collision with root package name */
        public int[] f22978e;

        /* renamed from: f  reason: collision with root package name */
        public ComplexColorCompat f22979f;

        /* renamed from: g  reason: collision with root package name */
        public float f22980g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        public ComplexColorCompat f22981h;

        /* renamed from: i  reason: collision with root package name */
        public float f22982i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f22983j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f22984k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f22985l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        public float f22986m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        public Paint.Cap f22987n = Paint.Cap.BUTT;

        /* renamed from: o  reason: collision with root package name */
        public Paint.Join f22988o = Paint.Join.MITER;

        /* renamed from: p  reason: collision with root package name */
        public float f22989p = 4.0f;

        public VFullPath() {
        }

        public boolean a() {
            return this.f22981h.i() || this.f22979f.i();
        }

        public boolean b(int[] iArr) {
            return this.f22979f.j(iArr) | this.f22981h.j(iArr);
        }

        public final Paint.Cap e(int i2, Paint.Cap cap) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        public final Paint.Join f(int i2, Paint.Join join) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray i2 = TypedArrayUtils.i(resources, theme, attributeSet, AndroidResources.f22950c);
            h(i2, xmlPullParser, theme);
            i2.recycle();
        }

        public float getFillAlpha() {
            return this.f22983j;
        }

        public int getFillColor() {
            return this.f22981h.e();
        }

        public float getStrokeAlpha() {
            return this.f22982i;
        }

        public int getStrokeColor() {
            return this.f22979f.e();
        }

        public float getStrokeWidth() {
            return this.f22980g;
        }

        public float getTrimPathEnd() {
            return this.f22985l;
        }

        public float getTrimPathOffset() {
            return this.f22986m;
        }

        public float getTrimPathStart() {
            return this.f22984k;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f22978e = null;
            if (TypedArrayUtils.h(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f23004b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f23003a = PathParser.d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f22981h = TypedArrayUtils.e(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f22983j = TypedArrayUtils.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f22983j);
                this.f22987n = e(TypedArrayUtils.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f22987n);
                this.f22988o = f(TypedArrayUtils.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f22988o);
                this.f22989p = TypedArrayUtils.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f22989p);
                this.f22979f = TypedArrayUtils.e(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f22982i = TypedArrayUtils.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f22982i);
                this.f22980g = TypedArrayUtils.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f22980g);
                this.f22985l = TypedArrayUtils.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f22985l);
                this.f22986m = TypedArrayUtils.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f22986m);
                this.f22984k = TypedArrayUtils.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f22984k);
                this.f23005c = TypedArrayUtils.g(typedArray, xmlPullParser, "fillType", 13, this.f23005c);
            }
        }

        public void setFillAlpha(float f2) {
            this.f22983j = f2;
        }

        public void setFillColor(int i2) {
            this.f22981h.k(i2);
        }

        public void setStrokeAlpha(float f2) {
            this.f22982i = f2;
        }

        public void setStrokeColor(int i2) {
            this.f22979f.k(i2);
        }

        public void setStrokeWidth(float f2) {
            this.f22980g = f2;
        }

        public void setTrimPathEnd(float f2) {
            this.f22985l = f2;
        }

        public void setTrimPathOffset(float f2) {
            this.f22986m = f2;
        }

        public void setTrimPathStart(float f2) {
            this.f22984k = f2;
        }

        public VFullPath(VFullPath vFullPath) {
            super(vFullPath);
            this.f22978e = vFullPath.f22978e;
            this.f22979f = vFullPath.f22979f;
            this.f22980g = vFullPath.f22980g;
            this.f22982i = vFullPath.f22982i;
            this.f22981h = vFullPath.f22981h;
            this.f23005c = vFullPath.f23005c;
            this.f22983j = vFullPath.f22983j;
            this.f22984k = vFullPath.f22984k;
            this.f22985l = vFullPath.f22985l;
            this.f22986m = vFullPath.f22986m;
            this.f22987n = vFullPath.f22987n;
            this.f22988o = vFullPath.f22988o;
            this.f22989p = vFullPath.f22989p;
        }
    }

    public static class VPathRenderer {

        /* renamed from: q  reason: collision with root package name */
        public static final Matrix f23007q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f23008a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f23009b;

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f23010c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f23011d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f23012e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f23013f;

        /* renamed from: g  reason: collision with root package name */
        public int f23014g;

        /* renamed from: h  reason: collision with root package name */
        public final VGroup f23015h;

        /* renamed from: i  reason: collision with root package name */
        public float f23016i;

        /* renamed from: j  reason: collision with root package name */
        public float f23017j;

        /* renamed from: k  reason: collision with root package name */
        public float f23018k;

        /* renamed from: l  reason: collision with root package name */
        public float f23019l;

        /* renamed from: m  reason: collision with root package name */
        public int f23020m;

        /* renamed from: n  reason: collision with root package name */
        public String f23021n;

        /* renamed from: o  reason: collision with root package name */
        public Boolean f23022o;

        /* renamed from: p  reason: collision with root package name */
        public final ArrayMap f23023p;

        public VPathRenderer() {
            this.f23010c = new Matrix();
            this.f23016i = 0.0f;
            this.f23017j = 0.0f;
            this.f23018k = 0.0f;
            this.f23019l = 0.0f;
            this.f23020m = 255;
            this.f23021n = null;
            this.f23022o = null;
            this.f23023p = new ArrayMap();
            this.f23015h = new VGroup();
            this.f23008a = new Path();
            this.f23009b = new Path();
        }

        public static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        public void b(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            c(this.f23015h, f23007q, canvas, i2, i3, colorFilter);
        }

        public final void c(VGroup vGroup, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            vGroup.f22990a.set(matrix);
            vGroup.f22990a.preConcat(vGroup.f22999j);
            canvas.save();
            for (int i4 = 0; i4 < vGroup.f22991b.size(); i4++) {
                VObject vObject = (VObject) vGroup.f22991b.get(i4);
                if (vObject instanceof VGroup) {
                    c((VGroup) vObject, vGroup.f22990a, canvas, i2, i3, colorFilter);
                } else if (vObject instanceof VPath) {
                    d(vGroup, (VPath) vObject, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        public final void d(VGroup vGroup, VPath vPath, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = ((float) i2) / this.f23018k;
            float f3 = ((float) i3) / this.f23019l;
            float min = Math.min(f2, f3);
            Matrix matrix = vGroup.f22990a;
            this.f23010c.set(matrix);
            this.f23010c.postScale(f2, f3);
            float e2 = e(matrix);
            if (e2 != 0.0f) {
                vPath.d(this.f23008a);
                Path path = this.f23008a;
                this.f23009b.reset();
                if (vPath.c()) {
                    this.f23009b.setFillType(vPath.f23005c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f23009b.addPath(path, this.f23010c);
                    canvas.clipPath(this.f23009b);
                    return;
                }
                VFullPath vFullPath = (VFullPath) vPath;
                float f4 = vFullPath.f22984k;
                if (!(f4 == 0.0f && vFullPath.f22985l == 1.0f)) {
                    float f5 = vFullPath.f22986m;
                    float f6 = (f4 + f5) % 1.0f;
                    float f7 = (vFullPath.f22985l + f5) % 1.0f;
                    if (this.f23013f == null) {
                        this.f23013f = new PathMeasure();
                    }
                    this.f23013f.setPath(this.f23008a, false);
                    float length = this.f23013f.getLength();
                    float f8 = f6 * length;
                    float f9 = f7 * length;
                    path.reset();
                    if (f8 > f9) {
                        this.f23013f.getSegment(f8, length, path, true);
                        this.f23013f.getSegment(0.0f, f9, path, true);
                    } else {
                        this.f23013f.getSegment(f8, f9, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f23009b.addPath(path, this.f23010c);
                if (vFullPath.f22981h.l()) {
                    ComplexColorCompat complexColorCompat = vFullPath.f22981h;
                    if (this.f23012e == null) {
                        Paint paint = new Paint(1);
                        this.f23012e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f23012e;
                    if (complexColorCompat.h()) {
                        Shader f10 = complexColorCompat.f();
                        f10.setLocalMatrix(this.f23010c);
                        paint2.setShader(f10);
                        paint2.setAlpha(Math.round(vFullPath.f22983j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(VectorDrawableCompat.a(complexColorCompat.e(), vFullPath.f22983j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f23009b.setFillType(vFullPath.f23005c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f23009b, paint2);
                }
                if (vFullPath.f22979f.l()) {
                    ComplexColorCompat complexColorCompat2 = vFullPath.f22979f;
                    if (this.f23011d == null) {
                        Paint paint3 = new Paint(1);
                        this.f23011d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f23011d;
                    Paint.Join join = vFullPath.f22988o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = vFullPath.f22987n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(vFullPath.f22989p);
                    if (complexColorCompat2.h()) {
                        Shader f11 = complexColorCompat2.f();
                        f11.setLocalMatrix(this.f23010c);
                        paint4.setShader(f11);
                        paint4.setAlpha(Math.round(vFullPath.f22982i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(VectorDrawableCompat.a(complexColorCompat2.e(), vFullPath.f22982i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(vFullPath.f22980g * min * e2);
                    canvas.drawPath(this.f23009b, paint4);
                }
            }
        }

        public final float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a2) / max;
            }
            return 0.0f;
        }

        public boolean f() {
            if (this.f23022o == null) {
                this.f23022o = Boolean.valueOf(this.f23015h.a());
            }
            return this.f23022o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f23015h.b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f23020m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f23020m = i2;
        }

        public VPathRenderer(VPathRenderer vPathRenderer) {
            this.f23010c = new Matrix();
            this.f23016i = 0.0f;
            this.f23017j = 0.0f;
            this.f23018k = 0.0f;
            this.f23019l = 0.0f;
            this.f23020m = 255;
            this.f23021n = null;
            this.f23022o = null;
            ArrayMap arrayMap = new ArrayMap();
            this.f23023p = arrayMap;
            this.f23015h = new VGroup(vPathRenderer.f23015h, arrayMap);
            this.f23008a = new Path(vPathRenderer.f23008a);
            this.f23009b = new Path(vPathRenderer.f23009b);
            this.f23016i = vPathRenderer.f23016i;
            this.f23017j = vPathRenderer.f23017j;
            this.f23018k = vPathRenderer.f23018k;
            this.f23019l = vPathRenderer.f23019l;
            this.f23014g = vPathRenderer.f23014g;
            this.f23020m = vPathRenderer.f23020m;
            this.f23021n = vPathRenderer.f23021n;
            String str = vPathRenderer.f23021n;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.f23022o = vPathRenderer.f23022o;
        }
    }

    public static class VGroup extends VObject {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f22990a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f22991b;

        /* renamed from: c  reason: collision with root package name */
        public float f22992c;

        /* renamed from: d  reason: collision with root package name */
        public float f22993d;

        /* renamed from: e  reason: collision with root package name */
        public float f22994e;

        /* renamed from: f  reason: collision with root package name */
        public float f22995f;

        /* renamed from: g  reason: collision with root package name */
        public float f22996g;

        /* renamed from: h  reason: collision with root package name */
        public float f22997h;

        /* renamed from: i  reason: collision with root package name */
        public float f22998i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f22999j;

        /* renamed from: k  reason: collision with root package name */
        public int f23000k;

        /* renamed from: l  reason: collision with root package name */
        public int[] f23001l;

        /* renamed from: m  reason: collision with root package name */
        public String f23002m;

        public VGroup(VGroup vGroup, ArrayMap arrayMap) {
            super();
            VPath vPath;
            this.f22990a = new Matrix();
            this.f22991b = new ArrayList();
            this.f22992c = 0.0f;
            this.f22993d = 0.0f;
            this.f22994e = 0.0f;
            this.f22995f = 1.0f;
            this.f22996g = 1.0f;
            this.f22997h = 0.0f;
            this.f22998i = 0.0f;
            Matrix matrix = new Matrix();
            this.f22999j = matrix;
            this.f23002m = null;
            this.f22992c = vGroup.f22992c;
            this.f22993d = vGroup.f22993d;
            this.f22994e = vGroup.f22994e;
            this.f22995f = vGroup.f22995f;
            this.f22996g = vGroup.f22996g;
            this.f22997h = vGroup.f22997h;
            this.f22998i = vGroup.f22998i;
            this.f23001l = vGroup.f23001l;
            String str = vGroup.f23002m;
            this.f23002m = str;
            this.f23000k = vGroup.f23000k;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(vGroup.f22999j);
            ArrayList arrayList = vGroup.f22991b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj = arrayList.get(i2);
                if (obj instanceof VGroup) {
                    this.f22991b.add(new VGroup((VGroup) obj, arrayMap));
                } else {
                    if (obj instanceof VFullPath) {
                        vPath = new VFullPath((VFullPath) obj);
                    } else if (obj instanceof VClipPath) {
                        vPath = new VClipPath((VClipPath) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f22991b.add(vPath);
                    String str2 = vPath.f23004b;
                    if (str2 != null) {
                        arrayMap.put(str2, vPath);
                    }
                }
            }
        }

        public boolean a() {
            for (int i2 = 0; i2 < this.f22991b.size(); i2++) {
                if (((VObject) this.f22991b.get(i2)).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z2 = false;
            for (int i2 = 0; i2 < this.f22991b.size(); i2++) {
                z2 |= ((VObject) this.f22991b.get(i2)).b(iArr);
            }
            return z2;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray i2 = TypedArrayUtils.i(resources, theme, attributeSet, AndroidResources.f22949b);
            e(i2, xmlPullParser);
            i2.recycle();
        }

        public final void d() {
            this.f22999j.reset();
            this.f22999j.postTranslate(-this.f22993d, -this.f22994e);
            this.f22999j.postScale(this.f22995f, this.f22996g);
            this.f22999j.postRotate(this.f22992c, 0.0f, 0.0f);
            this.f22999j.postTranslate(this.f22997h + this.f22993d, this.f22998i + this.f22994e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f23001l = null;
            this.f22992c = TypedArrayUtils.f(typedArray, xmlPullParser, "rotation", 5, this.f22992c);
            this.f22993d = typedArray.getFloat(1, this.f22993d);
            this.f22994e = typedArray.getFloat(2, this.f22994e);
            this.f22995f = TypedArrayUtils.f(typedArray, xmlPullParser, "scaleX", 3, this.f22995f);
            this.f22996g = TypedArrayUtils.f(typedArray, xmlPullParser, "scaleY", 4, this.f22996g);
            this.f22997h = TypedArrayUtils.f(typedArray, xmlPullParser, "translateX", 6, this.f22997h);
            this.f22998i = TypedArrayUtils.f(typedArray, xmlPullParser, "translateY", 7, this.f22998i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f23002m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.f23002m;
        }

        public Matrix getLocalMatrix() {
            return this.f22999j;
        }

        public float getPivotX() {
            return this.f22993d;
        }

        public float getPivotY() {
            return this.f22994e;
        }

        public float getRotation() {
            return this.f22992c;
        }

        public float getScaleX() {
            return this.f22995f;
        }

        public float getScaleY() {
            return this.f22996g;
        }

        public float getTranslateX() {
            return this.f22997h;
        }

        public float getTranslateY() {
            return this.f22998i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f22993d) {
                this.f22993d = f2;
                d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f22994e) {
                this.f22994e = f2;
                d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f22992c) {
                this.f22992c = f2;
                d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f22995f) {
                this.f22995f = f2;
                d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f22996g) {
                this.f22996g = f2;
                d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f22997h) {
                this.f22997h = f2;
                d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f22998i) {
                this.f22998i = f2;
                d();
            }
        }

        public VGroup() {
            super();
            this.f22990a = new Matrix();
            this.f22991b = new ArrayList();
            this.f22992c = 0.0f;
            this.f22993d = 0.0f;
            this.f22994e = 0.0f;
            this.f22995f = 1.0f;
            this.f22996g = 1.0f;
            this.f22997h = 0.0f;
            this.f22998i = 0.0f;
            this.f22999j = new Matrix();
            this.f23002m = null;
        }
    }
}
