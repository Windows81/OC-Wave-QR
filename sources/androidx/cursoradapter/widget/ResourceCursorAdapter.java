package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class ResourceCursorAdapter extends CursorAdapter {
    public int I;
    public int J;
    public LayoutInflater K;

    public ResourceCursorAdapter(Context context, int i2, Cursor cursor, boolean z2) {
        super(context, cursor, z2);
        this.J = i2;
        this.I = i2;
        this.K = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.K.inflate(this.J, viewGroup, false);
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.K.inflate(this.I, viewGroup, false);
    }
}
