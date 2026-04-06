package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.ObjectsCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f19826k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f19827a;

    /* renamed from: b  reason: collision with root package name */
    public Object f19828b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f19829c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f19830d;

    /* renamed from: e  reason: collision with root package name */
    public int f19831e;

    /* renamed from: f  reason: collision with root package name */
    public int f19832f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f19833g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f19834h;

    /* renamed from: i  reason: collision with root package name */
    public String f19835i;

    /* renamed from: j  reason: collision with root package name */
    public String f19836j;

    public static class Api23Impl {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", (Class[]) null).invoke(obj, (Object[]) null)).intValue();
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", (Class[]) null).invoke(obj, (Object[]) null);
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon package", e4);
                return null;
            }
        }

        public static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", (Class[]) null).invoke(obj, (Object[]) null)).intValue();
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                return -1;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                return -1;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                return -1;
            }
        }

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", (Class[]) null).invoke(obj, (Object[]) null);
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon uri", e4);
                return null;
            }
        }

        public static Icon e(IconCompat iconCompat, Context context) {
            Icon icon;
            switch (iconCompat.f19827a) {
                case -1:
                    return (Icon) iconCompat.f19828b;
                case 1:
                    icon = Icon.createWithBitmap((Bitmap) iconCompat.f19828b);
                    break;
                case 2:
                    icon = Icon.createWithResource(iconCompat.f(), iconCompat.f19831e);
                    break;
                case 3:
                    icon = Icon.createWithData((byte[]) iconCompat.f19828b, iconCompat.f19831e, iconCompat.f19832f);
                    break;
                case 4:
                    icon = Icon.createWithContentUri((String) iconCompat.f19828b);
                    break;
                case 5:
                    icon = Api26Impl.a((Bitmap) iconCompat.f19828b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        icon = Api30Impl.a(iconCompat.h());
                        break;
                    } else if (context != null) {
                        InputStream i2 = iconCompat.i(context);
                        if (i2 != null) {
                            icon = Api26Impl.a(BitmapFactory.decodeStream(i2));
                            break;
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.h());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.h());
                    }
                default:
                    throw new IllegalArgumentException("Unknown type");
            }
            ColorStateList colorStateList = iconCompat.f19833g;
            if (colorStateList != null) {
                icon.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f19834h;
            if (mode != IconCompat.f19826k) {
                icon.setTintMode(mode);
            }
            return icon;
        }
    }

    public static class Api26Impl {
        public static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class Api28Impl {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class Api30Impl {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconType {
    }

    public IconCompat() {
        this.f19827a = -1;
        this.f19829c = null;
        this.f19830d = null;
        this.f19831e = 0;
        this.f19832f = 0;
        this.f19833g = null;
        this.f19834h = f19826k;
        this.f19835i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z2) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = (float) min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z2) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat b(Context context, int i2) {
        ObjectsCompat.c(context);
        return c(context.getResources(), context.getPackageName(), i2);
    }

    public static IconCompat c(Resources resources, String str, int i2) {
        ObjectsCompat.c(str);
        if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f19831e = i2;
            if (resources != null) {
                try {
                    iconCompat.f19828b = resources.getResourceName(i2);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f19828b = str;
            }
            iconCompat.f19836j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public static String o(int i2) {
        switch (i2) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap d() {
        int i2 = this.f19827a;
        if (i2 == -1) {
            Object obj = this.f19828b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i2 == 1) {
            return (Bitmap) this.f19828b;
        } else {
            if (i2 == 5) {
                return a((Bitmap) this.f19828b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int e() {
        int i2 = this.f19827a;
        if (i2 == -1) {
            return Api23Impl.a(this.f19828b);
        }
        if (i2 == 2) {
            return this.f19831e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String f() {
        int i2 = this.f19827a;
        if (i2 == -1) {
            return Api23Impl.b(this.f19828b);
        }
        if (i2 == 2) {
            String str = this.f19836j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f19828b).split(":", -1)[0] : this.f19836j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int g() {
        int i2 = this.f19827a;
        return i2 == -1 ? Api23Impl.c(this.f19828b) : i2;
    }

    public Uri h() {
        int i2 = this.f19827a;
        if (i2 == -1) {
            return Api23Impl.d(this.f19828b);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f19828b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream i(Context context) {
        Uri h2 = h();
        String scheme = h2.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(h2);
            } catch (Exception e2) {
                Log.w("IconCompat", "Unable to load image from URI: " + h2, e2);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f19828b));
            } catch (FileNotFoundException e3) {
                Log.w("IconCompat", "Unable to load image from path: " + h2, e3);
                return null;
            }
        }
    }

    public void j() {
        this.f19834h = PorterDuff.Mode.valueOf(this.f19835i);
        switch (this.f19827a) {
            case -1:
                Parcelable parcelable = this.f19830d;
                if (parcelable != null) {
                    this.f19828b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.f19830d;
                if (parcelable2 != null) {
                    this.f19828b = parcelable2;
                    return;
                }
                byte[] bArr = this.f19829c;
                this.f19828b = bArr;
                this.f19827a = 3;
                this.f19831e = 0;
                this.f19832f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f19829c, Charset.forName("UTF-16"));
                this.f19828b = str;
                if (this.f19827a == 2 && this.f19836j == null) {
                    this.f19836j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f19828b = this.f19829c;
                return;
            default:
                return;
        }
    }

    public void k(boolean z2) {
        this.f19835i = this.f19834h.name();
        switch (this.f19827a) {
            case -1:
                if (!z2) {
                    this.f19830d = (Parcelable) this.f19828b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z2) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f19828b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f19829c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f19830d = (Parcelable) this.f19828b;
                return;
            case 2:
                this.f19829c = ((String) this.f19828b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f19829c = (byte[]) this.f19828b;
                return;
            case 4:
            case 6:
                this.f19829c = this.f19828b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
    }

    public Bundle l() {
        Bundle bundle = new Bundle();
        switch (this.f19827a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f19828b);
                break;
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f19828b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f19828b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f19828b);
                break;
            default:
                throw new IllegalArgumentException("Invalid icon");
        }
        bundle.putInt("type", this.f19827a);
        bundle.putInt("int1", this.f19831e);
        bundle.putInt("int2", this.f19832f);
        bundle.putString("string1", this.f19836j);
        ColorStateList colorStateList = this.f19833g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f19834h;
        if (mode != f19826k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public Icon m() {
        return n((Context) null);
    }

    public Icon n(Context context) {
        return Api23Impl.e(this, context);
    }

    public String toString() {
        if (this.f19827a == -1) {
            return String.valueOf(this.f19828b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(o(this.f19827a));
        switch (this.f19827a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f19828b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f19828b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f19836j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(e())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f19831e);
                if (this.f19832f != 0) {
                    sb.append(" off=");
                    sb.append(this.f19832f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f19828b);
                break;
        }
        if (this.f19833g != null) {
            sb.append(" tint=");
            sb.append(this.f19833g);
        }
        if (this.f19834h != f19826k) {
            sb.append(" mode=");
            sb.append(this.f19834h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i2) {
        this.f19829c = null;
        this.f19830d = null;
        this.f19831e = 0;
        this.f19832f = 0;
        this.f19833g = null;
        this.f19834h = f19826k;
        this.f19835i = null;
        this.f19827a = i2;
    }
}
