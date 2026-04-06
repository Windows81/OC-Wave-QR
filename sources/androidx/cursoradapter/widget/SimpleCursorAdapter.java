package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SimpleCursorAdapter extends ResourceCursorAdapter {
    public int[] L;
    public int[] M;
    public int N;
    public CursorToStringConverter O;
    public ViewBinder P;
    public String[] Q;

    public interface CursorToStringConverter {
        CharSequence a(Cursor cursor);
    }

    public interface ViewBinder {
        boolean a(View view, Cursor cursor, int i2);
    }

    public CharSequence a(Cursor cursor) {
        CursorToStringConverter cursorToStringConverter = this.O;
        if (cursorToStringConverter != null) {
            return cursorToStringConverter.a(cursor);
        }
        int i2 = this.N;
        return i2 > -1 ? cursor.getString(i2) : super.a(cursor);
    }

    public void e(View view, Context context, Cursor cursor) {
        ViewBinder viewBinder = this.P;
        int[] iArr = this.M;
        int length = iArr.length;
        int[] iArr2 = this.L;
        for (int i2 = 0; i2 < length; i2++) {
            View findViewById = view.findViewById(iArr[i2]);
            if (findViewById != null) {
                if (viewBinder != null ? viewBinder.a(findViewById, cursor, iArr2[i2]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i2]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        m((TextView) findViewById, string);
                    } else if (findViewById instanceof ImageView) {
                        l((ImageView) findViewById, string);
                    } else {
                        throw new IllegalStateException(findViewById.getClass().getName() + " is not a " + " view that can be bounds by this SimpleCursorAdapter");
                    }
                }
            }
        }
    }

    public Cursor j(Cursor cursor) {
        k(cursor, this.Q);
        return super.j(cursor);
    }

    public final void k(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.L;
            if (iArr == null || iArr.length != length) {
                this.L = new int[length];
            }
            for (int i2 = 0; i2 < length; i2++) {
                this.L[i2] = cursor.getColumnIndexOrThrow(strArr[i2]);
            }
            return;
        }
        this.L = null;
    }

    public void l(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void m(TextView textView, String str) {
        textView.setText(str);
    }
}
